package p180h0;

import p077d0.C11362i1;

/* JADX INFO: renamed from: h0.s */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC16450s {

    /* JADX INFO: renamed from: a */
    public static final C16445r f63207a = C16445r.f63186a;

    /* JADX INFO: renamed from: b */
    static C11362i1 m46635b() {
        f63207a.getClass();
        return C16445r.f63187b;
    }

    /* JADX INFO: renamed from: a */
    default float mo46636a(float f13, float f14, float f15) {
        f63207a.getClass();
        float f16 = f14 + f13;
        if ((f13 >= 0.0f && f16 <= f15) || (f13 < 0.0f && f16 > f15)) {
            return 0.0f;
        }
        float f17 = f16 - f15;
        return Math.abs(f13) < Math.abs(f17) ? f13 : f17;
    }
}
