package xyz.masaimara.prototype.api.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.masaimara.prototype.annotation.JsonPostController;
import xyz.masaimara.prototype.api.core.net.request.HttpRequest;
import xyz.masaimara.prototype.api.core.net.response.Response;

@JsonPostController
public interface AbstractRestController {

    /**
     * TODO for test aim.
     *
     * @param req request body
     * @return response body
     * @throws Exception throws an exception if caused by an error
     */
    @RequestMapping("/sign_up")
    ResponseEntity<Response> register(@RequestBody HttpRequest<RegisterRequestBody> req) throws Exception;

}