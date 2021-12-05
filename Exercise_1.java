class BinarySearch {
    // Returns index of x if it is present in a[l.. r], else return -1
    int binarySearch(int a[], int key) {
        //Write your code here
        /**
         * 1.find the middle index -> mid = (low + high)/2
         * 2. If a[mid] == key, return mid
         * 3. if key > a[mid], repeat, low = mid + 1
         * 4. if key < a[mid], repeat, high = mid - 1
         */
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                mid = low + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
