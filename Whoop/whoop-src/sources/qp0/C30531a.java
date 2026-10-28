package qp0;

import com.whoop.navigation.ActivityEditModel;
import com.whoop.navigation.AddActivityModel;
import com.whoop.navigation.HealthMonitorScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import j02.AbstractC21155m0;
import j93.InterfaceC21461d;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import o02.InterfaceC27353d;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: qp0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lqp0/a;", "Lo02/d;", "<init>", "()V", "", "Lorg/joda/time/LocalDateTime;", "f", "(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/m0;", "e", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "a", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30531a implements InterfaceC27353d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static final DateTimeFormatter f125539b;

    /* JADX INFO: renamed from: qp0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lqp0/a$a;", "", "<init>", "()V", "", "startTimestamp", "endTimestamp", "Ljava/time/ZoneId;", "zone", "", "d", "(JJLjava/time/ZoneId;)Ljava/lang/String;", "", "b", "(JJLjava/time/ZoneId;)Ljava/util/Map;", "Ljava/time/format/DateTimeFormatter;", "activityNavigationFormatter", "Ljava/time/format/DateTimeFormatter;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Map m93589c(Companion companion, long j7, long j13, ZoneId zoneId, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                zoneId = ZoneId.systemDefault();
                AbstractC22676k.m65749i(zoneId, "systemDefault(...)");
            }
            return companion.m93592b(j7, j13, zoneId);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ String m93590e(Companion companion, long j7, long j13, ZoneId zoneId, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                zoneId = ZoneId.systemDefault();
                AbstractC22676k.m65749i(zoneId, "systemDefault(...)");
            }
            return companion.m93593d(j7, j13, zoneId);
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m93591a(long j7, long j13) {
            return m93589c(this, j7, j13, null, 4, null);
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, String> m93592b(long startTimestamp, long endTimestamp, ZoneId zone) {
            AbstractC22676k.m65750j(zone, "zone");
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTimestamp), zone);
            LocalDateTime localDateTimeOfInstant2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTimestamp), zone);
            return AbstractC25247g0.m73990Y(new C23465k("startDate", localDateTimeOfInstant.format(DateTimeFormatter.ofPattern(StreamDateFormatter.DATE_FORMAT))), new C23465k("endDate", localDateTimeOfInstant2.format(DateTimeFormatter.ofPattern(StreamDateFormatter.DATE_FORMAT))));
        }

        /* JADX INFO: renamed from: d */
        public final String m93593d(long startTimestamp, long endTimestamp, ZoneId zone) {
            AbstractC22676k.m65750j(zone, "zone");
            return AbstractC31061c.m95640p("https://app.whoop.com/ADD_ACTIVITY?start_time=", C30531a.f125539b.format(OffsetDateTime.ofInstant(Instant.ofEpochMilli(startTimestamp), zone)), "&end_time=", C30531a.f125539b.format(OffsetDateTime.ofInstant(Instant.ofEpochMilli(endTimestamp), zone)));
        }

        private Companion() {
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        AbstractC22676k.m65749i(dateTimeFormatterOfPattern, "ofPattern(...)");
        f125539b = dateTimeFormatterOfPattern;
    }

    /* JADX INFO: renamed from: d */
    public static final Map<String, String> m93586d(long j7, long j13) {
        return INSTANCE.m93591a(j7, j13);
    }

    /* JADX INFO: renamed from: f */
    private final org.joda.time.LocalDateTime m93587f(String str) {
        if (str.length() > 0) {
            return new org.joda.time.LocalDateTime(DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parseDateTime(str).withZone(DateTimeZone.getDefault()));
        }
        return null;
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> list, Map<InterfaceC21461d, ? extends Function1> map) {
        return super.mo67682b(list, map);
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC21155m0 mo67681a(NavigationScreenModel navigationScreenModel) {
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        if (navigationScreenModel instanceof AddActivityModel) {
            AddActivityModel addActivityModel = (AddActivityModel) navigationScreenModel;
            String startTime = addActivityModel.getStartTime();
            DateTimeFormatter dateTimeFormatter = f125539b;
            LocalDateTime localDateTime = OffsetDateTime.parse(startTime, dateTimeFormatter).toLocalDateTime();
            LocalDateTime localDateTime2 = OffsetDateTime.parse(addActivityModel.getEndTime(), dateTimeFormatter).toLocalDateTime();
            String activityType = addActivityModel.getActivityType();
            return new AbstractC21155m0.f(false, null, localDateTime, localDateTime2, false, activityType == null ? "" : activityType, 19, null);
        }
        if (!(navigationScreenModel instanceof ActivityEditModel)) {
            if (!(navigationScreenModel instanceof HealthMonitorScreenModel)) {
                return AbstractC21155m0.j3.f80414b;
            }
            HealthMonitorScreenModel healthMonitorScreenModel = (HealthMonitorScreenModel) navigationScreenModel;
            return new AbstractC21155m0.q1(healthMonitorScreenModel.getSource(), null, healthMonitorScreenModel.getInitialHr(), healthMonitorScreenModel.getInitialHrZone(), null, 18, null);
        }
        ActivityEditModel activityEditModel = (ActivityEditModel) navigationScreenModel;
        String startTime2 = activityEditModel.getStartTime();
        org.joda.time.LocalDateTime localDateTimeM93587f = startTime2 != null ? m93587f(startTime2) : null;
        String endTime = activityEditModel.getEndTime();
        org.joda.time.LocalDateTime localDateTimeM93587f2 = endTime != null ? m93587f(endTime) : null;
        String internalName = activityEditModel.getInternalName();
        String str = internalName == null ? "" : internalName;
        String activityScoreType = activityEditModel.getActivityScoreType();
        return new AbstractC21155m0.c1(localDateTimeM93587f, localDateTimeM93587f2, str, activityScoreType == null ? "" : activityScoreType, activityEditModel.getActivityId(), activityEditModel.getFlow(), activityEditModel.isDeletable());
    }
}
