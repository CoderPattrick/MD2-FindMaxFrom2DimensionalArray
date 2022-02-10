public class FindMax {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0]=10;
        array[0][1]=7;
        array[0][2]=12;
        array[1][0]=15;
        array[1][1]=4;
        array[1][2]=1;
        array[2][0]=19;
        array[2][1]=20;
        array[2][2]=11;
        System.out.println(findMax(array));

    }
    public static int findMax(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
