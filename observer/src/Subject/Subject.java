package Subject;
import Displays.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    public float getTemperature();

    public float getHumidity();

    public float getPressure();
}
