package j92;

import ae3.C0801i;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import ud3.C34810e0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: renamed from: j92.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lj92/h;", "Lud3/g0;", "Ltr2/n;", "logger", "Lj92/t;", "topPrivateDomainHelper", "<init>", "(Ltr2/n;Lj92/t;)V", "Lud3/f0;", "chain", "Lud3/o0;", "a", "(Lud3/f0;)Lud3/o0;", "Lud3/e0;", "request", "", "b", "(Lud3/e0;)Z", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Lj92/t;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21440h implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C21452t topPrivateDomainHelper;

    public C21440h(InterfaceC34116n logger, C21452t topPrivateDomainHelper) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(topPrivateDomainHelper, "topPrivateDomainHelper");
        this.logger = logger;
        this.topPrivateDomainHelper = topPrivateDomainHelper;
    }

    /* JADX INFO: renamed from: a */
    private final C34832o0 m60332a(InterfaceC34813f0 chain) {
        C0801i c0801i = (C0801i) chain;
        if (m60333b(c0801i.f2955e.f146712a)) {
            return c0801i.f2955e;
        }
        InterfaceC34116n interfaceC34116n = this.logger;
        C34832o0 c34832o0 = c0801i.f2955e;
        interfaceC34116n.mo85228t(AbstractC11266d.m30461o("Non WHOOP domain, token will be not be included: ", c34832o0.f146712a.f146565d), new AbstractC30556a.a[0]);
        C34830n0 c34830n0M109907b = c34832o0.m109907b();
        c34830n0M109907b.f146689c.m65769j(TokenAuthInterceptor.AUTH_HEADER);
        return new C34832o0(c34830n0M109907b);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m60333b(C34810e0 request) {
        return AbstractC21453u.m60389b(this.topPrivateDomainHelper, request);
    }

    @Override // ud3.InterfaceC34816g0
    public C34850x0 intercept(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        return ((C0801i) chain).m1939b(m60332a(chain));
    }

    public /* synthetic */ C21440h(InterfaceC34116n interfaceC34116n, C21452t c21452t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34116n, (i13 & 2) != 0 ? new C21452t() : c21452t);
    }
}
