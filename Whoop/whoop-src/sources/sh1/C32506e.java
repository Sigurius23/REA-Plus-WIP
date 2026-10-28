package sh1;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import hi1.C17315a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.util.concurrent.Executor;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rh1.C31439a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: sh1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101¨\u00064"}, m65681d2 = {"Lsh1/e;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lsh1/c;", "backgroundLocationCollector", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "lifecycleScope", "Landroid/content/Context;", "context", "Liy1/c;", "metricWriter", "Lrh1/a;", "locationPermissionAnalyticsHelper", "Lhi1/a;", "gpsUploadScheduler", "Ltr2/n;", "logger", "Lsh1/a;", "appOpsMetricWriter", "", "sdkInt", "<init>", "(Lsh1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Landroid/content/Context;Liy1/c;Lrh1/a;Lhi1/a;Ltr2/n;Lsh1/a;I)V", "Ll83/a0;", "d", "()V", "e", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "onStart", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lsh1/c;", "x", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "y", "Lbc3/c0;", "z", "Landroid/content/Context;", "E", "Liy1/c;", "F", "Lrh1/a;", "G", "Lhi1/a;", "H", "Ltr2/n;", "I", "Lsh1/a;", "J", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32506e implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C31439a locationPermissionAnalyticsHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C17315a gpsUploadScheduler;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C32502a appOpsMetricWriter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int sdkInt;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C32504c backgroundLocationCollector;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 lifecycleScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: sh1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gps.collector.GpsCollectionLifecycleHandler$handleBackgroundGpsOnStart$1", m100430f = "GpsCollectionLifecycleHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134629w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32506e.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f134629w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C32506e.this.backgroundLocationCollector.m101499j();
            C32506e.this.logger.mo85216g("GPS INIT: Collection started from onStart()", new AbstractC30556a.a[0]);
            C32506e.this.gpsUploadScheduler.m49062c();
            return C23454a0.f92919a;
        }
    }

    public C32506e(C32504c backgroundLocationCollector, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 lifecycleScope, Context context, InterfaceC21030c metricWriter, C31439a locationPermissionAnalyticsHelper, C17315a gpsUploadScheduler, InterfaceC34116n logger, C32502a appOpsMetricWriter, int i13) {
        AbstractC22676k.m65750j(backgroundLocationCollector, "backgroundLocationCollector");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(lifecycleScope, "lifecycleScope");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(locationPermissionAnalyticsHelper, "locationPermissionAnalyticsHelper");
        AbstractC22676k.m65750j(gpsUploadScheduler, "gpsUploadScheduler");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(appOpsMetricWriter, "appOpsMetricWriter");
        this.backgroundLocationCollector = backgroundLocationCollector;
        this.featureFlagChecker = featureFlagChecker;
        this.lifecycleScope = lifecycleScope;
        this.context = context;
        this.metricWriter = metricWriter;
        this.locationPermissionAnalyticsHelper = locationPermissionAnalyticsHelper;
        this.gpsUploadScheduler = gpsUploadScheduler;
        this.logger = logger;
        this.appOpsMetricWriter = appOpsMetricWriter;
        this.sdkInt = i13;
    }

    /* JADX INFO: renamed from: d */
    private final void m101506d() {
        if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ANDROID_BACKGROUND_GPS_COLLECTION)) {
            this.logger.mo85216g("GPS LIFECYCLE: Background feature flag disabled", new AbstractC30556a.a[0]);
            if (this.backgroundLocationCollector.m101497h()) {
                this.backgroundLocationCollector.m101500l();
                this.logger.mo85216g("GPS LIFECYCLE: Stopped collection due to disabled feature flag", new AbstractC30556a.a[0]);
                return;
            }
            return;
        }
        boolean zM101497h = this.backgroundLocationCollector.m101497h();
        boolean zM101498i = this.backgroundLocationCollector.m101498i();
        this.logger.mo85216g("GPS LIFECYCLE: onStart() - isCollecting = " + zM101497h + ", shouldCollect = " + zM101498i, new AbstractC30556a.a[0]);
        if (zM101497h && !zM101498i) {
            this.backgroundLocationCollector.m101500l();
            this.logger.mo85216g("GPS LIFECYCLE: Stopped collection - permissions revoked or conditions changed", new AbstractC30556a.a[0]);
        }
        if (zM101497h || !zM101498i) {
            return;
        }
        AbstractC3006f0.m8732z(this.lifecycleScope, null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: e */
    private final void m101507e() {
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ANDROID_FOREGROUND_GPS_COLLECTION)) {
            this.gpsUploadScheduler.m49062c();
            this.backgroundLocationCollector.m101496g();
            this.locationPermissionAnalyticsHelper.m96772b();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ANDROID_BACKGROUND_GPS_COLLECTION);
        boolean zIsFeatureEnabled2 = this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ANDROID_FOREGROUND_GPS_COLLECTION);
        if (zIsFeatureEnabled || zIsFeatureEnabled2) {
            AppOpsManager appOpsManager = (AppOpsManager) this.context.getSystemService(AppOpsManager.class);
            Executor mainExecutor = this.context.getMainExecutor();
            AbstractC22676k.m65749i(mainExecutor, "getMainExecutor(...)");
            new C32503b(appOpsManager, mainExecutor, this.appOpsMetricWriter, this.sdkInt).m101486b();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m101506d();
        m101507e();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    public /* synthetic */ C32506e(C32504c c32504c, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, Context context, InterfaceC21030c interfaceC21030c, C31439a c31439a, C17315a c17315a, InterfaceC34116n interfaceC34116n, C32502a c32502a, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC21030c interfaceC21030c2;
        C32502a c32502a2;
        InterfaceC34116n interfaceC34116nM107848a = (i14 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("GpsCollectionLifecycleHandler") : interfaceC34116n;
        if ((i14 & 256) != 0) {
            interfaceC21030c2 = interfaceC21030c;
            c32502a2 = new C32502a(interfaceC21030c2);
        } else {
            interfaceC21030c2 = interfaceC21030c;
            c32502a2 = c32502a;
        }
        this(c32504c, featureFlagChecker, interfaceC2994c0, context, interfaceC21030c2, c31439a, c17315a, interfaceC34116nM107848a, c32502a2, (i14 & 512) != 0 ? Build.VERSION.SDK_INT : i13);
    }
}
