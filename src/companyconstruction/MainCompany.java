package companyconstruction;

public class MainCompany {

  public static void main(String[] args) {
    Company company = new Company();

    company.employ(new Person("Raul Adrian", 29, "plummer"));
    company.employ(new Person("Raul Xulescu", 56, "carpenter"));
    company.employ(new Person("Popescu Xulescu", 56, "welder"));
    company.employ(new Person("Jeth Lee", 60, "manager"));
    company.employ(new Person("Popescu Ion", 19, "plummer"));
    company.employ(new Person("Popescu Vasile", 25, "plummer"));
    company.employ(new Person("Popescu Maria", 23, "welder"));
    company.employ(new Person("Ion Ionut", 30, "plummer"));
    company.employ(new Person("Popa Dumitru", 44, "carpenter"));
    company.employ(new Person("Van Damme", 55, "carpenter"));

    System.out.println("manager->" + company.getManager());
    System.out.println("profession-> " + company.getPersons("plummer"));
    System.out.println("persons older->" + company.getPersonsOlder(30));
    System.out.println("one of the name is the same->" + company.getPerson("Raul"));


  }
}
