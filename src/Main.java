public class Main {

    public static void printAuthor() {
        System.out.println();
    }

    public static void main(String[] args) {
        Author StephenKing = new Author("Стивен", "Кинг");
        Book theGreenMile = new Book(StephenKing,"Зеленая миля", 1996);
        System.out.println(theGreenMile);

        Author alanDeanFoster = new Author("Алан Дин", "Фостер");
        Book spellSinger = new Book(alanDeanFoster,"Чародей с гитарой", 1983);
        System.out.println(spellSinger);

        spellSinger.setPublishingYear(1985);
        System.out.println(spellSinger);
    }
}
