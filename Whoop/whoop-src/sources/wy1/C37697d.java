package wy1;

import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import j92.C21441i;
import j92.C21443k;
import java.util.ArrayList;
import java.util.Arrays;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34799a1;
import ud3.C34807d0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.C34854z0;
import ud3.EnumC34828m0;
import ud3.InterfaceC34808d1;
import y92.C39352a;

/* JADX INFO: renamed from: wy1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lwy1/d;", "", "Ly92/a;", "authManager", "Lj92/k;", "oauthTokenRefresher", "Lq83/j;", "ioContext", "Ltr2/n;", "logger", "<init>", "(Ly92/a;Lj92/k;Lq83/j;Ltr2/n;)V", "", "accessToken", "Lud3/o0;", "c", "(Ljava/lang/String;)Lud3/o0;", "Lud3/x0;", "d", "(Ljava/lang/String;)Lud3/x0;", "", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "Ly92/a;", "Lj92/k;", "Lq83/j;", "Ltr2/n;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37697d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21443k oauthTokenRefresher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: wy1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.MfaTokenRefresher", m100430f = "MfaTokenRefresher.kt", m100431l = {43, 48}, m100432m = "refreshToken", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f161545E;

        /* JADX INFO: renamed from: w */
        Object f161546w;

        /* JADX INFO: renamed from: x */
        Object f161547x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f161548y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f161548y = obj;
            this.f161545E |= Integer.MIN_VALUE;
            return C37697d.this.m121142b(this);
        }
    }

    /* JADX INFO: renamed from: wy1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.setup.MfaTokenRefresher$refreshToken$2", m100430f = "MfaTokenRefresher.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161550w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34850x0 f161552y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C34850x0 c34850x0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161552y = c34850x0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37697d.this.new b(this.f161552y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f161550w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(C37697d.this.oauthTokenRefresher.m60355h(this.f161552y) != null);
        }
    }

    public C37697d(C39352a authManager, C21443k oauthTokenRefresher, InterfaceC30063j ioContext, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(oauthTokenRefresher, "oauthTokenRefresher");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(logger, "logger");
        this.authManager = authManager;
        this.oauthTokenRefresher = oauthTokenRefresher;
        this.ioContext = ioContext;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final C34832o0 m121140c(String accessToken) {
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f("https://api.prod.whoop.com/fake-url-mfa-state-change-token-refresh");
        c34830n0.m109902c(TokenAuthInterceptor.AUTH_HEADER, String.format(C21441i.INSTANCE.m60343c(), "Bearer %s", Arrays.copyOf(new Object[]{accessToken}, 1)));
        return new C34832o0(c34830n0);
    }

    /* JADX INFO: renamed from: d */
    private final C34850x0 m121141d(String accessToken) {
        C34854z0 c34854z0 = AbstractC34799a1.f146522x;
        ArrayList arrayList = new ArrayList(20);
        C34832o0 request = m121140c(accessToken);
        AbstractC22676k.m65750j(request, "request");
        return new C34850x0(request, EnumC34828m0.HTTP_1_1, "OK", 200, null, new C34807d0((String[]) arrayList.toArray(new String[0])), c34854z0, null, null, null, null, 0L, 0L, null, InterfaceC34808d1.f146549A);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m121142b(q83.InterfaceC30057d<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof wy1.C37697d.a
            if (r0 == 0) goto L13
            r0 = r8
            wy1.d$a r0 = (wy1.C37697d.a) r0
            int r1 = r0.f161545E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161545E = r1
            goto L18
        L13:
            wy1.d$a r0 = new wy1.d$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f161548y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f161545E
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r1 = r0.f161547x
            ud3.x0 r1 = (ud3.C34850x0) r1
            java.lang.Object r0 = r0.f161546w
            com.whoop.domain.model.AuthMaterial r0 = (com.whoop.domain.model.AuthMaterial) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L7a
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4d
        L3f:
            p505ts.AbstractC34132o.m107864I(r8)
            y92.a r8 = r7.authManager
            r0.f161545E = r5
            java.lang.Object r8 = r8.m125478a(r0)
            if (r8 != r1) goto L4d
            goto L79
        L4d:
            com.whoop.domain.model.AuthMaterial r8 = (com.whoop.domain.model.AuthMaterial) r8
            if (r8 != 0) goto L5d
            tr2.n r8 = r7.logger
            java.lang.String r0 = "can't refresh token for MFA state change without auth material"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r3]
            r8.mo85222m(r0, r1)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L5d:
            java.lang.String r8 = r8.getAccessToken()
            ud3.x0 r8 = r7.m121141d(r8)
            q83.j r2 = r7.ioContext
            wy1.d$b r5 = new wy1.d$b
            r6 = 0
            r5.<init>(r8, r6)
            r0.f161546w = r6
            r0.f161547x = r6
            r0.f161545E = r4
            java.lang.Object r8 = bc3.AbstractC3006f0.m8705K(r2, r5, r0)
            if (r8 != r1) goto L7a
        L79:
            return r1
        L7a:
            r0 = r8
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            tr2.n r1 = r7.logger
            java.lang.String r2 = "refresh token call success: "
            java.lang.String r0 = p000.AbstractC11266d.m30462p(r2, r0)
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r3]
            r1.mo85216g(r0, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wy1.C37697d.m121142b(q83.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C37697d(C39352a c39352a, C21443k c21443k, InterfaceC30063j interfaceC30063j, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        this(c39352a, c21443k, interfaceC30063j, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MfaTokenRefresher") : interfaceC34116n);
    }
}
