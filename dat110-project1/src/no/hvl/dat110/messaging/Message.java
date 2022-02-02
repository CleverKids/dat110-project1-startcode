package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] data;

	public Message(byte[] data) {

		// TODO - START
		
		if (data == null || data.length > 127) {
		//	System.out.println("fuck this shit");
		}else{
			this.data = data;
		}
			
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
