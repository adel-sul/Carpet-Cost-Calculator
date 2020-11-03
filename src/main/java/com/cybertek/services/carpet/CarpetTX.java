package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;
import java.util.*;
import java.math.BigDecimal;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> unitPrices = new HashMap<>();

    static {
        unitPrices.put(City.AUSTIN, new BigDecimal(3.9));
        unitPrices.put(City.DALLAS, new BigDecimal(4.2));
        unitPrices.put(City.SAN_ANTONIO, new BigDecimal(3.65));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {
        if (!(city == City.AUSTIN || city == City.DALLAS || city == City.SAN_ANTONIO)) {
            throw new NoSuchElementException("INVALID CITY SELECTED!");
        }
        return unitPrices.get(city);
    }
}
