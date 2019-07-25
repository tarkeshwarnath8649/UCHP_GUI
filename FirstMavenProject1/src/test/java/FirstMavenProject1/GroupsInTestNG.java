package FirstMavenProject1;

import org.testng.annotations.Test;

public class GroupsInTestNG {

    @Test(groups="smoke")
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @Test(groups="smoke")
    public void test3() {
        System.out.println("Test3");
    }

}
