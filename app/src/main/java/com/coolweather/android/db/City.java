package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 李沁 on 2017/12/22.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int citycody;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCitycody() {
        return citycody;
    }

    public void setCitycody(int citycody) {
        this.citycody = citycody;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

