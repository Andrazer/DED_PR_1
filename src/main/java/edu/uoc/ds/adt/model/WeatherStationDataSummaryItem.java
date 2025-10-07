package edu.uoc.ds.adt.model;

public class WeatherStationDataSummaryItem {

    // Crea un objeto de una provincia determinada con los datos metereológicos

    private String province;
    private double accumulatedPrecipitation;
    private double meanAvgAirTemperature;
    private int num;

    public WeatherStationDataSummaryItem(String province, double accumulatedPrecipitation, double meanAvgAirTemperature, int num) {
        this.province = province;
        this.accumulatedPrecipitation = accumulatedPrecipitation;
        this.meanAvgAirTemperature = meanAvgAirTemperature;
        this.num = num;
    }
    public String getProvince() { return province; }

    public double getAccumulatedPrecipitation() { return accumulatedPrecipitation; }

    public double getMeanAvgAirTemperature() { return meanAvgAirTemperature; }

    public int numRows() { return num;}

}
