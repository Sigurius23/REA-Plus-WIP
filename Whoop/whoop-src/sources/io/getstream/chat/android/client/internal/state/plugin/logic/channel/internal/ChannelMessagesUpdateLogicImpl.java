package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal;

import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelMessagesUpdateLogicImpl;", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;", "state", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;)V", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "upsertMessage", "(Lio/getstream/chat/android/models/Message;)V", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "()Lio/getstream/chat/android/client/channel/state/ChannelState;", "repliedMessage", "setRepliedMessage", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelMessagesUpdateLogicImpl implements ChannelMessagesUpdateLogic {
    private final ChannelStateImpl state;

    public ChannelMessagesUpdateLogicImpl(ChannelStateImpl state) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
    }

    @Override // io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic
    public final ChannelState channelState() {
        return this.state;
    }

    @Override // io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic
    public final void setRepliedMessage(Message repliedMessage) {
        this.state.setRepliedMessage(repliedMessage);
    }

    @Override // io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic
    public final void upsertMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.state.upsertMessage(message);
    }
}
