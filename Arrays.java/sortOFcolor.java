public class sortOFcolor {
    public static void main(String args[]) {
        int n = 6;
        int[] arr = {2, 1, 1, 0, 1, 0};
        sortColors(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                cnt1++;
            } else if (nums[i] == 1) {
                cnt2++;
            } else {
                cnt3++;
            }
        }

        for (int i = 0; i < cnt1; i++) {
            nums[i] = 0;
        }
        for (int i = cnt1; i < cnt1 + cnt2; i++) {
            nums[i] = 1;
        }
        for (int i = cnt1 + cnt2; i < n; i++) {
            nums[i] = 2;
        }
    }
}

