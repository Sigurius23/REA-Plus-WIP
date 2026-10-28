package p240j2;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21222c {

    /* JADX INFO: renamed from: a */
    public final String f81016a;

    /* JADX INFO: renamed from: b */
    public final long f81017b;

    /* JADX INFO: renamed from: c */
    public final int f81018c;

    public AbstractC21222c(int i13, String str, long j7) {
        this.f81016a = str;
        this.f81017b = j7;
        this.f81018c = i13;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i13 < -1 || i13 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo59542a(int i13);

    /* JADX INFO: renamed from: b */
    public abstract float mo59543b(int i13);

    /* JADX INFO: renamed from: c */
    public boolean mo59544c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo59545d(float f13, float f14, float f15);

    /* JADX INFO: renamed from: e */
    public abstract float mo59546e(float f13, float f14, float f15);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC21222c abstractC21222c = (AbstractC21222c) obj;
        if (this.f81018c == abstractC21222c.f81018c && AbstractC22676k.m65745e(this.f81016a, abstractC21222c.f81016a)) {
            return AbstractC21221b.m59540a(this.f81017b, abstractC21222c.f81017b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo59547f(float f13, float f14, float f15, float f16, AbstractC21222c abstractC21222c);

    public int hashCode() {
        int iHashCode = this.f81016a.hashCode() * 31;
        int i13 = AbstractC21221b.f81015e;
        return AbstractC11266d.m30451e(iHashCode, this.f81017b, 31) + this.f81018c;
    }

    public final String toString() {
        return this.f81016a + " (id=" + this.f81018c + ", model=" + ((Object) AbstractC21221b.m59541b(this.f81017b)) + ')';
    }
}
