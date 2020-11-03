package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.*;

@Component
public class CarpetVA implements Carpet {

    private static final Map<City, BigDecimal> unitPrices = new HashMap<>();

    static {
        unitPrices.put(City.ARLINGTON, new BigDecimal(4.75));
        unitPrices.put(City.FAIRFAX, new BigDecimal(5.4));
        unitPrices.put(City.MCLEAN, new BigDecimal(6.1));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {
        if (!(city == City.ARLINGTON || city == City.FAIRFAX || city == City.MCLEAN)) {
            throw new NoSuchElementException("INVALID CITY SELECTED!");
        }
        return unitPrices.get(city);
    }
}
