import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
    public static void main(String[] args) { }
    public static LinkedHashSet ordered(LinkedHashSet linkedHashSet){
        LinkedHashSet set = new LinkedHashSet();
        for(Object linkedHashSet1:linkedHashSet){
            set.add(linkedHashSet1);
        }
        return set;
    }
    public static HashSet unordered(HashSet hashSet){
        HashSet hash = new HashSet();
        for(Object obj:hashSet){
            hash.add(obj);
        }
        return hash;
    }
}
