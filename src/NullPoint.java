import java.util.*;
import java.util.stream.Stream;


public class NullPoint {
public static void main(String[] args) {
	String s=null;//if s="value" then it prints value
	Optional<String> o=Optional.ofNullable(s);
	if(o.isPresent())
		System.out.println(o.get());
	else 
		System.out.println("value not present");
}
//ArrayList<String> al=new ArrayList<String>();
//al.add("shaikahmed");
//al.add("Ahmed");
//al.add("irfan");
//al.add("emran");
//Stream s=al.stream();//streamed APIs 
//s.filter(s1->((String) s1).endsWith("an")).sorted().forEach(n->System.out.println(n));

}


