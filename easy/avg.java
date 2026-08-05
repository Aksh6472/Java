public class avg{
     public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        int sum=0,length=0;
        length=(numbers.length);
        for(int num:numbers){
            sum+=num;
        }
        double avg=sum/length;
        System.out.println("The average is: " + avg);
     }
}