package p720m91;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.whoopaction.domain.models.Action;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m91.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/item/DesignItemInteraction;", "Lkotlin/Function1;", "", "Ll83/a0;", "onEmit", "Lcom/whoop/whoopaction/domain/models/Action;", "wrapAction", "a", "(Lcom/whoop/design/item/DesignItemInteraction;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25300i {
    /* JADX INFO: renamed from: a */
    public static final void m74263a(DesignItemInteraction designItemInteraction, Function1 onEmit, Function1 wrapAction) {
        AbstractC22676k.m65750j(designItemInteraction, "<this>");
        AbstractC22676k.m65750j(onEmit, "onEmit");
        AbstractC22676k.m65750j(wrapAction, "wrapAction");
        AnalyticEventModel analyticEvent = designItemInteraction.getAnalyticEvent();
        if (analyticEvent != null) {
            AbstractC13673n.m38578y(null, analyticEvent, onEmit);
        }
        Object actionArgument = designItemInteraction.getActionArgument();
        if (actionArgument instanceof Action) {
            onEmit.invoke(wrapAction.invoke(actionArgument));
        } else if (actionArgument != null) {
            onEmit.invoke(actionArgument);
        }
    }
}
