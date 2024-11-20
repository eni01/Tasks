import java.util.Comparator;
import java.util.ArrayList;

public class Ass3Driver
{
    public static void selectionSort(TrainCar head){
       // Your natural ordering sort goes here
       if (head == null) {
           return;
       }
       TrainCar minimum = head;
       TrainCar current = head.getNext();
       
       while (current != null) {
           if (minimum.getLoad() > current.getLoad()) {
               minimum = current;
           }
           current = current.getNext();
       }
       
       if (minimum != head) {
           head.swapCargo(minimum);
       }
       
       selectionSort(head.getNext());
   
    }
    
    
    public static void selectionSort(TrainCar head, Comparator c){
       // Your alternate order sort goes here
    }


    public static void main(String[] args){
        // Instantiate our train cars
        TrainCar a = new TrainCar("A", "wheat", 100);
        TrainCar b = new TrainCar("B", "oats", 120);
        TrainCar c = new TrainCar("C", "gold", 40);
        TrainCar d = new TrainCar("D", "pork", 50);
        TrainCar e = new TrainCar("E", "coal", 200);
        TrainCar f = new TrainCar("F", "canola", 45);
        TrainCar g = new TrainCar("G", "one really big egg", 150);

        // Link the cars together
        a.setNextCar(b);
        b.setNextCar(c);
        c.setNextCar(d);
        d.setNextCar(e);
        e.setNextCar(f);
        f.setNextCar(g);

        System.out.println("Unsorted:");
        a.printTrain();
        
        // Pass the head of the train to the sort method
        selectionSort(a);
        
        System.out.println("\nNatural Order:");
        a.printTrain();
        
        // Now use the alternate sort
        selectionSort(a, new OrderByCargo());
        
        System.out.println("\nAlternate Order:");
        a.printTrain();
    }
}
