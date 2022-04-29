public class Main {
    public static void main(String[] args) {
        task3();
    }
    public static void task3(){
        int[] masInt = new int[3];
        masInt[0] = 1;
        masInt[1] = 2;
        masInt[2] = 3;
        double[] masDouble = {1.57, 7.654, 9.986};
        char[] masChar = {'a','b','c'};
        for(int i = masInt.length-1; i >=0; i--){
            System.out.print(masInt[i]);
            if (i==0)
                continue;
            System.out.print(", ");
        }
        System.out.println();
        for(int i = masDouble.length-1; i >=0; i--){
            System.out.print(masDouble[i]);
            if (i==0)
                continue;
            System.out.print(", ");
        }
        System.out.println();
        for(int i = masChar.length-1; i >=0; i--){
            System.out.print(masChar[i]);
            if (i==0)
                continue;
            System.out.print(", ");
        }
        System.out.println();

    }
}