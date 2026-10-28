package com.whoop.domain.exception;

/* JADX INFO: loaded from: classes8.dex */
public class StrapNotReadyException extends RuntimeException {
    public StrapNotReadyException() {
        super("Strap is not in the READY state");
    }
}
