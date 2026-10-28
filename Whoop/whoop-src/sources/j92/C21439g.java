package j92;

import ad3.AbstractC0757c;
import ae3.C0801i;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.service.network.ForbiddenErrorResponse;
import i92.C18259d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.io.InputStream;
import l83.C23454a0;
import p547v8.AbstractC35785b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tm0.InterfaceC33949a;
import tr2.InterfaceC34116n;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: renamed from: j92.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lj92/g;", "Lud3/g0;", "Lad3/c;", "json", "Li92/d;", "mfaEnforcer", "Ltm0/a;", "cacheNuke", "Lj92/t;", "topPrivateDomainHelper", "Ltr2/n;", "logger", "<init>", "(Lad3/c;Li92/d;Ltm0/a;Lj92/t;Ltr2/n;)V", "Lud3/o0;", "request", "", "c", "(Lud3/o0;)Z", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lad3/c;", "x", "Li92/d;", "y", "Ltm0/a;", "z", "Lj92/t;", "E", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21439g implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C18259d mfaEnforcer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC33949a cacheNuke;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C21452t topPrivateDomainHelper;

    /* JADX INFO: renamed from: j92.g$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.MfaEnforcementInterceptor$intercept$1", m100430f = "MfaEnforcementInterceptor.kt", m100431l = {52, 53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f82285w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34850x0 f82287y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34850x0 c34850x0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f82287y = c34850x0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21439g.this.new a(this.f82287y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r11.mo107389a(r10) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r10.f82285w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r11)
                goto L50
            L10:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L18:
                p505ts.AbstractC34132o.m107864I(r11)
                goto L41
            L1c:
                p505ts.AbstractC34132o.m107864I(r11)
                j92.g r11 = j92.C21439g.this
                i92.d r11 = j92.C21439g.m60330b(r11)
                ud3.x0 r1 = r10.f82287y
                ud3.o0 r1 = r1.f146789w
                ud3.e0 r1 = r1.f146712a
                java.util.ArrayList r4 = r1.f146567f
                r8 = 0
                r9 = 62
                java.lang.String r5 = "-"
                r6 = 0
                r7 = 0
                java.lang.String r1 = m83.AbstractC25265s.m74110N0(r4, r5, r6, r7, r8, r9)
                r10.f82285w = r3
                java.lang.Object r11 = r11.m52602a(r1, r10)
                if (r11 != r0) goto L41
                goto L4f
            L41:
                j92.g r11 = j92.C21439g.this
                tm0.a r11 = j92.C21439g.m60329a(r11)
                r10.f82285w = r2
                java.lang.Object r11 = r11.mo107389a(r10)
                if (r11 != r0) goto L50
            L4f:
                return r0
            L50:
                l83.a0 r11 = l83.C23454a0.f92919a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: j92.C21439g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C21439g(AbstractC0757c json, C18259d mfaEnforcer, InterfaceC33949a cacheNuke, C21452t topPrivateDomainHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(mfaEnforcer, "mfaEnforcer");
        AbstractC22676k.m65750j(cacheNuke, "cacheNuke");
        AbstractC22676k.m65750j(topPrivateDomainHelper, "topPrivateDomainHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.json = json;
        this.mfaEnforcer = mfaEnforcer;
        this.cacheNuke = cacheNuke;
        this.topPrivateDomainHelper = topPrivateDomainHelper;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m60331c(C34832o0 request) {
        return AbstractC21453u.m60389b(this.topPrivateDomainHelper, request.f146712a);
    }

    @Override // ud3.InterfaceC34816g0
    public C34850x0 intercept(InterfaceC34813f0 chain) throws Throwable {
        ForbiddenErrorResponse forbiddenErrorResponse;
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34850x0 c34850x0M1939b = c0801i.m1939b(c0801i.f2955e);
        if (c34850x0M1939b.f146792z == 403 && m60331c(c34850x0M1939b.f146789w)) {
            try {
                InputStream inputStreamM109858b = c34850x0M1939b.m109934i(1048576L).m109858b();
                AbstractC0757c abstractC0757c = this.json;
                abstractC0757c.getClass();
                forbiddenErrorResponse = (ForbiddenErrorResponse) AbstractC35785b.m113419n(abstractC0757c, ForbiddenErrorResponse.INSTANCE.serializer(), inputStreamM109858b);
            } catch (IOException e5) {
                this.logger.mo85230v("Failed to read error body from 403 response", e5, new AbstractC30556a.a[0]);
                forbiddenErrorResponse = null;
            } catch (IllegalArgumentException e13) {
                this.logger.mo85230v("Failed to parse error body from 403 response", e13, new AbstractC30556a.a[0]);
                forbiddenErrorResponse = null;
            }
            if (forbiddenErrorResponse != null && AbstractC22676k.m65745e(forbiddenErrorResponse.getErrorState(), "MFA_REQUIRED")) {
                AbstractC3006f0.m8699E(C30064k.f122676w, new a(c34850x0M1939b, null));
            }
        }
        return c34850x0M1939b;
    }

    public /* synthetic */ C21439g(AbstractC0757c abstractC0757c, C18259d c18259d, InterfaceC33949a interfaceC33949a, C21452t c21452t, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0757c, c18259d, interfaceC33949a, (i13 & 8) != 0 ? new C21452t() : c21452t, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MfaEnforcementInterceptor") : interfaceC34116n);
    }
}
