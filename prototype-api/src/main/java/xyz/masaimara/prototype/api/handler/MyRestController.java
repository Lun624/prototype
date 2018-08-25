package xyz.masaimara.prototype.api.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import xyz.masaimara.prototype.annotation.JsonPostController;
import xyz.masaimara.prototype.api.core.net.request.HttpRequest;
import xyz.masaimara.prototype.api.core.net.response.AbstractResponse;
import xyz.masaimara.prototype.api.core.net.response.Response;

@JsonPostController
public class MyRestController implements AbstractRestController {
    @Override
    public ResponseEntity<Response> register(HttpRequest<RegisterRequestBody> req) throws Exception {
        return new ResponseEntity<>(new AbstractResponse<>(), HttpStatus.OK);
    }
}