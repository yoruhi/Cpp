package tables;
/**
 * Interface des tables
 */

public interface Dictionary<K, V> {

    /** Ajouter un couple < cle, valeur > >
     */
    public abstract void add (K key, V value) ;

    /** Tester l'existence d'une clé
     */
    public boolean has (K key) ;

    /** Consulter la valeur attachee a une cle
     */
    public abstract V value (K key) ;

    /** Supprimer une cle
     */
    public abstract void delete (K key) ;

    /** La table est-elle vide ?
     */
    public abstract boolean isEmpty () ;
   
    /** Nombre d'entrees dans la table
     */
    public abstract int size() ;
         
}

