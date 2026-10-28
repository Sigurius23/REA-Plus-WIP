package io.ktor.utils.p228io.internal;

import io.ktor.utils.p228io.ClosedWriteChannelException;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C19993c {

    /* JADX INFO: renamed from: b */
    public static final C19993c f75045b = new C19993c(null);

    /* JADX INFO: renamed from: a */
    public final Throwable f75046a;

    public C19993c(Throwable th3) {
        this.f75046a = th3;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m55792a() {
        Throwable th3 = this.f75046a;
        return th3 == null ? new ClosedWriteChannelException("The channel was closed") : th3;
    }

    public final String toString() {
        return "Closed[" + m55792a() + ']';
    }
}
