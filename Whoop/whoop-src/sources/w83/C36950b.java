package w83;

import p715kotlin.time.Clock;
import p715kotlin.time.Instant;

/* JADX INFO: renamed from: w83.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C36950b implements Clock {
    @Override // p715kotlin.time.Clock
    public final Instant now() {
        return Instant.INSTANCE.fromEpochMilliseconds(System.currentTimeMillis());
    }
}
