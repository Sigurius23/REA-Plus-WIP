package ud3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud3.a0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34798a0 {
    public static final C34851y Companion = new C34851y();
    public static final AbstractC34798a0 NONE = new C34849x();

    public void cacheConditionalHit(InterfaceC34821j call, C34850x0 cachedResponse) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(cachedResponse, "cachedResponse");
    }

    public void cacheHit(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
    }

    public void cacheMiss(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void callEnd(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void callFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
    }

    public void callStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void canceled(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void connectEnd(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC34828m0 enumC34828m0) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
    }

    public void connectFailed(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC34828m0 enumC34828m0, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        AbstractC22676k.m65750j(ioe, "ioe");
    }

    public void connectStart(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
    }

    public void connectionAcquired(InterfaceC34821j call, InterfaceC34833p connection) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(connection, "connection");
    }

    public void connectionReleased(InterfaceC34821j call, InterfaceC34833p connection) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(connection, "connection");
    }

    public void dispatcherQueueEnd(InterfaceC34821j call, C34843u dispatcher) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
    }

    public void dispatcherQueueStart(InterfaceC34821j call, C34843u dispatcher) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
    }

    public void dnsEnd(InterfaceC34821j call, String domainName, List<InetAddress> inetAddressList) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(domainName, "domainName");
        AbstractC22676k.m65750j(inetAddressList, "inetAddressList");
    }

    public void dnsStart(InterfaceC34821j call, String domainName) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(domainName, "domainName");
    }

    public void followUpDecision(InterfaceC34821j call, C34850x0 networkResponse, C34832o0 c34832o0) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(networkResponse, "networkResponse");
    }

    public final AbstractC34798a0 plus(AbstractC34798a0 other) {
        AbstractC22676k.m65750j(other, "other");
        AbstractC34798a0 abstractC34798a0 = NONE;
        if (this == abstractC34798a0) {
            return other;
        }
        AbstractC34798a0[] abstractC34798a0ArrM109928a = this instanceof C34847w ? ((C34847w) this).m109928a() : new AbstractC34798a0[]{this};
        if (other == abstractC34798a0) {
            return this;
        }
        return new C34847w((AbstractC34798a0[]) AbstractC25260n.m74032H0(abstractC34798a0ArrM109928a, other instanceof C34847w ? ((C34847w) other).m109928a() : new AbstractC34798a0[]{other}));
    }

    public void proxySelectEnd(InterfaceC34821j call, C34810e0 url, List<Proxy> proxies) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(proxies, "proxies");
    }

    public void proxySelectStart(InterfaceC34821j call, C34810e0 url) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(url, "url");
    }

    public void requestBodyEnd(InterfaceC34821j call, long j7) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void requestBodyStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void requestFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
    }

    public void requestHeadersEnd(InterfaceC34821j call, C34832o0 request) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(request, "request");
    }

    public void requestHeadersStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void responseBodyEnd(InterfaceC34821j call, long j7) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void responseBodyStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void responseFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
    }

    public void responseHeadersEnd(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
    }

    public void responseHeadersStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void retryDecision(InterfaceC34821j call, IOException exception, boolean z4) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(exception, "exception");
    }

    public void satisfactionFailure(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
    }

    public void secureConnectEnd(InterfaceC34821j call, C34804c0 c34804c0) {
        AbstractC22676k.m65750j(call, "call");
    }

    public void secureConnectStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
    }
}
