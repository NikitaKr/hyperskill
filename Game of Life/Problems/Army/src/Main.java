class Army {

    public static void createArmy() {
        Unit unit = new Unit("1");
        Unit unit1 = new Unit("2");
        Unit unit2 = new Unit("3");
        Unit uni3t = new Unit("4");
        Unit unit4 = new Unit("5");

        Knight knight = new Knight("ss");
        Knight kni2ght = new Knight("s1s");
        Knight knight2 = new Knight("sds");

        General general = new General("s");

        Doctor doctor = new Doctor("222");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}