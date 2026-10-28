package ug;

import com.whoop.service.network.model.UserSessionDto;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import p499t9.C33647p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ug.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C34913b implements Comparable {

    /* JADX INFO: renamed from: E */
    public static final DateTimeFormatter f147013E;

    /* JADX INFO: renamed from: F */
    public static final C34913b f147014F;

    /* JADX INFO: renamed from: x */
    public static final C33647p f147015x;

    /* JADX INFO: renamed from: y */
    public static final DateTimeFormatter f147016y;

    /* JADX INFO: renamed from: z */
    public static final DateTimeFormatter f147017z;

    /* JADX INFO: renamed from: w */
    public final Instant f147018w;

    static {
        C33647p c33647p = new C33647p(5);
        f147015x = c33647p;
        Map<Long, String> mapM73990Y = AbstractC25247g0.m73990Y(new C23465k(1L, "Mon"), new C23465k(2L, "Tue"), new C23465k(3L, "Wed"), new C23465k(4L, "Thu"), new C23465k(5L, "Fri"), new C23465k(6L, "Sat"), new C23465k(7L, "Sun"));
        DateTimeFormatter dateTimeFormatterWithChronology = new DateTimeFormatterBuilder().parseCaseInsensitive().parseLenient().optionalStart().appendText(ChronoField.DAY_OF_WEEK, mapM73990Y).appendLiteral(", ").optionalEnd().appendValue(ChronoField.DAY_OF_MONTH, 2, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ').appendText(ChronoField.MONTH_OF_YEAR, AbstractC25247g0.m73990Y(new C23465k(1L, "Jan"), new C23465k(2L, "Feb"), new C23465k(3L, "Mar"), new C23465k(4L, "Apr"), new C23465k(5L, "May"), new C23465k(6L, "Jun"), new C23465k(7L, "Jul"), new C23465k(8L, "Aug"), new C23465k(9L, "Sep"), new C23465k(10L, "Oct"), new C23465k(11L, "Nov"), new C23465k(12L, "Dec"))).appendLiteral(' ').appendValue(ChronoField.YEAR, 4).appendLiteral(' ').appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral(':').appendValue(ChronoField.MINUTE_OF_HOUR, 2).optionalStart().appendLiteral(':').appendValue(ChronoField.SECOND_OF_MINUTE, 2).optionalEnd().appendLiteral(' ').appendOffset("+HHMM", "GMT").toFormatter().withChronology(IsoChronology.INSTANCE);
        AbstractC22676k.m65749i(dateTimeFormatterWithChronology, "withChronology(...)");
        f147016y = dateTimeFormatterWithChronology;
        ZoneId zoneIdOf = ZoneId.of("Z");
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'").withZone(zoneIdOf);
        AbstractC22676k.m65749i(dateTimeFormatterWithZone, "withZone(...)");
        f147017z = dateTimeFormatterWithZone;
        DateTimeFormatter dateTimeFormatterWithZone2 = DateTimeFormatter.ofPattern("yyyyMMdd").withZone(zoneIdOf);
        AbstractC22676k.m65749i(dateTimeFormatterWithZone2, "withZone(...)");
        f147013E = dateTimeFormatterWithZone2;
        p715kotlin.time.Instant.Companion companion = p715kotlin.time.Instant.INSTANCE;
        AbstractC34914c.m110116a(c33647p, companion.getDISTANT_PAST().toEpochMilliseconds());
        f147014F = AbstractC34914c.m110116a(c33647p, companion.getDISTANT_FUTURE().toEpochMilliseconds());
    }

    public C34913b(Instant instant) {
        this.f147018w = instant;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C34913b other) {
        AbstractC22676k.m65750j(other, "other");
        return this.f147018w.compareTo(other.f147018w);
    }

    /* JADX INFO: renamed from: b */
    public final String m110113b(EnumC34931t enumC34931t) {
        CharSequence charSequenceSubSequence;
        int iOrdinal = enumC34931t.ordinal();
        Instant instant = this.f147018w;
        if (iOrdinal == 0) {
            String str = DateTimeFormatter.ISO_INSTANT.format(instant.truncatedTo(ChronoUnit.MICROS));
            AbstractC22676k.m65749i(str, "format(...)");
            return str;
        }
        if (iOrdinal == 1) {
            String str2 = f147017z.format(instant);
            AbstractC22676k.m65749i(str2, "format(...)");
            return str2;
        }
        if (iOrdinal == 2) {
            String str3 = f147013E.format(instant);
            AbstractC22676k.m65749i(str3, "format(...)");
            return str3;
        }
        if (iOrdinal == 3) {
            String str4 = DateTimeFormatter.ISO_INSTANT.format(instant);
            AbstractC22676k.m65749i(str4, "format(...)");
            return str4;
        }
        if (iOrdinal == 4) {
            String str5 = f147016y.format(ZonedDateTime.ofInstant(instant, ZoneOffset.UTC));
            AbstractC22676k.m65749i(str5, "format(...)");
            return str5;
        }
        if (iOrdinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(instant.getEpochSecond()));
        if (instant.getNano() <= 0) {
            String string = stringBuffer.toString();
            AbstractC22676k.m65747g(string);
            return string;
        }
        stringBuffer.append(".");
        String strValueOf = String.valueOf(instant.getNano());
        stringBuffer.append(AbstractC39421y.m125925J(9 - strValueOf.length(), UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE));
        stringBuffer.append(strValueOf);
        char[] cArr = {'0'};
        int length = stringBuffer.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i13 = length - 1;
            if (!AbstractC25260n.m74052Y(cArr, stringBuffer.charAt(length))) {
                charSequenceSubSequence = stringBuffer.subSequence(0, length + 1);
                break;
            }
            if (i13 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i13;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: c */
    public final C34913b m110114c(long j7) {
        return m110115d(Duration.m134306unaryMinusUwyO8pc(j7));
    }

    /* JADX INFO: renamed from: d */
    public final C34913b m110115d(long j7) {
        long jM134276getInWholeSecondsimpl = Duration.m134276getInWholeSecondsimpl(j7);
        int iM134278getNanosecondsComponentimpl = Duration.m134278getNanosecondsComponentimpl(j7);
        Instant instant = this.f147018w;
        return C33647p.m106271n(instant.getNano() + iM134278getNanosecondsComponentimpl, instant.getEpochSecond() + jM134276getInWholeSecondsimpl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34913b) {
            return AbstractC22676k.m65745e(this.f147018w, ((C34913b) obj).f147018w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f147018w.hashCode();
    }

    public final String toString() {
        return m110113b(EnumC34931t.f147048w);
    }
}
