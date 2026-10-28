package kp0;

import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tf2.AbstractC33767a;

/* JADX INFO: renamed from: kp0.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "Lorg/joda/time/DateTime;", "now", "", "c", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Z", "a", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22749p {
    /* JADX INFO: renamed from: a */
    public static final boolean m65862a(SmartAlarmUserInfo smartAlarmUserInfo, DateTime now) {
        AbstractC22676k.m65750j(smartAlarmUserInfo, "<this>");
        AbstractC22676k.m65750j(now, "now");
        return AbstractC33767a.m106771c(smartAlarmUserInfo.getUpperBoundLocalTime(), now).plus(Minutes.TWO.toStandardDuration()).isAfter(now);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m65863b(SmartAlarmUserInfo smartAlarmUserInfo, DateTime dateTime, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateTime = DateTime.now();
            AbstractC22676k.m65749i(dateTime, "now(...)");
        }
        return m65862a(smartAlarmUserInfo, dateTime);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m65864c(SmartAlarmUserInfo smartAlarmUserInfo, DateTime now) {
        AbstractC22676k.m65750j(smartAlarmUserInfo, "<this>");
        AbstractC22676k.m65750j(now, "now");
        DateTime dateTimeM106769a = AbstractC33767a.m106769a(smartAlarmUserInfo.getUpperBoundLocalTime(), now);
        return dateTimeM106769a.minusMinutes(smartAlarmUserInfo.getWindowMinutes()).isBefore(now) && dateTimeM106769a.isAfter(now);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m65865d(SmartAlarmUserInfo smartAlarmUserInfo, DateTime dateTime, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateTime = DateTime.now();
            AbstractC22676k.m65749i(dateTime, "now(...)");
        }
        return m65864c(smartAlarmUserInfo, dateTime);
    }
}
