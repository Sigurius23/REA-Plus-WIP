package t23;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d33.C11602h1;
import e33.C12662v0;
import ec3.C13045h2;
import ec3.C13096w1;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import stream.video.sfu.models.WebsocketReconnectStrategy;

/* JADX INFO: renamed from: t23.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C33399i extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139471w;

    /* JADX INFO: renamed from: x */
    public int f139472x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33368c0 f139473y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33399i(C33368c0 c33368c0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f139471w = i13;
        this.f139473y = c33368c0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f139471w) {
            case 0:
                return new C33399i(this.f139473y, interfaceC30057d, 0);
            case 1:
                return new C33399i(this.f139473y, interfaceC30057d, 1);
            case 2:
                return new C33399i(this.f139473y, interfaceC30057d, 2);
            case 3:
                return new C33399i(this.f139473y, interfaceC30057d, 3);
            default:
                return new C33399i(this.f139473y, interfaceC30057d, 4);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f139471w) {
            case 0:
                ((C33399i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 1:
                return ((C33399i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C33399i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C33399i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C33399i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C13045h2 c13045h2;
        C12662v0 c12662v0;
        C13045h2 c13045h3;
        switch (this.f139471w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f139472x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C33368c0 c33368c0 = this.f139473y;
                C13045h2 c13045h4 = (C13045h2) c33368c0.f139310x.f221E;
                C33394h c33394h = new C33394h(c33368c0, 0);
                this.f139472x = 1;
                c13045h4.collect(c33394h, this);
                return enumC31071a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f139472x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f139472x = 1;
                    Object objM105824s = this.f139473y.m105824s(WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_MIGRATE, "migrate", this);
                    if (objM105824s != enumC31071a2) {
                        objM105824s = c23454a0;
                    }
                    if (objM105824s == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            case 2:
                C33368c0 c33368c1 = this.f139473y;
                C33366b4 c33366b4 = c33368c1.f139293g;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f139472x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    long j7 = c33366b4.f139243P * ((long) 1000);
                    this.f139472x = 1;
                    if (AbstractC3034m0.m8782b(j7, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                InterfaceC33442q2 interfaceC33442q2 = (InterfaceC33442q2) c33368c1.f139302p.f139652h.getValue();
                boolean z4 = interfaceC33442q2 instanceof C33397h2;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (z4) {
                    C2345k c2345kM105816g = c33368c1.m105816g();
                    InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
                    String str = c2345kM105816g.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        c2345kM105816g.f9274b.log(enumC2341g, str, "[NetworkStateListener#onDisconnected] #network; Already reconnected (" + interfaceC33442q2 + ") — not leaving", null);
                    }
                } else {
                    String strM31994m = AbstractC11895b.m31994m(c33366b4.f139243P, "Leaving after being disconnected for ");
                    C2345k c2345kM105816g2 = c33368c1.m105816g();
                    InterfaceC2339e interfaceC2339e2 = c2345kM105816g2.f9275c;
                    String str2 = c2345kM105816g2.f9273a;
                    EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                        c2345kM105816g2.f9274b.log(enumC2341g2, str2, "[NetworkStateListener#onDisconnected] #network; Leaving after being disconnected for " + c33366b4.f139243P + " (connection=" + interfaceC33442q2 + ")", null);
                    }
                    c33368c1.m105823p(new C33374d0(EnumC33389g.LEAVE_TIMEOUT_AFTER_DISCONNECT, strM31994m));
                }
                return c23454a1;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f139472x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C33368c0 c33368c2 = this.f139473y;
                C11602h1 c11602h1 = (C11602h1) c33368c2.f139268C.getValue();
                if (c11602h1 == null) {
                    return C23454a0.f92919a;
                }
                C13096w1 c13096w1 = c11602h1.m31044t().f168487e.f65019e;
                C33394h c33394h2 = new C33394h(c33368c2, 1);
                this.f139472x = 1;
                c13096w1.getClass();
                C13096w1.m36617k(c13096w1, c33394h2, this);
                return enumC31071a4;
            default:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f139472x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C33368c0 c33368c3 = this.f139473y;
                C11602h1 c11602h2 = (C11602h1) c33368c3.f139268C.getValue();
                if (c11602h2 == null || (c13045h2 = c11602h2.f37464z) == null || (c12662v0 = (C12662v0) c13045h2.getValue()) == null || (c13045h3 = c12662v0.f43279s) == null) {
                    return C23454a0.f92919a;
                }
                C33474x c33474x = new C33474x(c33368c3);
                this.f139472x = 1;
                c13045h3.collect(c33474x, this);
                return enumC31071a5;
        }
    }
}
