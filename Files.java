/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Files {
    public static void main(String [] args) {
        String fileName = "temp.txt";
        String line = null;
        try {       
            
             FileWriter fileWriter =new FileWriter(fileName,true);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);

            bufferedWriter.write("Helvyguffyt");
            bufferedWriter.write(" svyhvdsj");
            bufferedWriter.newLine();
            bufferedWriter.write("edfeEFC");
            bufferedWriter.write(" EFS.");
            bufferedWriter.newLine();
            bufferedWriter.close();
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                 
                   }
    }
}

