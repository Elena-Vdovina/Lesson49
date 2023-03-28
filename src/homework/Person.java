package homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Создайте класс Person, которому при создании передавайте имя и дату рождения в виде строки
// в формате "ДД.ММ.ГГГГ".
// Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".
public class Person {

  private final String name;
  private final Date data;

  public Person(String name, Date data) {
    this.name = name;
    this.data = data;
  }

  public String getName() {
    return name;
  }

  public Date getData() {
    return data;
  }

  @Override
  public String toString() {
    DateFormat ruDateFormatter = new SimpleDateFormat("d MMMM yyyy",
        Locale.forLanguageTag("ru-RU"));
    return name + " " + ruDateFormatter.format(data);
  }
}
