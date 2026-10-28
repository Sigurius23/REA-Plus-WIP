package kotlinx.datetime;

import java.time.DateTimeException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: kotlinx.datetime.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22725f {

    /* JADX INFO: renamed from: a */
    public static final long f89401a = java.time.LocalDate.MIN.toEpochDay();

    /* JADX INFO: renamed from: b */
    public static final long f89402b = java.time.LocalDate.MAX.toEpochDay();

    /* JADX INFO: renamed from: a */
    public static final LocalDate m65800a(LocalDate localDate, long j7, DateTimeUnit.DayBased dayBased) {
        try {
            long jAddExact = Math.addExact(localDate.getValue().toEpochDay(), Math.multiplyExact(j7, dayBased.getDays()));
            long j13 = f89401a;
            if (jAddExact > f89402b || j13 > jAddExact) {
                throw new DateTimeException(AbstractC31061c.m95636l(jAddExact, "The resulting day ", " is out of supported LocalDate range."));
            }
            java.time.LocalDate localDateOfEpochDay = java.time.LocalDate.ofEpochDay(jAddExact);
            AbstractC22676k.m65749i(localDateOfEpochDay, "ofEpochDay(...)");
            return new LocalDate(localDateOfEpochDay);
        } catch (Exception e5) {
            if (!(e5 instanceof DateTimeException) && !(e5 instanceof ArithmeticException)) {
                throw e5;
            }
            throw new DateTimeArithmeticException(e5, "The result of adding " + j7 + " of " + dayBased + " to " + localDate + " is out of LocalDate range.");
        }
    }
}
