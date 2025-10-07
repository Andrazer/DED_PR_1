package edu.uoc.ds.adt;

import edu.uoc.ds.adt.model.WeatherStationData;
import edu.uoc.ds.adt.model.WeatherStationDataSummaryItem;
import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;
import edu.uoc.ds.traversal.Iterator;

public class PR1WeatherStationDataQueue {

    // Crea y gestiona la cola con los objetos creados

    private Queue<WeatherStationData> queue;

    public PR1WeatherStationDataQueue(int size) {

        this.queue = new QueueArrayImpl<>(size);
    }

    public Queue<WeatherStationData> getQueue() {

        return this.queue;
    }

    public void add(WeatherStationData data) {
        this.queue.add(data);
    }

    public double getMeanPrecipitation() {

        // Calcula la media de las precipitaciones

        if (queue.isEmpty()) return 0;

        Iterator<WeatherStationData> it = queue.values();
        double total = 0;
        int count = 0;

        while (it.hasNext()) {

            WeatherStationData data = it.next();
            total = total + data.getPrecipitation();
            count = count + 1;
        }

        return Math.round(total/count);
    }

    public double getMeanAvgAirTemperature() {

        // Calcula la media de la temperatura del aire

        if (queue.isEmpty()) return 0;

        Iterator<WeatherStationData> it = queue.values();
        double total = 0;
        int count = 0;

        while (it.hasNext()) {

            WeatherStationData data = it.next();
            total = total + data.getAvgAirTemperature();
            count = count + 1;
        }

        return Math.round(total/count);
    }

    public WeatherStationDataSummaryItem getWeatherStationDataSumaryItem(String province) {

        // Devuelve un objeto de una provincia determinada con las medias calculadas

        return new WeatherStationDataSummaryItem(province, getMeanPrecipitation(), getMeanAvgAirTemperature(), queue.size());
    }
}
