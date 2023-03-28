package homework;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

  @Override
  public int compare(Person p1, Person p2){
    if (p1.getData().before(p2.getData())){
      return -1;
    }
    return 1;
  }
}
