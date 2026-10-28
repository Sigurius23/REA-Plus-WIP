package fc3;

import bc3.C3000d2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dc3.EnumC11916a;
import e93.AbstractC12889b;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hc3.AbstractC17167b;
import hc3.C17191x;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: fc3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14371b {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC30057d[] f52476a = new InterfaceC30057d[0];

    /* JADX INFO: renamed from: b */
    public static final C17191x f52477b;

    /* JADX INFO: renamed from: c */
    public static final C17191x f52478c;

    /* JADX INFO: renamed from: d */
    public static final C17191x f52479d;

    static {
        int i13 = 0;
        f52477b = new C17191x("NULL", i13);
        f52478c = new C17191x("UNINITIALIZED", i13);
        f52479d = new C17191x("DONE", i13);
    }

    /* JADX INFO: renamed from: a */
    public static final Object m41038a(InterfaceC4339a interfaceC4339a, InterfaceC13062m interfaceC13062m, Function3 function3, InterfaceC30057d interfaceC30057d, InterfaceC13058l[] interfaceC13058lArr) {
        C14384o c14384o = new C14384o(interfaceC4339a, interfaceC13062m, function3, null, interfaceC13058lArr);
        C3000d2 c3000d2 = new C3000d2(interfaceC30057d.getContext(), interfaceC30057d, 1);
        Object objM36266c0 = AbstractC12889b.m36266c0(c3000d2, true, c3000d2, c14384o);
        return objM36266c0 == EnumC31071a.f128113w ? objM36266c0 : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC13058l m41039b(InterfaceC14386q interfaceC14386q, InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a, int i14) {
        if ((i14 & 1) != 0) {
            interfaceC30063j = C30064k.f122676w;
        }
        if ((i14 & 2) != 0) {
            i13 = -3;
        }
        if ((i14 & 4) != 0) {
            enumC11916a = EnumC11916a.f38982w;
        }
        return interfaceC14386q.mo36565b(interfaceC30063j, i13, enumC11916a);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m41040c(InterfaceC30063j interfaceC30063j, Object obj, Object obj2, InterfaceC4351m interfaceC4351m, InterfaceC30057d frame) {
        Object objInvoke;
        Object objM48487m = AbstractC17167b.m48487m(interfaceC30063j, obj2);
        try {
            C14393x c14393x = new C14393x(interfaceC30063j, frame);
            if (interfaceC4351m == null) {
                objInvoke = AbstractC15751g.m44446Z(interfaceC4351m, obj, c14393x);
            } else {
                AbstractC22681m0.m65774e(2, interfaceC4351m);
                objInvoke = interfaceC4351m.invoke(obj, c14393x);
            }
            AbstractC17167b.m48480f(interfaceC30063j, objM48487m);
            if (objInvoke == EnumC31071a.f128113w) {
                AbstractC22676k.m65750j(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th3) {
            AbstractC17167b.m48480f(interfaceC30063j, objM48487m);
            throw th3;
        }
    }
}
