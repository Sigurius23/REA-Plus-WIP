package mp0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import com.whoop.coaching.sleepcoach.wizard.ConductorViewState;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;
import z82.C40191e;

/* JADX INFO: renamed from: mp0.f0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0011\u00102\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Lmp0/f0;", "Landroidx/lifecycle/w1;", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "conductorRepository", "Lz82/e;", "eventDispatcher", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Lsr2/y;", "urlProvider", "<init>", "(Lcom/whoop/coaching/sleepcoach/wizard/b;Lz82/e;Lcom/whoop/data/onboarding/OnboardingStatusChecker;Lsr2/y;)V", "Ll83/a0;", "o", "()V", "n", "p", "", "showScheduleStatus", "q", "(Z)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/coaching/sleepcoach/wizard/b;", "x", "Lz82/e;", "y", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "z", "Lsr2/y;", "Landroidx/lifecycle/p0;", "Lmp0/c;", "E", "Landroidx/lifecycle/p0;", "g", "()Landroidx/lifecycle/p0;", "alarmOptionDeepLinKLiveData", "Lec3/l;", "F", "Lec3/l;", "getSleepScheduleSetFlow", "()Lec3/l;", "sleepScheduleSetFlow", "", "G", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "sleepCoachHelpUrl", "j", "()Z", "shouldShowOnboarding", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25827f0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final AbstractC1615p0 alarmOptionDeepLinKLiveData;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l sleepScheduleSetFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String sleepCoachHelpUrl;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C6240b conductorRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final OnboardingStatusChecker onboardingStatusChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final AbstractC32943y urlProvider;

    /* JADX INFO: renamed from: mp0.f0$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f101656w;

        /* JADX INFO: renamed from: mp0.f0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42015a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f101657w;

            /* JADX INFO: renamed from: mp0.f0$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachToolBarViewModel$special$$inlined$map$1$2", m100430f = "SleepCoachToolBarViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42016a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f101658E;

                /* JADX INFO: renamed from: F */
                Object f101659F;

                /* JADX INFO: renamed from: G */
                Object f101660G;

                /* JADX INFO: renamed from: H */
                int f101661H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f101662w;

                /* JADX INFO: renamed from: x */
                int f101663x;

                /* JADX INFO: renamed from: y */
                Object f101664y;

                public C42016a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f101662w = obj;
                    this.f101663x |= Integer.MIN_VALUE;
                    return C42015a.this.emit(null, this);
                }
            }

            public C42015a(InterfaceC13062m interfaceC13062m) {
                this.f101657w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42016a c42016a;
                if (interfaceC30057d instanceof C42016a) {
                    c42016a = (C42016a) interfaceC30057d;
                    int i13 = c42016a.f101663x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42016a.f101663x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42016a = new C42016a(interfaceC30057d);
                    }
                } else {
                    c42016a = new C42016a(interfaceC30057d);
                }
                Object obj2 = c42016a.f101662w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42016a.f101663x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f101657w;
                    Boolean boolValueOf = Boolean.valueOf(((ConductorViewState) obj).getScheduleEnabled());
                    c42016a.f101664y = null;
                    c42016a.f101658E = null;
                    c42016a.f101659F = null;
                    c42016a.f101660G = null;
                    c42016a.f101661H = 0;
                    c42016a.f101663x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42016a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f101656w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f101656w.collect(new C42015a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C25827f0(C6240b conductorRepository, C40191e eventDispatcher, OnboardingStatusChecker onboardingStatusChecker, AbstractC32943y urlProvider) {
        AbstractC22676k.m65750j(conductorRepository, "conductorRepository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(onboardingStatusChecker, "onboardingStatusChecker");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        this.conductorRepository = conductorRepository;
        this.eventDispatcher = eventDispatcher;
        this.onboardingStatusChecker = onboardingStatusChecker;
        this.urlProvider = urlProvider;
        this.alarmOptionDeepLinKLiveData = conductorRepository.m18632j();
        this.sleepScheduleSetFlow = AbstractC13091v.m36610t(new a(conductorRepository.getViewStateAsFlow()));
        this.sleepCoachHelpUrl = AbstractC2875y.m8299l(urlProvider.getApiBaseUrl(), "/url-mapping-service/v1/SLEEP_COACH_HAPTIC");
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC1615p0 getAlarmOptionDeepLinKLiveData() {
        return this.alarmOptionDeepLinKLiveData;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m76175j() {
        return this.onboardingStatusChecker.shouldGoToFeatureEducation(FeatureEducationType.ALARM_SCHEDULING);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSleepCoachHelpUrl() {
        return this.sleepCoachHelpUrl;
    }

    /* JADX INFO: renamed from: n */
    public final void m76177n() {
        this.eventDispatcher.m129041k0(AbstractC31061c.m95645u("object", "Sleep Coach"));
    }

    /* JADX INFO: renamed from: o */
    public final void m76178o() {
        this.eventDispatcher.m129031d0("Sleep Coach", null);
    }

    /* JADX INFO: renamed from: p */
    public final void m76179p() {
        C6240b c6240b = this.conductorRepository;
        c6240b.m18647y(c6240b.m18637o().m76304a(EnumC25844o.SYSTEM_BACK_PRESS));
    }

    /* JADX INFO: renamed from: q */
    public final void m76180q(boolean showScheduleStatus) {
        this.conductorRepository.m18630A(showScheduleStatus);
    }
}
