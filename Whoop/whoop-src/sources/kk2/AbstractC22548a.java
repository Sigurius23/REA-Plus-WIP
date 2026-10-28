package kk2;

import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Ljava/time/Instant;", "", "a", "(Ljava/time/Instant;)Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "getActivityTimestampFormatter", "()Ljava/time/format/DateTimeFormatter;", "activityTimestampFormatter", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22548a {

    /* JADX INFO: renamed from: a */
    private static final DateTimeFormatter f88655a;

    static {
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern(StreamDateFormatter.DATE_FORMAT).withZone(ZoneOffset.UTC);
        AbstractC22676k.m65749i(dateTimeFormatterWithZone, "withZone(...)");
        f88655a = dateTimeFormatterWithZone;
    }

    /* JADX INFO: renamed from: a */
    public static final String m65280a(Instant instant) {
        AbstractC22676k.m65750j(instant, "<this>");
        String str = f88655a.format(instant);
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }
}
