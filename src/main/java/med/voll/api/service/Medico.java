package med.voll.api.service;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.dto.endereco.EnderecoMedico;
import med.voll.api.dto.DadosCadastroMedico;
import med.voll.api.enums.Especialidade;

@Table(name="medicos")
@Entity(name="Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private EnderecoMedico endereco;

    public Medico(DadosCadastroMedico dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new EnderecoMedico(dados.enderecoMedico());
    }
}
