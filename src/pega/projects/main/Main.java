package pega.projects.main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) { //method has normal brackets ()
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
        System.out.println("My name is " + (name1) + "!");
        System.out.println("You can call me " + name);
        System.out.println("and I am " + age + "?");
        System.out.println("I am a " + x + " and loves watching " + y);
        System.out.println(b);
        System.out.println(a);

        boolean test = 12 > 10; //True
        boolean test1 = 12 < 10; //False
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
        int L = 70;
        int W = 40;
        int wallArea = L * W;
        int paint_sqft = 400; //1 Gallon

        System.out.println("♥ Paint Calculator ♥");
        System.out.println();
        System.out.println("Length(ft) of the wall is: " + L);
        System.out.println("Width(ft) of the wall is: " + W);
        System.out.println("Area(sq.ft) of the wall is: " + wallArea);
        System.out.println("Coverage(sq.ft) per paint is: " + paint_sqft);
        System.out.println(a);
        System.out.println("Amount of paint needed is: " + wallArea / paint_sqft + " Gallons");


        System.out.println(a);
        System.out.println();
        int u = 20;
        int v = 50;
        if (u == v) {
            System.out.println("1");
        } else if (u > v) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
        System.out.println();
        System.out.println(a);


        String[] cars ={"Volvo","BMW","Ford","Tesla"}; // Arrays
        System.out.println(cars[0].length()); // length of stored arrays
        System.out.println(cars[0]); //length of Volvo
        for (String i : cars) {
            System.out.println(i); //shows all inside the array
        }



        System.out.println(a);
        System.out.println("☺ Paint Calculator ☺");
        System.out.println();
        System.out.println("Let's get you started!");
        System.out.println("Kindly provide the values for the following");
        System.out.println();

        int[] maxPaint = {100,200,400}; //array


        Scanner length = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Length(ft): ");
        int Lvalue = length.nextInt();  // Read user input


        Scanner width = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Width(ft): ");
        int Wvalue = width.nextInt();  // Read user input

        Scanner walls = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter no. of walls: ");
        double Wall = walls.nextDouble();  // Read user input

        Scanner paint = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Paint Size(ml): ");
        double Pvalue = paint.nextDouble();  // Read user input

        System.out.println(a);
        System.out.println("Total area of the wall is: " + (Lvalue * Wvalue)*Wall + " sq.ft");

                        if (Pvalue == 250) {
                            System.out.println("Max coverage per can is: " + maxPaint[0] + " sq.ft");
                            System.out.println("The number of paint cans needed is: " + Math.ceil(Wall * (Lvalue * Wvalue) / maxPaint[0]));
                        } else if (Pvalue == 500) {
                            System.out.println("Max coverage per can is: " + maxPaint[1] + " sq.ft");
                            System.out.println("The number of paint cans needed is: " + Math.ceil(Wall * (Lvalue * Wvalue) / maxPaint[1]));
                        } else if (Pvalue == 1000) {
                            System.out.println("Max coverage per can is: " + maxPaint[2] + " sq.ft");
                            System.out.println("The number of paint cans needed is: " + Math.ceil(Wall * (Lvalue * Wvalue) / maxPaint[2]));
                        } else {
                            System.out.println("Please enter 250, 500 or 1000 only");
                        }

        System.out.println(a);





    }
}




























