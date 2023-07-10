package med.voll.api.controller;

import med.voll.api.dto.DadosCadastrarPaciente;
import med.voll.api.service.Paciente;
import med.voll.api.repositorys.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("pacientes")

public class PacienteController {
    @Autowired
    private PacienteRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastrarPaciente dados) {
        repository.save(new Paciente());
    }
}
