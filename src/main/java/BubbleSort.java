public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        int totalSwaps = 0;

        System.out.print("Array before sorting: ");
        printArray(arr);

        System.out.println("----------------------------");

        for (int i = 0; i < n - 1; i++) 
        {
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    totalSwaps++;
                    System.out.print("  Swapped " + arr[j+1] + " and " + arr[j] + " → Array: ");
                    printArray(arr);
                }
            }
        }

        System.out.println("----------------------------");
        System.out.println("Total swaps: " + totalSwaps);
        System.out.print("Final sorted array: ");
        printArray(arr);
    }

    static void printArray(int[] arr) 
    {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("}");
    }
}
