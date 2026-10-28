package yr1;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yr1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "requestDate", "", "a", "(Ljava/lang/String;)I", "", "dateTimeInMills", "Lorg/joda/time/DateTime;", "b", "(J)Lorg/joda/time/DateTime;", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39732c {
    /* JADX INFO: renamed from: a */
    public static final int m127140a(String requestDate) {
        AbstractC22676k.m65750j(requestDate, "requestDate");
        return Days.daysBetween(LocalDate.parse(requestDate), DateTime.now().toLocalDate()).getDays();
    }

    /* JADX INFO: renamed from: b */
    public static final DateTime m127141b(long j7) {
        DateTime dateTimeRoundFloorCopy = new DateTime(j7).withMinuteOfHour((new DateTime(j7).getMinuteOfHour() / 30) * 30).minuteOfDay().roundFloorCopy();
        AbstractC22676k.m65749i(dateTimeRoundFloorCopy, "roundFloorCopy(...)");
        return dateTimeRoundFloorCopy;
    }
}
