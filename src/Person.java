public class Person {

    private boolean dayOff;
    private boolean startDay;
    private boolean endDay;
    private int bonus;
    private int workDays;


    abstract class Developer extends Person implements BonusSystem {
        @Override
        public int bonusCalculation(String dayOfTheWek) {
            if (startDay && endDay) {
                return bonus += 3;
            } else {
                return bonus += 0;
            }
        }
    }

    abstract class Lead extends Person implements BonusSystem, Deligation {
        @Override
        public int bonusCalculation(String dayOfTheWek) {
            if (startDay && endDay) {
                return bonus += 2;
            } else {
                return bonus += 0;
            }
        }
        @Override
        public String deligation(String dayOfTheWek) {
            if (dayOfTheWek.equals(DaysOfTheWeek.MONDAY)) {
                return "Person dosn't work";
            } else return "The task is deligation!";
        }
    }

    abstract class Manager extends Person implements BonusSystem, Deligation {
        @Override
        public int bonusCalculation(String dayOfTheWek) {
            if (startDay && endDay) {
                return bonus += 1;
            } else return bonus += 0;
        }

        @Override
        public String deligation(String dayOfTheWek) {
            if (dayOfTheWek.equals(DaysOfTheWeek.TUESDAY)) {
                return "Person dosn't work";
            } else return "The task is deligation!";
        }
    }
}