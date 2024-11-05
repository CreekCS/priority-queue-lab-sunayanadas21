import java.util.*;
import java.io.*;
public class PriorityQueueLab {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        try {
            File file = new File("RandIntegers.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                int num = Integer.parseInt(scan.nextLine());
                priorityQueue.add(num);
            }
            
            scan.close();
        System.out.println("Priority Queue: " );
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
        }catch (FileNotFoundException e) {
            System.out.println("Oopsies, file not found.");
        }
        catch (NoSuchElementException e) {
            System.out.println("There's no such element!!");
        }
    }
}