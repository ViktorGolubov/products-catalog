package tech.bts.productcatalog;

import java.lang.reflect.Array;
import java.util.*;

public class ProductCatalog {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Product> products = new ArrayList<Product>();

        while (true){
            System.out.print("What do you want to do? ");
            String line = input.nextLine();

            System.out.println("You want to: " + line);

            if(line.equals("exit")) {
                break;
            }

            if (line.equals("add")) {


                System.out.print("Product name? ");
                String name = input.nextLine();

                System.out.print("Price? ");
                double price =Double.parseDouble(input.nextLine());

                System.out.print("Units? ");
                int units =Integer.parseInt(input.nextLine());

                Product product = new Product( name, price,units);

                System.out.println(product);

                System.out.println("Product is added");

            }

            if (line.equals("list")) {


            }
            System.out.println("Action done!");


        }


    }
}
