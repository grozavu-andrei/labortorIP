
import java.util.ArrayList;

public class Game {

    /**
     * @param levels the levels to set
     */
    public void setLevels(ArrayList<Level> levels) {
        this.levels = levels;
    }

    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

  private ArrayList<Level> levels;
  private static Game instance = null;
  private Integer userId;

   private Game(ArrayList<Level> levels, Integer userId) {
        this.levels = levels;
        this.userId = userId;
    }
   
   public static Game getInstance(ArrayList<Level> levels, Integer userId){
       if (instance==null){
           instance = new Game(levels,userId);
       }
       return instance;
   }

    
            
  
  public ArrayList<Level> getLevels() {
  return null;
  }

}