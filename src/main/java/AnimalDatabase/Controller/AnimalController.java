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
        passwordtable user = new passwordtable();
        model.addAttribute("user", user);
        return "signin";
    }

    @GetMapping(path = "/signup")
    public String getSignUp(Model model) {
        passwordtable user = new passwordtable();
        model.addAttribute("user", user);
        return "signup";
    }

    @GetMapping(path = "/search")
    public String submitUser(@ModelAttribute("user")passwordtable table, Model model) {
        System.out.println(table);
        mock_data search = new mock_data();
        model.addAttribute("search", search);
        return "search";

    }
    @PostMapping(path = "/search")
    public String getResults(@ModelAttribute("search")mock_data search, Model model) {
        List<mock_data> listAnimals = new ArrayList<mock_data>();
        animalsRepo.findByCommonName(search.getCommon_name()).forEach(listAnimals::add);
        model.addAttribute("listAnimals", listAnimals);
        System.out.println(listAnimals);
        return "results";

        //    @GetMapping(path = "/search")
//    public String getSearch(Model model) {
//        mock_data search = new mock_data();
//        model.addAttribute("search", search);
//        return "search.html";
//    }
}
}
