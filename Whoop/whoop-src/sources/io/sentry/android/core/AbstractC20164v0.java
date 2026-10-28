package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import ih0.AbstractC18489d0;
import io.sentry.C20372i5;
import io.sentry.C20412l5;
import io.sentry.C20578u6;
import io.sentry.EnumC20393j4;
import io.sentry.EnumC20436n5;
import io.sentry.EnumC20516r1;
import io.sentry.EnumC20518r3;
import io.sentry.InterfaceC20602v0;
import io.sentry.protocol.C20499t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.v0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20164v0 {
    /* JADX INFO: renamed from: a */
    public static void m56073a(Context context, C20121k0 c20121k0, SentryAndroidOptions sentryAndroidOptions) {
        List listM56077e;
        List listM56077e2;
        List listM56077e3;
        List listM56077e4;
        AbstractC29125c.m88510S(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle bundleM56074b = m56074b(context, sentryAndroidOptions.getLogger(), c20121k0);
            InterfaceC20602v0 logger = sentryAndroidOptions.getLogger();
            if (bundleM56074b != null) {
                sentryAndroidOptions.setDebug(m56075c(bundleM56074b, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strM56079g = m56079g(bundleM56074b, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strM56079g != null) {
                        sentryAndroidOptions.setDiagnosticLevel(EnumC20436n5.valueOf(strM56079g.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(m56075c(bundleM56074b, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(m56075c(bundleM56074b, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(m56075c(bundleM56074b, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dM56076d = m56076d(bundleM56074b, logger, "io.sentry.sample-rate");
                    if (dM56076d != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dM56076d));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(m56075c(bundleM56074b, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(m56078f(bundleM56074b, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(m56075c(bundleM56074b, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                String strM56079g2 = m56079g(bundleM56074b, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zM56075c = m56075c(bundleM56074b, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zM56075c || (strM56079g2 != null && strM56079g2.isEmpty())) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strM56079g2 == null) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zM56075c);
                sentryAndroidOptions.setDsn(strM56079g2);
                sentryAndroidOptions.setEnableNdk(m56075c(bundleM56074b, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(m56075c(bundleM56074b, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                String strM56079g3 = m56079g(bundleM56074b, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (strM56079g3 != null) {
                    sentryAndroidOptions.setNativeSdkName(strM56079g3);
                }
                sentryAndroidOptions.setRelease(m56079g(bundleM56074b, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setDist(m56079g(bundleM56074b, logger, "io.sentry.dist", sentryAndroidOptions.getDist()));
                sentryAndroidOptions.setEnvironment(m56079g(bundleM56074b, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(m56078f(bundleM56074b, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) m56078f(bundleM56074b, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(m56075c(bundleM56074b, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(m56075c(bundleM56074b, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(m56075c(bundleM56074b, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(m56075c(bundleM56074b, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(m56075c(bundleM56074b, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(m56075c(bundleM56074b, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(m56075c(bundleM56074b, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(m56075c(bundleM56074b, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(m56075c(bundleM56074b, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(m56075c(bundleM56074b, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(m56075c(bundleM56074b, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (m56075c(bundleM56074b, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(EnumC20516r1.LOW);
                }
                sentryAndroidOptions.setForceInit(m56075c(bundleM56074b, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(m56075c(bundleM56074b, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(m56075c(bundleM56074b, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dM56076d2 = m56076d(bundleM56074b, logger, "io.sentry.traces.sample-rate");
                    if (dM56076d2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dM56076d2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(m56075c(bundleM56074b, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(m56075c(bundleM56074b, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(m56075c(bundleM56074b, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dM56076d3 = m56076d(bundleM56074b, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dM56076d3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dM56076d3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dM56076d4 = m56076d(bundleM56074b, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dM56076d4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dM56076d4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strM56079g4 = m56079g(bundleM56074b, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strM56079g4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(EnumC20518r3.valueOf(strM56079g4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(m56075c(bundleM56074b, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(m56075c(bundleM56074b, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(m56075c(bundleM56074b, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jM56078f = m56078f(bundleM56074b, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jM56078f != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jM56078f));
                }
                List<String> listM56077e5 = m56077e(bundleM56074b, logger, "io.sentry.traces.trace-propagation-targets");
                if (bundleM56074b.containsKey("io.sentry.traces.trace-propagation-targets") && listM56077e5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listM56077e5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listM56077e5);
                }
                sentryAndroidOptions.setEnableFramesTracking(m56075c(bundleM56074b, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(m56079g(bundleM56074b, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                C20499t sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new C20499t("", "");
                }
                String strM56080h = m56080h(bundleM56074b, logger, "io.sentry.sdk.name", sdkVersion.m56665a());
                AbstractC29125c.m88510S(strM56080h, "name is required.");
                sdkVersion.f76791w = strM56080h;
                String strM56080h2 = m56080h(bundleM56074b, logger, "io.sentry.sdk.version", sdkVersion.m56666b());
                AbstractC29125c.m88510S(strM56080h2, "version is required.");
                sdkVersion.f76792x = strM56080h2;
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(m56075c(bundleM56074b, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List listM56077e6 = m56077e(bundleM56074b, logger, "io.sentry.gradle-plugin-integrations");
                if (listM56077e6 != null) {
                    Iterator it = listM56077e6.iterator();
                    while (it.hasNext()) {
                        C20412l5.m56626d().m56627a((String) it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(m56075c(bundleM56074b, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(m56075c(bundleM56074b, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(m56075c(bundleM56074b, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(m56075c(bundleM56074b, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(m56075c(bundleM56074b, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(m56075c(bundleM56074b, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(m56078f(bundleM56074b, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().m56699k() == null) {
                    double dM56076d5 = m56076d(bundleM56074b, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dM56076d5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().m56710v(Double.valueOf(dM56076d5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().m56698j() == null) {
                    double dM56076d6 = m56076d(bundleM56074b, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dM56076d6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().m56709u(Double.valueOf(dM56076d6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().mo52171d(m56075c(bundleM56074b, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().mo52170c(m56075c(bundleM56074b, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().m56703o(m56075c(bundleM56074b, logger, "io.sentry.session-replay.debug", false));
                String strM56079g5 = m56079g(bundleM56074b, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strM56079g5 != null) {
                    if ("canvas".equals(strM56079g5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().f77073o = EnumC20393j4.CANVAS;
                    } else {
                        sentryAndroidOptions.getSessionReplay().f77073o = EnumC20393j4.PIXEL_COPY;
                    }
                }
                sentryAndroidOptions.getSessionReplay().m56702n(m56075c(bundleM56074b, logger, "io.sentry.session-replay.capture-surface-views", sentryAndroidOptions.getSessionReplay().m56700l()));
                if (sentryAndroidOptions.getSessionReplay().m56694f().isEmpty() && (listM56077e4 = m56077e(bundleM56074b, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listM56077e4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = listM56077e4.iterator();
                    while (it3.hasNext()) {
                        String strTrim = ((String) it3.next()).trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().m56705q(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().m56695g().isEmpty() && (listM56077e3 = m56077e(bundleM56074b, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listM56077e3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it4 = listM56077e3.iterator();
                    while (it4.hasNext()) {
                        String strTrim2 = ((String) it4.next()).trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().m56706r(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().m56704p(m56075c(bundleM56074b, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().m56701m()));
                if (sentryAndroidOptions.getSessionReplay().m56696h().size() == C20578u6.f77061v.size() && (listM56077e2 = m56077e(bundleM56074b, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it5 = listM56077e2.iterator();
                    while (it5.hasNext()) {
                        String strTrim3 = ((String) it5.next()).trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().m56707s(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().m56697i().size() == C20578u6.f77061v.size() && (listM56077e = m56077e(bundleM56074b, logger, "io.sentry.session-replay.network-response-headers")) != null && !listM56077e.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it6 = listM56077e.iterator();
                    while (it6.hasNext()) {
                        String strTrim4 = ((String) it6.next()).trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().m56708t(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(m56077e(bundleM56074b, logger, "io.sentry.ignored-errors"));
                List listM56077e7 = m56077e(bundleM56074b, logger, "io.sentry.in-app-includes");
                if (listM56077e7 != null && !listM56077e7.isEmpty()) {
                    Iterator it7 = listM56077e7.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppInclude((String) it7.next());
                    }
                }
                List listM56077e8 = m56077e(bundleM56074b, logger, "io.sentry.in-app-excludes");
                if (listM56077e8 != null && !listM56077e8.isEmpty()) {
                    Iterator it8 = listM56077e8.iterator();
                    while (it8.hasNext()) {
                        sentryAndroidOptions.addInAppExclude((String) it8.next());
                    }
                }
                sentryAndroidOptions.getLogs().m56575b(m56075c(bundleM56074b, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().m56574a()));
                sentryAndroidOptions.getMetrics().m56608b(m56075c(bundleM56074b, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().m56607a()));
                C20372i5 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.m56568i(m56075c(bundleM56074b, logger, "io.sentry.feedback.is-name-required", feedbackOptions.m56561b()));
                feedbackOptions.m56571l(m56075c(bundleM56074b, logger, "io.sentry.feedback.show-name", feedbackOptions.m56564e()));
                feedbackOptions.m56567h(m56075c(bundleM56074b, logger, "io.sentry.feedback.is-email-required", feedbackOptions.m56560a()));
                feedbackOptions.m56570k(m56075c(bundleM56074b, logger, "io.sentry.feedback.show-email", feedbackOptions.m56563d()));
                feedbackOptions.m56572m(m56075c(bundleM56074b, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.m56565f()));
                feedbackOptions.m56569j(m56075c(bundleM56074b, logger, "io.sentry.feedback.show-branding", feedbackOptions.m56562c()));
                feedbackOptions.m56573n(m56075c(bundleM56074b, logger, "io.sentry.feedback.use-shake-gesture", feedbackOptions.m56566g()));
                sentryAndroidOptions.setStrictTraceContinuation(m56075c(bundleM56074b, logger, "io.sentry.strict-trace-continuation.enabled", sentryAndroidOptions.isStrictTraceContinuation()));
                String strM56079g6 = m56079g(bundleM56074b, logger, "io.sentry.org-id", null);
                if (strM56079g6 != null) {
                    sentryAndroidOptions.setOrgId(strM56079g6);
                }
                sentryAndroidOptions.setEnableSpotlight(m56075c(bundleM56074b, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                String strM56079g7 = m56079g(bundleM56074b, logger, "io.sentry.spotlight.url", null);
                if (strM56079g7 != null) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(strM56079g7);
                }
                sentryAndroidOptions.getScreenshot().mo52171d(m56075c(bundleM56074b, logger, "io.sentry.screenshot.mask-all-text", false));
                sentryAndroidOptions.getScreenshot().mo52170c(m56075c(bundleM56074b, logger, "io.sentry.screenshot.mask-all-images", false));
                if (sentryAndroidOptions.getAnrProfilingSampleRate() == null) {
                    double dM56076d7 = m56076d(bundleM56074b, logger, "io.sentry.anr.profiling.sample-rate");
                    if (dM56076d7 != -1.0d) {
                        sentryAndroidOptions.setAnrProfilingSampleRate(Double.valueOf(dM56076d7));
                    }
                }
                sentryAndroidOptions.setEnableAnrFingerprinting(m56075c(bundleM56074b, logger, "io.sentry.anr.enable-fingerprinting", sentryAndroidOptions.isEnableAnrFingerprinting()));
            }
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to read configuration from android manifest metadata.", th3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m56074b(Context context, InterfaceC20602v0 interfaceC20602v0, C20121k0 c20121k0) {
        ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) AbstractC20118j0.f75582d.m56072b(context) : (ApplicationInfo) AbstractC20118j0.f75583e.m56072b(context);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m56075c(Bundle bundle, InterfaceC20602v0 interfaceC20602v0, String str, boolean z4) {
        boolean z13 = bundle.getBoolean(str, z4);
        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, str + " read: " + z13, new Object[0]);
        return z13;
    }

    /* JADX INFO: renamed from: d */
    public static double m56076d(Bundle bundle, InterfaceC20602v0 interfaceC20602v0, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: e */
    public static List m56077e(Bundle bundle, InterfaceC20602v0 interfaceC20602v0, String str) {
        String string = bundle.getString(str);
        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, AbstractC18489d0.m53370k(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static long m56078f(Bundle bundle, InterfaceC20602v0 interfaceC20602v0, String str, long j7) {
        long j13 = bundle.getInt(str, (int) j7);
        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, str + " read: " + j13, new Object[0]);
        return j13;
    }

    /* JADX INFO: renamed from: g */
    public static String m56079g(Bundle bundle, InterfaceC20602v0 interfaceC20602v0, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, AbstractC18489d0.m53370k(str, " read: ", string), new Object[0]);
        return string;
    }

    /* JADX INFO: renamed from: h */
    public static String m56080h(Bundle bundle, InterfaceC20602v0 interfaceC20602v0, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, AbstractC18489d0.m53370k(str, " read: ", string), new Object[0]);
        return string;
    }
}
