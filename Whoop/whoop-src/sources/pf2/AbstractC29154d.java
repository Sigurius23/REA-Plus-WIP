package pf2;

import org.joda.time.LocalTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pf2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lpf2/d;", "", "<init>", "()V", "b", "a", "Lpf2/d$a;", "Lpf2/d$b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29154d {

    /* JADX INFO: renamed from: pf2.d$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpf2/d$a;", "Lpf2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC29154d {

        /* JADX INFO: renamed from: a */
        public static final a f118014a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: pf2.d$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpf2/d$b;", "Lpf2/d;", "Lorg/joda/time/LocalTime;", "latestWakeTime", "<init>", "(Lorg/joda/time/LocalTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalTime;", "()Lorg/joda/time/LocalTime;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC29154d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalTime latestWakeTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LocalTime latestWakeTime) {
            super(null);
            AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
            this.latestWakeTime = latestWakeTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalTime getLatestWakeTime() {
            return this.latestWakeTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.latestWakeTime, ((b) other).latestWakeTime);
        }

        public int hashCode() {
            return this.latestWakeTime.hashCode();
        }

        public String toString() {
            return "WakeTimeSelected(latestWakeTime=" + this.latestWakeTime + ")";
        }
    }

    public /* synthetic */ AbstractC29154d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29154d() {
    }
}
