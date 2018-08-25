package xyz.masaimara.prototype.api.core.net.request;

import com.google.common.base.MoreObjects;

public abstract class AbstractWithTokenRequestBody<T> implements RequestBody<T> {
    private String token = "";

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("token", token)
                .toString();
    }
}