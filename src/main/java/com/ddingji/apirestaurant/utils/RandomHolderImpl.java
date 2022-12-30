package com.ddingji.apirestaurant.utils;

import java.util.Random;

public class RandomHolderImpl implements RandomHolder{

    private final Random random = new Random(System.currentTimeMillis());

    @Override
    public int getRandomNumber(int bound) {
        return Math.max(random.nextInt(bound), 0);
    }
}
