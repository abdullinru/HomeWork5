public class Main {
    public static void main(String[] args) {
        task4();
    }
    public static void task4(){
        int[] masInt = new int[3];
        masInt[0] = 1;
        masInt[1] = 2;
        masInt[2] = 3;
        for(int i=0; i < masInt.length;i++){
            if (masInt[i]%2==1){
                masInt[i]++;
            }
            System.out.print(masInt[i]+ " ");
        }
    }
}