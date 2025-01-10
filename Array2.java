public class Array2{
    public int maxArea(int []height)
    {
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;
            while(left < right)
            {
            maxArea = Math.max(maxArea,(right-left)*Math.min(height[left],height[right]));
                if(height[left]<height[right])
                {
                    left ++;
                }
                else
                {
                    right --;
                }
            }
        return maxArea;
    }
public static void main(String args[]){
    Array2 obj =new Array2();
    int[] height={1, 8, 6, 2, 5, 4, 8, 3, 7};
    int result =obj.maxArea(height);
    System.out.println("The maximum area is: " + result);
    System.out.println("Jai Shree Ram");
}
}