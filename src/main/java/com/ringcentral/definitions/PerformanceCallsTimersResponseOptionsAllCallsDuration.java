package com.ringcentral.definitions;


public class PerformanceCallsTimersResponseOptionsAllCallsDuration {
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public PerformanceCallsTimersResponseOptionsAllCallsDuration aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public PerformanceCallsTimersResponseOptionsAllCallsDuration aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}
