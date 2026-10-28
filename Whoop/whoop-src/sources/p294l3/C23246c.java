package p294l3;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p448r3.AbstractC30895a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C23246c {

    /* JADX INFO: renamed from: a */
    public final Object f92113a;

    /* JADX INFO: renamed from: b */
    public final int f92114b;

    /* JADX INFO: renamed from: c */
    public int f92115c;

    /* JADX INFO: renamed from: d */
    public final String f92116d;

    public C23246c(int i13, int i14, Object obj, String str) {
        this.f92113a = obj;
        this.f92114b = i13;
        this.f92115c = i14;
        this.f92116d = str;
    }

    /* JADX INFO: renamed from: a */
    public final C23250e m67297a(int i13) {
        int i14 = this.f92115c;
        if (i14 != Integer.MIN_VALUE) {
            i13 = i14;
        }
        if (!(i13 != Integer.MIN_VALUE)) {
            AbstractC30895a.m95017c("Item.end should be set first");
        }
        return new C23250e(this.f92114b, i13, this.f92113a, this.f92116d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23246c)) {
            return false;
        }
        C23246c c23246c = (C23246c) obj;
        return AbstractC22676k.m65745e(this.f92113a, c23246c.f92113a) && this.f92114b == c23246c.f92114b && this.f92115c == c23246c.f92115c && AbstractC22676k.m65745e(this.f92116d, c23246c.f92116d);
    }

    public final int hashCode() {
        Object obj = this.f92113a;
        return this.f92116d.hashCode() + AbstractC11266d.m30448b(this.f92115c, AbstractC11266d.m30448b(this.f92114b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MutableRange(item=");
        sb4.append(this.f92113a);
        sb4.append(", start=");
        sb4.append(this.f92114b);
        sb4.append(", end=");
        sb4.append(this.f92115c);
        sb4.append(", tag=");
        return AbstractC25012a.m73377j(sb4, this.f92116d, ')');
    }

    public /* synthetic */ C23246c(String str, int i13, int i14, int i15, Object obj) {
        this(i13, (i15 & 4) != 0 ? Integer.MIN_VALUE : i14, obj, (i15 & 8) != 0 ? "" : str);
    }
}
