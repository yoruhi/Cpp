package tables;
/**
 * Implantation de table par hash-code
 */

import java.util.*;

public class HashDictionary<K, V > extends AbstractDictionary<K, V> {

    protected int size;                                     // nombre d'elements dans la table de hachage	
    protected ArrayList<ArrayList<Association<K,V>>> tab;   // tableau pointant sur les sous-tables 	
    protected int nbSousTables ;                            // nombre de sous-tables
    
    // Constructeurs

    /** Dictionnaire vide utilisant 10 sous-tables
     */
    public HashDictionary() {
	  this(10);
    }
	
    /** Dictionnaire vide utilisant n sous-tables 
     *	@param n nombre de sous-tables 
     */
    public HashDictionary(int n) {
      nbSousTables=n;	
      tab = new ArrayList<ArrayList<Association<K,V>>>(n);	
      for (int i = 0; i < n; i++)
        tab.add(new ArrayList<Association<K,V>>());
    }
    
    /** Calcul du hashCode d'une cle
     *	@param key cle
     *	@return hashCode compris entre 0 et n
     */
    public int hashCode (K key)  {
	  return Math.abs(key.hashCode())%nbSousTables ;
    }

    /** Ajouter un couple < cle, valeur >
     * @param key cle
     * @param value valeur
     */
    public void add (K key, V value){
      //a completer 
    }
    
    /** Supprimer une cle
     * @param key cle
     */
    public void delete (K key){
      //a completer 
    }
    
    /** Tester l'existence d'une cle
     */
    public boolean has (K key) {	
      //a completer
    }
    
    /** Consulter la valeur attachee a une cle
     *	@param key cle recherchee
     *	@return null si la cle n'existe pas, la valeur sinon
     */
    public V value (K key)  { 	
      //a completer
    }
   
    /** Nombre d'entrees dans la table
     */
    public int size() {
	  return size ;
    }

    /** Affichage de la table (i.e. les elements de chaque sous-table)
     */
    public void afficher(){
      for (int i=0; i<tab.size(); i++){
        System.out.println("Sous-table h="+i);
        ArrayList<Association<K,V>> sousTable = (ArrayList<Association<K,V>>)tab.get(i);
        for (int j=0 ; j< sousTable.size(); j++){
          Association<K,V> asso = sousTable.get(j);
          System.out.println("    "+asso.toString());
        }
      }    	
    }
    
} 
