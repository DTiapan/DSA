public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6,7, 8, 9};
        if (printSearchedNumber(arr, 9)) {
            System.out.println("found value");
        } else {
            System.out.println("not found");
        }
    }

    public static boolean printSearchedNumber(int[] arr, int value) {
        int l=0;
        int r = arr.length - 1;

        while(l <= r) {
            int m = l + (r-l)/2;

            if(arr[m] == value) {
                return true;
            }
            // if value is greater than mid point ignore left half
            if (arr[m] < value) {
                l = m+1;
            } else {
                r = m-1;
            }
        }
        return false;
    }
}
