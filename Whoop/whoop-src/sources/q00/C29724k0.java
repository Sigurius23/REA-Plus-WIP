package q00;

import c93.InterfaceC4351m;
import ec3.C13045h2;
import l40.C23328a;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: q00.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29724k0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121568w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f121569x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29734p0 f121570y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29724k0(C29734p0 c29734p0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f121568w = i13;
        this.f121570y = c29734p0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f121568w) {
            case 0:
                C29724k0 c29724k0 = new C29724k0(this.f121570y, interfaceC30057d, 0);
                c29724k0.f121569x = obj;
                return c29724k0;
            default:
                C29724k0 c29724k1 = new C29724k0(this.f121570y, interfaceC30057d, 1);
                c29724k1.f121569x = obj;
                return c29724k1;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C23328a c23328a = (C23328a) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f121568w) {
            case 0:
                C29724k0 c29724k0 = (C29724k0) create(c23328a, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c29724k0.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C29724k0 c29724k1 = (C29724k0) create(c23328a, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c29724k1.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i13 = this.f121568w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C29734p0 c29734p0 = this.f121570y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C23328a c23328a = (C23328a) this.f121569x;
                C13045h2 c13045h2 = c29734p0.f121607M;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, false, null, null, null, c23328a, null, null, null, 268173311)));
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C23328a c23328a2 = (C23328a) this.f121569x;
                C13045h2 c13045h3 = c29734p0.f121607M;
                do {
                    value2 = c13045h3.getValue();
                } while (!c13045h3.m36569i(value2, C29720i0.m91172a((C29720i0) value2, null, null, false, null, null, null, null, c23328a2, null, null, 267911167)));
                break;
        }
        return c23454a0;
    }
}
