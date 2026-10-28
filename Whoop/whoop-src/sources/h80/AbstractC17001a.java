package h80;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.TrialPlanPickerModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h80.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "", "a", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;)Ljava/lang/String;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17001a {
    /* JADX INFO: renamed from: a */
    public static final String m47874a(ActivationFlowStepModel activationFlowStepModel) {
        AbstractC22676k.m65750j(activationFlowStepModel, "<this>");
        if (activationFlowStepModel instanceof TrialPlanPickerModel) {
            return "20_dollar_discount";
        }
        return null;
    }
}
