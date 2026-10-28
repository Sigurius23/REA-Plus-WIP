package d33;

import androidx.lifecycle.AbstractC1638x;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d33.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C11618o extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37509w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37510x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11618o(C11602h1 c11602h1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f37509w = i13;
        this.f37510x = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37509w) {
            case 0:
                return new C11618o(this.f37510x, interfaceC30057d, 0);
            default:
                return new C11618o(this.f37510x, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f37509w) {
            case 0:
                C11618o c11618o = (C11618o) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c11618o.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C11618o c11618o2 = (C11618o) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c11618o2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37509w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C11602h1 c11602h1 = this.f37510x;
                if (c11602h1.f37425E == null) {
                    c11602h1.f37425E = new C11616n(c11602h1);
                }
                try {
                    AbstractC1638x abstractC1638x = c11602h1.f37442d;
                    C11616n c11616n = c11602h1.f37425E;
                    AbstractC22676k.m65747g(c11616n);
                    abstractC1638x.mo4986a(c11616n);
                } catch (Exception e5) {
                    C2343i c2343i = C2343i.f9269a;
                    InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                    EnumC2341g enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                        C2343i.f9271c.log(enumC2341g, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
                    }
                }
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C11602h1 c11602h2 = this.f37510x;
                C11616n c11616n2 = c11602h2.f37425E;
                if (c11616n2 != null) {
                    try {
                        c11602h2.f37442d.mo4988d(c11616n2);
                    } catch (Exception e13) {
                        C2343i c2343i2 = C2343i.f9269a;
                        InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
                        EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                        if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                            C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e13.getMessage()), e13);
                        }
                    }
                    this.f37510x.f37425E = null;
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
