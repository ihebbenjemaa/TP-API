package tp.ensim.TP3INFO2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class meteo {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/meteo")
    public String showMeteoPage() {
        return "meteo";
    }

    @PostMapping("/meteo")
    public String getMeteo(@RequestParam("address") String address, Model model) {
        // Appel à l'API d'adresse
        String apiUrl = "https://api-adresse.data.gouv.fr/search/?q=" + address;
        String response = restTemplate.getForObject(apiUrl, String.class);

        // Ajout de la réponse à l'objet Model pour être utilisée dans la vue
        model.addAttribute("response", response);

        return "redirect:/meteo";
    }
}