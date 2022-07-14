package com.yash.Q10;




import java.util.*;
import java.util.stream.Collectors;
class employee
{
String name;
int id;
public employee(String name, int id) {

this.name = name;
this.id = id;

}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}

}
public class Question10 {



public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<employee> I=new ArrayList<employee>();
I.add(new employee("harish",1));
I.add(new employee("abhi",2));
I.add(new employee("namdev",3));




Map<Integer,String> empMap=I.stream().collect(Collectors.toMap(e->e.getId(),e->e.getName()));
System.out.println(empMap);

Set<String> nameSet = I.stream().map(e->e.name).collect(Collectors.toSet());

System.out.println(nameSet);






}



}