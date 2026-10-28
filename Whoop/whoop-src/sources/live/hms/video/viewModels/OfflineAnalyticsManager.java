package live.hms.video.viewModels;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import live.hms.video.database.EventsDatabase;
import live.hms.video.database.OfflineAnalyticsRepository;
import live.hms.video.database.entity.AnalyticsEntityModel;
import live.hms.video.utils.HMSAgentOs;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/viewModels/OfflineAnalyticsManager;", "", "Landroid/content/Context;", "context", "Llive/hms/video/utils/HMSAgentOs;", "hmsAgentOs", "Lkotlin/Function0;", "", "isQaLink", "<init>", "(Landroid/content/Context;Llive/hms/video/utils/HMSAgentOs;Lc93/a;)V", "Llive/hms/video/database/entity/AnalyticsEntityModel;", "analyticsEntityModel", "flushLog", "(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "persistLog", "(Llive/hms/video/database/entity/AnalyticsEntityModel;)V", "", "eventId", "deleteLogById", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "flushExistingLogs", "(Landroid/content/Context;)V", "Lc93/a;", "Llive/hms/video/database/OfflineAnalyticsRepository;", "analyticsRepository", "Llive/hms/video/database/OfflineAnalyticsRepository;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OfflineAnalyticsManager {
    public static final String TAG = "OfflineAnalyticsManager";
    private OfflineAnalyticsRepository analyticsRepository;
    private final InterfaceC4339a isQaLink;

    /* JADX INFO: renamed from: live.hms.video.viewModels.OfflineAnalyticsManager$flushExistingLogs$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.viewModels.OfflineAnalyticsManager$flushExistingLogs$1", m100430f = "OfflineAnalyticsManager.kt", m100431l = {49, 51, 53}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C244061 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $deviceId;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C244061(String str, InterfaceC30057d<? super C244061> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$deviceId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return OfflineAnalyticsManager.this.new C244061(this.$deviceId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C244061) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x007f  */
        /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ca -> B:28:0x00ce). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d1 -> B:30:0x00dc). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.viewModels.OfflineAnalyticsManager.C244061.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: live.hms.video.viewModels.OfflineAnalyticsManager$flushLog$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.viewModels.OfflineAnalyticsManager", m100430f = "OfflineAnalyticsManager.kt", m100431l = {30}, m100432m = "flushLog")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C244071 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C244071(InterfaceC30057d<? super C244071> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OfflineAnalyticsManager.this.flushLog(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.viewModels.OfflineAnalyticsManager$persistLog$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.viewModels.OfflineAnalyticsManager$persistLog$1", m100430f = "OfflineAnalyticsManager.kt", m100431l = {38}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C244081 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ AnalyticsEntityModel $analyticsEntityModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C244081(AnalyticsEntityModel analyticsEntityModel, InterfaceC30057d<? super C244081> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$analyticsEntityModel = analyticsEntityModel;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return OfflineAnalyticsManager.this.new C244081(this.$analyticsEntityModel, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C244081) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                OfflineAnalyticsRepository offlineAnalyticsRepository = OfflineAnalyticsManager.this.analyticsRepository;
                AnalyticsEntityModel analyticsEntityModel = this.$analyticsEntityModel;
                analyticsEntityModel.setQa(((Boolean) OfflineAnalyticsManager.this.isQaLink.invoke()).booleanValue());
                this.label = 1;
                if (offlineAnalyticsRepository.insertLog(analyticsEntityModel, this) == enumC31071a) {
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

    public OfflineAnalyticsManager(Context context, HMSAgentOs hmsAgentOs, InterfaceC4339a isQaLink) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(hmsAgentOs, "hmsAgentOs");
        AbstractC22676k.m65750j(isQaLink, "isQaLink");
        this.isQaLink = isQaLink;
        this.analyticsRepository = new OfflineAnalyticsRepository(EventsDatabase.Companion.getInstance$default(EventsDatabase.INSTANCE, context, null, 2, null).logDao(), hmsAgentOs);
    }

    public final Object deleteLogById(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteLogById = this.analyticsRepository.deleteLogById(str, interfaceC30057d);
        return objDeleteLogById == EnumC31071a.f128113w ? objDeleteLogById : C23454a0.f92919a;
    }

    public final void flushExistingLogs(Context context) {
        AbstractC22676k.m65750j(context, "context");
        String deviceId = this.analyticsRepository.getHmsAgentOs().getDeviceId(context);
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new C244061(deviceId, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object flushLog(AnalyticsEntityModel analyticsEntityModel, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C244071 c244071;
        boolean zBooleanValue;
        if (interfaceC30057d instanceof C244071) {
            c244071 = (C244071) interfaceC30057d;
            int i13 = c244071.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c244071.label = i13 - Integer.MIN_VALUE;
            } else {
                c244071 = new C244071(interfaceC30057d);
            }
        } else {
            c244071 = new C244071(interfaceC30057d);
        }
        Object objFlushLog = c244071.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c244071.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objFlushLog);
                OfflineAnalyticsRepository offlineAnalyticsRepository = this.analyticsRepository;
                c244071.label = 1;
                objFlushLog = offlineAnalyticsRepository.flushLog(analyticsEntityModel, c244071);
                if (objFlushLog == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objFlushLog);
            }
            zBooleanValue = ((Boolean) objFlushLog).booleanValue();
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final void persistLog(AnalyticsEntityModel analyticsEntityModel) {
        AbstractC22676k.m65750j(analyticsEntityModel, "analyticsEntityModel");
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new C244081(analyticsEntityModel, null), 3);
    }
}
