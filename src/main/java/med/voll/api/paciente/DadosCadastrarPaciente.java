package med.voll.api.paciente;

import med.voll.api.medico.DadosEndereco;

public record DadosCadastrarPaciente(String nome, String email, String telefone, String cpf, DadosEnderecoPaciente endereco) {
}
