public class Main {

    public static void main(String[] args) {
        Author StephenKing = new Author("Стивен", "Кинг");
        Book theGreenMile = new Book(StephenKing.getFirstName() + StephenKing.getLastName(),
                "Зеленая миля", 1996);
        System.out.println("Автор: " + StephenKing.getFirstName() + " " + StephenKing.getLastName());
        System.out.println("Книга: " + theGreenMile.getBookName());
        System.out.println("Год публикации: " + theGreenMile.getPublishingYear());

        Author alanDeanFoster = new Author("Алан Дин", "Фостер");
        Book spellSinger = new Book(alanDeanFoster.getFirstName() + " " + alanDeanFoster.getLastName(),
                "Чародей с гитарой", 1983);
        System.out.println("Автор: " + alanDeanFoster.getFirstName() + " " + alanDeanFoster.getLastName());
        System.out.println("Книга: " + spellSinger.getBookName());
        System.out.println("Год публикации: " + spellSinger.getPublishingYear());
        spellSinger.setPublishingYear(1985);
        System.out.println("Год публикации: " + spellSinger.getPublishingYear());
    }
}
