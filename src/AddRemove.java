import java.util.LinkedList;

public class AddRemove {
    
    static void addFirst(LinkedList<String> list, String item){
        list.addFirst(item);
    }

    static void addLast(LinkedList<String> list, String item){
        list.addLast(item);
    }

    static void appendList(LinkedList<String> list, LinkedList<String> item){
        list.addAll(item);
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Pankaj");
        list.add("Sanu");
        addFirst(list, "Kristen");
        addLast(list, "Ravi");
        list.remove("Pankaj");
        System.out.println(list);


    }
}
