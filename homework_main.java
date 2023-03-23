
public class homework_main {
//     Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
// 2. Фамилия (String)
// 3. Возраст (продумать тип)
// 4. Пол
// 5*. Придумать свои собственные поля

// Для этого класса
// 1. Реализовать методы toString, equals и hashCode.
// 2*. Придумать собственные методы и реализовать их
// В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
    public static void main(String[] args) {

        Person per1 = new Person("Sergey", "Bond", 30, "m");
        Person per2 = new Person("Mari", "Bond", 29, "f");
        Person per3 = new Person("Sergey", "Bond", 30, "m");

        //per1.toString();
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);

        System.out.println(per1 == per3);
        System.out.println(per1.equals(per3));

        System.out.println(per1.hashCode());
        System.out.println(per3 .hashCode());
        

    }
    
}
