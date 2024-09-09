public class Reduce {
    public static int main(int number) {

        int steps =0;
        while(number>0){
            if(number%2==0){
                number = number/2;
            }
            else{
                number--;
            }
            steps++;

        }
        return steps;
    }
}
