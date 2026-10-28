package no.nordicsemi.android.ble.exception;

import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes5.dex */
public final class RequestFailedException extends Exception {

    /* JADX INFO: renamed from: w */
    public final int f107358w;

    public RequestFailedException(int i13) {
        super(AbstractC2875y.m8295h(i13, "Request failed with status "));
        this.f107358w = i13;
    }
}
