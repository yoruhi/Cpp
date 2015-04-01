package tables;

public class TestHashDictionary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Ajout d'un element
		
		HashDictionary<String,String> dico1 = new HashDictionary<String, String>(3);
		dico1.add("Chat","Cat");
		dico1.afficher();

		// Consultation de la valeur d'une cle
		
		dico1 = new HashDictionary<String, String>(3);
		dico1.add("Chat","Cat");
                System.out.println(dico1.value("Chat"));

   		// Suppression d'un element
		
		dico1 = new HashDictionary<String, String>(3);
		dico1.add("Chat","Cat");
		dico1.add("Chien","Dog");
		dico1.add("Oiseau","Bird");
		dico1.delete("Chien");
		dico1.afficher();

                // Ajout des elements vus en TD

		dico1 = new HashDictionary<String, String>(3);
		
		dico1.add("Arbre","Tree");		
		dico1.add("Chene", "Oak");
                dico1.add("Conifere", "Conifer");
                dico1.add("Epicea", "Spruce");
                dico1.add("Erable","Maple");
                dico1.add("Feuillu","Broad-Leave Tree");
                dico1.add("Marronier","Chestnut");
                dico1.add("Mimosa","Mimosa");
                dico1.add("Peuplier","Poplar");      
                dico1.add("Pin","Pine Tree");        
                dico1.add("Sapin","Fir");        
                dico1.add("Sequoia","Sequoia");        
                dico1.add("Tige","Stem"); 
                dico1.add("Tilleul","Lime tree"); 
        
                dico1.afficher();

                // Impact du nombre de sous-tables
                // a completer
        
                // Distribution de la table avec KeyType1
                // a completer

                // Distribution de la table avec KeyType2
                // a completer

                // Distribution de la table avec KeyType3
                // a completer

                // Distribution de la table avec KeyType4 (une fois que vous l'aurez implante)
                // a completer
        
	}

}
