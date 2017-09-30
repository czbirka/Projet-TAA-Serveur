package m2.ila.taa.projet.back.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import m2.ila.taa.projet.back.model.User;

@RestController
@RequestMapping("/user")
public class UserAPI  extends APIController<User> {
}
