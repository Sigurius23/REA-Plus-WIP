package p343nk;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dk.C12100f;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: nk.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C26790k extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106709w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26792m f106710x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f106711y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26790k(C26792m c26792m, Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f106709w = i13;
        this.f106710x = c26792m;
        this.f106711y = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f106709w) {
            case 0:
                return new C26790k(this.f106710x, this.f106711y, interfaceC30057d, 0);
            case 1:
                return new C26790k(this.f106710x, this.f106711y, interfaceC30057d, 1);
            case 2:
                return new C26790k(this.f106710x, this.f106711y, interfaceC30057d, 2);
            default:
                return new C26790k(this.f106710x, this.f106711y, interfaceC30057d, 3);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f106709w) {
            case 0:
                C26790k c26790k = (C26790k) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c26790k.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C26790k c26790k2 = (C26790k) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c26790k2.invokeSuspend(c23454a1);
                return c23454a1;
            case 2:
                C26790k c26790k3 = (C26790k) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c26790k3.invokeSuspend(c23454a2);
                return c23454a2;
            default:
                C26790k c26790k4 = (C26790k) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c26790k4.invokeSuspend(c23454a3);
                return c23454a3;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f106709w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f106711y;
        C26792m c26792m = this.f106710x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c26792m.f106715a.m33431h((String) obj2);
                break;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C12100f c12100f = c26792m.f106715a;
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                c12100f.m33431h((String) obj2);
                break;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C12100f c12100f2 = c26792m.f106715a;
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                c12100f2.m33431h((String) obj2);
                break;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C12100f c12100f3 = c26792m.f106715a;
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                c12100f3.m33431h((String) obj2);
                break;
        }
        return c23454a0;
    }
}
