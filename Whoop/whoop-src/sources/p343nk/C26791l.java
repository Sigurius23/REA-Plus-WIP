package p343nk;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: nk.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C26791l extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106712w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26792m f106713x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f106714y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26791l(C26792m c26792m, String str, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f106712w = i13;
        this.f106713x = c26792m;
        this.f106714y = str;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f106712w) {
            case 0:
                return new C26791l(this.f106713x, this.f106714y, interfaceC30057d, 0);
            case 1:
                return new C26791l(this.f106713x, this.f106714y, interfaceC30057d, 1);
            default:
                return new C26791l(this.f106713x, this.f106714y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f106712w) {
            case 0:
                C26791l c26791l = (C26791l) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c26791l.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C26791l c26791l2 = (C26791l) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c26791l2.invokeSuspend(c23454a1);
                return c23454a1;
            default:
                C26791l c26791l3 = (C26791l) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c26791l3.invokeSuspend(c23454a2);
                return c23454a2;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f106712w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        String str = this.f106714y;
        C26792m c26792m = this.f106713x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c26792m.f106715a.m33432i(str);
                break;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c26792m.f106715a.m33432i(str);
                break;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c26792m.f106715a.m33432i(str);
                break;
        }
        return c23454a0;
    }
}
