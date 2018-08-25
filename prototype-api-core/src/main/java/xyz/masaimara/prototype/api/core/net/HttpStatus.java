package xyz.masaimara.prototype.api.core.net;

public enum HttpStatus {
    NON_OPERATION(0, "None operation exception");

    private final int code;
    private final String msg;

    HttpStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}