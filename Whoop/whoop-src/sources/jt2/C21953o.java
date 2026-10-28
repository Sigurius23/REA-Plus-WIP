package jt2;

import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ls2.AbstractC24716a;
import ls2.C24717b;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jt2.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ljt2/o;", "", "Lls2/b;", "analyticHelper", "<init>", "(Lls2/b;)V", "Ljt2/j;", "domainState", "Ljt2/p$o;", "domainAction", "", "Ljt2/r;", "b", "(Ljt2/j;Ljt2/p$o;)Ljava/util/List;", "Ljt2/p;", "a", "(Ljt2/p;Ljt2/j;)Ljt2/j;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "Ll83/a0;", "c", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", "Lls2/b;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21953o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24717b analyticHelper;

    public C21953o(C24717b analyticHelper) {
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        this.analyticHelper = analyticHelper;
    }

    /* JADX INFO: renamed from: b */
    private final List<C21956r> m62644b(C21948j domainState, AbstractC21954p.o domainAction) {
        Object next;
        Iterator<T> it = domainState.getAccumulatedStateForVS().m62545l().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C21956r) next).getTargetGoalType() != domainAction.getTargetGoalType());
        C21956r c21956r = (C21956r) next;
        C21956r c21956r2 = new C21956r(domainAction.getTargetGoalType(), c21956r != null ? c21956r.getSliderFillValue() : 0.0d, domainAction.getSavedValue());
        List<C21956r> listM62551r = domainState.getAccumulatedStateForVS().m62551r();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM62551r) {
            if (((C21956r) obj).getTargetGoalType() != domainAction.getTargetGoalType()) {
                arrayList.add(obj);
            }
        }
        return AbstractC25265s.m74128f1(c21956r2, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final C21948j m62645a(AbstractC21954p domainAction, C21948j domainState) {
        Object next;
        AbstractC22676k.m65750j(domainAction, "domainAction");
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainAction instanceof AbstractC21954p.w) {
            return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, ((AbstractC21954p.w) domainAction).getGoalType(), null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, 2097147, null), 1, null);
        }
        if (!(domainAction instanceof AbstractC21954p.y)) {
            if (!(domainAction instanceof AbstractC21954p.o)) {
                return domainState;
            }
            AbstractC21954p.o oVar = (AbstractC21954p.o) domainAction;
            m62646c(oVar.getTargetGoalType());
            return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, null, m62644b(domainState, oVar), null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, 2097143, null), 1, null);
        }
        AbstractC21954p.y yVar = (AbstractC21954p.y) domainAction;
        TargetGoalType targetGoalType = yVar.getTargetGoalType();
        double value = yVar.getValue();
        Iterator<T> it = domainState.getAccumulatedStateForVS().m62551r().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C21956r) next).getTargetGoalType() != yVar.getTargetGoalType());
        C21956r c21956r = (C21956r) next;
        C21956r c21956r2 = new C21956r(targetGoalType, value, c21956r != null ? c21956r.getSavedSliderValue() : 0.0d);
        List<C21956r> listM62545l = domainState.getAccumulatedStateForVS().m62545l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM62545l) {
            if (((C21956r) obj).getTargetGoalType() != yVar.getTargetGoalType()) {
                arrayList.add(obj);
            }
        }
        return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, null, null, AbstractC25265s.m74128f1(c21956r2, arrayList), null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, 2097135, null), 1, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m62646c(TargetGoalType targetGoalType) {
        AbstractC22676k.m65750j(targetGoalType, "targetGoalType");
        this.analyticHelper.m72377q(new AbstractC24716a.i("Save", targetGoalType.name()));
    }
}
