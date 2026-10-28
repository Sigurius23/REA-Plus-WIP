package com.whoop.bot.api;

import com.whoop.bot.models.conversation.AiChatConversation;
import com.whoop.bot.models.conversation.AiChatMessage;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.bot.models.history.ConversationHistory;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ.\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/bot/api/AiConversationApi;", "", "", "messageId", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "aiMessageFeedback", "Lpg3/v0;", "Ll83/a0;", "postFeedback", "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lq83/d;)Ljava/lang/Object;", "conversationId", "actionId", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "postMxmCreateTicket", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/bot/models/history/ConversationHistory;", "getHistory", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/bot/models/conversation/AiChatConversation;", "getPastConversation", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deletePastConversation", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface AiConversationApi {
    @InterfaceC37271b("ai-conversation-service/v1/conversations/{conversationId}")
    Object deletePastConversation(@InterfaceC37288s("conversationId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-service/v1/conversations")
    Object getHistory(InterfaceC30057d<? super ConversationHistory> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-service/v2/conversation/{conversationId}")
    Object getPastConversation(@InterfaceC37288s("conversationId") String str, InterfaceC30057d<? super AiChatConversation> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-service/v1/messages/{messageId}/feedback")
    Object postFeedback(@InterfaceC37288s("messageId") String str, @InterfaceC37270a AiMessageFeedback aiMessageFeedback, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-service/v1/conversation/{conversationId}/message/{messageId}/action/{actionId}")
    Object postMxmCreateTicket(@InterfaceC37288s("conversationId") String str, @InterfaceC37288s("messageId") String str2, @InterfaceC37288s("actionId") String str3, InterfaceC30057d<? super AiChatMessage> interfaceC30057d);
}
