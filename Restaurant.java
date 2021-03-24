/*
 * 
 */
package inheritanceexample;

/**
 *
 * @author shegavala
 */
class Restaurant extends Schools {
    private int rating;
    
    public void setRating(int userRating){
    rating = userRating;
    }
    public int getRating(){
    return rating;
    }
}
