package mk2;

import com.whoop.activitysession.PauseSegment;
import java.time.Duration;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import x90.AbstractC38102h;

/* JADX INFO: renamed from: mk2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lmk2/d;", "", "Ljava/time/Duration;", "active", "", "Lcom/whoop/activitysession/PauseSegment;", "pauseSegments", "<init>", "(Ljava/time/Duration;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/Duration;", "()Ljava/time/Duration;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "()Z", "isPaused", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25637d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Duration active;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<PauseSegment> pauseSegments;

    public C25637d(Duration active, List<PauseSegment> pauseSegments) {
        AbstractC22676k.m65750j(active, "active");
        AbstractC22676k.m65750j(pauseSegments, "pauseSegments");
        this.active = active;
        this.pauseSegments = pauseSegments;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Duration getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: b */
    public final List<PauseSegment> m75433b() {
        return this.pauseSegments;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m75434c() {
        return AbstractC38102h.m122077b(this.pauseSegments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25637d)) {
            return false;
        }
        C25637d c25637d = (C25637d) other;
        return AbstractC22676k.m65745e(this.active, c25637d.active) && AbstractC22676k.m65745e(this.pauseSegments, c25637d.pauseSegments);
    }

    public int hashCode() {
        return this.pauseSegments.hashCode() + (this.active.hashCode() * 31);
    }

    public String toString() {
        return "DurationState(active=" + this.active + ", pauseSegments=" + this.pauseSegments + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C25637d(Duration ZERO, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            ZERO = Duration.ZERO;
            AbstractC22676k.m65749i(ZERO, "ZERO");
        }
        this(ZERO, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
