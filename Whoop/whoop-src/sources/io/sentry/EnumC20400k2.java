package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.k2 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20400k2 implements InterfaceC20409l2 {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    @Override // io.sentry.InterfaceC20409l2
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
