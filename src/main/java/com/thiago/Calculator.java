package com.thiago;

/*
   * 1) The algorithm will tell the farmer what action should be taken based on
   * the Soil Type and the Moisture Level as input.
   * 2) The algorithm only accepts three types of soil (Clay, Loamy or Sandy) and
   * the moisture level must be between 0 (zero) and 100 (one hundred), accepting
   * decimal numbers (6.32, for example).
   */

public class Calculator {
    public String soilMoistureCalculator(String soilType, double moistureLevel) {
        
        String soilTypeFormatted = soilType.toLowerCase();
        
        if (moistureLevel < 0 || moistureLevel > 100) {
            
            if (!(soilTypeFormatted.equals("clay") || soilTypeFormatted.equals("loamy") || soilTypeFormatted.equals("sandy"))) {
                return "Please, insert a number equal or between 0 and 100 AND a valid Soil Type: Clay, Loamy or Sandy";
            } else {
                return "Please, insert a number equal or between 0 and 100";
            }
            
            
        } 
        
        else {
            
            if (soilTypeFormatted.equals("clay")) {
                
                if (moistureLevel >= 80) {
                    return "No Irrigation Needed";
                }
                
                else if (moistureLevel >= 60) {
                    return "Irrigation to be Applied";
                }
                
                else {
                    return "Dangerously Low Soil Moisture";
                }
                
            } 
            
            else if (soilTypeFormatted.equals("loamy")) {
                
                if (moistureLevel >= 88) {
                    return "No Irrigation Needed";
                }
                
                else if (moistureLevel >= 70) {
                    return "Irrigation to be Applied";
                }
                
                else {
                    return "Dangerously Low Soil Moisture";
                }
            }
            
            else if(soilTypeFormatted.equals("sandy")) {
                if (moistureLevel >= 90) {
                    return "No Irrigation Needed";
                }
                
                else if (moistureLevel >= 80) {
                    return "Irrigation to be Applied";
                }
                
                else {
                    return "Dangerously Low Soil Moisture";
                }
            }
            
            else {
                return "Please, insert a valid Soil Type: Clay, Loamy or Sandy";
            }
        
        }
        
    }
}
