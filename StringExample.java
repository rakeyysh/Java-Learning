
public class StringExample {

    public static void main(String[] args) {
        
        String s1 = "ja" + "va";
        String s2 = "java";

        


        System.out.println(s1==s2);    //because both may refer to the same pooled String object.

        String s3 = "ja";
        String s4 = s3 +"va";
        System.out.println(s4==s2);    // run time dynamic calculations

        String s5 = new String("java");
        String s6 = "java";
        System.out.println(s5==s6);        // run time 
  
        String s7 = "java";
        String s8 = s7;
        System.out.println(s7==s8);    // because both may refer to the same pooled String object.

    }

    // C++ std::string behaves like a mutable value/object, whereas Java String is an immutable reference type.
    
}
