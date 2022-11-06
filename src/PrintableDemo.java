public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("book1");
        Book book2 = new Book("book2");

        Magazine magazine1 = new Magazine("mag1");
        Magazine magazine2 = new Magazine("mag2");

//        Printable newspaper = new Printable() {
//            @Override
//            public void print() {
//                System.out.println("Print newspaper");
//            }
//        };

        Printable newspaper = () -> System.out.println("Print newspaper");

        Printable[] printables = {book1, book2, magazine1, magazine2, newspaper};
        for (Printable p : printables) {
            p.print();
        }

//        Magazine.printMagazines(printables);

    }
}
