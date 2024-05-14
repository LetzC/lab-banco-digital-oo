
public class Cliente {

	private String nome;
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String novoTelefone) {
		if (novoTelefone.equals(this.telefone)) {
			System.out.println("O número de telefone informado já está cadastrado.");
		} else {
			this.telefone = novoTelefone;
			System.out.println("Número de telefone atualizado com sucesso.");
		}
	}
}
