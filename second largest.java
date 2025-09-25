import java.util.scanner;
public class secondlargest{
    public static void main(String[]args){
        scanner s= new scanner(system.in);
        int arr= new int (10);
        int largest,second largest;
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        largest=arr(0);
        second largest=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>largest)
        {
            largest=a[i];
            second largest=largest;
        }
        else if (arr[i]>second largest&&arr[i]!=largest){
            second largest=arr[i];
        }
     }
    System.out.println("the Second largest is:"+largest element);
}
}