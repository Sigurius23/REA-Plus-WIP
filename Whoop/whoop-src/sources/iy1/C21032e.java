package iy1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.metrics.domain.MetricsApi;
import com.whoop.metrics.domain.models.MetricDto;
import com.whoop.metrics.domain.models.MetricPostType;
import com.whoop.metrics.domain.models.MetricsBody;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jy1.C22047a;
import jy1.InterfaceC22048b;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: iy1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u001d2\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0013*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b)\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, m65681d2 = {"Liy1/e;", "Liy1/c;", "Lcom/whoop/metrics/domain/MetricsApi;", "api", "Ljy1/b;", "metricDao", "Ltr2/n;", "logger", "", "appVersionName", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "applicationScope", "<init>", "(Lcom/whoop/metrics/domain/MetricsApi;Ljy1/b;Ltr2/n;Ljava/lang/String;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "Liy1/d;", "k", "(Lq83/d;)Ljava/lang/Object;", "", "Ljy1/a;", "metrics", "Lcom/whoop/metrics/domain/models/MetricPostType;", "metricPostType", "Lu02/a;", "Lpg3/v0;", "Ll83/a0;", "j", "(Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;Lq83/d;)Ljava/lang/Object;", "g", "()Ljava/lang/String;", "Lcom/whoop/metrics/domain/models/MetricDto;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;)Ljava/util/List;", "metric", "i", "(Ljy1/a;)Ljy1/a;", "a", "(Ljy1/a;Lq83/d;)Ljava/lang/Object;", "b", "(Ljy1/a;)V", "l", "Lcom/whoop/metrics/domain/MetricsApi;", "Ljy1/b;", "c", "Ltr2/n;", "d", "Ljava/lang/String;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "Lbc3/c0;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21032e implements InterfaceC21030c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MetricsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC22048b metricDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String appVersionName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationScope;

    /* JADX INFO: renamed from: iy1.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.domain.MetricsInteractor", m100430f = "MetricsInteractor.kt", m100431l = {42}, m100432m = "insertMetricToCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f79629w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f79630x;

        /* JADX INFO: renamed from: z */
        int f79632z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79630x = obj;
            this.f79632z |= Integer.MIN_VALUE;
            return C21032e.this.mo58700a(null, this);
        }
    }

    /* JADX INFO: renamed from: iy1.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.domain.MetricsInteractor$insertMetricToCacheAsync$1", m100430f = "MetricsInteractor.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79633w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22047a f79635y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C22047a c22047a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f79635y = c22047a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21032e.this.new c(this.f79635y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79633w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21032e c21032e = C21032e.this;
                C22047a c22047a = this.f79635y;
                this.f79633w = 1;
                if (c21032e.mo58700a(c22047a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: iy1.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.domain.MetricsInteractor$postMetrics$2", m100430f = "MetricsInteractor.kt", m100431l = {117}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f79636w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ MetricPostType f79638y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<C22047a> f79639z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MetricPostType metricPostType, List<C22047a> list, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f79638y = metricPostType;
            this.f79639z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21032e.this.new d(this.f79638y, this.f79639z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79636w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MetricsApi metricsApi = C21032e.this.api;
            String strM58706g = C21032e.this.m58706g();
            String lowerCase = this.f79638y.name().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            MetricsBody metricsBody = new MetricsBody((String) null, C21032e.this.m58707h(this.f79639z), 1, (DefaultConstructorMarker) null);
            this.f79636w = 1;
            Object objPostMetrics = metricsApi.postMetrics(strM58706g, lowerCase, metricsBody, this);
            return objPostMetrics == enumC31071a ? enumC31071a : objPostMetrics;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: iy1.e$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.domain.MetricsInteractor", m100430f = "MetricsInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 90, 93}, m100432m = "uploadBatch", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f79640E;

        /* JADX INFO: renamed from: F */
        int f79641F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f79642G;

        /* JADX INFO: renamed from: I */
        int f79644I;

        /* JADX INFO: renamed from: w */
        Object f79645w;

        /* JADX INFO: renamed from: x */
        Object f79646x;

        /* JADX INFO: renamed from: y */
        Object f79647y;

        /* JADX INFO: renamed from: z */
        Object f79648z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79642G = obj;
            this.f79644I |= Integer.MIN_VALUE;
            return C21032e.this.m58710k(this);
        }
    }

    /* JADX INFO: renamed from: iy1.e$f */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.domain.MetricsInteractor", m100430f = "MetricsInteractor.kt", m100431l = {65}, m100432m = "uploadMetrics", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f79649E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f79650F;

        /* JADX INFO: renamed from: H */
        int f79652H;

        /* JADX INFO: renamed from: w */
        int f79653w;

        /* JADX INFO: renamed from: x */
        int f79654x;

        /* JADX INFO: renamed from: y */
        int f79655y;

        /* JADX INFO: renamed from: z */
        int f79656z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79650F = obj;
            this.f79652H |= Integer.MIN_VALUE;
            return C21032e.this.m58711l(this);
        }
    }

    public C21032e(MetricsApi api, InterfaceC22048b metricDao, InterfaceC34116n logger, String appVersionName, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 applicationScope) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(metricDao, "metricDao");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(appVersionName, "appVersionName");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        this.api = api;
        this.metricDao = metricDao;
        this.logger = logger;
        this.appVersionName = appVersionName;
        this.featureFlagChecker = featureFlagChecker;
        this.applicationScope = applicationScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final String m58706g() {
        return "token mobile-metrics-shared-secret";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final List<MetricDto> m58707h(List<C22047a> list) {
        List<C22047a> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C22047a c22047a : list2) {
            String name = c22047a.getName();
            Double value = c22047a.getValue();
            arrayList.add(new MetricDto(name, value != null ? value.doubleValue() : 1.0d, c22047a.m63105f()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private final C22047a m58708i(C22047a metric) {
        if (!this.featureFlagChecker.isFeatureEnabled("metrics-app-version-name-android") || AbstractC39414r.m125890i0(this.appVersionName)) {
            return metric;
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(metric.m63105f());
        arrayListM74097F1.add("appversion:" + this.appVersionName);
        return C22047a.m63100b(metric, 0, null, null, arrayListM74097F1, null, 23, null);
    }

    /* JADX INFO: renamed from: j */
    private final Object m58709j(List<C22047a> list, MetricPostType metricPostType, InterfaceC30057d<? super InterfaceC34385a<C29218v0<C23454a0>>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, "Failed to post metrics to data dog ", new d(metricPostType, list, null), interfaceC30057d, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4 A[Catch: Exception -> 0x0047, TryCatch #1 {Exception -> 0x0047, blocks: (B:14:0x0041, B:49:0x00de, B:51:0x00e4, B:55:0x010e, B:57:0x0114, B:64:0x014c, B:66:0x0150, B:67:0x016f, B:68:0x0174, B:62:0x012d, B:70:0x0177, B:71:0x017a, B:23:0x006c, B:24:0x0071, B:30:0x0086, B:32:0x008e, B:34:0x0091, B:35:0x009e, B:37:0x00a4, B:39:0x00b1, B:44:0x00c1, B:46:0x00c7, B:47:0x00cf, B:40:0x00b4, B:42:0x00ba, B:43:0x00bf, B:48:0x00d5, B:27:0x0078), top: B:77:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x014c A[Catch: Exception -> 0x0047, TryCatch #1 {Exception -> 0x0047, blocks: (B:14:0x0041, B:49:0x00de, B:51:0x00e4, B:55:0x010e, B:57:0x0114, B:64:0x014c, B:66:0x0150, B:67:0x016f, B:68:0x0174, B:62:0x012d, B:70:0x0177, B:71:0x017a, B:23:0x006c, B:24:0x0071, B:30:0x0086, B:32:0x008e, B:34:0x0091, B:35:0x009e, B:37:0x00a4, B:39:0x00b1, B:44:0x00c1, B:46:0x00c7, B:47:0x00cf, B:40:0x00b4, B:42:0x00ba, B:43:0x00bf, B:48:0x00d5, B:27:0x0078), top: B:77:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0150 A[Catch: Exception -> 0x0047, TryCatch #1 {Exception -> 0x0047, blocks: (B:14:0x0041, B:49:0x00de, B:51:0x00e4, B:55:0x010e, B:57:0x0114, B:64:0x014c, B:66:0x0150, B:67:0x016f, B:68:0x0174, B:62:0x012d, B:70:0x0177, B:71:0x017a, B:23:0x006c, B:24:0x0071, B:30:0x0086, B:32:0x008e, B:34:0x0091, B:35:0x009e, B:37:0x00a4, B:39:0x00b1, B:44:0x00c1, B:46:0x00c7, B:47:0x00cf, B:40:0x00b4, B:42:0x00ba, B:43:0x00bf, B:48:0x00d5, B:27:0x0078), top: B:77:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x016f A[Catch: Exception -> 0x0047, TryCatch #1 {Exception -> 0x0047, blocks: (B:14:0x0041, B:49:0x00de, B:51:0x00e4, B:55:0x010e, B:57:0x0114, B:64:0x014c, B:66:0x0150, B:67:0x016f, B:68:0x0174, B:62:0x012d, B:70:0x0177, B:71:0x017a, B:23:0x006c, B:24:0x0071, B:30:0x0086, B:32:0x008e, B:34:0x0091, B:35:0x009e, B:37:0x00a4, B:39:0x00b1, B:44:0x00c1, B:46:0x00c7, B:47:0x00cf, B:40:0x00b4, B:42:0x00ba, B:43:0x00bf, B:48:0x00d5, B:27:0x0078), top: B:77:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x014a -> B:49:0x00de). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: k */
    public final java.lang.Object m58710k(q83.InterfaceC30057d<? super iy1.InterfaceC21031d> r15) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iy1.C21032e.m58710k(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iy1.InterfaceC21030c
    /* JADX INFO: renamed from: a */
    public Object mo58700a(C22047a c22047a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f79632z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f79632z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f79630x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f79632z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC22048b interfaceC22048b = this.metricDao;
                C22047a c22047aM58708i = m58708i(c22047a);
                bVar.f79629w = null;
                bVar.f79632z = 1;
                if (interfaceC22048b.mo63107a(c22047aM58708i, bVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(bVar.getContext());
            this.logger.mo85230v("Failed to insert into data dog metrics Room DB", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    @Override // iy1.InterfaceC21030c
    /* JADX INFO: renamed from: b */
    public void mo58701b(C22047a metric) {
        AbstractC22676k.m65750j(metric, "metric");
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new c(metric, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:23:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: l */
    public final java.lang.Object m58711l(q83.InterfaceC30057d<? super iy1.InterfaceC21031d> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof iy1.C21032e.f
            if (r0 == 0) goto L13
            r0 = r9
            iy1.e$f r0 = (iy1.C21032e.f) r0
            int r1 = r0.f79652H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79652H = r1
            goto L18
        L13:
            iy1.e$f r0 = new iy1.e$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f79650F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f79652H
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r2 = r0.f79654x
            int r5 = r0.f79653w
            java.lang.Object r6 = r0.f79649E
            kotlin.jvm.internal.g0 r6 = (p715kotlin.jvm.internal.C22669g0) r6
            p505ts.AbstractC34132o.m107864I(r9)
            goto L6a
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            p505ts.AbstractC34132o.m107864I(r9)
            com.whoop.data.repositories.FeatureFlagChecker r9 = r8.featureFlagChecker
            java.lang.String r2 = "droid-metrics-multi-batch-upload"
            boolean r9 = r9.isFeatureEnabled(r2)
            if (r9 == 0) goto L48
            r9 = 10
            goto L49
        L48:
            r9 = r4
        L49:
            kotlin.jvm.internal.g0 r2 = new kotlin.jvm.internal.g0
            r2.<init>()
            iy1.d$a r5 = iy1.InterfaceC21031d.a.f79619a
            r2.f89336w = r5
            r5 = r9
            r6 = r2
            r2 = r3
        L55:
            if (r2 >= r5) goto L84
            r0.f79649E = r6
            r0.f79653w = r5
            r0.f79654x = r2
            r0.f79655y = r2
            r0.f79656z = r3
            r0.f79652H = r4
            java.lang.Object r9 = r8.m58710k(r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            iy1.d r9 = (iy1.InterfaceC21031d) r9
            iy1.d$b r7 = iy1.InterfaceC21031d.b.f79620a
            boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r9, r7)
            if (r7 == 0) goto L75
            return r9
        L75:
            iy1.d$a r7 = iy1.InterfaceC21031d.a.f79619a
            boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r9, r7)
            if (r7 == 0) goto L80
            java.lang.Object r9 = r6.f89336w
            return r9
        L80:
            r6.f89336w = r9
            int r2 = r2 + r4
            goto L55
        L84:
            java.lang.Object r9 = r6.f89336w
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: iy1.C21032e.m58711l(q83.d):java.lang.Object");
    }
}
