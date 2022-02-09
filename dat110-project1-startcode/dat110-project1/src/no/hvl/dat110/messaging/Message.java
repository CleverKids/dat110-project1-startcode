package no.hvl.dat110.messaging;

public class Message {

	private byte[] data;

	public Message(byte[] data) {
		
		// TODO - START
		
		if (data.length <= 127) {
			this.data=data;
		} else {
			throw new IllegalArgumentException("Message is null or over 127 bytes");
		}
			
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
