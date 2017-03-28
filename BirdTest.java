/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bird;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IM
 */
public class BirdIT extends TestCase{
    
    public BirdIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Bird.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int id=0;
        String name="Bird1";

        String power="power";

        String color="blue";

        String type="type1";

        int damage=12;

        Bird instance = new Bird(id,name,power,color,type,damage);
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Bird.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        int id=0;
        String name="Bird1";

        String power="power";

        String color="blue";

        String type="type1";

        int damage=12;
        Bird instance = new Bird(id,name,power,color,type,damage);
        String expResult = "Bird1";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPower method, of class Bird.
     */
    @Test
    public void testGetPower() {
        System.out.println("getPower");
        int id=0;
        String name="Bird1";

        String power="power";

        String color="blue";

        String type="type1";

        int damage=12;
        Bird instance = new Bird(id,name,power,color,type,damage);
        
        String expResult = "power";
        String result = instance.getPower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Bird.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
     int id=0;
        String name="Bird1";

        String power="power";

        String color="blue";

        String type="type1";

        int damage=12;
        Bird instance = new Bird(id,name,power,color,type,damage);
        
        String expResult = "blue";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Bird.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
       int id=0;
        String name="Bird1";

        String power="power";

        String color="blue";

        String type="type1";

        int damage=12;
        Bird instance = new Bird(id,name,power,color,type,damage);
        
        String expResult = "type1";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDamage method, of class Bird.
     */
    @Test
    public void testGetDamage() {
        System.out.println("getDamage");
        int id=0;
        String name="Bird1";

        String power="power";

        String color="blue";

        String type="type1";

        int damage=12;
        Bird instance = new Bird(id,name,power,color,type,damage);
        
        int expResult =12;
        int result = instance.getDamage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNextBird method, of class Bird.
     */
    @Test
    public void testGetNextBird() {
        System.out.println("getNextBird");
        int id = 13;
        String name="Bird1";

        String power="power";

        String color="blue";

        String type="type1";

        int damage=12;
        Bird instance = new Bird(id,name,power,color,type,damage);
        Integer expResult = null;
        Integer result = instance.getNextBird(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of shot method, of class Bird.
     */
    @Test
    public void testShot() {
        System.out.println("shot");
        int shotTrajectoryId = 2;
        int id = 13;
        String name="Bird1";

        String power="power";

        String color="blue";

        String type="type1";

        int damage=12;
        Bird instance = new Bird(id,name,power,color,type,damage);
        Integer expResult = null;
        Integer result = instance.shot(shotTrajectoryId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Bird.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
         int id = 13;
        String name="Bird1";

        String power="power";

        String color="blue";

        String type="type1";

        int damage=12;
        Bird instance = new Bird(id,name,power,color,type,damage);
        String expResult = "Id: " + id + " Name: " + name + " Power : " + power + " Color: " + color + " Type: " + type + " Damage: " + damage;;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bird.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
