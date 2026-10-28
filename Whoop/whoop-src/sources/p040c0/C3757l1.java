package p040c0;

import p000.AbstractC11266d;
import p077d0.InterfaceC11337c0;
import p208i2.C17881e1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c0.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3757l1 {

    /* JADX INFO: renamed from: a */
    public final float f15353a;

    /* JADX INFO: renamed from: b */
    public final long f15354b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11337c0 f15355c;

    public C3757l1(float f13, long j7, InterfaceC11337c0 interfaceC11337c0) {
        this.f15353a = f13;
        this.f15354b = j7;
        this.f15355c = interfaceC11337c0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3757l1)) {
            return false;
        }
        C3757l1 c3757l1 = (C3757l1) obj;
        return Float.compare(this.f15353a, c3757l1.f15353a) == 0 && C17881e1.m51436a(this.f15354b, c3757l1.f15354b) && AbstractC22676k.m65745e(this.f15355c, c3757l1.f15355c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f15353a) * 31;
        int i13 = C17881e1.f69567c;
        return this.f15355c.hashCode() + AbstractC11266d.m30451e(iHashCode, this.f15354b, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f15353a + ", transformOrigin=" + ((Object) C17881e1.m51439d(this.f15354b)) + ", animationSpec=" + this.f15355c + ')';
    }
}
