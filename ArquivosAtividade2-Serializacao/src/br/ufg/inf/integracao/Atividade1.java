package br.ufg.inf.integracao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Atividade1 implements Serializable {
    private NotSerializable notSerializable;

    public static void main(String[] args) {
        try {
            TamanhoEmBytes((Serializable) new NotSerializable());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int TamanhoEmBytes(Serializable s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(s);
        oos.close();

        return baos.toByteArray().length;
    }

}
