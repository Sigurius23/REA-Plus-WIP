package tf2;

import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tf2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"Lorg/joda/time/LocalTime;", "time", "Lorg/joda/time/DateTime;", "now", "a", "(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;", "c", "smart-alarm_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33767a {
    /* JADX INFO: renamed from: a */
    public static final DateTime m106769a(LocalTime time, DateTime now) {
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(now, "now");
        if (time.isBefore(now.toLocalTime())) {
            DateTime dateTimeWithTime = now.plusDays(1).withTime(time);
            AbstractC22676k.m65747g(dateTimeWithTime);
            return dateTimeWithTime;
        }
        DateTime dateTimeWithTime2 = now.withTime(time);
        AbstractC22676k.m65747g(dateTimeWithTime2);
        return dateTimeWithTime2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ DateTime m106770b(LocalTime localTime, DateTime dateTime, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            dateTime = DateTime.now();
            AbstractC22676k.m65749i(dateTime, "now(...)");
        }
        return m106769a(localTime, dateTime);
    }

    /* JADX INFO: renamed from: c */
    public static final DateTime m106771c(LocalTime time, DateTime now) {
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(now, "now");
        if (time.isAfter(now.toLocalTime())) {
            DateTime dateTimeWithTime = now.minusDays(1).withTime(time);
            AbstractC22676k.m65747g(dateTimeWithTime);
            return dateTimeWithTime;
        }
        DateTime dateTimeWithTime2 = now.withTime(time);
        AbstractC22676k.m65747g(dateTimeWithTime2);
        return dateTimeWithTime2;
    }
}
