/*
 * 
 */
package inheritanceexample;

/**
 *
 * @author shegavala
 */
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Schools someSchools = new Schools();
        Restaurant favoritePlace = new Restaurant();
        
        
        someSchools.setName("NYU School");
        someSchools.setAdress("Washington Square Park");
        
        favoritePlace.setName("Cafe Wha? ");
        favoritePlace.setAdress("115 MacDougal St,NY NY 10012");
        favoritePlace.setRating(5);
        
        System.out.println(someSchools.getDescription());
        System.out.println(favoritePlace.getDescription());
        System.out.println(" Rating:"+favoritePlace.getRating());
    
}
}