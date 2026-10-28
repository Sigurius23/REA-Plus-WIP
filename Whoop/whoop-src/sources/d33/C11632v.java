package d33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import h53.C16941f;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import t23.C33368c0;

/* JADX INFO: renamed from: d33.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C11632v extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37569w;

    /* JADX INFO: renamed from: x */
    public int f37570x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11602h1 f37571y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11632v(C11602h1 c11602h1, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f37569w = i13;
        this.f37571y = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f37569w) {
            case 0:
                return new C11632v(this.f37571y, interfaceC30057d, 0);
            default:
                return new C11632v(this.f37571y, interfaceC30057d, 1);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f37569w) {
            case 0:
                break;
        }
        return ((C11632v) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37569w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f37570x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16941f c16941f = this.f37571y.m31044t().f168487e;
                    this.f37570x = 1;
                    if (c16941f.m47701i(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                C11602h1 c11602h1 = this.f37571y;
                C33368c0 c33368c0 = c11602h1.f37440b;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f37570x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2345k c2345kM31043s = c11602h1.m31043s();
                    InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
                    String str = c2345kM31043s.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        c2345kM31043s.f9274b.log(enumC2341g, str, AbstractC18489d0.m53369j(c33368c0.f139302p.f139652h.getValue(), "[createPublisher] rejoin attempt EXECUTE, connection state: ", " "), null);
                    }
                    this.f37570x = 1;
                    c33368c0.getClass();
                    Object objM105824s = c33368c0.m105824s(WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_REJOIN, "Publisher#ERROR_CODE_REQUEST_VALIDATION_FAILED", this);
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
        }
    }
}
