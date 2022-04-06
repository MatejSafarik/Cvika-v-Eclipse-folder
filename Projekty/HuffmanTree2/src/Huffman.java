// Vzhladom na to ze este stale zapasim s Javou som sa pri praci na tomto kode 
// ja Matej Safarik silne inspiroval kodom od Kunwar Desh Deepak Singh
// projekt ktory budeme odovzdavat v 6 tyzdni by som ale uz chcel nakodit aspon z 90% po vlastnom


import java.util.*;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//import java.util.Comparator;
  
// node class je zakladna struktura; kazdy HuffmanNode representuje node v Huffmanovom strome
class HuffmanNode {
  
    int data;
    char c;
  
    HuffmanNode left;
    HuffmanNode right;
}
  
// comparator classa porovnavat node; porovnava ich velkost
class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y)
    {
  
        return x.data - y.data;
    }
}
  
public class Huffman {
  
	// recursivna funkcia na tlacenie Huffmanovho kodu do stromu, tu sa generuje Hufmanov strom
    public static void printCode(HuffmanNode root, String s)
    {
  
    	// ak prava aj lava vetva su nulove tak vytvorime list; kod je vytvarany pocas presunu cez strom
        if (root.left
                == null
            && root.right
                   == null
            && Character.isLetter(root.c)) {
  
        	// c je pismeno v node
            System.out.println(root.c + ":" + s);
  
            return;
        }
  
        // ak ideme vlavo tak do kodu dame 0; ak ideme vpravo tak do kodu dame 1
  
        // rekurzivne volame lavy a pravy pod strom generovaneho stromu
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }
  
    // funkcia main
    public static void main(String[] args)
    {
  
        Scanner s = new Scanner(System.in);
  
        // tu zadavame pocet znakov ktore chceme nacitat 
        //nasledne znaky ktore chceme nacitat
        //a nasledne hodnotu k danym znakom
        // priklad formatu:
        //9
        //'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'
        //4, 13, 17, 11, 9, 21, 51, 61, 7
        int n = 9;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
        int[] charfreq = { 4, 13, 17, 11, 9, 21, 51, 61, 7 };
  
        // vytvarame prijoritny rad q a vytvarame minimalne prijoritny rad min-heap

        PriorityQueue<HuffmanNode> q
            = new PriorityQueue<HuffmanNode>(n, new MyComparator());
  
        for (int i = 0; i < n; i++) {
  
        	// vytvarame HuffmanNodu a pridavame ju do prioritneho radu q
            HuffmanNode hn = new HuffmanNode();
  
            hn.c = charArray[i];
            hn.data = charfreq[i];
  
            hn.left = null;
            hn.right = null;
  
            // funkcia add pridava HuffmanNode do radu
            q.add(hn);
        }
  
        // vytvarame pociatocnu Node
        HuffmanNode root = null;
  
        // tu vyberame 2 najmensie hodnoty z radu dokedy nezostane len jedna
        while (q.size() > 1) {
  
        	// vyberame prvy najmensi Node
            HuffmanNode x = q.peek();
            q.poll();
  
            // vyberame druhy najmensi Node
            HuffmanNode y = q.peek();
            q.poll();
  
            // novy Node f ktory je rovny hodnote suctu 2 spojenych Nodov

            HuffmanNode f = new HuffmanNode();

            f.data = x.data + y.data;
            f.c = '-';
  
            // prvy vybraty Node ako left child
            f.left = x;
  
            // druhy vybraty Node ako right child
            f.right = y;
  
            // oznacenie Node f ako pociatocny Node
            root = f;
  
            // pridame tento f Node do prijoritneho radu
            q.add(f);
        }
  
        // print kodu za pomoci precestovania stromom
        printCode(root, "");
    }
}

