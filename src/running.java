import java.util.Arrays;
public class running {

    public static void main (String args []) {


        runner x = new runner ();
        int [][] test1 =
                {{1,2,3,4},
                {1,5,6,7},
                {9,10,12,19}};
        int [][] test2 =
                {{1,2,3,4},
                        {8,5,6,7},
                        {9,10,12,19}};
        int [][] test3 =
                {{1,2,3,4},
                        {8,2,6,7},
                        {9,1,12,19}};
        int [][] test4 =
                {{1,2,3,4},
                        {4,3,2,1},
                        {9,1,12,19}};
        int [][] test5 = {{1,3,6}, {2,4,7}, {1,5,8}};



        System.out.println("test 1 expected : true");
        x.printOut(test1);
        System.out.println("Test 2 expected : false");
        x.printOut(test2);
        System.out.println("Test 3 expected : true");
        x.printOut(test3);
        System.out.println("Test 4 expected : false");
        x.printOut(test4);
        System.out.println("Test 5 expected : true");
        x.printOut(test5);

        System.out.println("");
        System.out.println( "Test 1 actual: " +  x.duplicateCheck(test1));
        System.out.println("Test 2 actual: " +  x.duplicateCheck(test2));
        System.out.println("Test 3 actual: " +  x.duplicateCheck(test3));
        System.out.println("Test 4 actual: " +  x.duplicateCheck(test4));
        System.out.println("Test 5 actual: " +  x.duplicateCheck(test5));



    }
}
