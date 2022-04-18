package com.uh.pat;
import com.uh.pat.AVLTree;   
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class CustomTest {
    @Test(timeout = 4000)
    public void test001() throws Throwable {
       
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(10);
    }

        
    @Test(timeout = 4000)
    public void test002()  throws Throwable  {
        AVLTree aVLTree0 = new AVLTree();
       
       aVLTree0.insert(100);
       aVLTree0.insert(2303);
       aVLTree0.insert(1430);
       aVLTree0.insert(666);
       aVLTree0.delete(2303);
       aVLTree0.delete(1430);
       aVLTree0.delete(666);   
       
        // Undeclared exception!
        
        
    }

    
  
}
