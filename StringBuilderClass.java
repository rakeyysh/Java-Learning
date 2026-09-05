public class StringBuilderClass {
    public static void main(String[] args) {
        
         StringBuilder sb = new StringBuilder();
       

         sb.append("Rakesh");
         System.out.println(sb);

         sb.append("Mishra");
         System.out.println(sb);

         sb.append("Software Engineer");


         sb.insert(6,' ');
         System.out.println(sb);

 
         sb.delete(6,6);     // end is exclusive
         System.out.println(sb);

         sb.replace(0,6,"Prakash");
         System.out.println(sb);

         sb.reverse();
         System.out.println(sb);

       
         System.out.println(sb.capacity());

         sb.ensureCapacity(67);
          
         System.out.println(sb.capacity());

         sb.trimToSize();
        System.out.println(sb.capacity());     // back to the size we consume
    }
}
