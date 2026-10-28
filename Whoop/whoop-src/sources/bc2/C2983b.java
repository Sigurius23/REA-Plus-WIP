package bc2;

import c93.InterfaceC4351m;
import com.whoop.data.repositories.ArabicBetaOptOutStatusStore;
import com.whoop.service.network.LanguageApi;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: bc2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lbc2/b;", "Lod1/g;", "Lbc2/a;", "Lbc2/c;", "Lcom/whoop/service/network/LanguageApi;", "languageApi", "Lfi0/a;", "analytics", "Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;", "arabicBetaOptOutStatusStore", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/LanguageApi;Lfi0/a;Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/service/network/LanguageApi;", "b", "Lfi0/a;", "c", "Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;", "d", "Ltr2/n;", "e", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2983b implements InterfaceC27844g<InterfaceC2982a, InterfaceC2984c> {

    /* JADX INFO: renamed from: e */
    private static final a f11972e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f11973f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LanguageApi languageApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ArabicBetaOptOutStatusStore arabicBetaOptOutStatusStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: bc2.b$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lbc2/b$a;", "", "<init>", "()V", "", "ARABIC_OPT_OUT_EVENT", "Ljava/lang/String;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: bc2.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.settings.language.optout.domain.LanguageBetaOptOutInteractor$interact$$inlined$flatMapLatest$1", m100430f = "LanguageBetaOptOutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f11978w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f11979x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f11980y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C2983b f11981z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C2983b c2983b) {
            super(3, interfaceC30057d);
            this.f11981z = c2983b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC2982a interfaceC2982a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f11981z);
            bVar.f11979x = interfaceC13062m;
            bVar.f11980y = interfaceC2982a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f11978w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f11979x;
                if (!AbstractC22676k.m65745e((InterfaceC2982a) this.f11980y, InterfaceC2982a.a.f11971a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C13084s1 c13084s1 = new C13084s1(this.f11981z.new c(null));
                this.f11979x = null;
                this.f11980y = null;
                this.f11978w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC2982a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: bc2.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.settings.language.optout.domain.LanguageBetaOptOutInteractor$interact$1$1", m100430f = "LanguageBetaOptOutInteractor.kt", m100431l = {25, 28, 33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbc2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f11982w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f11983x;

        /* JADX INFO: renamed from: bc2.b$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.language.optout.domain.LanguageBetaOptOutInteractor$interact$1$1$1", m100430f = "LanguageBetaOptOutInteractor.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f11985w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C2983b f11986x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2983b c2983b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f11986x = c2983b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f11986x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f11985w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                LanguageApi languageApi = this.f11986x.languageApi;
                this.f11985w = 1;
                Object objOptOutOfArabicBeta = languageApi.optOutOfArabicBeta(this);
                return objOptOutOfArabicBeta == enumC31071a ? enumC31071a : objOptOutOfArabicBeta;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C2983b.this.new c(interfaceC30057d);
            cVar.f11983x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        
            if (r8.emit(r0, r21) == r9) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r5 = r21
                java.lang.Object r0 = r5.f11983x
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r5.f11982w
                r10 = 0
                r11 = 3
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L2b
                if (r0 == r2) goto L27
                if (r0 == r1) goto L23
                if (r0 != r11) goto L1b
                p505ts.AbstractC34132o.m107864I(r22)
                goto L87
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L23:
                p505ts.AbstractC34132o.m107864I(r22)
                goto L5b
            L27:
                p505ts.AbstractC34132o.m107864I(r22)
                goto L3b
            L2b:
                p505ts.AbstractC34132o.m107864I(r22)
                bc2.c$a r0 = bc2.InterfaceC2984c.a.f11987a
                r5.f11983x = r8
                r5.f11982w = r2
                java.lang.Object r0 = r8.emit(r0, r5)
                if (r0 != r9) goto L3b
                goto L86
            L3b:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                bc2.b r2 = bc2.C2983b.this
                tr2.n r2 = bc2.C2983b.m8671f(r2)
                bc2.b$c$a r4 = new bc2.b$c$a
                bc2.b r3 = bc2.C2983b.this
                r4.<init>(r3, r10)
                r5.f11983x = r8
                r5.f11982w = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "Failed to opt out of Arabic beta"
                r6 = 2
                r7 = 0
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L5b
                goto L86
            L5b:
                bc2.b r0 = bc2.C2983b.this
                fi0.a r12 = bc2.C2983b.m8668c(r0)
                r19 = 55
                r20 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                java.lang.String r16 = "arabic_opt_out_event"
                r17 = 0
                r18 = 0
                fi0.InterfaceC14515a.m41418i(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                bc2.b r0 = bc2.C2983b.this
                com.whoop.data.repositories.ArabicBetaOptOutStatusStore r0 = bc2.C2983b.m8669d(r0)
                r0.markOptedOut()
                bc2.c$b r0 = bc2.InterfaceC2984c.b.f11988a
                r5.f11983x = r10
                r5.f11982w = r11
                java.lang.Object r0 = r8.emit(r0, r5)
                if (r0 != r9) goto L87
            L86:
                return r9
            L87:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bc2.C2983b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C2983b(LanguageApi languageApi, InterfaceC14515a analytics, ArabicBetaOptOutStatusStore arabicBetaOptOutStatusStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(languageApi, "languageApi");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(arabicBetaOptOutStatusStore, "arabicBetaOptOutStatusStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.languageApi = languageApi;
        this.analytics = analytics;
        this.arabicBetaOptOutStatusStore = arabicBetaOptOutStatusStore;
        this.logger = logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new b(null, this));
    }

    public /* synthetic */ C2983b(LanguageApi languageApi, InterfaceC14515a interfaceC14515a, ArabicBetaOptOutStatusStore arabicBetaOptOutStatusStore, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(languageApi, interfaceC14515a, arabicBetaOptOutStatusStore, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LanguageBetaOptOutInteractor") : interfaceC34116n);
    }
}
