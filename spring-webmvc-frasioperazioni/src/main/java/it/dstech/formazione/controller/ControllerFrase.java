package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerFrase {

	@RequestMapping(value = "/testChiamata" , method = RequestMethod.POST )
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
	      
		int vocaliTrovate=trovaVocali(testo);
		int consonantiTrovate=trovaConsonanti(testo);
		int frasiTrovate=trovaNumeroFrasi(testo);
		testo="Frase inserita "+" ' "+testo+" ' "+"  Il numero di vocali è: "+vocaliTrovate+" il numero di consonanti è: "+consonantiTrovate+" il numero di frasi è "+frasiTrovate;
		
		return new ModelAndView("risultato", "testo", testo);
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




