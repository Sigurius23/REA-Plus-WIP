package xo0;

import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingHighlightID;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepID;
import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingStepModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.AbstractC12249e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import po0.C29397a;
import vo0.C36224b;
import wb3.AbstractC37056f;
import yo0.C39684f;

/* JADX INFO: renamed from: xo0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lxo0/c;", "", "Lpo0/a;", "analyticHelper", "<init>", "(Lpo0/a;)V", "Lvo0/b;", "domainResult", "Ll83/a0;", "b", "(Lvo0/b;)V", "Lyo0/f;", "a", "(Lvo0/b;)Lyo0/f;", "Lpo0/a;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38491c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29397a analyticHelper;

    public C38491c(C29397a analyticHelper) {
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        this.analyticHelper = analyticHelper;
    }

    /* JADX INFO: renamed from: b */
    private final void m123329b(C36224b domainResult) {
        CoachOnboardingStepModel coachOnboardingStepModel = (CoachOnboardingStepModel) AbstractC25265s.m74102I0(domainResult.getCurrentStepIndex(), domainResult.m115349h());
        if (coachOnboardingStepModel != null) {
            String strM89574h = this.analyticHelper.m89574h(coachOnboardingStepModel.getStepId());
            if (strM89574h.length() > 0) {
                this.analyticHelper.m89575k(new AbstractC12249e.g(strM89574h, domainResult.getCurrentStepIndex()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C39684f m123330a(C36224b domainResult) {
        CoachOnboardingHighlightID coachOnboardingHighlightID;
        CoachOnboardingStepID stepId;
        boolean z4;
        CoachOnboardingStepID stepId2;
        boolean showBottomBar;
        Boolean autoAdvance;
        Boolean showsBottomBar;
        String buttonText;
        List<String> lines;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult.getIsCompleted()) {
            return new C39684f(false, null, null, null, false, false, null, false, false, 510, null);
        }
        boolean isLoading = domainResult.getIsLoading();
        List arrayList = C25271y.f99162w;
        if (isLoading) {
            return new C39684f(true, null, arrayList, null, true, true, null, false, false, 384, null);
        }
        if (domainResult.getError() != null) {
            return new C39684f(true, null, AbstractC37056f.m118958J(AbstractC8693b.m21278l("Error occurred")), AbstractC8693b.m21278l("Retry"), true, false, domainResult.getError(), false, false, 384, null);
        }
        if (!domainResult.m115348g()) {
            return new C39684f(false, null, null, null, false, false, null, false, false, 510, null);
        }
        m123329b(domainResult);
        CoachOnboardingStepModel coachOnboardingStepModelM115344c = domainResult.m115344c();
        TextResource textResourceM21278l = null;
        if (coachOnboardingStepModelM115344c != null && (highlightID = coachOnboardingStepModelM115344c.getHighlight()) != null) {
            coachOnboardingHighlightID = highlightID;
        } else if (coachOnboardingStepModelM115344c == null || (stepId = coachOnboardingStepModelM115344c.getStepId()) == null) {
            coachOnboardingHighlightID = null;
        } else {
            CoachOnboardingHighlightID highlightID = stepId.getHighlightID();
            coachOnboardingHighlightID = highlightID;
        }
        if (coachOnboardingStepModelM115344c != null && (lines = coachOnboardingStepModelM115344c.getLines()) != null) {
            List<String> list = lines;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8693b.m21278l((String) it.next()));
            }
        }
        List list2 = arrayList;
        if (coachOnboardingStepModelM115344c != null && (buttonText = coachOnboardingStepModelM115344c.getButtonText()) != null) {
            textResourceM21278l = AbstractC8693b.m21278l(buttonText);
        }
        TextResource textResource = textResourceM21278l;
        boolean zBooleanValue = false;
        if (coachOnboardingStepModelM115344c == null || (showsBottomBar = coachOnboardingStepModelM115344c.getShowsBottomBar()) == null) {
            if (coachOnboardingStepModelM115344c == null || (stepId2 = coachOnboardingStepModelM115344c.getStepId()) == null) {
                z4 = false;
            } else {
                showBottomBar = stepId2.getShowBottomBar();
            }
            if (coachOnboardingStepModelM115344c != null && (autoAdvance = coachOnboardingStepModelM115344c.getAutoAdvance()) != null) {
                zBooleanValue = autoAdvance.booleanValue();
            }
            return new C39684f(true, coachOnboardingHighlightID, list2, textResource, z4, false, null, false, zBooleanValue, 128, null);
        }
        showBottomBar = showsBottomBar.booleanValue();
        z4 = showBottomBar;
        if (coachOnboardingStepModelM115344c != null) {
            zBooleanValue = autoAdvance.booleanValue();
        }
        return new C39684f(true, coachOnboardingHighlightID, list2, textResource, z4, false, null, false, zBooleanValue, 128, null);
    }
}
