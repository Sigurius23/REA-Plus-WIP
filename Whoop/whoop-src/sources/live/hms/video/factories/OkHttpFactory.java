package live.hms.video.factories;

import fe3.AbstractC14421e;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34798a0;
import ud3.AbstractC34814f1;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.InterfaceC34811e1;
import vd1.C35909c;
import wd3.AbstractC37174h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0006¨\u0006\u001e"}, m65681d2 = {"Llive/hms/video/factories/OkHttpFactory;", "", "<init>", "()V", "Lud3/l0;", "makeClient", "()Lud3/l0;", "", "uri", "Lud3/f1;", "listener", "Lud3/e1;", "makeWebSocket", "(Ljava/lang/String;Lud3/f1;)Lud3/e1;", "", "PING_INTERVAL", "J", "CONNECT_TIMEOUT", "READ_TIMEOUT", "WRITE_TIMEOUT", "Llive/hms/video/factories/HappyEyeballsDns;", "happyEyeballsDns", "Llive/hms/video/factories/HappyEyeballsDns;", "", "Ljavax/net/ssl/TrustManager;", "trustAllCerts", "[Ljavax/net/ssl/TrustManager;", "client", "Lud3/l0;", "getClient", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OkHttpFactory {
    private static final long CONNECT_TIMEOUT = 5;
    public static final OkHttpFactory INSTANCE;
    private static final long PING_INTERVAL = 12;
    private static final long READ_TIMEOUT = 11;
    private static final long WRITE_TIMEOUT = 11;
    private static final C34826l0 client;
    private static final HappyEyeballsDns happyEyeballsDns;
    private static final TrustManager[] trustAllCerts;

    static {
        OkHttpFactory okHttpFactory = new OkHttpFactory();
        INSTANCE = okHttpFactory;
        happyEyeballsDns = new HappyEyeballsDns(null, null, null, null, 15, null);
        trustAllCerts = new TrustManager[]{new X509TrustManager() { // from class: live.hms.video.factories.OkHttpFactory$trustAllCerts$1
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] chain, String authType) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] chain, String authType) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        client = okHttpFactory.makeClient();
    }

    private OkHttpFactory() {
    }

    private final C34826l0 makeClient() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        TrustManager[] trustManagerArr = trustAllCerts;
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        C34824k0 c34824k0 = new C34824k0();
        int i13 = 1;
        c34824k0.f146617f = true;
        HappyEyeballsDns dns = happyEyeballsDns;
        AbstractC22676k.m65750j(dns, "dns");
        if (!dns.equals(c34824k0.f146624m)) {
            c34824k0.f146610E = null;
        }
        c34824k0.f146624m = dns;
        AbstractC34798a0 eventListener = dns.getPortHintListener();
        AbstractC22676k.m65750j(eventListener, "eventListener");
        TimeZone timeZone = AbstractC37174h.f158962a;
        c34824k0.f146616e = new C35909c(eventListener, i13);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c34824k0.m109893c(PING_INTERVAL, timeUnit);
        c34824k0.f146620i = true;
        c34824k0.f146621j = true;
        c34824k0.m109892b(CONNECT_TIMEOUT, timeUnit);
        c34824k0.m109895e(11L, timeUnit);
        c34824k0.m109896f(11L, timeUnit);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        AbstractC22676k.m65749i(socketFactory, "getSocketFactory(...)");
        TrustManager trustManager = trustManagerArr[0];
        AbstractC22676k.m65748h(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        X509TrustManager trustManager2 = (X509TrustManager) trustManager;
        AbstractC22676k.m65750j(trustManager2, "trustManager");
        if (!socketFactory.equals(c34824k0.f146628q) || !trustManager2.equals(c34824k0.f146629r)) {
            c34824k0.f146610E = null;
        }
        c34824k0.f146628q = socketFactory;
        AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
        c34824k0.f146634w = AbstractC14421e.f52594a.mo41115c(trustManager2);
        c34824k0.f146629r = trustManager2;
        C24152g c24152g = new C24152g();
        if (!c24152g.equals(c34824k0.f146632u)) {
            c34824k0.f146610E = null;
        }
        c34824k0.f146632u = c24152g;
        return new C34826l0(c34824k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean makeClient$lambda$0(String str, SSLSession sSLSession) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(sSLSession, "<unused var>");
        return true;
    }

    public final C34826l0 getClient() {
        return client;
    }

    public final InterfaceC34811e1 makeWebSocket(String uri, AbstractC34814f1 listener) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(listener, "listener");
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(uri);
        C34832o0 c34832o0 = new C34832o0(c34830n0);
        happyEyeballsDns.notePort$lib_release(c34832o0.f146712a);
        return client.m109899c(c34832o0, listener);
    }
}
