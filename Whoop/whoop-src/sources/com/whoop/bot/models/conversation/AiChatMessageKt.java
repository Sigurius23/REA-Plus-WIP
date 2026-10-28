package com.whoop.bot.models.conversation;

import nl0.EnumC26800b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"isUser", "", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z", "isAssistant", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AiChatMessageKt {
    public static final boolean isAssistant(AiChatMessage aiChatMessage) {
        AbstractC22676k.m65750j(aiChatMessage, "<this>");
        return AbstractC22676k.m65745e(aiChatMessage.getRole(), EnumC26800b.ASSISTANT.getValue());
    }

    public static final boolean isUser(AiChatMessage aiChatMessage) {
        AbstractC22676k.m65750j(aiChatMessage, "<this>");
        return AbstractC22676k.m65745e(aiChatMessage.getRole(), EnumC26800b.USER.getValue());
    }
}
