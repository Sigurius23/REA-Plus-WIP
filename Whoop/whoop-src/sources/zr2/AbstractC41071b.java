package zr2;

import e93.AbstractC12889b;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zr2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u0007*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lzr2/a;", "Lorg/joda/time/LocalDate;", "localDate", "Lorg/joda/time/LocalTime;", "localTime", "Lorg/joda/time/DateTimeZone;", "timeZone", "Lorg/joda/time/DateTime;", "b", "(Lzr2/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;", "dateTime", "Lorg/joda/time/LocalDateTime;", "d", "(Lzr2/a;Lorg/joda/time/DateTime;)Lorg/joda/time/LocalDateTime;", "", "a", "(Lzr2/a;)I", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41071b {
    /* JADX INFO: renamed from: a */
    public static final int m133368a(InterfaceC41070a interfaceC41070a) {
        AbstractC22676k.m65750j(interfaceC41070a, "<this>");
        return AbstractC12889b.m36257W(interfaceC41070a.mo133363b() / 1000.0d);
    }

    /* JADX INFO: renamed from: b */
    public static final DateTime m133369b(InterfaceC41070a interfaceC41070a, LocalDate localDate, LocalTime localTime, DateTimeZone dateTimeZone) {
        AbstractC22676k.m65750j(interfaceC41070a, "<this>");
        DateTime dateTimeMo133364c = interfaceC41070a.mo133364c();
        int year = localDate != null ? localDate.getYear() : dateTimeMo133364c.getYear();
        int monthOfYear = localDate != null ? localDate.getMonthOfYear() : dateTimeMo133364c.getMonthOfYear();
        int dayOfMonth = localDate != null ? localDate.getDayOfMonth() : dateTimeMo133364c.getDayOfMonth();
        int hourOfDay = localTime != null ? localTime.getHourOfDay() : dateTimeMo133364c.getHourOfDay();
        int minuteOfHour = localTime != null ? localTime.getMinuteOfHour() : dateTimeMo133364c.getMinuteOfHour();
        int secondOfMinute = localTime != null ? localTime.getSecondOfMinute() : dateTimeMo133364c.getSecondOfMinute();
        int millisOfSecond = localTime != null ? localTime.getMillisOfSecond() : dateTimeMo133364c.getMillisOfSecond();
        if (dateTimeZone == null) {
            dateTimeZone = interfaceC41070a.mo133366e();
        }
        return new DateTime(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, dateTimeZone);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ DateTime m133370c(InterfaceC41070a interfaceC41070a, LocalDate localDate, LocalTime localTime, DateTimeZone dateTimeZone, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            localDate = null;
        }
        if ((i13 & 2) != 0) {
            localTime = null;
        }
        if ((i13 & 4) != 0) {
            dateTimeZone = null;
        }
        return m133369b(interfaceC41070a, localDate, localTime, dateTimeZone);
    }

    /* JADX INFO: renamed from: d */
    public static final LocalDateTime m133371d(InterfaceC41070a interfaceC41070a, DateTime dateTime) {
        AbstractC22676k.m65750j(interfaceC41070a, "<this>");
        AbstractC22676k.m65750j(dateTime, "dateTime");
        LocalDateTime localDateTime = dateTime.withZone(interfaceC41070a.mo133366e()).toLocalDateTime();
        AbstractC22676k.m65749i(localDateTime, "toLocalDateTime(...)");
        return localDateTime;
    }
}
