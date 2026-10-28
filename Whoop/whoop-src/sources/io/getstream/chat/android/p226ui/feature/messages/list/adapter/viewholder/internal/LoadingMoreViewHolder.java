package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.internal;

import android.view.View;
import android.view.ViewGroup;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/LoadingMoreViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;", "Landroid/view/ViewGroup;", "parent", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "<init>", "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "Ll83/a0;", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LoadingMoreViewHolder extends BaseMessageItemViewHolder<MessageListItem.LoadingMoreIndicatorItem> {
    /* JADX WARN: Illegal instructions before constructor call */
    public LoadingMoreViewHolder(ViewGroup parent, MessageListItemStyle style) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(style, "style");
        View viewInflate = ViewGroupKt.getStreamThemeInflater(parent).inflate(style.getLoadingMoreView(), parent, false);
        AbstractC22676k.m65749i(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.LoadingMoreIndicatorItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
    }
}
