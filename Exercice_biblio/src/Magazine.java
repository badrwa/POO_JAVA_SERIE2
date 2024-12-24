
public class Magazine extends Document{
	
	private int numero;

	public Magazine(String titre, String auteur, int anneePublication, int numero) {
		super(titre, auteur, anneePublication);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public void afficherDetails() {
		// TODO Auto-generated method stub
		super.afficherDetails();
		System.out.println("le numéro du magazine :"+this.numero);
	}

}
