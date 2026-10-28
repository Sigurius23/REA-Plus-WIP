package zd3;

import bd3.C3143v;
import fe3.AbstractC14421e;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import m83.AbstractC25265s;
import m83.C25258m;
import n83.C26460c;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import ud3.AbstractC34799a1;
import ud3.C34797a;
import ud3.C34802b1;
import ud3.C34810e0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34837r;
import ud3.C34841t;
import ud3.C34850x0;
import ud3.C34854z0;
import ud3.EnumC34828m0;
import ud3.InterfaceC34808d1;
import va3.AbstractC35844b;
import wb3.AbstractC37056f;
import wd3.AbstractC37171e;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import yb3.C39412p;
import yd3.C39473d;

/* JADX INFO: renamed from: zd3.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C40574r {

    /* JADX INFO: renamed from: a */
    public final C39473d f174746a;

    /* JADX INFO: renamed from: b */
    public final C40573q f174747b;

    /* JADX INFO: renamed from: c */
    public final int f174748c;

    /* JADX INFO: renamed from: d */
    public final int f174749d;

    /* JADX INFO: renamed from: e */
    public final int f174750e;

    /* JADX INFO: renamed from: f */
    public final int f174751f;

    /* JADX INFO: renamed from: g */
    public final int f174752g;

    /* JADX INFO: renamed from: h */
    public final boolean f174753h;

    /* JADX INFO: renamed from: i */
    public final boolean f174754i;

    /* JADX INFO: renamed from: j */
    public final C34797a f174755j;

    /* JADX INFO: renamed from: k */
    public final C40576t f174756k;

    /* JADX INFO: renamed from: l */
    public final C40571o f174757l;

    /* JADX INFO: renamed from: m */
    public final boolean f174758m;

    /* JADX INFO: renamed from: n */
    public C3143v f174759n;

    /* JADX INFO: renamed from: o */
    public C40579w f174760o;

    /* JADX INFO: renamed from: p */
    public C34802b1 f174761p;

    /* JADX INFO: renamed from: q */
    public final C25258m f174762q;

    public C40574r(C39473d taskRunner, C40573q connectionPool, int i13, int i14, int i15, int i16, int i17, boolean z4, boolean z13, C34797a c34797a, C40576t routeDatabase, C40571o c40571o, C34832o0 c34832o0) {
        AbstractC22676k.m65750j(taskRunner, "taskRunner");
        AbstractC22676k.m65750j(connectionPool, "connectionPool");
        AbstractC22676k.m65750j(routeDatabase, "routeDatabase");
        this.f174746a = taskRunner;
        this.f174747b = connectionPool;
        this.f174748c = i13;
        this.f174749d = i14;
        this.f174750e = i15;
        this.f174751f = i16;
        this.f174752g = i17;
        this.f174753h = z4;
        this.f174754i = z13;
        this.f174755j = c34797a;
        this.f174756k = routeDatabase;
        this.f174757l = c40571o;
        this.f174758m = !AbstractC22676k.m65745e(c34832o0.f146713b, "GET");
        this.f174762q = new C25258m();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m131560a(C40572p c40572p) {
        C40579w c40579w;
        C34802b1 c34802b1;
        if (this.f174762q.isEmpty() && this.f174761p == null) {
            if (c40572p != null) {
                synchronized (c40572p) {
                    c34802b1 = null;
                    if (c40572p.f174736m == 0 && c40572p.f174734k && AbstractC37174h.m119134a(c40572p.f174726c.f146527a.f146519h, this.f174755j.f146519h)) {
                        c34802b1 = c40572p.f174726c;
                    }
                }
                if (c34802b1 != null) {
                    this.f174761p = c34802b1;
                    return true;
                }
            }
            C3143v c3143v = this.f174759n;
            if ((c3143v == null || c3143v.f12310x >= ((ArrayList) c3143v.f12311y).size()) && (c40579w = this.f174760o) != null) {
                return c40579w.m131565a();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final InterfaceC40578v m131561b() {
        Socket socketM131554j;
        C40575s c40575s;
        C40559c c40559cM131562c;
        String hostAddress;
        int port;
        List<InetAddress> listM118988k;
        boolean zContains;
        C40572p c40572p = this.f174757l.f174710J;
        if (c40572p == null) {
            c40575s = null;
        } else {
            boolean zM131557g = c40572p.m131557g(this.f174758m);
            synchronized (c40572p) {
                try {
                    if (zM131557g) {
                        socketM131554j = (c40572p.f174734k || !m131564e(c40572p.f174726c.f146527a.f146519h)) ? this.f174757l.m131554j() : null;
                    } else {
                        c40572p.f174734k = true;
                        socketM131554j = this.f174757l.m131554j();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f174757l.f174710J == null) {
                if (socketM131554j != null) {
                    AbstractC37174h.m119136c(socketM131554j);
                }
                C40571o c40571o = this.f174757l;
                c40571o.f174705E.connectionReleased(c40571o, c40572p);
                c40575s = null;
            } else {
                if (socketM131554j != null) {
                    throw new IllegalStateException("Check failed.");
                }
                c40575s = new C40575s(c40572p);
            }
        }
        if (c40575s != null) {
            return c40575s;
        }
        C40575s c40575sM131563d = m131563d(null, null);
        if (c40575sM131563d != null) {
            return c40575sM131563d;
        }
        if (!this.f174762q.isEmpty()) {
            return (InterfaceC40578v) this.f174762q.removeFirst();
        }
        C34802b1 c34802b1 = this.f174761p;
        if (c34802b1 != null) {
            this.f174761p = null;
            c40559cM131562c = m131562c(c34802b1, null);
        } else {
            C3143v c3143v = this.f174759n;
            if (c3143v == null || c3143v.f12310x >= ((ArrayList) c3143v.f12311y).size()) {
                C40579w c40579w = this.f174760o;
                if (c40579w == null) {
                    c40579w = new C40579w(this.f174755j, this.f174756k, this.f174757l, this.f174754i);
                    this.f174760o = c40579w;
                }
                if (!c40579w.m131565a()) {
                    throw new IOException("exhausted all routes");
                }
                if (!c40579w.m131565a()) {
                    throw new NoSuchElementException();
                }
                ArrayList arrayList = new ArrayList();
                while (c40579w.f174773f < c40579w.f174772e.size()) {
                    C34797a c34797a = c40579w.f174768a;
                    if (c40579w.f174773f >= c40579w.f174772e.size()) {
                        throw new SocketException("No route to " + c34797a.f146519h.f146565d + "; exhausted proxy configurations: " + c40579w.f174772e);
                    }
                    List list = c40579w.f174772e;
                    int i13 = c40579w.f174773f;
                    c40579w.f174773f = i13 + 1;
                    Proxy proxy = (Proxy) list.get(i13);
                    C40571o c40571o2 = c40579w.f174770c;
                    ArrayList arrayList2 = new ArrayList();
                    c40579w.f174774g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        C34810e0 c34810e0 = c34797a.f146519h;
                        hostAddress = c34810e0.f146565d;
                        port = c34810e0.f146566e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            AbstractC22676k.m65749i(hostAddress, "getHostName(...)");
                        } else {
                            hostAddress = address.getHostAddress();
                            AbstractC22676k.m65749i(hostAddress, "getHostAddress(...)");
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        C39412p c39412p = AbstractC37171e.f158957a;
                        AbstractC22676k.m65750j(hostAddress, "<this>");
                        if (AbstractC37171e.f158957a.m125851e(hostAddress)) {
                            listM118988k = AbstractC37056f.m118958J(InetAddress.getByName(hostAddress));
                        } else {
                            c40571o2.f174705E.dnsStart(c40571o2, hostAddress);
                            List<InetAddress> listLookup = c34797a.f146512a.lookup(hostAddress);
                            if (listLookup.isEmpty()) {
                                throw new UnknownHostException(c34797a.f146512a + " returned no addresses for " + hostAddress);
                            }
                            c40571o2.f174705E.dnsEnd(c40571o2, hostAddress, listLookup);
                            listM118988k = listLookup;
                        }
                        if (c40579w.f174771d && listM118988k.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listM118988k) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                byte[] bArr = AbstractC37172f.f158958a;
                                Iterator it = arrayList3.iterator();
                                Iterator it3 = arrayList4.iterator();
                                C26460c c26460cM119000x = AbstractC37056f.m119000x();
                                while (true) {
                                    if (!it.hasNext() && !it3.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        c26460cM119000x.add(it.next());
                                    }
                                    if (it3.hasNext()) {
                                        c26460cM119000x.add(it3.next());
                                    }
                                }
                                listM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                            }
                        }
                        Iterator<InetAddress> it4 = listM118988k.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(new InetSocketAddress(it4.next(), port));
                        }
                    }
                    Iterator it5 = c40579w.f174774g.iterator();
                    while (it5.hasNext()) {
                        C34802b1 c34802b2 = new C34802b1(c40579w.f174768a, proxy, (InetSocketAddress) it5.next());
                        C40576t c40576t = c40579w.f174769b;
                        synchronized (c40576t) {
                            zContains = ((LinkedHashSet) c40576t.f174764a).contains(c34802b2);
                        }
                        if (zContains) {
                            c40579w.f174775h.add(c34802b2);
                        } else {
                            arrayList.add(c34802b2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    AbstractC25265s.m74141p0(arrayList, c40579w.f174775h);
                    c40579w.f174775h.clear();
                }
                C3143v c3143v2 = new C3143v(arrayList);
                this.f174759n = c3143v2;
                if (this.f174757l.f174718R) {
                    throw new IOException("Canceled");
                }
                if (c3143v2.f12310x >= arrayList.size()) {
                    throw new NoSuchElementException();
                }
                int i14 = c3143v2.f12310x;
                c3143v2.f12310x = i14 + 1;
                c40559cM131562c = m131562c((C34802b1) arrayList.get(i14), arrayList);
            } else {
                int i15 = c3143v.f12310x;
                ArrayList arrayList5 = (ArrayList) c3143v.f12311y;
                if (i15 >= arrayList5.size()) {
                    throw new NoSuchElementException();
                }
                int i16 = c3143v.f12310x;
                c3143v.f12310x = i16 + 1;
                c40559cM131562c = m131562c((C34802b1) arrayList5.get(i16), null);
            }
        }
        C40575s c40575sM131563d2 = m131563d(c40559cM131562c, c40559cM131562c.f174658l);
        return c40575sM131563d2 != null ? c40575sM131563d2 : c40559cM131562c;
    }

    /* JADX INFO: renamed from: c */
    public final C40559c m131562c(C34802b1 route, ArrayList arrayList) throws UnknownServiceException {
        AbstractC22676k.m65750j(route, "route");
        C34797a c34797a = route.f146527a;
        if (c34797a.f146514c == null) {
            if (!c34797a.f146521j.contains(C34837r.f146725f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f146527a.f146519h.f146565d;
            AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
            if (!AbstractC14421e.f52594a.mo41120i(str)) {
                throw new UnknownServiceException(AbstractC11895b.m31996o("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c34797a.f146520i.contains(EnumC34828m0.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        C34832o0 c34832o0 = null;
        if (route.f146528b.type() == Proxy.Type.HTTP) {
            C34797a c34797a2 = route.f146527a;
            if (c34797a2.f146514c != null || c34797a2.f146520i.contains(EnumC34828m0.H2_PRIOR_KNOWLEDGE)) {
                C34830n0 c34830n0 = new C34830n0();
                C34810e0 url = route.f146527a.f146519h;
                AbstractC22676k.m65750j(url, "url");
                c34830n0.f146687a = url;
                c34830n0.m109904e("CONNECT", null);
                C34797a c34797a3 = route.f146527a;
                c34830n0.m109902c("Host", AbstractC37174h.m119142i(c34797a3.f146519h, true));
                c34830n0.m109902c("Proxy-Connection", "Keep-Alive");
                c34830n0.m109902c("User-Agent", "okhttp/5.3.2");
                C34832o0 c34832o1 = new C34832o0(c34830n0);
                C34854z0 c34854z0 = AbstractC34799a1.f146522x;
                C34841t c34841t = InterfaceC34808d1.f146549A;
                C22677k0 c22677k0 = new C22677k0(2, false);
                EnumC34828m0 enumC34828m0 = EnumC34828m0.HTTP_1_1;
                AbstractC35844b.m113764e("Proxy-Authenticate");
                AbstractC35844b.m113765f("OkHttp-Preemptive", "Proxy-Authenticate");
                c22677k0.m65769j("Proxy-Authenticate");
                AbstractC35844b.m113761b(c22677k0, "Proxy-Authenticate", "OkHttp-Preemptive");
                C34832o0 c34832o0Mo31437a = c34797a3.f146517f.mo31437a(route, new C34850x0(c34832o1, enumC34828m0, "Preemptive Authenticate", 407, null, c22677k0.m65766g(), c34854z0, null, null, null, null, -1L, -1L, null, c34841t));
                c34832o0 = c34832o0Mo31437a == null ? c34832o1 : c34832o0Mo31437a;
            }
        }
        return new C40559c(this.f174746a, this.f174747b, this.f174748c, this.f174749d, this.f174750e, this.f174751f, this.f174752g, this.f174753h, this.f174757l, this, route, arrayList, 0, c34832o0, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x0036, B:22:0x0043, B:25:0x004a), top: B:51:0x0036 }] */
    /* JADX INFO: renamed from: d */
    public final C40575s m131563d(C40559c c40559c, List list) {
        C40572p c40572p;
        boolean z4;
        Socket socketM131554j;
        C40573q c40573q = this.f174747b;
        boolean z13 = this.f174758m;
        C34797a c34797a = this.f174755j;
        C40571o c40571o = this.f174757l;
        boolean z14 = c40559c != null && c40559c.mo131523b();
        c40573q.getClass();
        Iterator it = c40573q.f174745d.iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                c40572p = null;
                break;
            }
            c40572p = (C40572p) it.next();
            AbstractC22676k.m65747g(c40572p);
            synchronized (c40572p) {
                if (z14) {
                    try {
                        if (!(c40572p.f174733j != null)) {
                            z4 = false;
                        } else if (c40572p.m131556f(c34797a, list)) {
                            c40571o.m131546b(c40572p);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } else if (c40572p.m131556f(c34797a, list)) {
                    z4 = false;
                } else {
                    c40571o.m131546b(c40572p);
                    z4 = true;
                }
            }
            if (z4) {
                if (c40572p.m131557g(z13)) {
                    break;
                }
                synchronized (c40572p) {
                    c40572p.f174734k = true;
                    socketM131554j = c40571o.m131554j();
                }
                if (socketM131554j != null) {
                    AbstractC37174h.m119136c(socketM131554j);
                }
            }
        }
        if (c40572p == null) {
            return null;
        }
        if (c40559c != null) {
            this.f174761p = c40559c.f174657k;
            Socket socket = c40559c.f174665s;
            if (socket != null) {
                AbstractC37174h.m119136c(socket);
            }
        }
        C40571o c40571o2 = this.f174757l;
        c40571o2.f174705E.connectionAcquired(c40571o2, c40572p);
        return new C40575s(c40572p);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m131564e(C34810e0 url) {
        AbstractC22676k.m65750j(url, "url");
        C34810e0 c34810e0 = this.f174755j.f146519h;
        return url.f146566e == c34810e0.f146566e && AbstractC22676k.m65745e(url.f146565d, c34810e0.f146565d);
    }
}
