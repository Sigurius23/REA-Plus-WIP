package fi1;

import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fi1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"", "", "b", "(J)Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "a", "Ljava/time/format/DateTimeFormatter;", "UTC_TIMESTAMP_FORMATTER", "gps-tracking_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14523d {

    /* JADX INFO: renamed from: a */
    private static final DateTimeFormatter f53070a;

    static {
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern(StreamDateFormatter.DATE_FORMAT).withZone(ZoneOffset.UTC);
        AbstractC22676k.m65749i(dateTimeFormatterWithZone, "withZone(...)");
        f53070a = dateTimeFormatterWithZone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m41441b(long j7) {
        String str = f53070a.format(Instant.ofEpochMilli(j7));
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }
}
