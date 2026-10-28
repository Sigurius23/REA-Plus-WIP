package d33;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d30.C11552o;
import e33.C12662v0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13096w1;
import hc3.AbstractC17182o;
import kc3.C22365e;
import l83.C23454a0;
import l83.C23468n;
import n53.C26377x1;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import t23.C33368c0;

/* JADX INFO: renamed from: d33.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C11614m extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37496w;

    /* JADX INFO: renamed from: x */
    public int f37497x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11602h1 f37498y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11614m(C11602h1 c11602h1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f37496w = i13;
        this.f37498y = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37496w) {
            case 0:
                return new C11614m(this.f37498y, interfaceC30057d, 0);
            case 1:
                return new C11614m(this.f37498y, interfaceC30057d, 1);
            case 2:
                return new C11614m(this.f37498y, interfaceC30057d, 2);
            case 3:
                return new C11614m(this.f37498y, interfaceC30057d, 3);
            case 4:
                return new C11614m(this.f37498y, interfaceC30057d, 4);
            case 5:
                return new C11614m(this.f37498y, interfaceC30057d, 5);
            case 6:
                return new C11614m(this.f37498y, interfaceC30057d, 6);
            case 7:
                return new C11614m(this.f37498y, interfaceC30057d, 7);
            case 8:
                return new C11614m(this.f37498y, interfaceC30057d, 8);
            case 9:
                return new C11614m(this.f37498y, interfaceC30057d, 9);
            case 10:
                return new C11614m(this.f37498y, interfaceC30057d, 10);
            case 11:
                return new C11614m(this.f37498y, interfaceC30057d, 11);
            case 12:
                return new C11614m(this.f37498y, interfaceC30057d, 12);
            default:
                return new C11614m(this.f37498y, interfaceC30057d, 13);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f37496w) {
            case 0:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 10:
                ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 11:
                return ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 12:
                ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            default:
                ((C11614m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C13096w1 c13096w1;
        C13096w1 c13096w2;
        int i13 = this.f37496w;
        int i14 = 2;
        int i15 = 0;
        InterfaceC30057d interfaceC30057d = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C11602h1 c11602h1 = this.f37498y;
        int i16 = 1;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i17 = this.f37497x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C12662v0 c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                if (c12662v0 == null || (c13096w1 = c12662v0.f43302O) == null) {
                    return c23454a0;
                }
                C11612l c11612l = new C11612l(c11602h1, i15);
                this.f37497x = 1;
                C13096w1.m36617k(c13096w1, c11612l, this);
                return enumC31071a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i18 = this.f37497x;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C22365e c22365e = AbstractC3050q0.f12077a;
                AbstractC3069w1 abstractC3069w1 = AbstractC17182o.f65999a;
                C11618o c11618o = new C11618o(c11602h1, interfaceC30057d, i15);
                this.f37497x = 1;
                return AbstractC3006f0.m8705K(abstractC3069w1, c11618o, this) == enumC31071a2 ? enumC31071a2 : c23454a0;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i19 = this.f37497x;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C12662v0 c12662v1 = (C12662v0) c11602h1.f37464z.getValue();
                if (c12662v1 == null || (c13096w2 = c12662v1.f43303P) == null) {
                    return c23454a0;
                }
                C11612l c11612l2 = new C11612l(c11602h1, i16);
                this.f37497x = 1;
                C13096w1.m36617k(c13096w2, c11612l2, this);
                return enumC31071a3;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i24 = this.f37497x;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    ((C23468n) obj).getClass();
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C26377x1 c26377x1 = c11602h1.f37450l;
                C11632v c11632v = new C11632v(c11602h1, interfaceC30057d, i15);
                this.f37497x = 1;
                return c26377x1.m78095c("cleanupSfuConnections", c11632v, this) == enumC31071a4 ? enumC31071a4 : c23454a0;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i25 = this.f37497x;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C22365e c22365e2 = AbstractC3050q0.f12077a;
                AbstractC3069w1 abstractC3069w2 = AbstractC17182o.f65999a;
                C11618o c11618o2 = new C11618o(c11602h1, interfaceC30057d, i16);
                this.f37497x = 1;
                return AbstractC3006f0.m8705K(abstractC3069w2, c11618o2, this) == enumC31071a5 ? enumC31071a5 : c23454a0;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i26 = this.f37497x;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h2 = c11602h1.m31044t().f168487e.f65018d;
                C11636x c11636x = new C11636x(i14, i15, interfaceC30057d);
                this.f37497x = 1;
                Object objM36616z = AbstractC13091v.m36616z(c13045h2, c11636x, this);
                return objM36616z == enumC31071a6 ? enumC31071a6 : objM36616z;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i27 = this.f37497x;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    ((C23468n) obj).getClass();
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C26377x1 c26377x2 = c11602h1.f37450l;
                C11632v c11632v2 = new C11632v(c11602h1, interfaceC30057d, i16);
                this.f37497x = 1;
                return c26377x2.m78095c("publisherRejoin", c11632v2, this) == enumC31071a7 ? enumC31071a7 : c23454a0;
            case 7:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i28 = this.f37497x;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h3 = c11602h1.f37440b.m105817h().f139757e.f139354k;
                C11604i0 c11604i0 = new C11604i0(c11602h1, null);
                this.f37497x = 1;
                return AbstractC13091v.m36604n(c13045h3, c11604i0, this) == enumC31071a8 ? enumC31071a8 : c23454a0;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                int i29 = this.f37497x;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h4 = c11602h1.f37440b.m105817h().f139758f.f139200k;
                C11552o c11552o = new C11552o(c11602h1, interfaceC30057d, 5);
                this.f37497x = 1;
                return AbstractC13091v.m36604n(c13045h4, c11552o, this) == enumC31071a9 ? enumC31071a9 : c23454a0;
            case 9:
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                int i34 = this.f37497x;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h5 = c11602h1.f37440b.m105817h().f139760h.f139387c;
                C11607j0 c11607j0 = new C11607j0(c11602h1, null);
                this.f37497x = 1;
                return AbstractC13091v.m36604n(c13045h5, c11607j0, this) == enumC31071a10 ? enumC31071a10 : c23454a0;
            case 10:
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                int i35 = this.f37497x;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h6 = c11602h1.f37440b.f139302p.f139680v.f81695j;
                C11612l c11612l3 = new C11612l(c11602h1, i14);
                this.f37497x = 1;
                c13045h6.collect(c11612l3, this);
                return enumC31071a11;
            case 11:
                EnumC31071a enumC31071a12 = EnumC31071a.f128113w;
                int i36 = this.f37497x;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C33368c0 c33368c0 = c11602h1.f37440b;
                WebsocketReconnectStrategy websocketReconnectStrategy = WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_FAST;
                this.f37497x = 1;
                return c33368c0.m105824s(websocketReconnectStrategy, "SFU:healthcheck-timeout", this) == enumC31071a12 ? enumC31071a12 : c23454a0;
            case 12:
                EnumC31071a enumC31071a13 = EnumC31071a.f128113w;
                int i37 = this.f37497x;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h7 = c11602h1.m31044t().f168487e.f65018d;
                C11612l c11612l4 = new C11612l(c11602h1, 3);
                this.f37497x = 1;
                c13045h7.collect(c11612l4, this);
                return enumC31071a13;
            default:
                EnumC31071a enumC31071a14 = EnumC31071a.f128113w;
                int i38 = this.f37497x;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C13096w1 c13096w3 = c11602h1.m31044t().f168487e.f65019e;
                C11612l c11612l5 = new C11612l(c11602h1, 4);
                this.f37497x = 1;
                c13096w3.getClass();
                C13096w1.m36617k(c13096w3, c11612l5, this);
                return enumC31071a14;
        }
    }
}
