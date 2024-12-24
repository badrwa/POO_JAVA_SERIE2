
public class Livre extends Document{
	private int nombreDePages ;

	public Livre(String titre, String auteur, int anneePublication, int nombreDePages) {
		super(titre, auteur, anneePublication);
		this.nombreDePages = nombreDePages;
	}

	public int getNombreDePages() {
		return nombreDePages;
	}

	public void setNombreDePages(int nombreDePages) {
		this.nombreDePages = nombreDePages;
	}
	
	
	@Override
	public void afficherDetails() {
		// TODO Auto-generated method stub
		super.afficherDetails();
		System.out.println(" nombre De Pages : "+this.nombreDePages);
	}

}
