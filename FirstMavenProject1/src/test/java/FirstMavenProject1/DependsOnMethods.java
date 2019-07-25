package FirstMavenProject1;

import org.testng.annotations.Test;

public class DependsOnMethods {
    
    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test(dependsOnMethods={"test4","test3"})
    public void test2() {
        System.out.println("Test2");
    }

    @Test
    public void test3() {
        System.out.println("Test3");
    }
    
    @Test
    public void test4()
    {
        System.out.println("Test4");
    }
    
    @Test(enabled=false)
    public void test5(){
        System.out.println("Test5");
    }

}
