
import java.util.HashSet;
import java.util.Set;

public class ContactBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Set<String> a = new HashSet<String>();
        Set<String> b = new HashSet<String>();
        Set<String> c = new HashSet<String>();
        
        a.add("Ankit patel");
        a.add("8878936696");
        a.add("ankitpatel@gmail.com");
       
        
        b.add("jyoty");
        b.add("9632145870");
        b.add("jyoty@gmail.com");
        
        //Duplicate input
        c.add("vivek Kumar");
        c.add("9632145870");
        c.add("vivek@gmail.com");
        
 
        // Printing elements of HashSet object
        System.out.println(a);
        System.out.println(b);

	}

}