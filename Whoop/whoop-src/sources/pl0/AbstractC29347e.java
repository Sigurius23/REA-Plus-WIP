package pl0;

import com.whoop.bot.models.conversation.AiChatConversation;
import com.whoop.bot.models.conversation.AiChatMessage;
import com.whoop.bot.models.conversation.AiChatMessageKt;
import com.whoop.bot.models.conversation.AiMessageStatus;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.ListIterator;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: pl0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AiChatMessage;", "message", "", "f", "(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z", "e", "Lcom/whoop/bot/models/conversation/AiChatConversation;", "conversation", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/bot/models/conversation/AiChatConversation;)Z", "", "index", "g", "(ILcom/whoop/bot/models/conversation/AiChatConversation;)Z", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29347e {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final boolean m89445e(AiChatMessage aiChatMessage) {
        return aiChatMessage.getMessageStatus() == AiMessageStatus.FAILED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final boolean m89446f(AiChatMessage aiChatMessage) {
        return aiChatMessage.getMessageStatus() == AiMessageStatus.ACTIVE && aiChatMessage.getContent().length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final boolean m89447g(int i13, AiChatConversation aiChatConversation) {
        return i13 == AbstractC37056f.m118951C(aiChatConversation.getMessages());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final boolean m89448h(AiChatConversation aiChatConversation) {
        AiChatMessage aiChatMessagePrevious;
        List<AiChatMessage> messages = aiChatConversation.getMessages();
        ListIterator<AiChatMessage> listIterator = messages.listIterator(messages.size());
        do {
            if (!listIterator.hasPrevious()) {
                aiChatMessagePrevious = null;
                break;
            }
            aiChatMessagePrevious = listIterator.previous();
        } while (!AiChatMessageKt.isAssistant(aiChatMessagePrevious));
        AiChatMessage aiChatMessage = aiChatMessagePrevious;
        return (aiChatMessage != null ? aiChatMessage.getMessageStatus() : null) == AiMessageStatus.ACTIVE;
    }
}
