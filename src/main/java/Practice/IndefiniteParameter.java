package Practice;

public class IndefiniteParameter {
    public void printNumber(int... nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }


}
