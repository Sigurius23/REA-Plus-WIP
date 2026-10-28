package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal;

import android.view.View;
import android.view.ViewGroup;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListViewStyle;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListItem;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.ChannelListPayloadDiff;
import io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.BaseChannelListItemViewHolder;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelListLoadingMoreViewHolder;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;", "Landroid/view/ViewGroup;", "parent", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "style", "<init>", "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;)V", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;", "channelItem", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;", "diff", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListLoadingMoreViewHolder extends BaseChannelListItemViewHolder {
    /* JADX WARN: Illegal instructions before constructor call */
    public ChannelListLoadingMoreViewHolder(ViewGroup parent, ChannelListViewStyle style) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(style, "style");
        View viewInflate = ViewGroupKt.getStreamThemeInflater(parent).inflate(style.getLoadingMoreView(), parent, false);
        AbstractC22676k.m65749i(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.BaseChannelListItemViewHolder
    public final void bind(ChannelListItem.ChannelItem channelItem, ChannelListPayloadDiff diff) {
        AbstractC22676k.m65750j(channelItem, "channelItem");
        AbstractC22676k.m65750j(diff, "diff");
    }
}
