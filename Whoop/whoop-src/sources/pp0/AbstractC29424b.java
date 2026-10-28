package pp0;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.C39412p;

/* JADX INFO: renamed from: pp0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\"\u001c\u0010\f\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000b\"\u001c\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"", "Lorg/joda/time/LocalDateTime;", "b", "(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;", "a", "(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;", "Lyb3/p;", "Lyb3/p;", "OFFSET_SUFFIX_REGEX", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "Lorg/joda/time/format/DateTimeFormatter;", "LOCAL_FMT_WITH_MILLIS", "c", "LOCAL_FMT_NO_MILLIS", "add-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29424b {

    /* JADX INFO: renamed from: a */
    private static final C39412p f119469a = new C39412p("([Zz]|[+-]\\d{2}:?\\d{2})$");

    /* JADX INFO: renamed from: b */
    private static final DateTimeFormatter f119470b = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");

    /* JADX INFO: renamed from: c */
    private static final DateTimeFormatter f119471c = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");

    /* JADX INFO: renamed from: a */
    public static final String m89697a(LocalDateTime localDateTime) {
        AbstractC22676k.m65750j(localDateTime, "<this>");
        String string = localDateTime.toDateTime(DateTimeZone.getDefault()).toString(DateTimeRange.INSTANCE.getDateTimeFormatter().withZoneUTC());
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static final LocalDateTime m89698b(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        C39412p c39412p = f119469a;
        c39412p.getClass();
        if (c39412p.f169588w.matcher(str).find()) {
            return new LocalDateTime(DateTimeRange.INSTANCE.getDateTimeFormatter().withOffsetParsed().parseDateTime(str).toInstant().getMillis(), dateTimeZone);
        }
        LocalDateTime localDateTimeMinusMinutes = LocalDateTime.parse(str, AbstractC39414r.m125887f0(str, '.', 0, false, 6) >= 0 ? f119470b : f119471c);
        if (dateTimeZone.isLocalDateTimeGap(localDateTimeMinusMinutes)) {
            while (dateTimeZone.isLocalDateTimeGap(localDateTimeMinusMinutes)) {
                localDateTimeMinusMinutes = localDateTimeMinusMinutes.minusMinutes(1);
            }
            return new LocalDateTime(dateTimeZone.nextTransition(localDateTimeMinusMinutes.toDateTime(dateTimeZone).getMillis()), dateTimeZone);
        }
        LocalDateTime localDateTime = localDateTimeMinusMinutes.toDateTime(dateTimeZone).withLaterOffsetAtOverlap().toLocalDateTime();
        AbstractC22676k.m65747g(localDateTime);
        return localDateTime;
    }
}
