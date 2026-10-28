package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder;

import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainer;", "", "isMoreOptionsVisible", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "()Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionVisibilityPredicate;", "isDeleteOptionVisible", "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListVisibilityContainerImpl;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelListVisibilityContainer {
    ChannelListView.ChannelOptionVisibilityPredicate isDeleteOptionVisible();

    ChannelListView.ChannelOptionVisibilityPredicate isMoreOptionsVisible();
}
