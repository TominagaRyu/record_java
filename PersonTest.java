package record;

import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.MinimalHTMLWriter;


public class PersonTest {
    public static void main(String[] args){
        Person[] people = {
                new Person("比嘉", "ヒガ", 26),
                new Person("上原", "ウエハラ", 21),
                new Person("儀間", "ギマ", 28),
                new Person("与儀", "ヨギ", 24),
                new Person("赤嶺", "アカミネ", 25),
        };

        int Maxage = people[0].getage();
        String MaxName = "";
        for(Person person : people) {
            if (person.getage() > Maxage) {
                Maxage = person.getage();
                MaxName = person.getFullName();
            }
        }
        int Minage = people[0].getage();
        String MinName = "";
        for (Person person : people) {
            if (person.getage() < Minage) {
                Minage = person.getage();
                MinName = person.getFullName();
            }
        }
        System.out.println("最年長は" + MaxName + "さんで" + Maxage + "歳です。");
        System.out.println("最年少は" + MinName + "さんで" + Minage + "歳です。");
    }
}


