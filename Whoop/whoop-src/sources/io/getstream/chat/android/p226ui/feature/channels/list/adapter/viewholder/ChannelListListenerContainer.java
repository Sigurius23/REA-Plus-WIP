package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0001\u0016¨\u0006\u0017À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainer;", "", "channelClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "getChannelClickListener", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;", "channelLongClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "getChannelLongClickListener", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;", "deleteClickListener", "getDeleteClickListener", "moreOptionsClickListener", "getMoreOptionsClickListener", "userClickListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "getUserClickListener", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;", "swipeListener", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "getSwipeListener", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$SwipeListener;", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelListListenerContainer {
    ChannelListView.ChannelClickListener getChannelClickListener();

    ChannelListView.ChannelLongClickListener getChannelLongClickListener();

    ChannelListView.ChannelClickListener getDeleteClickListener();

    ChannelListView.ChannelClickListener getMoreOptionsClickListener();

    ChannelListView.SwipeListener getSwipeListener();

    ChannelListView.UserClickListener getUserClickListener();
}
