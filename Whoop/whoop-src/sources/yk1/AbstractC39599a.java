package yk1;

import com.whoop.design.item.DesignItemInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.DialPhoneNumberParameters;
import com.whoop.whoopaction.domain.models.OSAction;
import com.whoop.whoopaction.domain.models.OSActionParameters;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yk1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Lcom/whoop/whoopaction/domain/models/Action;", "b", "(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/Action;", "", "a", "(Ljava/lang/Object;)Ljava/lang/String;", "help-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39599a {
    /* JADX INFO: renamed from: a */
    public static final String m126481a(Object obj) {
        AbstractC22676k.m65750j(obj, "<this>");
        Action actionM126482b = m126482b(obj);
        OSAction oSAction = actionM126482b instanceof OSAction ? (OSAction) actionM126482b : null;
        OSActionParameters parameters = oSAction != null ? oSAction.getParameters() : null;
        DialPhoneNumberParameters dialPhoneNumberParameters = parameters instanceof DialPhoneNumberParameters ? (DialPhoneNumberParameters) parameters : null;
        if (dialPhoneNumberParameters != null) {
            return dialPhoneNumberParameters.getPhoneNumber();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Action m126482b(Object obj) {
        AbstractC22676k.m65750j(obj, "<this>");
        if (obj instanceof C27256h) {
            return ((C27256h) obj).getAction();
        }
        if (!(obj instanceof DesignItemInteraction)) {
            if (obj instanceof Action) {
                return (Action) obj;
            }
            return null;
        }
        Object actionArgument = ((DesignItemInteraction) obj).getActionArgument();
        if (actionArgument != null) {
            return m126482b(actionArgument);
        }
        return null;
    }
}
