package com.qf.shiroadmin.common.util;



import  com.qf.shiroadmin.common.sysconst.SystemCon;
import com.qf.shiroadmin.common.vo.ResultVo;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/2/19 10:28
 */
public class ResultUtil {
    public static ResultVo exec(boolean istrue, String msg, Object data){
        ResultVo resultVo=new ResultVo();
        if(istrue){
            resultVo.setCode(SystemCon.OK);
        }else {
            resultVo.setCode(SystemCon.ERROR);
        }
        resultVo.setMsg(msg);
        resultVo.setData(data);
        return resultVo;
    }
}
