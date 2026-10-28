package mk2;

import com.whoop.activitysession.PauseSegment;
import java.time.Duration;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x90.AbstractC38102h;

/* JADX INFO: renamed from: mk2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Lcom/whoop/activitysession/PauseSegment;", "", "sessionElapsedMs", "Lmk2/d;", "a", "(Ljava/util/List;J)Lmk2/d;", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25646m {
    /* JADX INFO: renamed from: a */
    public static final C25637d m75463a(List<PauseSegment> list, long j7) {
        AbstractC22676k.m65750j(list, "<this>");
        Duration durationOfMillis = Duration.ofMillis(AbstractC38102h.m122076a(list, j7));
        AbstractC22676k.m65749i(durationOfMillis, "ofMillis(...)");
        return new C25637d(durationOfMillis, list);
    }
}
