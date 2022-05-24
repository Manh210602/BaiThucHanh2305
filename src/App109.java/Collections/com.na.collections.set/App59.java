package App109.java.Collections.com.na.collections.set;


import java.util.LinkedHashSet;
import java.util.Set;
public class App59 {
    public static void main(String[] args) {
        Set<String> linkhashset=new LinkedHashSet<>();
        linkhashset.add("java");
        linkhashset.add("c++");
        linkhashset.add("python");
        linkhashset.add("php");
        for(String s:linkhashset) {
            System.out.println(s);
        }
    }
}