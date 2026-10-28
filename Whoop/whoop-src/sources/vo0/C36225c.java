package vo0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.coacheverywhere.onboarding.domain.network.CoachOnboardingApi;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepModel;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatus;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.onboarding.story.domain.network.C9615a;
import dp0.AbstractC12249e;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kh2.AbstractC22486a;
import l83.C23454a0;
import m83.AbstractC25265s;
import p007a6.C0456u;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import po0.C29397a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vo0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001:\u00014BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020&0*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020#H\u0002¢\u0006\u0004\b-\u0010.J#\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001fH\u0000¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b3\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, m65681d2 = {"Lvo0/c;", "", "Ltr2/n;", "logger", "Lbc3/c0;", "externalScope", "Lcom/whoop/coacheverywhere/onboarding/domain/network/CoachOnboardingApi;", "coachOnboardingApi", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "onboardingStatusDao", "Lcom/whoop/onboarding/story/domain/network/a;", "onboardingStoryRepository", "Lfi0/a;", "baseAnalytics", "Lpo0/a;", "analyticHelper", "La6/g;", "Lf6/f;", "prefsDataStore", "<init>", "(Ltr2/n;Lbc3/c0;Lcom/whoop/coacheverywhere/onboarding/domain/network/CoachOnboardingApi;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lcom/whoop/onboarding/story/domain/network/a;Lfi0/a;Lpo0/a;La6/g;)V", "", "coachOnboardingKey", "onboardingAnalyticSource", "Lvo0/b;", "n", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "domainResult", "p", "(Lvo0/b;)Lvo0/b;", "k", "Lec3/l;", "", "j", "(Ljava/lang/String;)Lec3/l;", "Ll83/a0;", "o", "(Lvo0/b;)V", "", "stepIndex", "q", "(I)V", "Lf6/d;", "l", "()Lf6/d;", "r", "()V", "Lvo0/a;", "upstream", "m", "(Lec3/l;)Lec3/l;", "s", "a", "Ltr2/n;", "b", "Lbc3/c0;", "c", "Lcom/whoop/coacheverywhere/onboarding/domain/network/CoachOnboardingApi;", "d", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "e", "Lcom/whoop/onboarding/story/domain/network/a;", "f", "Lfi0/a;", "g", "Lpo0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "La6/g;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36225c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 externalScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CoachOnboardingApi coachOnboardingApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final OnboardingStatusDao onboardingStatusDao;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9615a onboardingStoryRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C29397a analyticHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: vo0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lvo0/c$a;", "", "<init>", "()V", "a", "b", "c", "Lvo0/c$a$a;", "Lvo0/c$a$b;", "Lvo0/c$a$c;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: vo0.c$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lvo0/c$a$a;", "Lvo0/c$a;", "", "coachOnboardingKey", "onboardingAnalyticSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42556a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String coachOnboardingKey;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String onboardingAnalyticSource;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42556a(String coachOnboardingKey, String str) {
                super(null);
                AbstractC22676k.m65750j(coachOnboardingKey, "coachOnboardingKey");
                this.coachOnboardingKey = coachOnboardingKey;
                this.onboardingAnalyticSource = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCoachOnboardingKey() {
                return this.coachOnboardingKey;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getOnboardingAnalyticSource() {
                return this.onboardingAnalyticSource;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C42556a)) {
                    return false;
                }
                C42556a c42556a = (C42556a) other;
                return AbstractC22676k.m65745e(this.coachOnboardingKey, c42556a.coachOnboardingKey) && AbstractC22676k.m65745e(this.onboardingAnalyticSource, c42556a.onboardingAnalyticSource);
            }

            public int hashCode() {
                int iHashCode = this.coachOnboardingKey.hashCode() * 31;
                String str = this.onboardingAnalyticSource;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return AbstractC2875y.m8300m("LoadSteps(coachOnboardingKey=", this.coachOnboardingKey, ", onboardingAnalyticSource=", this.onboardingAnalyticSource, ")");
            }
        }

        /* JADX INFO: renamed from: vo0.c$a$b */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvo0/c$a$b;", "Lvo0/c$a;", "<init>", "()V", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public static final b f155084a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: vo0.c$a$c */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvo0/c$a$c;", "Lvo0/c$a;", "<init>", "()V", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public static final c f155085a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vo0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f155086w;

        /* JADX INFO: renamed from: vo0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f155087w;

            /* JADX INFO: renamed from: vo0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor$alreadyCompletedFlow$$inlined$map$1$2", m100430f = "CoachOnboardingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42557a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f155088E;

                /* JADX INFO: renamed from: F */
                Object f155089F;

                /* JADX INFO: renamed from: G */
                Object f155090G;

                /* JADX INFO: renamed from: H */
                int f155091H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f155092w;

                /* JADX INFO: renamed from: x */
                int f155093x;

                /* JADX INFO: renamed from: y */
                Object f155094y;

                public C42557a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f155092w = obj;
                    this.f155093x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f155087w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42557a c42557a;
                if (interfaceC30057d instanceof C42557a) {
                    c42557a = (C42557a) interfaceC30057d;
                    int i13 = c42557a.f155093x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42557a.f155093x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42557a = new C42557a(interfaceC30057d);
                    }
                } else {
                    c42557a = new C42557a(interfaceC30057d);
                }
                Object obj2 = c42557a.f155092w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42557a.f155093x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f155087w;
                    Boolean boolValueOf = Boolean.valueOf(AbstractC22676k.m65745e((Boolean) obj, Boolean.TRUE));
                    c42557a.f155094y = null;
                    c42557a.f155088E = null;
                    c42557a.f155089F = null;
                    c42557a.f155090G = null;
                    c42557a.f155091H = 0;
                    c42557a.f155093x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42557a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f155086w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f155086w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vo0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor$alreadyCompletedFlow$2", m100430f = "CoachOnboardingInteractor.kt", m100431l = {131}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155096w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f155097x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f155097x = interfaceC13062m;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f155097x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155096w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Boolean bool = Boolean.FALSE;
                this.f155097x = null;
                this.f155096w = 1;
                if (interfaceC13062m.emit(bool, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: vo0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CoachOnboardingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155098w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f155099x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155100y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36225c f155101z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C36225c c36225c) {
            super(3, interfaceC30057d);
            this.f155101z = c36225c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC36223a abstractC36223a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f155101z);
            dVar.f155099x = interfaceC13062m;
            dVar.f155100y = abstractC36223a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155098w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f155099x;
                AbstractC36223a abstractC36223a = (AbstractC36223a) this.f155100y;
                if (abstractC36223a instanceof AbstractC36223a.a) {
                    c0456u = AbstractC13091v.m36590P(this.f155101z.m115362j(((AbstractC36223a.a) abstractC36223a).getCoachOnboardingKey()), new f(null, abstractC36223a));
                } else {
                    if (!AbstractC22676k.m65745e(abstractC36223a, AbstractC36223a.b.f155067a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = new C0456u(a.b.f155084a, 1);
                }
                this.f155099x = null;
                this.f155100y = null;
                this.f155098w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC36223a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vo0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor$interact$2", m100430f = "CoachOnboardingInteractor.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lvo0/b;", "domainResult", "Lvo0/c$a;", "action", "<anonymous>", "(Lvo0/b;Lvo0/c$a;)Lvo0/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155102w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f155103x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155104y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C36224b c36224b, a aVar, InterfaceC30057d<? super C36224b> interfaceC30057d) {
            e eVar = C36225c.this.new e(interfaceC30057d);
            eVar.f155103x = c36224b;
            eVar.f155104y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C36224b c36224b = (C36224b) this.f155103x;
            a aVar = (a) this.f155104y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155102w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(aVar instanceof a.C42556a)) {
                    if (AbstractC22676k.m65745e(aVar, a.b.f155084a)) {
                        return C36225c.this.m115367p(c36224b);
                    }
                    if (AbstractC22676k.m65745e(aVar, a.c.f155085a)) {
                        return C36224b.m115342b(c36224b, 0L, null, 0, true, false, null, 39, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C36225c c36225c = C36225c.this;
                a.C42556a c42556a = (a.C42556a) aVar;
                String coachOnboardingKey = c42556a.getCoachOnboardingKey();
                String onboardingAnalyticSource = c42556a.getOnboardingAnalyticSource();
                this.f155103x = null;
                this.f155104y = null;
                this.f155102w = 1;
                obj = c36225c.m115365n(coachOnboardingKey, onboardingAnalyticSource, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C36224b) obj;
        }
    }

    /* JADX INFO: renamed from: vo0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "CoachOnboardingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155106w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f155107x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155108y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC36223a f155109z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, AbstractC36223a abstractC36223a) {
            super(3, interfaceC30057d);
            this.f155109z = abstractC36223a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f155109z);
            fVar.f155107x = interfaceC13062m;
            fVar.f155108y = bool;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155106w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f155107x;
                C0456u c0456u = ((Boolean) this.f155108y).booleanValue() ? new C0456u(a.c.f155085a, 1) : new C0456u(new a.C42556a(((AbstractC36223a.a) this.f155109z).getCoachOnboardingKey(), ((AbstractC36223a.a) this.f155109z).getOnboardingAnalyticSource()), 1);
                this.f155107x = null;
                this.f155108y = null;
                this.f155106w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vo0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor", m100430f = "CoachOnboardingInteractor.kt", m100431l = {83, 88}, m100432m = "loadSteps", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f155110E;

        /* JADX INFO: renamed from: G */
        int f155112G;

        /* JADX INFO: renamed from: w */
        Object f155113w;

        /* JADX INFO: renamed from: x */
        Object f155114x;

        /* JADX INFO: renamed from: y */
        Object f155115y;

        /* JADX INFO: renamed from: z */
        Object f155116z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155110E = obj;
            this.f155112G |= Integer.MIN_VALUE;
            return C36225c.this.m115365n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vo0.c$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor$markOnboardingCompleted$1", m100430f = "CoachOnboardingInteractor.kt", m100431l = {137}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155117w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36224b f155119y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C36224b c36224b, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155119y = c36224b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36225c.this.new h(this.f155119y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155117w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C9615a c9615a = C36225c.this.onboardingStoryRepository;
                int featureId = (int) this.f155119y.getFeatureId();
                this.f155117w = 1;
                if (c9615a.m23157f(featureId, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: vo0.c$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor$markOnboardingCompleted$2", m100430f = "CoachOnboardingInteractor.kt", m100431l = {142}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f155120w;

        /* JADX INFO: renamed from: x */
        int f155121x;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36225c.this.new i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155121x;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    OnboardingStatus onboardingStatus = new OnboardingStatus(FeatureEducationType.COACH_EVERYWHERE_DAY_ZERO, true);
                    OnboardingStatusDao onboardingStatusDao = C36225c.this.onboardingStatusDao;
                    this.f155120w = null;
                    this.f155121x = 1;
                    if (onboardingStatusDao.updateTable(onboardingStatus, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                C36225c.this.logger.mo85230v("Failed to insert onboarding status entry into DB", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vo0.c$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor$saveCurrentStepIndex$1", m100430f = "CoachOnboardingInteractor.kt", m100431l = {167}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155123w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f155125y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i13, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155125y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36225c.this.new j(this.f155125y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155123w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC0422g interfaceC0422g = C36225c.this.prefsDataStore;
                    C14132d c14132dM115364l = C36225c.this.m115364l();
                    Integer num = new Integer(this.f155125y);
                    this.f155123w = 1;
                    if (AbstractC22486a.m64987c(interfaceC0422g, c14132dM115364l, num, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                C36225c.this.logger.mo85230v("Failed to save current step index", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vo0.c$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.domain.CoachOnboardingInteractor$sendCompletionAnalytics$1", m100430f = "CoachOnboardingInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155126w;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36225c.this.new k(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155126w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C36225c.this.baseAnalytics.mo41424f("Onboarding", "Complete", "coach_onboarding", "coach_onboarding_completed");
            return C23454a0.f92919a;
        }
    }

    public C36225c(InterfaceC34116n logger, InterfaceC2994c0 externalScope, CoachOnboardingApi coachOnboardingApi, OnboardingStatusDao onboardingStatusDao, C9615a onboardingStoryRepository, InterfaceC14515a baseAnalytics, C29397a analyticHelper, InterfaceC0422g prefsDataStore) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(externalScope, "externalScope");
        AbstractC22676k.m65750j(coachOnboardingApi, "coachOnboardingApi");
        AbstractC22676k.m65750j(onboardingStatusDao, "onboardingStatusDao");
        AbstractC22676k.m65750j(onboardingStoryRepository, "onboardingStoryRepository");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        this.logger = logger;
        this.externalScope = externalScope;
        this.coachOnboardingApi = coachOnboardingApi;
        this.onboardingStatusDao = onboardingStatusDao;
        this.onboardingStoryRepository = onboardingStoryRepository;
        this.baseAnalytics = baseAnalytics;
        this.analyticHelper = analyticHelper;
        this.prefsDataStore = prefsDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m115362j(String coachOnboardingKey) {
        for (FeatureEducationType featureEducationType : FeatureEducationType.values()) {
            if (AbstractC22676k.m65745e(featureEducationType.name(), coachOnboardingKey)) {
                return featureEducationType == null ? new C0456u(Boolean.FALSE, 1) : AbstractC13091v.m36610t(new C13015a0(new b(this.onboardingStatusDao.isCompletedFlow(featureEducationType)), new c(null)));
            }
        }
        featureEducationType = null;
        if (featureEducationType == null) {
        }
    }

    /* JADX INFO: renamed from: k */
    private final C36224b m115363k(C36224b domainResult) {
        m115366o(domainResult);
        m115369r();
        return C36224b.m115342b(domainResult, 0L, null, 0, true, false, null, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C14132d m115364l() {
        return AbstractC15751g.m44423C("COACH_ONBOARDING_DAY_ZERO_KEY");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r15 == r0) goto L29;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m115365n(java.lang.String r13, java.lang.String r14, q83.InterfaceC30057d<? super vo0.C36224b> r15) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vo0.C36225c.m115365n(java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: o */
    private final void m115366o(C36224b domainResult) {
        AbstractC3006f0.m8732z(this.externalScope, null, null, new h(domainResult, null), 3);
        AbstractC3006f0.m8732z(this.externalScope, null, null, new i(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final C36224b m115367p(C36224b domainResult) {
        m115371s(domainResult);
        return domainResult.m115351j() ? m115363k(domainResult) : C36224b.m115342b(domainResult, 0L, null, domainResult.getCurrentStepIndex() + 1, false, false, null, 59, null);
    }

    /* JADX INFO: renamed from: q */
    private final void m115368q(int stepIndex) {
        AbstractC3006f0.m8732z(this.externalScope, null, null, new j(stepIndex, null), 3);
    }

    /* JADX INFO: renamed from: r */
    private final void m115369r() {
        AbstractC3006f0.m8732z(this.externalScope, null, null, new k(null), 3);
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m115370m(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C36224b(0L, null, 0, false, true, null, 47, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new e(null));
    }

    /* JADX INFO: renamed from: s */
    public final void m115371s(C36224b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        CoachOnboardingStepModel coachOnboardingStepModel = (CoachOnboardingStepModel) AbstractC25265s.m74102I0(domainResult.getCurrentStepIndex(), domainResult.m115349h());
        if (coachOnboardingStepModel == null) {
            return;
        }
        String strM89574h = this.analyticHelper.m89574h(coachOnboardingStepModel.getStepId());
        CoachOnboardingStepModel coachOnboardingStepModel2 = (CoachOnboardingStepModel) AbstractC25265s.m74102I0(domainResult.getCurrentStepIndex() + 1, domainResult.m115349h());
        m115368q(coachOnboardingStepModel2 != null ? domainResult.getCurrentStepIndex() + 1 : 0);
        if (coachOnboardingStepModel2 == null) {
            this.analyticHelper.m89575k(new AbstractC12249e.a(strM89574h));
        } else {
            this.analyticHelper.m89575k(new AbstractC12249e.b(strM89574h));
        }
    }

    public /* synthetic */ C36225c(InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, CoachOnboardingApi coachOnboardingApi, OnboardingStatusDao onboardingStatusDao, C9615a c9615a, InterfaceC14515a interfaceC14515a, C29397a c29397a, InterfaceC0422g interfaceC0422g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CoachOnboardingInteractor") : interfaceC34116n, interfaceC2994c0, coachOnboardingApi, onboardingStatusDao, c9615a, interfaceC14515a, c29397a, interfaceC0422g);
    }
}
