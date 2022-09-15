package com.exam.pll;

import com.exam.bll.Apartment;

public class TestApartment {

	public static void main(String[] args) {
		Apartment ap = new Apartment("Bivor Kumar"); //object
		
		//setting apartment with their slot
		ap.setApartment("Krishna Apartment,101",1 );
		ap.setApartment("Square Apartment,410",2 );
		ap.setApartment("virndaqvan Villa,121",3 );
		ap.setApartment("Kumar Enclave,119",4 );
		
		System.out.println(ap);
		
		System.out.println("****************************");
		
		//getting the number of aapartment the owner owns
		System.out.println(ap.getOwner()+"has"+ap.countApartments()+"apartments");
		//getting the information of apartment according to their slots
		System.out.println("Apartment 3:"+ap.getApartment(2));
		
		System.out.println("******************************");
		ap.reorganizeApartments(); //reorganization of apartments
		
		System.out.println(ap);

	}

}
