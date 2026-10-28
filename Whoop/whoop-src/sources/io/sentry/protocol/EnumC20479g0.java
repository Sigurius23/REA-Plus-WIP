package io.sentry.protocol;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.protocol.g0 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20479g0 {
    CUSTOM,
    URL,
    ROUTE,
    VIEW,
    COMPONENT,
    TASK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
