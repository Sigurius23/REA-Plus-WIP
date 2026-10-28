package gm1;

import com.whoop.home.domain.models.CycleDays;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gm1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lgm1/a;", "", "Ljava/time/Clock;", "clock", "<init>", "(Ljava/time/Clock;)V", "Lcom/whoop/home/domain/models/CycleDays;", "cycleDays", "Ljava/time/format/DateTimeFormatter;", "dateTimeFormatter", "", "a", "(Lcom/whoop/home/domain/models/CycleDays;Ljava/time/format/DateTimeFormatter;)Z", "Ljava/time/Clock;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15991a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Clock clock;

    public C15991a(Clock clock) {
        AbstractC22676k.m65750j(clock, "clock");
        this.clock = clock;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45175a(CycleDays cycleDays, DateTimeFormatter dateTimeFormatter) {
        AbstractC22676k.m65750j(cycleDays, "cycleDays");
        AbstractC22676k.m65750j(dateTimeFormatter, "dateTimeFormatter");
        LocalDate localDateNow = LocalDate.now(this.clock);
        String lowerEndpoint = cycleDays.getLowerEndpoint();
        LocalDate localDate = lowerEndpoint != null ? LocalDate.parse(lowerEndpoint, dateTimeFormatter) : null;
        String upperEndpoint = cycleDays.getUpperEndpoint();
        LocalDate localDate2 = upperEndpoint != null ? LocalDate.parse(upperEndpoint, dateTimeFormatter) : null;
        if (localDateNow.isEqual(localDate)) {
            return true;
        }
        return localDateNow.isAfter(localDate) && localDateNow.isBefore(localDate2);
    }
}
