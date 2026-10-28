package ot2;

import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import java.util.Collection;
import java.util.List;
import jt2.C21942d;
import jt2.C21956r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ot2.u */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Ljt2/d;", "accumulator", "", "a", "(Ljt2/d;)Z", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28352u {
    /* JADX INFO: renamed from: a */
    public static final boolean m86023a(C21942d accumulator) {
        AbstractC22676k.m65750j(accumulator, "accumulator");
        List<C21956r> listM62551r = accumulator.m62551r();
        if ((listM62551r instanceof Collection) && listM62551r.isEmpty()) {
            return false;
        }
        for (C21956r c21956r : listM62551r) {
            if (c21956r.getTargetGoalType() == TargetGoalType.SLEEP_PERFORMANCE || c21956r.getTargetGoalType() == TargetGoalType.SLEEP_HOURS || c21956r.getTargetGoalType() == TargetGoalType.SLEEP_CONSISTENCY) {
                return true;
            }
        }
        return false;
    }
}
