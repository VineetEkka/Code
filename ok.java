public class ok {
    public static void printCol(int[][] matrix,int col){
        for (int row = 0; row <matrix.length ; row++) {
            if(matrix[0].length>col){
                System.out.println(matrix[row][col]);
            }

        }
    }

    public static void numoneszero(int[][] matrix){
        int onecount=0;
        int zerocount=0;
        for(int i=0;i<matrix.length;i++){
            for (int j = 0; j <matrix[i].length ; j++) {
                if(matrix[i][j]==0){
                    zerocount++;
                }
                else if(matrix[i][j]==1){
                    onecount++;
                }

            }
        }
        System.out.println(zerocount);
        System.out.println(onecount);
    }


    public static double[] getAverages(int[][]grades){
        double[]averages=new double[grades.length];
        for (int student = 0; student <grades.length ; student++) {
            double sum=0;
            int count=0;
            int minimum=grades[student][0];
            for (int assignment = 0; assignment < grades[student].length; assignment++) {
                sum+=grades[student][assignment];
                count++;


            }
            sum-=minimum;
            averages[student]=sum/count;

        }
        return averages;
    }






}
