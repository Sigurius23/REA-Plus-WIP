package com.whoop.trackactivity.domain;

import bc3.AbstractC3006f0;
import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.trackactivity.domain.models.LiveActivityTargetsResponse;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13054k;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import i63.C18181t;
import ih0.AbstractC18489d0;
import j21.C21245d;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.Map;
import l83.C23454a0;
import mk2.AbstractC25641h;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;", "", "Lnm0/e;", "cachedApiSource", "Ltr2/n;", "logger", "", "maxAttempts", "", "retryDelayMs", "<init>", "(Lnm0/e;Ltr2/n;IJ)V", "", "activityType", "Lec3/l;", "Lpm0/a;", "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;", "d", "(Ljava/lang/String;)Lec3/l;", "a", "Lnm0/e;", "b", "Ltr2/n;", "c", "I", "J", "e", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SessionTargetsFetcher {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f31375f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int maxAttempts;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long retryDelayMs;

    /* JADX INFO: renamed from: com.whoop.trackactivity.domain.SessionTargetsFetcher$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$a;", "", "<init>", "()V", "", "activityType", "a", "(Ljava/lang/String;)Ljava/lang/String;", "LIVE_PATH", "Ljava/lang/String;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m26507a(String activityType) {
            AbstractC22676k.m65750j(activityType, "activityType");
            return "core-details-bff/v1/live-activity-targets/bff/live?activityType=".concat(activityType);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.domain.SessionTargetsFetcher$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.SessionTargetsFetcher$fetch$2$2", m100430f = "SessionTargetsFetcher.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lec3/m;", "Lpm0/a;", "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10388b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f31380w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f31381x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f31383z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10388b(String str, InterfaceC30057d<? super C10388b> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f31383z = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C10388b c10388b = SessionTargetsFetcher.this.new C10388b(this.f31383z, interfaceC30057d);
            c10388b.f31381x = th3;
            return c10388b.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = (Throwable) this.f31381x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f31380w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8721o(getContext());
            SessionTargetsFetcher.this.logger.mo85222m(AbstractC31061c.m95640p("Failed to fetch live activity targets for [", this.f31383z, "]: ", th3.getMessage()), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.domain.SessionTargetsFetcher$c */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.SessionTargetsFetcher$fetch$lambda$1$$inlined$cacheAPI$1", m100430f = "SessionTargetsFetcher.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10389c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f31384w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f31385x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f31386y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f31387z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10389c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f31387z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C10389c c10389c = new C10389c(interfaceC30057d, this.f31387z);
            c10389c.f31385x = interfaceC13062m;
            c10389c.f31386y = c26832c;
            return c10389c.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31384w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f31385x;
                C26832c c26832c = (C26832c) this.f31386y;
                InterfaceC26834e interfaceC26834e = this.f31387z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(LiveActivityTargetsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(LiveActivityTargetsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f31385x = null;
                this.f31386y = null;
                this.f31384w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public SessionTargetsFetcher(InterfaceC26834e cachedApiSource, InterfaceC34116n logger, int i13, long j7) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.logger = logger;
        this.maxAttempts = i13;
        this.retryDelayMs = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m26504e(SessionTargetsFetcher sessionTargetsFetcher, String str, int i13, int i14) {
        InterfaceC34116n interfaceC34116n = sessionTargetsFetcher.logger;
        int i15 = sessionTargetsFetcher.maxAttempts;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i14, "Live activity targets transient error (", ") for [", str, "]; retry ");
        sbM53373n.append(i13 + 1);
        sbM53373n.append(" of ");
        sbM53373n.append(i15);
        interfaceC34116n.mo85226q(sbM53373n.toString(), new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC13058l m26505f(String str, SessionTargetsFetcher sessionTargetsFetcher, final String str2) {
        return new C13015a0(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetApiRequest(str2) { // from class: com.whoop.trackactivity.domain.SessionTargetsFetcher$fetch$2$1
            private final Map<String, String> parameters;
            private final String path = "core-details-bff/v1/live-activity-targets/bff/live";

            {
                this.parameters = AbstractC31061c.m95645u("activityType", str2);
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ boolean getHasBody() {
                return super.getHasBody();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ Map<String, String> getHeaders() {
                return super.getHeaders();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
                return super.getHttpTimeoutConfig();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ C18181t getMethod() {
                return super.getMethod();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public Map<String, String> getParameters() {
                return this.parameters;
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public String getPath() {
                return this.path;
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ String getTag() {
                return super.getTag();
            }

            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ String url(AbstractC32943y abstractC32943y) {
                return super.url(abstractC32943y);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
            @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
            public /* bridge */ C23454a0 getBody() {
                return super.getBody();
            }
        }, 1), null, str, 1, null), new C10389c(null, sessionTargetsFetcher.cachedApiSource)), sessionTargetsFetcher.new C10388b(str, null));
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m26506d(String activityType) {
        AbstractC22676k.m65750j(activityType, "activityType");
        if (AbstractC39414r.m125890i0(activityType)) {
            return C13054k.f45116w;
        }
        String strM26507a = INSTANCE.m26507a(activityType);
        return AbstractC25641h.m75445c(this.maxAttempts, this.retryDelayMs, new C21245d(16, this, strM26507a), new C18656a0(29, this, activityType, strM26507a));
    }

    public /* synthetic */ SessionTargetsFetcher(InterfaceC26834e interfaceC26834e, InterfaceC34116n interfaceC34116n, int i13, long j7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, (i14 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SessionTargetsFetcher") : interfaceC34116n, (i14 & 4) != 0 ? 3 : i13, (i14 & 8) != 0 ? 500L : j7);
    }
}
