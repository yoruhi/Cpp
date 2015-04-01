package tables;

public class KeyType4 {

    private String key;
	
    public KeyType4(String key){
       this.key = key;
    }
	
    public String getKey(){
      return key;
    }
		
    public boolean equals(Object o){
      return(key.equals( ((KeyType4)o).getKey()) );
    }

    public String toString(){
      return key;
    }

    public int hashCode(){
	  // a completer
    }

}
