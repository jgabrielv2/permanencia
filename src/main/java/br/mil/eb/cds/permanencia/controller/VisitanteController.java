package br.mil.eb.cds.permanencia.controller;

import br.mil.eb.cds.permanencia.model.VisitanteCivil;
import br.mil.eb.cds.permanencia.service.VisitanteCivilService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
public class VisitanteController {
    private final VisitanteCivilService civilService;

    public VisitanteController(VisitanteCivilService civilService){
        this.civilService = civilService;
    }

    @PostMapping
    public VisitanteCivil cadastrarr(@RequestBody VisitanteCivil visitanteCivil) {
        return civilService.cadastrar(visitanteCivil);
    }

    @GetMapping
    public List<VisitanteCivil> listarTodos() {
        return civilService.listarTodos();
    }

    @DeleteMapping("/{id}")
    public void excluirVisitanteCivil(@PathVariable Long id) {
        civilService.excluir(id);
    }
}
