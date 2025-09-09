public class intersection {
     public static void main(String args[]){
                  int[]  arr1 = {1,1,2,3,4,5}; 
                  int[]  arr2 = {1,1,2,3,5,6};
      findIntersection(arr1,arr2);
    }

    public static void findIntersection(int[] nums1, int[] nums2){
      int n=nums1.length;
      int m=nums2.length;
        //    int min=Math.min(n,m);

    //           int i=0,j=0;
    //    while (i <min) {
    //         if (nums1[i] == nums2[j]) {
    //             System.out.print(nums1[i] + " ");
    //             i++;
    //             j++;
    //         } else if (nums1[i] < nums2[j]) {       //must***
    //             i++;
    //         } else {
    //             j++;
    //         }
    //     }

        int i=0,j=0;
      while(i<n || j<m){
        if(nums1[i] == nums2[j]) {
            System.out.print(nums1[i] + " ");
            i++;
            j++;
        } 
        else if (nums1[i] < nums2[j]) {   
                 System.out.print(nums1[i] + " ");
                i++;
            } else {
                 System.out.print(nums2[j] + " ");
                j++;
            }
}
  
 }
}

