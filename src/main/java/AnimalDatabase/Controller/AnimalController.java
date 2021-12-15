package AnimalDatabase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimalController {

    @GetMapping(path = "/signin")
    public String getSignIn() {
        return "signin.html";
    }

    @GetMapping(path = "/signup")
    public String getSignUp() {
        return "signup.html";
    }

    @GetMapping(path = "/search")
    public String getSearch() {
        return "search.html";
    }
}
