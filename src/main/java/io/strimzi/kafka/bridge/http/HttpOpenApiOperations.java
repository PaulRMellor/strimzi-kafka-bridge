/*
 * Copyright 2018, Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */

package io.strimzi.kafka.bridge.http;

/**
 * OpenAPI operations ids
 */
public enum HttpOpenApiOperations {

    SEND("send"),
    SEND_TO_PARTITION("sendToPartition"),
    CREATE_CONSUMER("createConsumer"),
    DELETE_CONSUMER("deleteConsumer"),
    SUBSCRIBE("subscribe"),
    UNSUBSCRIBE("unsubscribe"),
    ASSIGN("assign"),
    POLL("poll"),
    COMMIT("commit"),
    SEEK("seek"),
    SEEK_TO_BEGINNING("seekToBeginning"),
    SEEK_TO_END("seekToEnd");

    private final String text;

    HttpOpenApiOperations(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
