package j70;

import b80.C2792c;
import c80.AbstractC4300a;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.CreatePasswordStepModel;
import com.whoop.activation.domain.models.steps.EnterEmailStepModel;
import com.whoop.activation.domain.models.steps.EnterYourPasswordStepModel;
import com.whoop.activation.domain.models.steps.ReferAFriendCodesModel;
import f70.InterfaceC14176e;
import h80.C17003c;
import h80.InterfaceC17002b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j70.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lj70/c;", "", "Lh80/c;", "analyticsHelper", "Lb80/c;", "iajfAnalyticsHelper", "<init>", "(Lh80/c;Lb80/c;)V", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "currentScreen", "Lf70/e$b;", "prevDomainResult", "", "isSkipAction", "Ll83/a0;", "a", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lf70/e$b;Z)V", "result", "b", "(Lf70/e$b;)V", "Lh80/c;", "Lb80/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21391c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2792c iajfAnalyticsHelper;

    public C21391c(C17003c analyticsHelper, C2792c iajfAnalyticsHelper) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(iajfAnalyticsHelper, "iajfAnalyticsHelper");
        this.analyticsHelper = analyticsHelper;
        this.iajfAnalyticsHelper = iajfAnalyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    public final void m60040a(ActivationFlowStepModel currentScreen, InterfaceC14176e.b prevDomainResult, boolean isSkipAction) {
        String analyticsName;
        String str;
        AbstractC22676k.m65750j(prevDomainResult, "prevDomainResult");
        if (currentScreen != null && (analyticsName = currentScreen.getAnalyticsName()) != null) {
            C17003c c17003c = this.analyticsHelper;
            String str2 = (!(currentScreen instanceof ReferAFriendCodesModel) || isSkipAction) ? "cta" : "share_your_code";
            if ((currentScreen instanceof EnterYourPasswordStepModel) || (currentScreen instanceof EnterEmailStepModel) || (currentScreen instanceof CreatePasswordStepModel)) {
                str = "next";
            } else {
                str = isSkipAction ? "skip" : null;
            }
            c17003c.m47941p(new InterfaceC17002b.i(analyticsName, null, str2, str, null, null, 50, null));
        }
        this.iajfAnalyticsHelper.m7948p(currentScreen, prevDomainResult.getMemberInfo(), prevDomainResult.getSignUpSource(), isSkipAction);
    }

    /* JADX INFO: renamed from: b */
    public final void m60041b(InterfaceC14176e.b result) {
        AbstractC22676k.m65750j(result, "result");
        if (AbstractC4300a.m13542a(result.getSignUpSource())) {
            this.iajfAnalyticsHelper.m7950r(result, result.getSignUpSource());
        }
    }
}
