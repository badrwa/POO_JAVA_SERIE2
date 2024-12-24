import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	private List<Document> documents;

	public Bibliotheque(List<Document> documents) {
		super();
		this.documents = new ArrayList<>();
	}
	public void ajouterDocument(Document d) {
		documents.add(d);
	}
	public void afficherTousLesDocuments() {
		
		for (Document d : documents) {
			d.afficherDetails();
			System.out.println();
		}
		
		
	}
	
	public void rechercherParTitre(String titre) {
		for (Document d : documents) {
			if (d.getTitre().equalsIgnoreCase(titre)) {
				d.afficherDetails();
				return;
				
			}
			
		}
		System.out.println("Document avec titre : "+titre+" non trouvable");
		
	}
	public void rechercherParAuteur(String auteur) {
		for (Document d : documents) {
			if (d.getAuteur().equalsIgnoreCase(auteur)) {
				d.afficherDetails();
				return;
				
			}
			
		}
		System.out.println("Document avec Auteur : "+auteur+" non trouvable");
		
	}
	
	

}
