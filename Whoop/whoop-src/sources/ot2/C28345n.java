package ot2;

import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import jt2.AbstractC21951m;
import jt2.C21942d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ot2.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lot2/n;", "", "Lot2/g;", "initialScreenReducer", "Lot2/h;", "metricSelectionScreenReducer", "Lot2/l;", "sliderScreenReducer", "Lot2/j;", "activitiesScreenReducer", "Lot2/k;", "behaviorsScreenReducer", "<init>", "(Lot2/g;Lot2/h;Lot2/l;Lot2/j;Lot2/k;)V", "Ljt2/m$i;", "domainState", "Ljt2/d;", "accumulator", "Lot2/m;", "a", "(Ljt2/m$i;Ljt2/d;)Lot2/m;", "Ljt2/m;", "b", "(Ljt2/m;Ljt2/d;)Lot2/m;", "Lot2/g;", "Lot2/h;", "c", "Lot2/l;", "d", "Lot2/j;", "e", "Lot2/k;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28345n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28338g initialScreenReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28339h metricSelectionScreenReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28343l sliderScreenReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C28341j activitiesScreenReducer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28342k behaviorsScreenReducer;

    public C28345n(C28338g initialScreenReducer, C28339h metricSelectionScreenReducer, C28343l sliderScreenReducer, C28341j activitiesScreenReducer, C28342k behaviorsScreenReducer) {
        AbstractC22676k.m65750j(initialScreenReducer, "initialScreenReducer");
        AbstractC22676k.m65750j(metricSelectionScreenReducer, "metricSelectionScreenReducer");
        AbstractC22676k.m65750j(sliderScreenReducer, "sliderScreenReducer");
        AbstractC22676k.m65750j(activitiesScreenReducer, "activitiesScreenReducer");
        AbstractC22676k.m65750j(behaviorsScreenReducer, "behaviorsScreenReducer");
        this.initialScreenReducer = initialScreenReducer;
        this.metricSelectionScreenReducer = metricSelectionScreenReducer;
        this.sliderScreenReducer = sliderScreenReducer;
        this.activitiesScreenReducer = activitiesScreenReducer;
        this.behaviorsScreenReducer = behaviorsScreenReducer;
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC28344m m85973a(AbstractC21951m.i domainState, C21942d accumulator) {
        C28347p c28347pM85907m = this.initialScreenReducer.m85907m(domainState, accumulator);
        C28349r c28349rM85919h = this.metricSelectionScreenReducer.m85919h(domainState, accumulator);
        C28351t c28351tM85953l = this.sliderScreenReducer.m85953l(domainState, accumulator);
        C28332a c28332aM85930h = this.activitiesScreenReducer.m85930h(domainState, accumulator);
        C28334c c28334cM85939i = this.behaviorsScreenReducer.m85939i(domainState, accumulator);
        AiContextMetadata aiContextMetadata = domainState.getAiContextMetadata();
        return new AbstractC28344m.i(c28347pM85907m, c28349rM85919h, c28351tM85953l, c28332aM85930h, c28334cM85939i, aiContextMetadata != null ? AbstractC6219a.m18523a(aiContextMetadata) : null);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC28344m m85974b(AbstractC21951m domainState, C21942d accumulator) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(accumulator, "accumulator");
        if (domainState.equals(AbstractC21951m.e.f84859a)) {
            return AbstractC28344m.e.f114323a;
        }
        if (domainState instanceof AbstractC21951m.i) {
            return m85973a((AbstractC21951m.i) domainState, accumulator);
        }
        if (domainState.equals(AbstractC21951m.d.f84858a)) {
            return AbstractC28344m.d.f114322a;
        }
        if (domainState.equals(AbstractC21951m.h.f84862a)) {
            return AbstractC28344m.h.f114334a;
        }
        if (domainState.equals(AbstractC21951m.g.f84861a)) {
            return AbstractC28344m.g.f114333a;
        }
        if (domainState.equals(AbstractC21951m.f.f84860a)) {
            return new AbstractC28344m.f(accumulator.getPlanId(), accumulator.getIsCustomized(), AbstractC28352u.m86023a(accumulator), accumulator.m62551r(), accumulator.m62550q(), accumulator.m62549p(), accumulator.getSource(), accumulator.getPresetPlanCategory(), accumulator.getTemplateId());
        }
        if (domainState.equals(AbstractC21951m.b.f84856a)) {
            return AbstractC28344m.b.f114320a;
        }
        if (domainState.equals(AbstractC21951m.c.f84857a)) {
            return AbstractC28344m.c.f114321a;
        }
        if (domainState instanceof AbstractC21951m.a) {
            return new AbstractC28344m.a(((AbstractC21951m.a) domainState).getPlanId());
        }
        throw new NoWhenBranchMatchedException();
    }
}
