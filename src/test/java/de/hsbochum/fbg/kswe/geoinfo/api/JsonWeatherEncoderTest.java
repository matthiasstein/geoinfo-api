
package de.hsbochum.fbg.kswe.geoinfo.api;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class JsonWeatherEncoderTest {

    @Test
    public void testEncoding() {
        JsonWeatherEncoder encoder = new JsonWeatherEncoder();
        Weather w = new Weather(new City("Bochum", "Germany"));
        w.setRain(2.1f);
        w.setTemp(22.3f);
        w.setWindSpeed(1.3f);
        JsonNode json = encoder.encode(w);
        
        //validate the JSON
    }
    
}
