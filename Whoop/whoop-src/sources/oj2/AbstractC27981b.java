package oj2;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.stress.domain.BreathingEvent;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import org.joda.time.DateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: oj2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Lcom/whoop/stress/domain/BreathingEvent;", "breathingEvents", "Lorg/joda/time/DateTime;", "finalBreathingEventUpperTime", "a", "(Ljava/util/List;Lorg/joda/time/DateTime;)Ljava/util/List;", "stress_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27981b {
    /* JADX INFO: renamed from: a */
    public static final List<BreathingEvent> m84413a(List<BreathingEvent> breathingEvents, DateTime finalBreathingEventUpperTime) {
        DateTime dateTime;
        AbstractC22676k.m65750j(breathingEvents, "breathingEvents");
        AbstractC22676k.m65750j(finalBreathingEventUpperTime, "finalBreathingEventUpperTime");
        List<BreathingEvent> list = breathingEvents;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            BreathingEvent breathingEvent = (BreathingEvent) obj;
            if (i13 == AbstractC37056f.m118951C(breathingEvents)) {
                dateTime = finalBreathingEventUpperTime;
                breathingEvent = new BreathingEvent(new DateTimeRange(new DateTimeRange(breathingEvent.getTimes()).getLower(), dateTime, null, null, 12, null).getDuring(), breathingEvent.getType());
            } else {
                dateTime = finalBreathingEventUpperTime;
            }
            arrayList.add(breathingEvent);
            i13 = i14;
            finalBreathingEventUpperTime = dateTime;
        }
        return arrayList;
    }
}
