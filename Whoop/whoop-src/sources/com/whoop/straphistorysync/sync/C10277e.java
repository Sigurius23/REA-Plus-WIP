package com.whoop.straphistorysync.sync;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bf2.C3201a;
import bi2.C3294j;
import bi2.EnumC3285a;
import bi2.InterfaceC3291g;
import bi2.InterfaceC3292h;
import bi2.InterfaceC3293i;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca2.InterfaceC4368h;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.metrics.domain.models.MetricPostType;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import jk0.InterfaceC21750d;
import js0.AbstractC21909c;
import js0.C21908b;
import jy1.C22047a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C17820i;
import p000.C3718c;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sj2.InterfaceC32564a;
import st0.AbstractC32975s;
import st0.InterfaceC32974r;
import tr2.InterfaceC34116n;
import vk0.InterfaceC36085k;
import wb3.AbstractC37056f;
import wh2.C37300a;
import xh2.C38310a;
import xh2.C38311b;
import xh2.C38312c;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import yh2.EnumC39542a;
import yh2.InterfaceC39544c;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0001:Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJM\u0010,\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020+2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020+2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b4\u00103J%\u00108\u001a\b\u0012\u0004\u0012\u00020\u0017072\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b8\u00109J%\u0010:\u001a\b\u0012\u0004\u0012\u00020$072\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010LR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010MR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010O¨\u0006R"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/e;", "Lyh2/c;", "Lcom/whoop/straphistorysync/sync/d;", "stateMachine", "Lbi2/j;", "watermarkTracker", "Lbi2/g;", "sensorSyncHolderFactory", "Lbi2/i;", "sensorSyncProcessorFactory", "Liy1/c;", "metricWriter", "Lca2/h;", "rawDataTrackingService", "Lst0/r;", "strapLockStateTracker", "Ljs0/c;", "configurationRepository", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "Lkotlin/Function0;", "", "timeProvider", "<init>", "(Lcom/whoop/straphistorysync/sync/d;Lbi2/j;Lbi2/g;Lbi2/i;Liy1/c;Lca2/h;Lst0/r;Ljs0/c;Lbc3/c0;Ltr2/n;Lc93/a;)V", "Ljk0/d;", "", "k", "(Ljk0/d;)Ljava/lang/String;", "strap", "Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "deviceSerial", "Lec3/p1;", "Lcom/whoop/straphistorysync/sync/f;", "stateFlow", "Lsj2/a;", "priority", "", "isRawDataInBacklog", "sessionId", "Ll83/a0;", "l", "(Ljk0/d;Lcom/whoop/domain/model/WhoopStrapInfo;Ljava/lang/String;Lec3/p1;Lsj2/a;ZLjava/lang/String;)V", "j", "(Ljk0/d;Ljava/lang/String;)V", "o", "(Ljk0/d;)V", "p", "(Lcom/whoop/domain/model/WhoopStrapInfo;Z)V", "q", "Lyh2/a;", "type", "Lec3/f2;", "b", "(Ljk0/d;Lyh2/a;)Lec3/f2;", "a", "(Ljk0/d;Lsj2/a;)Lec3/f2;", "Lcom/whoop/straphistorysync/sync/d;", "Lbi2/j;", "c", "Lbi2/g;", "d", "Lbi2/i;", "e", "Liy1/c;", "f", "Lca2/h;", "g", "Lst0/r;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljs0/c;", "i", "Lbc3/c0;", "Ltr2/n;", "Lc93/a;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "lastTerminalTimestamps", "m", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10277e implements InterfaceC39544c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C10276d stateMachine;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C3294j watermarkTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC3291g sensorSyncHolderFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC3293i sensorSyncProcessorFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC32974r strapLockStateTracker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC4339a timeProvider;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, Long> lastTerminalTimestamps;

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorHistoricalPullApiImpl$requeueHps$1", m100430f = "SensorHistoricalPullApiImpl.kt", m100431l = {161}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31089w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f31091y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC21750d f31092z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f31091y = str;
            this.f31092z = interfaceC21750d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10277e.this.new b(this.f31091y, this.f31092z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31089w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC21909c abstractC21909c = C10277e.this.configurationRepository;
                Companion.C41421a c41421a = Companion.C41421a.f31088a;
                C21908b configurations = abstractC21909c.getConfigurations();
                String name = c41421a.getName();
                Object defaultValue = c41421a.getDefaultValue();
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
                Object objM125868N0 = null;
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    String str = (String) configurations.get(name);
                    if (str != null) {
                        objM125868N0 = AbstractC39421y.m125932Q(str);
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    String str2 = (String) configurations.get(name);
                    if (str2 != null) {
                        objM125868N0 = AbstractC39421y.m125933R(str2);
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    String str3 = (String) configurations.get(name);
                    if (str3 != null) {
                        objM125868N0 = AbstractC39420x.m125915y(str3);
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    String str4 = (String) configurations.get(name);
                    if (str4 != null) {
                        objM125868N0 = AbstractC39420x.m125914x(str4);
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                    String str5 = (String) configurations.get(name);
                    if (str5 != null) {
                        objM125868N0 = AbstractC39414r.m125868N0(str5);
                    }
                } else {
                    objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
                }
                if (objM125868N0 != null) {
                    defaultValue = objM125868N0;
                }
                if (defaultValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
                long jLongValue = ((Long) defaultValue).longValue();
                this.f31089w = 1;
                if (AbstractC3034m0.m8782b(jLongValue, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C10277e.this.logger.mo85216g(AbstractC11895b.m31996o("Requeueing HPS for ", this.f31091y, " at Low priority after preemption"), new AbstractC30556a.a[0]);
            C10277e.this.mo26279a(this.f31092z, InterfaceC32564a.b.f134906a);
            C10277e.this.m26276o(this.f31092z);
            return C23454a0.f92919a;
        }
    }

    public C10277e(C10276d stateMachine, C3294j watermarkTracker, InterfaceC3291g sensorSyncHolderFactory, InterfaceC3293i sensorSyncProcessorFactory, InterfaceC21030c metricWriter, InterfaceC4368h rawDataTrackingService, InterfaceC32974r strapLockStateTracker, AbstractC21909c configurationRepository, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger, InterfaceC4339a timeProvider) {
        AbstractC22676k.m65750j(stateMachine, "stateMachine");
        AbstractC22676k.m65750j(watermarkTracker, "watermarkTracker");
        AbstractC22676k.m65750j(sensorSyncHolderFactory, "sensorSyncHolderFactory");
        AbstractC22676k.m65750j(sensorSyncProcessorFactory, "sensorSyncProcessorFactory");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        AbstractC22676k.m65750j(strapLockStateTracker, "strapLockStateTracker");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        this.stateMachine = stateMachine;
        this.watermarkTracker = watermarkTracker;
        this.sensorSyncHolderFactory = sensorSyncHolderFactory;
        this.sensorSyncProcessorFactory = sensorSyncProcessorFactory;
        this.metricWriter = metricWriter;
        this.rawDataTrackingService = rawDataTrackingService;
        this.strapLockStateTracker = strapLockStateTracker;
        this.configurationRepository = configurationRepository;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.timeProvider = timeProvider;
        this.lastTerminalTimestamps = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final long m26267f() {
        return Clock.systemUTC().millis();
    }

    /* JADX INFO: renamed from: j */
    private final void m26271j(InterfaceC21750d strap, String deviceSerial) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(deviceSerial, strap, null), 3);
    }

    /* JADX INFO: renamed from: k */
    private final String m26272k(InterfaceC21750d interfaceC21750d) {
        String serialNumber;
        WhoopStrapInfo whoopStrapInfo = interfaceC21750d.get_strapInfo();
        if (whoopStrapInfo == null || (serialNumber = whoopStrapInfo.getSerialNumber()) == null) {
            throw new IllegalStateException("Device serial number is not available");
        }
        return serialNumber;
    }

    /* JADX INFO: renamed from: l */
    private final void m26273l(InterfaceC21750d strap, WhoopStrapInfo strapInfo, String deviceSerial, InterfaceC13075p1 stateFlow, InterfaceC32564a priority, boolean isRawDataInBacklog, String sessionId) {
        C37300a c37300a = new C37300a(this.metricWriter, strapInfo.getWhoopDeviceType().getCodeName(), strapInfo.getMaximVersion().mo84319a(), this.strapLockStateTracker, isRawDataInBacklog, new C17820i(23, this, deviceSerial), null, 64, null);
        c37300a.m119461n();
        InterfaceC3292h interfaceC3292hM122781l = C38312c.m122781l(((C38311b) this.sensorSyncProcessorFactory).f164192a, strapInfo, c37300a);
        InterfaceC3291g interfaceC3291g = this.sensorSyncHolderFactory;
        C10276d c10276d = this.stateMachine;
        ((C38310a) interfaceC3291g).getClass();
        C10281i c10281iM122783n = C38312c.m122783n(deviceSerial, stateFlow, c10276d, interfaceC3292hM122781l, c37300a);
        strap.mo24749u(new C10280h(AbstractC13091v.m36593c(InterfaceC36085k.a.f154178a), AbstractC13091v.m36593c(null), "SensorHistoricalPullTask", InterfaceC34116n.INSTANCE.m107848a("SensorHPS_" + deviceSerial + "_" + sessionId), c10281iM122783n, new C3718c(this, strap, deviceSerial, 14)), priority);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m26274m(C10277e c10277e, String str) {
        c10277e.lastTerminalTimestamps.put(str, (Long) c10277e.timeProvider.invoke());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m26275n(C10277e c10277e, InterfaceC21750d interfaceC21750d, String str) {
        c10277e.m26271j(interfaceC21750d, str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m26276o(InterfaceC21750d strap) {
        WhoopStrapInfo whoopStrapInfo = strap.get_strapInfo();
        if (whoopStrapInfo == null) {
            return;
        }
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.requeued", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("whoop_device:", whoopStrapInfo.getWhoopDeviceType().getCodeName()), AbstractC11266d.m30461o("firmware_version:", whoopStrapInfo.getMaximVersion().mo84319a())), MetricPostType.COUNT, 1, null));
    }

    /* JADX INFO: renamed from: p */
    private final void m26277p(WhoopStrapInfo strapInfo, boolean isRawDataInBacklog) {
        this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.session_skipped", null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("whoop_device:", strapInfo.getWhoopDeviceType().getCodeName()), AbstractC11266d.m30461o("firmware_version:", strapInfo.getMaximVersion().mo84319a()), AbstractC11266d.m30462p("is_raw_data_in_strap_or_app_backlog:", isRawDataInBacklog), AbstractC11266d.m30461o("strap_lock_state:", AbstractC32975s.m104081a(this.strapLockStateTracker)), "reason:already_running"), MetricPostType.COUNT, 1, null));
    }

    /* JADX INFO: renamed from: q */
    private final void m26278q(WhoopStrapInfo strapInfo, boolean isRawDataInBacklog) {
        Long l7 = this.lastTerminalTimestamps.get(strapInfo.getSerialNumber());
        if (l7 != null) {
            this.metricWriter.mo58701b(new C22047a(0, "connectivity.strap.app.sensor_hps.time_between_runs_ms", Double.valueOf(((Number) this.timeProvider.invoke()).longValue() - l7.longValue()), AbstractC37056f.m118959K(AbstractC11266d.m30461o("whoop_device:", strapInfo.getWhoopDeviceType().getCodeName()), AbstractC11266d.m30461o("firmware_version:", strapInfo.getMaximVersion().mo84319a()), AbstractC11266d.m30462p("is_raw_data_in_strap_or_app_backlog:", isRawDataInBacklog), AbstractC11266d.m30461o("strap_lock_state:", AbstractC32975s.m104081a(this.strapLockStateTracker))), MetricPostType.DISTRIBUTION, 1, null));
        }
    }

    @Override // yh2.InterfaceC39544c
    /* JADX INFO: renamed from: a */
    public InterfaceC13037f2 mo26279a(InterfaceC21750d strap, InterfaceC32564a priority) {
        AbstractC22676k.m65750j(strap, "strap");
        AbstractC22676k.m65750j(priority, "priority");
        WhoopStrapInfo whoopStrapInfo = strap.get_strapInfo();
        if (whoopStrapInfo == null) {
            this.logger.mo85222m("HPS submit called but strapInfo is null, skipping", new AbstractC30556a.a[0]);
            return AbstractC13091v.m36593c(new InterfaceC10278f.b.C41422b(EnumC3285a.SensorInfoNull, null, 0, null, 14, null));
        }
        String serialNumber = whoopStrapInfo.getSerialNumber();
        this.logger.mo85228t(AbstractC11266d.m30461o("HPS submit requested for device: ", serialNumber), new AbstractC30556a.a[0]);
        AbstractC10273a abstractC10273aM26262a = this.stateMachine.m26262a(serialNumber);
        if (abstractC10273aM26262a instanceof AbstractC10273a.a) {
            this.logger.mo85216g(AbstractC11895b.m31996o("HPS already in progress for device ", serialNumber, ", returning existing state flow"), new AbstractC30556a.a[0]);
            m26277p(whoopStrapInfo, this.rawDataTrackingService.mo13761c());
            return ((AbstractC10273a.a) abstractC10273aM26262a).getFlow();
        }
        if (!(abstractC10273aM26262a instanceof AbstractC10273a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        String string = UUID.randomUUID().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        String strM125866L0 = AbstractC39414r.m125866L0(4, string);
        this.logger.mo85216g(AbstractC31061c.m95640p("Starting new HPS session SensorHPS_", serialNumber, "_", strM125866L0), new AbstractC30556a.a[0]);
        boolean zMo13761c = this.rawDataTrackingService.mo13761c();
        m26278q(whoopStrapInfo, zMo13761c);
        AbstractC10273a.b bVar = (AbstractC10273a.b) abstractC10273aM26262a;
        m26273l(strap, whoopStrapInfo, serialNumber, bVar.getFlow(), priority, zMo13761c, strM125866L0);
        return bVar.getFlow();
    }

    @Override // yh2.InterfaceC39544c
    /* JADX INFO: renamed from: b */
    public InterfaceC13037f2 mo26280b(InterfaceC21750d strap, EnumC39542a type) {
        AbstractC22676k.m65750j(strap, "strap");
        AbstractC22676k.m65750j(type, "type");
        return this.watermarkTracker.m9587c(m26272k(strap), type);
    }

    public /* synthetic */ C10277e(C10276d c10276d, C3294j c3294j, InterfaceC3291g interfaceC3291g, InterfaceC3293i interfaceC3293i, InterfaceC21030c interfaceC21030c, InterfaceC4368h interfaceC4368h, InterfaceC32974r interfaceC32974r, AbstractC21909c abstractC21909c, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10276d, c3294j, interfaceC3291g, interfaceC3293i, interfaceC21030c, interfaceC4368h, interfaceC32974r, abstractC21909c, interfaceC2994c0, (i13 & 512) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SensorHistoricalPullApi") : interfaceC34116n, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C3201a(6) : interfaceC4339a);
    }
}
