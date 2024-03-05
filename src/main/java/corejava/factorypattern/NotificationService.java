package corejava.factorypattern;


interface Notification {
    void notifyUser();
}


class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        // TODO Auto-generated method stub
        System.out.println("Sending a push notification");
    }
}

class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        // TODO Auto-generated method stub
        System.out.println("Sending an SMS notification");
    }
}

class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        // TODO Auto-generated method stub
        System.out.println("Sending an e-mail notification");
    }
}


class NotificationFactory {
    public static Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + channel);
        }

    }
}

public class NotificationService {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}