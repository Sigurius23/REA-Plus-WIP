package kr;

import se.AbstractC32410a;

/* JADX INFO: renamed from: kr.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C22790i extends AbstractC32410a {
    @Override // se.AbstractC32410a
    /* JADX INFO: renamed from: L */
    public final void mo65994L(C22802u c22802u, float f13, float f14) {
        c22802u.m66038d(f14 * f13, 180.0f, 90.0f);
        float f15 = f14 * 2.0f * f13;
        C22798q c22798q = new C22798q(0.0f, 0.0f, f15, f15);
        c22798q.f89802f = 180.0f;
        c22798q.f89803g = 90.0f;
        c22802u.f89814f.add(c22798q);
        C22796o c22796o = new C22796o(c22798q);
        c22802u.m66035a(180.0f);
        c22802u.f89815g.add(c22796o);
        c22802u.f89812d = 270.0f;
        float f16 = (0.0f + f15) * 0.5f;
        float f17 = (f15 - 0.0f) / 2.0f;
        double d3 = 270.0f;
        c22802u.f89810b = (((float) Math.cos(Math.toRadians(d3))) * f17) + f16;
        c22802u.f89811c = (f17 * ((float) Math.sin(Math.toRadians(d3)))) + f16;
    }
}
