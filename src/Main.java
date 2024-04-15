public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindorers = new Griffindor[]{
                new Griffindor("Harry Potter", 55, 20, 90, 80, 80),
                new Griffindor("Гермиона Грейнджер", 99, 76, 90, 60, 50),
                new Griffindor("Рон Уизли", 36, 14, 30, 100, 90)
        };
        Slytherin[] slytheriners = new Slytherin[]{
               new Slytherin("Драко Малфой", 77, 69, 60, 70, 100, 60, 90),
               new Slytherin("Грэхэм Монтегю", 80, 70, 10, 90, 70, 40, 70),
               new Slytherin("Грегори Гойл", 49, 64, 50, 50, 60, 40, 80)
        };
        Hufflepuff[] hufflepuffers = new Hufflepuff[]{
                new Hufflepuff("Захария Смит", 67, 40, 57, 78, 91),
                new Hufflepuff("Седрик Диггори", 94, 89, 65, 87, 69),
                new Hufflepuff("Джастин Финч-Флетчли", 17, 20, 98, 84, 91)
        };
        Ravenclaw[] ravenclawers = new Ravenclaw[]{
                new Ravenclaw("Чжоу Чанг", 65, 41, 67, 42, 55, 80),
                new Ravenclaw("Падма Патил", 48, 62, 47, 85, 37, 74),
                new Ravenclaw("Маркус Белби", 76, 89, 87, 69, 92, 25)
        };
    }
}