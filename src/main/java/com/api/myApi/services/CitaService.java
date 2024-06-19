package com.api.myApi.services;

import com.api.myApi.models.Cita;
import com.api.myApi.repositories.ICitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaService {

    @Autowired
    private ICitaRepository citaRepository;

    public List<Cita> getAllCitas() {
        return citaRepository.findAll();
    }

    public Cita saveCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public Optional<Cita> getCitaById(Long id) {
        return citaRepository.findById(id);
    }

    public void deleteCita(Long id) {
        citaRepository.deleteById(id);
    }
}
