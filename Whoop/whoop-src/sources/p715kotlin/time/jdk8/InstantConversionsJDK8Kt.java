package p715kotlin.time.jdk8;

import java.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, m65681d2 = {"toJavaInstant", "Ljava/time/Instant;", "Lkotlin/time/Instant;", "toKotlinInstant", "kotlin-stdlib-jdk8"}, m65682k = 2, m65683mv = {2, 3, 0}, m65684pn = "kotlin.time", m65685xi = 48)
public final class InstantConversionsJDK8Kt {
    public static final Instant toJavaInstant(p715kotlin.time.Instant instant) {
        AbstractC22676k.m65750j(instant, "<this>");
        Instant instantOfEpochSecond = Instant.ofEpochSecond(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
        AbstractC22676k.m65749i(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    public static final p715kotlin.time.Instant toKotlinInstant(Instant instant) {
        AbstractC22676k.m65750j(instant, "<this>");
        return p715kotlin.time.Instant.INSTANCE.fromEpochSeconds(instant.getEpochSecond(), instant.getNano());
    }
}
