import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static int[] numbers = {54, 546, 548, 60};

    public static void main(String[] args) {
        String[] stringNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(stringNumbers, new SpecialComparator());

        String biggestNumber = "";
        for (int i = numbers.length-1; i >= 0; i--){
            biggestNumber+= numbers[i];
        }
        System.out.println(biggestNumber);
    }
    public static class SpecialComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String ab = a+b;
            String ba = b+a;
            Integer first = Integer.parseInt(ab);
            Integer second = Integer.parseInt(ba);
            int result = 0;
            
            if(first > second){
                result = 1;
            } else if(first == second){
                result = 0;
            } else if(second > first){
                result = -1;
            }
            return result;
        }
    }
}