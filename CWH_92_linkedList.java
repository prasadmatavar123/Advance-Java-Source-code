import java.util.LinkedList;
// import java.*;

public class CWH_92_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();
        L2.add(15);
        L2.add(18);
        L2.add(18);

        L1.add(6);
        L1.add(7);
        L1.add(4);
        L1.add(6);
        L1.add(0,5);
        L1.add(0,1);
        L1.addAll(L2);
        L1.add(0,1);
        L1.addAll(0,L2);
        System.out.println(L1.contains(27));
        System.out.println(L1.indexOf(6));
        System.out.println(L1.lastIndexOf(6));
        // L1.clear();
        L1.set(1, 566);
        for(int i=0; i<L1.size(); i++){
            System.out.print(L1.get(i));
            System.out.print(" ,");
        }
    }
    
}
