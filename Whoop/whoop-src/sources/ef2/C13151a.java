package ef2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.commons.Resource;
import com.whoop.sleep.coach.data.network.api.SleepCoachApi;
import com.whoop.sleep.coach.data.network.model.sleepSchedule.SleepScheduleDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.CreateAlarmScheduleDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.SleepScheduleComponentsDto;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;
import ud3.C34850x0;
import w02.AbstractC36685b;

/* JADX INFO: renamed from: ef2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eH\u0086@¢\u0006\u0004\b\u0018\u0010\u0011J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b \u0010\u001cJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0086@¢\u0006\u0004\b%\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.¨\u0006/"}, m65681d2 = {"Lef2/a;", "", "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;", "sleepCoachApi", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "Lu92/d;", "prefsStore", "<init>", "(Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;Ltr2/n;Lrr2/c;Lin2/d;Lu92/d;)V", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;", "alarmSchedule", "Ll83/a0;", "e", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;", "j", "", "scheduleId", "i", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "sleepScheduleId", "g", "(Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lq83/d;)Ljava/lang/Object;", "f", "", "isScheduleEnabled", "l", "(ZLq83/d;)Ljava/lang/Object;", "k", "a", "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;", "b", "Ltr2/n;", "c", "Lrr2/c;", "d", "Lin2/d;", "Lu92/d;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13151a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SleepCoachApi sleepCoachApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: ef2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.repository.SleepCoachScheduleRepository$createAlarmSchedule$2", m100430f = "SleepCoachScheduleRepository.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f45537w;

        /* JADX INFO: renamed from: x */
        int f45538x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ CreateAlarmScheduleDto f45540z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CreateAlarmScheduleDto createAlarmScheduleDto, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45540z = createAlarmScheduleDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13151a.this.new a(this.f45540z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Resource.Companion companion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f45538x;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Resource.Companion companion2 = Resource.INSTANCE;
                    SleepCoachApi sleepCoachApi = C13151a.this.sleepCoachApi;
                    CreateAlarmScheduleDto createAlarmScheduleDto = this.f45540z;
                    this.f45537w = companion2;
                    this.f45538x = 1;
                    if (sleepCoachApi.createAlarmSchedule(createAlarmScheduleDto, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    companion = companion2;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (Resource.Companion) this.f45537w;
                    AbstractC34132o.m107864I(obj);
                }
                return companion.success(C23454a0.f92919a);
            } catch (Exception e5) {
                AbstractC36685b.m117759a(e5, "failed to create alarm schedule", C13151a.this.logger, C13151a.this.crashReporter);
                Resource.Companion companion3 = Resource.INSTANCE;
                String message = e5.getMessage();
                return Resource.Companion.error$default(companion3, message == null ? "failed to create alarm schedule" : message, null, null, null, 14, null);
            }
        }
    }

    /* JADX INFO: renamed from: ef2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.repository.SleepCoachScheduleRepository$deleteSleepScheduleByID$2", m100430f = "SleepCoachScheduleRepository.kt", m100431l = {77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f45541w;

        /* JADX INFO: renamed from: x */
        int f45542x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f45544z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45544z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13151a.this.new b(this.f45544z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.String] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            ?? r10 = this.f45542x;
            try {
                if (r10 == 0) {
                    AbstractC34132o.m107864I(obj);
                    str = "failed to delete sleep schedule bff components by schedule id";
                    SleepCoachApi sleepCoachApi = C13151a.this.sleepCoachApi;
                    String str2 = this.f45544z;
                    this.f45541w = "failed to delete sleep schedule bff components by schedule id";
                    this.f45542x = 1;
                    obj = sleepCoachApi.deleteSleepScheduleById(str2, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (r10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f45541w;
                    AbstractC34132o.m107864I(obj);
                }
                C34850x0 c34850x0 = ((C29218v0) obj).f118269a;
                if (c34850x0.f146788Q) {
                    return Resource.INSTANCE.success(C23454a0.f92919a);
                }
                Resource.Companion companion = Resource.INSTANCE;
                String str3 = c34850x0.f146791y;
                return Resource.Companion.error$default(companion, str3 == null ? str : str3, null, null, null, 14, null);
            } catch (Exception e5) {
                AbstractC36685b.m117759a(e5, r10, C13151a.this.logger, C13151a.this.crashReporter);
                Resource.Companion companion2 = Resource.INSTANCE;
                String message = e5.getMessage();
                return Resource.Companion.error$default(companion2, message == null ? r10 : message, null, null, null, 14, null);
            }
        }
    }

    /* JADX INFO: renamed from: ef2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.repository.SleepCoachScheduleRepository$editAlarmSchedule$2", m100430f = "SleepCoachScheduleRepository.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ CreateAlarmScheduleDto f45545E;

        /* JADX INFO: renamed from: w */
        Object f45546w;

        /* JADX INFO: renamed from: x */
        int f45547x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f45549z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, CreateAlarmScheduleDto createAlarmScheduleDto, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45549z = str;
            this.f45545E = createAlarmScheduleDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13151a.this.new c(this.f45549z, this.f45545E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Resource.Companion companion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f45547x;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Resource.Companion companion2 = Resource.INSTANCE;
                    SleepCoachApi sleepCoachApi = C13151a.this.sleepCoachApi;
                    String str = this.f45549z;
                    CreateAlarmScheduleDto createAlarmScheduleDto = this.f45545E;
                    this.f45546w = companion2;
                    this.f45547x = 1;
                    if (sleepCoachApi.editAlarmSchedule(str, createAlarmScheduleDto, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    companion = companion2;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (Resource.Companion) this.f45546w;
                    AbstractC34132o.m107864I(obj);
                }
                return companion.success(C23454a0.f92919a);
            } catch (Exception e5) {
                AbstractC36685b.m117759a(e5, "failed to edit alarm schedule", C13151a.this.logger, C13151a.this.crashReporter);
                Resource.Companion companion3 = Resource.INSTANCE;
                String message = e5.getMessage();
                return Resource.Companion.error$default(companion3, message == null ? "failed to edit alarm schedule" : message, null, null, null, 14, null);
            }
        }
    }

    /* JADX INFO: renamed from: ef2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.repository.SleepCoachScheduleRepository$fetchSleepScheduleComponents$2", m100430f = "SleepCoachScheduleRepository.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f45550w;

        /* JADX INFO: renamed from: x */
        int f45551x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13151a.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<SleepScheduleComponentsDto>> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Resource.Companion companion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f45551x;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Resource.Companion companion2 = Resource.INSTANCE;
                    SleepCoachApi sleepCoachApi = C13151a.this.sleepCoachApi;
                    this.f45550w = companion2;
                    this.f45551x = 1;
                    Object objSleepScheduleComponents = sleepCoachApi.sleepScheduleComponents(this);
                    if (objSleepScheduleComponents == enumC31071a) {
                        return enumC31071a;
                    }
                    companion = companion2;
                    obj = objSleepScheduleComponents;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (Resource.Companion) this.f45550w;
                    AbstractC34132o.m107864I(obj);
                }
                return companion.success(obj);
            } catch (Exception e5) {
                AbstractC36685b.m117759a(e5, "failed to fetch sleep schedule bff components", C13151a.this.logger, C13151a.this.crashReporter);
                Resource.Companion companion3 = Resource.INSTANCE;
                String message = e5.getMessage();
                return Resource.Companion.error$default(companion3, message == null ? "failed to fetch sleep schedule bff components" : message, null, null, null, 14, null);
            }
        }
    }

    /* JADX INFO: renamed from: ef2.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.repository.SleepCoachScheduleRepository$fetchSleepScheduleComponentsById$2", m100430f = "SleepCoachScheduleRepository.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f45553w;

        /* JADX INFO: renamed from: x */
        int f45554x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f45556z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45556z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13151a.this.new e(this.f45556z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<SleepScheduleComponentsDto>> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Resource.Companion companion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f45554x;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Resource.Companion companion2 = Resource.INSTANCE;
                    SleepCoachApi sleepCoachApi = C13151a.this.sleepCoachApi;
                    String str = this.f45556z;
                    this.f45553w = companion2;
                    this.f45554x = 1;
                    Object sleepScheduleComponentsById = sleepCoachApi.getSleepScheduleComponentsById(str, this);
                    if (sleepScheduleComponentsById == enumC31071a) {
                        return enumC31071a;
                    }
                    companion = companion2;
                    obj = sleepScheduleComponentsById;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (Resource.Companion) this.f45553w;
                    AbstractC34132o.m107864I(obj);
                }
                return companion.success(obj);
            } catch (Exception e5) {
                AbstractC36685b.m117759a(e5, "failed to fetch sleep schedule bff components by schedule id", C13151a.this.logger, C13151a.this.crashReporter);
                Resource.Companion companion3 = Resource.INSTANCE;
                String message = e5.getMessage();
                return Resource.Companion.error$default(companion3, message == null ? "failed to fetch sleep schedule bff components by schedule id" : message, null, null, null, 14, null);
            }
        }
    }

    /* JADX INFO: renamed from: ef2.a$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.repository.SleepCoachScheduleRepository$fetchSleepScheduleList$2", m100430f = "SleepCoachScheduleRepository.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f45557w;

        /* JADX INFO: renamed from: x */
        int f45558x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13151a.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<SleepScheduleDto>> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Resource.Companion companion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f45558x;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Resource.Companion companion2 = Resource.INSTANCE;
                    SleepCoachApi sleepCoachApi = C13151a.this.sleepCoachApi;
                    this.f45557w = companion2;
                    this.f45558x = 1;
                    Object allSleepScheduleComponents = sleepCoachApi.getAllSleepScheduleComponents(this);
                    if (allSleepScheduleComponents == enumC31071a) {
                        return enumC31071a;
                    }
                    companion = companion2;
                    obj = allSleepScheduleComponents;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (Resource.Companion) this.f45557w;
                    AbstractC34132o.m107864I(obj);
                }
                return companion.success(obj);
            } catch (Exception e5) {
                AbstractC36685b.m117759a(e5, "failed to fetch sleep schedule list", C13151a.this.logger, C13151a.this.crashReporter);
                Resource.Companion companion3 = Resource.INSTANCE;
                String message = e5.getMessage();
                return Resource.Companion.error$default(companion3, message == null ? "failed to fetch sleep schedule list" : message, null, null, null, 14, null);
            }
        }
    }

    /* JADX INFO: renamed from: ef2.a$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.repository.SleepCoachScheduleRepository$markAlarmScheduleComplete$2", m100430f = "SleepCoachScheduleRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f45560w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13151a.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f45560w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                C13151a.this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_SLEEP_COMPLETED, true);
                return Resource.INSTANCE.success(C23454a0.f92919a);
            } catch (Exception e5) {
                AbstractC36685b.m117759a(e5, "Failed to update sleep onboarding status", C13151a.this.logger, C13151a.this.crashReporter);
                Resource.Companion companion = Resource.INSTANCE;
                String message = e5.getMessage();
                return Resource.Companion.error$default(companion, message == null ? "Failed to update sleep onboarding status" : message, null, null, null, 14, null);
            }
        }
    }

    /* JADX INFO: renamed from: ef2.a$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.repository.SleepCoachScheduleRepository$toggleSleepSchedule$2", m100430f = "SleepCoachScheduleRepository.kt", m100431l = {89, 91}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/commons/Resource;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f45562w;

        /* JADX INFO: renamed from: x */
        int f45563x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f45564y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13151a f45565z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z4, C13151a c13151a, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45564y = z4;
            this.f45565z = c13151a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f45564y, this.f45565z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            if (r11 == r0) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.String] */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r10.f45563x
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r10.f45562w
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.lang.Exception -> L15
                goto L57
            L15:
                r0 = move-exception
                r11 = r0
                goto L7c
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                java.lang.Object r0 = r10.f45562w
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.lang.Exception -> L15
                goto L43
            L29:
                p505ts.AbstractC34132o.m107864I(r11)
                java.lang.String r1 = "failed to toggle sleep schedule"
                boolean r11 = r10.f45564y     // Catch: java.lang.Exception -> L15
                if (r11 == 0) goto L46
                ef2.a r11 = r10.f45565z     // Catch: java.lang.Exception -> L15
                com.whoop.sleep.coach.data.network.api.SleepCoachApi r11 = ef2.C13151a.m36832d(r11)     // Catch: java.lang.Exception -> L15
                r10.f45562w = r1     // Catch: java.lang.Exception -> L15
                r10.f45563x = r3     // Catch: java.lang.Exception -> L15
                java.lang.Object r11 = r11.enableSleepSchedule(r10)     // Catch: java.lang.Exception -> L15
                if (r11 != r0) goto L43
                goto L56
            L43:
                pg3.v0 r11 = (pg3.C29218v0) r11     // Catch: java.lang.Exception -> L15
                goto L59
            L46:
                ef2.a r11 = r10.f45565z     // Catch: java.lang.Exception -> L15
                com.whoop.sleep.coach.data.network.api.SleepCoachApi r11 = ef2.C13151a.m36832d(r11)     // Catch: java.lang.Exception -> L15
                r10.f45562w = r1     // Catch: java.lang.Exception -> L15
                r10.f45563x = r2     // Catch: java.lang.Exception -> L15
                java.lang.Object r11 = r11.disableSleepSchedule(r10)     // Catch: java.lang.Exception -> L15
                if (r11 != r0) goto L57
            L56:
                return r0
            L57:
                pg3.v0 r11 = (pg3.C29218v0) r11     // Catch: java.lang.Exception -> L15
            L59:
                ud3.x0 r11 = r11.f118269a     // Catch: java.lang.Exception -> L15
                boolean r0 = r11.f146788Q     // Catch: java.lang.Exception -> L15
                if (r0 == 0) goto L68
                com.whoop.data.remote.commons.Resource$Companion r11 = com.whoop.data.remote.commons.Resource.INSTANCE     // Catch: java.lang.Exception -> L15
                l83.a0 r0 = l83.C23454a0.f92919a     // Catch: java.lang.Exception -> L15
                com.whoop.data.remote.commons.Resource r11 = r11.success(r0)     // Catch: java.lang.Exception -> L15
                return r11
            L68:
                com.whoop.data.remote.commons.Resource$Companion r2 = com.whoop.data.remote.commons.Resource.INSTANCE     // Catch: java.lang.Exception -> L15
                java.lang.String r11 = r11.f146791y     // Catch: java.lang.Exception -> L15
                if (r11 != 0) goto L70
                r3 = r1
                goto L71
            L70:
                r3 = r11
            L71:
                r7 = 14
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.whoop.data.remote.commons.Resource r11 = com.whoop.data.remote.commons.Resource.Companion.error$default(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L15
                return r11
            L7c:
                ef2.a r0 = r10.f45565z
                tr2.n r0 = ef2.C13151a.m36830b(r0)
                ef2.a r2 = r10.f45565z
                rr2.c r2 = ef2.C13151a.m36829a(r2)
                w02.AbstractC36685b.m117759a(r11, r1, r0, r2)
                com.whoop.data.remote.commons.Resource$Companion r3 = com.whoop.data.remote.commons.Resource.INSTANCE
                java.lang.String r11 = r11.getMessage()
                if (r11 != 0) goto L95
                r4 = r1
                goto L96
            L95:
                r4 = r11
            L96:
                r8 = 14
                r9 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                com.whoop.data.remote.commons.Resource r11 = com.whoop.data.remote.commons.Resource.Companion.error$default(r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ef2.C13151a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13151a(SleepCoachApi sleepCoachApi, InterfaceC34116n logger, InterfaceC31766c crashReporter, InterfaceC18732d dispatcherFactory, C34660d prefsStore) {
        AbstractC22676k.m65750j(sleepCoachApi, "sleepCoachApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        this.sleepCoachApi = sleepCoachApi;
        this.logger = logger;
        this.crashReporter = crashReporter;
        this.dispatcherFactory = dispatcherFactory;
        this.prefsStore = prefsStore;
    }

    /* JADX INFO: renamed from: e */
    public final Object m36833e(CreateAlarmScheduleDto createAlarmScheduleDto, InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new a(createAlarmScheduleDto, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: f */
    public final Object m36834f(String str, InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new b(str, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: g */
    public final Object m36835g(String str, CreateAlarmScheduleDto createAlarmScheduleDto, InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new c(str, createAlarmScheduleDto, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: h */
    public final Object m36836h(InterfaceC30057d<? super Resource<SleepScheduleComponentsDto>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new d(null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    public final Object m36837i(String str, InterfaceC30057d<? super Resource<SleepScheduleComponentsDto>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new e(str, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: j */
    public final Object m36838j(InterfaceC30057d<? super Resource<SleepScheduleDto>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new f(null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: k */
    public final Object m36839k(InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new g(null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: l */
    public final Object m36840l(boolean z4, InterfaceC30057d<? super Resource<C23454a0>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new h(z4, this, null), interfaceC30057d);
    }
}
