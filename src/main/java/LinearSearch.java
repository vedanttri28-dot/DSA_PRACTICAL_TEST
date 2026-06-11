public class LinearSearch 
{
    public static void main(String[] args) 
    {
        int[] arr = {23, 67, 4, 89, 31, 55, 12};
        int target = 89;
        int steps = 0;
        int foundIndex = -1;

        System.out.println("Array: {23, 67, 4, 89, 31, 55, 12}");
        System.out.println("Target: " + target);
        System.out.println("----------------------------");

        for (int i = 0; i < arr.length; i++) 
        {
            steps++;
            System.out.println("Step " + steps + ": Checking index " + i + " → value = " + arr[i]);
            if (arr[i] == target) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("----------------------------");
        if (foundIndex != -1) 
        {
            System.out.println("Found " + target + " at index " + foundIndex);
        } else 
        {
            System.out.println("Not Found");
        }
        System.out.println("Total steps taken: " + steps);
    }
}
