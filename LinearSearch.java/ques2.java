//serach and element in a range
//count number of element whose digit count is even
public class ques2 {
    public static void main(String args[]){
        int[] arr={234,6,90,1234,56,3,0};
        int ans=findNum(arr);
        System.out.println(ans);
    }
    
static int findNum(int[] arr){
    int count=0;
    for(int num:arr){
        if(even(num)){
          count++;
        }
    }
    return count;
}
/*static boolean even(int num) {
    int numberOfDigits = digits(num);

    if (numberOfDigits % 2 == 0) {
        return true;
    }
    return false;

    return numberOfDigits % 2 == 0;
} */

static boolean even(int num){
    if(countOfDigits(num)%2==0){
        return true;
    }
    else{
        return false;
    }
}
static int countOfDigits(int num){
    if (num < 0) {
        num = num * -1;
    }

    if (num == 0) {
        return 1;
    }
  int count=0;
    while(num>0){
        count++;
        num=num/10;
    
    }
    return count;
}

/*optimised way to count the no.of digits in a number ...

   static int countOfDigits(int num) {
     if (num < 0) {
        num = num * -1;
     }
        return (int)(Math.log10(num)) + 1;
    }
*/


}
