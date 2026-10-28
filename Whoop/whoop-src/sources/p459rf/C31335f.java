package p459rf;

import bg.C3207b;
import bg.C3215j;
import bg.InterfaceC3212g;
import io.sentry.config.AbstractC20301a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import mg.C25525g;
import mg.InterfaceC25526h;
import p035bp.AbstractC3511b;
import p048ce.C4463d;
import p091dg.C12002a;
import p108e4.AbstractC12667a;
import p368og.C27909f;
import p368og.InterfaceC27910g;
import p423qf.C30318b;
import p460rg.AbstractC31375j;
import p460rg.C31371f;
import p460rg.C31372g;
import p460rg.C31377l;
import p460rg.EnumC31369d;
import p460rg.EnumC31370e;
import p460rg.InterfaceC31373h;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import p715kotlin.time.TimeSource;
import pf.AbstractC29126d;
import q83.InterfaceC30063j;
import ud3.AbstractC34798a0;
import ud3.C34804c0;
import ud3.C34810e0;
import ud3.C34832o0;
import ud3.C34835q;
import ud3.C34843u;
import ud3.C34850x0;
import ud3.EnumC34828m0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34833p;
import zd3.C40571o;

/* JADX INFO: renamed from: rf.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C31335f extends AbstractC34798a0 {

    /* JADX INFO: renamed from: a */
    public final C34835q f128936a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3212g f128937b;

    /* JADX INFO: renamed from: c */
    public final C34843u f128938c;

    /* JADX INFO: renamed from: d */
    public final C30318b f128939d;

    /* JADX INFO: renamed from: e */
    public final C31371f f128940e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC27910g f128941f;

    /* JADX INFO: renamed from: g */
    public TimeSource.Monotonic.ValueTimeMark f128942g;

    /* JADX INFO: renamed from: h */
    public boolean f128943h;

    /* JADX INFO: renamed from: i */
    public long f128944i;

    /* JADX INFO: renamed from: j */
    public boolean f128945j;

    /* JADX INFO: renamed from: k */
    public TimeSource.Monotonic.ValueTimeMark f128946k;

    /* JADX INFO: renamed from: l */
    public TimeSource.Monotonic.ValueTimeMark f128947l;

    public C31335f(C34835q pool, InterfaceC3212g hr3, C34843u dispatcher, C30318b metrics, C40571o c40571o) {
        InterfaceC25526h interfaceC25526hM10394w;
        InterfaceC27910g interfaceC27910gM113984B;
        InterfaceC30063j interfaceC30063j;
        InterfaceC30063j interfaceC30063j2;
        AbstractC22676k.m65750j(pool, "pool");
        AbstractC22676k.m65750j(hr3, "hr");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(metrics, "metrics");
        this.f128936a = pool;
        this.f128937b = hr3;
        this.f128938c = dispatcher;
        this.f128939d = metrics;
        C34832o0 c34832o0 = c40571o.f174722x;
        C31352w c31352w = (C31352w) c34832o0.m109908c(C31352w.class);
        if (c31352w == null || (interfaceC30063j2 = c31352w.f128996b) == null) {
            InterfaceC25526h.f99937a.getClass();
            interfaceC25526hM10394w = C25525g.f99936b;
        } else {
            interfaceC25526hM10394w = AbstractC3511b.m10394w(interfaceC30063j2);
        }
        ((C31377l) interfaceC25526hM10394w.mo75077d()).getClass();
        EnumC31369d enumC31369d = EnumC31369d.f129029w;
        InterfaceC31373h.f129036s.getClass();
        this.f128940e = C31372g.f129035b;
        C31352w c31352w2 = (C31352w) c34832o0.m109908c(C31352w.class);
        if (c31352w2 != null && (interfaceC30063j = c31352w2.f128996b) != null) {
            String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31344o.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
            }
            interfaceC27910gM113984B = AbstractC35903f.m113984B(interfaceC30063j, qualifiedName);
        } else {
            if (AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31344o.class).getQualifiedName() == null) {
                throw new IllegalArgumentException("getLogger<T> cannot be used on an anonymous object");
            }
            interfaceC27910gM113984B = C27909f.f112509a;
        }
        this.f128941f = interfaceC27910gM113984B;
        Duration.Companion companion = Duration.INSTANCE;
        this.f128944i = DurationKt.toDuration(0, DurationUnit.SECONDS);
    }

    @Override // ud3.AbstractC34798a0
    public final void cacheConditionalHit(InterfaceC34821j call, C34850x0 cachedResponse) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(cachedResponse, "cachedResponse");
        this.f128941f.mo394s(null, new C31331b(0));
    }

    @Override // ud3.AbstractC34798a0
    public final void cacheHit(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        this.f128941f.mo394s(null, new C31331b(1));
    }

    @Override // ud3.AbstractC34798a0
    public final void cacheMiss(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        this.f128941f.mo394s(null, new C31331b(2));
    }

    @Override // ud3.AbstractC34798a0
    public final void callEnd(InterfaceC34821j call) {
        int size;
        AbstractC22676k.m65750j(call, "call");
        C30318b c30318b = this.f128939d;
        C34843u c34843u = this.f128938c;
        synchronized (c34843u) {
            size = c34843u.f146756d.size();
        }
        do {
        } while (!C30318b.f124380R.compareAndSet(c30318b, c30318b.f124382E, size));
        long jM109922d = c34843u.m109922d();
        while (true) {
            long j7 = jM109922d;
            if (C30318b.f124381S.compareAndSet(c30318b, c30318b.f124383F, jM109922d)) {
                this.f128941f.mo394s(null, new C31331b(3));
                this.f128940e.getClass();
                return;
            }
            jM109922d = j7;
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void callFailed(InterfaceC34821j call, IOException ioe) {
        int size;
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
        C30318b c30318b = this.f128939d;
        C34843u c34843u = this.f128938c;
        synchronized (c34843u) {
            size = c34843u.f146756d.size();
        }
        do {
        } while (!C30318b.f124380R.compareAndSet(c30318b, c30318b.f124382E, size));
        long jM109922d = c34843u.m109922d();
        while (true) {
            long j7 = jM109922d;
            if (C30318b.f124381S.compareAndSet(c30318b, c30318b.f124383F, jM109922d)) {
                this.f128941f.mo394s(ioe, new C31331b(4));
                AbstractC31375j.m96497m(this.f128940e, ioe);
                EnumC31370e[] enumC31370eArr = EnumC31370e.f129032w;
                return;
            }
            jM109922d = j7;
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void callStart(InterfaceC34821j call) {
        int size;
        AbstractC22676k.m65750j(call, "call");
        this.f128942g = TimeSource.Monotonic.ValueTimeMark.m134380boximpl(TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto());
        C30318b c30318b = this.f128939d;
        C34843u c34843u = this.f128938c;
        synchronized (c34843u) {
            size = c34843u.f146756d.size();
        }
        do {
        } while (!C30318b.f124380R.compareAndSet(c30318b, c30318b.f124382E, size));
        long jM109922d = c34843u.m109922d();
        while (true) {
            long j7 = jM109922d;
            if (C30318b.f124381S.compareAndSet(c30318b, c30318b.f124383F, jM109922d)) {
                this.f128941f.mo394s(null, new C31331b(5));
                return;
            }
            jM109922d = j7;
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void canceled(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        this.f128941f.mo394s(null, new C31331b(6));
    }

    @Override // ud3.AbstractC34798a0
    public final void connectEnd(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC34828m0 enumC34828m0) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        this.f128941f.mo394s(null, new C31332c(inetSocketAddress, proxy, enumC34828m0, 0));
    }

    @Override // ud3.AbstractC34798a0
    public final void connectFailed(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC34828m0 enumC34828m0, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        AbstractC22676k.m65750j(ioe, "ioe");
        this.f128941f.mo394s(ioe, new C31332c(inetSocketAddress, proxy, enumC34828m0, 1));
        InetAddress address = inetSocketAddress.getAddress();
        AbstractC22676k.m65749i(address, "getAddress(...)");
        AbstractC20301a.m56331b0(address);
        ((C3207b) this.f128937b).getClass();
    }

    @Override // ud3.AbstractC34798a0
    public final void connectStart(InterfaceC34821j call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(inetSocketAddress, "inetSocketAddress");
        AbstractC22676k.m65750j(proxy, "proxy");
        this.f128941f.mo394s(null, new C4463d(9, inetSocketAddress, proxy));
    }

    @Override // ud3.AbstractC34798a0
    public final void connectionAcquired(InterfaceC34821j call, InterfaceC34833p connection) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(connection, "connection");
        C30318b c30318b = this.f128939d;
        C34835q c34835q = this.f128936a;
        do {
        } while (!C30318b.f124379Q.compareAndSet(c30318b, c30318b.f124395y, c34835q.f146720a.f174745d.size()));
        long jM109910b = c34835q.m109910b();
        while (true) {
            long j7 = jM109910b;
            if (C30318b.f124378P.compareAndSet(c30318b, c30318b.f124394x, jM109910b)) {
                break;
            } else {
                jM109910b = j7;
            }
        }
        TimeSource.Monotonic.ValueTimeMark valueTimeMark = this.f128942g;
        if (valueTimeMark == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!this.f128943h) {
            this.f128943h = true;
            long jMo134250elapsedNowUwyO8pc = valueTimeMark.mo134250elapsedNowUwyO8pc();
            this.f128944i = jMo134250elapsedNowUwyO8pc;
            AbstractC12667a.m35442N(c30318b.f124385H, jMo134250elapsedNowUwyO8pc, null, 6);
        }
        if (!this.f128945j) {
            this.f128945j = true;
            TimeSource.Monotonic.ValueTimeMark valueTimeMark2 = this.f128946k;
            AbstractC12667a.m35442N(c30318b.f124384G, valueTimeMark2 != null ? valueTimeMark2.mo134250elapsedNowUwyO8pc() : Duration.m134290minusLRDsOJo(valueTimeMark.mo134250elapsedNowUwyO8pc(), this.f128944i), null, 6);
        }
        this.f128941f.mo394s(null, new C31333d(System.identityHashCode(connection), connection, this, 0));
    }

    @Override // ud3.AbstractC34798a0
    public final void connectionReleased(InterfaceC34821j call, InterfaceC34833p connection) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(connection, "connection");
        C30318b c30318b = this.f128939d;
        C34835q c34835q = this.f128936a;
        do {
        } while (!C30318b.f124379Q.compareAndSet(c30318b, c30318b.f124395y, c34835q.f146720a.f174745d.size()));
        long jM109910b = c34835q.m109910b();
        while (true) {
            long j7 = jM109910b;
            if (C30318b.f124378P.compareAndSet(c30318b, c30318b.f124394x, jM109910b)) {
                this.f128941f.mo394s(null, new C31333d(System.identityHashCode(connection), connection, this, 1));
                return;
            }
            jM109910b = j7;
        }
    }

    @Override // ud3.AbstractC34798a0
    public final void dnsEnd(InterfaceC34821j call, String domainName, List inetAddressList) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(domainName, "domainName");
        AbstractC22676k.m65750j(inetAddressList, "inetAddressList");
        this.f128941f.mo394s(null, new C4463d(10, domainName, inetAddressList));
    }

    @Override // ud3.AbstractC34798a0
    public final void dnsStart(InterfaceC34821j call, String domainName) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(domainName, "domainName");
        this.f128946k = TimeSource.Monotonic.ValueTimeMark.m134380boximpl(TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto());
        if (!this.f128943h) {
            TimeSource.Monotonic.ValueTimeMark valueTimeMark = this.f128942g;
            if (valueTimeMark == null) {
                throw new IllegalStateException("Required value was null.");
            }
            long jMo134250elapsedNowUwyO8pc = valueTimeMark.mo134250elapsedNowUwyO8pc();
            this.f128944i = jMo134250elapsedNowUwyO8pc;
            AbstractC12667a.m35442N(this.f128939d.f124385H, jMo134250elapsedNowUwyO8pc, null, 6);
            this.f128943h = true;
        }
        this.f128941f.mo394s(null, new C3215j(domainName, 9));
    }

    @Override // ud3.AbstractC34798a0
    public final void proxySelectEnd(InterfaceC34821j call, C34810e0 url, List proxies) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(proxies, "proxies");
        this.f128941f.mo394s(null, new C4463d(11, url, proxies));
    }

    @Override // ud3.AbstractC34798a0
    public final void proxySelectStart(InterfaceC34821j call, C34810e0 url) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(url, "url");
        this.f128941f.mo394s(null, new C3215j(url, 10));
    }

    @Override // ud3.AbstractC34798a0
    public final void requestBodyEnd(InterfaceC34821j call, long j7) {
        AbstractC22676k.m65750j(call, "call");
        this.f128947l = TimeSource.Monotonic.ValueTimeMark.m134380boximpl(TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto());
        this.f128941f.mo394s(null, new C31334e(j7, 0));
    }

    @Override // ud3.AbstractC34798a0
    public final void requestBodyStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        this.f128941f.mo394s(null, new C31331b(7));
    }

    @Override // ud3.AbstractC34798a0
    public final void requestFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
        this.f128941f.mo394s(ioe, new C31331b(8));
    }

    @Override // ud3.AbstractC34798a0
    public final void requestHeadersEnd(InterfaceC34821j call, C34832o0 request) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(request, "request");
        if (request.f146715d == null) {
            this.f128947l = TimeSource.Monotonic.ValueTimeMark.m134380boximpl(TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto());
        }
        this.f128941f.mo394s(null, new C31331b(9));
    }

    @Override // ud3.AbstractC34798a0
    public final void requestHeadersStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        this.f128941f.mo394s(null, new C31331b(10));
    }

    @Override // ud3.AbstractC34798a0
    public final void responseBodyEnd(InterfaceC34821j call, long j7) {
        AbstractC22676k.m65750j(call, "call");
        this.f128941f.mo394s(null, new C31334e(j7, 1));
    }

    @Override // ud3.AbstractC34798a0
    public final void responseBodyStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        this.f128941f.mo394s(null, new C31331b(11));
    }

    @Override // ud3.AbstractC34798a0
    public final void responseFailed(InterfaceC34821j call, IOException ioe) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(ioe, "ioe");
        this.f128941f.mo394s(ioe, new C31331b(12));
    }

    @Override // ud3.AbstractC34798a0
    public final void responseHeadersEnd(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        this.f128941f.mo394s(null, new C31334e(response.f146778G.mo1941i(), 2));
    }

    @Override // ud3.AbstractC34798a0
    public final void responseHeadersStart(InterfaceC34821j call) {
        C12002a c12002a;
        AbstractC22676k.m65750j(call, "call");
        TimeSource.Monotonic.ValueTimeMark valueTimeMark = this.f128947l;
        if (valueTimeMark != null) {
            long jMo134250elapsedNowUwyO8pc = valueTimeMark.mo134250elapsedNowUwyO8pc();
            AbstractC12667a.m35442N(this.f128939d.f124392O, jMo134250elapsedNowUwyO8pc, null, 6);
            C31352w c31352w = (C31352w) ((C40571o) call).f174722x.m109908c(C31352w.class);
            if (c31352w != null && (c12002a = c31352w.f128995a) != null) {
                c12002a.mo33083c(AbstractC29126d.f117895a, Duration.m134260boximpl(jMo134250elapsedNowUwyO8pc));
            }
        }
        this.f128941f.mo394s(null, new C31331b(13));
    }

    @Override // ud3.AbstractC34798a0
    public final void satisfactionFailure(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        this.f128941f.mo394s(null, new C31331b(14));
    }

    @Override // ud3.AbstractC34798a0
    public final void secureConnectEnd(InterfaceC34821j call, C34804c0 c34804c0) {
        AbstractC22676k.m65750j(call, "call");
        this.f128941f.mo394s(null, new C3215j(c34804c0, 11));
    }

    @Override // ud3.AbstractC34798a0
    public final void secureConnectStart(InterfaceC34821j call) {
        AbstractC22676k.m65750j(call, "call");
        this.f128941f.mo394s(null, new C31331b(15));
    }
}
