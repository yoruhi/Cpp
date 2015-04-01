package tables;

/**
 * Implantation abstraite de table
 */

public abstract class AbstractDictionary<K, V> implements  Dictionary<K, V> {

    /** La table est-elle vide ?
     */
    public boolean isEmpty () {
	return (size()== 0) ;
    } // isEmpty()
   
}
