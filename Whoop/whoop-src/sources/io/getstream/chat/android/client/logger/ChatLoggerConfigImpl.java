package io.getstream.chat.android.client.logger;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/logger/ChatLoggerConfigImpl;", "Lio/getstream/chat/android/client/logger/ChatLoggerConfig;", "level", "Lio/getstream/chat/android/client/logger/ChatLogLevel;", "handler", "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;", "<init>", "(Lio/getstream/chat/android/client/logger/ChatLogLevel;Lio/getstream/chat/android/client/logger/ChatLoggerHandler;)V", "getLevel", "()Lio/getstream/chat/android/client/logger/ChatLogLevel;", "getHandler", "()Lio/getstream/chat/android/client/logger/ChatLoggerHandler;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChatLoggerConfigImpl implements ChatLoggerConfig {
    private final ChatLoggerHandler handler;
    private final ChatLogLevel level;

    public ChatLoggerConfigImpl(ChatLogLevel level, ChatLoggerHandler chatLoggerHandler) {
        AbstractC22676k.m65750j(level, "level");
        this.level = level;
        this.handler = chatLoggerHandler;
    }

    public static /* synthetic */ ChatLoggerConfigImpl copy$default(ChatLoggerConfigImpl chatLoggerConfigImpl, ChatLogLevel chatLogLevel, ChatLoggerHandler chatLoggerHandler, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            chatLogLevel = chatLoggerConfigImpl.level;
        }
        if ((i13 & 2) != 0) {
            chatLoggerHandler = chatLoggerConfigImpl.handler;
        }
        return chatLoggerConfigImpl.copy(chatLogLevel, chatLoggerHandler);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatLogLevel getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatLoggerHandler getHandler() {
        return this.handler;
    }

    public final ChatLoggerConfigImpl copy(ChatLogLevel level, ChatLoggerHandler handler) {
        AbstractC22676k.m65750j(level, "level");
        return new ChatLoggerConfigImpl(level, handler);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatLoggerConfigImpl)) {
            return false;
        }
        ChatLoggerConfigImpl chatLoggerConfigImpl = (ChatLoggerConfigImpl) other;
        return this.level == chatLoggerConfigImpl.level && AbstractC22676k.m65745e(this.handler, chatLoggerConfigImpl.handler);
    }

    @Override // io.getstream.chat.android.client.logger.ChatLoggerConfig
    public final ChatLoggerHandler getHandler() {
        return this.handler;
    }

    @Override // io.getstream.chat.android.client.logger.ChatLoggerConfig
    public final ChatLogLevel getLevel() {
        return this.level;
    }

    public final int hashCode() {
        int iHashCode = this.level.hashCode() * 31;
        ChatLoggerHandler chatLoggerHandler = this.handler;
        return iHashCode + (chatLoggerHandler == null ? 0 : chatLoggerHandler.hashCode());
    }

    public final String toString() {
        return "ChatLoggerConfigImpl(level=" + this.level + ", handler=" + this.handler + ")";
    }
}
