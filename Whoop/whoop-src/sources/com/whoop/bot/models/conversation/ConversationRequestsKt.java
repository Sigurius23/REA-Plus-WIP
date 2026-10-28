package com.whoop.bot.models.conversation;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"SERVICE", "", "VERSION_1", "PATH", "VERSION_2", "PATH_V2", "toChatMessage", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;", "TIMEOUT_CONVERSATION_REQUEST", "", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ConversationRequestsKt {
    public static final String PATH = "ai-conversation-service/v1";
    public static final String PATH_V2 = "ai-conversation-service/v2";
    public static final String SERVICE = "ai-conversation-service";
    private static final long TIMEOUT_CONVERSATION_REQUEST = 120000;
    public static final String VERSION_1 = "v1";
    public static final String VERSION_2 = "v2";

    public static final AiChatMessage toChatMessage(AiChatMessageRequestBody aiChatMessageRequestBody) {
        AbstractC22676k.m65750j(aiChatMessageRequestBody, "<this>");
        return new AiChatMessage(aiChatMessageRequestBody.getContent(), (AiMessageStatus) null, aiChatMessageRequestBody.getRole(), aiChatMessageRequestBody.getId(), (String) null, (List) null, false, Boolean.valueOf(aiChatMessageRequestBody.isSuggestion()), (String) null, (String) null, (List) null, false, 3954, (DefaultConstructorMarker) null);
    }
}
