import java.util.Scanner;
class TempConvertor
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("30temp convertor");
        System.out.println();
        System.out.println("Enter temp in c");
        float cel=sc.nextFloat();
        System.out.println("1.kelvin 2.fahrenhiet 3.rankine 4.reaumer");
        System.out.println("enter an option");
        int option=sc.nextInt();


        if(option==1)
        {
            float kelvin=cel+273.15f;
            System.out.println(cel+"c="+kelvin+"k");
        }
        else if(option==2)
        {
            float fah=cel*(9/5f)+32;
            System.out.println(cel+"c="+fah+"f");
        }
        else if(option==3)
        {
            double rankine=(cel*(9/5f))+491.67;
            System.out.println(cel+"c="+rankine+"r");
        }
        else if(option==4)
        {
            float reaumer=cel*(4/5f);
            System.out.println(cel+"c="+reaumer+"re");
        }
        else{
            System.out.println(" wrong option");
        }
    }

}
