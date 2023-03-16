import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
    Scanner input = new Scanner(System.in);
    String line = "";
    ArrayList<String> names = new ArrayList<String>();
    while((line = reader.readLine()) != null) {
      names.add(line);
    }
    int userInput = 0;
    
    while (userInput != 5) {
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");

      userInput = input.nextInt();

      switch (userInput) {
        case 1: 
            System.out.println("$98,345 average salary in South Florida!");
            break;
        case 2:
            System.out.println("US News - 100 Best Jobs!");
            break;
        case 3:
            System.out.println("Top 10 Forbes In-Demand Jobs!");
            break;
        case 4:
          System.out.println("Current Students:");
            for(int i = 0; i < names.size(); i++) {
              System.out.println(names.get(i));
            }
            break;
        case 5:
            break;
      }
    }
    reader.close();
    input.close();
	}
}