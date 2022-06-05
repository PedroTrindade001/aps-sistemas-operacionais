package projeto.alocarProcessos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BestFit extends Listar {

	  public void executar(List<Integer> memoriaLivre, List<Integer> processos) {

	        System.out.println();
	        System.out.println("================BEST FIT================");

	        int alocacao[] = new int[processos.size()];

	        for (int i = 0; i < processos.size(); i++)
	            alocacao[i] = -1;
	        	    
	        for (int i = 0; i < processos.size(); i++) {
	        	
	            for (int j = 0; j < memoriaLivre.size(); j++) {
	            		            	
	            	if (memoriaLivre.get(j) == menorBlocoGrande(memoriaLivre, processos, i)) {
	                	
	                    alocacao[i] = j;
	                    memoriaLivre.set(j, memoriaLivre.get(j) - processos.get(i));

	                    break;
	                }
	            }
	            
	        }

	        listar(memoriaLivre, processos, alocacao);
	    }
	  
	  public Integer menorBlocoGrande(List<Integer> memoriaLivre, List<Integer> processos,int i) {
		  List <Integer> memoriaLivreGrande = new ArrayList<>(); 
		  
		  
		  for (int j = 0; j< memoriaLivre.size();j++) {			  
			  if(memoriaLivre.get(j) >= processos.get(i)) {			  
				  memoriaLivreGrande.add(memoriaLivre.get(j));				  
			  }			  
		  }
		  
		  return Collections.min(memoriaLivreGrande);
	  }
	  
	  
	  
	  
}




