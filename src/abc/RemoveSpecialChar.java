package abc;

public class RemoveSpecialChar 
{
    public static void main(String args[])   
    {   
        String str="Sn@#eh$al";
        System.out.println("Original String:" +str);
        
        String replaceString=str.replaceAll("[@#$]","");
        System.out.println("After removing Special character:" +replaceString);
        
    }   

}
