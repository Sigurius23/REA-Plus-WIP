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

/* JADX INFO: renamed from: jt2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ljt2/g;", "", "Lls2/b;", "analyticHelper", "<init>", "(Lls2/b;)V", "", "Ljt2/b;", "selectedBehaviors", "Ljt2/p$v;", "domainAction", "d", "(Ljava/util/List;Ljt2/p$v;)Ljava/util/List;", "Ljt2/p;", "internalAction", "Ljt2/j;", "domainState", "a", "(Ljt2/p;Ljt2/j;)Ljt2/j;", "Ll83/a0;", "b", "()V", "pendingSelectedBehaviors", "c", "(Ljt2/p$v;Ljava/util/List;)V", "Lls2/b;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21945g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24717b analyticHelper;

    public C21945g(C24717b analyticHelper) {
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        this.analyticHelper = analyticHelper;
    }

    /* JADX INFO: renamed from: d */
    private final List<C21940b> m62571d(List<C21940b> selectedBehaviors, AbstractC21954p.v domainAction) {
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(selectedBehaviors);
        List<C21940b> list = selectedBehaviors;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((C21940b) it.next()).getId(), domainAction.getId())) {
                    int i13 = 0;
                    for (Object obj : arrayListM74097F1) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C21940b c21940b = (C21940b) obj;
                        if (AbstractC22676k.m65745e(c21940b.getId(), domainAction.getId())) {
                            arrayListM74097F1.set(i13, C21940b.m62528b(c21940b, null, domainAction.getIsAvoid(), domainAction.getIsToggled(), domainAction.getSelectedDay(), 1, null));
                        }
                        i13 = i14;
                    }
                    return arrayListM74097F1;
                }
            }
        }
        arrayListM74097F1.add(new C21940b(domainAction.getId(), domainAction.getIsAvoid(), domainAction.getIsToggled(), domainAction.getSelectedDay()));
        return arrayListM74097F1;
    }

    /* JADX INFO: renamed from: a */
    public final C21948j m62572a(AbstractC21954p internalAction, C21948j domainState) {
        AbstractC22676k.m65750j(internalAction, "internalAction");
        AbstractC22676k.m65750j(domainState, "domainState");
        if (internalAction instanceof AbstractC21954p.v) {
            AbstractC21954p.v vVar = (AbstractC21954p.v) internalAction;
            m62574c(vVar, domainState.getAccumulatedStateForVS().m62544k());
            return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, null, null, null, null, null, null, null, m62571d(domainState.getAccumulatedStateForVS().m62544k(), vVar), null, false, null, false, null, null, null, null, null, null, null, 2096639, null), 1, null);
        }
        if (!(internalAction instanceof AbstractC21954p.k)) {
            return domainState;
        }
        m62573b();
        return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, null, null, null, null, null, null, null, null, null, domainState.getAccumulatedStateForVS().m62544k(), true, null, false, null, null, null, null, null, null, null, 2094079, null), 1, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m62573b() {
        C24717b c24717b = this.analyticHelper;
        String lowerCase = "Behaviors".toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        c24717b.m72377q(new AbstractC24716a.d("Save", lowerCase));
    }

    /* JADX INFO: renamed from: c */
    public final void m62574c(AbstractC21954p.v internalAction, List<C21940b> pendingSelectedBehaviors) {
        Object next;
        AbstractC22676k.m65750j(internalAction, "internalAction");
        AbstractC22676k.m65750j(pendingSelectedBehaviors, "pendingSelectedBehaviors");
        Iterator<T> it = pendingSelectedBehaviors.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C21940b) next).getId(), internalAction.getId()));
        C21940b c21940b = (C21940b) next;
        if (c21940b == null || c21940b.getIsSelected() == internalAction.getIsToggled()) {
            return;
        }
        this.analyticHelper.m72377q(new AbstractC24716a.f(internalAction.getId(), internalAction.getIsToggled(), internalAction.getIsAvoid(), internalAction.getSelectedDay()));
    }
}
