public class Main {
    public static void main(String[] args) {
        int num = 1000, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            if(i%2!=0){
                sum += i;

            }


        }
        System.out.println(sum);
    }
}