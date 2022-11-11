package StonesContent.Stonetypes;
import StonesContent.Sorting.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stone {
    String name;
    double price, weight, transparency;
    static double totalPrice = 0,  totalWeight = 0;
    static ArrayList<Stone> stones = new ArrayList<>();

    public enum StoneType{
        PREC,
        SEMI
    }
    StoneType type;

    public enum rangeSorting{
        ASC,
        DESC
    }

    public static void addStone(StoneType type, String Name, double Price,
                                double Weight, double Transparency) {
        if (type == StoneType.PREC)
            stones.add(new PreciousStone(Name, Price, Weight, Transparency));
        else
            stones.add(new SemiPreciousStone(Name, Price, Weight, Transparency));
    }

    public static void delStone(int i) {
        if (i > stones.size() - 1 || i < 0) {
            System.out.println(" НЕВІРНО ВВЕДЕНІ ДАННІ! \nСПРОБУЙТЕ ЩЕ РАЗ ");
        }else{
            stones.remove(i);
        }
    }

    public static void listOfStones(ArrayList<Stone> list){

        if(list.size() == 0){
            System.out.println("В намисті каменів нема");
            return;
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ") Тип каменя: " + list.get(i).getType() +
                             "," + list.get(i).toString());
        }
    }

    public static ArrayList<Stone> sortStones(ArrayList<Stone> stones, rangeSorting type) {

        ArrayList<Stone> sortedArray = new ArrayList<>(stones);
        int N = sortedArray.size();
        if (type == rangeSorting.ASC) {
            sortedArray.sort(new AscSorting());
        }else {
            System.out.println("Сортуємо за спаданням");
            sortedArray.sort(new DescSorting());
        }
        while (N-- != 0) {
            System.out.print(sortedArray.get(N));
        }
        return sortedArray;
    }

    public static ArrayList<Stone> filterStones(ArrayList<Stone> list){
        ArrayList<Stone> newArr = list.stream().filter(i -> i.transparency > 0.2 && i.transparency < 0.8).collect(Collectors.toCollection(ArrayList::new));
        for(Stone stone : newArr){
           System.out.println(stone);
        }
        return newArr;
    }

    public static double getTotalPrice(ArrayList<Stone> list) {
        totalPrice = 0;
        list.forEach((plane) -> totalPrice += plane.price);

        System.out.println("\nЗагальна ціна: " + totalPrice);
        return totalPrice;
    }

    public static double getTotalWeight(ArrayList<Stone> planes) {
        totalWeight = 0;
        planes.forEach((plane) -> totalWeight += plane.weight);

        System.out.println("\nЗагальна вага: " + totalWeight + " карат");
        return totalWeight;
    }
    public String getStoneName() { return name; }
    public static ArrayList<Stone> getStones() { return stones; }
    public StoneType getType() { return type; }
    public static void setStones(ArrayList<Stone> stones) { Stone.stones = stones; }
    public static void setTotalPrice(double totalPrice) { Stone.totalPrice = totalPrice; }
    public static void setTotalWeight(double totalWeight) { Stone.totalWeight = totalWeight; }
    public double getPrice(){return price;}
    public double getWeight(){return weight;}
    public double getTransparency(){return transparency;}


    @Override
    public String toString() {
        return    " Назва-: "+ name +
                  ", Ціна-: " + price +
                  ", Вага-: " + weight +
                  ", Прозорість-: " + transparency
                  + '\'' + '\n';
    }
}
