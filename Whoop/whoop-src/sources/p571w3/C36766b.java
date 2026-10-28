package p571w3;

import p000.AbstractC30802r;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17922y0;
import p208i2.C17919x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C36766b implements InterfaceC36779o {

    /* JADX INFO: renamed from: a */
    public final AbstractC17922y0 f157333a;

    /* JADX INFO: renamed from: b */
    public final float f157334b;

    public C36766b(AbstractC17922y0 abstractC17922y0, float f13) {
        this.f157333a = abstractC17922y0;
        this.f157334b = f13;
    }

    @Override // p571w3.InterfaceC36779o
    /* JADX INFO: renamed from: a */
    public final float mo117874a() {
        return this.f157334b;
    }

    @Override // p571w3.InterfaceC36779o
    /* JADX INFO: renamed from: b */
    public final long mo117875b() {
        int i13 = C17919x.f69638o;
        return C17919x.f69637n;
    }

    @Override // p571w3.InterfaceC36779o
    /* JADX INFO: renamed from: c */
    public final AbstractC17911t mo117876c() {
        return this.f157333a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36766b)) {
            return false;
        }
        C36766b c36766b = (C36766b) obj;
        return AbstractC22676k.m65745e(this.f157333a, c36766b.f157333a) && Float.compare(this.f157334b, c36766b.f157334b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f157334b) + (this.f157333a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BrushStyle(value=");
        sb4.append(this.f157333a);
        sb4.append(", alpha=");
        return AbstractC30802r.m94763l(sb4, this.f157334b, ')');
    }
}
