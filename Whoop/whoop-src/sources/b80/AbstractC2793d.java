package b80;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import f70.EnumC14168b0;
import f70.InterfaceC14176e;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: b80.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lf70/e$b;", "", "d", "(Lf70/e$b;)Z", "", "c", "(Lf70/e$b;)Ljava/lang/String;", "currentScreenAnalyticsName", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2793d {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final String m7955c(InterfaceC14176e.b bVar) {
        ActivationFlowStepModel activationFlowStepModel;
        List<ActivationFlowStepModel> listM40428m = bVar.m40428m();
        if (listM40428m == null || (activationFlowStepModel = (ActivationFlowStepModel) AbstractC25265s.m74102I0(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex(), listM40428m)) == null) {
            return null;
        }
        return activationFlowStepModel.getAnalyticsName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final boolean m7956d(InterfaceC14176e.b bVar) {
        return bVar.getFullScreenState() == EnumC14168b0.CONTENT && bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getStepTotal() > 0;
    }
}
