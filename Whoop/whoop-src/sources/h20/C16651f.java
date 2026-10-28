package h20;

import a30.C0273a;
import androidx.lifecycle.C1601k1;
import bi.AbstractC3269g;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import h00.C16513l0;
import n53.C26318e;
import p163g1.C15184w8;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29838w;
import y00.C38915o4;

/* JADX INFO: renamed from: h20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C16651f {

    /* JADX INFO: renamed from: a */
    public final C1601k1 f64020a;

    /* JADX INFO: renamed from: b */
    public final C13081r1 f64021b;

    /* JADX INFO: renamed from: c */
    public final C26318e f64022c;

    /* JADX INFO: renamed from: d */
    public final C13081r1 f64023d;

    /* JADX INFO: renamed from: e */
    public final C26318e f64024e;

    /* JADX INFO: renamed from: f */
    public final C26318e f64025f;

    /* JADX INFO: renamed from: g */
    public final C26318e f64026g;

    public C16651f(C26318e c26318e, C1601k1 savedStateHandle, InterfaceC13037f2 selection) {
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(selection, "selection");
        this.f64020a = savedStateHandle;
        C13081r1 c13081r1M5002c = savedStateHandle.m5002c(null, "customer_info");
        this.f64021b = c13081r1M5002c;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c13081r1M5002c, new C16513l0(3));
        this.f64022c = c26318eM9484M;
        Object value = selection.getValue();
        C29838w c29838w = value instanceof C29838w ? (C29838w) value : null;
        this.f64023d = savedStateHandle.m5002c(c29838w != null ? c29838w.f121955x : null, "saved_selection");
        this.f64024e = AbstractC3269g.m9509p(c13081r1M5002c, c26318e, new C15184w8(13));
        this.f64025f = AbstractC3269g.m9509p(c26318eM9484M, c26318e, new C15184w8(14));
        this.f64026g = AbstractC3269g.m9484M(c26318e, new C16513l0(4));
    }

    /* JADX INFO: renamed from: a */
    public final void m47225a(C0273a c0273a) {
        C1601k1 c1601k1 = this.f64020a;
        c1601k1.m5004e(c0273a, "customer_info");
        C38915o4 c38915o4 = (C38915o4) this.f64023d.f45200w.getValue();
        Object obj = null;
        if (c0273a != null) {
            for (Object obj2 : c0273a.f935w) {
                if (AbstractC22676k.m65745e(((C38915o4) obj2).f167527w, c38915o4 != null ? c38915o4.f167527w : null)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (C38915o4) obj;
        }
        c1601k1.m5004e(obj, "saved_selection");
    }
}
