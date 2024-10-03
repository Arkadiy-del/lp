//Создать объект класса Дом, используя классы Окно, Дверь. Методы: закрыть на ключ, вывести на консоль количество окон, дверей.

import java.util.ArrayList;
import java.util.List;

// Класс Окно
class Window {
    private boolean isOpen;

    public Window() {
        this.isOpen = true; 
    }

    public void close() {
        isOpen = false;
        System.out.println("Окно закрыто.");
    }

    public boolean isOpen() {
        return isOpen;
    }
}

// Класс Дверь
class Door {
    private boolean isLocked;

    public Door() {
        this.isLocked = false; 
    }

    public void lock() {
        isLocked = true;
        System.out.println("Дверь закрыта на ключ.");
    }

    public boolean isLocked() {
        return isLocked;
    }
}

// Класс Дом
class House {
    private List<Window> windows;
    private List<Door> doors;

    public House(int numberOfWindows, int numberOfDoors) {
        windows = new ArrayList<>(numberOfWindows);
        doors = new ArrayList<>(numberOfDoors);

        for (int i = 0; i < numberOfWindows; i++) {
            windows.add(new Window());
        }

        for (int i = 0; i < numberOfDoors; i++) {
            doors.add(new Door());
        }
    }

    public void lockDoors() {
        for (Door door : doors) {
            door.lock();
        }
    }

    public void countWindowsAndDoors() {
        System.out.println("Количество окон: " + windows.size());
        System.out.println("Количество дверей: " + doors.size());
    }
}


public class Main {
    public static void main(String[] args) {
        House house = new House(5, 3); 
        house.lockDoors(); 
        house.countWindowsAndDoors(); 
    }
}
