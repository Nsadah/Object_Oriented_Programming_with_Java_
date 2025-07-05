/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aq_monitoring.question_3;

/**
 *
 * @author micheal
 */
public class CountHazardousDays {
    public static int count(int[] readings) {
        int count = 0;
        for (int reading : readings) {
            if (reading > 200) {
                count++;
            }
        }
        return count;
    }
}
