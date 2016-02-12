package client;



public class CarModelOptionIO {
	private DefaultSocketClient dsc;
	
	public CarModelOptionIO(String str, int port){
		dsc= new DefaultSocketClient(str, port);
		
	}
	public void run(){
		dsc.start();
	}

}
