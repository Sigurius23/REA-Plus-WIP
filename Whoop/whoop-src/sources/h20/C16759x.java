package h20;

import a30.C0307l0;
import bc3.AbstractC3006f0;
import bc3.C3003e1;
import d30.C11552o;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import n20.C26170e;
import p127ev.AbstractC13673n;
import p505ts.AbstractC34132o;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p697zz.C41234a;
import p697zz.C41235b;
import p697zz.C41236c;
import p697zz.C41237d;
import p697zz.C41238e;
import p697zz.InterfaceC41239f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h20.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C16759x {

    /* JADX INFO: renamed from: a */
    public final C37734l1 f64391a;

    /* JADX INFO: renamed from: b */
    public final C13045h2 f64392b;

    /* JADX INFO: renamed from: c */
    public final C13045h2 f64393c;

    /* JADX INFO: renamed from: d */
    public final C13045h2 f64394d;

    /* JADX INFO: renamed from: e */
    public final C13081r1 f64395e;

    public C16759x(C37734l1 linkConfigurationCoordinator) {
        AbstractC22676k.m65750j(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        this.f64391a = linkConfigurationCoordinator;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f64392b = c13045h2M36593c;
        this.f64393c = c13045h2M36593c;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this.f64394d = c13045h2M36593c2;
        this.f64395e = AbstractC13091v.m36598h(c13045h2M36593c2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m47276a(C37718g0 configuration, AbstractC32269c abstractC32269c) {
        C16753w c16753w;
        C41234a c41234a;
        if (abstractC32269c instanceof C16753w) {
            c16753w = (C16753w) abstractC32269c;
            int i13 = c16753w.f64343y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16753w.f64343y = i13 - Integer.MIN_VALUE;
            } else {
                c16753w = new C16753w(this, abstractC32269c);
            }
        } else {
            c16753w = new C16753w(this, abstractC32269c);
        }
        Object objM8705K = c16753w.f64341w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16753w.f64343y;
        C41238e c41238e = C41238e.f177940a;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C37734l1 c37734l1 = this.f64391a;
            c37734l1.getClass();
            AbstractC22676k.m65750j(configuration, "configuration");
            C26170e c26170eM121148b = c37734l1.m121148b(configuration);
            switch (c26170eM121148b.f103756a) {
                case 0:
                    c41234a = (C41234a) c26170eM121148b.f103761f.get();
                    break;
                case 1:
                    c41234a = (C41234a) c26170eM121148b.f103761f.get();
                    break;
                case 2:
                    c41234a = (C41234a) c26170eM121148b.f103761f.get();
                    break;
                default:
                    c41234a = (C41234a) c26170eM121148b.f103761f.get();
                    break;
            }
            c16753w.f64343y = 1;
            objM8705K = !c41234a.f177931a.m6860a() ? c41238e : AbstractC3006f0.m8705K(c41234a.f177936f, new C32139c0(c41234a, null, 29), c16753w);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        InterfaceC41239f interfaceC41239f = (InterfaceC41239f) objM8705K;
        if ((interfaceC41239f instanceof C41235b) || (interfaceC41239f instanceof C41236c) || (interfaceC41239f instanceof C41237d)) {
            z4 = false;
        } else if (!AbstractC22676k.m65745e(interfaceC41239f, c41238e)) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: b */
    public final void m47277b() {
        C37718g0 c37718g0 = (C37718g0) this.f64395e.f45200w.getValue();
        if (c37718g0 == null) {
            return;
        }
        AbstractC3006f0.m8732z(C3003e1.f12012w, null, null, new C11552o(this, c37718g0, null, 29), 3);
    }

    /* JADX INFO: renamed from: c */
    public final void m47278c(C0307l0 c0307l0) {
        AbstractC13673n.m38550B(c0307l0 != null, this.f64392b, null);
        if (c0307l0 == null) {
            return;
        }
        C37718g0 configuration = c0307l0.f1058w;
        this.f64394d.m36570j(configuration);
        C37734l1 c37734l1 = this.f64391a;
        c37734l1.getClass();
        AbstractC22676k.m65750j(configuration, "configuration");
        c37734l1.m121148b(configuration);
    }
}
