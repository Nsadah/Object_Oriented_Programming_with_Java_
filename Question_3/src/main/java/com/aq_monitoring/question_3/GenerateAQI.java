/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aq_monitoring.question_3;

import java.util.Random;

/**
 *
 * @author micheal
 */

public class GenerateAQI {
    public static int[] generate(int n) {
        int[] readings = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            readings[i] = random.nextInt(300) + 1; // 1 to 300 inclusive
        }
        return readings;
    }
}