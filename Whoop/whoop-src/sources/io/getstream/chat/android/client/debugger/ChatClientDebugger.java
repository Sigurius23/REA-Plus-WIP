package io.getstream.chat.android.client.debugger;

import io.getstream.chat.android.models.Message;
import n23.AbstractC26202e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/debugger/ChatClientDebugger;", "", "", "tag", "src", "desc", "Ln23/e;", "error", "Ll83/a0;", "onNonFatalErrorOccurred", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln23/e;)V", "channelType", "channelId", "Lio/getstream/chat/android/models/Message;", "message", "", "isRetrying", "Lio/getstream/chat/android/client/debugger/SendMessageDebugger;", "debugSendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Z)Lio/getstream/chat/android/client/debugger/SendMessageDebugger;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatClientDebugger {
    static /* synthetic */ SendMessageDebugger debugSendMessage$default(ChatClientDebugger chatClientDebugger, String str, String str2, Message message, boolean z4, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debugSendMessage");
        }
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return chatClientDebugger.debugSendMessage(str, str2, message, z4);
    }

    default SendMessageDebugger debugSendMessage(String channelType, String channelId, Message message, boolean isRetrying) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return StubSendMessageDebugger.INSTANCE;
    }

    default void onNonFatalErrorOccurred(String tag, String src, String desc, AbstractC26202e error) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(src, "src");
        AbstractC22676k.m65750j(desc, "desc");
        AbstractC22676k.m65750j(error, "error");
    }
}
