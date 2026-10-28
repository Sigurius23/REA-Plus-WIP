package nt2;

import jt2.AbstractC21950l;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nt2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lnt2/a;", "", "planName", "Ljt2/l;", "a", "(Lnt2/a;Ljava/lang/String;)Ljt2/l;", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27132b {
    /* JADX INFO: renamed from: a */
    public static final AbstractC21950l m81591a(AbstractC27131a abstractC27131a, String planName) {
        AbstractC22676k.m65750j(abstractC27131a, "<this>");
        AbstractC22676k.m65750j(planName, "planName");
        if (abstractC27131a instanceof AbstractC27131a.d) {
            return new AbstractC21950l.d(planName);
        }
        if (abstractC27131a instanceof AbstractC27131a.g) {
            AbstractC27131a.g gVar = (AbstractC27131a.g) abstractC27131a;
            return new AbstractC21950l.g(gVar.getPlanId(), planName, gVar.getIsCustomized(), gVar.getMigrateSmartAlarm(), gVar.m81569f(), gVar.m81565b(), gVar.m81564a(), gVar.getSource(), gVar.getPresetPlanCategory(), gVar.getTemplateId());
        }
        if (abstractC27131a instanceof AbstractC27131a.f) {
            return new AbstractC21950l.f(((AbstractC27131a.f) abstractC27131a).getSliderScreen());
        }
        if (abstractC27131a instanceof AbstractC27131a.e) {
            return new AbstractC21950l.e(((AbstractC27131a.e) abstractC27131a).getBottomSheetType());
        }
        if (abstractC27131a instanceof AbstractC27131a.c) {
            AbstractC27131a.c cVar = (AbstractC27131a.c) abstractC27131a;
            return new AbstractC21950l.c(cVar.getBottomSheetType(), cVar.getCategoryIndex());
        }
        if (abstractC27131a instanceof AbstractC27131a.j) {
            return new AbstractC21950l.j(((AbstractC27131a.j) abstractC27131a).getBottomSheetType());
        }
        if (abstractC27131a instanceof AbstractC27131a.n) {
            AbstractC27131a.n nVar = (AbstractC27131a.n) abstractC27131a;
            return new AbstractC21950l.n(nVar.getBottomSheetType(), nVar.getId());
        }
        if (abstractC27131a instanceof AbstractC27131a.r) {
            AbstractC27131a.r rVar = (AbstractC27131a.r) abstractC27131a;
            return new AbstractC21950l.r(rVar.getBottomSheetType(), rVar.getQuery());
        }
        if (abstractC27131a instanceof AbstractC27131a.o) {
            AbstractC27131a.o oVar = (AbstractC27131a.o) abstractC27131a;
            return new AbstractC21950l.o(oVar.getId(), oVar.getIsToggled(), oVar.getSelectedDay());
        }
        if (abstractC27131a instanceof AbstractC27131a.p) {
            AbstractC27131a.p pVar = (AbstractC27131a.p) abstractC27131a;
            return new AbstractC21950l.p(pVar.getId(), pVar.getIsToggled(), pVar.getIsAvoid(), pVar.getSelectedDay());
        }
        if (abstractC27131a instanceof AbstractC27131a.a) {
            return new AbstractC21950l.a(((AbstractC27131a.a) abstractC27131a).getId());
        }
        if (abstractC27131a.equals(AbstractC27131a.k.f108498a)) {
            return AbstractC21950l.k.f84837a;
        }
        if (abstractC27131a instanceof AbstractC27131a.m) {
            return new AbstractC21950l.m(((AbstractC27131a.m) abstractC27131a).getId());
        }
        if (abstractC27131a.equals(AbstractC27131a.h.f108495a)) {
            return AbstractC21950l.h.f84834a;
        }
        if (abstractC27131a.equals(AbstractC27131a.i.f108496a)) {
            return AbstractC21950l.i.f84835a;
        }
        if (abstractC27131a instanceof AbstractC27131a.q) {
            return new AbstractC21950l.q(((AbstractC27131a.q) abstractC27131a).getTargetGoalType());
        }
        if (abstractC27131a instanceof AbstractC27131a.s) {
            AbstractC27131a.s sVar = (AbstractC27131a.s) abstractC27131a;
            return new AbstractC21950l.s(sVar.getTargetGoalType(), sVar.getValue());
        }
        if (abstractC27131a instanceof AbstractC27131a.l) {
            AbstractC27131a.l lVar = (AbstractC27131a.l) abstractC27131a;
            return new AbstractC21950l.l(lVar.getSavedValue(), lVar.getTargetGoalType());
        }
        if (abstractC27131a instanceof AbstractC27131a.b) {
            return new AbstractC21950l.b(((AbstractC27131a.b) abstractC27131a).getPlanId());
        }
        throw new NoWhenBranchMatchedException();
    }
}
