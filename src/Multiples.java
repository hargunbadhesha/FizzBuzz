public class Multiples {
    public static int main(int n, int a, int b) {
        int i = 1;
        int answer = 0;
        while(i<n){
            if(i%a==0 || i%b==0){
                answer = answer + 1;
            }
            i++;

        }
        return answer;
    }

    public static void main(String[] args) {

        int answer = main(1000, 3, 5);
        System.out.println(answer);
    }
}
