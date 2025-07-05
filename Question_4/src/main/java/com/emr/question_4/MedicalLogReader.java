/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emr.question_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author micheal
 */
public class MedicalLogReader {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Use a file chooser dialog to pick the medical log file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select the medical log file");
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File medicalLogFile = fileChooser.getSelectedFile();

                reader = new BufferedReader(new FileReader(medicalLogFile));

                String line;
                System.out.println("Reading medical log file contents:\n");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } else {
                System.out.println("No file selected. Exiting program.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The selected file was not found. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            // Ensure the file reader is closed
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("\nFile reader closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing the file reader: " + e.getMessage());
            }
        }
    }
}