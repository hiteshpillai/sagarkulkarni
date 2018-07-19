package demo.spring;

public class MessagePrinter {
private Message message;
public MessagePrinter(Message message) {
	this.message = message;
	
}public void printmessage() {
	System.out.println(message.getText());
}
}
