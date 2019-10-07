import java.util.Scanner;
public class Method_displayBox
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input width");
        int width = sc.nextInt();
        System.out.println("Input height");
        int height = sc.nextInt();
        displayBox(width, height);
    }
    public static void displayBox(int width, int height)
    {
        for (int i = 1; i <= height; i++)
        {
            for (int n = 1; n <= width; n++)
            {
                System.out.print("$");
            }
            System.out.println(" ");
        }
    }
}
