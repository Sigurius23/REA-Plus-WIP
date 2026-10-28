package io.getstream.chat.android.p226ui.feature.channels.list.adapter.internal;

import androidx.recyclerview.widget.AbstractC1738u;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListPayloadDiff;
import io.getstream.chat.android.p226ui.utils.extensions.ChannelKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;", "<init>", "()V", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;", "other", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;", "diff", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z", "areContentsTheSame", "", "getChangePayload", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Ljava/lang/Object;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListItemDiffCallback extends AbstractC1738u {
    public static final ChannelListItemDiffCallback INSTANCE = new ChannelListItemDiffCallback();

    private ChannelListItemDiffCallback() {
    }

    private final ChannelListPayloadDiff diff(ChannelListItem.ChannelItem channelItem, ChannelListItem.ChannelItem channelItem2) {
        boolean z4 = !ChannelExtensionKt.getMembersExcludingCurrent$default(channelItem.getChannel(), null, 1, null).equals(ChannelExtensionKt.getMembersExcludingCurrent$default(channelItem2.getChannel(), null, 1, null));
        return new ChannelListPayloadDiff(!AbstractC22676k.m65745e(channelItem.getChannel().getName(), channelItem2.getChannel().getName()), z4, z4, !AbstractC22676k.m65745e(ChannelKt.getLastMessage(channelItem.getChannel()), ChannelKt.getLastMessage(channelItem2.getChannel())), !AbstractC22676k.m65745e(channelItem.getChannel().getRead(), channelItem2.getChannel().getRead()), ChannelExtensionKt.currentUserUnreadCount$default(channelItem.getChannel(), null, 1, null) != ChannelExtensionKt.currentUserUnreadCount$default(channelItem2.getChannel(), null, 1, null), !AbstractC22676k.m65745e(channelItem.getChannel().getExtraData(), channelItem2.getChannel().getExtraData()), !AbstractC22676k.m65745e(channelItem.getTypingUsers(), channelItem2.getTypingUsers()), !AbstractC22676k.m65745e(channelItem.getDraftMessage(), channelItem2.getDraftMessage()));
    }

    @Override // androidx.recyclerview.widget.AbstractC1738u
    public final boolean areContentsTheSame(ChannelListItem oldItem, ChannelListItem newItem) {
        AbstractC22676k.m65750j(oldItem, "oldItem");
        AbstractC22676k.m65750j(newItem, "newItem");
        return ((oldItem instanceof ChannelListItem.ChannelItem) && diff((ChannelListItem.ChannelItem) oldItem, (ChannelListItem.ChannelItem) newItem).hasDifference()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1738u
    public final boolean areItemsTheSame(ChannelListItem oldItem, ChannelListItem newItem) {
        Channel channel;
        AbstractC22676k.m65750j(oldItem, "oldItem");
        AbstractC22676k.m65750j(newItem, "newItem");
        if (oldItem.getClass() != newItem.getClass()) {
            return false;
        }
        if (!(oldItem instanceof ChannelListItem.ChannelItem)) {
            return true;
        }
        String cid = ((ChannelListItem.ChannelItem) oldItem).getChannel().getCid();
        String cid2 = null;
        if (!(newItem instanceof ChannelListItem.ChannelItem)) {
            newItem = null;
        }
        ChannelListItem.ChannelItem channelItem = (ChannelListItem.ChannelItem) newItem;
        if (channelItem != null && (channel = channelItem.getChannel()) != null) {
            cid2 = channel.getCid();
        }
        return AbstractC22676k.m65745e(cid, cid2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1738u
    public final Object getChangePayload(ChannelListItem oldItem, ChannelListItem newItem) {
        AbstractC22676k.m65750j(oldItem, "oldItem");
        AbstractC22676k.m65750j(newItem, "newItem");
        return diff((ChannelListItem.ChannelItem) oldItem, (ChannelListItem.ChannelItem) newItem);
    }
}
