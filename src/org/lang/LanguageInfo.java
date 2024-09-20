package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("South Indian people speaks tamil...");
  }
	public void englishLanguage() {
		System.out.println("all are speaks in English...");
	}
	public void hindiLanguage() {
		System.out.println("North Indian people speaks Hindhi...");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		l.northIndia();
		l.southIndia();
  }
}
