package io.sentry;

import java.time.Instant;

/* JADX INFO: renamed from: io.sentry.j5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20394j5 extends AbstractC20576u4 {

    /* JADX INFO: renamed from: w */
    public final Instant f76448w = Instant.now();

    @Override // io.sentry.AbstractC20576u4
    /* JADX INFO: renamed from: d */
    public final long mo56606d() {
        Instant instant = this.f76448w;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}
