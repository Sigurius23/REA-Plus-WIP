package p279kd;

import ad3.C0783z;
import bc3.AbstractC3006f0;
import cf.AbstractC4530e;
import cf.C4528c;
import cf.InterfaceC4532g;
import cf.InterfaceC4536k;
import cg.C4560o;
import g73.C15556d;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import me.C25461b;
import mg.InterfaceC25526h;
import p014aj.C0929d;
import p145fd.C14395a;
import p301le.C23871a;
import p579wc.C37074c;
import pf.AbstractC29125c;
import pf.InterfaceC29123a;
import q83.C30064k;
import q83.InterfaceC30057d;
import v63.AbstractC35750h;
import ve.InterfaceC35918c;

/* JADX INFO: renamed from: kd.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C22380g implements InterfaceC4536k, InterfaceC4532g {

    /* JADX INFO: renamed from: E */
    public final C25271y f87369E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35918c f87370F;

    /* JADX INFO: renamed from: G */
    public final C15556d f87371G;

    /* JADX INFO: renamed from: H */
    public final C4560o f87372H;

    /* JADX INFO: renamed from: I */
    public final ArrayList f87373I;

    /* JADX INFO: renamed from: J */
    public final AbstractC4530e f87374J;

    /* JADX INFO: renamed from: K */
    public final C23871a f87375K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC25526h f87376L;

    /* JADX INFO: renamed from: M */
    public final boolean f87377M;

    /* JADX INFO: renamed from: N */
    public final boolean f87378N;

    /* JADX INFO: renamed from: O */
    public final String f87379O;

    /* JADX INFO: renamed from: P */
    public final C14395a f87380P;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0783z f87381w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0929d f87382x;

    /* JADX INFO: renamed from: y */
    public final String f87383y;

    /* JADX INFO: renamed from: z */
    public final String f87384z;

    public C22380g(C22378e c22378e) {
        C0783z c0783zM133470q = c22378e.f87353a.m133470q();
        this.f87381w = c0783zM133470q;
        this.f87382x = (C0929d) c22378e.f87354b.m14183a();
        this.f87383y = c22378e.f87355c;
        String str = c22378e.f87356d;
        InterfaceC30057d interfaceC30057d = null;
        if (str == null) {
            str = (String) AbstractC3006f0.m8699E(C30064k.f122676w, new C22379f(c22378e, interfaceC30057d, 0));
        }
        if (str != null) {
            AbstractC21478l0.m60436h0(str);
        } else {
            str = null;
        }
        this.f87384z = str;
        new C25461b(null, null, 7);
        List list = c22378e.f87357e;
        this.f87369E = c22378e.f87358f;
        this.f87370F = AbstractC35750h.m113274c(new C37074c((InterfaceC29123a) c0783zM133470q.f2818x, str));
        this.f87371G = new C15556d(24);
        this.f87372H = c22378e.f87359g;
        this.f87373I = c22378e.f87360h;
        AbstractC4530e abstractC4530e = c22378e.f87361i;
        this.f87374J = abstractC4530e == null ? C4528c.f18258d : abstractC4530e;
        this.f87375K = C23871a.f94390y;
        InterfaceC25526h interfaceC25526h = c22378e.f87362j;
        this.f87376L = interfaceC25526h == null ? AbstractC29125c.m88549z(InterfaceC25526h.f99937a) : interfaceC25526h;
        Boolean bool = c22378e.f87363k;
        this.f87377M = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = c22378e.f87364l;
        this.f87378N = bool2 != null ? bool2.booleanValue() : false;
        this.f87379O = c22378e.f87365m;
        this.f87380P = new C14395a(list, 1);
    }
}
