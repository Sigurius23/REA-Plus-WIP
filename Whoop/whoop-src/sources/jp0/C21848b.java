package jp0;

import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.sleep.coach.data.network.api.SleepCoachUsersApiMigrations;
import com.whoop.sleep.coach.data.network.model.HarvardSleepAdviceDto;
import com.whoop.sleep.coach.data.network.model.Vow;
import com.whoop.sleep.coach.data.network.model.VowDto;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import hj0.AbstractC17355n;
import in2.InterfaceC18732d;
import iy1.InterfaceC21030c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qf2.AbstractC30328g;
import r83.EnumC31071a;
import rf2.InterfaceC31359a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: jp0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010'¨\u0006)"}, m65681d2 = {"Ljp0/b;", "Lhj0/n;", "Ljp0/a;", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "smartAlarmApi", "Lcom/whoop/sleep/coach/data/network/api/SleepCoachUsersApiMigrations;", "sleepCoachUsersApiMigrations", "Lrf2/a;", "smartAlarmUserInfoDao", "Liy1/c;", "metricWriter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lrr2/c;Lin2/d;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lcom/whoop/sleep/coach/data/network/api/SleepCoachUsersApiMigrations;Lrf2/a;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;", "a", "(Lq83/d;)Ljava/lang/Object;", "harvardSleepAdviceDto", "", "format", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/sleep/coach/data/network/model/Vow;", "d", "(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "b", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "Lcom/whoop/sleep/coach/data/network/api/SleepCoachUsersApiMigrations;", "c", "Lrf2/a;", "Liy1/c;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lec3/l;", "()Lec3/l;", "cachedAlarm", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21848b extends AbstractC17355n implements InterfaceC21847a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SmartAlarmApi smartAlarmApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SleepCoachUsersApiMigrations sleepCoachUsersApiMigrations;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC31359a smartAlarmUserInfoDao;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: jp0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.data.repositories.HarvardSleepCoachRepositoryImpl", m100430f = "HarvardSleepCoachRepositoryImpl.kt", m100431l = {64}, m100432m = "attemptToUpdateAlarmInfoCacheOneShot", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f84380w;

        /* JADX INFO: renamed from: y */
        int f84382y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84380w = obj;
            this.f84382y |= Integer.MIN_VALUE;
            return C21848b.this.mo61830b(this);
        }
    }

    /* JADX INFO: renamed from: jp0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.data.repositories.HarvardSleepCoachRepositoryImpl", m100430f = "HarvardSleepCoachRepositoryImpl.kt", m100431l = {35}, m100432m = "getSleepAdvice", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f84383w;

        /* JADX INFO: renamed from: y */
        int f84385y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84383w = obj;
            this.f84385y |= Integer.MIN_VALUE;
            return C21848b.this.mo61829a(this);
        }
    }

    /* JADX INFO: renamed from: jp0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.data.repositories.HarvardSleepCoachRepositoryImpl", m100430f = "HarvardSleepCoachRepositoryImpl.kt", m100431l = {44}, m100432m = "getVow", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f84387F;

        /* JADX INFO: renamed from: w */
        Object f84388w;

        /* JADX INFO: renamed from: x */
        Object f84389x;

        /* JADX INFO: renamed from: y */
        Object f84390y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f84391z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84391z = obj;
            this.f84387F |= Integer.MIN_VALUE;
            return C21848b.this.mo61832d(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21848b(InterfaceC31766c crashReporter, InterfaceC18732d dispatcherFactory, SmartAlarmApi smartAlarmApi, SleepCoachUsersApiMigrations sleepCoachUsersApiMigrations, InterfaceC31359a smartAlarmUserInfoDao, InterfaceC21030c metricWriter, FeatureFlagChecker featureFlagChecker) {
        super(InterfaceC34116n.INSTANCE.m107848a("HarvardSleepCoachRepositoryImpl"), crashReporter, dispatcherFactory);
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(smartAlarmApi, "smartAlarmApi");
        AbstractC22676k.m65750j(sleepCoachUsersApiMigrations, "sleepCoachUsersApiMigrations");
        AbstractC22676k.m65750j(smartAlarmUserInfoDao, "smartAlarmUserInfoDao");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.smartAlarmApi = smartAlarmApi;
        this.sleepCoachUsersApiMigrations = sleepCoachUsersApiMigrations;
        this.smartAlarmUserInfoDao = smartAlarmUserInfoDao;
        this.metricWriter = metricWriter;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jp0.InterfaceC21847a
    /* JADX INFO: renamed from: a */
    public Object mo61829a(InterfaceC30057d<? super HarvardSleepAdviceDto> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f84385y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f84385y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objFetchSleepAdviceV2 = bVar.f84383w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f84385y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objFetchSleepAdviceV2);
                SleepCoachUsersApiMigrations sleepCoachUsersApiMigrations = this.sleepCoachUsersApiMigrations;
                bVar.f84385y = 1;
                objFetchSleepAdviceV2 = sleepCoachUsersApiMigrations.fetchSleepAdviceV2(bVar);
                if (objFetchSleepAdviceV2 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objFetchSleepAdviceV2);
            }
            return (HarvardSleepAdviceDto) objFetchSleepAdviceV2;
        } catch (Exception e5) {
            logRetrofitSuspendException(e5, "Failed to fetch sleep Advice");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jp0.InterfaceC21847a
    /* JADX INFO: renamed from: b */
    public Object mo61830b(InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f84382y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f84382y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM92687a = aVar2.f84380w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f84382y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM92687a);
                SmartAlarmApi smartAlarmApi = this.smartAlarmApi;
                InterfaceC34116n logger = getLogger();
                InterfaceC31359a interfaceC31359a = this.smartAlarmUserInfoDao;
                InterfaceC21030c interfaceC21030c = this.metricWriter;
                FeatureFlagChecker featureFlagChecker = this.featureFlagChecker;
                aVar2.f84382y = 1;
                objM92687a = AbstractC30328g.m92687a(smartAlarmApi, logger, interfaceC31359a, interfaceC21030c, featureFlagChecker, aVar2);
                if (objM92687a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM92687a);
            }
            return (SmartAlarmUserInfo) objM92687a;
        } catch (Exception e5) {
            logRetrofitSuspendException(e5, "Failed to get SmartAlarmUserInfo");
            return null;
        }
    }

    @Override // jp0.InterfaceC21847a
    /* JADX INFO: renamed from: c */
    public InterfaceC13058l mo61831c() {
        return AbstractC13091v.m36610t(this.smartAlarmUserInfoDao.mo96435b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jp0.InterfaceC21847a
    /* JADX INFO: renamed from: d */
    public Object mo61832d(HarvardSleepAdviceDto harvardSleepAdviceDto, String str, InterfaceC30057d<? super Resource<Vow>> interfaceC30057d) {
        c cVar;
        Resource.Companion companion;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f84387F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f84387F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f84391z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f84387F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                Resource.Companion companion2 = Resource.INSTANCE;
                SleepCoachUsersApiMigrations sleepCoachUsersApiMigrations = this.sleepCoachUsersApiMigrations;
                cVar.f84388w = null;
                cVar.f84389x = null;
                cVar.f84390y = companion2;
                cVar.f84387F = 1;
                Object objFetchSleepCoachVow = sleepCoachUsersApiMigrations.fetchSleepCoachVow(harvardSleepAdviceDto, str, cVar);
                if (objFetchSleepCoachVow == enumC31071a) {
                    return enumC31071a;
                }
                obj = objFetchSleepCoachVow;
                companion = companion2;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Resource.Companion) cVar.f84390y;
                AbstractC34132o.m107864I(obj);
            }
            return companion.success(((VowDto) obj).toVow());
        } catch (Exception e5) {
            logRetrofitSuspendException(e5, "Failed to fetch sleep coach VOW");
            Resource.Companion companion3 = Resource.INSTANCE;
            String message = e5.getMessage();
            if (message == null) {
                message = "Unknown Exception";
            }
            return Resource.Companion.error$default(companion3, message, null, null, null, 14, null);
        }
    }
}
