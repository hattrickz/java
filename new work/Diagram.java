public class Diagram {
public static void main (String [] args){ 

String star = "******";
String name = " ";

for(int i = 0; i < star.length(); i--){
name = star.charAt(i) + name;
} 


//name = name + i;
System.out.print(name);
}
}