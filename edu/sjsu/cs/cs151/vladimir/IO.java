package edu.sjsu.cs.cs151.vladimir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.PrintWriter;

public class IO {

    public static String read(String name) throws IOException, ClassNotFoundException {
        String line = "";
        String text = "";
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(new File(name))));

            while ((line = buffer.readLine()) != null) {
                text += line;
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return text;
    }

    public static void write(String filename) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(filename, "UTF-8");
    }
}