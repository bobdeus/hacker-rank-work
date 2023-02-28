import org.example.AMPMToMilitaryTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HackerRankTests {
    @Test
    public void testMilitaryTime() {
        assertEquals("13:01:00", AMPMToMilitaryTime.calculate("1:01:00PM"));
        assertEquals("12:01:59", AMPMToMilitaryTime.calculate("12:01:59PM"));
        assertEquals("19:59:30", AMPMToMilitaryTime.calculate("7:59:30PM"));
        assertEquals("01:00:00", AMPMToMilitaryTime.calculate("01:00:00AM"));
        assertEquals("00:00:00", AMPMToMilitaryTime.calculate("12:00:00AM"));
        assertEquals("00:20:59", AMPMToMilitaryTime.calculate("12:20:59AM"));
        assertEquals("01:01:45", AMPMToMilitaryTime.calculate("1:01:45AM"));
        assertEquals("11:01:09", AMPMToMilitaryTime.calculate("11:01:09AM"));
    }
}
