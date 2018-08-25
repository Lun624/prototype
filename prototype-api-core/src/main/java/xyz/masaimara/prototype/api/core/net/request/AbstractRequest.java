package xyz.masaimara.prototype.api.core.net.request;

import com.google.common.base.MoreObjects;

public abstract class AbstractRequest<RB extends RequestBody> implements PrototypeRequest<RB> {
    private RB body;

    public AbstractRequest() {
    }

    public AbstractRequest(RB body) {
        this.body = body;
    }

    @Override
    public RB getBody() {
        return body;
    }

    @Override
    public void setBody(RB body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("body", body)
                .toString();
    }
}