package p353o0;

import java.util.Collection;
import m83.AbstractC25265s;
import p180h0.EnumC16377d2;
import p389p0.InterfaceC28540o;
import p390p1.C28621h1;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: o0.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C27321e implements InterfaceC28540o {

    /* JADX INFO: renamed from: a */
    public final C27341y f109392a;

    public C27321e(C27341y c27341y) {
        this.f109392a = c27341y;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: a */
    public final int mo77523a() {
        int i13;
        C27341y c27341y = this.f109392a;
        int i14 = 0;
        if (c27341y.m82482g().f109439m.isEmpty()) {
            return 0;
        }
        C27331o c27331oM82482g = c27341y.m82482g();
        EnumC16377d2 enumC16377d2 = c27331oM82482g.f109443q;
        EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
        int iM82472e = (int) (enumC16377d2 == enumC16377d3 ? c27331oM82482g.m82472e() & 4294967295L : c27331oM82482g.m82472e() >> 32);
        C27331o c27331oM82482g2 = c27341y.m82482g();
        boolean z4 = c27331oM82482g2.f109443q == enumC16377d3;
        ?? r10 = c27331oM82482g2.f109439m;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < r10.size()) {
            int iM110015q0 = AbstractC34870c0.m110015q0(z4, c27331oM82482g2, i15);
            if (iM110015q0 == -1) {
                i15++;
            } else {
                int iMax = i14;
                while (i15 < r10.size() && AbstractC34870c0.m110015q0(z4, c27331oM82482g2, i15) == iM110015q0) {
                    iMax = Math.max(iMax, (int) (z4 ? ((C27332p) r10.get(i15)).f109464s & 4294967295L : ((C27332p) r10.get(i15)).f109464s >> 32));
                    i15++;
                    z4 = z4;
                }
                i16 += iMax;
                i17++;
                z4 = z4;
                i14 = 0;
            }
        }
        int i18 = (i16 / i17) + c27331oM82482g2.f109445s;
        if (i18 != 0 && (i13 = iM82472e / i18) >= 1) {
            return i13;
        }
        return 1;
    }

    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: b */
    public final boolean mo77524b() {
        return !((Collection) this.f109392a.m82482g().f109439m).isEmpty();
    }

    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: c */
    public final int mo77525c() {
        return ((C28621h1) this.f109392a.f109500d.f16070c).m87024x();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: d */
    public final int mo77526d() {
        return ((C27332p) AbstractC25265s.m74112P0(this.f109392a.m82482g().f109439m)).f109446a;
    }

    @Override // p389p0.InterfaceC28540o
    public final int getItemCount() {
        return this.f109392a.m82482g().f109442p;
    }
}
