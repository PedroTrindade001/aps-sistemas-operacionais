package projeto;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import projeto.alocarProcessos.FirstFit;
import projeto.separadorLinhas.Separador;

public class AppStart {
    public static void main(String[] args) throws Exception {

        Separador separador = new Separador();
        FirstFit firstFit = new FirstFit();

        Path path = Paths.get("src/projeto/resource/entrada.txt");

        List<String> linhasArquivo = Files.readAllLines(path);

        List<Integer> memoriaLivre = separador.separar(linhasArquivo.get(0));
        List<Integer> processos = separador.separar(linhasArquivo.get(1));

        firstFit.executar(memoriaLivre, processos);


    }
}
