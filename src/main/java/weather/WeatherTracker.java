package weather;

public class WeatherTracker {

    String currentConditions;

    private final Notifier rainyNotifier;
    private final Notifier sunnyNotifier;

    public WeatherTracker(Notifier rainyNotifier, Notifier sunnyNotifier) {
        this.rainyNotifier = rainyNotifier;
        this.sunnyNotifier = sunnyNotifier;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;

        if (weatherDescription == "rainy") {
            String alert = rainyNotifier.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }

        if (weatherDescription == "sunny") {
            String alert = sunnyNotifier.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}