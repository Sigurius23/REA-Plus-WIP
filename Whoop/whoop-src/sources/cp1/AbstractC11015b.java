package cp1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.hormonalinsights.onboarding.domain.models.FlowProgress;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: cp1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "Lcp1/c;", "a", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcp1/c;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11015b {
    /* JADX INFO: renamed from: a */
    public static final C11016c m29571a(FlowProgress flowProgress) {
        if (flowProgress != null) {
            return new C11016c(AbstractC8693b.m21278l(flowProgress.getText()), flowProgress.getScreenCount(), flowProgress.getMaxScreenCount());
        }
        return null;
    }
}
