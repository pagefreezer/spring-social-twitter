package org.springframework.social.twitter.config.converter;

public class ThresholdLimitReachedException extends RuntimeException {
    public ThresholdLimitReachedException() {
        super("The client has exceeded the API Calls threshold");
    }
}