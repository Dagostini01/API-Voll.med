package med.voll.api.paciente;

public record DadosCadastrarPaciente(String nome, String email, String telefone, String cpf, DadosEnderecoPaciente endereco) {
}
