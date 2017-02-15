package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
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
        float temp = getValue();
        temp *= 1.8;
        temp += 32;
        return new Fahrenheit(temp);
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + getValue() + " C";
    }
}

