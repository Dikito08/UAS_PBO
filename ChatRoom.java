class ChatRoom implements Subject {
    private java.util.List<Observer> observers = new java.util.ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public static void sendMessage(String message, Observer sender) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.attach(sender);
        chatRoom.notifyObservers(message);
    }
}