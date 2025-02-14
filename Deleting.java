//arr={1,2,3,4,5} delete 3
public class Deleting
{
    public static int func(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;

            }
        }
        return -1;
    }
    public static void delete(int arr[],int key)
    {
        int result=func(arr,key);
        if(result==-1)
        {
            System.out.println("element is not found");
        }
        for(int i=result;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
    }
    public static void arrayprint(int arr[])

    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
{
    int arr[]={1,2,3,4,5};
    int key=3;
    delete(arr,key);
    arrayprint(arr);
    

}
}