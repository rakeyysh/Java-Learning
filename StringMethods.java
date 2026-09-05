public class StringMethods {


    public static void main(String[] args) {
        

        // String s = "Rakesh";   // pool

        // String t = new String("Oddysey"); // heap

        // String p = "    ";
        // String q = "";


        // System.out.println(s.length());
        // System.out.println(p.length());

        // System.out.println(s.isEmpty());
        // System.out.println(p.isEmpty());
        // System.out.println(p.isBlank());
        // System.out.println(s.isBlank());
        // System.out.println(q.isEmpty());

        // System.out.println(t.charAt(3));
        // char[] arr = t.toCharArray();
        // for(int i = 0; i<arr.length;i++){
        //     System.out.println(arr[i]+' ');
        // }
        // System.out.println(arr);


        // String jo = "ADITYA";
        // String ko = "aditya";
        // System.out.println(jo.equals(ko));
        // System.out.println(jo.equalsIgnoreCase(ko));

        String  l = "abc";
        String c = "abf";

        // l<c -->-ve
        // l>c --> +ve
        // l==c --> 0

        System.out.println(c.compareTo(l));

        String g = "The Dark Knight";
        String f = "Dark";
        System.out.println(g.contains(f));

        System.out.println(g.indexOf("Dark"));
        System.out.println(g.lastIndexOf("h"));

         String [] temp = g.split(" ");

         for(int i = 0;i<temp.length;i++){
         System.out.println(temp[i]);
         }

         String pqr = String.join("-","The","Dark","Knight");
         System.out.println(pqr);


    }
    
}
