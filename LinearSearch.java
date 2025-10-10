public class LinearSearch{
    public static void main(String[] args) {
        int nums[]= {3,4,6,8,10};
        int target = 6;
        int result = linearSearch(nums,target);
        if(result!=-1)
System.out.println("Element found at:" +result);
else
System.out.println("element not found");
    }

    public static int linearSearch(int[] nums, int target) {
         for (int i=0; i<nums.length;i++){
            if(nums[i]==target)
            return i;
         }
        return -1;
    }
}