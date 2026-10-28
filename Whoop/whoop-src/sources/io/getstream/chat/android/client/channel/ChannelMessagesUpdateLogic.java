package io.getstream.chat.android.client.channel;

import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "upsertMessage", "(Lio/getstream/chat/android/models/Message;)V", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "()Lio/getstream/chat/android/client/channel/state/ChannelState;", "repliedMessage", "setRepliedMessage", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelMessagesUpdateLogic {
    ChannelState channelState();

    void setRepliedMessage(Message repliedMessage);

    void upsertMessage(Message message);
}
