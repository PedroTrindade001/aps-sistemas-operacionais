package projeto;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import projeto.alocarProcessos.BestFit;
import projeto.alocarProcessos.CircularFit;
import projeto.alocarProcessos.FirstFit;
import projeto.alocarProcessos.WorstFit;
import projeto.separadorLinhas.Separador;

public class AppStart {
    public static void main(String[] args) throws Exception {

        Separador separador = new Separador();
        FirstFit firstFit = new FirstFit();
        BestFit bestFit = new BestFit();
        WorstFit worstFit = new WorstFit();
        CircularFit circularFit = new CircularFit();

        Path path = Paths.get("src/projeto/resource/entrada.txt");

        List<String> linhasArquivo = Files.readAllLines(path);

        List<Integer> memoriaLivre = separador.separar(linhasArquivo.get(0));
        List<Integer> processos = separador.separar(linhasArquivo.get(1));
        List<Integer> memoriaLivre1 = separador.separar(linhasArquivo.get(0));
        List<Integer> processos1 = separador.separar(linhasArquivo.get(1));
        List<Integer> memoriaLivre2 = separador.separar(linhasArquivo.get(0));
        List<Integer> processos2 = separador.separar(linhasArquivo.get(1));
        List<Integer> memoriaLivre3 = separador.separar(linhasArquivo.get(0));
        List<Integer> processos3 = separador.separar(linhasArquivo.get(1));
        
        

        firstFit.executar(memoriaLivre, processos);
        worstFit.executar(memoriaLivre1, processos1);
        circularFit.executar(memoriaLivre2, processos2);
        bestFit.executar(memoriaLivre3, processos3);
    }
}
