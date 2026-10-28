package b30;

import c93.InterfaceC4351m;
import h20.C16621a;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b30.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2563l0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9960w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f9961x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2571m0 f9962y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2563l0(C2571m0 c2571m0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9960w = i13;
        this.f9962y = c2571m0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f9960w) {
            case 0:
                C2563l0 c2563l0 = new C2563l0(this.f9962y, interfaceC30057d, 0);
                c2563l0.f9961x = obj;
                return c2563l0;
            default:
                C2563l0 c2563l1 = new C2563l0(this.f9962y, interfaceC30057d, 1);
                c2563l1.f9961x = obj;
                return c2563l1;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9960w) {
            case 0:
                C2563l0 c2563l0 = (C2563l0) create((C16621a) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c2563l0.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                return ((C2563l0) create((C2616s) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f9960w;
        C2571m0 c2571m0 = this.f9962y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c2571m0.f9996g.invoke((C16621a) this.f9961x);
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return c2571m0.m7502c((C2616s) this.f9961x, c2571m0.f9999j);
        }
    }
}
