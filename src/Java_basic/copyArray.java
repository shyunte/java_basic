package Java_basic;

public class copyArray {
    public static void main(String[] args) {
        int [] oldIntArray = {1,2,3};
        int[] newIntArray  = new int[5];
        int sum = 0;

        System.arraycopy(oldIntArray, 0 ,newIntArray , 0 , oldIntArray.length);

        for(int i=0; i< newIntArray.length; i++){
            System.out.println(newIntArray[i]);
        }
           for(int score : oldIntArray){
               sum = sum + score;
           }
            System.out.println(sum);

    }
}
