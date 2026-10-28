package xg0;

import com.whoop.p057ai.chat.models.AIMessage;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.MessageType;
import nl0.EnumC26800b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xg0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\n\u001a\u00020\u0005*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AIMessage;", "Lnl0/b;", "a", "(Lcom/whoop/ai/chat/models/AIMessage;)Lnl0/b;", "chatMessageRole", "", "c", "(Lcom/whoop/ai/chat/models/AIMessage;)Z", "isUser", "b", "isAssistant", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38269a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static final EnumC26800b m122608a(AIMessage aIMessage) {
        AbstractC22676k.m65750j(aIMessage, "<this>");
        String role = aIMessage.getRole();
        switch (role.hashCode()) {
            case -887328209:
                if (role.equals(MessageType.SYSTEM)) {
                    return EnumC26800b.SYSTEM;
                }
                break;
            case 3565976:
                if (role.equals("tool")) {
                    return EnumC26800b.TOOL;
                }
                break;
            case 3599307:
                if (role.equals(UserState.Sources.USER)) {
                    return EnumC26800b.USER;
                }
                break;
            case 1429828318:
                if (role.equals("assistant")) {
                    return EnumC26800b.ASSISTANT;
                }
                break;
        }
        return EnumC26800b.SYSTEM;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m122609b(AIMessage aIMessage) {
        AbstractC22676k.m65750j(aIMessage, "<this>");
        return AbstractC22676k.m65745e(aIMessage.getRole(), EnumC26800b.ASSISTANT.getValue());
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m122610c(AIMessage aIMessage) {
        AbstractC22676k.m65750j(aIMessage, "<this>");
        return AbstractC22676k.m65745e(aIMessage.getRole(), EnumC26800b.USER.getValue());
    }
}
