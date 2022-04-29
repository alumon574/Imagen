package ejerciciostema2;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
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
            FileOutputStream f_out= new FileOutputStream("resources/fichero_n.bmp");
    }

    public void transformaOscuro() throws IOException {

        // Transformar a una imagen más oscura y guardar como *_o.bmp


    }


    public void transformaBlancoNegro() throws IOException {

        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp

    }

    private String getNombreSinExtension() {

        //Devuelve el nombre del archivo f sin extensión

        return null;
    }


}