package ud3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud3.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C34847w extends AbstractC34798a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC34798a0[] f146760a;

    public C34847w(AbstractC34798a0[] abstractC34798a0Arr) {
        this.f146760a = abstractC34798a0Arr;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC34798a0[] m109928a() {
        return this.f146760a;
    }

    @Override // ud3.AbstractC34798a0
    public final void cacheConditionalHit(InterfaceC34821j call, C34850x0 cachedResponse) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(cachedResponse, "cachedResponse");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.cacheConditionalHit(call, cachedResponse);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void cacheHit(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.cacheHit(call, response);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void cacheMiss(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.cacheMiss(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void callEnd(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.callEnd(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void callFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.callFailed(call, ioe);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void callStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.callStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void canceled(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.canceled(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectEnd(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC34828m0 enumC34828m0) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.connectEnd(call, inetSocketAddress, proxy, enumC34828m0);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectFailed(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC34828m0 enumC34828m0, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        AbstractC22676k.m65750j(ioe, "ioe");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.connectFailed(call, inetSocketAddress, proxy, enumC34828m0, ioe);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectStart(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.connectStart(call, inetSocketAddress, proxy);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectionAcquired(InterfaceC34821j call, InterfaceC34833p connection) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(connection, "connection");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.connectionAcquired(call, connection);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void connectionReleased(InterfaceC34821j call, InterfaceC34833p connection) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(connection, "connection");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.connectionReleased(call, connection);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void dispatcherQueueEnd(InterfaceC34821j call, C34843u dispatcher) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.dispatcherQueueEnd(call, dispatcher);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void dispatcherQueueStart(InterfaceC34821j call, C34843u dispatcher) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.dispatcherQueueStart(call, dispatcher);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void dnsEnd(InterfaceC34821j call, String domainName, List inetAddressList) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(domainName, "domainName");
        AbstractC22676k.m65750j(inetAddressList, "inetAddressList");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.dnsEnd(call, domainName, inetAddressList);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void dnsStart(InterfaceC34821j call, String domainName) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(domainName, "domainName");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.dnsStart(call, domainName);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void followUpDecision(InterfaceC34821j call, C34850x0 networkResponse, C34832o0 c34832o0) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(networkResponse, "networkResponse");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.followUpDecision(call, networkResponse, c34832o0);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void proxySelectEnd(InterfaceC34821j call, C34810e0 url, List proxies) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(proxies, "proxies");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.proxySelectEnd(call, url, proxies);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void proxySelectStart(InterfaceC34821j call, C34810e0 url) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(url, "url");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.proxySelectStart(call, url);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestBodyEnd(InterfaceC34821j call, long j7) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.requestBodyEnd(call, j7);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestBodyStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.requestBodyStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.requestFailed(call, ioe);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestHeadersEnd(InterfaceC34821j call, C34832o0 request) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(request, "request");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.requestHeadersEnd(call, request);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void requestHeadersStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.requestHeadersStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseBodyEnd(InterfaceC34821j call, long j7) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.responseBodyEnd(call, j7);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseBodyStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.responseBodyStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.responseFailed(call, ioe);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseHeadersEnd(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.responseHeadersEnd(call, response);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void responseHeadersStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.responseHeadersStart(call);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void retryDecision(InterfaceC34821j call, IOException exception, boolean z4) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(exception, "exception");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.retryDecision(call, exception, z4);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void satisfactionFailure(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.satisfactionFailure(call, response);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void secureConnectEnd(InterfaceC34821j call, C34804c0 c34804c0) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.secureConnectEnd(call, c34804c0);
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void secureConnectStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        for (AbstractC34798a0 abstractC34798a0 : this.f146760a) {
            abstractC34798a0.secureConnectStart(call);
        }
    }
}
