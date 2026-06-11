public class BinarySearch 
{
    public static void main(String[] args)
{
        int[] arr = {4, 12, 23, 31, 55, 67, 89};
        int target = 12;
        int left = 0, right = arr.length - 1;
        int steps = 0;
        int foundIndex = -1;

        System.out.println("Array: {4, 12, 23, 31, 55, 67, 89}");
        System.out.println("Target: " + target);
        System.out.println("----------------------------");

        while (left <= right) 
        {
            steps++;
            int mid = (left + right) / 2;
            System.out.println("Step " + steps + ": Left=" + left + "  Right=" + right
                    + "  Mid=" + mid + "  Value=" + arr[mid]);

            if (arr[mid] == target) 
            {
                foundIndex = mid;
                break;
            }
            else if (arr[mid] < target) 
            {
                System.out.println("  → " + arr[mid] + " < " + target + ", go right");
                left = mid + 1;
            } else 
            {
                System.out.println("  → " + arr[mid] + " > " + target + ", go left");
                right = mid - 1;
            }
        }

        System.out.println("----------------------------");
        if (foundIndex != -1) 
        {
            System.out.println("Found " + target + " at index " + foundIndex);
        }
        else 
        {
            System.out.println("Not Found");
        }
        System.out.println("Total steps taken: " + steps);
    }
}
