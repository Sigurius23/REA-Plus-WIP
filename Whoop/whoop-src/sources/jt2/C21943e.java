package jt2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ls2.AbstractC24716a;
import ls2.C24717b;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jt2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ljt2/e;", "", "Lls2/b;", "analyticHelper", "<init>", "(Lls2/b;)V", "", "Ljt2/a;", "selectedActivities", "Ljt2/p$u;", "domainAction", "d", "(Ljava/util/List;Ljt2/p$u;)Ljava/util/List;", "Ljt2/p;", "internalAction", "Ljt2/j;", "domainState", "a", "(Ljt2/p;Ljt2/j;)Ljt2/j;", "Ll83/a0;", "b", "()V", "pendingSelectedActivities", "c", "(Ljt2/p$u;Ljava/util/List;)V", "Lls2/b;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21943e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24717b analyticHelper;

    public C21943e(C24717b analyticHelper) {
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        this.analyticHelper = analyticHelper;
    }

    /* JADX INFO: renamed from: d */
    private final List<C21939a> m62557d(List<C21939a> selectedActivities, AbstractC21954p.u domainAction) {
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(selectedActivities);
        List<C21939a> list = selectedActivities;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((C21939a) it.next()).getActivityType(), domainAction.getId())) {
                    int i13 = 0;
                    for (Object obj : arrayListM74097F1) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C21939a c21939a = (C21939a) obj;
                        if (AbstractC22676k.m65745e(c21939a.getActivityType(), domainAction.getId())) {
                            arrayListM74097F1.set(i13, C21939a.m62523b(c21939a, null, domainAction.getIsToggled(), domainAction.getSelectedDay(), 1, null));
                        }
                        i13 = i14;
                    }
                    return arrayListM74097F1;
                }
            }
        }
        arrayListM74097F1.add(new C21939a(domainAction.getId(), domainAction.getIsToggled(), domainAction.getSelectedDay()));
        return arrayListM74097F1;
    }

    /* JADX INFO: renamed from: a */
    public final C21948j m62558a(AbstractC21954p internalAction, C21948j domainState) {
        AbstractC22676k.m65750j(internalAction, "internalAction");
        AbstractC22676k.m65750j(domainState, "domainState");
        if (internalAction instanceof AbstractC21954p.u) {
            AbstractC21954p.u uVar = (AbstractC21954p.u) internalAction;
            m62560c(uVar, domainState.getAccumulatedStateForVS().m62543j());
            return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, null, null, null, null, m62557d(domainState.getAccumulatedStateForVS().m62543j(), uVar), null, null, null, null, false, null, false, null, null, null, null, null, null, null, 2097087, null), 1, null);
        }
        if (!(internalAction instanceof AbstractC21954p.j)) {
            return domainState;
        }
        m62559b();
        return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, null, null, null, null, null, domainState.getAccumulatedStateForVS().m62543j(), null, null, null, true, null, false, null, null, null, null, null, null, null, 2094975, null), 1, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m62559b() {
        C24717b c24717b = this.analyticHelper;
        String lowerCase = "Activities".toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        c24717b.m72377q(new AbstractC24716a.d("Save", lowerCase));
    }

    /* JADX INFO: renamed from: c */
    public final void m62560c(AbstractC21954p.u internalAction, List<C21939a> pendingSelectedActivities) {
        Object next;
        AbstractC22676k.m65750j(internalAction, "internalAction");
        AbstractC22676k.m65750j(pendingSelectedActivities, "pendingSelectedActivities");
        Iterator<T> it = pendingSelectedActivities.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C21939a) next).getActivityType(), internalAction.getId()));
        C21939a c21939a = (C21939a) next;
        if (c21939a == null || c21939a.getIsSelected() == internalAction.getIsToggled()) {
            return;
        }
        this.analyticHelper.m72377q(new AbstractC24716a.e(internalAction.getId(), internalAction.getIsToggled(), internalAction.getSelectedDay()));
    }
}
