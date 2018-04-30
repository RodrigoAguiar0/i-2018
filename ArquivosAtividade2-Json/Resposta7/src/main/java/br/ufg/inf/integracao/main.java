package br.ufg.inf.integracao;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class main {


    public static void main(String[] args) throws IOException {
        //inicio da minha busca na API do git, primeiro perguntando o nome do usuário, e depois capturando o retorno
        String user;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual usuário do git você quer a foto?");
        user = scanner.nextLine();
        URL address = new URL("https://api.github.com/users/" + user);
        InputStream in = address.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder result = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
            result.append(line);
        }
        //utilizando gson para capturar o campo avatar_url, e passar para string
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(result.toString(), JsonObject.class);
        String imagem = jsonObject.get("avatar_url").getAsString();

        //salvando a imagem localmente
        address = new URL(imagem);
        Image image = null;
        image = ImageIO.read(address);
        ImageIO.write((RenderedImage) image, "jpg", new File("imagem.jpg"));
        System.out.println(imagem);
    }
}
