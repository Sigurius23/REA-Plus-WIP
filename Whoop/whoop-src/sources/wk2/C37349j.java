package wk2;

import com.whoop.data.repositories.RestingHeartRate;
import com.whoop.data.repositories.UserRepository;
import com.whoop.domain.model.Gender;
import com.whoop.domain.model.GenderBaseline;
import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.service.network.model.UserState;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mk2.C25642i;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import xk2.C38435a;
import xk2.C38436b;
import xk2.C38437c;
import xk2.C38440f;
import xk2.C38441g;
import xk2.C38442h;
import xk2.C38444j;
import yg2.AbstractC39529d;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: wk2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001*B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJG\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010#J0\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010-¨\u0006."}, m65681d2 = {"Lwk2/j;", "", "Ljava/time/Clock;", "clock", "Lz92/a;", "userInfoAccessor", "Lcom/whoop/data/repositories/UserRepository;", "userRepository", "<init>", "(Ljava/time/Clock;Lz92/a;Lcom/whoop/data/repositories/UserRepository;)V", "Lmk2/i;", "previousStrain", "", "Lxk2/j;", "finalizedPoints", "", "nextTimestampMillis", "Lxk2/h;", "profile", "", "activityInternalName", "activeDurationSeconds", "c", "(Lmk2/i;Ljava/util/List;Ljava/lang/Long;Lxk2/h;Ljava/lang/String;J)Lmk2/i;", "e", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/repositories/RestingHeartRate;", "restingHr", "d", "(Lcom/whoop/data/repositories/RestingHeartRate;)Lxk2/h;", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "Lcom/whoop/domain/model/UserProfile;", "userProfile", "f", "(Lcom/whoop/domain/model/User;Lcom/whoop/domain/model/UserProfile;Lcom/whoop/data/repositories/RestingHeartRate;)Lxk2/h;", "Lxk2/f;", "previous", "Lyg2/d;", "liveHrState", "b", "(Lxk2/f;Lyg2/d;Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "a", "Ljava/time/Clock;", "Lz92/a;", "Lcom/whoop/data/repositories/UserRepository;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37349j {

    /* JADX INFO: renamed from: d */
    private static final a f159742d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f159743e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: wk2.j$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lwk2/j$a;", "", "<init>", "()V", "", "DEFAULT_MAX_HEART_RATE", "D", "DEFAULT_WEIGHT_KG", "DEFAULT_HEIGHT_M", "", "DEFAULT_AGE", "I", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: wk2.j$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f159747a;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.NON_BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gender.PREFER_NOT_TO_SAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f159747a = iArr;
        }
    }

    /* JADX INFO: renamed from: wk2.j$c */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.accumulators.StrainCaloriesAccumulator", m100430f = "StrainCaloriesAccumulator.kt", m100431l = {42}, m100432m = "accumulate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f159748E;

        /* JADX INFO: renamed from: G */
        int f159750G;

        /* JADX INFO: renamed from: w */
        Object f159751w;

        /* JADX INFO: renamed from: x */
        Object f159752x;

        /* JADX INFO: renamed from: y */
        Object f159753y;

        /* JADX INFO: renamed from: z */
        long f159754z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159748E = obj;
            this.f159750G |= Integer.MIN_VALUE;
            return C37349j.this.m119601b(null, null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: wk2.j$d */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.service.accumulators.StrainCaloriesAccumulator", m100430f = "StrainCaloriesAccumulator.kt", m100431l = {109, 110}, m100432m = "resolveProfile", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f159755w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f159756x;

        /* JADX INFO: renamed from: z */
        int f159758z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159756x = obj;
            this.f159758z |= Integer.MIN_VALUE;
            return C37349j.this.m119599e(this);
        }
    }

    public C37349j(Clock clock, InterfaceC40205a userInfoAccessor, UserRepository userRepository) {
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(userRepository, "userRepository");
        this.clock = clock;
        this.userInfoAccessor = userInfoAccessor;
        this.userRepository = userRepository;
    }

    /* JADX INFO: renamed from: c */
    private final C25642i m119597c(C25642i previousStrain, List<C38444j> finalizedPoints, Long nextTimestampMillis, C38442h profile, String activityInternalName, long activeDurationSeconds) {
        List<C38444j> list = finalizedPoints;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((C38444j) it.next()).getHeartRate()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((C38444j) it3.next()).getTimestampMillis()));
        }
        double rawScore = previousStrain.getRawScore();
        C38441g c38441g = C38441g.f164625a;
        double dM123148a = rawScore + c38441g.m123148a(arrayList, arrayList2, nextTimestampMillis, profile.getRestingHeartRate(), profile.getMaximumHeartRate());
        double calories = previousStrain.getCalories() + C38435a.f164608a.m123129b(arrayList, arrayList2, nextTimestampMillis, profile.getRestingHeartRate(), profile.getMaximumHeartRate(), profile.getBaseline(), profile.getWeightKg(), profile.getHeightM(), profile.getCom.mapbox.common.HttpHeaders.AGE java.lang.String());
        float fM123150c = c38441g.m123150c(C38437c.f164615a.m123137a(activityInternalName, profile.getWeightKg(), activeDurationSeconds) + dM123148a);
        return C25642i.m75446b(previousStrain, fM123150c, fM123150c / 21.0f, 0.0f, null, 0.0f, 0.0f, dM123148a, calories, 60, null);
    }

    /* JADX INFO: renamed from: d */
    private final C38442h m119598d(RestingHeartRate restingHr) {
        return new C38442h(restingHr.getValue(), 184.0d, GenderBaseline.AVERAGE_OF_BOTH, 73.0d, 1.71d, 35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m119599e(InterfaceC30057d<? super C38442h> interfaceC30057d) {
        d dVar;
        RestingHeartRate restingHeartRate;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f159758z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f159758z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object restingHeartRate$default = dVar.f159756x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f159758z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(restingHeartRate$default);
            UserRepository userRepository = this.userRepository;
            dVar.f159758z = 1;
            restingHeartRate$default = UserRepository.getRestingHeartRate$default(userRepository, false, dVar, 1, null);
            if (restingHeartRate$default != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(restingHeartRate$default);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            restingHeartRate = (RestingHeartRate) dVar.f159755w;
            AbstractC34132o.m107864I(restingHeartRate$default);
        }
        User user = (User) restingHeartRate$default;
        UserProfile profile = user != null ? user.getProfile() : null;
        return (user != null || profile == null) ? m119598d(restingHeartRate) : m119600f(user, profile, restingHeartRate);
        RestingHeartRate restingHeartRate2 = (RestingHeartRate) restingHeartRate$default;
        InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
        dVar.f159755w = restingHeartRate2;
        dVar.f159758z = 2;
        Object objMo129089c = interfaceC40205a.mo129089c(dVar);
        if (objMo129089c != enumC31071a) {
            restingHeartRate = restingHeartRate2;
            restingHeartRate$default = objMo129089c;
            User user2 = (User) restingHeartRate$default;
            if (user2 != null) {
            }
            if (user2 != null) {
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: f */
    private final C38442h m119600f(User user, UserProfile userProfile, RestingHeartRate restingHr) {
        GenderBaseline genderBaselineFromName;
        int i13 = b.f159747a[userProfile.getGender().ordinal()];
        if (i13 == 1) {
            genderBaselineFromName = GenderBaseline.MALE;
        } else if (i13 == 2) {
            genderBaselineFromName = GenderBaseline.FEMALE;
        } else {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            GenderBaseline.Companion companion = GenderBaseline.INSTANCE;
            String physiologicalBaseline = userProfile.getPhysiologicalBaseline();
            if (physiologicalBaseline == null) {
                physiologicalBaseline = GenderBaseline.AVERAGE_OF_BOTH.getValue();
            }
            genderBaselineFromName = companion.fromName(physiologicalBaseline);
        }
        return new C38442h(restingHr.getValue(), user.getMaxHeartRate(), genderBaselineFromName, user.getWeightKg(), user.getHeightMeters(), user.getAgeYrs());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m119601b(C38440f c38440f, AbstractC39529d abstractC39529d, String str, long j7, InterfaceC30057d<? super C38440f> interfaceC30057d) {
        c cVar;
        C38442h profile;
        String str2;
        long j13;
        C38442h c38442h;
        C38436b.a aVarM123132b;
        C25642i c25642iM119597c;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f159750G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f159750G = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM119599e = cVar.f159748E;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f159750G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM119599e);
            if (!(abstractC39529d instanceof AbstractC39529d.a)) {
                return c38440f;
            }
            profile = c38440f.getProfile();
            if (profile == null) {
                cVar.f159751w = c38440f;
                cVar.f159752x = abstractC39529d;
                cVar.f159753y = str;
                cVar.f159754z = j7;
                cVar.f159750G = 1;
                objM119599e = m119599e(cVar);
                if (objM119599e == obj) {
                    return obj;
                }
            }
            str2 = str;
            j13 = j7;
            c38442h = profile;
            aVarM123132b = C38436b.f164610a.m123132b(AbstractC25265s.m74128f1(new C38444j(this.clock.instant().toEpochMilli(), ((AbstractC39529d.a) abstractC39529d).getHeartRate()), c38440f.m123144b()), c38440f.getLastProcessedTimestampMillis());
            if (aVarM123132b.m123133a().isEmpty()) {
                c25642iM119597c = c38440f.getStrain();
            } else {
                c25642iM119597c = m119597c(c38440f.getStrain(), aVarM123132b.m123133a(), aVarM123132b.getNextTimestampMillis(), c38442h, str2, j13);
            }
            return c38440f.m123143a(c25642iM119597c, aVarM123132b.m123136d(), aVarM123132b.getLastProcessedTimestampMillis(), c38442h);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j7 = cVar.f159754z;
        str = (String) cVar.f159753y;
        abstractC39529d = (AbstractC39529d) cVar.f159752x;
        c38440f = (C38440f) cVar.f159751w;
        AbstractC34132o.m107864I(objM119599e);
        profile = (C38442h) objM119599e;
        str2 = str;
        j13 = j7;
        c38442h = profile;
        aVarM123132b = C38436b.f164610a.m123132b(AbstractC25265s.m74128f1(new C38444j(this.clock.instant().toEpochMilli(), ((AbstractC39529d.a) abstractC39529d).getHeartRate()), c38440f.m123144b()), c38440f.getLastProcessedTimestampMillis());
        if (aVarM123132b.m123133a().isEmpty()) {
            c25642iM119597c = c38440f.getStrain();
        } else {
            c25642iM119597c = m119597c(c38440f.getStrain(), aVarM123132b.m123133a(), aVarM123132b.getNextTimestampMillis(), c38442h, str2, j13);
        }
        return c38440f.m123143a(c25642iM119597c, aVarM123132b.m123136d(), aVarM123132b.getLastProcessedTimestampMillis(), c38442h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C37349j(Clock clock, InterfaceC40205a interfaceC40205a, UserRepository userRepository, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(clock, interfaceC40205a, userRepository);
    }
}
