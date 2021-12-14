package AnimalDatabase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
