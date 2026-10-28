package p080d4;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: d4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C11652k extends AbstractC11649h {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C11653l f37632H;

    public C11652k(C11653l c11653l) {
        this.f37632H = c11653l;
    }

    @Override // p080d4.AbstractC11649h
    /* JADX INFO: renamed from: h */
    public final String mo31064h() {
        C11650i c11650i = (C11650i) this.f37632H.f37633w.get();
        return c11650i == null ? "Completer object has been garbage collected, future will fail soon" : AbstractC2875y.m8303p(new StringBuilder("tag=["), "]", c11650i.f37628a);
    }
}
