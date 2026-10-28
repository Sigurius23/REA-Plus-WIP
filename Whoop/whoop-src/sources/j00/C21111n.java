package j00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: j00.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C21111n extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80078w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f80079x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21111n(InterfaceC4339a interfaceC4339a, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f80078w = i13;
        this.f80079x = interfaceC4339a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f80078w) {
            case 0:
                return new C21111n(this.f80079x, interfaceC30057d, 0);
            default:
                return new C21111n(this.f80079x, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f80078w) {
            case 0:
                C21111n c21111n = (C21111n) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c21111n.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C21111n c21111n2 = (C21111n) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c21111n2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f80078w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC4339a interfaceC4339a = this.f80079x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                interfaceC4339a.invoke();
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                interfaceC4339a.invoke();
                break;
        }
        return c23454a0;
    }
}
