package com.ridehub.common.kafka.handler;

public interface EventHandler<T> {
    String getEventName(); // e.g. "postReel"

    void handle(T payload);
}
