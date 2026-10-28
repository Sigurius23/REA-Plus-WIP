package p353o0;

import m83.AbstractC25265s;
import p180h0.EnumC16377d2;
import p389p0.InterfaceC28531j0;
import p446r1.C30849c;

/* JADX INFO: renamed from: o0.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C27315a {

    /* JADX INFO: renamed from: c */
    public boolean f109381c;

    /* JADX INFO: renamed from: e */
    public float f109383e;

    /* JADX INFO: renamed from: a */
    public int f109379a = -1;

    /* JADX INFO: renamed from: b */
    public final C30849c f109380b = new C30849c(new InterfaceC28531j0[16]);

    /* JADX INFO: renamed from: d */
    public int f109382d = -1;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static int m82464a(C27331o c27331o, boolean z4) {
        return z4 ? ((C27332p) AbstractC25265s.m74112P0(c27331o.f109439m)).f109446a + 1 : ((C27332p) AbstractC25265s.m74096F0(c27331o.f109439m)).f109446a - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public static int m82465b(C27331o c27331o, boolean z4) {
        if (z4) {
            C27332p c27332p = (C27332p) AbstractC25265s.m74112P0(c27331o.f109439m);
            return (c27331o.f109443q == EnumC16377d2.f62971w ? c27332p.f109466u : c27332p.f109467v) + 1;
        }
        C27332p c27332p2 = (C27332p) AbstractC25265s.m74096F0(c27331o.f109439m);
        return (c27331o.f109443q == EnumC16377d2.f62971w ? c27332p2.f109466u : c27332p2.f109467v) - 1;
    }
}
