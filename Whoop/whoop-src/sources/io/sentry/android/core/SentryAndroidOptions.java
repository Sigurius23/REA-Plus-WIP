package io.sentry.android.core;

import io.sentry.C20412l5;
import io.sentry.C20513q6;
import io.sentry.android.core.internal.util.C20116q;
import io.sentry.protocol.C20499t;
import p505ts.AbstractC34132o;

/* JADX INFO: loaded from: classes5.dex */
public final class SentryAndroidOptions extends C20513q6 {
    private boolean anrEnabled;
    private Double anrProfilingSampleRate;
    private boolean anrReportInDebug;
    private long anrTimeoutIntervalMillis;
    private boolean attachAnrThreadDump;
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private InterfaceC20075f1 beforeScreenshotCaptureCallback;
    private InterfaceC20075f1 beforeViewHierarchyCaptureCallback;
    private boolean collectAdditionalContext;
    private boolean collectExternalStorageContext;
    private InterfaceC20154s0 debugImagesLoader;
    private boolean enableActivityLifecycleBreadcrumbs;
    private boolean enableActivityLifecycleTracingAutoFinish;
    private boolean enableAnrFingerprinting;
    private boolean enableAppComponentBreadcrumbs;
    private boolean enableAppLifecycleBreadcrumbs;
    private boolean enableAutoActivityLifecycleTracing;
    private boolean enableAutoTraceIdGeneration;
    private boolean enableFramesTracking;
    private boolean enableNdk;
    private boolean enableNetworkEventBreadcrumbs;
    private boolean enablePerformanceV2;
    private boolean enableRootCheck;
    private boolean enableScopeSync;
    private boolean enableSystemEventBreadcrumbs;
    private boolean enableSystemEventBreadcrumbsExtras;
    private boolean enableTombstone;
    private C20116q frameMetricsCollector;
    private String nativeSdkName;
    private EnumC20170y0 ndkHandlerStrategy;
    private boolean reportHistoricalAnrs;
    private boolean reportHistoricalTombstones;
    private final C20078g1 screenshot;
    private final long startupCrashDurationThresholdMillis;
    private long startupCrashFlushTimeoutMillis;

    public SentryAndroidOptions() {
        super(false);
        this.anrEnabled = true;
        this.anrTimeoutIntervalMillis = 5000L;
        this.anrReportInDebug = false;
        this.enableActivityLifecycleBreadcrumbs = true;
        this.enableAppLifecycleBreadcrumbs = true;
        this.enableSystemEventBreadcrumbs = true;
        this.enableAppComponentBreadcrumbs = true;
        this.enableNetworkEventBreadcrumbs = true;
        this.enableAutoActivityLifecycleTracing = true;
        this.enableActivityLifecycleTracingAutoFinish = true;
        this.debugImagesLoader = C20156t.f75722y;
        this.collectAdditionalContext = true;
        this.collectExternalStorageContext = false;
        this.startupCrashFlushTimeoutMillis = 5000L;
        this.startupCrashDurationThresholdMillis = 2000L;
        this.enableFramesTracking = true;
        this.nativeSdkName = null;
        this.enableRootCheck = true;
        this.enableNdk = true;
        this.ndkHandlerStrategy = EnumC20170y0.SENTRY_HANDLER_STRATEGY_DEFAULT;
        this.enableScopeSync = true;
        this.enableAutoTraceIdGeneration = true;
        this.enableSystemEventBreadcrumbsExtras = false;
        this.reportHistoricalAnrs = false;
        this.reportHistoricalTombstones = false;
        this.attachAnrThreadDump = false;
        this.enablePerformanceV2 = true;
        this.enableTombstone = false;
        this.screenshot = new C20078g1();
        this.enableAnrFingerprinting = true;
        setSentryClientName("sentry.java.android/8.41.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private C20499t createSdkVersion() {
        C20499t sdkVersion = getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new C20499t("sentry.java.android", "8.41.0");
        } else {
            sdkVersion.f76791w = "sentry.java.android";
            sdkVersion.f76792x = "8.41.0";
        }
        C20412l5.m56626d().m56628b("maven:io.sentry:sentry-android-core", "8.41.0");
        return sdkVersion;
    }

    public void enableAllAutoBreadcrumbs(boolean z4) {
        this.enableActivityLifecycleBreadcrumbs = z4;
        this.enableAppComponentBreadcrumbs = z4;
        this.enableSystemEventBreadcrumbs = z4;
        this.enableAppLifecycleBreadcrumbs = z4;
        this.enableNetworkEventBreadcrumbs = z4;
        setEnableUserInteractionBreadcrumbs(z4);
    }

