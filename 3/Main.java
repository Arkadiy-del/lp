import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        Patient[] patients = new Patient[2];
        patients[0] = new Patient(1, "Иванов", "Иван", "Иванович", "ул. Смолина, д.1", "+83567761290", "333333", "Голованя боль");

        patients[1] = new Patient(2, "Петров", "Петя", "Петрович", "ул. Борсоева, д.2", "+79983516271", "555555", "Кашель");

        Patient.diagnose_find(patients, "Кашель");
        Patient.medic_book_find(patients, 330000, 500000);
    }
}
class Patient {
    int id;
    String surname;
    String name;
    String surname1;
    String address;
    String telephone;
    String medic_book;
    String diagnose;

    public Patient(int id, String surname, String name, String surname1, String address, String telephone, String medic_book, String diagnose){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.surname1 = surname1;
        this.address = address;
        this.telephone = telephone;
        this.medic_book = medic_book;
        this.diagnose = diagnose;
    }
    public static void  diagnose_find(Patient[] patients, String diagnose){
        System.out.println("Диагноз пациента: " + diagnose);
        for(Patient patient : patients){
            if (patient.diagnose.equals(diagnose)){
                System.out.println("Пациент: " + patient.name + " " + patient.surname);
            }
        }
    }
    public static void medic_book_find(Patient[] patients, int StartRange, int endRange){
        System.out.println("Номер медицинской карты пациента находящится в интервале: " + StartRange + " " + endRange);
        int count = 0;
        for (Patient patient : patients) {
            int medic_book = Integer.parseInt(patient.medic_book);
            if (medic_book >= StartRange && medic_book <= endRange) {
                System.out.println(patient.name + " " + patient.surname + " номер карты: " + patient.medic_book);
                count++;
            }
        }
        System.out.print("Всего найдено: " + count);
    }
}