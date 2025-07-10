package homeTask_11;

public class Main {
  public static void main(String[] args) {
    MyArrayList<String> languages = new MyArrayList<>();
    System.out.println("Создана пустая коллекция: " + languages);
    System.out.println("Размер: " + languages.size());
    System.out.println("Пуста?: " + languages.isEmpty());

    languages.add("Java");
    languages.add("Python");
    languages.add("C++");
    languages.add("JavaScript");
    System.out.println("\nПосле добавления 4 элементов: " + languages);
    System.out.println("Размер: " + languages.size());
    System.out.println("Пуста?: " + languages.isEmpty());

    System.out.println("\nЭлемент с индексом 1: " + languages.get(1));

    System.out.println("\nСодержит 'Java'? " + languages.contains("Java"));
    System.out.println("Содержит 'Ruby'? " + languages.contains("Ruby"));

    languages.remove(0);
    System.out.println("\nПосле удаления первого элемента: " + languages);
    System.out.println("Размер: " + languages.size());

    languages.clear();
    System.out.println("\nПосле очистки: " + languages);
    System.out.println("Размер: " + languages.size());
    System.out.println("Пуста?: " + languages.isEmpty());

    MyArrayList<Integer> numbers = new MyArrayList<>(2);
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    System.out.println("\nКоллекция после расширения: " + numbers);
    System.out.println("Размер: " + numbers.size());
  }
}
