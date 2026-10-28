package com.mapbox.maps.exception;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lcom/mapbox/maps/exception/WorkerThreadException;", "Ljava/lang/RuntimeException;", "()V", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class WorkerThreadException extends RuntimeException {
    public WorkerThreadException() {
        super("The exception that is thrown when an application attempts to \nperform a map operation on a worker thread.");
    }
}
