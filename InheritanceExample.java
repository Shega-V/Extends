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
        Bussiness someBussiness = new Bussiness();
        Restaurant favoritePlace = new Restaurant();
        Market favoriteMarket = new Market();
        
        
        someBussiness.setName("SoHo");
        someBussiness.setAdress("New York ,New York");
        
        favoritePlace.setName("Cafe Wha? ");
        favoritePlace.setAdress("115 MacDougal St,NY NY 10012");
        favoritePlace.setRating(5);
        
        favoriteMarket.setName("Washington Square Market");
        favoriteMarket.setAdress("199 Chambers St, New York, NY 10007");
        favoriteMarket.setContactInfo("212 639 9675");
        
        System.out.println(someBussiness.getDescription());
        System.out.println(favoritePlace.getDescription());
        System.out.println(favoriteMarket.getDescription());
        System.out.println("Rating:"+favoritePlace.getRating());
    
}
}