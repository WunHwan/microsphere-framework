package com.mcmcnet.microsphere.common.code.export.internal;

import com.mcmcnet.microsphere.common.code.export.Code;

/**
 * todo...
 *
 * @author zhengwenhuan@gdmcmc.cn
 * @since todo...
 **/
public class SuccessCode implements Code {

    @Override
    public String code() {
        return "00000";
    }

    @Override
    public String message() {
        return "request success";
    }
}
