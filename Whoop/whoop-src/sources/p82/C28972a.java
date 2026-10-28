package p82;

import ad3.AbstractC0757c;
import ad3.C0755b;
import c93.InterfaceC4351m;
import ca2.InterfaceC4368h;
import com.whoop.data.repositories.FeatureFlagChecker;
import dt0.AbstractC12358a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import l83.C23454a0;
import m83.AbstractC25247g0;
import p007a6.InterfaceC0422g;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.InterfaceC32974r;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: p82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 %2\u00020\u0001:\u0001\u0016BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lp82/a;", "", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "La6/g;", "Lf6/f;", "processNowDataStore", "Ljava/time/Clock;", "clock", "Liy1/c;", "metricWriter", "Lca2/h;", "rawDataTrackingService", "Lst0/r;", "strapLockStateTracker", "<init>", "(Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;La6/g;Ljava/time/Clock;Liy1/c;Lca2/h;Lst0/r;)V", "", "newestTimestamp", "Ll83/a0;", "a", "(JLq83/d;)Ljava/lang/Object;", "Ltr2/n;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "La6/g;", "d", "Ljava/time/Clock;", "e", "Liy1/c;", "f", "Lca2/h;", "g", "Lst0/r;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28972a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC0422g processNowDataStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC32974r strapLockStateTracker;

    /* JADX INFO: renamed from: p82.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.sensorDataUpload.ProcessNowAnalyticsReporter", m100430f = "ProcessNowAnalyticsReporter.kt", m100431l = {72, 106, 111}, m100432m = "reportAnalytics", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f117158E;

        /* JADX INFO: renamed from: F */
        Object f117159F;

        /* JADX INFO: renamed from: G */
        Object f117160G;

        /* JADX INFO: renamed from: H */
        Object f117161H;

        /* JADX INFO: renamed from: I */
        Object f117162I;

        /* JADX INFO: renamed from: J */
        Object f117163J;

        /* JADX INFO: renamed from: K */
        Object f117164K;

        /* JADX INFO: renamed from: L */
        Object f117165L;

        /* JADX INFO: renamed from: M */
        Object f117166M;

        /* JADX INFO: renamed from: N */
        /* synthetic */ Object f117167N;

        /* JADX INFO: renamed from: P */
        int f117169P;

        /* JADX INFO: renamed from: w */
        long f117170w;

        /* JADX INFO: renamed from: x */
        long f117171x;

        /* JADX INFO: renamed from: y */
        long f117172y;

        /* JADX INFO: renamed from: z */
        long f117173z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117167N = obj;
            this.f117169P |= Integer.MIN_VALUE;
            return C28972a.this.m87990a(0L, this);
        }
    }

    /* JADX INFO: renamed from: p82.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sensorDataUpload.ProcessNowAnalyticsReporter$reportAnalytics$2", m100430f = "ProcessNowAnalyticsReporter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117174w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f117175x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Map<String, String> f117176y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Map<String, String> f117177z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<String, String> map, Map<String, String> map2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117176y = map;
            this.f117177z = map2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f117176y, this.f117177z, interfaceC30057d);
            cVar.f117175x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f117175x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f117174w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(this.f117176y);
            Iterator<T> it = this.f117177z.keySet().iterator();
            while (it.hasNext()) {
                linkedHashMapM74003l0.remove((String) it.next());
            }
            if (linkedHashMapM74003l0.isEmpty()) {
                c14129a.m40229f(AbstractC12358a.m34615b());
            } else {
                C14132d c14132dM34615b = AbstractC12358a.m34615b();
                C0755b c0755b = AbstractC0757c.f2762d;
                c0755b.getClass();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                c14129a.m40230g(c14132dM34615b, c0755b.m1833d(new LinkedHashMapSerializer(stringSerializer, stringSerializer), linkedHashMapM74003l0));
            }
            return C23454a0.f92919a;
        }
    }

    public C28972a(InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker, InterfaceC0422g processNowDataStore, Clock clock, InterfaceC21030c metricWriter, InterfaceC4368h rawDataTrackingService, InterfaceC32974r strapLockStateTracker) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(processNowDataStore, "processNowDataStore");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        AbstractC22676k.m65750j(strapLockStateTracker, "strapLockStateTracker");
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.processNowDataStore = processNowDataStore;
        this.clock = clock;
        this.metricWriter = metricWriter;
        this.rawDataTrackingService = rawDataTrackingService;
        this.strapLockStateTracker = strapLockStateTracker;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0123 A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:14:0x003f, B:21:0x007a, B:47:0x011d, B:49:0x0123, B:51:0x013b, B:24:0x0087, B:31:0x00ac, B:35:0x00d0, B:36:0x00dd, B:38:0x00e3, B:40:0x00f5, B:42:0x00fd, B:43:0x0109, B:46:0x0110, B:27:0x008e), top: B:75:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x016b A[Catch: Exception -> 0x0188, TryCatch #1 {Exception -> 0x0188, blocks: (B:63:0x01f8, B:53:0x014b, B:55:0x016b, B:59:0x018d, B:65:0x0228, B:69:0x0259, B:34:0x00be), top: B:73:0x00be, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x018b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01f2 -> B:63:0x01f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m87990a(long r29, q83.InterfaceC30057d<? super l83.C23454a0> r31) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p82.C28972a.m87990a(long, q83.d):java.lang.Object");
    }
}
