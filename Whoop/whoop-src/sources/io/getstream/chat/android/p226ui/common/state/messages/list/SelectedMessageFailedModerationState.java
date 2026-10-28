package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageFailedModerationState;", "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;", "message", "Lio/getstream/chat/android/models/Message;", "channel", "Lio/getstream/chat/android/models/Channel;", "<init>", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)V", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SelectedMessageFailedModerationState extends SelectedMessageState {
    public static final int $stable = 0;
    private final Channel channel;
    private final Message message;

    public SelectedMessageFailedModerationState(Message message, Channel channel) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channel, "channel");
        this.message = message;
        this.channel = channel;
    }

    public static /* synthetic */ SelectedMessageFailedModerationState copy$default(SelectedMessageFailedModerationState selectedMessageFailedModerationState, Message message, Channel channel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            message = selectedMessageFailedModerationState.message;
        }
        if ((i13 & 2) != 0) {
            channel = selectedMessageFailedModerationState.channel;
        }
        return selectedMessageFailedModerationState.copy(message, channel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    public final SelectedMessageFailedModerationState copy(Message message, Channel channel) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channel, "channel");
        return new SelectedMessageFailedModerationState(message, channel);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedMessageFailedModerationState)) {
            return false;
        }
        SelectedMessageFailedModerationState selectedMessageFailedModerationState = (SelectedMessageFailedModerationState) other;
        return AbstractC22676k.m65745e(this.message, selectedMessageFailedModerationState.message) && AbstractC22676k.m65745e(this.channel, selectedMessageFailedModerationState.channel);
    }

    @Override // io.getstream.chat.android.p226ui.common.state.messages.list.SelectedMessageState
    public final Channel getChannel() {
        return this.channel;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.messages.list.SelectedMessageState
    public final Message getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.channel.hashCode() + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedMessageFailedModerationState(message=" + this.message + ", channel=" + this.channel + ")";
    }
}
