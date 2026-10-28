package p389p0;

import p268k0.AbstractC22086a;

/* JADX INFO: renamed from: p0.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C28526h {

    /* JADX INFO: renamed from: a */
    public final int f115433a;

    /* JADX INFO: renamed from: b */
    public final int f115434b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC28544q f115435c;

    public C28526h(int i13, int i14, InterfaceC28544q interfaceC28544q) {
        this.f115433a = i13;
        this.f115434b = i14;
        this.f115435c = interfaceC28544q;
        if (i13 < 0) {
            AbstractC22086a.m63158a("startIndex should be >= 0");
        }
        if (i14 > 0) {
            return;
        }
        AbstractC22086a.m63158a("size should be > 0");
    }
}
