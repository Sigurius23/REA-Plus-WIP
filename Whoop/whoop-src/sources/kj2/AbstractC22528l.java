package kj2;

import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import p715kotlin.Metadata;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: kj2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lkotlin/time/Duration;", "a", "J", "STRESS_SYNC_TIMEOUT", "", "kotlin.jvm.PlatformType", "b", "()Ljava/lang/String;", "TIME_STAMP_ON_SYNC", "stress_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22528l {

    /* JADX INFO: renamed from: a */
    private static final long f88473a;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f88473a = DurationKt.toDuration(10, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: b */
    public static final String m65099b() {
        return DateTimeFormat.forPattern(StreamDateFormatter.DATE_FORMAT_WITHOUT_NANOSECONDS).print(DateTime.now(DateTimeZone.UTC));
    }
}
