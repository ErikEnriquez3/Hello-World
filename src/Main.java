public class Main {
    public static void main(String[] args) {
        //This next line gives the element name the string Erik
        /*Great job!
         */
        String name1 = "Erik";
        String name = "Rik";
        String x = "foodie";
        String y = "movies";
        String a = "---------------------------------------";
        String b = "Nice to meet you all!";
        int age = 26;
        System.out.println();
        System.out.println(a);
        System.out.println("Hi! ☻");
        System.out.println("My name is "+ (name1) +"!");
        System.out.println("You can call me " + name);
        System.out.println("and I am "+ age+"?");
        System.out.println("I am a "+ x +" and loves watching "+ y);
        System.out.println(b);
        System.out.println(a);

        boolean test = 12>10; //True
        boolean test1 = 12<10; //False
        boolean test2 = (name == "Rik"); //True
        boolean test3 = (name1 == "Rey"); //False
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println();

        int d = 1;
        int e = 1;
        int f = ++d;
        int g = e++;

        System.out.println(f);
        System.out.println(g);


        System.out.println();
        String thanks = "Thank you,";
        String name3 = " miguel!";
        String order = "Your order number is #";
        int previousorder = 715;

        System.out.println(thanks + name3.toUpperCase());
        System.out.println(order + ++previousorder);
        System.out.println();

        System.out.println(a);
        int L = 40;
        int W = 50;
        int wallArea = L*W;
        int paint_sqft = 160;

        System.out.println("Length(ft) = " + L);
        System.out.println("Width(ft) = " + W);
        System.out.println("Area(sq.ft) = " + wallArea);
        System.out.println("Coverage(sq.ft) per paint(500L) :" + paint_sqft);
        System.out.println("Amount of paint(500L) needed is: " + wallArea / paint_sqft);


    }
}































