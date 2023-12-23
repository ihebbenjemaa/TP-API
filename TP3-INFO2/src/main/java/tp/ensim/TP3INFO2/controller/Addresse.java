package tp.ensim.TP3INFO2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tp.ensim.TP3INFO2.model.Address;
import tp.ensim.TP3INFO2.model.AddressRepository;

@Controller
public class Addresse {
    @GetMapping("/addresse")
    public String showAdresseForm(Model model) {
        model.addAttribute("address", new Address());
        return "addresse";
    }
    @PostMapping("/addresse")
    public String submitAdresseForm(@ModelAttribute("address") Address address) {

        return "redirect:/meteo";
    }

}