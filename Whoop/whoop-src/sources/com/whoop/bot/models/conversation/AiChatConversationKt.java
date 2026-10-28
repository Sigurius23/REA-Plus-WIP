package com.whoop.bot.models.conversation;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m65681d2 = {"latestAssistantResponse", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "Lcom/whoop/bot/models/conversation/AiChatConversation;", "getLatestAssistantResponse", "(Lcom/whoop/bot/models/conversation/AiChatConversation;)Lcom/whoop/bot/models/conversation/AiChatMessage;", "replaceLatestResponse", "response", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AiChatConversationKt {
    public static final AiChatMessage getLatestAssistantResponse(AiChatConversation aiChatConversation) {
        AiChatMessage aiChatMessagePrevious;
        AbstractC22676k.m65750j(aiChatConversation, "<this>");
        List<AiChatMessage> messages = aiChatConversation.getMessages();
        ListIterator<AiChatMessage> listIterator = messages.listIterator(messages.size());
        while (listIterator.hasPrevious()) {
            aiChatMessagePrevious = listIterator.previous();
            if (AiChatMessageKt.isAssistant(aiChatMessagePrevious)) {
                return aiChatMessagePrevious;
            }
        }
        aiChatMessagePrevious = null;
        return aiChatMessagePrevious;
    }

    public static final AiChatConversation replaceLatestResponse(AiChatConversation aiChatConversation, AiChatMessage response) {
        int iNextIndex;
        AbstractC22676k.m65750j(aiChatConversation, "<this>");
        AbstractC22676k.m65750j(response, "response");
        List<AiChatMessage> messages = aiChatConversation.getMessages();
        ListIterator<AiChatMessage> listIterator = messages.listIterator(messages.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (AiChatMessageKt.isAssistant(listIterator.previous())) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return aiChatConversation;
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(aiChatConversation.getMessages());
        arrayListM74097F1.set(iNextIndex, response);
        return AiChatConversation.copy$default(aiChatConversation, null, arrayListM74097F1, null, null, null, null, null, 125, null);
    }
}
