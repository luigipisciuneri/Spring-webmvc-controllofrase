package it.dstech.formazione.model;

public class OperazioniFrase {
	private String frase;

	public OperazioniFrase(String frase) {
		this.frase = frase;
	}
	
	public static  int trovaVocali(String frase) {
		int contaVocali=0;		
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)=='a' ||frase.charAt(i)=='e' || frase.charAt(i)=='i' ||frase.charAt(i)=='o' ||frase.charAt(i)=='u') {
				contaVocali=contaVocali+1;
			}
			
		}
		
		return contaVocali;		
	}
	
	
	
	public static  int trovaConsonanti(String frase) {
		int contaConsonanti=0;
		int vocali=0;
		
		for(int j=0; j<frase.length(); j++) {
			if(frase.charAt(j)=='a' ||frase.charAt(j)=='e' || frase.charAt(j)=='i' ||frase.charAt(j)=='o' ||frase.charAt(j)=='u'||frase.charAt(j)==' ') {
				vocali=vocali+1;
			}else contaConsonanti=contaConsonanti+1;
			
		}
		
		return contaConsonanti;		
	}
	
	public static  int trovaNumeroFrasi(String frase) {
		int contaFrasi=0;
		
		for(int j=0; j<frase.length(); j++) {
			if(frase.charAt(j)==' ') {
				contaFrasi=contaFrasi+1;
			}
			
		}
		contaFrasi=contaFrasi+1;
		return contaFrasi;		
	}


}
