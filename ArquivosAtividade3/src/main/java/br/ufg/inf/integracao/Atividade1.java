package br.ufg.inf.integracao;

import java.io.*;

/**
 * Classe com o intuito de realizar a atividade número 1 do tópico 3 da matéria Integração de Aplicações, com a função
 * de ler um arquivo recebido como parâmetro no formato CSV e conventer para um arquivo XML com o mesmo nome, e com
 * tags específicas.
 * @author Rodrigo Aguiar
 * @version 1.0
 */
public class Atividade1 {

    /**
     * Responsável pela chamada das funções de leitura de arquivo .csv e de criação de arquivo .xml. Além disso,
     * responsável por manter o leitor de buffer.
     * @param args Arquivo .csv a ser convertido em .xml com o mesmo nome.
     * @throws IOException Gerada quando não há entrada de arquivo na função.
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(args[0]));

        String dadosEmXML = preencheXML(args, br);
        criaArquivoXML(dadosEmXML, args[0].substring(0, args[0].length() - 3) + "xml");

        br.close();
    }

    /**
     * Preenche uma String com todos os dados vindos do .csv convertidos para .xml.
     * @param args Vetor de strings criado com a leitura de um arquivo .csv na função main.
     * @param br Leitor responsável por caminhar no arquivo .csv.
     * @return String com todos os dados no modelo .xml prontos a serem inseridos em um arquivo .xml.
     * @throws IOException Gerada quando o buffer não consegue acessar conteúdo para ler
     */
    public static String preencheXML(String [] args, BufferedReader br) throws IOException {

        String divisor = ";";

        String dadosEmXML, dadosAluno;

        dadosEmXML = "<aluno>\n";

        while((dadosAluno = br.readLine()) != null) {

            String[] dadoUnitario = dadosAluno.split(divisor);

            dadosEmXML += "<aluno>\n";
            dadosEmXML += "<nome>" + dadoUnitario[0] + "</nome>\n";
            dadosEmXML += "<email>" + dadoUnitario[1] + "</email>\n";
            dadosEmXML += "</aluno>\n";
        }
        dadosEmXML += "</aluno>";

        return dadosEmXML;
    }

    /**
     * Cria um arquivo .xml a partir de uma string com o conteúdo e uma string com o nome do arquivo a ser gerado.
     * @param dadosEmXML String com o conteúdo a ser produzido.
     * @param nomeDoArquivo Nome do arquivo a ser gerado.
     * @throws IOException Excessão gerada quando a String com o conteúdo não possui dados a serem inseridos.
     */
    public static void criaArquivoXML(String dadosEmXML, String nomeDoArquivo) throws IOException {
        FileOutputStream fos = new FileOutputStream(nomeDoArquivo);
        fos.write(dadosEmXML.getBytes());
        fos.close();
    }
}
