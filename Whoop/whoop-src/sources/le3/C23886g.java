package le3;

import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ne3.AbstractC26602a;
import ne3.C26616h;
import ne3.C26622k;
import ne3.C26624l;
import ne3.InterfaceC26631o0;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p474s.C31983m2;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import qg3.C30352d;
import r80.AbstractC31061c;
import ud3.AbstractC34798a0;
import ud3.AbstractC34814f1;
import ud3.C34807d0;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.EnumC34828m0;
import ud3.InterfaceC34811e1;
import vd1.C35909c;
import wb3.AbstractC37056f;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import yd3.C39472c;
import yd3.C39473d;
import zd3.C40571o;

/* JADX INFO: renamed from: le3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C23886g implements InterfaceC34811e1, InterfaceC23888i {

    /* JADX INFO: renamed from: y */
    public static final List f94444y = AbstractC37056f.m118958J(EnumC34828m0.HTTP_1_1);

    /* JADX INFO: renamed from: a */
    public final C34832o0 f94445a;

    /* JADX INFO: renamed from: b */
    public final AbstractC34814f1 f94446b;

    /* JADX INFO: renamed from: c */
    public final Random f94447c;

    /* JADX INFO: renamed from: d */
    public final long f94448d;

    /* JADX INFO: renamed from: e */
    public C23887h f94449e;

    /* JADX INFO: renamed from: f */
    public final long f94450f;

    /* JADX INFO: renamed from: g */
    public final long f94451g;

    /* JADX INFO: renamed from: h */
    public final String f94452h;

    /* JADX INFO: renamed from: i */
    public C40571o f94453i;

    /* JADX INFO: renamed from: j */
    public C23885f f94454j;

    /* JADX INFO: renamed from: k */
    public C23889j f94455k;

    /* JADX INFO: renamed from: l */
    public C23890k f94456l;

    /* JADX INFO: renamed from: m */
    public final C39472c f94457m;

    /* JADX INFO: renamed from: n */
    public String f94458n;

    /* JADX INFO: renamed from: o */
    public C31983m2 f94459o;

    /* JADX INFO: renamed from: p */
    public final ArrayDeque f94460p;

    /* JADX INFO: renamed from: q */
    public final ArrayDeque f94461q;

    /* JADX INFO: renamed from: r */
    public long f94462r;

    /* JADX INFO: renamed from: s */
    public boolean f94463s;

    /* JADX INFO: renamed from: t */
    public int f94464t;

    /* JADX INFO: renamed from: u */
    public String f94465u;

    /* JADX INFO: renamed from: v */
    public boolean f94466v;

    /* JADX INFO: renamed from: w */
    public int f94467w;

    /* JADX INFO: renamed from: x */
    public boolean f94468x;

    public C23886g(C39473d taskRunner, C34832o0 originalRequest, AbstractC34814f1 listener, Random random, long j7, long j13, long j14) {
        AbstractC22676k.m65750j(taskRunner, "taskRunner");
        AbstractC22676k.m65750j(originalRequest, "originalRequest");
        AbstractC22676k.m65750j(listener, "listener");
        this.f94445a = originalRequest;
        this.f94446b = listener;
        this.f94447c = random;
        this.f94448d = j7;
        this.f94449e = null;
        this.f94450f = j13;
        this.f94451g = j14;
        this.f94457m = taskRunner.m126126d();
        this.f94460p = new ArrayDeque();
        this.f94461q = new ArrayDeque();
        this.f94464t = -1;
        String str = originalRequest.f146713b;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(AbstractC11266d.m30461o("Request must be GET: ", str).toString());
        }
        C26622k c26622k = C26624l.f105882z;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f94452h = AbstractC26602a.m79146b(C26622k.m79242c(-1234567890, bArr).f105883w);
    }

    /* JADX INFO: renamed from: d */
    public static void m70159d(C23886g c23886g, Exception exc, C34850x0 c34850x0, int i13) {
        C23890k c23890k;
        if ((i13 & 2) != 0) {
            c34850x0 = null;
        }
        boolean z4 = (i13 & 4) == 0;
        c23886g.getClass();
        C22669g0 c22669g0 = new C22669g0();
        synchronized (c23886g) {
            try {
                if (c23886g.f94466v) {
                    return;
                }
                c23886g.f94466v = true;
                C31983m2 c31983m2 = c23886g.f94459o;
                C23890k c23890k2 = c23886g.f94456l;
                c22669g0.f89336w = c23890k2;
                c23886g.f94456l = null;
                if (!z4 && c23890k2 != null) {
                    C39472c.m126116c(c23886g.f94457m, c23886g.f94458n + " writer close", 0L, new C23882c(c22669g0, 0), 2);
                }
                c23886g.f94457m.m126122g();
                try {
                    c23886g.f94446b.onFailure(c23886g, exc, c34850x0);
                } finally {
                    if (c31983m2 != null) {
                        c31983m2.cancel();
                    }
                    if (z4 && (c23890k = (C23890k) c22669g0.f89336w) != null) {
                        AbstractC37172f.m119117b(c23890k);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC26631o0 m70160a(C34850x0 c34850x0) {
        C34807d0 c34807d0 = c34850x0.f146777F;
        int i13 = c34850x0.f146792z;
        if (i13 != 101) {
            StringBuilder sb4 = new StringBuilder("Expected HTTP 101 response but was '");
            sb4.append(i13);
            sb4.append(' ');
            throw new ProtocolException(AbstractC25012a.m73377j(sb4, c34850x0.f146791y, '\''));
        }
        String strM109863a = c34807d0.m109863a("Connection");
        if (strM109863a == null) {
            strM109863a = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strM109863a)) {
            throw new ProtocolException(AbstractC31061c.m95633i('\'', "Expected 'Connection' header value 'Upgrade' but was '", strM109863a));
        }
        String strM109863a2 = c34807d0.m109863a("Upgrade");
        if (strM109863a2 == null) {
            strM109863a2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strM109863a2)) {
            throw new ProtocolException(AbstractC31061c.m95633i('\'', "Expected 'Upgrade' header value 'websocket' but was '", strM109863a2));
        }
        String strM109863a3 = c34807d0.m109863a("Sec-WebSocket-Accept");
        String str = strM109863a3 != null ? strM109863a3 : null;
        C26622k c26622k = C26624l.f105882z;
        String strM79146b = AbstractC26602a.m79146b(C26622k.m79241b(this.f94452h + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").mo79252c("SHA-1").f105883w);
        if (strM79146b.equals(str)) {
            InterfaceC26631o0 interfaceC26631o0 = c34850x0.f146779H;
            if (interfaceC26631o0 != null) {
                return interfaceC26631o0;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strM79146b + "' but was '" + str + '\'');
    }

    /* JADX INFO: renamed from: b */
    public final boolean m70161b(int i13, String str) {
        String str2;
        long j7 = this.f94451g;
        synchronized (this) {
            C26624l c26624lM79241b = null;
            try {
                if (i13 < 1000 || i13 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i13;
                } else if ((1004 > i13 || i13 >= 1007) && (1015 > i13 || i13 >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i13 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    C26622k c26622k = C26624l.f105882z;
                    c26624lM79241b = C26622k.m79241b(str);
                    if (c26624lM79241b.f105883w.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f94466v && !this.f94463s) {
                    this.f94463s = true;
                    this.f94461q.add(new C23883d(i13, j7, c26624lM79241b));
                    m70164f();
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m70162c(C34826l0 c34826l0) {
        C34832o0 c34832o0 = this.f94445a;
        if (c34832o0.f146714c.m109863a("Sec-WebSocket-Extensions") != null) {
            m70159d(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return;
        }
        C34824k0 c34824k0M109897a = c34826l0.m109897a();
        AbstractC34798a0 eventListener = AbstractC34798a0.NONE;
        AbstractC22676k.m65750j(eventListener, "eventListener");
        TimeZone timeZone = AbstractC37174h.f158962a;
        c34824k0M109897a.f146616e = new C35909c(eventListener, 1);
        c34824k0M109897a.m109894d(f94444y);
        C34826l0 c34826l1 = new C34826l0(c34824k0M109897a);
        C34830n0 c34830n0M109907b = c34832o0.m109907b();
        c34830n0M109907b.m109902c("Upgrade", "websocket");
        c34830n0M109907b.m109902c("Connection", "Upgrade");
        c34830n0M109907b.m109902c("Sec-WebSocket-Key", this.f94452h);
        c34830n0M109907b.m109902c("Sec-WebSocket-Version", "13");
        c34830n0M109907b.m109902c("Sec-WebSocket-Extensions", "permessage-deflate");
        C34832o0 c34832o1 = new C34832o0(c34830n0M109907b);
        C40571o c40571o = new C40571o(c34826l1, c34832o1, true);
        this.f94453i = c40571o;
        c40571o.m131548d(new C30352d(22, this, c34832o1));
    }

    /* JADX INFO: renamed from: e */
    public final void m70163e() {
        int i13;
        String str;
        C23889j c23889j;
        boolean z4;
        synchronized (this) {
            try {
                i13 = this.f94464t;
                str = this.f94465u;
                c23889j = this.f94455k;
                this.f94455k = null;
                if (this.f94463s && this.f94461q.isEmpty()) {
                    C23890k c23890k = this.f94456l;
                    if (c23890k != null) {
                        this.f94456l = null;
                        C39472c.m126116c(this.f94457m, this.f94458n + " writer close", 0L, new C19683b(c23890k, 23), 2);
                    }
                    this.f94457m.m126122g();
                }
                z4 = (this.f94466v || this.f94456l != null || this.f94464t == -1) ? false : true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z4) {
            AbstractC34814f1 abstractC34814f1 = this.f94446b;
            AbstractC22676k.m65747g(str);
            abstractC34814f1.onClosed(this, i13, str);
        }
        if (c23889j != null) {
            AbstractC37172f.m119117b(c23889j);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m70164f() {
        TimeZone timeZone = AbstractC37174h.f158962a;
        C23885f c23885f = this.f94454j;
        if (c23885f != null) {
            this.f94457m.m126120d(c23885f, 0L);
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m70165g(int i13, C26624l c26624l) {
        if (!this.f94466v && !this.f94463s) {
            if (this.f94462r + ((long) c26624l.mo79253d()) > 16777216) {
                m70161b(1001, null);
                return false;
            }
            this.f94462r += (long) c26624l.mo79253d();
            this.f94461q.add(new C23884e(i13, c26624l));
            m70164f();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m70166h(String text) {
        AbstractC22676k.m65750j(text, "text");
        C26622k c26622k = C26624l.f105882z;
        return m70165g(1, C26622k.m79241b(text));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m70167i() {
        C23890k c23890k;
        Object obj;
        String str;
        synchronized (this) {
            try {
                boolean z4 = false;
                if (this.f94466v) {
                    return false;
                }
                C23890k c23890k2 = this.f94456l;
                Object objPoll = this.f94460p.poll();
                String str2 = null;
                int i13 = -1;
                if (objPoll == null) {
                    Object objPoll2 = this.f94461q.poll();
                    if (objPoll2 instanceof C23883d) {
                        int i14 = this.f94464t;
                        str = this.f94465u;
                        if (i14 != -1) {
                            C23890k c23890k3 = this.f94456l;
                            this.f94456l = null;
                            if (c23890k3 != null && this.f94455k == null) {
                                z4 = true;
                            }
                            this.f94457m.m126122g();
                            c23890k = c23890k3;
                            i13 = i14;
                            obj = objPoll2;
                        } else {
                            long j7 = ((C23883d) objPoll2).f94439c;
                            C39472c.m126116c(this.f94457m, this.f94458n + " cancel", TimeUnit.MILLISECONDS.toNanos(j7), new C19683b(this, 24), 4);
                            i13 = i14;
                            obj = objPoll2;
                            c23890k = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        obj = objPoll2;
                        c23890k = null;
                    }
                } else {
                    c23890k = null;
                    obj = null;
                    str = null;
                }
                try {
                    if (objPoll != null) {
                        AbstractC22676k.m65747g(c23890k2);
                        c23890k2.m70171b(10, (C26624l) objPoll);
                    } else if (obj instanceof C23884e) {
                        AbstractC22676k.m65747g(c23890k2);
                        c23890k2.m70172h(((C23884e) obj).f94440a, ((C23884e) obj).f94441b);
                        synchronized (this) {
                            this.f94462r -= (long) ((C23884e) obj).f94441b.mo79253d();
                        }
                    } else {
                        if (!(obj instanceof C23883d)) {
                            throw new AssertionError();
                        }
                        AbstractC22676k.m65747g(c23890k2);
                        int i15 = ((C23883d) obj).f94437a;
                        C26624l c26624l = ((C23883d) obj).f94438b;
                        C26624l c26624lMo79218m0 = C26624l.f105881E;
                        if (i15 != 0 || c26624l != null) {
                            if (i15 != 0) {
                                if (i15 < 1000 || i15 >= 5000) {
                                    str2 = "Code must be in range [1000,5000): " + i15;
                                } else if ((1004 <= i15 && i15 < 1007) || (1015 <= i15 && i15 < 3000)) {
                                    str2 = "Code " + i15 + " is reserved and may not be used.";
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            C26616h c26616h = new C26616h();
                            c26616h.m79228r1(i15);
                            if (c26624l != null) {
                                c26616h.m79217l1(c26624l);
                            }
                            c26624lMo79218m0 = c26616h.mo79218m0(c26616h.f105866x);
                        }
                        try {
                            c23890k2.m70171b(8, c26624lMo79218m0);
                            c23890k2.f94492H = true;
                            if (z4) {
                                AbstractC34814f1 abstractC34814f1 = this.f94446b;
                                AbstractC22676k.m65747g(str);
                                abstractC34814f1.onClosed(this, i13, str);
                            }
                        } catch (Throwable th3) {
                            c23890k2.f94492H = true;
                            throw th3;
                        }
                    }
                    if (c23890k != null) {
                        AbstractC37172f.m119117b(c23890k);
                    }
                    return true;
                } catch (Throwable th4) {
                    if (c23890k != null) {
                        AbstractC37172f.m119117b(c23890k);
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
