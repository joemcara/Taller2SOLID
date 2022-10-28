public class ISP {
    //INTERFACE SEGREGATION PRINCIPLE
    /* se crea una interfaz especifica para cada tipo de dispositivo inteligente 
    para evitar que se implementen metodos innecesarios en aquellos dispositivos que no lo requieran.
    En este caso se crean la interfaz smartDevice que es la general, portableSmartDevice que es para dispositivos 
    portables y deskSmartDevice que es para computadoras para escritorio
    de esta manera aquellos dispositivos como computadoras de escritorio no implementaran un metodo "cargar"
    */

public interface smartDevice{
    void turnOn();
}

public interface portableSmartDevice{
    void charge();
    void turnOnWifi();
}

public interface deskSmartDevice{
    void plugIn();
    void plugPeripherals();
    void plugEthernetCable();
}

public class SmartPhone implements smartDevice, portableSmartDevice{
    int battery;
    boolean isCharged;
    boolean wifiConnection;
    boolean isOn;
    public void charge(){
        isCharged = true;
        battery = 100;
    }
    public void turnOnWifi(){
        wifiConnection = true;
    }
    public void turnOn(){
        isOn = true;
    }
}

public class DesktopComputer implements smartDevice, deskSmartDevice{
    boolean keyboardConnected;
    boolean mouseConnected;
    boolean pluggedIn;
    boolean internetConnection;
    boolean monitorConnected;
    boolean turnedOn;

    public void turnOn(){
        turnedOn = true;
    }
    public void plugIn(){
        pluggedIn = true;
    }
    public void plugPeripherals(){
        monitorConnected = true;
        keyboardConnected = true;
        mouseConnected = true;
    }
    public void plugEthernetCable(){
        internetConnection = true;
    }
}
}
