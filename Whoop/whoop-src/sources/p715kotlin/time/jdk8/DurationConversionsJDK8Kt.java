package p715kotlin.time.jdk8;

import java.time.Duration;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"toKotlinDuration", "Lkotlin/time/Duration;", "Ljava/time/Duration;", "(Ljava/time/Duration;)J", "toJavaDuration", "toJavaDuration-LRDsOJo", "(J)Ljava/time/Duration;", "kotlin-stdlib-jdk8"}, m65682k = 2, m65683mv = {2, 3, 0}, m65684pn = "kotlin.time", m65685xi = 48)
public final class DurationConversionsJDK8Kt {
    /* JADX INFO: renamed from: toJavaDuration-LRDsOJo, reason: not valid java name */
    private static final Duration m134402toJavaDurationLRDsOJo(long j7) {
        Duration durationOfSeconds = Duration.ofSeconds(p715kotlin.time.Duration.m134276getInWholeSecondsimpl(j7), p715kotlin.time.Duration.m134278getNanosecondsComponentimpl(j7));
        AbstractC22676k.m65749i(durationOfSeconds, "toComponents-impl(...)");
        return durationOfSeconds;
    }

    private static final long toKotlinDuration(Duration duration) {
        AbstractC22676k.m65750j(duration, "<this>");
        return p715kotlin.time.Duration.m134291plusLRDsOJo(DurationKt.toDuration(duration.getSeconds(), DurationUnit.SECONDS), DurationKt.toDuration(duration.getNano(), DurationUnit.NANOSECONDS));
    }
}
