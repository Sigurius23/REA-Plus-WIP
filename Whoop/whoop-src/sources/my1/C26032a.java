package my1;

import android.os.SystemClock;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: my1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001\u001aBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, m65681d2 = {"Lmy1/a;", "", "Liy1/c;", "metricWriter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "backgroundScope", "Lrr2/c;", "crashReporter", "Lbc3/z;", "backgroundDispatcher", "Lkotlin/Function0;", "", "elapsedRealtimeProvider", "Lkotlin/Function1;", "", "Lmy1/b;", "snapshotProvider", "<init>", "(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Lrr2/c;Lbc3/z;Lc93/a;Lkotlin/jvm/functions/Function1;)V", "snapshot", "Ll83/a0;", "b", "(Lmy1/b;Lq83/d;)Ljava/lang/Object;", "level", "c", "(I)V", "a", "Liy1/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lbc3/c0;", "d", "Lrr2/c;", "e", "Lbc3/z;", "f", "Lc93/a;", "g", "Lkotlin/jvm/functions/Function1;", "", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/Map;", "lastTrimTimeByName", "i", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26032a {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 backgroundScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC3076z backgroundDispatcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC4339a elapsedRealtimeProvider;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1 snapshotProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Map<String, Long> lastTrimTimeByName;

    /* JADX INFO: renamed from: my1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final a f103000w = new a();

        public a() {
            super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
        }

        @Override // c93.InterfaceC4339a
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: my1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements Function1 {
        public b(Object obj) {
            super(1, 0, C26033b.Companion.class, obj, "capture", "capture(I)Lcom/whoop/metrics/memory/MemorySnapshot;");
        }

        /* JADX INFO: renamed from: a */
        public final C26033b m77445a(int i13) {
            return ((C26033b.Companion) this.receiver).m77450a(i13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m77445a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: my1.a$c, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0016"}, m65681d2 = {"Lmy1/a$c;", "", "<init>", "()V", "", "percent", "", "a", "(D)Ljava/lang/String;", "", "DEDUPE_WINDOW_MS", "J", "METRIC_MEMORY_PRESSURE", "Ljava/lang/String;", "METRIC_MEMORY_HEAP_PERCENT", "METRIC_MEMORY_THREAD_COUNT", "SENTRY_TAG_LAST_TRIM_LEVEL", "SENTRY_TAG_LAST_HEAP_PERCENT", "SENTRY_TAG_LAST_HEAP_PERCENT_BUCKET", "SENTRY_BREADCRUMB_MEMORY_PRESSURE", "SENTRY_BREADCRUMB_KEY_TRIM_LEVEL", "SENTRY_BREADCRUMB_KEY_HEAP_PERCENT", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m77446a(double percent) {
            if (percent < 50.0d) {
                return "low";
            }
            if (percent < 75.0d) {
                return "moderate";
            }
            return percent < 90.0d ? "high" : "critical";
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: my1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.memory.MemoryPressureHandler", m100430f = "MemoryPressureHandler.kt", m100431l = {57, 63, 71}, m100432m = "emitMetrics", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f103001w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f103002x;

        /* JADX INFO: renamed from: z */
        int f103004z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f103002x = obj;
            this.f103004z |= Integer.MIN_VALUE;
            return C26032a.this.m77443b(null, this);
        }
    }

    /* JADX INFO: renamed from: my1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.memory.MemoryPressureHandler$onTrimMemory$1", m100430f = "MemoryPressureHandler.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103005w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26033b f103007y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C26033b c26033b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f103007y = c26033b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26032a.this.new e(this.f103007y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f103005w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26032a c26032a = C26032a.this;
                C26033b c26033b = this.f103007y;
                this.f103005w = 1;
                if (c26032a.m77443b(c26033b, this) == enumC31071a) {
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

    public C26032a(InterfaceC21030c interfaceC21030c, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, InterfaceC31766c interfaceC31766c, AbstractC3076z abstractC3076z, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21030c, featureFlagChecker, interfaceC2994c0, interfaceC31766c, (i13 & 16) != 0 ? AbstractC3050q0.f12077a : abstractC3076z, (i13 & 32) != 0 ? a.f103000w : interfaceC4339a, (i13 & 64) != 0 ? new b(C26033b.INSTANCE) : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        if (r1.mo58700a(r9, r2) == r3) goto L26;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m77443b(my1.C26033b r18, q83.InterfaceC30057d<? super l83.C23454a0> r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: my1.C26032a.m77443b(my1.b, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final void m77444c(int level) {
        if (this.featureFlagChecker.isFeatureEnabled("android-oom-observability-memory")) {
            String strM77451b = C26033b.INSTANCE.m77451b(level);
            long jLongValue = ((Number) this.elapsedRealtimeProvider.invoke()).longValue();
            Long l7 = this.lastTrimTimeByName.get(strM77451b);
            if (l7 == null || jLongValue - l7.longValue() >= 60000) {
                this.lastTrimTimeByName.put(strM77451b, Long.valueOf(jLongValue));
                C26033b c26033b = (C26033b) this.snapshotProvider.invoke(Integer.valueOf(level));
                this.crashReporter.mo98624c("last_trim_level", c26033b.getTrimLevelName());
                InterfaceC31766c interfaceC31766c = this.crashReporter;
                Locale locale = Locale.US;
                interfaceC31766c.mo98624c("last_heap_percent", String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(c26033b.getHeapPercent())}, 1)));
                this.crashReporter.mo98624c("last_heap_percent_bucket", INSTANCE.m77446a(c26033b.getHeapPercent()));
                this.crashReporter.mo98628l("Memory pressure", AbstractC25247g0.m73990Y(new C23465k("trim_level", c26033b.getTrimLevelName()), new C23465k("heap_percent", String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(c26033b.getHeapPercent())}, 1)))));
                AbstractC3006f0.m8732z(this.backgroundScope, this.backgroundDispatcher, null, new e(c26033b, null), 2);
            }
        }
    }

    public C26032a(InterfaceC21030c metricWriter, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 backgroundScope, InterfaceC31766c crashReporter, AbstractC3076z backgroundDispatcher, InterfaceC4339a elapsedRealtimeProvider, Function1 snapshotProvider) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(backgroundScope, "backgroundScope");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(backgroundDispatcher, "backgroundDispatcher");
        AbstractC22676k.m65750j(elapsedRealtimeProvider, "elapsedRealtimeProvider");
        AbstractC22676k.m65750j(snapshotProvider, "snapshotProvider");
        this.metricWriter = metricWriter;
        this.featureFlagChecker = featureFlagChecker;
        this.backgroundScope = backgroundScope;
        this.crashReporter = crashReporter;
        this.backgroundDispatcher = backgroundDispatcher;
        this.elapsedRealtimeProvider = elapsedRealtimeProvider;
        this.snapshotProvider = snapshotProvider;
        this.lastTrimTimeByName = new LinkedHashMap();
    }
}
