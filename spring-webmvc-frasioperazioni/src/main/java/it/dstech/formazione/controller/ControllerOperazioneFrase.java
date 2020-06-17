package it.dstech.formazione.controller;

import org.apache.taglibs.standard.lang.jstl.ModulusOperator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.formazione.model.OperazioniFrase;

@Controller
public class ControllerOperazioneFrase {
	
  @RequestMapping(value= "/sceltaAzioneOperazione", method = RequestMethod.POST)
  public ModelAndView scelta(@RequestParam("testo") String testo, @RequestParam("sceltaOperazione") String sceltaOperazione, Model model) {
	 // System.out.println("testo= "+testo);
	 // System.out.println("sceltaOperazione="+sceltaOperazione);
	  ModelAndView prossimaPaginaJsp=new ModelAndView();
	  prossimaPaginaJsp.setViewName("risultato");
	  prossimaPaginaJsp.addObject("testo", testo);
	  prossimaPaginaJsp.addObject("Operazione", testo);
	  OperazioniFrase of=new OperazioniFrase(testo);
	  
	  if("trovaVocali".equals(sceltaOperazione)) {
		  prossimaPaginaJsp.addObject("risultato", of.trovaVocali(testo) );
	  }else if("trovaConsonanti".equals(sceltaOperazione)) {
		  prossimaPaginaJsp.addObject("risultato", of.trovaConsonanti(testo));
	  }else {
		  prossimaPaginaJsp.addObject("risultato", of.trovaNumeroFrasi(testo));
	  }
	  
	  return prossimaPaginaJsp;
  }
 }
