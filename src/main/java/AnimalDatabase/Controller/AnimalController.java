package AnimalDatabase.Controller;

import AnimalDatabase.Repo.*;
import AnimalDatabase.DataRest.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AnimalController {
    @Autowired
    AnimalsRepo animalsRepo;
    PasswordRepo passwordRepo;
    SearchRepo searchRepo;

    @GetMapping(path = "/signin")
    public String getSignIn(Model model) {
        Passwordtable user = new Passwordtable();
        model.addAttribute("user", user);
        return "signin";
    }

    @GetMapping(path = "/signup")
    public String getSignUp(Model model) {
        Passwordtable user = new Passwordtable();
        model.addAttribute("user", user);
        return "signup";
    }

    @GetMapping(path = "/passsearch")
    public String submitUser(@ModelAttribute("user") Passwordtable table, Model model) {
        System.out.println(table);
        Mock_data search = new Mock_data();
        model.addAttribute("search", search);
        return "search";

    }
    @PostMapping(path = "/search")
    public String getResults(@ModelAttribute("search") Search search, Model model) {
        List<Mock_data> listAnimals = new ArrayList<Mock_data>();
        animalsRepo.findByCommonName(search.getTopic()).forEach(listAnimals::add);
        model.addAttribute("listAnimals", listAnimals);
        System.out.println(listAnimals);
        return "results";
    }

    @GetMapping(path = "/search")
    public String getSearch(Model model) {
        Search search = new Search();
        model.addAttribute("search", search);
        return "search";
    }
}
