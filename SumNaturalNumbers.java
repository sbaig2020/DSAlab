public class SumNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 10; i++) {
            sum += i; 
        }
        
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}
