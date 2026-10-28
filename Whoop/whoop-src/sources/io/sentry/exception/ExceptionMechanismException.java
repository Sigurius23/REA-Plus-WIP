package io.sentry.exception;

import io.sentry.protocol.C20490n;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes3.dex */
public final class ExceptionMechanismException extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final C20490n f76325w;

    /* JADX INFO: renamed from: x */
    public final Throwable f76326x;

    /* JADX INFO: renamed from: y */
    public final Thread f76327y;

    /* JADX INFO: renamed from: z */
    public final boolean f76328z;

    public ExceptionMechanismException(C20490n c20490n, Throwable th3, Thread thread, boolean z4) {
        this.f76325w = c20490n;
        AbstractC29125c.m88510S(th3, "Throwable is required.");
        this.f76326x = th3;
        this.f76327y = thread;
        this.f76328z = z4;
    }

    /* JADX INFO: renamed from: a */
    public final C20490n m56485a() {
        return this.f76325w;
    }

    /* JADX INFO: renamed from: b */
    public final Thread m56486b() {
        return this.f76327y;
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m56487c() {
        return this.f76326x;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m56488d() {
        return this.f76328z;
    }

    public ExceptionMechanismException(C20490n c20490n, Throwable th3, Thread thread) {
        this(c20490n, th3, thread, false);
    }
}
