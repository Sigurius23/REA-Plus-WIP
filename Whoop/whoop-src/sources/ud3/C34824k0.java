package ud3;

import androidx.room.AbstractC1772c1;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import je3.C21630c;
import m83.AbstractC25265s;
import org.joda.time.DateTimeConstants;
import p497t7.InterfaceC33561b;
import p715kotlin.jvm.internal.AbstractC22676k;
import vd1.C35909c;
import wd3.AbstractC37174h;
import yd3.C39473d;
import zd3.C40576t;

/* JADX INFO: renamed from: ud3.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34824k0 {

    /* JADX INFO: renamed from: A */
    public int f146606A;

    /* JADX INFO: renamed from: B */
    public int f146607B;

    /* JADX INFO: renamed from: C */
    public int f146608C;

    /* JADX INFO: renamed from: D */
    public long f146609D;

    /* JADX INFO: renamed from: E */
    public C40576t f146610E;

    /* JADX INFO: renamed from: F */
    public C39473d f146611F;

    /* JADX INFO: renamed from: b */
    public C34835q f146613b;

    /* JADX INFO: renamed from: e */
    public InterfaceC34853z f146616e;

    /* JADX INFO: renamed from: f */
    public boolean f146617f;

    /* JADX INFO: renamed from: g */
    public boolean f146618g;

    /* JADX INFO: renamed from: h */
    public InterfaceC34803c f146619h;

    /* JADX INFO: renamed from: i */
    public boolean f146620i;

    /* JADX INFO: renamed from: j */
    public boolean f146621j;

    /* JADX INFO: renamed from: k */
    public C34841t f146622k;

    /* JADX INFO: renamed from: l */
    public C34815g f146623l;

    /* JADX INFO: renamed from: m */
    public InterfaceC34845v f146624m;

    /* JADX INFO: renamed from: n */
    public ProxySelector f146625n;

    /* JADX INFO: renamed from: o */
    public InterfaceC34803c f146626o;

    /* JADX INFO: renamed from: p */
    public SocketFactory f146627p;

    /* JADX INFO: renamed from: q */
    public SSLSocketFactory f146628q;

    /* JADX INFO: renamed from: r */
    public X509TrustManager f146629r;

    /* JADX INFO: renamed from: s */
    public List f146630s;

    /* JADX INFO: renamed from: t */
    public List f146631t;

    /* JADX INFO: renamed from: u */
    public HostnameVerifier f146632u;

    /* JADX INFO: renamed from: v */
    public C34825l f146633v;

    /* JADX INFO: renamed from: w */
    public AbstractC1772c1 f146634w;

    /* JADX INFO: renamed from: x */
    public int f146635x;

    /* JADX INFO: renamed from: y */
    public int f146636y;

    /* JADX INFO: renamed from: z */
    public int f146637z;

    /* JADX INFO: renamed from: a */
    public C34843u f146612a = new C34843u();

    /* JADX INFO: renamed from: c */
    public final ArrayList f146614c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f146615d = new ArrayList();

    public C34824k0() {
        AbstractC34798a0 abstractC34798a0 = AbstractC34798a0.NONE;
        TimeZone timeZone = AbstractC37174h.f158962a;
        AbstractC22676k.m65750j(abstractC34798a0, "<this>");
        this.f146616e = new C35909c(abstractC34798a0, 1);
        this.f146617f = true;
        this.f146618g = true;
        C34800b c34800b = InterfaceC34803c.f146530a;
        this.f146619h = c34800b;
        this.f146620i = true;
        this.f146621j = true;
        this.f146622k = C34841t.f146748w;
        this.f146624m = InterfaceC34845v.f146759v;
        this.f146626o = c34800b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC22676k.m65749i(socketFactory, "getDefault(...)");
        this.f146627p = socketFactory;
        this.f146630s = C34826l0.f146642H;
        this.f146631t = C34826l0.f146641G;
        this.f146632u = C21630c.f83064a;
        this.f146633v = C34825l.f146638c;
        this.f146636y = InterfaceC33561b.INVALID_OWNERSHIP;
        this.f146637z = InterfaceC33561b.INVALID_OWNERSHIP;
        this.f146606A = InterfaceC33561b.INVALID_OWNERSHIP;
        this.f146608C = DateTimeConstants.MILLIS_PER_MINUTE;
        this.f146609D = 1024L;
    }

    /* JADX INFO: renamed from: a */
    public final void m109891a(InterfaceC34816g0 interceptor) {
        AbstractC22676k.m65750j(interceptor, "interceptor");
        this.f146614c.add(interceptor);
    }

    /* JADX INFO: renamed from: b */
    public final void m109892b(long j7, TimeUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        this.f146636y = AbstractC37174h.m119135b("timeout", j7, unit);
    }

    /* JADX INFO: renamed from: c */
    public final void m109893c(long j7, TimeUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        this.f146607B = AbstractC37174h.m119135b("interval", j7, unit);
    }

    /* JADX INFO: renamed from: d */
    public final void m109894d(List protocols) {
        AbstractC22676k.m65750j(protocols, "protocols");
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(protocols);
        EnumC34828m0 enumC34828m0 = EnumC34828m0.H2_PRIOR_KNOWLEDGE;
        if (!arrayListM74097F1.contains(enumC34828m0) && !arrayListM74097F1.contains(EnumC34828m0.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListM74097F1).toString());
        }
        if (arrayListM74097F1.contains(enumC34828m0) && arrayListM74097F1.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListM74097F1).toString());
        }
        if (arrayListM74097F1.contains(EnumC34828m0.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListM74097F1).toString());
        }
        if (arrayListM74097F1.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayListM74097F1.remove(EnumC34828m0.SPDY_3);
        if (!arrayListM74097F1.equals(this.f146631t)) {
            this.f146610E = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayListM74097F1);
        AbstractC22676k.m65749i(listUnmodifiableList, "unmodifiableList(...)");
        this.f146631t = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: e */
    public final void m109895e(long j7, TimeUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        this.f146637z = AbstractC37174h.m119135b("timeout", j7, unit);
    }

    /* JADX INFO: renamed from: f */
    public final void m109896f(long j7, TimeUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        this.f146606A = AbstractC37174h.m119135b("timeout", j7, unit);
    }
}
