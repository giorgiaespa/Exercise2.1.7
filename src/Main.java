import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> words = fill(new HashSet<>());
        System.out.println("hashset riempito: " + words);
        System.out.println("grandezza: " + howLong(words));
        elements(words);
    }

    public static Set <String> fill(Set <String> list) {
        list = new HashSet<String>(Arrays.asList("this", "is", "my", "first", "try"));
        return list;
    }

    public static int howLong(Set <String> list) {
        return list.size();
    }

    public static void elements(Set <String> list){
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            String e = i.next();
            System.out.println("elemento presente nell'hashset: " + e);
        }
    }
}

/*
c'è un motivo specifico per il quale l'ordine in cui me lo stampa è diverso rispetto a
quello che ho scritto io?
 */
