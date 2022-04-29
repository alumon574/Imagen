package ejerciciostema2;

import java.io.*;

import java.util.Locale;

public class TransformaImagen {

    File f = null;

    public TransformaImagen(File fEnt) {
        // Control de existencia del fichero y control de la extensión .bmp (sacar mensajes de error)

        if (fEnt.exists() && fEnt.getName().toLowerCase(Locale.ROOT).endsWith(".bmp")) {
            f = fEnt;
        } else System.out.println("O el archivo no existe o la extension es incorrecta");
    }

    public void transformaNegativo() throws IOException {
        // Transformar a negativo y guardar como *_n.bmp
        FileOutputStream f_out = new FileOutputStream("resources/" + getNombreSinExtension() + "_n.bmp");
        FileInputStream f_in = new FileInputStream(f);
        byte[] color = new byte[54];
        f_in.read(color);
        f_out.write(color);
        int value = 0;
        while (value !=-1){
            value=f_in.read();
            f_out.write(255-value);
        }
    }

    public void transformaOscuro() throws IOException {
        // Transformar a una imagen más oscura y guardar como *_o.bmp
        FileOutputStream f_out = new FileOutputStream("resources/" + getNombreSinExtension() + "_o.bmp");
        FileInputStream f_in = new FileInputStream(f);
        byte[] color = new byte[54];
        f_in.read(color);
        f_out.write(color);
        int value = 0;
        while (value !=-1){
            value=f_in.read();
            f_out.write(value/2);
        }
    }


    public void transformaBlancoNegro() throws IOException {
        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp
        FileOutputStream f_out = new FileOutputStream("resources/" + getNombreSinExtension() + "_bn.bmp");
        FileInputStream f_in = new FileInputStream(f);
        byte[] color = new byte[54];
        f_in.read(color);
        f_out.write(color);
        int rValue = 0;
        int gValue = 0;
        int bValue = 0;
        while (bValue !=-1){
            rValue=f_in.read();
            gValue=f_in.read();
            bValue=f_in.read();
            f_out.write((rValue+gValue+bValue)/3);
            f_out.write((rValue+gValue+bValue)/3);
            f_out.write((rValue+gValue+bValue)/3);
        }

    }

    private String getNombreSinExtension() {
        //Devuelve el nombre del archivo f sin extensión
        String[] nameParts = f.getName().split("\\.bmp");
        return nameParts[0];
    }


}