package com.chicktech.swatson.weathercookie;

/**
 * Created by swatson on 1/10/16.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPrecipChance() {
        return mPrecipChance;
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    private String summary;

    public int getIconResId() {
        int iconResId = R.drawable.clear_day;

        if (mIcon.equals("clear-day")) {
            iconResId = R.drawable.clear_day;
        } else if (mIcon.equals("clear-night")) {
            iconResId = R.drawable.clear_night;
        } else if (mIcon.equals("rain")) {
            iconResId = R.drawable.rain;
        } else if (mIcon.equals("snow")) {
            iconResId = R.drawable.snow;
        } else if (mIcon.equals("sleet")) {
            iconResId = R.drawable.sleet;
        } else if (mIcon.equals("wind")) {
            iconResId = R.drawable.wind;
        } else if (mIcon.equals("fog")) {
            iconResId = R.drawable.fog;
        } else if (mIcon.equals("cloudy")) {
            iconResId = R.drawable.cloudy;
        } else if (mIcon.equals("partly-cloudy-day")) {
            iconResId = R.drawable.partly_cloudy;
        } else if (mIcon.equals("partly-cloudy-night")) {
            iconResId = R.drawable.cloudy_night;
        }

        return iconResId;
    }
}
