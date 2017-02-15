package edu.ucsd.cs110.temperature;

/**
 * Created by YOGA on 2017/2/15.
 */
public abstract class Temperature {
    private final float value;

    public Temperature(float v)
    {
        value = v;
    }
    public final float getValue()
    {
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}
