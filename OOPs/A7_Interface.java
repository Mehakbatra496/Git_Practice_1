// Base interface
interface Communication {
    void makeCall(String phoneNumber);
    void sendMessage(String phoneNumber, String message);
}

// Additional interface for multimedia features
interface Multimedia {
    void takePhoto();
    void recordVideo();
}

// MobilePhone class implementing Communication interface
class MobilePhone implements Communication {

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending message to " + phoneNumber + ": " + message);
    }
}

// Smartphone class implementing both Communication and Multimedia interfaces
class Smartphone implements Communication, Multimedia {

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Smartphone is calling " + phoneNumber);
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending multimedia message to " + phoneNumber + ": " + message);
    }

    @Override
    public void takePhoto() {
        System.out.println("Smartphone is taking a photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Smartphone is recording a video");
    }
}

// Example usage in a main class
public class A7_Interface {
    public static void main(String[] args) {
        
        System.out.println("Mobile Phone.................................................");

        MobilePhone basicPhone = new MobilePhone();
        basicPhone.makeCall("123456789");
        basicPhone.sendMessage("123456789", "Hello!");
        System.out.println();
        System.out.println("Smart Phone.................................................");
        
        Smartphone smartPhone = new Smartphone();
        smartPhone.makeCall("987654321");
        smartPhone.sendMessage("987654321", "Check out this video!");
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }
}
