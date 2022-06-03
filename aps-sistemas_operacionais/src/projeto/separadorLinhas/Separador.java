package projeto.separadorLinhas;

import java.util.ArrayList;
import java.util.List;

public class Separador {

    public List<Integer> separar(String linhaArquivo) throws Exception{

        List<String>numerosSeparados = List.of(linhaArquivo.split(";"));

        List<Integer> numero = converterStringParaInteger(numerosSeparados);

        return numero;
    }

    public List<Integer> converterStringParaInteger(List<String> numerosSeparados) {

        List<Integer> listaNumero = new ArrayList<>();

        for (String numero : numerosSeparados) {
            try{
                listaNumero.add(Integer.parseInt(numero));
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }

        return listaNumero;
    }
}
