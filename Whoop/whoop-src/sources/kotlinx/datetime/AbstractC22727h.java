package kotlinx.datetime;

import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.C29084f;
import pc3.C29098t;

/* JADX INFO: renamed from: kotlinx.datetime.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22727h {
    /* JADX INFO: renamed from: a */
    public static final YearMonth m65801a(C29098t c29098t, long j7) {
        AbstractC22676k.m65750j(c29098t, "<this>");
        long j13 = 12;
        long j14 = j7 / j13;
        if ((j7 ^ j13) < 0 && j14 * j13 != j7) {
            j14--;
        }
        C29084f c29084f = LocalDate.Companion;
        c29084f.getClass();
        int year = LocalDate.MIN.getYear();
        c29084f.getClass();
        if (j14 <= LocalDate.MAX.getYear() && year <= j14) {
            long j15 = j7 % j13;
            return new YearMonth((int) j14, ((int) (j15 + (j13 & (((j15 ^ j13) & ((-j15) | j15)) >> 63)))) + 1);
        }
        StringBuilder sb4 = new StringBuilder("Year ");
        sb4.append(j14);
        sb4.append(" is out of range: ");
        c29084f.getClass();
        sb4.append(LocalDate.MIN.getYear());
        sb4.append("..");
        c29084f.getClass();
        sb4.append(LocalDate.MAX.getYear());
        throw new IllegalArgumentException(sb4.toString().toString());
    }

    /* JADX INFO: renamed from: b */
    public static final long m65802b(YearMonth yearMonth) {
        return (((long) yearMonth.getYear()) * 12) + ((long) (yearMonth.getMonthNumber$kotlinx_datetime() - 1));
    }

    /* JADX INFO: renamed from: c */
    public static final YearMonth m65803c(YearMonth yearMonth, long j7, DateTimeUnit.MonthBased monthBased) {
        try {
            long jMultiplyExact = Math.multiplyExact(j7, monthBased.getMonths());
            return jMultiplyExact == 0 ? yearMonth : m65801a(YearMonth.Companion, Math.addExact(m65802b(yearMonth), jMultiplyExact));
        } catch (ArithmeticException e5) {
            throw new DateTimeArithmeticException(e5, "Arithmetic overflow when adding " + j7 + " of " + monthBased + " to " + yearMonth);
        } catch (IllegalArgumentException e13) {
            throw new DateTimeArithmeticException(e13, "Boundaries of YearMonth exceeded when adding " + j7 + " of " + monthBased + " to " + yearMonth);
        }
    }
}
