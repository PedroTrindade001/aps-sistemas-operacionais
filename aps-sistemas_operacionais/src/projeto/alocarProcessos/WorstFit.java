package projeto.alocarProcessos;

import java.util.Collections;
import java.util.List;

public class WorstFit extends Listar {

	 public void executar(List<Integer> memoriaLivre, List<Integer> processos) {

	        System.out.println();
	        System.out.println("================WORST FIT================");

	        int alocacao[] = new int[processos.size()];

	        for (int i = 0; i < processos.size(); i++)
	            alocacao[i] = -1;

	        for (int i = 0; i < processos.size(); i++) {
	            for (int j = 0; j < memoriaLivre.size(); j++) {
	            		
	                if (memoriaLivre.get(j) == Collections.max(memoriaLivre)) {
	                	
	                    alocacao[i] = j;
	                    memoriaLivre.set(j, memoriaLivre.get(j) - processos.get(i));

	                    break;
	                }
	            }
	        }

	        listar(memoriaLivre, processos, alocacao);
	    }
}

