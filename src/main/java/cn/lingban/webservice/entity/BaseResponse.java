package cn.lingban.webservice.entity;

import java.io.Serializable;

/**
 * Created by xukai on 2017/4/18.
 */
public class BaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String resultCode;

    private String resultMsg;

    /**
     * @return the resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode the resultCode to set
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * @return the resultMsg
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * @param resultMsg the resultMsg to set
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
