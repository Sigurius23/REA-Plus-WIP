package io.getstream.chat.android.client.channel.state;

import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;", "", "channelStateLogic", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "channelType", "", "channelId", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelStateLogicProvider {
    ChannelMessagesUpdateLogic channelStateLogic(String channelType, String channelId);
}
