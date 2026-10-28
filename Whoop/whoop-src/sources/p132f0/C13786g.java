package p132f0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d30.C11552o;
import l83.C23454a0;
import p238j0.C21080f;
import p238j0.C21081g;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f0.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C13786g extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49181w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC13789h f49182x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13786g(AbstractC13789h abstractC13789h, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f49181w = i13;
        this.f49182x = abstractC13789h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49181w) {
            case 0:
                return new C13786g(this.f49182x, interfaceC30057d, 0);
            default:
                return new C13786g(this.f49182x, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f49181w) {
            case 0:
                C13786g c13786g = (C13786g) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c13786g.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C13786g c13786g2 = (C13786g) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c13786g2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f49181w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC30057d interfaceC30057d = null;
        AbstractC13789h abstractC13789h = this.f49182x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (abstractC13789h.f49208c0 == null) {
                    C21080f c21080f = new C21080f();
                    InterfaceC21083i interfaceC21083i = abstractC13789h.f49196Q;
                    if (interfaceC21083i != null) {
                        AbstractC3006f0.m8732z(abstractC13789h.m7158L0(), null, null, new C11552o(interfaceC21083i, c21080f, interfaceC30057d, 9), 3);
                    }
                    abstractC13789h.f49208c0 = c21080f;
                }
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C21080f c21080f2 = abstractC13789h.f49208c0;
                if (c21080f2 != null) {
                    C21081g c21081g = new C21081g(c21080f2);
                    InterfaceC21083i interfaceC21083i2 = abstractC13789h.f49196Q;
                    if (interfaceC21083i2 != null) {
                        AbstractC3006f0.m8732z(abstractC13789h.m7158L0(), null, null, new C11552o(interfaceC21083i2, c21081g, interfaceC30057d, 10), 3);
                    }
                    abstractC13789h.f49208c0 = null;
                }
                break;
        }
        return c23454a0;
    }
}
