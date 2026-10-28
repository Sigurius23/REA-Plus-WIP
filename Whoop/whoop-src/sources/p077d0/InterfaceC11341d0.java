package p077d0;

import p692zt.C41113q;

/* JADX INFO: renamed from: d0.d0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC11341d0 extends InterfaceC11372l {
    @Override // p077d0.InterfaceC11372l
    /* JADX INFO: renamed from: a */
    default InterfaceC11355g2 mo30534a(C11351f2 c11351f2) {
        return new C41113q(this);
    }

    /* JADX INFO: renamed from: b */
    float mo30535b(float f13, float f14, float f15, long j7);

    /* JADX INFO: renamed from: c */
    default float mo30536c(float f13, float f14, float f15) {
        return mo30535b(f13, f14, f15, mo30537d(f13, f14, f15));
    }

    /* JADX INFO: renamed from: d */
    long mo30537d(float f13, float f14, float f15);

    /* JADX INFO: renamed from: e */
    float mo30538e(float f13, float f14, float f15, long j7);
}
