package p720m91;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.StateClearAction;
import com.whoop.whoopaction.domain.models.StatePopAction;
import com.whoop.whoopaction.domain.models.StatePushAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sw2.AbstractC33054a;
import u82.AbstractC34650k;

/* JADX INFO: renamed from: m91.d0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/Action;", "a", "(Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/navigation/models/GenericInteraction;", "b", "(Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/Action;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25294d0 {
    /* JADX INFO: renamed from: a */
    public static final Action m74257a(Action action) {
        AbstractC22676k.m65750j(action, "<this>");
        if ((action instanceof StateUpdateAction) || (action instanceof StateClearAction) || (action instanceof StatePushAction) || (action instanceof StatePopAction)) {
            return action;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Action m74258b(GenericInteraction genericInteraction) {
        Action actionM104670a;
        AbstractC22676k.m65750j(genericInteraction, "<this>");
        if (genericInteraction.getModal() == null && genericInteraction.getNavigation() == null && genericInteraction.getDismissEvent() == null && (actionM104670a = AbstractC33054a.m104670a(genericInteraction, AbstractC34650k.m109496c())) != null) {
            return m74257a(actionM104670a);
        }
        return null;
    }
}
