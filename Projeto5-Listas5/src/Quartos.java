
public class Quartos {
	private String nome;
	private int numeroQuarto;
	private String email;
	
	
	
	public Quartos(String nome, int numeroQuarto, String email) {
		this.nome = nome;
		this.numeroQuarto = numeroQuarto;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
