package wl1;

import bm1.C3422e;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.home.domain.models.StreakMetadata;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import java.time.Clock;
import java.time.Instant;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: wl1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lwl1/c;", "Lod1/g;", "Lwl1/a;", "Lwl1/b;", "Lbm1/e;", "streaksHomePreviousStreakDataStoreHandler", "La6/g;", "Lf6/f;", "dataStorePreferences", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lfi0/a;", "baseAnalytics", "Ljava/time/Clock;", "clock", "<init>", "(Lbm1/e;La6/g;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lfi0/a;Ljava/time/Clock;)V", "", "n", "(Lq83/d;)Ljava/lang/Object;", "k", "()Z", "m", "l", "Ll83/a0;", "p", "o", "()V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lbm1/e;", "b", "La6/g;", "c", "Ltr2/n;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lfi0/a;", "f", "Ljava/time/Clock;", "g", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37357c implements InterfaceC27844g<AbstractC37355a, AbstractC37356b> {

    /* JADX INFO: renamed from: h */
    public static final int f159782h = 8;

    /* JADX INFO: renamed from: i */
    private static final long f159783i;

    /* JADX INFO: renamed from: j */
    private static final C14132d f159784j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C3422e streaksHomePreviousStreakDataStoreHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePreferences;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: wl1.c$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159791w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37357c f159792x;

        /* JADX INFO: renamed from: wl1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159793w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37357c f159794x;

            /* JADX INFO: renamed from: wl1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.inAppReview.InAppReviewInteractor$interact$$inlined$map$1$2", m100430f = "InAppReviewInteractor.kt", m100431l = {57, 68, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42594a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159795E;

                /* JADX INFO: renamed from: F */
                Object f159796F;

                /* JADX INFO: renamed from: G */
                Object f159797G;

                /* JADX INFO: renamed from: H */
                Object f159798H;

                /* JADX INFO: renamed from: I */
                Object f159799I;

                /* JADX INFO: renamed from: J */
                Object f159800J;

                /* JADX INFO: renamed from: K */
                int f159801K;

                /* JADX INFO: renamed from: L */
                int f159802L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159803w;

                /* JADX INFO: renamed from: x */
                int f159804x;

                /* JADX INFO: renamed from: y */
                Object f159805y;

                public C42594a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159803w = obj;
                    this.f159804x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37357c c37357c) {
                this.f159793w = interfaceC13062m;
                this.f159794x = c37357c;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
            /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x011c, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L41;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, q83.InterfaceC30057d r11) {
                /*
                    Method dump skipped, instruction units count: 296
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: wl1.C37357c.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C37357c c37357c) {
            this.f159791w = interfaceC13058l;
            this.f159792x = c37357c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159791w.collect(new a(interfaceC13062m, this.f159792x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wl1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.inAppReview.InAppReviewInteractor", m100430f = "InAppReviewInteractor.kt", m100431l = {85}, m100432m = "isStreakEligibleForReview", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f159807w;

        /* JADX INFO: renamed from: y */
        int f159809y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159807w = obj;
            this.f159809y |= Integer.MIN_VALUE;
            return C37357c.this.m119643l(this);
        }
    }

    /* JADX INFO: renamed from: wl1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f159810w;

        /* JADX INFO: renamed from: wl1.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f159811w;

            /* JADX INFO: renamed from: wl1.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.inAppReview.InAppReviewInteractor$notRecentlyRequested$$inlined$map$1$2", m100430f = "InAppReviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42595a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f159812E;

                /* JADX INFO: renamed from: F */
                Object f159813F;

                /* JADX INFO: renamed from: G */
                Object f159814G;

                /* JADX INFO: renamed from: H */
                int f159815H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f159816w;

                /* JADX INFO: renamed from: x */
                int f159817x;

                /* JADX INFO: renamed from: y */
                Object f159818y;

                public C42595a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f159816w = obj;
                    this.f159817x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f159811w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42595a c42595a;
                if (interfaceC30057d instanceof C42595a) {
                    c42595a = (C42595a) interfaceC30057d;
                    int i13 = c42595a.f159817x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42595a.f159817x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42595a = new C42595a(interfaceC30057d);
                    }
                } else {
                    c42595a = new C42595a(interfaceC30057d);
                }
                Object obj2 = c42595a.f159816w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42595a.f159817x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f159811w;
                    Long l7 = (Long) ((AbstractC14134f) obj).mo40227b(C37357c.f159784j);
                    Long l12 = new Long(l7 != null ? l7.longValue() : 0L);
                    c42595a.f159818y = null;
                    c42595a.f159812E = null;
                    c42595a.f159813F = null;
                    c42595a.f159814G = null;
                    c42595a.f159815H = 0;
                    c42595a.f159817x = 1;
                    if (interfaceC13062m.emit(l12, c42595a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l) {
            this.f159810w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f159810w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wl1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.inAppReview.InAppReviewInteractor", m100430f = "InAppReviewInteractor.kt", m100431l = {78}, m100432m = "notRecentlyRequested", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f159820w;

        /* JADX INFO: renamed from: y */
        int f159822y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159820w = obj;
            this.f159822y |= Integer.MIN_VALUE;
            return C37357c.this.m119644m(this);
        }
    }

    /* JADX INFO: renamed from: wl1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.inAppReview.InAppReviewInteractor", m100430f = "InAppReviewInteractor.kt", m100431l = {66, 67}, m100432m = "shouldShowPrompt", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f159823w;

        /* JADX INFO: renamed from: y */
        int f159825y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159823w = obj;
            this.f159825y |= Integer.MIN_VALUE;
            return C37357c.this.m119645n(this);
        }
    }

    /* JADX INFO: renamed from: wl1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.inAppReview.InAppReviewInteractor$updateAppReviewPromptShownTimestamp$2", m100430f = "InAppReviewInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159826w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f159827x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C37357c.this.new g(interfaceC30057d);
            gVar.f159827x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f159827x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f159826w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C37357c.f159784j, new Long(C37357c.this.clock.millis()));
            return C23454a0.f92919a;
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f159783i = DurationKt.toDuration(30, DurationUnit.DAYS);
        f159784j = AbstractC15751g.m44429I("app_review_prompt_last_shown_timestamp");
    }

    public C37357c(C3422e streaksHomePreviousStreakDataStoreHandler, InterfaceC0422g dataStorePreferences, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker, InterfaceC14515a baseAnalytics, Clock clock) {
        AbstractC22676k.m65750j(streaksHomePreviousStreakDataStoreHandler, "streaksHomePreviousStreakDataStoreHandler");
        AbstractC22676k.m65750j(dataStorePreferences, "dataStorePreferences");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(clock, "clock");
        this.streaksHomePreviousStreakDataStoreHandler = streaksHomePreviousStreakDataStoreHandler;
        this.dataStorePreferences = dataStorePreferences;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.baseAnalytics = baseAnalytics;
        this.clock = clock;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m119642k() {
        return this.featureFlagChecker.isFeatureEnabled("droid-in-app-review-prompt");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m119643l(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        String streakValue;
        Integer numM125932Q;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f159809y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f159809y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM9891b = cVar.f159807w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f159809y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM9891b);
            C3422e c3422e = this.streaksHomePreviousStreakDataStoreHandler;
            cVar.f159809y = 1;
            objM9891b = c3422e.m9891b(cVar);
            if (objM9891b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM9891b);
        }
        StreakMetadata streakMetadata = (StreakMetadata) objM9891b;
        if (streakMetadata == null || (streakValue = streakMetadata.getStreakValue()) == null || (numM125932Q = AbstractC39421y.m125932Q(streakValue)) == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(numM125932Q.intValue() >= 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m119644m(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f159822y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f159822y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM36577C = eVar.f159820w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f159822y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36577C);
            d dVar = new d(this.dataStorePreferences.getData());
            eVar.f159822y = 1;
            objM36577C = AbstractC13091v.m36577C(dVar, eVar);
            if (objM36577C == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36577C);
        }
        Long l7 = (Long) objM36577C;
        return Boolean.valueOf(Instant.now(this.clock).toEpochMilli() - (l7 != null ? l7.longValue() : 0L) > Duration.m134273getInWholeMillisecondsimpl(f159783i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m119645n(q83.InterfaceC30057d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof wl1.C37357c.f
            if (r0 == 0) goto L13
            r0 = r6
            wl1.c$f r0 = (wl1.C37357c.f) r0
            int r1 = r0.f159825y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159825y = r1
            goto L18
        L13:
            wl1.c$f r0 = new wl1.c$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f159823w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f159825y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r6)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L42
        L36:
            p505ts.AbstractC34132o.m107864I(r6)
            r0.f159825y = r4
            java.lang.Object r6 = r5.m119643l(r0)
            if (r6 != r1) goto L42
            goto L52
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L62
            r0.f159825y = r3
            java.lang.Object r6 = r5.m119644m(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L62
            boolean r6 = r5.m119642k()
            if (r6 == 0) goto L62
            goto L63
        L62:
            r4 = 0
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wl1.C37357c.m119645n(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m119646o() {
        InterfaceC14515a.m41418i(this.baseAnalytics, null, null, null, "Request In App Review Dialog", null, null, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m119647p(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G = AbstractC17269i.m48861G(this.dataStorePreferences, new g(null), interfaceC30057d);
        return objM48861G == EnumC31071a.f128113w ? objM48861G : C23454a0.f92919a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream, this);
    }
}
