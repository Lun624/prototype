package xyz.masaimara.prototype.api.core.net.request;

public interface PrototypeRequest<RB extends RequestBody> extends Request<RB> {

    RB getBody();

    void setBody(RB body);
}