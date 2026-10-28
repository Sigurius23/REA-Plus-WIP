package com.whoop.domain.exception;

/* JADX INFO: loaded from: classes8.dex */
public class FirmwareMismatchException extends RuntimeException {
    public FirmwareMismatchException() {
        super("Firmware doesn't match the strap and cannot be uploaded");
    }
}
