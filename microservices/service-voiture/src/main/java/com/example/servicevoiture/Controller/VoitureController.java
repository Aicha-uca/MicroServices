package com.example.servicevoiture.Controller;

import com.example.servicevoiture.Model.Voiture;
import com.example.servicevoiture.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {
    @Autowired
    VoitureRepository vr;

    @GetMapping("/voitures")
    public List Voitures() { return vr.findAll();}

    @GetMapping("/voitures/id")
    public Voiture VoitureId(@PathVariable Long id) throws
            Exception {
        return this.vr.findById(id).orElseThrow(()-> new Exception("Voiture non existante"));
    }
}
