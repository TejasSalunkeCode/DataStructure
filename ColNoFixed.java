public class ColNoFixed {
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3},//0th index
            {4,5},//1st index
            {6,7,8,9}//2nd index
        };

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
