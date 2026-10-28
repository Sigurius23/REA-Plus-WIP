package io.sentry.android.ndk;

import io.sentry.C20412l5;
import io.sentry.android.core.EnumC20170y0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.ndk.EnumC20439a;
import io.sentry.ndk.NdkOptions;
import io.sentry.protocol.C20499t;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p027b3.RunnableC2411n;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class SentryNdk {
    private static final CountDownLatch loadLibraryLatch = new CountDownLatch(1);

    static {
        new Thread(new RunnableC2411n(3), "SentryNdkLoadLibs").start();
    }

    private SentryNdk() {
    }

    public static void close() {
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            io.sentry.ndk.SentryNdk.close();
        } catch (InterruptedException e5) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e5);
        }
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        C20499t sdkVersion = sentryAndroidOptions.getSdkVersion();
        int i13 = AbstractC20178c.f75786a;
        if (sdkVersion != null) {
            C20412l5.m56626d().m56628b("maven:io.sentry:sentry-android-ndk", "8.41.0");
        }
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            String dsn = sentryAndroidOptions.getDsn();
            AbstractC29125c.m88510S(dsn, "DSN is required for sentry-ndk");
            boolean zIsDebug = sentryAndroidOptions.isDebug();
            String outboxPath = sentryAndroidOptions.getOutboxPath();
            AbstractC29125c.m88510S(outboxPath, "outbox path is required for sentry-ndk");
            NdkOptions ndkOptions = new NdkOptions(dsn, zIsDebug, outboxPath, sentryAndroidOptions.getRelease(), sentryAndroidOptions.getEnvironment(), sentryAndroidOptions.getDist(), sentryAndroidOptions.getMaxBreadcrumbs(), sentryAndroidOptions.getNativeSdkName());
            int ndkHandlerStrategy = sentryAndroidOptions.getNdkHandlerStrategy();
            if (ndkHandlerStrategy == EnumC20170y0.SENTRY_HANDLER_STRATEGY_DEFAULT.getValue()) {
                ndkOptions.setNdkHandlerStrategy(EnumC20439a.SENTRY_HANDLER_STRATEGY_DEFAULT);
            } else if (ndkHandlerStrategy == EnumC20170y0.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START.getValue()) {
                ndkOptions.setNdkHandlerStrategy(EnumC20439a.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START);
            }
            Double tracesSampleRate = sentryAndroidOptions.getTracesSampleRate();
            if (tracesSampleRate == null) {
                ndkOptions.setTracesSampleRate(0.0f);
            } else {
                ndkOptions.setTracesSampleRate(tracesSampleRate.floatValue());
            }
            io.sentry.ndk.SentryNdk.init(ndkOptions);
            if (sentryAndroidOptions.isEnableScopeSync()) {
                sentryAndroidOptions.addScopeObserver(new C20177b(sentryAndroidOptions));
            }
            sentryAndroidOptions.setDebugImagesLoader(new C20176a());
        } catch (InterruptedException e5) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        try {
            io.sentry.ndk.SentryNdk.loadNativeLibraries();
        } catch (Throwable unused) {
        }
        loadLibraryLatch.countDown();
    }
}
