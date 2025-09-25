import java.util.scanner;
public class secondlargest{
    public static void main(String[]args){
        scanner s= new scanner(system.in);
        int[] arr= new Int (10);
        int largest;
        int secondlargest;
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        largest=arr(0);
        secondlargest=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>largest)
        {
            largest=a[i];
            secondlargest=largest;
        }
        else if (arr[i]>secondlargest&&arr[i]!=largest){
            secondlargest=arr[i];
        }
     }
    System.out.println("the Second largest is:"+largestelement);
}
}