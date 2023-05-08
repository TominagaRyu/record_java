package record;

record Person(String name,String ruby,int age)implements Comparable<Person>{
public int getage() {
    return age;
}
public String getFullName(){
    return name;
}
@Override
public int compareTo(Person person) {
    return Integer.compare(age,person.age);
}
}