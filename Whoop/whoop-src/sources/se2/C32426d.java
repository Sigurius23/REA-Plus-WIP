package se2;

import bc3.AbstractC3034m0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.sleep.coach.data.network.api.SleepCoachApi;
import com.whoop.sleep.coach.data.network.model.AlarmOverrideDto;
import com.whoop.sleep.coach.data.network.model.EligibilityResponseDto;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import l83.C23454a0;
import mi1.InterfaceC25576e;
import od1.InterfaceC27844g;
import org.joda.time.DateTimeZone;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rf2.InterfaceC31359a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tf2.AbstractC33767a;
import tr2.InterfaceC34116n;
import wm0.C37378a;
import zr2.AbstractC41071b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: se2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0082@¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001cH\u0082@¢\u0006\u0004\b \u0010!J#\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, m65681d2 = {"Lse2/d;", "Lod1/g;", "Lse2/b;", "Lse2/c;", "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;", "sleepCoachApi", "Lrf2/a;", "smartAlarmUserInfoDao", "Ltr2/n;", "logger", "Lwm0/a;", "scopeCoordinator", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "smartAlarmApi", "Lzr2/a;", "dateAndTimeProvider", "Lmi1/e;", "smartAlarmHapticsWrapper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Liy1/c;", "metricWriter", "Lci2/b;", "whoopStrapProvider", "<init>", "(Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;Lrf2/a;Ltr2/n;Lwm0/a;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lzr2/a;Lmi1/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;Lci2/b;)V", "Lec3/m;", "flowCollector", "Ll83/a0;", "l", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "k", "m", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;", "b", "Lrf2/a;", "c", "Ltr2/n;", "d", "Lwm0/a;", "e", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "f", "Lzr2/a;", "g", "Lmi1/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/data/repositories/FeatureFlagChecker;", "i", "Liy1/c;", "j", "Lci2/b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32426d implements InterfaceC27844g<InterfaceC32424b, InterfaceC32425c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SleepCoachApi sleepCoachApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC31359a smartAlarmUserInfoDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final SmartAlarmApi smartAlarmApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC25576e smartAlarmHapticsWrapper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: se2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {102, 103, 110, 111, 112, 114, 118}, m100432m = "callPostSmartAlarmOverride", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f134206E;

        /* JADX INFO: renamed from: G */
        int f134208G;

        /* JADX INFO: renamed from: w */
        Object f134209w;

        /* JADX INFO: renamed from: x */
        Object f134210x;

        /* JADX INFO: renamed from: y */
        Object f134211y;

        /* JADX INFO: renamed from: z */
        int f134212z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f134206E = obj;
            this.f134208G |= Integer.MIN_VALUE;
            return C32426d.this.m101245k(null, this);
        }
    }

    /* JADX INFO: renamed from: se2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$callPostSmartAlarmOverride$2$overrideResponse$1", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        Object f134213w;

        /* JADX INFO: renamed from: x */
        int f134214x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ SmartAlarmUserInfo f134216z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f134216z = smartAlarmUserInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C32426d.this.new b(this.f134216z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134214x;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String string = AbstractC41071b.m133370c(C32426d.this.dateAndTimeProvider, null, AbstractC33767a.m106770b(this.f134216z.getUpperBoundLocalTime(), null, 2, null).toLocalTime(), null, 5, null).withZone(DateTimeZone.UTC).toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            SleepCoachApi sleepCoachApi = C32426d.this.sleepCoachApi;
            AlarmOverrideDto alarmOverrideDto = new AlarmOverrideDto(string, null);
            this.f134213w = null;
            this.f134214x = 1;
            Object objPostSmartAlarmOverride = sleepCoachApi.postSmartAlarmOverride(alarmOverrideDto, this);
            return objPostSmartAlarmOverride == enumC31071a ? enumC31071a : objPostSmartAlarmOverride;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: se2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {90, 92, 93, 94, 95, 96, 98}, m100432m = "disableAlarmOnStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f134217E;

        /* JADX INFO: renamed from: w */
        Object f134218w;

        /* JADX INFO: renamed from: x */
        boolean f134219x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f134220y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f134220y = obj;
            this.f134217E |= Integer.MIN_VALUE;
            return C32426d.this.m101246l(null, this);
        }
    }

    /* JADX INFO: renamed from: se2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {125, 132}, m100432m = "fetchAndCacheSmartAlarmUserInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f134222w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f134223x;

        /* JADX INFO: renamed from: z */
        int f134225z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f134223x = obj;
            this.f134225z |= Integer.MIN_VALUE;
            return C32426d.this.m101247m(this);
        }
    }

    /* JADX INFO: renamed from: se2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$interact$$inlined$flatMapLatest$1", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f134226w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f134227x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f134228y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32426d f134229z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C32426d c32426d) {
            super(3, interfaceC30057d);
            this.f134229z = c32426d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C32423a c32423a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f134229z);
            eVar.f134227x = interfaceC13062m;
            eVar.f134228y = c32423a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13084s1 c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134226w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f134227x;
                C32423a c32423a = (C32423a) this.f134228y;
                InterfaceC32424b domainAction = c32423a.getDomainAction();
                if (domainAction instanceof InterfaceC32424b.b) {
                    c13084s1 = new C13084s1(new g(null));
                } else if (domainAction instanceof InterfaceC32424b.c) {
                    c13084s1 = new C13084s1(this.f134229z.new h(c32423a, null));
                } else {
                    if (!AbstractC22676k.m65745e(domainAction, InterfaceC32424b.a.f134185a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f134229z.new i(null));
                }
                this.f134227x = null;
                this.f134228y = null;
                this.f134226w = 1;
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
            return invoke((InterfaceC13062m) obj, (C32423a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: se2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$interact$1", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lse2/a;", "initial", "Lse2/b;", "domainAction", "<anonymous>", "(Lse2/a;Lse2/b;)Lse2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f134230w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f134231x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f134232y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C32423a c32423a, InterfaceC32424b interfaceC32424b, InterfaceC30057d<? super C32423a> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f134231x = c32423a;
            fVar.f134232y = interfaceC32424b;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C32423a c32423a = (C32423a) this.f134231x;
            InterfaceC32424b interfaceC32424b = (InterfaceC32424b) this.f134232y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f134230w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return interfaceC32424b instanceof InterfaceC32424b.b ? c32423a.m101233a(((InterfaceC32424b.b) interfaceC32424b).getNotificationId(), interfaceC32424b) : C32423a.m101232b(c32423a, null, interfaceC32424b, 1, null);
        }
    }

    /* JADX INFO: renamed from: se2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$interact$2$1", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lse2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134233w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f134234x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f134234x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f134234x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134233w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC32425c.d dVar = InterfaceC32425c.d.f134191a;
                this.f134234x = null;
                this.f134233w = 1;
                if (interfaceC13062m.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: se2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$interact$2$2", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {57, 59, 66, 68, 71, 72, 76, 80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lse2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C32423a f134235E;

        /* JADX INFO: renamed from: w */
        Object f134236w;

        /* JADX INFO: renamed from: x */
        int f134237x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f134238y;

        /* JADX INFO: renamed from: se2.d$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$interact$2$2$response$1", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/sleep/coach/data/network/model/EligibilityResponseDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C32426d f134240E;

            /* JADX INFO: renamed from: w */
            Object f134241w;

            /* JADX INFO: renamed from: x */
            int f134242x;

            /* JADX INFO: renamed from: y */
            int f134243y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C32423a f134244z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C32423a c32423a, C32426d c32426d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f134244z = c32423a;
                this.f134240E = c32426d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f134244z, this.f134240E, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) throws Exception {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f134243y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (this.f134244z.getNotificationId() != null) {
                        C32426d c32426d = this.f134240E;
                        C32423a c32423a = this.f134244z;
                        SleepCoachApi sleepCoachApi = c32426d.sleepCoachApi;
                        String notificationId = c32423a.getNotificationId();
                        this.f134241w = null;
                        this.f134242x = 0;
                        this.f134243y = 1;
                        obj = sleepCoachApi.getEligibility(notificationId, this);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                    throw new Exception("Cannot make getEligibility call notificationId not found");
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                EligibilityResponseDto eligibilityResponseDto = (EligibilityResponseDto) obj;
                if (eligibilityResponseDto != null) {
                    return eligibilityResponseDto;
                }
                throw new Exception("Cannot make getEligibility call notificationId not found");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super EligibilityResponseDto> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C32423a c32423a, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134235E = c32423a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C32426d.this.new h(this.f134235E, interfaceC30057d);
            hVar.f134238y = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0080  */
        /* JADX WARN: Code duplicated, block: B:29:0x0082 A[Catch: Exception -> 0x011a, PHI: r9 r13
          0x0082: PHI (r9v4 se2.d$h) = (r9v3 se2.d$h), (r9v5 se2.d$h) binds: [B:27:0x007e, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x0082: PHI (r13v10 java.lang.Object) = (r13v9 java.lang.Object), (r13v0 java.lang.Object) binds: [B:27:0x007e, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:31:0x0088 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:33:0x0096 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00ac A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ba A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ca A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:45:0x00da A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[Catch: Exception -> 0x011a, PHI: r9
          0x00f0: PHI (r9v6 se2.d$h) = (r9v4 se2.d$h), (r9v7 se2.d$h) binds: [B:46:0x00ed, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:51:0x0100 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0104 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0113  */
        /* JADX WARN: Code duplicated, block: B:56:0x0114 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:48:0x00f0, B:29:0x0082, B:31:0x0088, B:33:0x0096, B:35:0x00ac, B:37:0x00b2, B:39:0x00ba, B:42:0x00ca, B:45:0x00da, B:51:0x0100, B:53:0x0104, B:56:0x0114, B:57:0x0119, B:26:0x007a), top: B:64:0x007a }] */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L60;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: se2.C32426d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: se2.d$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$interact$2$3", m100430f = "TurnoffAlarmWarningInteractor.kt", m100431l = {84}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lse2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134245w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f134246x;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C32426d.this.new i(interfaceC30057d);
            iVar.f134246x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f134246x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134245w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C32426d c32426d = C32426d.this;
                this.f134246x = null;
                this.f134245w = 1;
                if (c32426d.m101246l(interfaceC13062m, this) == enumC31071a) {
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

    public C32426d(SleepCoachApi sleepCoachApi, InterfaceC31359a smartAlarmUserInfoDao, InterfaceC34116n logger, C37378a scopeCoordinator, SmartAlarmApi smartAlarmApi, InterfaceC41070a dateAndTimeProvider, InterfaceC25576e smartAlarmHapticsWrapper, FeatureFlagChecker featureFlagChecker, InterfaceC21030c metricWriter, InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(sleepCoachApi, "sleepCoachApi");
        AbstractC22676k.m65750j(smartAlarmUserInfoDao, "smartAlarmUserInfoDao");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(smartAlarmApi, "smartAlarmApi");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(smartAlarmHapticsWrapper, "smartAlarmHapticsWrapper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.sleepCoachApi = sleepCoachApi;
        this.smartAlarmUserInfoDao = smartAlarmUserInfoDao;
        this.logger = logger;
        this.scopeCoordinator = scopeCoordinator;
        this.smartAlarmApi = smartAlarmApi;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.smartAlarmHapticsWrapper = smartAlarmHapticsWrapper;
        this.featureFlagChecker = featureFlagChecker;
        this.metricWriter = metricWriter;
        this.whoopStrapProvider = whoopStrapProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8 A[PHI: r1 r12
      0x00d8: PHI (r1v10 ec3.m) = (r1v5 ec3.m), (r1v16 ec3.m) binds: [B:32:0x00d5, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r12v13 int) = (r12v6 int), (r12v14 int) binds: [B:32:0x00d5, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ee A[PHI: r1 r12
      0x00ee: PHI (r1v17 ec3.m) = (r1v10 ec3.m), (r1v23 ec3.m) binds: [B:35:0x00eb, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r12v15 int) = (r12v13 int), (r12v18 int) binds: [B:35:0x00eb, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        if (m101246l(r1, r6) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        if (r1.emit(r13, r6) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        if (r1.emit(r13, r6) == r0) goto L47;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m101245k(ec3.InterfaceC13062m r12, q83.InterfaceC30057d<? super l83.C23454a0> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se2.C32426d.m101245k(ec3.m, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae A[PHI: r2 r8
      0x00ae: PHI (r2v9 ec3.m) = (r2v6 ec3.m), (r2v11 ec3.m) binds: [B:29:0x00ab, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r8v8 boolean) = (r8v6 boolean), (r8v9 boolean) binds: [B:29:0x00ab, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0 A[PHI: r2 r8
      0x00c0: PHI (r2v12 ec3.m) = (r2v9 ec3.m), (r2v14 ec3.m) binds: [B:32:0x00bd, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r8v10 boolean) = (r8v8 boolean), (r8v11 boolean) binds: [B:32:0x00bd, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[PHI: r2 r8
      0x00d0: PHI (r2v15 ec3.m) = (r2v12 ec3.m), (r2v17 ec3.m) binds: [B:35:0x00cd, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r8v12 boolean) = (r8v10 boolean), (r8v15 boolean) binds: [B:35:0x00cd, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m101246l(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        boolean zBooleanValue;
        InterfaceC32425c.c cVar2;
        InterfaceC32425c.h hVar;
        InterfaceC13062m interfaceC13062m2;
        boolean z4;
        C37378a c37378a;
        C37378a c37378a2;
        InterfaceC32425c.a aVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f134217E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f134217E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo75197a = cVar.f134220y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f134217E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i14) {
            case 0:
                AbstractC34132o.m107864I(objMo75197a);
                InterfaceC25576e interfaceC25576e = this.smartAlarmHapticsWrapper;
                cVar.f134218w = interfaceC13062m;
                cVar.f134217E = 1;
                objMo75197a = interfaceC25576e.mo75197a(cVar);
                if (objMo75197a != enumC31071a) {
                    zBooleanValue = ((Boolean) objMo75197a).booleanValue();
                    if (zBooleanValue) {
                        hVar = InterfaceC32425c.h.f134195a;
                        cVar.f134218w = interfaceC13062m;
                        cVar.f134219x = zBooleanValue;
                        cVar.f134217E = 2;
                        if (interfaceC13062m.emit(hVar, cVar) != enumC31071a) {
                            interfaceC13062m2 = interfaceC13062m;
                            z4 = zBooleanValue;
                            c37378a = this.scopeCoordinator;
                            cVar.f134218w = interfaceC13062m2;
                            cVar.f134219x = z4;
                            cVar.f134217E = 3;
                            if (c37378a.m119657b(SmartAlarmTriggerRepository.SMART_ALARM_DISABLE_HIGH_FREQUENCY, cVar) != enumC31071a) {
                                c37378a2 = this.scopeCoordinator;
                                cVar.f134218w = interfaceC13062m2;
                                cVar.f134219x = z4;
                                cVar.f134217E = 4;
                                if (c37378a2.m119657b("home", cVar) != enumC31071a) {
                                    cVar.f134218w = interfaceC13062m2;
                                    cVar.f134219x = z4;
                                    cVar.f134217E = 5;
                                    if (AbstractC3034m0.m8782b(1500L, cVar) != enumC31071a) {
                                        aVar = InterfaceC32425c.a.f134188a;
                                        cVar.f134218w = null;
                                        cVar.f134219x = z4;
                                        cVar.f134217E = 6;
                                        if (interfaceC13062m2.emit(aVar, cVar) != enumC31071a) {
                                            return c23454a0;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cVar2 = InterfaceC32425c.c.f134190a;
                        cVar.f134218w = null;
                        cVar.f134219x = zBooleanValue;
                        cVar.f134217E = 7;
                        if (interfaceC13062m.emit(cVar2, cVar) == enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
                return enumC31071a;
            case 1:
                interfaceC13062m = (InterfaceC13062m) cVar.f134218w;
                AbstractC34132o.m107864I(objMo75197a);
                zBooleanValue = ((Boolean) objMo75197a).booleanValue();
                if (zBooleanValue) {
                    hVar = InterfaceC32425c.h.f134195a;
                    cVar.f134218w = interfaceC13062m;
                    cVar.f134219x = zBooleanValue;
                    cVar.f134217E = 2;
                    if (interfaceC13062m.emit(hVar, cVar) != enumC31071a) {
                        interfaceC13062m2 = interfaceC13062m;
                        z4 = zBooleanValue;
                        c37378a = this.scopeCoordinator;
                        cVar.f134218w = interfaceC13062m2;
                        cVar.f134219x = z4;
                        cVar.f134217E = 3;
                        if (c37378a.m119657b(SmartAlarmTriggerRepository.SMART_ALARM_DISABLE_HIGH_FREQUENCY, cVar) != enumC31071a) {
                            c37378a2 = this.scopeCoordinator;
                            cVar.f134218w = interfaceC13062m2;
                            cVar.f134219x = z4;
                            cVar.f134217E = 4;
                            if (c37378a2.m119657b("home", cVar) != enumC31071a) {
                                cVar.f134218w = interfaceC13062m2;
                                cVar.f134219x = z4;
                                cVar.f134217E = 5;
                                if (AbstractC3034m0.m8782b(1500L, cVar) != enumC31071a) {
                                    aVar = InterfaceC32425c.a.f134188a;
                                    cVar.f134218w = null;
                                    cVar.f134219x = z4;
                                    cVar.f134217E = 6;
                                    if (interfaceC13062m2.emit(aVar, cVar) != enumC31071a) {
                                        return c23454a0;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cVar2 = InterfaceC32425c.c.f134190a;
                    cVar.f134218w = null;
                    cVar.f134219x = zBooleanValue;
                    cVar.f134217E = 7;
                    if (interfaceC13062m.emit(cVar2, cVar) == enumC31071a) {
                        return c23454a0;
                    }
                }
                return enumC31071a;
            case 2:
                z4 = cVar.f134219x;
                interfaceC13062m2 = (InterfaceC13062m) cVar.f134218w;
                AbstractC34132o.m107864I(objMo75197a);
                c37378a = this.scopeCoordinator;
                cVar.f134218w = interfaceC13062m2;
                cVar.f134219x = z4;
                cVar.f134217E = 3;
                if (c37378a.m119657b(SmartAlarmTriggerRepository.SMART_ALARM_DISABLE_HIGH_FREQUENCY, cVar) != enumC31071a) {
                    c37378a2 = this.scopeCoordinator;
                    cVar.f134218w = interfaceC13062m2;
                    cVar.f134219x = z4;
                    cVar.f134217E = 4;
                    if (c37378a2.m119657b("home", cVar) != enumC31071a) {
                        cVar.f134218w = interfaceC13062m2;
                        cVar.f134219x = z4;
                        cVar.f134217E = 5;
                        if (AbstractC3034m0.m8782b(1500L, cVar) != enumC31071a) {
                            aVar = InterfaceC32425c.a.f134188a;
                            cVar.f134218w = null;
                            cVar.f134219x = z4;
                            cVar.f134217E = 6;
                            if (interfaceC13062m2.emit(aVar, cVar) != enumC31071a) {
                                return c23454a0;
                            }
                        }
                    }
                }
                return enumC31071a;
            case 3:
                z4 = cVar.f134219x;
                interfaceC13062m2 = (InterfaceC13062m) cVar.f134218w;
                AbstractC34132o.m107864I(objMo75197a);
                c37378a2 = this.scopeCoordinator;
                cVar.f134218w = interfaceC13062m2;
                cVar.f134219x = z4;
                cVar.f134217E = 4;
                if (c37378a2.m119657b("home", cVar) != enumC31071a) {
                    cVar.f134218w = interfaceC13062m2;
                    cVar.f134219x = z4;
                    cVar.f134217E = 5;
                    if (AbstractC3034m0.m8782b(1500L, cVar) != enumC31071a) {
                        aVar = InterfaceC32425c.a.f134188a;
                        cVar.f134218w = null;
                        cVar.f134219x = z4;
                        cVar.f134217E = 6;
                        if (interfaceC13062m2.emit(aVar, cVar) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
                return enumC31071a;
            case 4:
                z4 = cVar.f134219x;
                interfaceC13062m2 = (InterfaceC13062m) cVar.f134218w;
                AbstractC34132o.m107864I(objMo75197a);
                cVar.f134218w = interfaceC13062m2;
                cVar.f134219x = z4;
                cVar.f134217E = 5;
                if (AbstractC3034m0.m8782b(1500L, cVar) != enumC31071a) {
                    aVar = InterfaceC32425c.a.f134188a;
                    cVar.f134218w = null;
                    cVar.f134219x = z4;
                    cVar.f134217E = 6;
                    if (interfaceC13062m2.emit(aVar, cVar) != enumC31071a) {
                        return c23454a0;
                    }
                }
                return enumC31071a;
            case 5:
                z4 = cVar.f134219x;
                interfaceC13062m2 = (InterfaceC13062m) cVar.f134218w;
                AbstractC34132o.m107864I(objMo75197a);
                aVar = InterfaceC32425c.a.f134188a;
                cVar.f134218w = null;
                cVar.f134219x = z4;
                cVar.f134217E = 6;
                if (interfaceC13062m2.emit(aVar, cVar) != enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
            case 6:
                AbstractC34132o.m107864I(objMo75197a);
                return c23454a0;
            case 7:
                AbstractC34132o.m107864I(objMo75197a);
                return c23454a0;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r0.mo96436d(r15, r7) == r8) goto L35;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m101247m(q83.InterfaceC30057d<? super l83.C23454a0> r15) {
        /*
            r14 = this;
            java.lang.String r1 = "saving smart alarm user info to database "
            boolean r0 = r15 instanceof se2.C32426d.d
            if (r0 == 0) goto L16
            r0 = r15
            se2.d$d r0 = (se2.C32426d.d) r0
            int r2 = r0.f134225z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r0.f134225z = r2
        L14:
            r7 = r0
            goto L1c
        L16:
            se2.d$d r0 = new se2.d$d
            r0.<init>(r15)
            goto L14
        L1c:
            java.lang.Object r15 = r7.f134223x
            r83.a r8 = r83.EnumC31071a.f128113w
            int r0 = r7.f134225z
            l83.a0 r9 = l83.C23454a0.f92919a
            r10 = 0
            r11 = 2
            r2 = 1
            r12 = 0
            java.lang.String r13 = "WakeWindow"
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L43
            if (r0 != r11) goto L3b
            java.lang.Object r0 = r7.f134222w
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r0 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r0
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> L38
            goto L9a
        L38:
            r0 = move-exception
            r15 = r0
            goto L91
        L3b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L43:
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> L47
            goto L61
        L47:
            r0 = move-exception
            r15 = r0
            goto L64
        L4a:
            p505ts.AbstractC34132o.m107864I(r15)
            r15 = r2
            com.whoop.smart.alarm.data.network.api.SmartAlarmApi r2 = r14.smartAlarmApi     // Catch: java.lang.Exception -> L47
            tr2.n r3 = r14.logger     // Catch: java.lang.Exception -> L47
            rf2.a r4 = r14.smartAlarmUserInfoDao     // Catch: java.lang.Exception -> L47
            iy1.c r5 = r14.metricWriter     // Catch: java.lang.Exception -> L47
            com.whoop.data.repositories.FeatureFlagChecker r6 = r14.featureFlagChecker     // Catch: java.lang.Exception -> L47
            r7.f134225z = r15     // Catch: java.lang.Exception -> L47
            java.lang.Object r15 = qf2.AbstractC30328g.m92687a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L47
            if (r15 != r8) goto L61
            goto L90
        L61:
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r15 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r15     // Catch: java.lang.Exception -> L47
            goto L6e
        L64:
            tr2.n r0 = r14.logger
            java.lang.String r2 = "Failed to get SmartAlarmUserInfo"
            qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r12]
            r0.mo85215f(r13, r2, r15, r3)
            r15 = r10
        L6e:
            if (r15 != 0) goto L71
            return r9
        L71:
            tr2.n r0 = r14.logger     // Catch: java.lang.Exception -> L38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L38
            r2.<init>(r1)     // Catch: java.lang.Exception -> L38
            r2.append(r15)     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L38
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r12]     // Catch: java.lang.Exception -> L38
            r0.mo85232x(r13, r1, r2)     // Catch: java.lang.Exception -> L38
            rf2.a r0 = r14.smartAlarmUserInfoDao     // Catch: java.lang.Exception -> L38
            r7.f134222w = r10     // Catch: java.lang.Exception -> L38
            r7.f134225z = r11     // Catch: java.lang.Exception -> L38
            java.lang.Object r15 = r0.mo96436d(r15, r7)     // Catch: java.lang.Exception -> L38
            if (r15 != r8) goto L9a
        L90:
            return r8
        L91:
            tr2.n r0 = r14.logger
            java.lang.String r1 = "Failed to update existing store smart alarm user info"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r12]
            r0.mo85215f(r13, r1, r15, r2)
        L9a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: se2.C32426d.m101247m(q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(AbstractC13091v.m36612v(new C13060l1(new C32423a(null, null, 3, null), upstream, new f(null)), 1), new e(null, this));
    }
}
