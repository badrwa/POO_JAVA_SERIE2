
public class Document {
	private String titre;
	private String auteur;
	private int anneePublication;
	public Document(String titre, String auteur, int anneePublication) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = anneePublication;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getAnneePublication() {
		return anneePublication;
	}
	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}
	
	public void afficherDetails() {
		System.out.print("Titre : "+this.titre
				+" Auteur : "+this.auteur
				+" Annee Publication : ");
		
	}
	

}
