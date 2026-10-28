package p409q0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.InterfaceC11372l;
import p180h0.InterfaceC16413k2;
import p329n0.C26065r;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22663d0;
import pp2.C29451o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: q0.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C29699w extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f121409E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC11372l f121410F;

    /* JADX INFO: renamed from: w */
    public int f121411w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f121412x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC29701y f121413y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f121414z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29699w(AbstractC29701y abstractC29701y, int i13, float f13, InterfaceC11372l interfaceC11372l, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f121413y = abstractC29701y;
        this.f121414z = i13;
        this.f121409E = f13;
        this.f121410F = interfaceC11372l;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C29699w c29699w = new C29699w(this.f121413y, this.f121414z, this.f121409E, this.f121410F, interfaceC30057d);
        c29699w.f121412x = obj;
        return c29699w;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C29699w) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.f121411w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i15 = 1;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        InterfaceC16413k2 interfaceC16413k2 = (InterfaceC16413k2) this.f121412x;
        AbstractC29701y abstractC29701y = this.f121413y;
        C26065r c26065r = new C26065r(interfaceC16413k2, abstractC29701y, i15);
        this.f121411w = 1;
        float f13 = AbstractC29677c0.f121291a;
        int i16 = this.f121414z;
        abstractC29701y.f121448s.m87025y(abstractC29701y.m91161j(new Integer(i16).intValue()));
        boolean z4 = i16 > abstractC29701y.f121434e;
        int iM77560e = (c26065r.m77560e() - abstractC29701y.f121434e) + 1;
        if (((z4 && i16 > c26065r.m77560e()) || (!z4 && i16 < abstractC29701y.f121434e)) && Math.abs(i16 - abstractC29701y.f121434e) >= 3) {
            if (z4) {
                i13 = i16 - iM77560e;
                int i17 = abstractC29701y.f121434e;
                if (i13 < i17) {
                    i13 = i17;
                }
            } else {
                int i18 = iM77560e + i16;
                i13 = abstractC29701y.f121434e;
                if (i18 <= i13) {
                    i13 = i18;
                }
            }
            c26065r.m77561f(i13, 0);
        }
        Object objM30557e = AbstractC11348f.m30557e(0.0f, c26065r.m77557b(i16) + this.f121409E, this.f121410F, new C29451o(i15, new C22663d0(), c26065r), this, 4);
        if (objM30557e != enumC31071a) {
            objM30557e = c23454a0;
        }
        return objM30557e == enumC31071a ? enumC31071a : c23454a0;
    }
}
