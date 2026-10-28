package io.getstream.chat.android.p226ui.feature.channels.list.adapter;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.User;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "", "<init>", "()V", "ChannelItem", "LoadingMoreItem", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$LoadingMoreItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ChannelListItem {

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "channel", "Lio/getstream/chat/android/models/Channel;", "typingUsers", "", "Lio/getstream/chat/android/models/User;", "draftMessage", "Lio/getstream/chat/android/models/DraftMessage;", "<init>", "(Lio/getstream/chat/android/models/Channel;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;)V", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getTypingUsers", "()Ljava/util/List;", "getDraftMessage", "()Lio/getstream/chat/android/models/DraftMessage;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ChannelItem extends ChannelListItem {
        private final Channel channel;
        private final DraftMessage draftMessage;
        private final List<User> typingUsers;

        public ChannelItem(Channel channel, List<User> typingUsers, DraftMessage draftMessage) {
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(typingUsers, "typingUsers");
            this.channel = channel;
            this.typingUsers = typingUsers;
            this.draftMessage = draftMessage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChannelItem copy$default(ChannelItem channelItem, Channel channel, List list, DraftMessage draftMessage, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                channel = channelItem.channel;
            }
            if ((i13 & 2) != 0) {
                list = channelItem.typingUsers;
            }
            if ((i13 & 4) != 0) {
                draftMessage = channelItem.draftMessage;
            }
            return channelItem.copy(channel, list, draftMessage);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Channel getChannel() {
            return this.channel;
        }

        public final List<User> component2() {
            return this.typingUsers;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DraftMessage getDraftMessage() {
            return this.draftMessage;
        }

        public final ChannelItem copy(Channel channel, List<User> typingUsers, DraftMessage draftMessage) {
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(typingUsers, "typingUsers");
            return new ChannelItem(channel, typingUsers, draftMessage);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChannelItem)) {
                return false;
            }
            ChannelItem channelItem = (ChannelItem) other;
            return AbstractC22676k.m65745e(this.channel, channelItem.channel) && AbstractC22676k.m65745e(this.typingUsers, channelItem.typingUsers) && AbstractC22676k.m65745e(this.draftMessage, channelItem.draftMessage);
        }

        public final Channel getChannel() {
            return this.channel;
        }

        public final DraftMessage getDraftMessage() {
            return this.draftMessage;
        }

        public final List<User> getTypingUsers() {
            return this.typingUsers;
        }

        public final int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(this.channel.hashCode() * 31, 31, this.typingUsers);
            DraftMessage draftMessage = this.draftMessage;
            return iM31983b + (draftMessage == null ? 0 : draftMessage.hashCode());
        }

        public final String toString() {
            return "ChannelItem(channel=" + this.channel + ", typingUsers=" + this.typingUsers + ", draftMessage=" + this.draftMessage + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$LoadingMoreItem;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "<init>", "()V", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class LoadingMoreItem extends ChannelListItem {
        public static final LoadingMoreItem INSTANCE = new LoadingMoreItem();

        private LoadingMoreItem() {
        }

        public final String toString() {
            return "LoadingMoreItem";
        }
    }

    private ChannelListItem() {
    }

    public ChannelListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
