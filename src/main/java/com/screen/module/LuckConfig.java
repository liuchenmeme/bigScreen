package com.screen.module;

import lombok.Getter;
import lombok.Setter;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("luck_config")
@Getter
@Setter
public class LuckConfig {

    @Column("level")
    private Integer level;

    @Column("num")
    private Integer num;

}