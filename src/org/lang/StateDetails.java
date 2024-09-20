package org.lang;

public class StateDetails {
	 public void southIndia() {
		  System.out.println("South India people celebrates Pongal..");
	  }
	  public void northIndia() {
		  System.out.println("North india people celebrates Diwali.. ");
	  }
	  public static void main(String[] args) {
		  StateDetails s = new StateDetails();
		  s.southIndia();
		  s.northIndia();
	  }
}
