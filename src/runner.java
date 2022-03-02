public class runner {


    public boolean duplicateCheck (int [][] array) {

        for (int i =0 ; i < array.length; i ++ ) {

            for (int r = 0; r < array[0].length; r++) {
                int temp = array [i][r];
                for (int z = i + 1; z < array.length; z ++) {
                    if (temp == array[z][r]) {
                       return true;
                    }


                }
            }


        }
        return false;



    }

    public void printOut (int [][] rr ) {
        for (int i = 0; i < rr.length; i ++ ) {
            for (int r = 0; r < rr[0].length; r++) {

                System.out.print(rr[i][r] + " ");


            }
            System.out.println(" ");
        }




    }
}
