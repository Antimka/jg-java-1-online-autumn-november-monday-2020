package students.jana_sergejenko.lesson_10.level_5.task_13;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.scenario1();
        demo.scenario2();
        demo.scenario3();
        demo.scenario4();
    }

    public String checkResult(boolean result, boolean expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }


    public void scenario1() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        boolean result = test.save(book);
        boolean expected = true;
        System.out.println("test" + checkResult(result, expected));

    }

    public void scenario2() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        final Book book2 = new Book("Becoming", "Michelle Obama");
        test.save(book);
        boolean result = test.save(book2);
        boolean expected = false;
        System.out.println("test" + checkResult(result, expected));
        test.printAll();
    }
    public void scenario3() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        final Book book2 = new Book("Becoming", "Michelle Obama");
        final Book book3 = new Book(" ", " ");
        test.save(book);
        test.save(book2);
        boolean result = test.save(book3);
        boolean expected = false;
        System.out.println("test" + checkResult(result, expected));
        test.printAll();
    }
    public void scenario4() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        final Book book2 = new Book("Becoming", "Michelle Obama");
        final Book book3 = new Book("Game", " ");
        test.save(book);
        test.save(book2);
        boolean result = test.save(book3);
        boolean expected = false;
        System.out.println("test" + checkResult(result, expected));
        test.printAll();
    }
}