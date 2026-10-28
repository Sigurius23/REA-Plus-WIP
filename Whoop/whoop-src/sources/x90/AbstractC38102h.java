package x90;

import com.whoop.activitysession.PauseSegment;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x90.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005\"\u001b\u0010\n\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"", "Lcom/whoop/activitysession/PauseSegment;", "", "sessionElapsedMs", "c", "(Ljava/util/List;J)J", "a", "", "b", "(Ljava/util/List;)Z", "isCurrentlyPaused", "activity-session_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38102h {
    /* JADX INFO: renamed from: a */
    public static final long m122076a(List<PauseSegment> list, long j7) {
        AbstractC22676k.m65750j(list, "<this>");
        long jM122078c = (j7 < 0 ? 0L : j7) - m122078c(list, j7);
        if (jM122078c < 0) {
            return 0L;
        }
        return jM122078c;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m122077b(List<PauseSegment> list) {
        AbstractC22676k.m65750j(list, "<this>");
        return !list.isEmpty() && ((PauseSegment) AbstractC25265s.m74112P0(list)).getEndTimeMs() == null;
    }

    /* JADX INFO: renamed from: c */
    private static final long m122078c(List<PauseSegment> list, long j7) {
        long jLongValue = 0;
        for (PauseSegment pauseSegment : list) {
            Long endTimeMs = pauseSegment.getEndTimeMs();
            jLongValue += (endTimeMs != null ? endTimeMs.longValue() : j7) - pauseSegment.getStartTimeMs();
        }
        return jLongValue;
    }
}
