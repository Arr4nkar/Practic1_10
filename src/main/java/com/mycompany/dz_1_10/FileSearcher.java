/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_1_10;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author gnekh
 */
public class FileSearcher {
    private String directoryPath;
    private String extension;

    public FileSearcher(String directoryPath, String extension) {
        this.directoryPath = directoryPath;
        this.extension = extension;
    }

    public void searchFiles() {
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Указанный каталог не существует или не является каталогом.");
            return;
        }

        System.out.println("Поиск файлов с расширением " + extension + " в каталоге " + directoryPath + ":");

        try {
            searchFiles(directory);
        } catch (Exception e) {
            System.out.println("Ошибка при выполнении поиска файлов: " + e.getMessage());
        }
    }

    private void searchFiles(File directory) {
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }

        Arrays.sort(files, Comparator.comparing(File::isDirectory).reversed().thenComparing(File::getName));

        for (File file : files) {
            if (file.isDirectory()) {
                searchFiles(file);
            } else if (file.getName().toLowerCase().endsWith(extension.toLowerCase())) {
                System.out.println(file.getAbsolutePath() + " " + file.length());
            }
        }
    }
}
    
