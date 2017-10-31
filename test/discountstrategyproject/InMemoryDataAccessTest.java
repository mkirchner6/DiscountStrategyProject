/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mattkirchner
 */
public class InMemoryDataAccessTest {
    InMemoryDataAccess instance;
    
    public InMemoryDataAccessTest() {
    }
    
    @Before
    public void setUp() {
        instance = new InMemoryDataAccess();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findCustomer method, of class InMemoryDataAccess.
     */
    @Test(expected = NullPointerException.class)
    public void testFindCustomerCheckForNull() {
        System.out.println(instance.findCustomer(null));
    }
    
}
