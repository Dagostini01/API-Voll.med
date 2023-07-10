package med.voll.api.dto;

import med.voll.api.dto.endereco.DadosEnderecoPaciente;

public record DadosCadastrarPaciente(String nome, String email, String telefone, String cpf, DadosEnderecoPaciente enderecoPaciente) {
}
