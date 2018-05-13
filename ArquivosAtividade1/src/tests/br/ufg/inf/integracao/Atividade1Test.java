package br.ufg.inf.integracao;

import org.junit.Test;
import sun.applet.Main;

import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class Atividade1Test {
    Atividade1 atividade1 = new Atividade1();

    @Test
    public void mainSemArquivo() throws Exception{
        System.out.println("------------------------------------------");
        //teste sem inserção de arquivo
        System.out.println("Teste sem inserção de arquivo\n");
        atividade1.main(new String[] {});
    }

    @Test
    public void mainComString() throws Exception{
        System.out.println("------------------------------------------");
        //teste com inserção de string, mas não de arquivo
        System.out.println("Teste com inserção de string ao invés de arquivo\n");
        atividade1.main(new String[] {"teste"});
    }

    @Test
    public void mainComArquivo() throws Exception{
        System.out.println("------------------------------------------");
        //teste com inserção de arquivo
        System.out.println("Teste com inserção de arquivo\n");
        atividade1.main(new String[]{"testeAtividade1.txt"});
    }

    @Test
    public void capturarBytes() throws Exception{
        System.out.println("------------------------------------------");
        System.out.println("Teste de comparação de int com a leitura gerada pelo capturaBytes");
        int i = 32;
        byte[] data = new byte[4];
        data[0] = (byte) (i >> 24);
        data[1] = (byte) (i >> 16);
        data[2] = (byte) (i >> 8);
        data[3] = (byte) (i);

        StringBuilder bytesTeste = new StringBuilder();

        for (int j = 0; j < 4; j++) {
            bytesTeste.append(String.format("%02X ", data[j]));
        }

        assertEquals(bytesTeste.toString(), atividade1.capturarBytes(data));
    }

}