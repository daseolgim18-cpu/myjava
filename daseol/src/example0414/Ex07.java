package example0414;

public class Ex07 {
    public static void main(String[] args) {

        int[] arr1 = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.println("arr1[" + i + "] " + arr1[i]);
        }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for(int i = 0; i < 3; i++){
            System.out.println("arr1[" + i + "] " + arr1[i]);
        }

        double[] arr2 = new double[3];
        for(int j = 0; j < 3; j++){
            System.out.println("arr2[" + j + "] " + arr2[j]); // ← 오타 수정
        }

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        for(int j = 0; j < 3; j++){
            System.out.println("arr2[" + j + "] " + arr2[j]);
        }

        String[] arr3 = new String[3];
        for(int k = 0; k < 3; k++){
            System.out.println("arr3[" + k + "] " + arr3[k]);
        }

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";

        for(int k = 0; k < 3; k++){
            System.out.println("arr3[" + k + "] " + arr3[k]);
        }
    }
}