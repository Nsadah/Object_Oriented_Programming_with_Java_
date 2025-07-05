/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aq_monitoring.question_3;

/**
 *
 * @author micheal
 */
public class AQIMonitoringMain {
    public static void main(String[] args) {
        int[] aqiReadings = GenerateAQI.generate(30);

        System.out.println("AQI readings for 30 days:");
        for (int reading : aqiReadings) {
            System.out.print(reading + " ");
        }
        System.out.println();

        double median = ComputeMedian.median(aqiReadings);
        System.out.println("Median AQI value: " + median);

        int hazardousCount = CountHazardousDays.count(aqiReadings);
        System.out.println("Number of hazardous days (AQI > 200): " + hazardousCount);
    }
}
