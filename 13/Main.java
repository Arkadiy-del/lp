import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherQueries weatherQueries = new WeatherQueries();

        System.out.println("Добро пожаловать в систему управления погодой!");
        System.out.println("Введите название региона, чтобы получить информацию о погоде:");
        String regionName = scanner.nextLine();

        weatherQueries.printWeatherInfoByRegion(regionName);

        System.out.println("Введите максимальную отрицательную температуру для поиска снега:");
        double maxTemperature = scanner.nextDouble();
        weatherQueries.printSnowDates(regionName, maxTemperature);

        scanner.nextLine();

        System.out.println("Введите язык для поиска информации о погоде за прошедшую неделю:");
        String language = scanner.nextLine();
        weatherQueries.printWeatherInfoByLanguage(language);

        System.out.println("Введите минимальную площадь для поиска средней температуры:");
        double minArea = scanner.nextDouble();
        weatherQueries.printAverageTemperatureByArea(minArea);

        scanner.close();
    }
}