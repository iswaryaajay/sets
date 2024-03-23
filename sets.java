/*
 * set
 * Hashset
 * Linked Hashset
 * Tree set
 */

package collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sets {

    public static void main(String[] args){
        final HashSet<String> hashset = new HashSet<>();

        hashset.add("Kitkat");
        hashset.add("Dairy Mailk");
        hashset.add("Munch");
        hashset.add("Perk");
        System.out.println(hashset);
        System.out.println(hashset.contains("Perk"));
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.iterator());
        System.out.println(hashset.size());
        System.out.println(hashset.remove("Perk"));
        final HashSet<String> clone = (HashSet<String>) hashset.clone();

        System.out.println(clone);
        final LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();

        linkedhashset.add(100);
        linkedhashset.add(200);
        linkedhashset.add(300);
        linkedhashset.add(400);
        System.out.println(linkedhashset);
        System.out.println(linkedhashset.size());
        System.out.println(linkedhashset.isEmpty());
        System.out.println(linkedhashset.contains(300));
        System.out.println(linkedhashset.remove(400));
        linkedhashset.clear();
        System.out.println(linkedhashset);
        final LinkedHashSet<Integer> linkedhashset1 = new LinkedHashSet<>();

        linkedhashset1.add(1000);
        linkedhashset1.add(2000);
        linkedhashset1.add(3000);
        linkedhashset.retainAll(linkedhashset1);
        System.out.println(linkedhashset1);
        linkedhashset.removeAll(linkedhashset1);
        System.out.println(linkedhashset1);
        final TreeSet<Integer> treeset = new TreeSet<>();

        treeset.add(10);
        treeset.add(20);
        treeset.add(30);
        treeset.add(40);
        System.out.println(treeset.ceiling(30));
        System.out.println(treeset.first());
        System.out.println(treeset.last());
        System.out.println(treeset.subSet(0,3));
        System.out.println(treeset.isEmpty());
        System.out.println(treeset.contains(20));
        System.out.println(treeset.pollFirst());
        System.out.println(treeset.pollLast());
        System.out.println(treeset.ceiling(45));
        System.out.println(treeset.floor(15));
    }
}
