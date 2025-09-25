public class selection {
    import java.util.scanner;
    class selection
    {
        public static void main (string[]args)
    {
        scanner ip=new Scanner(syatem.in)
        int size=ip.nextInt();
        int[]arr=new int[size];
        for(int ind=0:ind<size:ind++)
        arr[ind]=ip.next int ();

        for(int oInd=0; oInd<size-1;oInd++)
        {
            for(int iInd=oInd+1;iIn<size;iInd++)
            {
                if(arr[oInd]>arr[iInd])
                {
                    ind temp = arr[oInd];
                    arr[oInd]=arr[iInd];
                    arr[iInd]=temp;
                }
            }
        }
        system.out.println("the array is:");
        for(int val : arr)
           system.out.print(val+" ");
           

     
        
}
