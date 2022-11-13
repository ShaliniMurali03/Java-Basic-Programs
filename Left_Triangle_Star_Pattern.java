public class Left_Triangle_Star_Pattern
{
    public static void main(String[] args)
    {
        int n = 5;
        int i , j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==n-1 || j==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
