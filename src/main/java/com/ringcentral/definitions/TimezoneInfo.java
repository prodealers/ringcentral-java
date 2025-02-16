package com.ringcentral.definitions;


/**
 * Extension timezone information
 */
public class TimezoneInfo {
    /**
     * Internal identifier of a timezone
     */
    public String id;
    /**
     * Canonical URI of a timezone
     */
    public String uri;
    /**
     * Short name of a timezone
     */
    public String name;
    /**
     * Meaningful description of the timezone
     */
    public String description;
    /**
     *
     */
    public String bias;

    public TimezoneInfo id(String id) {
        this.id = id;
        return this;
    }

    public TimezoneInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public TimezoneInfo name(String name) {
        this.name = name;
        return this;
    }

    public TimezoneInfo description(String description) {
        this.description = description;
        return this;
    }

    public TimezoneInfo bias(String bias) {
        this.bias = bias;
        return this;
    }
}
