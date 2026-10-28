package io.sentry.android.core;

import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final Thread f75244w;

    public ApplicationNotResponding(String str) {
        super(str);
        this.f75244w = null;
    }

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        AbstractC29125c.m88510S(thread, "Thread must be provided.");
        this.f75244w = thread;
        setStackTrace(thread.getStackTrace());
    }
}
