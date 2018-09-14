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

                products.add(product);

                System.out.println(product);
                System.out.println("Product is added");

            }

            if (line.equals("list")) {

                for (int i = 0; i < products.size(); i++){
                    Product product = products.get(i);
                    System.out.println(product);

                }
            }

        }

    }
}
