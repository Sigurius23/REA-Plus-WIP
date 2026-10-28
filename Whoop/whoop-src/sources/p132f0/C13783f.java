package p132f0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p238j0.C21084j;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.C21087m;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f0.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C13783f extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49173w;

    /* JADX INFO: renamed from: x */
    public int f49174x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC13789h f49175y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C21086l f49176z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13783f(AbstractC13789h abstractC13789h, C21086l c21086l, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f49173w = i13;
        this.f49175y = abstractC13789h;
        this.f49176z = c21086l;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49173w) {
            case 0:
                return new C13783f(this.f49175y, this.f49176z, interfaceC30057d, 0);
            case 1:
                return new C13783f(this.f49175y, this.f49176z, interfaceC30057d, 1);
            default:
                return new C13783f(this.f49175y, this.f49176z, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f49173w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C13783f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49173w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f49174x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC21083i interfaceC21083i = this.f49175y.f49196Q;
                    if (interfaceC21083i != null) {
                        C21085k c21085k = new C21085k(this.f49176z);
                        this.f49174x = 1;
                        if (((C21084j) interfaceC21083i).m58921a(c21085k, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f49174x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC21083i interfaceC21083i2 = this.f49175y.f49196Q;
                    if (interfaceC21083i2 != null) {
                        this.f49174x = 1;
                        if (((C21084j) interfaceC21083i2).m58921a(this.f49176z, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f49174x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC21083i interfaceC21083i3 = this.f49175y.f49196Q;
                    if (interfaceC21083i3 != null) {
                        C21087m c21087m = new C21087m(this.f49176z);
                        this.f49174x = 1;
                        if (((C21084j) interfaceC21083i3).m58921a(c21087m, this) == enumC31071a3) {
                            return enumC31071a3;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
