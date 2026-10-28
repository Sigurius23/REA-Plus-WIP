package io.sentry.android.core;

import io.sentry.EnumC20436n5;
import io.sentry.android.core.cache.C20066b;
import io.sentry.util.InterfaceC20583e;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.android.core.p */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20135p implements InterfaceC20583e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75634w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SentryAndroidOptions f75635x;

    public /* synthetic */ C20135p(SentryAndroidOptions sentryAndroidOptions, int i13) {
        this.f75634w = i13;
        this.f75635x = sentryAndroidOptions;
    }

    @Override // io.sentry.util.InterfaceC20583e
    /* JADX INFO: renamed from: j */
    public Object mo19991j() {
        int i13 = this.f75634w;
        SentryAndroidOptions sentryAndroidOptions = this.f75635x;
        switch (i13) {
            case 0:
                return sentryAndroidOptions.getExecutorService();
            default:
                List list = C20066b.f75374L;
                String outboxPath = sentryAndroidOptions.getOutboxPath();
                boolean z4 = false;
                if (outboxPath != null) {
                    File file = new File(outboxPath, "startup_crash");
                    try {
                        boolean zExists = file.exists();
                        if (zExists && !file.delete()) {
                            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                        }
                        z4 = zExists;
                    } catch (Throwable th3) {
                        sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error reading/deleting the startup crash marker file on the disk", th3);
                    }
                    break;
                } else {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
                }
                return Boolean.valueOf(z4);
        }
    }
}
