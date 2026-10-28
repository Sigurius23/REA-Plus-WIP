package com.whoop.p069ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import java.util.Arrays;
import java.util.Locale;
import or2.C28221z1;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uv0.AbstractC35283c;

/* JADX INFO: renamed from: com.whoop.ui.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#\u001a\u0015\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010)\u001a\u00020(*\u00020(H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001d\u0010-\u001a\u00020,2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.\u001a\u0015\u0010/\u001a\u00020\u00022\u0006\u0010 \u001a\u00020$¢\u0006\u0004\b/\u0010'\"\u001c\u00103\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102\"\u001c\u00104\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102\"\u001c\u00107\u001a\n 1*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00106\"\u001c\u00108\u001a\n 1*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106\"\u001c\u00109\u001a\n 1*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00106\"\u001c\u0010:\u001a\n 1*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00106\"\u001c\u0010;\u001a\n 1*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00106\"\u001c\u0010<\u001a\n 1*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00106\"\u0014\u0010=\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106\" \u0010B\u001a\u0002058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?¨\u0006C"}, m65681d2 = {"Lorg/joda/time/LocalTime;", "time", "", "d", "(Lorg/joda/time/LocalTime;)Ljava/lang/String;", "i", "", "lowerCase", "a", "(Lorg/joda/time/LocalTime;Z)Ljava/lang/String;", "Lorg/joda/time/LocalDateTime;", "j", "(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;", HttpHeaders.DATE, "Lorg/joda/time/LocalDate;", "m", "(Ljava/lang/String;)Lorg/joda/time/LocalDate;", "timestamp", "n", "(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;", "Lor2/z1;", AttachmentExtensionsKt.EXTRA_DURATION, "c", "(Lor2/z1;)Ljava/lang/String;", "", "periodMillis", "b", "(Ljava/lang/Long;)Ljava/lang/String;", "e", "Landroid/content/Context;", "context", "", "percentage", "Landroid/text/Spannable;", "f", "(Landroid/content/Context;I)Landroid/text/Spannable;", "", "score", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(D)Ljava/lang/String;", "Ljava/util/Locale;", "o", "(Ljava/util/Locale;)Ljava/util/Locale;", "is24Hour", "Landroid/text/SpannableStringBuilder;", "l", "(Lorg/joda/time/LocalTime;Z)Landroid/text/SpannableStringBuilder;", "g", "Lorg/joda/time/format/PeriodFormatter;", "kotlin.jvm.PlatformType", "Lorg/joda/time/format/PeriodFormatter;", "HOUR_MINUTE_PERIOD_FORMATTER", "MINUTE_SECOND_PERIOD_FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "Lorg/joda/time/format/DateTimeFormatter;", "TIME_FORMATTER", "TIME_FORMATTER_NO_HALF", "TIME_FORMATTER_NO_HALF_24_HOUR", "TIME_FORMATTER_JUST_HALF", "TIME_FORMATTER_JUST_HOURS", "DATE_TIME_FORMATTER_NO_YEAR", "CYCLE_DATE_FORMATTER", "k", "()Lorg/joda/time/format/DateTimeFormatter;", "getISO_DATE_TIME_FORMATTER$annotations", "()V", "ISO_DATE_TIME_FORMATTER", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10538f {

    /* JADX INFO: renamed from: a */
    private static final PeriodFormatter f31959a = new PeriodFormatterBuilder().printZeroAlways().appendHours().appendSuffix(":").minimumPrintedDigits(2).appendMinutes().toFormatter();

    /* JADX INFO: renamed from: b */
    private static final PeriodFormatter f31960b = new PeriodFormatterBuilder().printZeroAlways().appendMinutes().appendSuffix(":").minimumPrintedDigits(2).appendSeconds().toFormatter();

    /* JADX INFO: renamed from: c */
    private static final DateTimeFormatter f31961c = DateTimeFormat.forPattern("h:mma");

    /* JADX INFO: renamed from: d */
    private static final DateTimeFormatter f31962d = DateTimeFormat.forPattern("h:mm");

    /* JADX INFO: renamed from: e */
    private static final DateTimeFormatter f31963e = DateTimeFormat.forPattern(DefaultDateFormatter.TIME_FORMAT_24H);

    /* JADX INFO: renamed from: f */
    private static final DateTimeFormatter f31964f = DateTimeFormat.forPattern("a");

    /* JADX INFO: renamed from: g */
    private static final DateTimeFormatter f31965g = DateTimeFormat.forPattern("ha");

    /* JADX INFO: renamed from: h */
    private static final DateTimeFormatter f31966h = DateTimeFormat.forPattern("MMMM d, h:mma");

    /* JADX INFO: renamed from: i */
    private static final DateTimeFormatter f31967i;

    /* JADX INFO: renamed from: j */
    private static final DateTimeFormatter f31968j;

    static {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        AbstractC22676k.m65749i(dateTimeFormatterForPattern, "forPattern(...)");
        f31967i = dateTimeFormatterForPattern;
        DateTimeFormatter dateTimeFormatterWithZoneUTC = DateTimeFormat.forPattern(StreamDateFormatter.DATE_FORMAT).withZoneUTC();
        AbstractC22676k.m65749i(dateTimeFormatterWithZoneUTC, "withZoneUTC(...)");
        f31968j = dateTimeFormatterWithZoneUTC;
    }

    /* JADX INFO: renamed from: a */
    private static final String m27176a(LocalTime localTime, boolean z4) {
        String strPrint = f31964f.print(localTime);
        if (!z4) {
            AbstractC22676k.m65747g(strPrint);
            return strPrint;
        }
        AbstractC22676k.m65747g(strPrint);
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65749i(locale, "getDefault(...)");
        String lowerCase = strPrint.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: b */
    public static final String m27177b(Long l7) {
        if (l7 == null) {
            return "--:--";
        }
        String strPrint = f31959a.print(new Period(l7.longValue()));
        AbstractC22676k.m65747g(strPrint);
        return strPrint;
    }

    /* JADX INFO: renamed from: c */
    public static final String m27178c(C28221z1 c28221z1) {
        return m27177b(c28221z1 != null ? Long.valueOf(c28221z1.m85451b()) : null);
    }

    /* JADX INFO: renamed from: d */
    private static final String m27179d(LocalTime localTime) {
        String strPrint = f31962d.print(localTime);
        AbstractC22676k.m65749i(strPrint, "print(...)");
        return strPrint;
    }

    /* JADX INFO: renamed from: e */
    public static final String m27180e(Long l7) {
        if (l7 == null) {
            return "--:--";
        }
        String strPrint = f31960b.print(new Period(l7.longValue()));
        AbstractC22676k.m65747g(strPrint);
        return strPrint;
    }

    /* JADX INFO: renamed from: f */
    public static final Spannable m27181f(Context context, int i13) {
        AbstractC22676k.m65750j(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i13 < 0) {
            spannableStringBuilder.append((CharSequence) context.getString(AbstractC35283c.f150174L));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) String.valueOf(i13));
        spannableStringBuilder.append((CharSequence) "%");
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.55f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public static final String m27182g(double d3) {
        return String.format(Locale.getDefault(), "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1)).concat("%");
    }

    /* JADX INFO: renamed from: h */
    public static final String m27183h(double d3) {
        Locale localeM27190o = Locale.getDefault();
        if (AbstractC22676k.m65745e(localeM27190o.getLanguage(), "ar")) {
            localeM27190o = m27190o(localeM27190o);
        }
        return String.format(localeM27190o, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
    }

    /* JADX INFO: renamed from: i */
    private static final String m27184i(LocalTime localTime) {
        String strPrint = f31963e.print(localTime);
        AbstractC22676k.m65749i(strPrint, "print(...)");
        return strPrint;
    }

    /* JADX INFO: renamed from: j */
    public static final String m27185j(LocalDateTime time) {
        AbstractC22676k.m65750j(time, "time");
        if (AbstractC22676k.m65745e(time.toLocalDate(), LocalDate.now())) {
            String strPrint = f31961c.print(time);
            AbstractC22676k.m65747g(strPrint);
            return strPrint;
        }
        String strPrint2 = f31966h.print(time);
        AbstractC22676k.m65747g(strPrint2);
        return strPrint2;
    }

    /* JADX INFO: renamed from: k */
    public static final DateTimeFormatter m27186k() {
        return f31968j;
    }

    /* JADX INFO: renamed from: l */
    public static final SpannableStringBuilder m27187l(LocalTime time, boolean z4) {
        AbstractC22676k.m65750j(time, "time");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z4) {
            spannableStringBuilder.append((CharSequence) m27184i(time));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) m27179d(time));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m27176a(time, false));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.5f), length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: m */
    public static final LocalDate m27188m(String str) {
        try {
            return f31967i.parseLocalDate(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final LocalDateTime m27189n(String timestamp) {
        AbstractC22676k.m65750j(timestamp, "timestamp");
        LocalDateTime localDateTime = f31968j.parseDateTime(timestamp).withZone(DateTimeZone.getDefault()).toLocalDateTime();
        AbstractC22676k.m65749i(localDateTime, "toLocalDateTime(...)");
        return localDateTime;
    }

    /* JADX INFO: renamed from: o */
    private static final Locale m27190o(Locale locale) {
        Locale localeBuild = new Locale.Builder().setLocale(locale).setUnicodeLocaleKeyword("nu", "latn").build();
        AbstractC22676k.m65749i(localeBuild, "build(...)");
        return localeBuild;
    }
}
