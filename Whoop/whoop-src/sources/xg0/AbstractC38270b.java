package xg0;

import com.whoop.p057ai.chat.models.AIMessage;
import com.whoop.p057ai.chat.models.AITurn;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xg0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AITurn;", "", "a", "(Lcom/whoop/ai/chat/models/AITurn;)Z", "hasUserContent", "b", "hasVisibleAssistantContent", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38270b {
    /* JADX INFO: renamed from: a */
    public static final boolean m122611a(AITurn aITurn) {
        AbstractC22676k.m65750j(aITurn, "<this>");
        List<AIMessage> messages = aITurn.getMessages();
        if ((messages instanceof Collection) && messages.isEmpty()) {
            return false;
        }
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            if (AbstractC38269a.m122610c((AIMessage) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m122612b(AITurn aITurn) {
        AbstractC22676k.m65750j(aITurn, "<this>");
        List<AIMessage> messages = aITurn.getMessages();
        if ((messages instanceof Collection) && messages.isEmpty()) {
            return false;
        }
        for (AIMessage aIMessage : messages) {
            if (AbstractC38269a.m122609b(aIMessage) && !aIMessage.getItems().isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
