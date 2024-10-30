public class Main {
    static int insertend(int arr[], int n, int key, int cap) {
        if (n >= cap)
            return n;

        arr[n] = key;
        return (n + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int cap = 20;
        int n = 6;
        int key = 26;

        System.out.print("Before insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        n = insertend(arr, n, key, cap);

        System.out.print("\nAfter insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
