package p040c0;

import p077d0.InterfaceC11337c0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c0.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3742g1 {

    /* JADX INFO: renamed from: a */
    public final float f15309a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11337c0 f15310b;

    public C3742g1(float f13, InterfaceC11337c0 interfaceC11337c0) {
        this.f15309a = f13;
        this.f15310b = interfaceC11337c0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3742g1)) {
            return false;
        }
        C3742g1 c3742g1 = (C3742g1) obj;
        return Float.compare(this.f15309a, c3742g1.f15309a) == 0 && AbstractC22676k.m65745e(this.f15310b, c3742g1.f15310b);
    }

    public final int hashCode() {
        return this.f15310b.hashCode() + (Float.hashCode(this.f15309a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f15309a + ", animationSpec=" + this.f15310b + ')';
    }
}
