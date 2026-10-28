package p459rf;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34798a0;
import ud3.C34804c0;
import ud3.C34810e0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.EnumC34828m0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34833p;

/* JADX INFO: renamed from: rf.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C31330a extends AbstractC34798a0 {

    /* JADX INFO: renamed from: a */
    public final List f128923a;

    /* JADX INFO: renamed from: b */
    public final List f128924b;

    public C31330a(List list) {
        this.f128923a = list;
        this.f128924b = AbstractC25265s.m74138n1(list);
    }

    @Override // ud3.AbstractC34798a0
    public final void cacheConditionalHit(InterfaceC34821j call, C34850x0 cachedResponse) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(cachedResponse, "cachedResponse");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).cacheConditionalHit(call, cachedResponse);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void cacheHit(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).cacheHit(call, response);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void cacheMiss(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).cacheMiss(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void callEnd(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).callEnd(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void callFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).callFailed(call, ioe);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void callStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).callStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void canceled(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).canceled(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectEnd(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC34828m0 enumC34828m0) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).connectEnd(call, inetSocketAddress, proxy, enumC34828m0);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectFailed(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC34828m0 enumC34828m0, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        AbstractC22676k.m65750j(ioe, "ioe");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).connectFailed(call, inetSocketAddress, proxy, enumC34828m0, ioe);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectStart(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).connectStart(call, inetSocketAddress, proxy);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectionAcquired(InterfaceC34821j call, InterfaceC34833p connection) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(connection, "connection");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).connectionAcquired(call, connection);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectionReleased(InterfaceC34821j call, InterfaceC34833p connection) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(connection, "connection");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).connectionReleased(call, connection);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void dnsEnd(InterfaceC34821j call, String domainName, List inetAddressList) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(domainName, "domainName");
        AbstractC22676k.m65750j(inetAddressList, "inetAddressList");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).dnsEnd(call, domainName, inetAddressList);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void dnsStart(InterfaceC34821j call, String domainName) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(domainName, "domainName");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).dnsStart(call, domainName);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void proxySelectEnd(InterfaceC34821j call, C34810e0 url, List proxies) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(proxies, "proxies");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).proxySelectEnd(call, url, proxies);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void proxySelectStart(InterfaceC34821j call, C34810e0 url) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(url, "url");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).proxySelectStart(call, url);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestBodyEnd(InterfaceC34821j call, long j7) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).requestBodyEnd(call, j7);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestBodyStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).requestBodyStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).requestFailed(call, ioe);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestHeadersEnd(InterfaceC34821j call, C34832o0 request) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(request, "request");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).requestHeadersEnd(call, request);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestHeadersStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).requestHeadersStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseBodyEnd(InterfaceC34821j call, long j7) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).responseBodyEnd(call, j7);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseBodyStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).responseBodyStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).responseFailed(call, ioe);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseHeadersEnd(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).responseHeadersEnd(call, response);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseHeadersStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).responseHeadersStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void satisfactionFailure(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).satisfactionFailure(call, response);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void secureConnectEnd(InterfaceC34821j call, C34804c0 c34804c0) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128924b.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).secureConnectEnd(call, c34804c0);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void secureConnectStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        Iterator it = this.f128923a.iterator();
        while (it.hasNext()) {
            ((AbstractC34798a0) it.next()).secureConnectStart(call);
        }
    }
}
