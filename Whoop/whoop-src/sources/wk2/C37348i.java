package wk2;

import com.whoop.hrZones.network.ZoneID;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: wk2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, m65681d2 = {"Lwk2/i;", "", "Ljava/time/Clock;", "clock", "<init>", "(Ljava/time/Clock;)V", "Lwk2/k;", "previous", "Lyg2/d;", "liveHrState", "a", "(Lwk2/k;Lyg2/d;)Lwk2/k;", "Ljava/time/Clock;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37348i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Clock clock;

    public C37348i(Clock clock) {
        AbstractC22676k.m65750j(clock, "clock");
        this.clock = clock;
    }

    /* JADX INFO: renamed from: a */
    public final C37350k m119595a(C37350k previous, AbstractC39529d liveHrState) {
        Map<ZoneID, Duration> mapM119604c;
        AbstractC22676k.m65750j(previous, "previous");
        AbstractC22676k.m65750j(liveHrState, "liveHrState");
        Instant instant = this.clock.instant();
        if (previous.getLastZone() == null || previous.getLastTimestamp() == null) {
            mapM119604c = previous.m119604c();
        } else {
            Duration durationBetween = Duration.between(previous.getLastTimestamp(), instant);
            Map<ZoneID, Duration> mapM119604c2 = previous.m119604c();
            ZoneID lastZone = previous.getLastZone();
            Map<ZoneID, Duration> mapM119604c3 = previous.m119604c();
            ZoneID lastZone2 = previous.getLastZone();
            Duration ZERO = Duration.ZERO;
            AbstractC22676k.m65749i(ZERO, "ZERO");
            mapM119604c = AbstractC25247g0.m73996e0(mapM119604c2, new C23465k(lastZone, mapM119604c3.getOrDefault(lastZone2, ZERO).plus(durationBetween)));
        }
        AbstractC39529d.a aVar = liveHrState instanceof AbstractC39529d.a ? (AbstractC39529d.a) liveHrState : null;
        return new C37350k(mapM119604c, aVar != null ? aVar.getZoneID() : null, instant);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C37348i(Clock clock, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(clock);
    }
}
