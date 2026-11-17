package com.puce.libreria.servicio;

import com.puce.libreria.entity.libro;
import com.puce.libreria.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public libro guardarlibro(libro libro){
        libroRepository.save(libro);
        return libro;
    }
}
