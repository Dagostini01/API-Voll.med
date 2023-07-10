package med.voll.api.repositorys;

import med.voll.api.service.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {
}
