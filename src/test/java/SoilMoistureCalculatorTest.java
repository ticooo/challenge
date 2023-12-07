import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.thiago.Calculator;

public class SoilMoistureCalculatorTest {

    Calculator underTest = new Calculator();

// SUCCESS TESTS

    @Test
    public void clayNoIrrigationNeeded() {

        // GIVEN
        String soilType = "clay";
        double moistureLevel = 80;

        // WHEN
        String result = underTest.soilMoistureCalculator(soilType, moistureLevel);

        // THEN
        String expected = "No Irrigation Needed";
        assertEquals(expected, result);

    }

    @Test
    public void clayIrrigationToBeApplied() {
        // GIVEN
        String soilType = "clay";
        double moistureLevel = 65.28;

        // WHEN
        String result = underTest.soilMoistureCalculator(soilType, moistureLevel);

        // THEN
        String expected = "Irrigation to be Applied";
        assertEquals(expected, result);
        
    }

    @Test
    public void clayDangerouslyLowSoilMoisture() {
        // GIVEN
        String soilType = "clay";
        double moistureLevel = 24.9;

        // WHEN
        String result = underTest.soilMoistureCalculator(soilType, moistureLevel);

        // THEN
        String expected = "Dangerously Low Soil Moisture";
        assertEquals(expected, result);
    }

    @Test
    public void loamyNoIrrigationNeeded() {

        // GIVEN
        String soilType = "loamy";
        double moistureLevel = 89;

        // WHEN
        String result = underTest.soilMoistureCalculator(soilType, moistureLevel);

        // THEN
        String expected = "No Irrigation Needed";
        assertEquals(expected, result);
    }

    @Test
    public void loamyIrrigationToBeApplied() {
        
        // GIVEN
        String soilType = "loamy";
        double moistureLevel = 77.2;

        // WHEN
        String result = underTest.soilMoistureCalculator(soilType, moistureLevel);

        // THEN
        String expected = "Irrigation to be Applied";
        assertEquals(expected, result);
    }

    @Test
    public void loamyDangerouslyLowSoilMoisture() {
        
        // GIVEN
        String soilType = "loamy";
        double moistureLevel = 32;

        // WHEN
        String result = underTest.soilMoistureCalculator(soilType, moistureLevel);

        // THEN
        String expected = "Dangerously Low Soil Moisture";
        assertEquals(expected, result);
    }

    @Test
    public void sandyNoIrrigationNeeded() {
        
        // GIVEN
        String soilType = "sandy";
        double moistureLevel = 92;

        // WHEN
        String result = underTest.soilMoistureCalculator(soilType, moistureLevel);

        // THEN
        String expected = "No Irrigation Needed";
        assertEquals(expected, result);
    }

    @Test
    public void sandyIrrigationToBeApplied() {

        // GIVEN
        String soilType = "sandy";
        double moistureLevel = 85.1;

        // WHEN
        String result = underTest.soilMoistureCalculator(soilType, moistureLevel);

        // THEN
        String expected = "Irrigation to be Applied";
        assertEquals(expected, result);
    }

    @Test
    public void sandyDangerouslyLowSoilMoisture() {
        
        // GIVEN
        String soilType = "sandy";
        double moistureLevel = 66.8;

        // WHEN
        String result = underTest.soilMoistureCalculator(soilType, moistureLevel);

        // THEN
        String expected = "Dangerously Low Soil Moisture";
        assertEquals(expected, result);
    }

// FAILURE TESTS

    @Test
    public void insertInvalidMoistureLevelReturnError() {
        // GIVEN
        String soilType = "clay";
        double moistureLevelBelowZero = -3;
        double moistureLevelAboveOneHundred = 150;

        // WHEN
        String resultBelowZero = underTest.soilMoistureCalculator(soilType, moistureLevelBelowZero);
        String resultAboveOneHundred = underTest.soilMoistureCalculator(soilType, moistureLevelAboveOneHundred);

        // THEN
        String expected = "Please, insert a number equal or between 0 and 100";
        assertEquals(expected, resultBelowZero);
        assertEquals(expected, resultAboveOneHundred);
        
    }

    @Test
    public void insertInvalidSoilTypeReturnError() {
        // GIVEN
        String soilTypeInvalid = "clAAAy";
        String soilTypeSpecialChar = "*-1";
        double moistureLevel = 20;

        // WHEN
        String resultSoilTypeInvalid = underTest.soilMoistureCalculator(soilTypeInvalid, moistureLevel);
        String resultSoilTypeSpecialChar = underTest.soilMoistureCalculator(soilTypeSpecialChar, moistureLevel);

        // THEN
        String expected = "Please, insert a valid Soil Type: Clay, Loamy or Sandy";
        assertEquals(expected, resultSoilTypeInvalid);
        assertEquals(expected, resultSoilTypeSpecialChar);
    }

    @Test
    public void insertInvalidSoilTypeAndMoistureLevelReturnError() {
        // GIVEN
        String soilTypeInvalid = "c l a y";
        double moistureLevelInvalid = 205;

        // WHEN
        String resultInvalidValues = underTest.soilMoistureCalculator(soilTypeInvalid, moistureLevelInvalid);

        // THEN
        String expected = "Please, insert a number equal or between 0 and 100 AND a valid Soil Type: Clay, Loamy or Sandy";
        assertEquals(expected, resultInvalidValues);
    }
}
