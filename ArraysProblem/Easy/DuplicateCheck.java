import java.util.HashSet;

public class DuplicateCheck {

    public static void main(String[] args) {
        int[] nums = {2, 34, 53, 44, 4, 2};
        DuplicateCheck dc = new DuplicateCheck();
        System.out.println(dc.containsDuplicate(nums)); 
    }

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<>(); 

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; 
            }
            seen.add(num);
        }
        return false; 
    }
}
