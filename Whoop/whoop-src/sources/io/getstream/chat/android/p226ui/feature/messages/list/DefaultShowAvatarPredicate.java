package io.getstream.chat.android.p226ui.feature.messages.list;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.utils.extensions.MessageItemKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/DefaultShowAvatarPredicate;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;", "<init>", "()V", "shouldShow", "", "messageItem", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultShowAvatarPredicate implements MessageListView.ShowAvatarPredicate {
    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.ShowAvatarPredicate
    public final boolean shouldShow(MessageListItem.MessageItem messageItem) {
        AbstractC22676k.m65750j(messageItem, "messageItem");
        if (messageItem.isTheirs()) {
            return messageItem.getShowMessageFooter() || MessageItemKt.isBottomPosition(messageItem);
        }
        return false;
    }
}
