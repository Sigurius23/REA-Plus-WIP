package p392p3;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: p3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C28758a implements InterfaceC28785w {

    /* JADX INFO: renamed from: w */
    public final int f116492w;

    public C28758a(int i13) {
        this.f116492w = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28758a) && this.f116492w == ((C28758a) obj).f116492w;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116492w);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f116492w, ')');
    }
}
