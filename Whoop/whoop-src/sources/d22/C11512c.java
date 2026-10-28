package d22;

import c93.InterfaceC4351m;
import com.whoop.data.coordinator.BannerInvalidator;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.pairing.membershipAdjustment.api.MembershipAdjustmentApi;
import com.whoop.pairing.membershipAdjustment.domain.models.MembershipAdjustmentResponse;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.Map;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: d22.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0014\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u001a\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00112\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Ld22/c;", "Lod1/g;", "Ld22/a;", "Ld22/b;", "Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;", "api", "Lsr2/y;", "urlProvider", "Lcom/whoop/data/coordinator/BannerInvalidator;", "bannerInvalidator", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;Lsr2/y;Lcom/whoop/data/coordinator/BannerInvalidator;Lcom/whoop/data/local/prefs/PreferenceHelper;Ltr2/n;)V", "Lec3/m;", "", "strapSerial", "strapSignature", "g", "(Lec3/m;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "prevDomainResult", "path", "", "payload", "f", "(Lec3/m;Ld22/b;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/pairing/membershipAdjustment/api/MembershipAdjustmentApi;", "b", "Lsr2/y;", "c", "Lcom/whoop/data/coordinator/BannerInvalidator;", "d", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "e", "Ltr2/n;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11512c implements InterfaceC27844g<AbstractC11510a, InterfaceC11511b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MembershipAdjustmentApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final BannerInvalidator bannerInvalidator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d22.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.domain.MembershipAdjustmentInteractor", m100430f = "MembershipAdjustmentInteractor.kt", m100431l = {63, 65}, m100432m = "adjustMembership", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f37049E;

        /* JADX INFO: renamed from: F */
        Object f37050F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f37051G;

        /* JADX INFO: renamed from: I */
        int f37053I;

        /* JADX INFO: renamed from: w */
        Object f37054w;

        /* JADX INFO: renamed from: x */
        Object f37055x;

        /* JADX INFO: renamed from: y */
        Object f37056y;

        /* JADX INFO: renamed from: z */
        Object f37057z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f37051G = obj;
            this.f37053I |= Integer.MIN_VALUE;
            return C11512c.this.m30974f(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: d22.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.domain.MembershipAdjustmentInteractor$adjustMembership$response$1", m100430f = "MembershipAdjustmentInteractor.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f37058w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f37060y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Map<String, String> f37061z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Map<String, String> map, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f37060y = str;
            this.f37061z = map;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11512c.this.new b(this.f37060y, this.f37061z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f37058w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MembershipAdjustmentApi membershipAdjustmentApi = C11512c.this.api;
                String str = this.f37060y;
                Map<String, String> map = this.f37061z;
                this.f37058w = 1;
                if (membershipAdjustmentApi.adjustMembership(str, map, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: d22.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.domain.MembershipAdjustmentInteractor", m100430f = "MembershipAdjustmentInteractor.kt", m100431l = {42, 43}, m100432m = "fetchAdjustmentMembershipScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f37063F;

        /* JADX INFO: renamed from: w */
        Object f37064w;

        /* JADX INFO: renamed from: x */
        Object f37065x;

        /* JADX INFO: renamed from: y */
        Object f37066y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f37067z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f37067z = obj;
            this.f37063F |= Integer.MIN_VALUE;
            return C11512c.this.m30975g(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: d22.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.domain.MembershipAdjustmentInteractor$fetchAdjustmentMembershipScreen$response$1", m100430f = "MembershipAdjustmentInteractor.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f37068w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f37070y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f37071z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f37070y = str;
            this.f37071z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11512c.this.new d(this.f37070y, this.f37071z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f37068w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipAdjustmentApi membershipAdjustmentApi = C11512c.this.api;
            String str = this.f37070y;
            String str2 = this.f37071z;
            this.f37068w = 1;
            Object membershipAdjustment = membershipAdjustmentApi.getMembershipAdjustment(str, str2, this);
            return membershipAdjustment == enumC31071a ? enumC31071a : membershipAdjustment;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MembershipAdjustmentResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: d22.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.domain.MembershipAdjustmentInteractor$interact$1", m100430f = "MembershipAdjustmentInteractor.kt", m100431l = {25, 27}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ld22/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C11512c f37072E;

        /* JADX INFO: renamed from: w */
        Object f37073w;

        /* JADX INFO: renamed from: x */
        int f37074x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f37075y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f37076z;

        /* JADX INFO: renamed from: d22.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f37077w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11512c f37078x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f37079y;

            /* JADX INFO: renamed from: d22.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.pairing.membershipAdjustment.domain.MembershipAdjustmentInteractor$interact$1$1", m100430f = "MembershipAdjustmentInteractor.kt", m100431l = {29, 30, 37}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41452a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f37080E;

                /* JADX INFO: renamed from: w */
                Object f37081w;

                /* JADX INFO: renamed from: x */
                Object f37082x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f37083y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f37084z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C41452a(a<? super T> aVar, InterfaceC30057d<? super C41452a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f37084z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f37083y = obj;
                    this.f37080E |= Integer.MIN_VALUE;
                    return this.f37084z.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C11512c c11512c, InterfaceC13062m interfaceC13062m) {
                this.f37077w = c22669g0;
                this.f37078x = c11512c;
                this.f37079y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
            
                if (r12.emit(r13, r7) == r0) goto L35;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(d22.AbstractC11510a r12, q83.InterfaceC30057d<? super l83.C23454a0> r13) {
                /*
                    Method dump skipped, instruction units count: 207
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: d22.C11512c.e.a.emit(d22.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13058l interfaceC13058l, C11512c c11512c, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f37076z = interfaceC13058l;
            this.f37072E = c11512c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f37076z, this.f37072E, interfaceC30057d);
            eVar.f37075y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r7.collect(r4, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f37075y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f37074x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r6.f37073w
                kotlin.jvm.internal.g0 r0 = (p715kotlin.jvm.internal.C22669g0) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L54
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r2 = r6.f37073w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3d
            L28:
                kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r7)
                d22.b$b r7 = d22.InterfaceC11511b.b.f37041a
                r2.f89336w = r7
                r6.f37075y = r0
                r6.f37073w = r2
                r6.f37074x = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L3d
                goto L53
            L3d:
                ec3.l r7 = r6.f37076z
                d22.c$e$a r4 = new d22.c$e$a
                d22.c r5 = r6.f37072E
                r4.<init>(r2, r5, r0)
                r0 = 0
                r6.f37075y = r0
                r6.f37073w = r0
                r6.f37074x = r3
                java.lang.Object r7 = r7.collect(r4, r6)
                if (r7 != r1) goto L54
            L53:
                return r1
            L54:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: d22.C11512c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C11512c(MembershipAdjustmentApi api, AbstractC32943y urlProvider, BannerInvalidator bannerInvalidator, PreferenceHelper preferenceHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        AbstractC22676k.m65750j(bannerInvalidator, "bannerInvalidator");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.urlProvider = urlProvider;
        this.bannerInvalidator = bannerInvalidator;
        this.preferenceHelper = preferenceHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m30974f(InterfaceC13062m interfaceC13062m, InterfaceC11511b interfaceC11511b, String str, Map<String, String> map, String str2, InterfaceC30057d<? super InterfaceC11511b> interfaceC30057d) {
        a aVar;
        String str3;
        InterfaceC34385a interfaceC34385a;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f37053I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f37053I = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f37051G;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar2.f37053I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (!(interfaceC11511b instanceof InterfaceC11511b.c)) {
                return InterfaceC11511b.a.f37040a;
            }
            Object obj2 = InterfaceC11511b.b.f37041a;
            aVar2.f37054w = null;
            aVar2.f37055x = null;
            aVar2.f37056y = str;
            aVar2.f37057z = map;
            aVar2.f37049E = str2;
            aVar2.f37053I = 1;
            if (interfaceC13062m.emit(obj2, aVar2) != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            str2 = (String) aVar2.f37049E;
            map = (Map) aVar2.f37057z;
            str = (String) aVar2.f37056y;
            AbstractC34132o.m107864I(objM108729b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) aVar2.f37049E;
            AbstractC34132o.m107864I(objM108729b);
        }
        interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            this.bannerInvalidator.invalidateBanners();
            this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_LAST_RECORDED_STRAP_SERIAL, str3);
            return InterfaceC11511b.d.f37043a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC11511b.a.f37040a;
        }
        throw new NoWhenBranchMatchedException();
        String strM8299l = AbstractC2875y.m8299l(this.urlProvider.getApiBaseUrl(), str);
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        b bVar = new b(strM8299l, map, null);
        aVar2.f37054w = null;
        aVar2.f37055x = null;
        aVar2.f37056y = null;
        aVar2.f37057z = null;
        aVar2.f37049E = str2;
        aVar2.f37050F = null;
        aVar2.f37053I = 2;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
        if (objM108729b != obj) {
            str3 = str2;
            interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                this.bannerInvalidator.invalidateBanners();
                this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_LAST_RECORDED_STRAP_SERIAL, str3);
                return InterfaceC11511b.d.f37043a;
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return InterfaceC11511b.a.f37040a;
            }
            throw new NoWhenBranchMatchedException();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r13 == r0) goto L22;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m30975g(ec3.InterfaceC13062m r10, java.lang.String r11, java.lang.String r12, q83.InterfaceC30057d<? super d22.InterfaceC11511b> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof d22.C11512c.c
            if (r0 == 0) goto L14
            r0 = r13
            d22.c$c r0 = (d22.C11512c.c) r0
            int r1 = r0.f37063F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f37063F = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            d22.c$c r0 = new d22.c$c
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f37067z
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f37063F
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L53
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            java.lang.Object r10 = r6.f37066y
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r6.f37065x
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r6.f37064w
            ec3.m r10 = (ec3.InterfaceC13062m) r10
            p505ts.AbstractC34132o.m107864I(r13)
            goto L84
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            java.lang.Object r10 = r6.f37066y
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r6.f37065x
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r6.f37064w
            ec3.m r10 = (ec3.InterfaceC13062m) r10
            p505ts.AbstractC34132o.m107864I(r13)
            goto L67
        L53:
            p505ts.AbstractC34132o.m107864I(r13)
            d22.b$b r13 = d22.InterfaceC11511b.b.f37041a
            r6.f37064w = r4
            r6.f37065x = r11
            r6.f37066y = r12
            r6.f37063F = r3
            java.lang.Object r10 = r10.emit(r13, r6)
            if (r10 != r0) goto L67
            goto L83
        L67:
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r10 = r2
            tr2.n r2 = r9.logger
            d22.c$d r5 = new d22.c$d
            r5.<init>(r11, r12, r4)
            r6.f37064w = r4
            r6.f37065x = r4
            r6.f37066y = r4
            r6.f37063F = r10
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L84
        L83:
            return r0
        L84:
            u02.a r13 = (u02.InterfaceC34385a) r13
            boolean r10 = r13 instanceof u02.InterfaceC34385a.c
            if (r10 == 0) goto L9d
            u02.a$c r13 = (u02.InterfaceC34385a.c) r13
            java.lang.Object r10 = r13.m108735a()
            com.whoop.pairing.membershipAdjustment.domain.models.MembershipAdjustmentResponse r10 = (com.whoop.pairing.membershipAdjustment.domain.models.MembershipAdjustmentResponse) r10
            if (r10 == 0) goto L9a
            d22.b$c r11 = new d22.b$c
            r11.<init>(r10)
            return r11
        L9a:
            d22.b$a r10 = d22.InterfaceC11511b.a.f37040a
            return r10
        L9d:
            boolean r10 = r13 instanceof u02.InterfaceC34385a.b
            if (r10 == 0) goto La4
            d22.b$a r10 = d22.InterfaceC11511b.a.f37040a
            return r10
        La4:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d22.C11512c.m30975g(ec3.m, java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new e(upstream, this, null));
    }
}
