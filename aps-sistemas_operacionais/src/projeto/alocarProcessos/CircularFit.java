package projeto.alocarProcessos;

import java.util.List;

public class CircularFit extends Listar {

    public void executar(List<Integer> memoriaLivre, List<Integer> processos) {

        System.out.println();
        System.out.println("================CIRCULAR FIT================");

        int alocacao[] = new int[processos.size()];
        int anterior=0;
        int n=0;
        
        for (int i = 0; i < processos.size(); i++)
            alocacao[i] = -1;

        
        
        for (int i = 0; i < processos.size(); i++) {
        	n=0;
            for (int j = anterior; j < memoriaLivre.size(); j++) {         
            	
            	if (n < memoriaLivre.size() && j == memoriaLivre.size()) {
            		j=0;
            	}            
                if (memoriaLivre.get(j) >= processos.get(i)) {
                	
                    alocacao[i] = j;
                    memoriaLivre.set(j, memoriaLivre.get(j) - processos.get(i));
                    if(j==(memoriaLivre.size()-1)) {
                    	anterior =0;
                    }else
                    	anterior =j+1;
                    n=0;
                    
                    break;                  
                }
                
                n ++;
            }
        }

        listar(memoriaLivre, processos, alocacao);
    }

}
