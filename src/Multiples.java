public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int answer = 0;
        while(i<1000){
            if(i%3==0 || i%5==0){
                answer = answer + 1;
            }
            i++;

        }
        System.out.println(answer);
    }
}
