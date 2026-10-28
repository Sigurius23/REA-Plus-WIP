package p695zx;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13045h2;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: zx.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C41200v extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177763w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C41201w f177764x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41200v(C41201w c41201w, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f177763w = i13;
        this.f177764x = c41201w;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f177763w) {
            case 0:
                return new C41200v(this.f177764x, interfaceC30057d, 0);
            default:
                return new C41200v(this.f177764x, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f177763w) {
            case 0:
                C41200v c41200v = (C41200v) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c41200v.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C41200v c41200v2 = (C41200v) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c41200v2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f177763w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C41201w c41201w = this.f177764x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h2 = c41201w.f177766F;
                Boolean bool = Boolean.TRUE;
                c13045h2.getClass();
                c13045h2.m36571k(null, bool);
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h3 = c41201w.f177766F;
                Boolean bool2 = Boolean.FALSE;
                c13045h3.getClass();
                c13045h3.m36571k(null, bool2);
                break;
        }
        return c23454a0;
    }
}
