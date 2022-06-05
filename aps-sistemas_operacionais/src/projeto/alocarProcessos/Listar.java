package projeto.alocarProcessos;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Listar {

    public void listar (List<Integer> memoriaLivre, List<Integer> processos,  int alocacao[]){
        System.out.println("\nProcesso \tTamanho Processo\tBloco Alocado\t");
        for (int i = 0; i < processos.size(); i++)
        {
            System.out.print("   P" + (i+1) + "\t\t\t\t" +
                    processos.get(i) + "\t\t");
            if (alocacao[i] != -1) {
                alocacao[i] += 1;
                System.out.print("  " + alocacao[i]);
            }
            else
                System.out.print("Não Alocado!");
            System.out.println();
        }
        System.out.println("\nBloco \tMemoria Disponivel");
        for (int i = 0; i < memoriaLivre.size(); i++){
            System.out.print(" B" + (i+1) + "\t\t\t\t" +
                    memoriaLivre.get(i));
            System.out.println();
        }
        System.out.println("\nMedia \tMaior Bloco Disponivel \tMenor Bloco Disponivel");
        Optional<Integer> min = memoriaLivre.stream().min(Comparator.naturalOrder());
        Optional<Integer> max = memoriaLivre.stream().max(Comparator.naturalOrder());
        double media = 0;
        for (int numero : memoriaLivre){
            media += numero;
        }
        System.out.println(media/memoriaLivre.size() + "\t\t\t" +
                max.get() + "\t\t\t\t" + min.get());
    }

}

