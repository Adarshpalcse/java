public class variable {
    public static void main(String[] args) {
        // variable -->>
        int age=33;// age is variable data type is int 
        /* 
          data type in java 
         -->> numberia data type in java 
         (1)..decimal 
         (2).. non-deciamle
         byte -->>8 bit 
         1 bit resqued for (+,-) 
         7 bit used for storing data 
         octa ==8  -->>> 2^7 to 2^7-1==-128 to 127
         decimal ==10
         hexa == 16  
         */
        byte age1=22;
        byte  age2=(byte)130;
        //output 
        System.out.println(age2);
        /* 
          print() println()
          SOP-->>>
          S-->>System
          O-->> output
          P-->> print()
          out -->> objet -->> print stream class  
         */
        System.out.print("HELLO ");
        System.out.print("HELLO WORLD ");
        /* 
         println() -->>  new line 
        "\n"----->> new line  
        println() -->>
        print();
        newline();
         
        */
        // println()
        System.out.println("HELLO ");
        System.out.println("HELLO WORLD ");
         

        System.out.println();
        System.out.println();
        byte a=(byte)140;
        System.out.println(a);

        int a1=(byte)140;
        System.out.println(a1);
         /*  short -->> 2byte ==>> 16 bit 
         range =  -2^15 to 2^15-1
         intege ->4 byte ==>> 32 byte 
         (+,-)
         -2^31 b to 2^31-1
         long -->>8 byte   
       */

       /* float   */
        float p=10.25f;// valid 
         float  p1=10.43F; // valid 
        float p2=(float)12.22; // valid 
        
        /* boolen  data type
        boolne ==1 byte 
         plateform -->> opreting system +arch(64,32) 
         only values are true or false 
         */
        boolean s1=true;
        boolean s2=false;

        /* chrecter data type 
           
         */
          String name ="ABCD";
          String name2=name;
          String name3="ABCD";
          String name4= new String("abcd");
          System.out.println(name==name2);
          System.out.println(name==name3);
          System.out.println(name==name4);
          System.out.println(name.equalsIgnoreCase(name4));
          

          String n1="adarsh";
          String n2="adarsh";
          System.out.println(n1.compareTo(n2));
    }
}
