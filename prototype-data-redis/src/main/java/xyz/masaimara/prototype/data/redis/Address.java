package xyz.masaimara.prototype.data.redis;

import com.google.common.base.MoreObjects;

public class Address {
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("city", city)
                .add("country", country)
                .toString();
    }
}
