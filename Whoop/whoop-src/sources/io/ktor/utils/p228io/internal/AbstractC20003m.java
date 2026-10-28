package io.ktor.utils.p228io.internal;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20003m {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f75063a;

    /* JADX INFO: renamed from: b */
    public final C20005o f75064b;

    public AbstractC20003m(ByteBuffer byteBuffer, C20005o c20005o) {
        this.f75063a = byteBuffer;
        this.f75064b = c20005o;
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer mo55801a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    /* JADX INFO: renamed from: b */
    public ByteBuffer mo55802b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    /* JADX INFO: renamed from: c */
    public AbstractC20003m mo55799c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    /* JADX INFO: renamed from: d */
    public AbstractC20003m mo55800d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    /* JADX INFO: renamed from: e */
    public AbstractC20003m mo55803e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    /* JADX INFO: renamed from: f */
    public AbstractC20003m mo55804f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }
}
