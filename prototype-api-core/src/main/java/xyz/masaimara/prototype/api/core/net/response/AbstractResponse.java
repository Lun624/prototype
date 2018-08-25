package xyz.masaimara.prototype.api.core.net.response;

import com.google.common.base.MoreObjects;
import xyz.masaimara.prototype.api.core.net.HttpStatus;

public class AbstractResponse<RB extends ResponseBody> implements PrototypeResponse<RB> {
    private HttpStatus status = HttpStatus.NON_OPERATION;
    private RB body;

    @Override
    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public AbstractResponse<RB> setStatus(HttpStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public RB getBody() {
        return body;
    }

    @Override
    public AbstractResponse<RB> setBody(RB body) {
        this.body = body;
        return this;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("status", status)
                .add("body", body)
                .toString();
    }
}