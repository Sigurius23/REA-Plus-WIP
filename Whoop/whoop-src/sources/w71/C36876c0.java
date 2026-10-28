package w71;

import e93.AbstractC12889b;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w71.c0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, m65681d2 = {"Lw71/c0;", "", "", "curTime", "startTime", "endTime", "<init>", "(JJJ)V", "", "a", "()F", "sliderValue", "b", "(F)J", "J", "getCurTime", "()J", "flooredStartTime", "c", "flooredEndTime", "d", "ticks", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36876c0 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long curTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long flooredStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long flooredEndTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long ticks;

    /* JADX INFO: renamed from: w71.c0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lw71/c0$a;", "", "<init>", "()V", "", "millis", "a", "(J)J", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m118274a(long millis) {
            DateTime dateTime = new DateTime(millis);
            return dateTime.withMinuteOfHour((dateTime.getMinuteOfHour() / 30) * 30).withSecondOfMinute(0).withMillisOfSecond(0).getMillis();
        }

        private Companion() {
        }
    }

    public C36876c0(long j7, long j13, long j14) {
        this.curTime = j7;
        Companion companion = INSTANCE;
        long jM118274a = companion.m118274a(j13);
        this.flooredStartTime = jM118274a;
        long jM118274a2 = companion.m118274a(j14);
        this.flooredEndTime = jM118274a2;
        this.ticks = (TimeUnit.MILLISECONDS.toMinutes(Math.abs(jM118274a2 - jM118274a)) / ((long) 30)) + 1;
    }

    /* JADX INFO: renamed from: a */
    public final float m118271a() {
        long standardMinutes;
        float f13;
        long j7 = this.curTime;
        long jM118274a = j7 == 0 ? 0L : INSTANCE.m118274a(j7);
        if (jM118274a == 0) {
            f13 = jM118274a;
        } else {
            if (jM118274a < this.flooredStartTime) {
                standardMinutes = new Duration(this.flooredStartTime, new DateTime(jM118274a).plusDays(Days.daysBetween(new DateTime(jM118274a), new DateTime(this.flooredStartTime)).getDays() + 1).getMillis()).getStandardMinutes();
            } else {
                standardMinutes = new Duration(this.flooredStartTime, jM118274a).getStandardMinutes();
            }
            f13 = standardMinutes / 30.0f;
        }
        return AbstractC12889b.m36283m(f13, 0.0f, this.ticks - 1);
    }

    /* JADX INFO: renamed from: b */
    public final long m118272b(float sliderValue) {
        return new DateTime(this.flooredStartTime).plusMinutes(((int) sliderValue) * 30).getMillis();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTicks() {
        return this.ticks;
    }
}
