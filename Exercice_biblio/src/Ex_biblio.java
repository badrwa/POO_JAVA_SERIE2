
public class Ex_biblio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre1=new Livre("ontigon", "badr", 2010, 200);
		Magazine magazine1=new Magazine("one piece", "oda", 1991, 2345);
		
		Bibliotheque bibliotheque= new Bibliotheque(null);
		
		bibliotheque.ajouterDocument(livre1);
		bibliotheque.ajouterDocument(magazine1);
		bibliotheque.afficherTousLesDocuments();
		
		bibliotheque.rechercherParTitre("one piece");
		System.out.println();
		bibliotheque.rechercherParAuteur("badr");
		System.out.println();
		bibliotheque.rechercherParTitre("issam");

		
		
		
		

	}

}
