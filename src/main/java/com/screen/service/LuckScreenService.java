package com.screen.service;

import com.screen.base.CommonStatus;
import com.screen.module.LuckConfig;
import com.screen.module.UserScreen;
import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.dao.util.cri.SimpleCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Service
public class LuckScreenService {

    @Autowired
    private Dao dao;

    public List<UserScreen> luckDraw(Integer level){
        //查询出可参加抽奖的人员
        SimpleCriteria cri = Cnd.cri();
        cri.where().andEquals("status",0);
        List<UserScreen> canLuckUser = dao.query(UserScreen.class, cri);
        LinkedList<UserScreen> result = new LinkedList<>();
        if (canLuckUser.size() > 0){
            //抽出一个或者多个 查询奖项配置
            SimpleCriteria cri1 = Cnd.cri();
            cri1.where().andEquals("level",level);
            LuckConfig config = dao.fetch(LuckConfig.class, cri1);
            Random random = new Random();
            //添加vip
            for (UserScreen canUsers : canLuckUser) {
                if(canUsers.getVip() == CommonStatus.Y && canUsers.getLevel() == level)
                    result.add(canUsers);
            }
            //添加剩余幸运用户
            for (int i = 0; i < config.getNum(); i++) {
                //如果超出人数了 break
                if(result.size() >= config.getNum()){
                    break;
                }
                //获取随机数
                int n = random.nextInt(canLuckUser.size());
                result.add(canLuckUser.get(n));
                //移除已中奖的
                canLuckUser.remove(n);
            }
            //设置userScreen状态
            for (UserScreen userScreen : result) {
                userScreen.setStatus(1);
                dao.updateIgnoreNull(userScreen);
            }
        }
        return result;
    }
}