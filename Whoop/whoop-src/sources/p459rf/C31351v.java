package p459rf;

import bd3.C3130k;
import bg.AbstractC3210e;
import bg.C3217l;
import cg.C4552g;
import cg.C4560o;
import cg.C4569x;
import cg.C4570y;
import e93.AbstractC12889b;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p098dt.AbstractC12350b;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29140r;
import pf.C29139q;
import pf.InterfaceC29142t;
import tg.C33770b;
import tg.C33775g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: rf.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C31351v extends ProxySelector {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29142t f128994a;

    public C31351v(InterfaceC29142t sdkSelector) {
        AbstractC22676k.m65750j(sdkSelector, "sdkSelector");
        this.f128994a = sdkSelector;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        String host;
        C33770b c33770b;
        if (uri != null) {
            C3217l c3217l = C3217l.f12583c;
            C3130k c3130k = new C3130k(0);
            C4552g c4552g = new C4552g();
            C33770b c33770b2 = C33770b.f141347f;
            String scheme = uri.getScheme();
            AbstractC22676k.m65749i(scheme, "getScheme(...)");
            C3217l c3217lM34554C = AbstractC12350b.m34554C(scheme);
            String host2 = uri.getHost();
            AbstractC22676k.m65749i(host2, "getHost(...)");
            if (AbstractC39421y.m125930O(host2, "[", false)) {
                String host3 = uri.getHost();
                AbstractC22676k.m65749i(host3, "getHost(...)");
                host = AbstractC39414r.m125857C0(host3, AbstractC12889b.m36278i0(1, uri.getHost().length() - 1));
            } else {
                host = uri.getHost();
            }
            AbstractC22676k.m65747g(host);
            AbstractC3210e abstractC3210eM118967V = AbstractC37056f.m118967V(host);
            int port = uri.getPort();
            Integer numValueOf = Integer.valueOf(port);
            if (port <= 0) {
                numValueOf = null;
            }
            String rawPath = uri.getRawPath();
            AbstractC22676k.m65749i(rawPath, "getRawPath(...)");
            c3130k.m8994e(rawPath);
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null && !AbstractC39414r.m125890i0(rawQuery)) {
                String rawQuery2 = uri.getRawQuery();
                AbstractC22676k.m65749i(rawQuery2, "getRawQuery(...)");
                c4552g.m14234c(c4552g.f18346z, rawQuery2);
            }
            String rawUserInfo = uri.getRawUserInfo();
            if (rawUserInfo == null || AbstractC39414r.m125890i0(rawUserInfo)) {
                c33770b = c33770b2;
            } else {
                int i13 = C4570y.f18388c;
                String rawUserInfo2 = uri.getRawUserInfo();
                AbstractC22676k.m65749i(rawUserInfo2, "getRawUserInfo(...)");
                C37199o c37199o = new C37199o(0);
                c37199o.m119208M(rawUserInfo2);
                c33770b2 = (C33770b) c37199o.f159040w;
                c33770b = (C33770b) c37199o.f159041x;
                new C4570y(c33770b2, c33770b);
            }
            String rawFragment = uri.getRawFragment();
            AbstractC29140r abstractC29140rMo711q = this.f128994a.mo711q(new C4560o(c3217lM34554C, abstractC3210eM118967V, numValueOf != null ? numValueOf.intValue() : c3217lM34554C.f12587b, new C4569x(AbstractC25265s.m74093D1((ArrayList) c3130k.f12277c), c3130k.f12276b), c4552g.m14233b(), new C4570y(c33770b2, c33770b), rawFragment != null ? C33775g.f141361k.m106779d(rawFragment) : null));
            if (abstractC29140rMo711q instanceof C29139q) {
                Proxy.Type type = Proxy.Type.HTTP;
                C4560o c4560o = ((C29139q) abstractC29140rMo711q).f117932a;
                return AbstractC37056f.m118958J(new Proxy(type, new InetSocketAddress(c4560o.f18369b.toString(), c4560o.f18370c)));
            }
        }
        return C25271y.f99162w;
    }
}
