
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Main {

   
    public static void main(String[] args) {
        Vector Shot = new Vector();
        Vector myTrajectory = new Vector();
        Vector myLevel = new Vector();
        Bird cioara = new Bird(1,"cioara",13,2,"roz","batrana",100,Shot, myTrajectory, myLevel);
        Bird pinguin = new Bird(2,"pinguin",15,6,"maro","imperial",112,Shot, myTrajectory, myLevel);
    }
    
}
