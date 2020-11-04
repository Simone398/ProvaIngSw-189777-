package it.unical.ingsw.ProvaI;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class MyListUtilTest 
{
	
	private static MyListUtil a=new MyListUtil();
	private int[] prova={10,2,3,4,1,20,30,21,15};
    private int[] crescente= {1,2,3,4,10,15,20,21,30};
    private int[] decrescente= {30,21,20,15,10,4,3,2,1};
	

    @Test
    public void testCrescente()
    {
        assertArrayEquals(a.setCrescente(prova),crescente);
    }
    
    @Test
    public void testDecrescente()
    {
        assertArrayEquals(a.setDecrescente(prova),decrescente);
    }
}
