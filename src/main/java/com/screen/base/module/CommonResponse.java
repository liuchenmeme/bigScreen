package com.screen.base.module;

import com.screen.base.CommonStatus;
import lombok.Data;

@Data
public class  CommonResponse<T> {



    private int status;
    private String message;
    private T data;

    public CommonResponse() {

    }

    public static CommonResponse success() {
        return new CommonResponse(CommonStatus.OK);
    }

    public CommonResponse(T data) {
        this.data = data;
        this.status = CommonStatus.SUCCESS;
        this.message = CommonStatus.OK;
    }
    public CommonResponse(T data,String message) {
        this.data = data;
        this.status = CommonStatus.SUCCESS;
        this.message = message;
    }

    public CommonResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

}
