package tp.ensim.TP3INFO2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import tp.ensim.TP3INFO2.model.Address;
import tp.ensim.TP3INFO2.model.AddressRepository;

@Controller
public class AddressController {
    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/adresses")
    public String showAddresses(@RequestParam(name = "searchedBy", required = false) String searchedBy, Model model) {
        model.addAttribute("searchedBy", searchedBy);
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresses";
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAddressDetails")
    public ResponseEntity<Address> getAddressDetails(@RequestParam String query) {
        String apiUrl = "https://api-adresse.data.gouv.fr/search/?q=" + query;

        // Faire un appel à l'API Adresse
        ResponseEntity<Address> response = restTemplate.getForEntity(apiUrl, Address.class);

        return response;
    }
}