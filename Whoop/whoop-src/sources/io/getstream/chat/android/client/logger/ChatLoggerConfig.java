package io.getstream.chat.android.client.logger;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/logger/ChatLoggerConfig;", "", "level", "Lio/getstream/chat/android/client/logger/ChatLogLevel;", "getLevel", "()Lio/getstream/chat/android/client/logger/ChatLogLevel;", "handler", "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;", "getHandler", "()Lio/getstream/chat/android/client/logger/ChatLoggerHandler;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatLoggerConfig {
    ChatLoggerHandler getHandler();

    ChatLogLevel getLevel();
}
