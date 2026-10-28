package f12;

import android.net.Uri;
import com.whoop.oauthintegration.api.OAuthIntegrationApi;
import com.whoop.oauthintegration.domain.models.OAuthIntegrationRequest;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.api.QueryParams;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: f12.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ<\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lf12/c;", "Lod1/g;", "Lf12/a;", "Lf12/b;", "Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;Ltr2/n;)V", "", "provider", "Landroid/net/Uri;", QueryParams.URL, "codeVerifier", "authScope", "Lec3/l;", "e", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;", "b", "Ltr2/n;", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14011c implements InterfaceC27844g<AbstractC14009a, AbstractC14010b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final OAuthIntegrationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f12.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.oauthintegration.domain.OAuthIntegrationInteractor", m100430f = "OAuthIntegrationInteractor.kt", m100431l = {53}, m100432m = "createConnection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f50006E;

        /* JADX INFO: renamed from: F */
        Object f50007F;

        /* JADX INFO: renamed from: G */
        Object f50008G;

        /* JADX INFO: renamed from: H */
        Object f50009H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f50010I;

        /* JADX INFO: renamed from: K */
        int f50012K;

        /* JADX INFO: renamed from: w */
        Object f50013w;

        /* JADX INFO: renamed from: x */
        Object f50014x;

        /* JADX INFO: renamed from: y */
        Object f50015y;

        /* JADX INFO: renamed from: z */
        Object f50016z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f50010I = obj;
            this.f50012K |= Integer.MIN_VALUE;
            return C14011c.this.m39908e(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: f12.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.oauthintegration.domain.OAuthIntegrationInteractor$createConnection$response$1", m100430f = "OAuthIntegrationInteractor.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f50017w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f50019y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ OAuthIntegrationRequest f50020z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, OAuthIntegrationRequest oAuthIntegrationRequest, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f50019y = str;
            this.f50020z = oAuthIntegrationRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14011c.this.new b(this.f50019y, this.f50020z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f50017w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            OAuthIntegrationApi oAuthIntegrationApi = C14011c.this.api;
            String str = this.f50019y;
            OAuthIntegrationRequest oAuthIntegrationRequest = this.f50020z;
            this.f50017w = 1;
            Object connection = oAuthIntegrationApi.setConnection(str, oAuthIntegrationRequest, this);
            return connection == enumC31071a ? enumC31071a : connection;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f12.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.oauthintegration.domain.OAuthIntegrationInteractor$interact$$inlined$flatMapLatest$1", m100430f = "OAuthIntegrationInteractor.kt", m100431l = {191, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f50021E;

        /* JADX INFO: renamed from: F */
        Object f50022F;

        /* JADX INFO: renamed from: G */
        Object f50023G;

        /* JADX INFO: renamed from: H */
        int f50024H;

        /* JADX INFO: renamed from: w */
        int f50025w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f50026x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f50027y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14011c f50028z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C14011c c14011c) {
            super(3, interfaceC30057d);
            this.f50028z = c14011c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC14009a abstractC14009a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f50028z);
            cVar.f50026x = interfaceC13062m;
            cVar.f50027y = abstractC14009a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r13, r12) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r12.f50025w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L33
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r12.f50026x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r13)
                r11 = r12
                goto L87
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.f50023G
                f12.a r1 = (f12.AbstractC14009a) r1
                java.lang.Object r1 = r12.f50022F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r12.f50021E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r12.f50026x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r13)
                r11 = r12
                goto L72
            L33:
                p505ts.AbstractC34132o.m107864I(r13)
                java.lang.Object r13 = r12.f50026x
                r1 = r13
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r13 = r12.f50027y
                f12.a r13 = (f12.AbstractC14009a) r13
                boolean r5 = r13 instanceof f12.AbstractC14009a.a
                if (r5 == 0) goto L8a
                f12.c r6 = r12.f50028z
                f12.a$a r13 = (f12.AbstractC14009a.a) r13
                java.lang.String r7 = r13.getProvider()
                java.lang.String r5 = r13.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String()
                android.net.Uri r8 = android.net.Uri.parse(r5)
                java.lang.String r9 = r13.getCodeVerifier()
                java.lang.String r10 = r13.getAuthScope()
                r12.f50026x = r4
                r12.f50027y = r4
                r12.f50021E = r1
                r12.f50022F = r4
                r12.f50023G = r4
                r13 = 0
                r12.f50024H = r13
                r12.f50025w = r3
                r11 = r12
                java.lang.Object r13 = f12.C14011c.m39906c(r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L72
                goto L86
            L72:
                ec3.l r13 = (ec3.InterfaceC13058l) r13
                r11.f50026x = r4
                r11.f50027y = r4
                r11.f50021E = r4
                r11.f50022F = r4
                r11.f50023G = r4
                r11.f50025w = r2
                java.lang.Object r13 = ec3.AbstractC13091v.m36613w(r1, r13, r12)
                if (r13 != r0) goto L87
            L86:
                return r0
            L87:
                l83.a0 r13 = l83.C23454a0.f92919a
                return r13
            L8a:
                r11 = r12
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: f12.C14011c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC14009a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C14011c(OAuthIntegrationApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX INFO: renamed from: e */
    public final Object m39908e(String str, Uri uri, String str2, String str3, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        a aVar;
        OAuthIntegrationRequest oAuthIntegrationRequest;
        String str4 = str;
        Uri uri2 = uri;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f50012K;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f50012K = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f50010I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f50012K;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            String queryParameter = uri2.getQueryParameter("state");
            String queryParameter2 = uri2.getQueryParameter("code");
            String queryParameter3 = uri2.getQueryParameter("scope");
            if (queryParameter3 == null) {
                queryParameter3 = str3;
            }
            if (str2 != null) {
                if (queryParameter == null || queryParameter2 == null) {
                    this.logger.mo85222m("createConnection aborting: PKCE flow missing state=" + (queryParameter != null) + " code=" + (queryParameter2 != null), new AbstractC30556a.a[0]);
                    String string = uri2.toString();
                    AbstractC22676k.m65749i(string, "toString(...)");
                    return new C0456u(new AbstractC14010b.a(str4, string), 1);
                }
                oAuthIntegrationRequest = new OAuthIntegrationRequest(queryParameter3, queryParameter, queryParameter2, str2);
            } else {
                if (queryParameter3 == null || queryParameter == null || queryParameter2 == null) {
                    String str5 = queryParameter3;
                    InterfaceC34116n interfaceC34116n = this.logger;
                    boolean z4 = str5 != null;
                    boolean z13 = queryParameter != null;
                    boolean z14 = queryParameter2 != null;
                    StringBuilder sbM32002u = AbstractC11895b.m32002u("createConnection aborting: non-PKCE flow missing scope=", " state=", " code=", z4, z13);
                    sbM32002u.append(z14);
                    interfaceC34116n.mo85222m(sbM32002u.toString(), new AbstractC30556a.a[0]);
                    String string2 = uri2.toString();
                    AbstractC22676k.m65749i(string2, "toString(...)");
                    return new C0456u(new AbstractC14010b.a(str4, string2), 1);
                }
                oAuthIntegrationRequest = new OAuthIntegrationRequest(queryParameter3, queryParameter, queryParameter2, (String) null, 8, (DefaultConstructorMarker) null);
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n2 = this.logger;
            b bVar = new b(str4, oAuthIntegrationRequest, null);
            aVar2.f50013w = str4;
            aVar2.f50014x = uri2;
            aVar2.f50015y = null;
            aVar2.f50016z = null;
            aVar2.f50006E = null;
            aVar2.f50007F = null;
            aVar2.f50008G = null;
            aVar2.f50009H = null;
            aVar2.f50012K = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n2, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Uri uri3 = (Uri) aVar2.f50014x;
            String str6 = (String) aVar2.f50013w;
            AbstractC34132o.m107864I(objM108729b);
            uri2 = uri3;
            str4 = str6;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new C0456u(AbstractC14010b.b.f50003a, 1);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = uri2.toString();
        AbstractC22676k.m65749i(string3, "toString(...)");
        return new C0456u(new AbstractC14010b.a(str4, string3), 1);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }

    public /* synthetic */ C14011c(OAuthIntegrationApi oAuthIntegrationApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(oAuthIntegrationApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("OAuthInteractor") : interfaceC34116n);
    }
}
