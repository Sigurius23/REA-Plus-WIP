package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ConnectionState;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState;", "", "Loading", "Content", "Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Content;", "Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Loading;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelHeaderViewState {

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Content;", "Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState;", "currentUser", "Lio/getstream/chat/android/models/User;", "connectionState", "Lio/getstream/chat/android/models/ConnectionState;", "channel", "Lio/getstream/chat/android/models/Channel;", "<init>", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/ConnectionState;Lio/getstream/chat/android/models/Channel;)V", "getCurrentUser", "()Lio/getstream/chat/android/models/User;", "getConnectionState", "()Lio/getstream/chat/android/models/ConnectionState;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Content implements ChannelHeaderViewState {
        public static final int $stable = 0;
        private final Channel channel;
        private final ConnectionState connectionState;
        private final User currentUser;

        public Content(User user, ConnectionState connectionState, Channel channel) {
            AbstractC22676k.m65750j(connectionState, "connectionState");
            AbstractC22676k.m65750j(channel, "channel");
            this.currentUser = user;
            this.connectionState = connectionState;
            this.channel = channel;
        }

        public static /* synthetic */ Content copy$default(Content content, User user, ConnectionState connectionState, Channel channel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                user = content.currentUser;
            }
            if ((i13 & 2) != 0) {
                connectionState = content.connectionState;
            }
            if ((i13 & 4) != 0) {
                channel = content.channel;
            }
            return content.copy(user, connectionState, channel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getCurrentUser() {
            return this.currentUser;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ConnectionState getConnectionState() {
            return this.connectionState;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Channel getChannel() {
            return this.channel;
        }

        public final Content copy(User currentUser, ConnectionState connectionState, Channel channel) {
            AbstractC22676k.m65750j(connectionState, "connectionState");
            AbstractC22676k.m65750j(channel, "channel");
            return new Content(currentUser, connectionState, channel);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return AbstractC22676k.m65745e(this.currentUser, content.currentUser) && AbstractC22676k.m65745e(this.connectionState, content.connectionState) && AbstractC22676k.m65745e(this.channel, content.channel);
        }

        public final Channel getChannel() {
            return this.channel;
        }

        public final ConnectionState getConnectionState() {
            return this.connectionState;
        }

        public final User getCurrentUser() {
            return this.currentUser;
        }

        public final int hashCode() {
            User user = this.currentUser;
            return this.channel.hashCode() + ((this.connectionState.hashCode() + ((user == null ? 0 : user.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "Content(currentUser=" + this.currentUser + ", connectionState=" + this.connectionState + ", channel=" + this.channel + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Loading;", "Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Loading implements ChannelHeaderViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public final int hashCode() {
            return 723440691;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
