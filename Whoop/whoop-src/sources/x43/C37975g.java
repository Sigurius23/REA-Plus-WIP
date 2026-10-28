package x43;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x43.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C37975g extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162620w;

    /* JADX INFO: renamed from: x */
    public int f162621x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37976h f162622y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37975g(C37976h c37976h, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f162620w = i13;
        this.f162622y = c37976h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f162620w) {
            case 0:
                return new C37975g(this.f162622y, interfaceC30057d, 0);
            default:
                return new C37975g(this.f162622y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f162620w) {
            case 0:
                break;
        }
        return ((C37975g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function1, s83.i] */
    /* JADX WARN: Type inference failed for: r6v12, types: [kotlin.jvm.functions.Function1, s83.i] */
    /* JADX WARN: Type inference failed for: r6v4, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f162620w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f162621x;
                C37976h c37976h = this.f162622y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ?? r10 = c37976h.f162626d;
                    this.f162621x = 1;
                    if (r10.invoke(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                c37976h.m121614b();
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f162621x;
                C37976h c37976h2 = this.f162622y;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (((Boolean) c37976h2.f162628f.invoke()).booleanValue()) {
                        ?? r14 = c37976h2.f162627e;
                        this.f162621x = 1;
                        if (r14.invoke(this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    } else {
                        C2345k c2345k = (C2345k) c37976h2.f162634l.getValue();
                        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                        String str = c2345k.f9273a;
                        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                            c2345k.f9274b.log(enumC2341g, str, "Network unavailable — skipping reconnect attempt, will retry", null);
                        }
                        c37976h2.m121615c();
                    }
                    return C23454a0.f92919a;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c37976h2.m121614b();
                return C23454a0.f92919a;
        }
    }
}
