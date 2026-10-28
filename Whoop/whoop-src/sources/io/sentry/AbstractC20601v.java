package io.sentry;

import java.io.File;

/* JADX INFO: renamed from: io.sentry.v */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20601v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20308d1 f77110a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20602v0 f77111b;

    /* JADX INFO: renamed from: c */
    public final long f77112c;

    /* JADX INFO: renamed from: d */
    public final C20396j7 f77113d;

    public AbstractC20601v(InterfaceC20308d1 interfaceC20308d1, InterfaceC20602v0 interfaceC20602v0, long j7, int i13) {
        this.f77110a = interfaceC20308d1;
        this.f77111b = interfaceC20602v0;
        this.f77112c = j7;
        this.f77113d = new C20396j7(new C20336g(i13));
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo55887a(String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo55888b(File file, C20337g0 c20337g0);
}
