import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Нижче перша частина завдання для прикладу
        // Там де в завданні вказані початкові дані у вигляді масиву - ініціалізуйте окремий масив
        // Нижче обробляйте масив, додайте логіку обробки
        // Частина 1: Увійди в Замок
        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt(); // питаємо в користувача чергове число
            if (userInput != secretCode[i]) { // перевіряємо число проти i-го елемента масиву з правильним кодом
                isCodeCorrect = false; // якщо натрапляємо на неправильно введене число - усю комбінацію вважаємо невірною
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину.");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
        }

        // Інші частини пригоди додайте тут!
    }
}