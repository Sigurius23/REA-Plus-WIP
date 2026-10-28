package g20;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.Map;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C15269o extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57333w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15272r f57334x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Throwable f57335y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Map f57336z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15269o(C15272r c15272r, Throwable th3, Map map, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f57333w = i13;
        this.f57334x = c15272r;
        this.f57335y = th3;
        this.f57336z = map;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f57333w) {
            case 0:
                return new C15269o(this.f57334x, this.f57335y, this.f57336z, interfaceC30057d, 0);
            default:
                return new C15269o(this.f57334x, this.f57335y, this.f57336z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f57333w) {
            case 0:
                C15269o c15269o = (C15269o) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c15269o.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C15269o c15269o2 = (C15269o) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c15269o2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f57333w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Map map = this.f57336z;
        Throwable th3 = this.f57335y;
        C15272r c15272r = this.f57334x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C15272r.m43369l(c15272r, new C15257c(th3), null, map, 2);
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C15272r.m43369l(c15272r, new C15257c(th3), null, map, 2);
                break;
        }
        return c23454a0;
    }
}
