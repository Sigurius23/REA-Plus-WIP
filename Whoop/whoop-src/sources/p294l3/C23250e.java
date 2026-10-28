package p294l3;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p448r3.AbstractC30895a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C23250e {

    /* JADX INFO: renamed from: a */
    public final Object f92125a;

    /* JADX INFO: renamed from: b */
    public final int f92126b;

    /* JADX INFO: renamed from: c */
    public final int f92127c;

    /* JADX INFO: renamed from: d */
    public final String f92128d;

    public C23250e(int i13, int i14, Object obj, String str) {
        this.f92125a = obj;
        this.f92126b = i13;
        this.f92127c = i14;
        this.f92128d = str;
        if (i13 <= i14) {
            return;
        }
        AbstractC30895a.m95015a("Reversed range is not supported");
    }

    /* JADX INFO: renamed from: a */
    public static C23250e m67313a(C23250e c23250e, InterfaceC23244b interfaceC23244b, int i13, int i14) {
        Object obj = interfaceC23244b;
        if ((i14 & 1) != 0) {
            obj = c23250e.f92125a;
        }
        int i15 = c23250e.f92126b;
        if ((i14 & 4) != 0) {
            i13 = c23250e.f92127c;
        }
        String str = c23250e.f92128d;
        c23250e.getClass();
        return new C23250e(i15, i13, obj, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23250e)) {
            return false;
        }
        C23250e c23250e = (C23250e) obj;
        return AbstractC22676k.m65745e(this.f92125a, c23250e.f92125a) && this.f92126b == c23250e.f92126b && this.f92127c == c23250e.f92127c && AbstractC22676k.m65745e(this.f92128d, c23250e.f92128d);
    }

    public final int hashCode() {
        Object obj = this.f92125a;
        return this.f92128d.hashCode() + AbstractC11266d.m30448b(this.f92127c, AbstractC11266d.m30448b(this.f92126b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Range(item=");
        sb4.append(this.f92125a);
        sb4.append(", start=");
        sb4.append(this.f92126b);
        sb4.append(", end=");
        sb4.append(this.f92127c);
        sb4.append(", tag=");
        return AbstractC25012a.m73377j(sb4, this.f92128d, ')');
    }

    public C23250e(Object obj, int i13, int i14) {
        this(i13, i14, obj, "");
    }
}
