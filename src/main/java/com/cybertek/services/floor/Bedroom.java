package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Bedroom implements Floor {

    @Value("${length}")
    private BigDecimal length;

    @Override
    public BigDecimal getArea() {
        return length.pow(2);
    }
}
