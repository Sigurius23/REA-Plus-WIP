package p720m91;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m91.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", "action", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "a", "(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)Ljava/lang/Object;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25299h {
    /* JADX INFO: renamed from: a */
    public static final Object m74262a(Object action, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(action, "action");
        return (analyticEventModel == null || (action instanceof DesignItemInteraction)) ? action : new DesignItemInteraction(action, analyticEventModel);
    }
}
