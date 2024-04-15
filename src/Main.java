public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = new Hogwarts[]{
               new Griffindor("Гарри Поттер", 55, 91, 90, 80, 80),
               new Griffindor("Гермиона Грейнджер", 99, 76, 90, 60, 50),
               new Griffindor("Рон Уизли", 36, 14, 30, 100, 90),
               new Slytherin("Драко Малфой", 77, 69, 60, 70, 100, 60, 90),
               new Slytherin("Грэхэм Монтегю", 80, 70, 10, 90, 70, 40, 70),
               new Slytherin("Грегори Гойл", 49, 64, 50, 50, 60, 40, 80),
               new Hufflepuff("Захария Смит", 67, 40, 57, 78, 91),
               new Hufflepuff("Седрик Диггори", 94, 89, 65, 87, 69),
               new Hufflepuff("Джастин Финч-Флетчли", 17, 20, 98, 84, 91),
               new Ravenclaw("Чжоу Чанг", 65, 41, 67, 42, 55, 80),
               new Ravenclaw("Падма Патил", 48, 62, 47, 85, 37, 74),
               new Ravenclaw("Маркус Белби", 76, 89, 87, 69, 92, 25)
        };
        for (Hogwarts student: students) {
            System.out.println(student);
        }
        compareGriffindorishness((Griffindor) students[1], (Griffindor) students[2]);
        compareSlytherinishness((Slytherin) students[3], (Slytherin) students[5]);
        compareHufflepuffishness((Hufflepuff) students[7], (Hufflepuff) students[8]);
        compareRavenclawishness((Ravenclaw) students[10], (Ravenclaw) students[11]);
        compareGrades(students[4], students[8]);
        compareGrades(students[0], students[3]);
        compareGrades(students[9], students[7]);
    }
    public static void compareGriffindorishness(Griffindor student1, Griffindor student2) {
        int student1Points = student1.getHonor() + student1.getBravery() + student1.getNobility();
        int student2Points = student2.getHonor() + student2.getBravery() + student2.getNobility();
        if (student1Points > student2Points) {
            System.out.println(student1.getStudentName() + " лучший Гриффиндорец чем " + student2.getStudentName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getStudentName() + " лучший Гриффиндорец чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " равны по баллам");
        }
    }
    public static void compareSlytherinishness(Slytherin student1, Slytherin student2) {
        int student1Points = student1.getAmbition() + student1.getCunning() + student1.getDetermination() + student1.getPowerLust() + student1.getResource();
        int student2Points = student2.getAmbition() + student2.getCunning() + student2.getDetermination() + student2.getPowerLust() + student2.getResource();
        if (student1Points > student2Points) {
            System.out.println(student1.getStudentName() + " лучший Слизеринец чем " + student2.getStudentName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getStudentName() + " лучший Слизеринец чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " равны по баллам");
        }
    }
    public static void compareHufflepuffishness(Hufflepuff student1, Hufflepuff student2) {
        int student1Points = student1.getHardWork() + student1.getHonesty() + student1.getLoyalty();
        int student2Points = student2.getHardWork() + student2.getHonesty() + student2.getLoyalty();
        if (student1Points > student2Points) {
            System.out.println(student1.getStudentName() + " лучший Пуффендуец чем " + student2.getStudentName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getStudentName() + " лучший Пуффендуец чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " равны по баллам");
        }
    }
    public static void compareRavenclawishness(Ravenclaw student1, Ravenclaw student2) {
        int student1Points = student1.getCreative() + student1.getIntelligence() + student1.getSmart() + student1.getWisdom();
        int student2Points = student2.getCreative() + student2.getIntelligence() + student2.getSmart() + student2.getWisdom();
        if (student1Points > student2Points) {
            System.out.println(student1.getStudentName() + " лучший Когтевранец чем " + student2.getStudentName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getStudentName() + " лучший Когтевранец чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " равны по баллам");
        }
    }
    public static void compareGrades(Hogwarts student1, Hogwarts student2) {
        int student1Points = student1.getApparitionDistance() + student1.getMagicPower();
        int student2Points = student2.getApparitionDistance() + student2.getMagicPower();
        if (student1Points > student2Points) {
            System.out.println(student1.getStudentName() + " обладает большей магической мощностью чем " + student2.getStudentName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getStudentName() + " обладает большей магической мощностью чем " + student1.getStudentName());
        } else {
            System.out.println(student1.getStudentName() + " и " + student2.getStudentName() + " равны по баллам");
        }
    }
}