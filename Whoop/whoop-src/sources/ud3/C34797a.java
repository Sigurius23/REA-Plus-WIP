package ud3;

import com.iterable.iterableapi.C5378v;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ke3.AbstractC22424a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37171e;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: ud3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C34797a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC34845v f146512a;

    /* JADX INFO: renamed from: b */
    public final SocketFactory f146513b;

    /* JADX INFO: renamed from: c */
    public final SSLSocketFactory f146514c;

    /* JADX INFO: renamed from: d */
    public final HostnameVerifier f146515d;

    /* JADX INFO: renamed from: e */
    public final C34825l f146516e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC34803c f146517f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f146518g;

    /* JADX INFO: renamed from: h */
    public final C34810e0 f146519h;

    /* JADX INFO: renamed from: i */
    public final List f146520i;

    /* JADX INFO: renamed from: j */
    public final List f146521j;

    public C34797a(String uriHost, int i13, InterfaceC34845v dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C34825l c34825l, InterfaceC34803c proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        AbstractC22676k.m65750j(uriHost, "uriHost");
        AbstractC22676k.m65750j(dns, "dns");
        AbstractC22676k.m65750j(socketFactory, "socketFactory");
        AbstractC22676k.m65750j(proxyAuthenticator, "proxyAuthenticator");
        AbstractC22676k.m65750j(protocols, "protocols");
        AbstractC22676k.m65750j(connectionSpecs, "connectionSpecs");
        AbstractC22676k.m65750j(proxySelector, "proxySelector");
        this.f146512a = dns;
        this.f146513b = socketFactory;
        this.f146514c = sSLSocketFactory;
        this.f146515d = hostnameVerifier;
        this.f146516e = c34825l;
        this.f146517f = proxyAuthenticator;
        this.f146518g = proxySelector;
        C5378v c5378v = new C5378v(1);
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            c5378v.f21851b = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            c5378v.f21851b = "https";
        }
        String strM119115b = AbstractC37171e.m119115b(AbstractC22424a.m64606d(0, 0, 7, uriHost));
        if (strM119115b == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        c5378v.f21855f = strM119115b;
        if (1 > i13 || i13 >= 65536) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "unexpected port: ").toString());
        }
        c5378v.f21852c = i13;
        this.f146519h = c5378v.m16526b();
        this.f146520i = AbstractC37174h.m119143j(protocols);
        this.f146521j = AbstractC37174h.m119143j(connectionSpecs);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m109857a(C34797a that) {
        AbstractC22676k.m65750j(that, "that");
        return AbstractC22676k.m65745e(this.f146512a, that.f146512a) && AbstractC22676k.m65745e(this.f146517f, that.f146517f) && AbstractC22676k.m65745e(this.f146520i, that.f146520i) && AbstractC22676k.m65745e(this.f146521j, that.f146521j) && AbstractC22676k.m65745e(this.f146518g, that.f146518g) && AbstractC22676k.m65745e(this.f146514c, that.f146514c) && AbstractC22676k.m65745e(this.f146515d, that.f146515d) && AbstractC22676k.m65745e(this.f146516e, that.f146516e) && this.f146519h.f146566e == that.f146519h.f146566e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34797a)) {
            return false;
        }
        C34797a c34797a = (C34797a) obj;
        return AbstractC22676k.m65745e(this.f146519h, c34797a.f146519h) && m109857a(c34797a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f146516e) + ((Objects.hashCode(this.f146515d) + ((Objects.hashCode(this.f146514c) + ((this.f146518g.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.f146517f.hashCode() + ((this.f146512a.hashCode() + AbstractC11266d.m30450d(527, 31, this.f146519h.f146570i)) * 31)) * 31, 31, this.f146520i), 31, this.f146521j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Address{");
        C34810e0 c34810e0 = this.f146519h;
        sb4.append(c34810e0.f146565d);
        sb4.append(':');
        sb4.append(c34810e0.f146566e);
        sb4.append(", ");
        sb4.append("proxySelector=" + this.f146518g);
        sb4.append('}');
        return sb4.toString();
    }
}
