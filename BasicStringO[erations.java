public class BasicStringOperations
{
    public static void main(String[] args) 
    {
         String sample = "hello world";
         //Char extraction 
         char firstchar = sample.charAt(0);
         char lastchar = sample.charAt(sample.length()-1);
         System.out.println("FirstChar: "+firstchar);
         System.out.println("SecondtChar: " + lastchar);
         
         //String Comaprision
         String sample_1 = "hello,world";
         boolean isEquals = sample.equals(sample_1);
         boolean isEqualsignorecase = sample.equalsIgnoreCase(sample_1);
         System.out.println("Case-sensitive comp: "+isEquals);
         System.out.println("Case-Insensitive comp: "+isEqualsignorecase);

         //String Search
         int indexofcomma = sample_1.indexOf(',');
         int indexofworld = sample.indexOf("world");
         boolean contains = sample.contains("world");
         System.out.println("Index of comma: "+indexofcomma);
         System.out.println("Index of world: "+indexofworld);
         System.out.println("Contains World: "+contains);

         //String Modification
         String replaceString = sample.replace("world","java");
         String uppercase = sample.toUpperCase();
         String lowercase = sample.toLowerCase();
         System.out.println("Replace String: "+replaceString);
         System.out.println("Upper-Case String: "+uppercase);
         System.out.println("Lower-Case String: "+lowercase);
    }
        
}public class p5
{
    public static void main(String[] args) 
    {
         String sample = "hello world";
         //Char extraction 
         char firstchar = sample.charAt(0);
         char lastchar = sample.charAt(sample.length()-1);
         System.out.println("FirstChar: "+firstchar);
         System.out.println("SecondtChar: " + lastchar);
         
         //String Comaprision
         String sample_1 = "hello,world";
         boolean isEquals = sample.equals(sample_1);
         boolean isEqualsignorecase = sample.equalsIgnoreCase(sample_1);
         System.out.println("Case-sensitive comp: "+isEquals);
         System.out.println("Case-Insensitive comp: "+isEqualsignorecase);

         //String Search
         int indexofcomma = sample_1.indexOf(',');
         int indexofworld = sample.indexOf("world");
         boolean contains = sample.contains("world");
         System.out.println("Index of comma: "+indexofcomma);
         System.out.println("Index of world: "+indexofworld);
         System.out.println("Contains World: "+contains);

         //String Modification
         String replaceString = sample.replace("world","java");
         String uppercase = sample.toUpperCase();
         String lowercase = sample.toLowerCase();
         System.out.println("Replace String: "+replaceString);
         System.out.println("Upper-Case String: "+uppercase);
         System.out.println("Lower-Case String: "+lowercase);
    }
        
}
