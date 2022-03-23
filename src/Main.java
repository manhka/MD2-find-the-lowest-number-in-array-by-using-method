public class Main {
    public static void main(String[] args) {
        int[] arr={22,55,2,6};
        int index=minValue(arr);
        System.out.println("the lowest element in array is: " +arr[index]);
    }
    public static int minValue(int[] arr){
int x=0;
        for (int i = 0; i < arr.length; i++) {
if (arr[i]<arr[x]){
    x=i;
}
        }
        return x;
    }
}
