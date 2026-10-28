package f70;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.domain.models.steps.CountrySelectionStepModel;
import com.whoop.activation.domain.models.steps.GiftStepModel;
import com.whoop.activation.domain.models.steps.NotificationsStepModel;
import com.whoop.activation.domain.models.steps.PaymentMethodStepModel;
import com.whoop.activation.domain.models.steps.PlanPickerOptionKt;
import com.whoop.activation.domain.models.steps.PrivacyConsentModel;
import com.whoop.activation.domain.models.steps.ReferAFriendCodesModel;
import com.whoop.activation.domain.models.steps.StateSelectionStepModel;
import com.whoop.activation.domain.models.steps.TrialPlanOption;
import com.whoop.activation.domain.models.steps.TrialPlanPickerModel;
import com.whoop.activation.domain.models.steps.UpcycleJoinTodayModel;
import com.whoop.activation.domain.models.steps.UpcyclePlanPickerModel;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f70.y0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m65681d2 = {"Lf70/y0;", "", "<init>", "()V", "Lf70/e$b;", "prevDomainResult", "", "b", "(Lf70/e$b;)I", "a", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14217y0 {
    /* JADX INFO: renamed from: a */
    public final int m40657a(InterfaceC14176e.b prevDomainResult) {
        TrialPlanOption trialPlanOption;
        AbstractC22676k.m65750j(prevDomainResult, "prevDomainResult");
        int currentStepIndex = prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex();
        List<ActivationFlowStepModel> listM40428m = prevDomainResult.m40428m();
        ActivationFlowStepModel activationFlowStepModel = listM40428m != null ? (ActivationFlowStepModel) AbstractC25265s.m74102I0(currentStepIndex, listM40428m) : null;
        List<ActivationFlowStepModel> listM40428m2 = prevDomainResult.m40428m();
        ActivationFlowStepModel activationFlowStepModel2 = listM40428m2 != null ? (ActivationFlowStepModel) AbstractC25265s.m74102I0(currentStepIndex + 1, listM40428m2) : null;
        C14201q0 memberInfo = prevDomainResult.getMemberInfo();
        if ((activationFlowStepModel instanceof CountrySelectionStepModel) && (activationFlowStepModel2 instanceof StateSelectionStepModel) && !AbstractC22676k.m65745e(memberInfo.getCountry(), "US")) {
            return 2;
        }
        if ((activationFlowStepModel instanceof GiftStepModel) && (activationFlowStepModel2 instanceof ReferAFriendCodesModel) && memberInfo.getSelectedRafCodesAmount() == 0) {
            return 2;
        }
        if ((activationFlowStepModel instanceof PrivacyConsentModel) && (activationFlowStepModel2 instanceof UpcyclePlanPickerModel) && memberInfo.m40571x() == null) {
            return 3;
        }
        if ((activationFlowStepModel instanceof PaymentMethodStepModel) && (activationFlowStepModel2 instanceof UpcycleJoinTodayModel) && memberInfo.m40571x() == null) {
            return 2;
        }
        if ((activationFlowStepModel2 instanceof UpcycleJoinTodayModel) && memberInfo.getCommitmentType() == CommitmentType.TRIAL) {
            return 2;
        }
        if ((activationFlowStepModel instanceof UpcycleJoinTodayModel) && (activationFlowStepModel2 instanceof PaymentMethodStepModel)) {
            return 2;
        }
        return ((activationFlowStepModel instanceof TrialPlanPickerModel) && (trialPlanOption = (TrialPlanOption) PlanPickerOptionKt.selectedFor(((TrialPlanPickerModel) activationFlowStepModel).getPlanOptions(), memberInfo.getCommitmentType())) != null && trialPlanOption.getShouldSkipNextScreen()) ? 2 : 1;
    }

    /* JADX INFO: renamed from: b */
    public final int m40658b(InterfaceC14176e.b prevDomainResult) {
        AbstractC22676k.m65750j(prevDomainResult, "prevDomainResult");
        int currentStepIndex = prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex();
        List<ActivationFlowStepModel> listM40428m = prevDomainResult.m40428m();
        ActivationFlowStepModel activationFlowStepModel = listM40428m != null ? (ActivationFlowStepModel) AbstractC25265s.m74102I0(currentStepIndex, listM40428m) : null;
        List<ActivationFlowStepModel> listM40428m2 = prevDomainResult.m40428m();
        ActivationFlowStepModel activationFlowStepModel2 = listM40428m2 != null ? (ActivationFlowStepModel) AbstractC25265s.m74102I0(currentStepIndex - 1, listM40428m2) : null;
        String country = prevDomainResult.getMemberInfo().getCountry();
        if ((activationFlowStepModel instanceof NotificationsStepModel) && (activationFlowStepModel2 instanceof UpcycleJoinTodayModel)) {
            return -2;
        }
        if ((activationFlowStepModel instanceof PaymentMethodStepModel) && (activationFlowStepModel2 instanceof UpcycleJoinTodayModel)) {
            return -2;
        }
        return (!(activationFlowStepModel2 instanceof StateSelectionStepModel) || AbstractC22676k.m65745e(country, "US")) ? -1 : -2;
    }
}
