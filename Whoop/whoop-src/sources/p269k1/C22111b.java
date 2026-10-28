package p269k1;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: k1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C22111b {

    /* JADX INFO: renamed from: a */
    public final float f85790a;

    /* JADX INFO: renamed from: b */
    public final float f85791b;

    /* JADX INFO: renamed from: c */
    public final float f85792c;

    /* JADX INFO: renamed from: d */
    public final float f85793d;

    public C22111b(float f13, float f14, float f15, float f16) {
        this.f85790a = f13;
        this.f85791b = f14;
        this.f85792c = f15;
        this.f85793d = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22111b)) {
            return false;
        }
        C22111b c22111b = (C22111b) obj;
        return this.f85790a == c22111b.f85790a && this.f85791b == c22111b.f85791b && this.f85792c == c22111b.f85792c && this.f85793d == c22111b.f85793d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f85793d) + AbstractC11266d.m30447a(this.f85792c, AbstractC11266d.m30447a(this.f85791b, Float.hashCode(this.f85790a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb4.append(this.f85790a);
        sb4.append(", focusedAlpha=");
        sb4.append(this.f85791b);
        sb4.append(", hoveredAlpha=");
        sb4.append(this.f85792c);
        sb4.append(", pressedAlpha=");
        return AbstractC30802r.m94763l(sb4, this.f85793d, ')');
    }
}
