package br.mil.eb.cds.permanencia.service;

import br.mil.eb.cds.permanencia.model.VisitanteCivil;
import br.mil.eb.cds.permanencia.repository.VisitanteCivilRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteCivilService {

    private final VisitanteCivilRepository civilRepository;

    public VisitanteCivilService(VisitanteCivilRepository civilRepository) {
        this.civilRepository = civilRepository;
    }

    public VisitanteCivil cadastrar(VisitanteCivil visitante) {
        return civilRepository.save(visitante);
    }

    public List<VisitanteCivil> listarTodos() {
        return civilRepository.findAll();
    }

    public void excluir(Long id) {
        civilRepository.deleteById(id);
    }
}
