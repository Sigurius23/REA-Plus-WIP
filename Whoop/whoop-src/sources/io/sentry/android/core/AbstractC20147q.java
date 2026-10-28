package io.sentry.android.core;

import ad3.C0783z;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import io.sentry.EnumC20436n5;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C20584f;
import p037bu.C3632c;
import p437qt.C30582e;

/* JADX INFO: renamed from: io.sentry.android.core.q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20147q {
    /* JADX INFO: renamed from: a */
    public static void m56049a(Context context, SentryAndroidOptions sentryAndroidOptions, C20121k0 c20121k0, C30582e c30582e, C20067d c20067d, boolean z4, boolean z13, boolean z14, boolean z15) {
        C20584f c20584f = new C20584f(new C20135p(sentryAndroidOptions, 1));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C3632c(new C20135p(sentryAndroidOptions, 2)), c20584f));
        sentryAndroidOptions.addIntegration(new NdkIntegration(C30582e.m93820o(sentryAndroidOptions.getLogger(), "io.sentry.android.ndk.SentryNdk")));
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
        }
        sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration(0));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C0783z(new C20135p(sentryAndroidOptions, 2), 16), c20584f));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(i13 >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context));
        sentryAndroidOptions.addIntegration(new AnrProfilingIntegration());
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, c20121k0, c20067d));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application));
            sentryAndroidOptions.addIntegration(new FeedbackShakeIntegration(application));
            if (z4) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z13) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, c20121k0));
        if (z14) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context);
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z15) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().getClass();
    }
}
