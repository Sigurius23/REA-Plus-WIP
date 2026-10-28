package uy1;

import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import dj0.C12066b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p743vy1.InterfaceC36601c;
import py1.AbstractC29623b;
import py1.C29622a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wy1.C37697d;
import y92.C39352a;

/* JADX INFO: renamed from: uy1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 82\u00020\u0001:\u0001*BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001e\u0010\u0014J\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u0018J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 H\u0082@¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b$\u0010\u0014J!\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0015¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, m65681d2 = {"Luy1/c;", "", "Ly92/a;", "authManager", "Luy1/a;", "jwtClaimProvider", "Ldj0/b;", "cognitoAuthApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagProvider", "Lwy1/d;", "mfaTokenRefresher", "Lpy1/a;", "mfaAnalyticsHelper", "Ltr2/n;", "logger", "<init>", "(Ly92/a;Luy1/a;Ldj0/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwy1/d;Lpy1/a;Ltr2/n;)V", "", "o", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Luy1/d;", "m", "()Lec3/l;", "Luy1/i;", "mfaState", "Luy1/h;", "j", "(Luy1/i;)Luy1/h;", "l", "n", "Ll83/k;", "Luy1/g;", "", "k", "i", "Lvy1/c;", "upstream", "Luy1/b;", "p", "(Lec3/l;)Lec3/l;", "a", "Ly92/a;", "b", "Luy1/a;", "c", "Ldj0/b;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lwy1/d;", "f", "Lpy1/a;", "g", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35379c {

    /* JADX INFO: renamed from: i */
    public static final int f150698i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35377a jwtClaimProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12066b cognitoAuthApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C37697d mfaTokenRefresher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C29622a mfaAnalyticsHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: uy1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.management.MfaManagementInteractor", m100430f = "MfaManagementInteractor.kt", m100431l = {169, 174, 177}, m100432m = "disableMfaCognito", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f150706w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f150707x;

        /* JADX INFO: renamed from: z */
        int f150709z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f150707x = obj;
            this.f150709z |= Integer.MIN_VALUE;
            return C35379c.this.m112289i(this);
        }
    }

    /* JADX INFO: renamed from: uy1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.management.MfaManagementInteractor", m100430f = "MfaManagementInteractor.kt", m100431l = {138, 143}, m100432m = "getMfaMethodAndTypeFromCognito", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f150710w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f150711x;

        /* JADX INFO: renamed from: z */
        int f150713z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f150711x = obj;
            this.f150713z |= Integer.MIN_VALUE;
            return C35379c.this.m112291k(this);
        }
    }

    /* JADX INFO: renamed from: uy1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.management.MfaManagementInteractor", m100430f = "MfaManagementInteractor.kt", m100431l = {117}, m100432m = "getMfaState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f150714w;

        /* JADX INFO: renamed from: y */
        int f150716y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f150714w = obj;
            this.f150716y |= Integer.MIN_VALUE;
            return C35379c.this.m112292l(this);
        }
    }

    /* JADX INFO: renamed from: uy1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.management.MfaManagementInteractor$handleInit$1", m100430f = "MfaManagementInteractor.kt", m100431l = {93, 96, 96, 98, 102}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Luy1/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f150717E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f150718F;

        /* JADX INFO: renamed from: w */
        Object f150720w;

        /* JADX INFO: renamed from: x */
        Object f150721x;

        /* JADX INFO: renamed from: y */
        Object f150722y;

        /* JADX INFO: renamed from: z */
        Object f150723z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C35379c.this.new e(interfaceC30057d);
            eVar.f150718F = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00af  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c0 A[PHI: r10
          0x00c0: PHI (r10v13 java.lang.Object) = (r10v12 java.lang.Object), (r10v0 java.lang.Object) binds: [B:27:0x00bd, B:12:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
        
            if (r0.emit(r4, r9) == r1) goto L37;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: uy1.C35379c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: uy1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.management.MfaManagementInteractor$handleToggleToDisabled$1", m100430f = "MfaManagementInteractor.kt", m100431l = {132, 133, 133}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Luy1/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f150724w;

        /* JADX INFO: renamed from: x */
        int f150725x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f150726y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C35379c.this.new f(interfaceC30057d);
            fVar.f150726y = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f150726y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f150725x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L63
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f150724w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4b
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                uy1.d$d r8 = uy1.InterfaceC35380d.d.f150745a
                r7.f150726y = r0
                r7.f150725x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3c
                goto L62
            L3c:
                uy1.c r8 = uy1.C35379c.this
                r7.f150726y = r6
                r7.f150724w = r0
                r7.f150725x = r4
                java.lang.Object r8 = uy1.C35379c.m112281a(r8, r7)
                if (r8 != r1) goto L4b
                goto L62
            L4b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                uy1.d$a r2 = new uy1.d$a
                r2.<init>(r8)
                r7.f150726y = r6
                r7.f150724w = r6
                r7.f150725x = r3
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto L63
            L62:
                return r1
            L63:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uy1.C35379c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: uy1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.management.MfaManagementInteractor", m100430f = "MfaManagementInteractor.kt", m100431l = {82, 84}, m100432m = "hasMfaEnabled", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f150728w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f150729x;

        /* JADX INFO: renamed from: z */
        int f150731z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f150729x = obj;
            this.f150731z |= Integer.MIN_VALUE;
            return C35379c.this.m112295o(this);
        }
    }

    /* JADX INFO: renamed from: uy1.c$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.management.MfaManagementInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MfaManagementInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f150732w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f150733x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f150734y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35379c f150735z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C35379c c35379c) {
            super(3, interfaceC30057d);
            this.f150735z = c35379c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC36601c interfaceC36601c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f150735z);
            hVar.f150733x = interfaceC13062m;
            hVar.f150734y = interfaceC36601c;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM112294n;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150732w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f150733x;
                InterfaceC36601c interfaceC36601c = (InterfaceC36601c) this.f150734y;
                if (AbstractC22676k.m65745e(interfaceC36601c, InterfaceC36601c.a.f156792a) || AbstractC22676k.m65745e(interfaceC36601c, InterfaceC36601c.b.f156793a)) {
                    interfaceC13058lM112294n = this.f150735z.m112293m();
                } else {
                    if (!(interfaceC36601c instanceof InterfaceC36601c.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM112294n = this.f150735z.m112294n();
                }
                this.f150733x = null;
                this.f150734y = null;
                this.f150732w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM112294n, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC36601c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: uy1.c$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.management.MfaManagementInteractor$interact$2", m100430f = "MfaManagementInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Luy1/b;", "state", "Luy1/d;", "action", "<anonymous>", "(Luy1/b;Luy1/d;)Luy1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f150736w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f150737x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f150738y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C35378b c35378b, InterfaceC35380d interfaceC35380d, InterfaceC30057d<? super C35378b> interfaceC30057d) {
            i iVar = C35379c.this.new i(interfaceC30057d);
            iVar.f150737x = c35378b;
            iVar.f150738y = interfaceC35380d;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C35378b c35378b = (C35378b) this.f150737x;
            InterfaceC35380d interfaceC35380d = (InterfaceC35380d) this.f150738y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150736w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean z4 = true;
            if (interfaceC35380d instanceof InterfaceC35380d.c) {
                InterfaceC35380d.c cVar = (InterfaceC35380d.c) interfaceC35380d;
                boolean mfaEnabled = cVar.getMfaEnabled();
                if (cVar.getMfaEnabled() && cVar.getRequirementReason() != EnumC35384h.NONE) {
                    z4 = false;
                }
                return new C35378b(mfaEnabled, z4, cVar.getRequirementReason(), null, null, false, false, true, 120, null);
            }
            if (interfaceC35380d instanceof InterfaceC35380d.b) {
                InterfaceC35380d.b bVar = (InterfaceC35380d.b) interfaceC35380d;
                return C35378b.m112272b(c35378b, false, false, null, bVar.getMethodType(), bVar.getMethod(), false, false, false, 231, null);
            }
            if (AbstractC22676k.m65745e(interfaceC35380d, InterfaceC35380d.d.f150745a)) {
                return C35378b.m112272b(c35378b, false, false, null, null, null, true, false, false, 222, null);
            }
            if (!(interfaceC35380d instanceof InterfaceC35380d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            EnumC35383g methodType = c35378b.getMethodType();
            if (methodType != null) {
                C35379c c35379c = C35379c.this;
                if (((InterfaceC35380d.a) interfaceC35380d).getSuccess()) {
                    c35379c.mfaAnalyticsHelper.m91021i(AbstractC29623b.m91037d(methodType));
                } else {
                    c35379c.mfaAnalyticsHelper.m91013a(AbstractC29623b.m91037d(methodType));
                }
            }
            InterfaceC35380d.a aVar = (InterfaceC35380d.a) interfaceC35380d;
            return C35378b.m112272b(c35378b, !aVar.getSuccess(), false, null, null, null, false, !aVar.getSuccess(), false, 158, null);
        }
    }

    public C35379c(C39352a authManager, C35377a jwtClaimProvider, C12066b cognitoAuthApi, FeatureFlagChecker featureFlagProvider, C37697d mfaTokenRefresher, C29622a mfaAnalyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(jwtClaimProvider, "jwtClaimProvider");
        AbstractC22676k.m65750j(cognitoAuthApi, "cognitoAuthApi");
        AbstractC22676k.m65750j(featureFlagProvider, "featureFlagProvider");
        AbstractC22676k.m65750j(mfaTokenRefresher, "mfaTokenRefresher");
        AbstractC22676k.m65750j(mfaAnalyticsHelper, "mfaAnalyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.authManager = authManager;
        this.jwtClaimProvider = jwtClaimProvider;
        this.cognitoAuthApi = cognitoAuthApi;
        this.featureFlagProvider = featureFlagProvider;
        this.mfaTokenRefresher = mfaTokenRefresher;
        this.mfaAnalyticsHelper = mfaAnalyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x007a A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:14:0x0031, B:41:0x0087, B:43:0x008f, B:21:0x0044, B:36:0x0072, B:38:0x007a, B:22:0x0048, B:28:0x005a, B:30:0x005e, B:33:0x0065, B:44:0x00a4, B:25:0x004f), top: B:49:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r10 == r2) goto L40;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m112289i(q83.InterfaceC30057d<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "MFA disable result: "
            boolean r1 = r10 instanceof uy1.C35379c.b
            if (r1 == 0) goto L15
            r1 = r10
            uy1.c$b r1 = (uy1.C35379c.b) r1
            int r2 = r1.f150709z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f150709z = r2
            goto L1a
        L15:
            uy1.c$b r1 = new uy1.c$b
            r1.<init>(r10)
        L1a:
            java.lang.Object r10 = r1.f150707x
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r1.f150709z
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L4c
            if (r3 == r7) goto L48
            if (r3 == r6) goto L40
            if (r3 != r5) goto L38
            java.lang.Object r2 = r1.f150706w
            java.lang.String r2 = (java.lang.String) r2
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L35
            goto L87
        L35:
            r10 = move-exception
            goto Lb0
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L40:
            java.lang.Object r3 = r1.f150706w
            java.lang.String r3 = (java.lang.String) r3
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L35
            goto L72
        L48:
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L35
            goto L5a
        L4c:
            p505ts.AbstractC34132o.m107864I(r10)
            y92.a r10 = r9.authManager     // Catch: java.lang.Exception -> L35
            r1.f150709z = r7     // Catch: java.lang.Exception -> L35
            java.lang.Object r10 = r10.m125478a(r1)     // Catch: java.lang.Exception -> L35
            if (r10 != r2) goto L5a
            goto L86
        L5a:
            com.whoop.domain.model.AuthMaterial r10 = (com.whoop.domain.model.AuthMaterial) r10     // Catch: java.lang.Exception -> L35
            if (r10 == 0) goto La4
            java.lang.String r10 = r10.getAccessToken()     // Catch: java.lang.Exception -> L35
            if (r10 != 0) goto L65
            goto La4
        L65:
            dj0.b r3 = r9.cognitoAuthApi     // Catch: java.lang.Exception -> L35
            r1.f150706w = r4     // Catch: java.lang.Exception -> L35
            r1.f150709z = r6     // Catch: java.lang.Exception -> L35
            java.lang.Object r10 = r3.m33310u(r10, r1)     // Catch: java.lang.Exception -> L35
            if (r10 != r2) goto L72
            goto L86
        L72:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Exception -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Exception -> L35
            if (r10 == 0) goto L8e
            wy1.d r10 = r9.mfaTokenRefresher     // Catch: java.lang.Exception -> L35
            r1.f150706w = r4     // Catch: java.lang.Exception -> L35
            r1.f150709z = r5     // Catch: java.lang.Exception -> L35
            java.lang.Object r10 = r10.m121142b(r1)     // Catch: java.lang.Exception -> L35
            if (r10 != r2) goto L87
        L86:
            return r2
        L87:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Exception -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Exception -> L35
            goto L8f
        L8e:
            r10 = r8
        L8f:
            tr2.n r2 = r9.logger     // Catch: java.lang.Exception -> L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L35
            r3.<init>(r0)     // Catch: java.lang.Exception -> L35
            r3.append(r10)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L35
            qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r8]     // Catch: java.lang.Exception -> L35
            r2.mo85228t(r0, r3)     // Catch: java.lang.Exception -> L35
            r8 = r10
            goto Lc0
        La4:
            tr2.n r10 = r9.logger     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = "No access token available for disableMfaCognito"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r8]     // Catch: java.lang.Exception -> L35
            r10.mo85222m(r0, r2)     // Catch: java.lang.Exception -> L35
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L35
            return r10
        Lb0:
            q83.j r0 = r1.getContext()
            bc3.AbstractC3006f0.m8721o(r0)
            tr2.n r0 = r9.logger
            java.lang.String r1 = "Failed to disable MFA in Cognito"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r8]
            r0.mo85230v(r1, r10, r2)
        Lc0:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uy1.C35379c.m112289i(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final EnumC35384h m112290j(C35385i mfaState) {
        EnumC35384h requirementReason = mfaState.getRequirementReason();
        EnumC35384h enumC35384h = EnumC35384h.CMS_ACCESS;
        if (requirementReason != enumC35384h) {
            return mfaState.getRequirementReason();
        }
        if (this.featureFlagProvider.isFeatureEnabled("android-mfa-cms-settings")) {
            return enumC35384h;
        }
        return mfaState.getMfaRequired() ? EnumC35384h.ADVANCED_LABS : EnumC35384h.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m112291k(q83.InterfaceC30057d<? super l83.C23465k> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof uy1.C35379c.c
            if (r0 == 0) goto L13
            r0 = r8
            uy1.c$c r0 = (uy1.C35379c.c) r0
            int r1 = r0.f150713z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150713z = r1
            goto L18
        L13:
            uy1.c$c r0 = new uy1.c$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f150711x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f150713z
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f150710w
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L62
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4a
        L3c:
            p505ts.AbstractC34132o.m107864I(r8)
            y92.a r8 = r7.authManager
            r0.f150713z = r5
            java.lang.Object r8 = r8.m125478a(r0)
            if (r8 != r1) goto L4a
            goto L61
        L4a:
            com.whoop.domain.model.AuthMaterial r8 = (com.whoop.domain.model.AuthMaterial) r8
            if (r8 == 0) goto La1
            java.lang.String r8 = r8.getAccessToken()
            if (r8 != 0) goto L55
            goto La1
        L55:
            dj0.b r2 = r7.cognitoAuthApi
            r0.f150710w = r6
            r0.f150713z = r4
            java.lang.Object r8 = r2.m33311w(r8, r0)
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            fj0.b r8 = (fj0.C14528b) r8
            if (r8 == 0) goto L82
            java.lang.String r0 = r8.getPreferredMfaSetting()
            if (r0 == 0) goto L82
            java.lang.String r1 = "SMS"
            boolean r0 = yb3.AbstractC39414r.m125876U(r0, r1, r3)
            if (r0 != r5) goto L82
            java.lang.String r8 = r8.getPhoneNumber()
            if (r8 == 0) goto La0
            l83.k r0 = new l83.k
            uy1.g r1 = uy1.EnumC35383g.PHONE
            r0.<init>(r1, r8)
            return r0
        L82:
            if (r8 == 0) goto La0
            java.lang.String r0 = r8.getPreferredMfaSetting()
            if (r0 == 0) goto La0
            java.lang.String r1 = "EMAIL"
            boolean r0 = yb3.AbstractC39414r.m125876U(r0, r1, r3)
            if (r0 != r5) goto La0
            java.lang.String r8 = r8.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String()
            if (r8 == 0) goto La0
            l83.k r0 = new l83.k
            uy1.g r1 = uy1.EnumC35383g.EMAIL
            r0.<init>(r1, r8)
            return r0
        La0:
            return r6
        La1:
            tr2.n r8 = r7.logger
            java.lang.String r0 = "No access token available for getMfaMethodAndTypeFromCognito"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r3]
            r8.mo85222m(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uy1.C35379c.m112291k(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m112292l(InterfaceC30057d<? super C35385i> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f150716y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f150716y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM112271a = dVar.f150714w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f150716y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM112271a);
                C35377a c35377a = this.jwtClaimProvider;
                dVar.f150716y = 1;
                objM112271a = c35377a.m112271a(dVar);
                if (objM112271a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM112271a);
            }
            return (C35385i) objM112271a;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(dVar.getContext());
            this.logger.mo85230v("Failed to get MFA state from JWT", e5, new AbstractC30556a.a[0]);
            this.mfaAnalyticsHelper.m91014b();
            return new C35385i(false, false, EnumC35384h.NONE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m112293m() {
        return new C13084s1(new e(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m112294n() {
        return new C13084s1(new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m112295o(q83.InterfaceC30057d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof uy1.C35379c.g
            if (r0 == 0) goto L13
            r0 = r7
            uy1.c$g r0 = (uy1.C35379c.g) r0
            int r1 = r0.f150731z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150731z = r1
            goto L18
        L13:
            uy1.c$g r0 = new uy1.c$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f150729x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f150731z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f150728w
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r7)
            goto L63
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L49
        L3b:
            p505ts.AbstractC34132o.m107864I(r7)
            y92.a r7 = r6.authManager
            r0.f150731z = r5
            java.lang.Object r7 = r7.m125478a(r0)
            if (r7 != r1) goto L49
            goto L62
        L49:
            com.whoop.domain.model.AuthMaterial r7 = (com.whoop.domain.model.AuthMaterial) r7
            r2 = 0
            if (r7 == 0) goto L53
            java.lang.String r7 = r7.getAccessToken()
            goto L54
        L53:
            r7 = r2
        L54:
            if (r7 == 0) goto L6b
            dj0.b r5 = r6.cognitoAuthApi
            r0.f150728w = r2
            r0.f150731z = r4
            java.lang.Object r7 = r5.m33311w(r7, r0)
            if (r7 != r1) goto L63
        L62:
            return r1
        L63:
            fj0.b r7 = (fj0.C14528b) r7
            if (r7 == 0) goto L6b
            boolean r3 = fj0.AbstractC14529c.m41464a(r7)
        L6b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uy1.C35379c.m112295o(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m112296p(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C35378b(false, false, null, null, null, false, false, false, 127, null), AbstractC13091v.m36590P(upstream, new h(null, this)), new i(null));
    }

    public /* synthetic */ C35379c(C39352a c39352a, C35377a c35377a, C12066b c12066b, FeatureFlagChecker featureFlagChecker, C37697d c37697d, C29622a c29622a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39352a, c35377a, c12066b, featureFlagChecker, c37697d, c29622a, (i13 & 64) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MfaManagementInteractor") : interfaceC34116n);
    }
}
