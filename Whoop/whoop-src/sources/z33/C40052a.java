package z33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import f53.C14118f;
import f53.C14122j;
import g53.C15511p;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import t23.C33368c0;
import t23.C33399i;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: z33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C40052a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172850w;

    /* JADX INFO: renamed from: x */
    public Iterator f172851x;

    /* JADX INFO: renamed from: y */
    public int f172852y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Set f172853z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40052a(Set set, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f172850w = i13;
        this.f172853z = set;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f172850w) {
            case 0:
                return new C40052a(this.f172853z, interfaceC30057d, 0);
            default:
                return new C40052a(this.f172853z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f172850w) {
            case 0:
                break;
        }
        return ((C40052a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Object objM124995a;
        Iterator it3;
        Object objM56579B;
        switch (this.f172850w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f172852y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    it = this.f172853z.iterator();
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f172851x;
                    AbstractC34132o.m107864I(obj);
                }
                while (it.hasNext()) {
                    C14118f c14118f = (C14118f) it.next();
                    this.f172851x = it;
                    this.f172852y = 1;
                    switch (c14118f.f50733a) {
                        case 0:
                            C20378c c20378c = ((C14122j) c14118f.f50734b).f50758l;
                            C2345k c2345kM56591t = c20378c.m56591t();
                            InterfaceC2339e interfaceC2339e = c2345kM56591t.f9275c;
                            EnumC2341g enumC2341g = EnumC2341g.INFO;
                            String str = c2345kM56591t.f9273a;
                            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                c2345kM56591t.f9274b.log(enumC2341g, str, "[onNetworkAvailable] no args", null);
                            }
                            objM124995a = c20378c.m56594w().m124995a(C15511p.f58181a, this);
                            EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                            C23454a0 c23454a0 = C23454a0.f92919a;
                            if (objM124995a != enumC31071a2) {
                                objM124995a = c23454a0;
                            }
                            if (objM124995a != enumC31071a2) {
                                objM124995a = c23454a0;
                            }
                            break;
                        default:
                            C33368c0 c33368c0 = (C33368c0) c14118f.f50734b;
                            C2996c2 c2996c2 = c33368c0.f139280O;
                            if (c2996c2 != null) {
                                c2996c2.cancel((CancellationException) null);
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis() - c33368c0.f139281P;
                            C2345k c2345kM105816g = c33368c0.m105816g();
                            InterfaceC2339e interfaceC2339e2 = c2345kM105816g.f9275c;
                            String str2 = c2345kM105816g.f9273a;
                            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                                InterfaceC2344j interfaceC2344j = c2345kM105816g.f9274b;
                                long j7 = c33368c0.f139281P;
                                int i14 = c33368c0.f139282Q;
                                StringBuilder sbM125596b = AbstractC39383f.m125596b(jCurrentTimeMillis, "[NetworkStateListener#onConnected] #network; no args, elapsedTimeMils:", ", lastDisconnect:");
                                sbM125596b.append(j7);
                                sbM125596b.append(", reconnectDeadlineMils:");
                                sbM125596b.append(i14);
                                interfaceC2344j.log(enumC2341g2, str2, sbM125596b.toString(), null);
                            }
                            objM124995a = c33368c0.m105824s((c33368c0.f139281P <= 0 || jCurrentTimeMillis >= ((long) c33368c0.f139282Q)) ? WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_REJOIN : WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_FAST, "NetworkStateListener#onConnected", this);
                            if (objM124995a != EnumC31071a.f128113w) {
                                objM124995a = C23454a0.f92919a;
                            }
                            break;
                    }
                    if (objM124995a == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f172852y;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    it3 = this.f172853z.iterator();
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it3 = this.f172851x;
                    AbstractC34132o.m107864I(obj);
                }
                while (it3.hasNext()) {
                    C14118f c14118f2 = (C14118f) it3.next();
                    this.f172851x = it3;
                    this.f172852y = 1;
                    switch (c14118f2.f50733a) {
                        case 0:
                            objM56579B = ((C14122j) c14118f2.f50734b).f50758l.m56579B(this);
                            if (objM56579B != EnumC31071a.f128113w) {
                                objM56579B = C23454a0.f92919a;
                            }
                            break;
                        default:
                            C33368c0 c33368c1 = (C33368c0) c14118f2.f50734b;
                            C2345k c2345kM105816g2 = c33368c1.m105816g();
                            InterfaceC2339e interfaceC2339e3 = c2345kM105816g2.f9275c;
                            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
                            String str3 = c2345kM105816g2.f9273a;
                            InterfaceC30057d interfaceC30057d = null;
                            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                                InterfaceC2344j interfaceC2344j2 = c2345kM105816g2.f9274b;
                                long j13 = c33368c1.f139281P;
                                long j14 = c33368c1.f139293g.f139243P;
                                StringBuilder sbM125596b2 = AbstractC39383f.m125596b(j13, "[NetworkStateListener#onDisconnected] #network; old lastDisconnect:", ", clientImpl.leaveAfterDisconnectSeconds:");
                                sbM125596b2.append(j14);
                                interfaceC2344j2.log(enumC2341g3, str3, sbM125596b2.toString(), null);
                            }
                            c33368c1.f139281P = System.currentTimeMillis();
                            C2345k c2345kM105816g3 = c33368c1.m105816g();
                            InterfaceC2339e interfaceC2339e4 = c2345kM105816g3.f9275c;
                            String str4 = c2345kM105816g3.f9273a;
                            if (interfaceC2339e4.isLoggable(enumC2341g3, str4)) {
                                c2345kM105816g3.f9274b.log(enumC2341g3, str4, AbstractC11895b.m31994m(c33368c1.f139281P, "[NetworkStateListener#onDisconnected] #network; new lastDisconnect:"), null);
                            }
                            c33368c1.f139280O = AbstractC3006f0.m8732z(c33368c1.f139300n, null, null, new C33399i(c33368c1, interfaceC30057d, 2), 3);
                            C2345k c2345kM105816g4 = c33368c1.m105816g();
                            InterfaceC2339e interfaceC2339e5 = c2345kM105816g4.f9275c;
                            String str5 = c2345kM105816g4.f9273a;
                            if (interfaceC2339e5.isLoggable(enumC2341g3, str5)) {
                                c2345kM105816g4.f9274b.log(enumC2341g3, str5, AbstractC11895b.m31994m(c33368c1.f139281P, "[NetworkStateListener#onDisconnected] #network; at "), null);
                            }
                            objM56579B = C23454a0.f92919a;
                            break;
                    }
                    if (objM56579B == enumC31071a3) {
                        return enumC31071a3;
                    }
                }
                return C23454a0.f92919a;
        }
    }
}
