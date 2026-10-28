package kk2;

import com.whoop.activitysession.PauseSegment;
import com.whoop.addactivity.network.CreateActivityPauseSegment;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Lcom/whoop/activitysession/PauseSegment;", "", "sessionStartTimeMs", "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;", "a", "(Ljava/util/List;J)Ljava/util/List;", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22549b {
    /* JADX INFO: renamed from: a */
    public static final List<CreateActivityPauseSegment> m65281a(List<PauseSegment> list, long j7) {
        AbstractC22676k.m65750j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            CreateActivityPauseSegment createActivityPauseSegment = null;
            if (!it.hasNext()) {
                break;
            }
            PauseSegment pauseSegment = (PauseSegment) it.next();
            Long endTimeMs = pauseSegment.getEndTimeMs();
            if (endTimeMs != null) {
                long jLongValue = endTimeMs.longValue();
                Instant instantOfEpochMilli = Instant.ofEpochMilli(pauseSegment.getStartTimeMs() + j7);
                AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(...)");
                String strM65280a = AbstractC22548a.m65280a(instantOfEpochMilli);
                Instant instantOfEpochMilli2 = Instant.ofEpochMilli(jLongValue + j7);
                AbstractC22676k.m65749i(instantOfEpochMilli2, "ofEpochMilli(...)");
                createActivityPauseSegment = new CreateActivityPauseSegment(strM65280a, AbstractC22548a.m65280a(instantOfEpochMilli2));
            }
            if (createActivityPauseSegment != null) {
                arrayList.add(createActivityPauseSegment);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
