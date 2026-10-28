package p555vl;

import com.ethlo.time.LeapSecondException;
import com.ethlo.time.internal.DateTimeFormatException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.YearMonth;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeSet;
import org.joda.time.DateTimeConstants;
import p108e4.AbstractC12682p;
import p587wl.AbstractC37351a;
import p619xl.AbstractC38446b;
import p619xl.C38445a;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: vl.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36094a implements TemporalAccessor {

    /* JADX INFO: renamed from: K */
    public static final C38445a f154302K = new C38445a(0);

    /* JADX INFO: renamed from: E */
    public final int f154303E;

    /* JADX INFO: renamed from: F */
    public final int f154304F;

    /* JADX INFO: renamed from: G */
    public final int f154305G;

    /* JADX INFO: renamed from: H */
    public final int f154306H;

    /* JADX INFO: renamed from: I */
    public final C36097d f154307I;

    /* JADX INFO: renamed from: J */
    public final int f154308J;

    /* JADX INFO: renamed from: w */
    public final int f154309w;

    /* JADX INFO: renamed from: x */
    public final int f154310x;

    /* JADX INFO: renamed from: y */
    public final int f154311y;

    /* JADX INFO: renamed from: z */
    public final int f154312z;

    public C36094a(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, C36097d c36097d, int i25) {
        this.f154309w = i13;
        this.f154310x = i14;
        this.f154311y = i15;
        this.f154312z = i16;
        this.f154303E = i17;
        this.f154304F = i18;
        this.f154305G = i19;
        this.f154306H = i24;
        this.f154307I = c36097d;
        this.f154308J = i25;
        if (i19 == 60) {
            YearMonth yearMonthOf = YearMonth.of(i14, i15);
            C38445a c38445a = f154302K;
            if (((TreeSet) c38445a.f164636x).contains(yearMonthOf) || yearMonthOf.isAfter((YearMonth) c38445a.f164637y)) {
                C36097d c36097d2 = C36097d.f154318c;
                c36097d = c36097d == null ? c36097d2 : c36097d;
                int iM114699a = i17 - (c36097d.m114699a() / DateTimeConstants.SECONDS_PER_HOUR);
                int iM114699a2 = i18 - ((c36097d.m114699a() % DateTimeConstants.SECONDS_PER_HOUR) / 60);
                if (((i15 == Month.DECEMBER.getValue() && i16 == 31) || (i15 == Month.JUNE.getValue() && i16 == 30)) && iM114699a == 23 && iM114699a2 == 59) {
                    OffsetDateTime.of(i14, i15, i16, i17, i18, 59, i24, c36097d.equals(c36097d2) ? ZoneOffset.UTC : ZoneOffset.ofHoursMinutes(c36097d.f154319a, c36097d.f154320b)).plusSeconds(1L);
                    throw new LeapSecondException("Leap second detected in input");
                }
            }
        }
        if (AbstractC12682p.m35485e(i13) >= 2) {
            LocalDate.of(i14, i15, i16);
        }
        if (i19 > 59) {
            throw new DateTimeException(String.format("Invalid value for SecondOfMinute (valid values 0 - 59): %d", Integer.valueOf(i19)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m114670a(C36094a c36094a, int i13, int i14) {
        int iM35485e = AbstractC12682p.m35485e(i13);
        int i15 = c36094a.f154309w;
        if (iM35485e > AbstractC12682p.m35485e(i15)) {
            throw new DateTimeFormatException(AbstractC31061c.m95640p("Requested granularity was ", AbstractC36095b.m114697y(i13), ", but contains only granularity ", AbstractC36095b.m114697y(i15)));
        }
        C36097d c36097d = (C36097d) Optional.ofNullable(c36094a.f154307I).orElse(null);
        char[] cArr = new char[35];
        AbstractC38446b.m123191c(c36094a.f154310x, 0, 4, cArr);
        if (i13 == 1) {
            return AbstractC37351a.m119606b(cArr, 4, null);
        }
        if (AbstractC12682p.m35485e(i13) >= 1) {
            cArr[4] = '-';
            AbstractC38446b.m123191c(c36094a.f154311y, 5, 2, cArr);
        }
        if (i13 == 2) {
            return AbstractC37351a.m119606b(cArr, 7, null);
        }
        if (AbstractC12682p.m35485e(i13) >= 2) {
            cArr[7] = '-';
            AbstractC38446b.m123191c(c36094a.f154312z, 8, 2, cArr);
        }
        if (i13 == 3) {
            return AbstractC37351a.m119606b(cArr, 10, null);
        }
        if (AbstractC12682p.m35485e(i13) >= 3) {
            cArr[10] = 'T';
            AbstractC38446b.m123191c(c36094a.f154303E, 11, 2, cArr);
        }
        if (i13 == 4) {
            return AbstractC37351a.m119606b(cArr, 13, c36097d);
        }
        if (AbstractC12682p.m35485e(i13) >= 4) {
            cArr[13] = ':';
            AbstractC38446b.m123191c(c36094a.f154304F, 14, 2, cArr);
        }
        if (i13 == 5) {
            return AbstractC37351a.m119606b(cArr, 16, c36097d);
        }
        if (AbstractC12682p.m35485e(i13) >= 5) {
            cArr[16] = ':';
            AbstractC38446b.m123191c(c36094a.f154305G, 17, 2, cArr);
        }
        if (i13 == 6) {
            return AbstractC37351a.m119606b(cArr, 19, c36097d);
        }
        if (i14 > 0 && AbstractC12682p.m35485e(i13) >= 6) {
            cArr[19] = '.';
            AbstractC38446b.m123191c(c36094a.f154306H, 20, i14, cArr);
        }
        return AbstractC37351a.m119606b(cArr, (i14 > 0 ? 1 : 0) + 19 + i14, c36097d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36094a.class != obj.getClass()) {
            return false;
        }
        C36094a c36094a = (C36094a) obj;
        return this.f154310x == c36094a.f154310x && this.f154311y == c36094a.f154311y && this.f154312z == c36094a.f154312z && this.f154303E == c36094a.f154303E && this.f154304F == c36094a.f154304F && this.f154305G == c36094a.f154305G && this.f154306H == c36094a.f154306H && this.f154308J == c36094a.f154308J && this.f154309w == c36094a.f154309w && Objects.equals(this.f154307I, c36094a.f154307I);
    }

    @Override // java.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        boolean zEquals = temporalField.equals(ChronoField.YEAR);
        int i13 = this.f154310x;
        if (zEquals) {
            return i13;
        }
        boolean zEquals2 = temporalField.equals(ChronoField.MONTH_OF_YEAR);
        int i14 = this.f154311y;
        if (zEquals2) {
            return i14;
        }
        boolean zEquals3 = temporalField.equals(ChronoField.DAY_OF_MONTH);
        int i15 = this.f154312z;
        if (zEquals3) {
            return i15;
        }
        boolean zEquals4 = temporalField.equals(ChronoField.HOUR_OF_DAY);
        int i16 = this.f154303E;
        if (zEquals4) {
            return i16;
        }
        boolean zEquals5 = temporalField.equals(ChronoField.MINUTE_OF_HOUR);
        int i17 = this.f154304F;
        if (zEquals5) {
            return i17;
        }
        boolean zEquals6 = temporalField.equals(ChronoField.SECOND_OF_MINUTE);
        int i18 = this.f154305G;
        if (zEquals6) {
            return i18;
        }
        boolean zEquals7 = temporalField.equals(ChronoField.NANO_OF_SECOND);
        int i19 = this.f154306H;
        if (zEquals7) {
            return i19;
        }
        if (temporalField.equals(ChronoField.NANO_OF_DAY)) {
            return (((((long) i17) * 60) + (((long) i16) * 3600) + ((long) i18)) * 1000000000) + ((long) i19);
        }
        if (!temporalField.equals(ChronoField.INSTANT_SECONDS)) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        long j7 = (((long) i17) * 60) + (((long) i16) * 3600) + ((long) i18);
        if (i14 == 0) {
            i14 = 1;
        }
        if (i15 == 0) {
            i15 = 1;
        }
        int i24 = i13 - (i14 > 2 ? 0 : 1);
        long j13 = (i24 >= 0 ? i24 : i24 - 399) / 400;
        long j14 = ((long) i24) - (400 * j13);
        long j15 = (((j13 * 146097) + ((((j14 / 4) + (365 * j14)) - (j14 / 100)) + (((((((long) (i14 > 2 ? i14 - 3 : i14 + 9)) * 153) + 2) / 5) + ((long) i15)) - 1))) - 719468) * 86400;
        C36097d c36097d = this.f154307I;
        return (j15 + j7) - (c36097d != null ? c36097d.m114699a() : 0L);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(AbstractC12682p.m35485e(this.f154309w)), Integer.valueOf(this.f154310x), Integer.valueOf(this.f154311y), Integer.valueOf(this.f154312z), Integer.valueOf(this.f154303E), Integer.valueOf(this.f154304F), Integer.valueOf(this.f154305G), Integer.valueOf(this.f154306H), this.f154307I, Integer.valueOf(this.f154308J));
    }

    @Override // java.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        int i13;
        if (temporalField != ChronoField.NANO_OF_DAY) {
            if (temporalField.equals(ChronoField.YEAR)) {
                i13 = 1;
            } else if (temporalField.equals(ChronoField.MONTH_OF_YEAR)) {
                i13 = 2;
            } else if (temporalField.equals(ChronoField.DAY_OF_MONTH)) {
                i13 = 3;
            } else if (temporalField.equals(ChronoField.HOUR_OF_DAY)) {
                i13 = 4;
            } else if (temporalField.equals(ChronoField.MINUTE_OF_HOUR)) {
                i13 = 5;
            } else if (temporalField.equals(ChronoField.SECOND_OF_MINUTE)) {
                i13 = 6;
            } else {
                if (!temporalField.equals(ChronoField.NANO_OF_SECOND)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
                }
                i13 = 7;
            }
            if (AbstractC12682p.m35485e(i13) > AbstractC12682p.m35485e(this.f154309w)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        int i13 = this.f154308J;
        return i13 > 0 ? m114670a(this, 7, i13) : m114670a(this, this.f154309w, 0);
    }
}
