package com.whoop.p057ai.chat.api;

import com.whoop.bot.models.conversation.AiChatImageUploadResponse;
import com.whoop.bot.models.conversation.ImageUploadRequestBody;
import com.whoop.p057ai.chat.models.AIConversation;
import com.whoop.p057ai.chat.models.AIConversationMetadata;
import com.whoop.p057ai.chat.models.AITurn;
import com.whoop.p057ai.chat.models.AiChatHistoryResponse;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.C34820i0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37281l;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37286q;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u000bJ*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\r\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J*\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010$\u001a\u00020\"H§@¢\u0006\u0004\b%\u0010&J \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010'\u001a\u00020\u0002H§@¢\u0006\u0004\b(\u0010\u0007J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010\u000bJ \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b*\u0010\u0007J*\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b+\u0010\u000bJ4\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020,H§@¢\u0006\u0004\b.\u0010/J \u00101\u001a\b\u0012\u0004\u0012\u0002000\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b1\u0010\u0007J4\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u00102\u001a\u00020\u0002H§@¢\u0006\u0004\b3\u00104J4\u00107\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u000206H§@¢\u0006\u0004\b7\u00108J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0004H§@¢\u0006\u0004\b:\u0010;J \u0010<\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b<\u0010\u0007J2\u0010@\u001a\u00020?2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b@\u00104¨\u0006AÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/ai/chat/api/AiChatApi;", "", "", "fingerprint", "Lpg3/v0;", "Lcom/whoop/ai/chat/models/AIConversation;", "getConversation", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "turnId", "Lcom/whoop/ai/chat/models/AITurn;", "getConversationTurn", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;", "body", "createConversation", "(Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;", "startNewConversation", "(Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;", "createConversationTurn", "(Ljava/lang/String;Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;", "Ll83/a0;", "markTurnAsSeen", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;Lq83/d;)Ljava/lang/Object;", "markTurnEndSeen", "Lcom/whoop/ai/chat/api/LastViewedTurnRequestBody;", "markLastViewedTurn", "(Ljava/lang/String;Lcom/whoop/ai/chat/api/LastViewedTurnRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;", "Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;", "uploadImage", "(Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;Lq83/d;)Ljava/lang/Object;", "Lud3/i0;", "metadata", "files", "uploadFile", "(Lud3/i0;Lud3/i0;Lq83/d;)Ljava/lang/Object;", "fileId", "deleteFile", "stopConversationTurn", "stopAllTurns", "dismissConversationTurn", "Lcom/whoop/ai/chat/api/TurnFeedbackBody;", "feedback", "submitTurnFeedback", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/api/TurnFeedbackBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/api/AiSuggestionsResponse;", "getSuggestions", "actionId", "createMxmSupportTicket", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "recommendationId", "Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;", "commitRecommendation", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ai/chat/models/AiChatHistoryResponse;", "getConversations", "(Lq83/d;)Ljava/lang/Object;", "deleteConversation", "sourceId", "sourceType", "Lcom/whoop/ai/chat/models/AIConversationMetadata;", "getConversationMetadata", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface AiChatApi {
    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/recommendation/{recommendationId}")
    Object commitRecommendation(@InterfaceC37288s("fingerprint") String str, @InterfaceC37288s("recommendationId") String str2, @InterfaceC37270a CommitRecommendationRequestBody commitRecommendationRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation")
    Object createConversation(@InterfaceC37270a AiCreateConversationRequestBody aiCreateConversationRequestBody, InterfaceC30057d<? super C29218v0<AIConversation>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/turn")
    Object createConversationTurn(@InterfaceC37288s("fingerprint") String str, @InterfaceC37270a AiCreateTurnRequestBody aiCreateTurnRequestBody, InterfaceC30057d<? super C29218v0<AITurn>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/action/{action_id}")
    Object createMxmSupportTicket(@InterfaceC37288s("fingerprint") String str, @InterfaceC37288s("turn_id") String str2, @InterfaceC37288s("action_id") String str3, InterfaceC30057d<? super C29218v0<AITurn>> interfaceC30057d);

    @InterfaceC37271b("ai-conversation-bff/v1/conversation/{fingerprint}")
    Object deleteConversation(@InterfaceC37288s("fingerprint") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("ai-conversation-bff/v1/files/{fileId}")
    Object deleteFile(@InterfaceC37288s("fileId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/dismiss")
    Object dismissConversationTurn(@InterfaceC37288s("fingerprint") String str, @InterfaceC37288s("turn_id") String str2, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-bff/v1/conversation")
    Object getConversation(@InterfaceC37289t("fingerprint") String str, InterfaceC30057d<? super C29218v0<AIConversation>> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-bff/v1/conversation/{fingerprint}/metadata")
    Object getConversationMetadata(@InterfaceC37288s("fingerprint") String str, @InterfaceC37289t("sourceId") String str2, @InterfaceC37289t("sourceType") String str3, InterfaceC30057d<? super AIConversationMetadata> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turnId}")
    Object getConversationTurn(@InterfaceC37288s("fingerprint") String str, @InterfaceC37288s("turnId") String str2, InterfaceC30057d<? super C29218v0<AITurn>> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-bff/v1/conversations")
    Object getConversations(InterfaceC30057d<? super C29218v0<AiChatHistoryResponse>> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-bff/v1/conversation/{fingerprint}/suggestions")
    Object getSuggestions(@InterfaceC37288s("fingerprint") String str, InterfaceC30057d<? super C29218v0<AiSuggestionsResponse>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/last-viewed-turn")
    Object markLastViewedTurn(@InterfaceC37288s("fingerprint") String str, @InterfaceC37270a LastViewedTurnRequestBody lastViewedTurnRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/seen")
    Object markTurnAsSeen(@InterfaceC37288s("fingerprint") String str, @InterfaceC37288s("turn_id") String str2, @InterfaceC37270a MarkTurnAsSeenRequestBody markTurnAsSeenRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/end-seen")
    Object markTurnEndSeen(@InterfaceC37288s("fingerprint") String str, @InterfaceC37288s("turn_id") String str2, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/no-fingerprint")
    Object startNewConversation(@InterfaceC37270a AiStartNewConversationRequestBody aiStartNewConversationRequestBody, InterfaceC30057d<? super C29218v0<AIConversation>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/stop")
    Object stopAllTurns(@InterfaceC37288s("fingerprint") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/stop")
    Object stopConversationTurn(@InterfaceC37288s("fingerprint") String str, @InterfaceC37288s("turn_id") String str2, InterfaceC30057d<? super C29218v0<AITurn>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/feedback")
    Object submitTurnFeedback(@InterfaceC37288s("fingerprint") String str, @InterfaceC37288s("turn_id") String str2, @InterfaceC37270a TurnFeedbackBody turnFeedbackBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v2/files")
    @InterfaceC37281l
    Object uploadFile(@InterfaceC37286q C34820i0 c34820i0, @InterfaceC37286q C34820i0 c34820i1, InterfaceC30057d<? super C29218v0<AiChatImageUploadResponse>> interfaceC30057d);

    @InterfaceC37284o("ai-conversation-bff/v1/files")
    Object uploadImage(@InterfaceC37270a ImageUploadRequestBody imageUploadRequestBody, InterfaceC30057d<? super C29218v0<AiChatImageUploadResponse>> interfaceC30057d);
}
