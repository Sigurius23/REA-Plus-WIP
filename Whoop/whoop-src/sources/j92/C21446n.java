package j92;

import ae3.C0801i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import l83.C23465k;
import or2.C28147b;
import p002a0.C0030i1;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import ud3.AbstractC34799a1;
import ud3.C34807d0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.C34854z0;
import ud3.EnumC34828m0;
import ud3.InterfaceC34808d1;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: renamed from: j92.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"Lj92/n;", "Lud3/g0;", "Lj92/m;", "rateLimitingHelper", "<init>", "(Lj92/m;)V", "Lud3/o0;", "request", "Lud3/x0;", "a", "(Lud3/o0;)Lud3/x0;", "Lud3/f0;", "chain", "intercept", "(Lud3/f0;)Lud3/x0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lj92/m;", "Ltr2/n;", "x", "Ltr2/n;", "log", "y", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21446n implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: z */
    private static final AbstractC34799a1 f82339z;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C21445m rateLimitingHelper;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    static {
        C34854z0 c34854z0 = AbstractC34799a1.f146522x;
        f82339z = AbstractC12350b.m34590k("API calls rate limited by the server.", null);
    }

    public C21446n(C21445m rateLimitingHelper) {
        AbstractC22676k.m65750j(rateLimitingHelper, "rateLimitingHelper");
        this.rateLimitingHelper = rateLimitingHelper;
        this.log = InterfaceC34116n.INSTANCE.m107848a("RateLimitingInterceptor");
    }

    /* JADX INFO: renamed from: a */
    private final C34850x0 m60360a(C34832o0 request) {
        C34854z0 c34854z0 = AbstractC34799a1.f146522x;
        C22677k0 c22677k0 = new C22677k0(2, false);
        AbstractC22676k.m65750j(request, "request");
        EnumC34828m0 enumC34828m0 = EnumC34828m0.HTTP_1_1;
        AbstractC34799a1 body = f82339z;
        AbstractC22676k.m65750j(body, "body");
        return new C34850x0(request, enumC34828m0, "API calls rate limited by the server.", 429, null, c22677k0.m65766g(), body, null, null, null, null, 0L, 0L, null, InterfaceC34808d1.f146549A);
    }

    @Override // ud3.InterfaceC34816g0
    public C34850x0 intercept(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        if (this.rateLimitingHelper.m60358a()) {
            return m60360a(c34832o0);
        }
        C34850x0 c34850x0M1939b = c0801i.m1939b(c34832o0);
        C34807d0 c34807d0 = c34850x0M1939b.f146777F;
        if (c34850x0M1939b.f146792z == 429) {
            C28147b c28147b = C28147b.f113814w;
            int i13 = c28147b.m85171a().get();
            int i14 = c28147b.m85172b().get();
            this.log.mo85228t(c34807d0.toString(), new AbstractC30556a.a[0]);
            Iterator it = c34807d0.iterator();
            String str = "";
            while (true) {
                C0030i1 c0030i1 = (C0030i1) it;
                if (!c0030i1.hasNext()) {
                    break;
                }
                C23465k c23465k = (C23465k) c0030i1.next();
                Object obj = c23465k.f92937w;
                Object obj2 = c23465k.f92938x;
                String str2 = (String) obj;
                int iHashCode = str2.hashCode();
                if (iHashCode != 234666031) {
                    if (iHashCode != 1187994228) {
                        if (iHashCode == 1193421832 && str2.equals("X-RateLimit-Reset")) {
                            i14 = Integer.parseInt((String) obj2);
                        }
                    } else if (str2.equals("X-RateLimit-Limit")) {
                        str = (String) obj2;
                    }
                } else if (str2.equals("X-RateLimit-Remaining")) {
                    i13 = Integer.parseInt((String) obj2);
                }
            }
            C21447o c21447o = new C21447o(str, i13, i14);
            this.log.mo85228t(c21447o.toString(), new AbstractC30556a.a[0]);
            this.log.mo85228t("Setting Rate limited to true", new AbstractC30556a.a[0]);
            this.rateLimitingHelper.m60359b(c21447o.getRateLimitReset());
            C28147b.f113814w.m85173c();
        }
        return c34850x0M1939b;
    }
}
