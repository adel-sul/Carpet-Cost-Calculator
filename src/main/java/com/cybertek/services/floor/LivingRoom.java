package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import java.math.BigDecimal;

public class LivingRoom implements Floor {

    @Value("${length}")
    private BigDecimal length;

    @Value("${width}")
    private BigDecimal width;

    @Override
    public BigDecimal getArea() {
        return length.multiply(width);
    }
}
