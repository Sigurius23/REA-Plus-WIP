package ot2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricDetail;
import java.util.Iterator;
import jt2.AbstractC21951m;
import jt2.C21942d;
import jt2.C21955q;
import jt2.C21956r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ot2.s */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lot2/s;", "", "Ljt2/q;", "metricSliderMatcher", "<init>", "(Ljt2/q;)V", "Ljt2/d;", "accumulator", "Ljt2/m$i;", "domainState", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;", "matchedContributor", "Lcom/whoop/design/util/TextResource;", "a", "(Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;)Lcom/whoop/design/util/TextResource;", "Ljt2/q;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28350s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21955q metricSliderMatcher;

    public C28350s(C21955q metricSliderMatcher) {
        AbstractC22676k.m65750j(metricSliderMatcher, "metricSliderMatcher");
        this.metricSliderMatcher = metricSliderMatcher;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX INFO: renamed from: a */
    public final TextResource m86018a(C21942d accumulator, AbstractC21951m.i domainState, MetricDetail matchedContributor) {
        Object next;
        Object next2;
        String strValueOf;
        TargetGoalType targetGoalType;
        AbstractC22676k.m65750j(accumulator, "accumulator");
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(matchedContributor, "matchedContributor");
        TargetGoalType goalType = matchedContributor.getGoalType();
        Iterator<T> it = accumulator.m62545l().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C21956r) next).getTargetGoalType() != matchedContributor.getGoalType());
        C21956r c21956r = (C21956r) next;
        Iterator<T> it3 = domainState.getResult().getGoalScreens().iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((WeeklyPlanCustomizationScreenModel) next2).getGoal() != goalType);
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) next2;
        if (c21956r != null) {
            strValueOf = String.valueOf(this.metricSliderMatcher.m62674a(weeklyPlanCustomizationScreenModel, Float.valueOf((float) c21956r.getSliderFillValue())));
            if (strValueOf == null) {
                strValueOf = "";
            }
        } else {
            strValueOf = "";
        }
        if (c21956r == null || (targetGoalType = c21956r.getTargetGoalType()) == null) {
            return null;
        }
        return AbstractC8693b.m21278l(AbstractC28353v.m86025b(strValueOf, targetGoalType));
    }
}
