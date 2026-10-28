package ug;

import java.time.Instant;
import p499t9.C33647p;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: ug.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC34914c {
    /* JADX INFO: renamed from: a */
    public static final C34913b m110116a(C33647p c33647p, long j7) {
        long j13 = 1000;
        long j14 = j7 / j13;
        return C33647p.m106271n((int) ((j7 - (j13 * j14)) * ((long) DurationKt.NANOS_IN_MILLIS)), j14);
    }

    /* JADX INFO: renamed from: b */
    public static final long m110117b(C34913b c34913b) {
        AbstractC22676k.m65750j(c34913b, "<this>");
        Instant instant = c34913b.f147018w;
        return (instant.getEpochSecond() * ((long) 1000)) + ((long) (instant.getNano() / DurationKt.NANOS_IN_MILLIS));
    }

    /* JADX INFO: renamed from: c */
    public static final long m110118c(C34913b c34913b, C34913b c34913b2) {
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(m110117b(c34913b2) - m110117b(c34913b), DurationUnit.MILLISECONDS);
    }
}
