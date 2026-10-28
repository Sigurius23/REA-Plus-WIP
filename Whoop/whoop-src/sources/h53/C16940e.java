package h53;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import c53.C4255a;
import e53.C12745d;
import f53.C14114b;
import f53.C14116d;
import i53.AbstractC18138j;
import i53.C18129a;
import i53.C18140l;
import i53.C18141m;
import i53.C18145q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l83.C23454a0;
import l83.C23470p;
import n23.AbstractC26202e;
import n23.C26200c;
import p408q.C29662f;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import qg3.C30352d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import t33.AbstractC33529a;
import u33.EnumC34512e;
import v33.AbstractC35638w;
import v33.C35629n;
import v33.C35637v;
import v33.C35639x;
import x43.AbstractC37979k;
import x43.C37976h;
import x43.C37981m;

/* JADX INFO: renamed from: h53.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C16940e {

    /* JADX INFO: renamed from: a */
    public Object f64998a;

    /* JADX INFO: renamed from: b */
    public Object f64999b;

    /* JADX INFO: renamed from: c */
    public Object f65000c;

    /* JADX INFO: renamed from: d */
    public Object f65001d;

    /* JADX INFO: renamed from: e */
    public Object f65002e;

    /* JADX INFO: renamed from: f */
    public Object f65003f;

    /* JADX INFO: renamed from: g */
    public Object f65004g;

    /* JADX INFO: renamed from: h */
    public Object f65005h;

    /* JADX INFO: renamed from: i */
    public Object f65006i;

    /* JADX INFO: renamed from: j */
    public Object f65007j;

    /* JADX INFO: renamed from: k */
    public Object f65008k;

    /* JADX INFO: renamed from: l */
    public Object f65009l;

    /* JADX INFO: renamed from: m */
    public Object f65010m;

    /* JADX INFO: renamed from: n */
    public Object f65011n;

    /* JADX INFO: renamed from: o */
    public Object f65012o;

    /* JADX INFO: renamed from: p */
    public Object f65013p;

    /* JADX INFO: renamed from: q */
    public Object f65014q;

    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX INFO: renamed from: a */
    public static final Object m47696a(C16940e c16940e, C37981m c37981m, C16939d c16939d) {
        Object objM124995a;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C2345k c2345kM47699d = c16940e.m47699d();
        InterfaceC2339e interfaceC2339e = c2345kM47699d.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM47699d.f9273a)) {
            c2345kM47699d.f9274b.log(enumC2341g, c2345kM47699d.f9273a, "[handleError] error: " + c37981m, null);
        }
        AbstractC26202e abstractC26202e = c37981m.f162639a;
        if (!(abstractC26202e instanceof C26200c)) {
            c16940e.m47698c(new C14116d(c37981m, 1));
            return c23454a0;
        }
        C26200c c26200c = (C26200c) abstractC26202e;
        WebsocketReconnectStrategy websocketReconnectStrategy = c37981m.f162640b;
        C30352d c30352d = (C30352d) c16940e.f65010m;
        C33647p c33647p = EnumC34512e.f145082y;
        int i13 = c26200c.f103913b;
        c33647p.getClass();
        if (EnumC34512e.f145083z.contains(Integer.valueOf(i13))) {
            C12745d c12745d = (C12745d) ((C30352d) c16940e.f65000c).f124535x;
            c12745d.getClass();
            c12745d.f43626a = "";
        }
        if (i13 == 1007 || i13 == 1006 || i13 == 2 || i13 == 4 || i13 == 1002) {
            C2345k c2345kM47699d2 = c16940e.m47699d();
            InterfaceC2339e interfaceC2339e2 = c2345kM47699d2.f9275c;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM47699d2.f9273a)) {
                c2345kM47699d2.f9274b.log(enumC2341g2, c2345kM47699d2.f9273a, "One unrecoverable error happened. Error: " + c26200c + ". Error code: " + i13, null);
            }
            C2345k c2345kM92818r = c30352d.m92818r();
            if (c2345kM92818r.f9275c.isLoggable(enumC2341g, c2345kM92818r.f9273a)) {
                c2345kM92818r.f9274b.log(enumC2341g, c2345kM92818r.f9273a, "[onUnrecoverableError] error: " + c26200c, null);
            }
            objM124995a = c30352d.m92819s().m124995a(new C18145q(c26200c), c16939d);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (objM124995a != enumC31071a) {
                objM124995a = c23454a0;
            }
            if (objM124995a != enumC31071a) {
                objM124995a = c23454a0;
            }
        } else {
            if (websocketReconnectStrategy == null) {
                websocketReconnectStrategy = WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED;
            }
            C2345k c2345kM92818r2 = c30352d.m92818r();
            if (c2345kM92818r2.f9275c.isLoggable(enumC2341g, c2345kM92818r2.f9273a)) {
                c2345kM92818r2.f9274b.log(enumC2341g, c2345kM92818r2.f9273a, "[onNetworkError] error: " + c26200c, null);
            }
            objM124995a = c30352d.m92819s().m124995a(new C18141m(c26200c, websocketReconnectStrategy), c16939d);
            EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
            if (objM124995a != enumC31071a2) {
                objM124995a = c23454a0;
            }
            if (objM124995a != enumC31071a2) {
                objM124995a = c23454a0;
            }
        }
        return objM124995a == EnumC31071a.f128113w ? objM124995a : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public static final Object m47697b(C16940e c16940e, AbstractC35638w abstractC35638w, AbstractC32269c abstractC32269c) {
        C16937b c16937b;
        C30352d c30352d = (C30352d) c16940e.f65010m;
        if (abstractC32269c instanceof C16937b) {
            c16937b = (C16937b) abstractC32269c;
            int i13 = c16937b.f64988E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16937b.f64988E = i13 - Integer.MIN_VALUE;
            } else {
                c16937b = new C16937b(c16940e, abstractC32269c);
            }
        } else {
            c16937b = new C16937b(c16940e, abstractC32269c);
        }
        Object obj = c16937b.f64991y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16937b.f64988E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC35638w instanceof C35629n) {
                C35629n c35629n = (C35629n) abstractC35638w;
                c16937b.f64989w = c16940e;
                c16937b.f64990x = c35629n;
                c16937b.f64988E = 1;
                C2345k c2345kM92818r = c30352d.m92818r();
                InterfaceC2339e interfaceC2339e = c2345kM92818r.f9275c;
                String str = c2345kM92818r.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM92818r.f9274b.log(enumC2341g, str, "[onConnected] client.id: '" + c35629n + "'", null);
                }
                Object objM124995a = c30352d.m92819s().m124995a(new C18140l(c35629n), c16937b);
                if (objM124995a != enumC31071a) {
                    objM124995a = c23454a0;
                }
                if (objM124995a == enumC31071a) {
                    return enumC31071a;
                }
            } else if ((abstractC35638w instanceof C35637v) && (((AbstractC18138j) c30352d.m92819s().f168689d.getValue()) instanceof C18129a)) {
                ((C37976h) c16940e.f65013p).m121613a();
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC35638w = c16937b.f64990x;
            c16940e = c16937b.f64989w;
            AbstractC34132o.m107864I(obj);
        }
        Iterator it = ((LinkedHashSet) c16940e.f65009l).iterator();
        while (it.hasNext()) {
            ((AbstractC37979k) it.next()).mo40223h(abstractC35638w);
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: c */
    public void m47698c(Function1 function1) {
        synchronized (((LinkedHashSet) this.f65009l)) {
            for (AbstractC37979k abstractC37979k : (LinkedHashSet) this.f65009l) {
                abstractC37979k.getClass();
                AbstractC3006f0.m8732z((C4255a) this.f65002e, AbstractC33529a.f139956a, null, new C14114b(function1, abstractC37979k, null, 1), 2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public C2345k m47699d() {
        return (C2345k) ((C23470p) this.f65007j).getValue();
    }

    /* JADX INFO: renamed from: e */
    public boolean m47700e(C35639x c35639x) {
        C2345k c2345kM47699d = m47699d();
        InterfaceC2339e interfaceC2339e = c2345kM47699d.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM47699d.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM47699d.f9274b.log(enumC2341g, str, "[sendEvent] event: " + c35639x, null);
        }
        C29662f c29662f = (C29662f) this.f65006i;
        if (c29662f != null) {
            return c29662f.m91079C0(c35639x);
        }
        return false;
    }
}
