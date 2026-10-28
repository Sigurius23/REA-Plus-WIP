package or2;

import android.text.format.DateUtils;
import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39421y;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: or2.u */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lor2/u;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "a", "Lzr2/a;", "getDateAndTimeProvider", "()Lzr2/a;", "b", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28204u {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    private static final DateTimeFormatter f113952c;

    /* JADX INFO: renamed from: d */
    private static final DateTimeFormatter f113953d;

    /* JADX INFO: renamed from: e */
    private static final DateTimeFormatter f113954e;

    /* JADX INFO: renamed from: f */
    private static final DateTimeFormatter f113955f;

    /* JADX INFO: renamed from: g */
    private static final DateTimeFormatter f113956g;

    /* JADX INFO: renamed from: h */
    private static final DateTimeFormatter f113957h;

    /* JADX INFO: renamed from: i */
    private static final DateTimeFormatter f113958i;

    /* JADX INFO: renamed from: j */
    private static final DateTimeFormatter f113959j;

    /* JADX INFO: renamed from: k */
    private static final DateTimeFormatter f113960k;

    /* JADX INFO: renamed from: l */
    private static final long f113961l;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: or2.u$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0011\u0010%\u001a\u00020$*\u00020#¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u0004*\u00020\u00072\u0006\u0010'\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u00101\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u0017\u00103\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R \u00105\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010\u0003\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010,R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010<¨\u0006>"}, m65681d2 = {"Lor2/u$a;", "", "<init>", "()V", "", "g", "()Ljava/lang/String;", "Lorg/joda/time/LocalDateTime;", "localDateTime", "d", "(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;", "Lorg/joda/time/LocalDate;", "localDate", "format", "a", "(Lorg/joda/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;", "d0", "d1", "", "b", "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)Z", "Lorg/joda/time/DateTime;", HttpHeaders.DATE, "pattern", "c", "(Lorg/joda/time/DateTime;Ljava/lang/String;)Ljava/lang/String;", "", "timeInMillis", "m", "(J)Z", "requestDate", "Ltr2/n;", "logger", "l", "(Ljava/lang/String;Ltr2/n;)Z", "Lorg/joda/time/DateTimeZone;", "Ljava/time/ZoneOffset;", "n", "(Lorg/joda/time/DateTimeZone;)Ljava/time/ZoneOffset;", "isUsing24HourTime", "e", "(Lorg/joda/time/LocalDateTime;ZLjava/lang/String;)Ljava/lang/String;", "Lorg/joda/time/format/DateTimeFormatter;", "TIME_FORMATTER_NO_HALF", "Lorg/joda/time/format/DateTimeFormatter;", "j", "()Lorg/joda/time/format/DateTimeFormatter;", "SYNC_TIME_PREVIOUS_DAY_FORMATTER", "i", "DATE_TIME_FORMATTER_WITH_TIME_ZONE_UTC", "f", "TIME_FORMAT_HOUR_MINUTE_SECOND", "k", "ONE_HOUR_IN_MILLIS", "J", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()J", "getONE_HOUR_IN_MILLIS$annotations", "COMPLETE_WEEK_AND_MONTH_AND_DATE_FORMAT", "TIME_FORMAT_MONTH_DATE_YEAR", "Ljava/lang/String;", "YEAR_MONTH_DATE_FORMATTER", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m85358a(LocalDate localDate, String format) {
            AbstractC22676k.m65750j(localDate, "localDate");
            AbstractC22676k.m65750j(format, "format");
            String string = localDate.toString(DateTimeFormat.forPattern(format));
            AbstractC22676k.m65749i(string, "toString(...)");
            return string;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m85359b(LocalDateTime d3, LocalDateTime d14) {
            if (AbstractC22676k.m65745e(d3, d14)) {
                return true;
            }
            return (d3 == null || d14 == null || Minutes.minutesBetween(d3, d14).getMinutes() >= 1) ? false : true;
        }

        /* JADX INFO: renamed from: c */
        public final String m85360c(DateTime date, String pattern) {
            AbstractC22676k.m65750j(date, "date");
            AbstractC22676k.m65750j(pattern, "pattern");
            String strPrint = DateTimeFormat.forPattern(pattern).print(date);
            AbstractC22676k.m65749i(strPrint, "print(...)");
            return strPrint;
        }

        /* JADX INFO: renamed from: d */
        public final String m85361d(LocalDateTime localDateTime) {
            AbstractC22676k.m65750j(localDateTime, "localDateTime");
            String str = (localDateTime.getHourOfDay() % 12 == 0 ? 12 : localDateTime.getHourOfDay() % 12) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localDateTime.getMinuteOfHour())}, 1)) + (localDateTime.getHourOfDay() < 12 ? " am" : " pm");
            AbstractC22676k.m65749i(str, "toString(...)");
            return str;
        }

        /* JADX INFO: renamed from: e */
        public final String m85362e(LocalDateTime localDateTime, boolean z4, String format) {
            AbstractC22676k.m65750j(localDateTime, "<this>");
            AbstractC22676k.m65750j(format, "format");
            if (!z4) {
                String upperCase = m85361d(localDateTime).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                return upperCase;
            }
            String str = localDateTime.getHourOfDay() + ":" + String.format(format, Arrays.copyOf(new Object[]{Integer.valueOf(localDateTime.getMinuteOfHour())}, 1));
            AbstractC22676k.m65747g(str);
            return str;
        }

        /* JADX INFO: renamed from: f */
        public final DateTimeFormatter m85363f() {
            return C28204u.f113959j;
        }

        /* JADX INFO: renamed from: g */
        public final String m85364g() {
            String str = new SimpleDateFormat("hh:mm:ss", Locale.US).format(Calendar.getInstance().getTime());
            AbstractC22676k.m65749i(str, "format(...)");
            return AbstractC39421y.m125926K(str, ":", "", false);
        }

        /* JADX INFO: renamed from: h */
        public final long m85365h() {
            return C28204u.f113961l;
        }

        /* JADX INFO: renamed from: i */
        public final DateTimeFormatter m85366i() {
            return C28204u.f113955f;
        }

        /* JADX INFO: renamed from: j */
        public final DateTimeFormatter m85367j() {
            return C28204u.f113953d;
        }

        /* JADX INFO: renamed from: k */
        public final DateTimeFormatter m85368k() {
            return C28204u.f113960k;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m85369l(String requestDate, InterfaceC34116n logger) {
            AbstractC22676k.m65750j(requestDate, "requestDate");
            if (requestDate.length() == 0) {
                return false;
            }
            try {
                return LocalDate.parse(requestDate).isEqual(LocalDate.now());
            } catch (Exception e5) {
                if (logger != null) {
                    logger.mo85230v("Unable to parse requestDate: ".concat(requestDate), e5, new AbstractC30556a.a[0]);
                }
                return false;
            }
        }

        /* JADX INFO: renamed from: m */
        public final boolean m85370m(long timeInMillis) {
            return DateUtils.isToday(timeInMillis);
        }

        /* JADX INFO: renamed from: n */
        public final ZoneOffset m85371n(DateTimeZone dateTimeZone) {
            AbstractC22676k.m65750j(dateTimeZone, "<this>");
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(dateTimeZone.getOffset(System.currentTimeMillis()) / 1000);
            AbstractC22676k.m65749i(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
            return zoneOffsetOfTotalSeconds;
        }

        private Companion() {
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("(E) h:mm aa");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
        f113952c = dateTimeFormatterForPattern;
        DateTimeFormatter dateTimeFormatterForPattern2 = DateTimeFormat.forPattern(DefaultDateFormatter.TIME_FORMAT_12H);
        AbstractC22676k.m65749i(dateTimeFormatterForPattern2, "forPattern(...)");
        f113953d = dateTimeFormatterForPattern2;
        DateTimeFormatter dateTimeFormatterForPattern3 = DateTimeFormat.forPattern("h:mma");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern3, "forPattern(...)");
        f113954e = dateTimeFormatterForPattern3;
        DateTimeFormatter dateTimeFormatterForPattern4 = DateTimeFormat.forPattern("MMM d, ");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern4, "forPattern(...)");
        f113955f = dateTimeFormatterForPattern4;
        DateTimeFormatter dateTimeFormatterForPattern5 = DateTimeFormat.forPattern("EEEE, (MM/dd)");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern5, "forPattern(...)");
        f113956g = dateTimeFormatterForPattern5;
        DateTimeFormatter dateTimeFormatterForPattern6 = DateTimeFormat.forPattern("EEEE, MMMM d");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern6, "forPattern(...)");
        f113957h = dateTimeFormatterForPattern6;
        DateTimeFormatter dateTimeFormatterForPattern7 = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern7, "forPattern(...)");
        f113958i = dateTimeFormatterForPattern7;
        DateTimeFormatter dateTimeFormatterWithZoneUTC = dateTimeFormatterForPattern7.withZoneUTC();
        AbstractC22676k.m65749i(dateTimeFormatterWithZoneUTC, "withZoneUTC(...)");
        f113959j = dateTimeFormatterWithZoneUTC;
        DateTimeFormatter dateTimeFormatterForPattern8 = DateTimeFormat.forPattern("HH:mm:ss");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern8, "forPattern(...)");
        f113960k = dateTimeFormatterForPattern8;
        f113961l = 3600000L;
    }

    public C28204u(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: renamed from: f */
    public static final String m85357f() {
        return INSTANCE.m85364g();
    }
}