    public Double getAnrProfilingSampleRate() {
        return this.anrProfilingSampleRate;
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public InterfaceC20075f1 getBeforeScreenshotCaptureCallback() {
        return null;
    }

    public InterfaceC20075f1 getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    public InterfaceC20154s0 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public C20116q getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public C20078g1 getScreenshot() {
        return this.screenshot;
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrProfilingEnabled() {
        Double d3 = this.anrProfilingSampleRate;
        return d3 != null && d3.doubleValue() > 0.0d;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isCollectExternalStorageContext() {
        return this.collectExternalStorageContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAnrFingerprinting() {
        return this.enableAnrFingerprinting;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableSystemEventBreadcrumbsExtras() {
        return this.enableSystemEventBreadcrumbsExtras;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public boolean isReportHistoricalTombstones() {
        return this.reportHistoricalTombstones;
    }

    public boolean isTombstoneEnabled() {
        return this.enableTombstone;
    }

    public void setAnrEnabled(boolean z4) {
        this.anrEnabled = z4;
    }

    public void setAnrProfilingSampleRate(Double d3) {
        if (AbstractC34132o.m107858C(d3, true)) {
            this.anrProfilingSampleRate = d3;
            return;
        }
        throw new IllegalArgumentException("The value " + d3 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setAnrReportInDebug(boolean z4) {
        this.anrReportInDebug = z4;
    }

    public void setAnrTimeoutIntervalMillis(long j7) {
        this.anrTimeoutIntervalMillis = j7;
    }

    public void setAttachAnrThreadDump(boolean z4) {
        this.attachAnrThreadDump = z4;
    }

    public void setAttachScreenshot(boolean z4) {
        this.attachScreenshot = z4;
    }

    public void setAttachViewHierarchy(boolean z4) {
        this.attachViewHierarchy = z4;
    }

    public void setBeforeScreenshotCaptureCallback(InterfaceC20075f1 interfaceC20075f1) {
    }

    public void setBeforeViewHierarchyCaptureCallback(InterfaceC20075f1 interfaceC20075f1) {
    }

    public void setCollectAdditionalContext(boolean z4) {
        this.collectAdditionalContext = z4;
    }

    public void setCollectExternalStorageContext(boolean z4) {
        this.collectExternalStorageContext = z4;
    }

    public void setDebugImagesLoader(InterfaceC20154s0 interfaceC20154s0) {
        if (interfaceC20154s0 == null) {
            interfaceC20154s0 = C20156t.f75722y;
        }
        this.debugImagesLoader = interfaceC20154s0;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z4) {
        this.enableActivityLifecycleBreadcrumbs = z4;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z4) {
        this.enableActivityLifecycleTracingAutoFinish = z4;
    }

    public void setEnableAnrFingerprinting(boolean z4) {
        this.enableAnrFingerprinting = z4;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z4) {
        this.enableAppComponentBreadcrumbs = z4;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z4) {
        this.enableAppLifecycleBreadcrumbs = z4;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z4) {
        this.enableAutoActivityLifecycleTracing = z4;
    }

    public void setEnableAutoTraceIdGeneration(boolean z4) {
        this.enableAutoTraceIdGeneration = z4;
    }

    public void setEnableFramesTracking(boolean z4) {
        this.enableFramesTracking = z4;
    }

    public void setEnableNdk(boolean z4) {
        this.enableNdk = z4;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z4) {
        this.enableNetworkEventBreadcrumbs = z4;
    }

    public void setEnablePerformanceV2(boolean z4) {
        this.enablePerformanceV2 = z4;
    }

    public void setEnableRootCheck(boolean z4) {
        this.enableRootCheck = z4;
    }

    public void setEnableScopeSync(boolean z4) {
        this.enableScopeSync = z4;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z4) {
        this.enableSystemEventBreadcrumbs = z4;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean z4) {
        this.enableSystemEventBreadcrumbsExtras = z4;
    }

    public void setFrameMetricsCollector(C20116q c20116q) {
        this.frameMetricsCollector = c20116q;
    }

    public void setNativeHandlerStrategy(EnumC20170y0 enumC20170y0) {
        this.ndkHandlerStrategy = enumC20170y0;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z4) {
        this.reportHistoricalAnrs = z4;
    }

    public void setReportHistoricalTombstones(boolean z4) {
        this.reportHistoricalTombstones = z4;
    }

    public void setStartupCrashFlushTimeoutMillis(long j7) {
        this.startupCrashFlushTimeoutMillis = j7;
    }

    public void setTombstoneEnabled(boolean z4) {
        this.enableTombstone = z4;
    }
}
