/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dz_1_10;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Dz_1_10 {

     public static void main(String[] args) {
        System.out.print("Нехаев Глеб РИБО-01-22 вариант 2 ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к каталогу для поиска файлов: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Введите расширение файла для поиска: ");
        String extension = scanner.nextLine();

        FileSearcher fileSearcher = new FileSearcher(directoryPath, extension);
        fileSearcher.searchFiles();

        scanner.close();
    }
}
