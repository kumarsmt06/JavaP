package multithreading;

class Transfer{//class for transferring messages
    public void sendMessage(String message){
        System.out.println(message + " is sending.....");

        try {
            Thread.sleep(1000);//delay for one second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MessageTransfer extends Thread{
    private String message;
    Transfer msgTransfer;
    public MessageTransfer(String msg, Transfer trans){
        message = msg;
        msgTransfer = trans;
    }
    @Override
    public void run() {
        synchronized (msgTransfer) {
            msgTransfer.sendMessage(message);//send msg using the thread
        }
    }
}

public class syncThread {
    public static void main(String[] args) {
        Transfer trans = new Transfer();
        MessageTransfer msg1 = new MessageTransfer("Sum",trans);
        MessageTransfer msg2 = new MessageTransfer("Kumar",trans);
        MessageTransfer msg3 = new MessageTransfer("JAVA",trans);

        msg1.start();
        msg2.start();
        msg3.start();
    }
}
