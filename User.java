class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        ChatStorage.getInstance().appendMessage(name + ": " + message);
    }

    public void sendMessage(String message) {
        ChatRoom.sendMessage(message, this);
    }
}
