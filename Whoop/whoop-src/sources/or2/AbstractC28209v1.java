package or2;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.v1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "durationMillis", "a", "(J)J", "", "b", "(J)Ljava/lang/String;", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28209v1 {
    /* JADX INFO: renamed from: a */
    public static final long m85387a(long j7) {
        long j13 = j7 % 60000;
        return j13 >= 30000 ? (60000 - j13) + j7 : j7 - j13;
    }

    /* JADX INFO: renamed from: b */
    public static final String m85388b(long j7) {
        String str = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ").format(OffsetDateTime.ofInstant(Instant.ofEpochMilli(j7), ZoneOffset.UTC));
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }
}
