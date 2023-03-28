package homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PersonRunner {
  public static void main(String[] args) throws ParseException {
    DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    List<Person> persons=new ArrayList<>();
    persons.add(new Person("Elena", formatter.parse("26.01.1975")));
    persons.add(new Person("Artem", formatter.parse("29.05.2009")));
    persons.add(new Person("Natalia",formatter.parse("26.05.1975")));

    persons.sort(new PersonAgeComparator());

    for(Person p:persons){
      System.out.println(p);
    }

  }
}
