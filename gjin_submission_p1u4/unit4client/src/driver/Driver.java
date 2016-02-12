package driver;

import client.CarModelOptionIO;
/*
 * Name: Ge Jin
 * andrew id: gjin
 * date : jun 24, 2015
 */



public class Driver {
	public static void main(String[] args){
		System.out.println("Select from one of these opinions: ");//serve as menu
		System.out.println("1.Upload Properties file. ");
		System.out.println("2.Configure a car. ");
		System.out.println("quit.");
		CarModelOptionIO model= new CarModelOptionIO("10.0.0.2",1234);//"10.0.0.2" is IP address of my network, it may change
		                                                        //1234 is an casual port number
		model.run();
	}
	

}
