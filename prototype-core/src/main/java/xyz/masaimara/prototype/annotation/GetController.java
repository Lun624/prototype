package xyz.masaimara.prototype.annotation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@RequestMapping(method = {RequestMethod.POST},
        consumes = {"application/json"},
        produces = {"application/json"})
public @interface GetController {
}