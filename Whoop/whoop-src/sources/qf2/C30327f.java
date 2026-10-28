package qf2;

import ci2.InterfaceC4733b;
import com.mapbox.common.logger.LogPriority;
import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.data.remote.commons.NetworkBoundCoroutineResource;
import com.whoop.data.remote.domain.dto.SetSmartAlarmDto;
import com.whoop.data.remote.domain.dto.SmartAlarmGoalType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import com.whoop.smart.alarm.data.network.model.DefaultWakeWindowDto;
import com.whoop.smart.alarm.data.network.model.UpperTimeBound;
import ey1.AbstractC13746c;
import ey1.AbstractC13747d;
import ey1.EnumC13749f;
import ey1.EnumC13750g;
import hj0.AbstractC17355n;
import ih0.AbstractC18489d0;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import jk0.InterfaceC21750d;
import jy1.C22047a;
import kk0.C22538a;
import l83.C23454a0;
import mi1.InterfaceC25576e;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rf2.InterfaceC31359a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qf2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001E\b\u0007\u0018\u0000 &2\u00020\u0001:\u00011BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b\"\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010$H\u0086@¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010$H\u0086@¢\u0006\u0004\b&\u0010#J0\u0010-\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H\u0086@¢\u0006\u0004\b0\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010FR\u0016\u0010K\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010N\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010R\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, m65681d2 = {"Lqf2/f;", "Lhj0/n;", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "Ltd1/b;", "whoopStrap", "Lrf2/a;", "smartAlarmUserInfoDao", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "smartAlarmApi", "Lqf2/c;", "lwtResetRepository", "Liy1/c;", "metricWriter", "Lmi1/e;", "smartAlarmHapticsWrapper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lci2/b;", "whoopStrapProvider", "<init>", "(Lrr2/c;Lin2/d;Ltd1/b;Lrf2/a;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lqf2/c;Liy1/c;Lmi1/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lci2/b;)V", "Lqf2/d;", "newState", "Ll83/a0;", "p", "(Lqf2/d;Lq83/d;)Ljava/lang/Object;", "Lorg/joda/time/Instant;", "alarmTime", "", "r", "(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;", "disableAlarmOnStrap", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "l", "k", "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "alarmType", "alarmEnable", "Lorg/joda/time/DateTime;", "time", "scheduleEnabled", "q", "(Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZLorg/joda/time/DateTime;ZLq83/d;)Ljava/lang/Object;", "", "j", "a", "Ltd1/b;", "b", "Lrf2/a;", "c", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "d", "Lqf2/c;", "e", "Liy1/c;", "f", "Lmi1/e;", "g", "Lcom/whoop/data/repositories/FeatureFlagChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lci2/b;", "", "i", "Ljava/lang/String;", "strapTypeMetricTag", "qf2/f$f", "Lqf2/f$f;", "smartAlarmFetcher", "Lcom/whoop/domain/model/WhoopStrapInfo;", "n", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "o", "()Z", "isWhoopStrapReady", "Lkk0/a;", "m", "()Lkk0/a;", "strapBatteryLevel", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30327f extends AbstractC17355n {

    /* JADX INFO: renamed from: l */
    public static final int f124424l = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC31359a smartAlarmUserInfoDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SmartAlarmApi smartAlarmApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C30324c lwtResetRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC25576e smartAlarmHapticsWrapper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String strapTypeMetricTag;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final f smartAlarmFetcher;

    /* JADX INFO: renamed from: qf2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepository", m100430f = "SetSmartAlarmRepository.kt", m100431l = {87, 89, LogPriority.NONE, 101}, m100432m = "disableAlarmOnStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f124435w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f124436x;

        /* JADX INFO: renamed from: z */
        int f124438z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124436x = obj;
            this.f124438z |= Integer.MIN_VALUE;
            return C30327f.this.disableAlarmOnStrap(this);
        }
    }

    /* JADX INFO: renamed from: qf2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepository", m100430f = "SetSmartAlarmRepository.kt", m100431l = {138}, m100432m = "getDefaultWakeWindowMinutes", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f124439w;

        /* JADX INFO: renamed from: y */
        int f124441y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124439w = obj;
            this.f124441y |= Integer.MIN_VALUE;
            return C30327f.this.m92678j(this);
        }
    }

    /* JADX INFO: renamed from: qf2.f$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepository$lwtReset$2", m100430f = "SetSmartAlarmRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lqf2/d;", "<unused var>", "Lkotlin/Function1;", "Ll83/a0;", "Lcom/whoop/smart/alarm/data/repository/SetLwtTo;", "setLwtTo", "<anonymous>", "(Lqf2/d;Lkotlin/jvm/functions/Function1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f124442w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f124443x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30325d f124444y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC30325d abstractC30325d, InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f124444y = abstractC30325d;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Function1 function1 = (Function1) this.f124443x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f124442w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            function1.invoke(this.f124444y);
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(AbstractC30325d abstractC30325d, Function1 function1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(this.f124444y, interfaceC30057d);
            dVar.f124443x = function1;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qf2.f$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepository", m100430f = "SetSmartAlarmRepository.kt", m100431l = {56, 59, 69, 71}, m100432m = "setExactTimeAlarmOnStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f124445E;

        /* JADX INFO: renamed from: w */
        Object f124446w;

        /* JADX INFO: renamed from: x */
        boolean f124447x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f124448y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124448y = obj;
            this.f124445E |= Integer.MIN_VALUE;
            return C30327f.this.m92684r(null, this);
        }
    }

    /* JADX INFO: renamed from: qf2.f$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m65681d2 = {"qf2/f$f", "Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "data", "", "b", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z", "Ll83/a0;", "a", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;", "fetchFromDb", "(Lq83/d;)Ljava/lang/Object;", "fetchFromNetwork", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends NetworkBoundCoroutineResource<SmartAlarmUserInfo> {

        /* JADX INFO: renamed from: qf2.f$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepository$smartAlarmFetcher$1", m100430f = "SetSmartAlarmRepository.kt", m100431l = {155}, m100432m = "cache", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32269c {

            /* JADX INFO: renamed from: w */
            Object f124451w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f124452x;

            /* JADX INFO: renamed from: z */
            int f124454z;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f124452x = obj;
                this.f124454z |= Integer.MIN_VALUE;
                return f.this.cache(null, this);
            }
        }

        /* JADX INFO: renamed from: qf2.f$f$b */
        @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepository$smartAlarmFetcher$1", m100430f = "SetSmartAlarmRepository.kt", m100431l = {162}, m100432m = "fetchFromDb", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends AbstractC32269c {

            /* JADX INFO: renamed from: w */
            /* synthetic */ Object f124455w;

            /* JADX INFO: renamed from: y */
            int f124457y;

            public b(InterfaceC30057d<? super b> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f124455w = obj;
                this.f124457y |= Integer.MIN_VALUE;
                return f.this.fetchFromDb(this);
            }
        }

        /* JADX INFO: renamed from: qf2.f$f$c */
        @InterfaceC32271e(m100429c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepository$smartAlarmFetcher$1", m100430f = "SetSmartAlarmRepository.kt", m100431l = {171}, m100432m = "fetchFromNetwork", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c extends AbstractC32269c {

            /* JADX INFO: renamed from: w */
            /* synthetic */ Object f124458w;

            /* JADX INFO: renamed from: y */
            int f124460y;

            public c(InterfaceC30057d<? super c> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f124458w = obj;
                this.f124460y |= Integer.MIN_VALUE;
                return f.this.fetchFromNetwork(this);
            }
        }

        public f() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object cache(SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar;
            if (interfaceC30057d instanceof a) {
                aVar = (a) interfaceC30057d;
                int i13 = aVar.f124454z;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    aVar.f124454z = i13 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC30057d);
                }
            } else {
                aVar = new a(interfaceC30057d);
            }
            Object obj = aVar.f124452x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = aVar.f124454z;
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (smartAlarmUserInfo == null) {
                        throw new IllegalArgumentException("Contract violated: cache must only be called on non null data");
                    }
                    InterfaceC31359a interfaceC31359a = C30327f.this.smartAlarmUserInfoDao;
                    aVar.f124451w = null;
                    aVar.f124454z = 1;
                    if (interfaceC31359a.mo96436d(smartAlarmUserInfo, aVar) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                C30327f.this.getLogger().mo85230v("Failed to cache smart alarm info in db", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }

        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean shouldFetch(SmartAlarmUserInfo data) {
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        public Object fetchFromDb(InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d) {
            b bVar;
            if (interfaceC30057d instanceof b) {
                bVar = (b) interfaceC30057d;
                int i13 = bVar.f124457y;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    bVar.f124457y = i13 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(interfaceC30057d);
                }
            } else {
                bVar = new b(interfaceC30057d);
            }
            Object objMo96434a = bVar.f124455w;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = bVar.f124457y;
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objMo96434a);
                    InterfaceC31359a interfaceC31359a = C30327f.this.smartAlarmUserInfoDao;
                    bVar.f124457y = 1;
                    objMo96434a = interfaceC31359a.mo96434a(bVar);
                    if (objMo96434a == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objMo96434a);
                }
                C30327f.this.getLogger().mo85216g("smart alarm fetched from db: " + ((SmartAlarmUserInfo) objMo96434a), new AbstractC30556a.a[0]);
                return (SmartAlarmUserInfo) objMo96434a;
            } catch (Exception e5) {
                C30327f.this.getLogger().mo85230v("Failed to fetch smart alarm info from db", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0016  */
        @Override // com.whoop.data.remote.commons.NetworkBoundCoroutineResource
        public Object fetchFromNetwork(InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d) {
            c cVar;
            if (interfaceC30057d instanceof c) {
                cVar = (c) interfaceC30057d;
                int i13 = cVar.f124460y;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    cVar.f124460y = i13 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(interfaceC30057d);
                }
            } else {
                cVar = new c(interfaceC30057d);
            }
            c cVar2 = cVar;
            Object objM92687a = cVar2.f124458w;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = cVar2.f124460y;
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objM92687a);
                    SmartAlarmApi smartAlarmApi = C30327f.this.smartAlarmApi;
                    InterfaceC34116n logger = C30327f.this.getLogger();
                    InterfaceC31359a interfaceC31359a = C30327f.this.smartAlarmUserInfoDao;
                    InterfaceC21030c interfaceC21030c = C30327f.this.metricWriter;
                    FeatureFlagChecker featureFlagChecker = C30327f.this.featureFlagChecker;
                    cVar2.f124460y = 1;
                    objM92687a = AbstractC30328g.m92687a(smartAlarmApi, logger, interfaceC31359a, interfaceC21030c, featureFlagChecker, cVar2);
                    if (objM92687a == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objM92687a);
                }
                C30327f.this.getLogger().mo85216g("smart alarm fetched from network: " + ((SmartAlarmUserInfo) objM92687a), new AbstractC30556a.a[0]);
                return (SmartAlarmUserInfo) objM92687a;
            } catch (Exception e5) {
                C30327f.this.logRetrofitSuspendException(e5, "Failed to fetch smart alarm user info");
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30327f(InterfaceC31766c crashReporter, InterfaceC18732d dispatcherFactory, InterfaceC33704b whoopStrap, InterfaceC31359a smartAlarmUserInfoDao, SmartAlarmApi smartAlarmApi, C30324c lwtResetRepository, InterfaceC21030c metricWriter, InterfaceC25576e smartAlarmHapticsWrapper, FeatureFlagChecker featureFlagChecker, InterfaceC4733b whoopStrapProvider) {
        String strM30461o;
        EnumC32978v whoopDeviceType;
        EnumC32978v whoopDeviceType2;
        super(InterfaceC34116n.INSTANCE.m107848a("SetSmartAlarmRepository"), crashReporter, dispatcherFactory);
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        AbstractC22676k.m65750j(smartAlarmUserInfoDao, "smartAlarmUserInfoDao");
        AbstractC22676k.m65750j(smartAlarmApi, "smartAlarmApi");
        AbstractC22676k.m65750j(lwtResetRepository, "lwtResetRepository");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(smartAlarmHapticsWrapper, "smartAlarmHapticsWrapper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.whoopStrap = whoopStrap;
        this.smartAlarmUserInfoDao = smartAlarmUserInfoDao;
        this.smartAlarmApi = smartAlarmApi;
        this.lwtResetRepository = lwtResetRepository;
        this.metricWriter = metricWriter;
        this.smartAlarmHapticsWrapper = smartAlarmHapticsWrapper;
        this.featureFlagChecker = featureFlagChecker;
        this.whoopStrapProvider = whoopStrapProvider;
        WhoopStrapInfo whoopStrapInfoM92676n = m92676n();
        String codeName = null;
        if (((whoopStrapInfoM92676n == null || (whoopDeviceType2 = whoopStrapInfoM92676n.getWhoopDeviceType()) == null) ? null : whoopDeviceType2.getCodeName()) != null) {
            WhoopStrapInfo whoopStrapInfoM92676n2 = m92676n();
            if (whoopStrapInfoM92676n2 != null && (whoopDeviceType = whoopStrapInfoM92676n2.getWhoopDeviceType()) != null) {
                codeName = whoopDeviceType.getCodeName();
            }
            strM30461o = AbstractC11266d.m30461o("strap_device:", codeName);
        } else {
            strM30461o = "strap_device:unknown";
        }
        this.strapTypeMetricTag = strM30461o;
        this.smartAlarmFetcher = new f();
    }

    /* JADX INFO: renamed from: n */
    private final WhoopStrapInfo m92676n() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        if (interfaceC21750d != null) {
            return interfaceC21750d.get_strapInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    private final Object m92677p(AbstractC30325d abstractC30325d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        getLogger().mo85228t("lwtReset with " + abstractC30325d, new AbstractC30556a.a[0]);
        Object objM92669g = this.lwtResetRepository.m92669g(new d(abstractC30325d, null), interfaceC30057d);
        return objM92669g == EnumC31071a.f128113w ? objM92669g : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object disableAlarmOnStrap(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        boolean zBooleanValue;
        boolean z4;
        AbstractC30325d abstractC30325d;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f124438z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f124438z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo75197a = bVar.f124436x;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f124438z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75197a);
            InterfaceC25576e interfaceC25576e = this.smartAlarmHapticsWrapper;
            bVar.f124438z = 1;
            objMo75197a = interfaceC25576e.mo75197a(bVar);
            if (objMo75197a != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objMo75197a);
        } else {
            if (i14 == 2) {
                boolean z13 = bVar.f124435w;
                AbstractC34132o.m107864I(objMo75197a);
                zBooleanValue = z13;
                abstractC30325d = C30322a.f124400a;
                bVar.f124435w = zBooleanValue;
                bVar.f124438z = 3;
                if (m92677p(abstractC30325d, bVar) != obj) {
                    z4 = zBooleanValue;
                }
                return obj;
            }
            if (i14 == 3) {
                z4 = bVar.f124435w;
                AbstractC34132o.m107864I(objMo75197a);
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = bVar.f124435w;
                AbstractC34132o.m107864I(objMo75197a);
                getLogger().mo85228t("disable alarm command returned failure result", new AbstractC30556a.a[0]);
            }
        }
        return Boolean.valueOf(z4);
        zBooleanValue = ((Boolean) objMo75197a).booleanValue();
        if (zBooleanValue) {
            InterfaceC21030c interfaceC21030c = this.metricWriter;
            C22047a c22047a = new C22047a(0, EnumC13750g.DISABLE_ALARM.getValue(), null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("Event:", EnumC13749f.ALARM_SUCCESSFULLY_DISABLED.getValue()), this.strapTypeMetricTag), null, 17, null);
            bVar.f124435w = zBooleanValue;
            bVar.f124438z = 2;
            if (interfaceC21030c.mo58700a(c22047a, bVar) != obj) {
                abstractC30325d = C30322a.f124400a;
                bVar.f124435w = zBooleanValue;
                bVar.f124438z = 3;
                if (m92677p(abstractC30325d, bVar) != obj) {
                    z4 = zBooleanValue;
                    return Boolean.valueOf(z4);
                }
            }
        } else {
            InterfaceC21030c interfaceC21030c2 = this.metricWriter;
            C22047a c22047a2 = new C22047a(0, EnumC13750g.DISABLE_ALARM.getValue(), null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("Error:", AbstractC13746c.a.f49039x.getValue()), this.strapTypeMetricTag), null, 17, null);
            bVar.f124435w = zBooleanValue;
            bVar.f124438z = 4;
            if (interfaceC21030c2.mo58700a(c22047a2, bVar) != obj) {
                z4 = zBooleanValue;
                getLogger().mo85228t("disable alarm command returned failure result", new AbstractC30556a.a[0]);
                return Boolean.valueOf(z4);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m92678j(InterfaceC30057d<? super Integer> interfaceC30057d) {
        c cVar;
        DefaultWakeWindowDto defaultWakeWindowDto;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f124441y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f124441y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object defaultWakeWindow = cVar.f124439w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f124441y;
        int defaultWakeWindowMinutes = 60;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(defaultWakeWindow);
                SmartAlarmApi smartAlarmApi = this.smartAlarmApi;
                cVar.f124441y = 1;
                defaultWakeWindow = smartAlarmApi.getDefaultWakeWindow(cVar);
                if (defaultWakeWindow == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(defaultWakeWindow);
            }
            C29218v0 c29218v0 = (C29218v0) defaultWakeWindow;
            if (c29218v0.f118269a.f146788Q && (defaultWakeWindowDto = (DefaultWakeWindowDto) c29218v0.f118270b) != null) {
                defaultWakeWindowMinutes = defaultWakeWindowDto.getDefaultWakeWindowMinutes();
            }
        } catch (Exception e5) {
            logRetrofitSuspendException(e5, "Failed to fetch smart alarm user default window. Setting to default 60 minutes");
        }
        return new Integer(defaultWakeWindowMinutes);
    }

    /* JADX INFO: renamed from: k */
    public final Object m92679k(InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d) {
        return this.smartAlarmUserInfoDao.mo96434a(interfaceC30057d);
    }

    /* JADX INFO: renamed from: l */
    public final Object m92680l(InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d) {
        return this.smartAlarmFetcher.get(interfaceC30057d);
    }

    /* JADX INFO: renamed from: m */
    public final C22538a m92681m() {
        return this.whoopStrap.getBatteryLevel();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m92682o() {
        return this.whoopStrap.mo106484A().isReady();
    }

    /* JADX INFO: renamed from: q */
    public final Object m92683q(SmartAlarmGoalType smartAlarmGoalType, boolean z4, DateTime dateTime, boolean z13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        UpperTimeBound upperTimeBoundM25961a = UpperTimeBound.INSTANCE.m25961a(dateTime);
        return AbstractC30326e.m92670a(this, this.smartAlarmApi, this.smartAlarmUserInfoDao, getCrashReporter(), getLogger(), new SetSmartAlarmDto(upperTimeBoundM25961a.getTime(), upperTimeBoundM25961a.getOffset(), z4, smartAlarmGoalType, z13), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: r */
    public final Object m92684r(Instant instant, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        Instant instant2;
        boolean zBooleanValue;
        boolean z4;
        Instant instant3;
        Instant instant4;
        AbstractC30325d c30323b;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f124445E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f124445E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objMo75201e = eVar.f124448y;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar.f124445E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75201e);
            InterfaceC25576e interfaceC25576e = this.smartAlarmHapticsWrapper;
            long millis = instant.getMillis();
            instant2 = instant;
            eVar.f124446w = instant2;
            eVar.f124445E = 1;
            objMo75201e = interfaceC25576e.mo75201e(millis, eVar);
            if (objMo75201e != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            instant2 = (Instant) eVar.f124446w;
            AbstractC34132o.m107864I(objMo75201e);
        } else {
            if (i14 == 2) {
                boolean z13 = eVar.f124447x;
                instant4 = (Instant) eVar.f124446w;
                AbstractC34132o.m107864I(objMo75201e);
                zBooleanValue = z13;
                c30323b = new C30323b(instant4);
                eVar.f124446w = null;
                eVar.f124447x = zBooleanValue;
                eVar.f124445E = 3;
                if (m92677p(c30323b, eVar) != obj) {
                    z4 = zBooleanValue;
                }
                return obj;
            }
            if (i14 == 3) {
                z4 = eVar.f124447x;
                AbstractC34132o.m107864I(objMo75201e);
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = eVar.f124447x;
                instant3 = (Instant) eVar.f124446w;
                AbstractC34132o.m107864I(objMo75201e);
                getLogger().mo85228t("Set alarm command returned failure result when setting " + instant3, new AbstractC30556a.a[0]);
            }
        }
        return Boolean.valueOf(z4);
        zBooleanValue = ((Boolean) objMo75201e).booleanValue();
        if (zBooleanValue) {
            InterfaceC21030c interfaceC21030c = this.metricWriter;
            C22047a c22047a = new C22047a(0, EnumC13750g.ENABLE_ALARM.getValue(), null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("Event:", EnumC13749f.SUCCESSFULLY_UPDATED_STRAP.getValue()), this.strapTypeMetricTag), null, 17, null);
            eVar.f124446w = instant2;
            eVar.f124447x = zBooleanValue;
            eVar.f124445E = 2;
            if (interfaceC21030c.mo58700a(c22047a, eVar) != obj) {
                instant4 = instant2;
                c30323b = new C30323b(instant4);
                eVar.f124446w = null;
                eVar.f124447x = zBooleanValue;
                eVar.f124445E = 3;
                if (m92677p(c30323b, eVar) != obj) {
                    z4 = zBooleanValue;
                    return Boolean.valueOf(z4);
                }
            }
        } else {
            InterfaceC21030c interfaceC21030c2 = this.metricWriter;
            C22047a c22047a2 = new C22047a(0, EnumC13750g.ENABLE_ALARM.getValue(), null, AbstractC37056f.m118959K(AbstractC11266d.m30461o("Error:", AbstractC13747d.a.f49041x.getValue()), this.strapTypeMetricTag), null, 17, null);
            eVar.f124446w = instant2;
            eVar.f124447x = zBooleanValue;
            eVar.f124445E = 4;
            if (interfaceC21030c2.mo58700a(c22047a2, eVar) != obj) {
                z4 = zBooleanValue;
                instant3 = instant2;
                getLogger().mo85228t("Set alarm command returned failure result when setting " + instant3, new AbstractC30556a.a[0]);
                return Boolean.valueOf(z4);
            }
        }
        return obj;
    }
}
