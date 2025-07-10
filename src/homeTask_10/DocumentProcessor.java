package homeTask_10;

public class DocumentProcessor {

  public static void printFirstTwoBlocks(String docNumber) {
    String[] blocks = docNumber.split("-");
    System.out.println("Первые два блока по 4 цифры: " + blocks[0] + " " + blocks[2]);
  }

  // 2. Заменить блоки из трех букв на ***
  public static void replaceLettersWithStars(String docNumber) {
    String[] blocks = docNumber.split("-");
    for (int i = 0; i < blocks.length; i++) {
      if (blocks[i].matches("[a-zA-Z]{3}")) {
        blocks[i] = "***";
      }
    }
    System.out.println("Документ с замененными буквами: " + String.join("-", blocks));
  }

  // 3. Вывести буквы в формате ууу/yyy/y/y в нижнем регистре
  public static void printLettersInFormat(String docNumber) {
    StringBuilder letters = new StringBuilder();
    for (char c : docNumber.toCharArray()) {
      if (Character.isLetter(c)) {
        letters.append(Character.toLowerCase(c));
      }
    }

    if (letters.length() >= 7) {
      String result = letters.substring(0, 3) + "/" +
          letters.substring(3, 6) + "/" +
          letters.charAt(6) + "/" +
          letters.charAt(7);
      System.out.println("Буквы в формате: " + result);
    }
  }

  // 4. Вывести буквы с использованием StringBuilder в верхнем регистре
  public static void printLettersWithStringBuilder(String docNumber) {
    StringBuilder letters = new StringBuilder("Letters:");
    int letterCount = 0;

    for (char c : docNumber.toCharArray()) {
      if (Character.isLetter(c)) {
        letterCount++;
        letters.append(Character.toUpperCase(c));
        if (letterCount == 3 || letterCount == 6 || letterCount == 7) {
          letters.append("/");
        }
      }
    }

    System.out.println(letters.toString());
  }

  // 5. Проверить наличие последовательности abc (без учета регистра)
  public static void checkForAbcSequence(String docNumber) {
    if (docNumber.toLowerCase().contains("abc")) {
      System.out.println("Документ содержит последовательность 'abc'");
    } else {
      System.out.println("Документ НЕ содержит последовательность 'abc'");
    }
  }

  // 6. Проверить начинается ли с 555
  public static void checkStartsWith555(String docNumber) {
    if (docNumber.startsWith("555")) {
      System.out.println("Документ начинается с '555'");
    } else {
      System.out.println("Документ НЕ начинается с '555'");
    }
  }

  // 7. Проверить заканчивается ли на 1a2b
  public static void checkEndsWith1a2b(String docNumber) {
    if (docNumber.toLowerCase().endsWith("1a2b")) {
      System.out.println("Документ заканчивается на '1a2b'");
    } else {
      System.out.println("Документ НЕ заканчивается на '1a2b'");
    }
  }
}
