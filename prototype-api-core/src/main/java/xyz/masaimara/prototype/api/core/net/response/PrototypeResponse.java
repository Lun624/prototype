package xyz.masaimara.prototype.api.core.net.response;

import xyz.masaimara.prototype.api.core.net.HttpStatus;

public interface PrototypeResponse<RB extends ResponseBody> extends Response<RB> {

    HttpStatus getStatus();

    PrototypeResponse<RB> setStatus(HttpStatus status);

    RB getBody();

    PrototypeResponse<RB> setBody(RB body);

}