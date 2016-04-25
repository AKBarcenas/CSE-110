package edu.ucsd.cs110.temperature;

import com.sun.xml.internal.org.jvnet.fastinfoset.sax.FastInfosetReader;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue() * 9 / 5 + 32);
    }


    public String toString()
        {
            // TODO: Complete this method
            return this.getValue() + " C";
        }
}
