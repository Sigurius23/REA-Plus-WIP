package com.google.crypto.tink.internal;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.b */
/* JADX INFO: loaded from: classes6.dex */
public class C5080b {

    /* JADX INFO: renamed from: a */
    public final long[] f21390a;

    /* JADX INFO: renamed from: b */
    public final long[] f21391b;

    /* JADX INFO: renamed from: c */
    public final long[] f21392c;

    public C5080b(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f21390a = jArr;
        this.f21391b = jArr2;
        this.f21392c = jArr3;
    }

    /* JADX INFO: renamed from: a */
    public final void m15953a(C5080b c5080b, int i13) {
        AbstractC5078a.m15930c(this.f21390a, c5080b.f21390a, i13);
        AbstractC5078a.m15930c(this.f21391b, c5080b.f21391b, i13);
        AbstractC5078a.m15930c(this.f21392c, c5080b.f21392c, i13);
    }

    public C5080b() {
        C5080b c5080b = AbstractC5078a.f21382b;
        this.f21390a = Arrays.copyOf(c5080b.f21390a, 10);
        this.f21391b = Arrays.copyOf(c5080b.f21391b, 10);
        this.f21392c = Arrays.copyOf(c5080b.f21392c, 10);
    }
}
