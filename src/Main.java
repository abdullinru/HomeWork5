public class Main {
    public static void main(String[] args) {
        task2();
    }
    public static void task2(){
        int[] masInt = new int[3];
        masInt[0] = 1;
        masInt[1] = 2;
        masInt[2] = 3;
        double[] masDouble = {1.57, 7.654, 9.986};
        char[] masChar = {'a','b','c'};
        for(int i = 0; i < masInt.length; i++){
            System.out.print(masInt[i]);
            if (i==masInt.length-1)
                continue;
            System.out.print(", ");
        }
        System.out.println();
        for(int i = 0; i < masDouble.length; i++){
            System.out.print(masDouble[i]);
            if (i==masDouble.length-1)
                continue;
            System.out.print(", ");
        }
        System.out.println();
        for(int i = 0; i < masChar.length; i++){
            System.out.print(masChar[i]);
            if (i==masChar.length-1)
                continue;
            System.out.print(", ");
        }
        System.out.println();

    }
}