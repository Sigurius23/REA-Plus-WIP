package je;

import ag.C0854d;
import p522uf.C34894u;
import p522uf.InterfaceC34888o;
import p551vf.C35937b;
import p715kotlin.jvm.internal.AbstractC22676k;
import vg.C35966m;
import vg.C35971r;
import vg.InterfaceC35965l;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: je.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C21616b implements InterfaceC34888o {

    /* JADX INFO: renamed from: w */
    public final InterfaceC35965l f82956w;

    public C21616b() {
        InterfaceC35967n.f153143a.getClass();
        C35971r env = C35966m.f153142b;
        AbstractC22676k.m65750j(env, "env");
        this.f82956w = env;
    }

    @Override // p522uf.InterfaceC34888o
    /* JADX INFO: renamed from: d */
    public final Object mo9062d(Object obj, C0854d c0854d) {
        C34894u c34894u = (C34894u) obj;
        if (!((C35937b) c34894u.f146959b).f153017y.m391o("X-Amzn-Trace-Id")) {
            C35971r c35971r = (C35971r) this.f82956w;
            String strM114207b = c35971r.m114207b("_X_AMZN_TRACE_ID");
            if (c35971r.m114207b("AWS_LAMBDA_FUNCTION_NAME") != null && strM114207b != null) {
                ((C35937b) c34894u.f146959b).f153017y.m380N(AbstractC21617c.f82957a.mo106776a(strM114207b), "X-Amzn-Trace-Id");
            }
        }
        return c34894u;
    }
}
