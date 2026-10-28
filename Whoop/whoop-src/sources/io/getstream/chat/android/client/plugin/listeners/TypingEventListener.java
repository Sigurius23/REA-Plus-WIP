package io.getstream.chat.android.client.plugin.listeners;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.Date;
import java.util.Map;
import n23.AbstractC26205h;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JI\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJC\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000fJQ\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;", "", "", "eventType", "channelType", "channelId", "", "extraData", "Ljava/util/Date;", "eventTime", "Ln23/h;", "Ll83/a0;", "onTypingEventPrecondition", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;", "onTypingEventRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", "result", "onTypingEventResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface TypingEventListener {
    AbstractC26205h onTypingEventPrecondition(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime);

    void onTypingEventRequest(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime);

    void onTypingEventResult(AbstractC26205h result, String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime);
}
