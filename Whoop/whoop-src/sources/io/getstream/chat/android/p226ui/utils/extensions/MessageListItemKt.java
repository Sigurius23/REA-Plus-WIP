package io.getstream.chat.android.p226ui.utils.extensions;

import io.getstream.chat.android.p226ui.common.state.messages.list.DateSeparatorItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.EmptyThreadPlaceholderItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.ModeratedMessageItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.StartOfTheChannelItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.SystemMessageItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.ThreadDateSeparatorItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.TypingItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.UnreadSeparatorItemState;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"toUiMessageListItem", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListItemKt {
    public static final MessageListItem toUiMessageListItem(MessageListItemState messageListItemState) {
        AbstractC22676k.m65750j(messageListItemState, "<this>");
        if (messageListItemState instanceof DateSeparatorItemState) {
            return new MessageListItem.DateSeparatorItem(((DateSeparatorItemState) messageListItemState).getDate());
        }
        if (messageListItemState instanceof SystemMessageItemState) {
            return new MessageListItem.MessageItem(((SystemMessageItemState) messageListItemState).getMessage(), null, false, null, false, false, false, false, false, 510, null);
        }
        if (messageListItemState instanceof ModeratedMessageItemState) {
            return new MessageListItem.MessageItem(((ModeratedMessageItemState) messageListItemState).getMessage(), null, false, null, false, false, false, false, false, 510, null);
        }
        if (messageListItemState instanceof ThreadDateSeparatorItemState) {
            ThreadDateSeparatorItemState threadDateSeparatorItemState = (ThreadDateSeparatorItemState) messageListItemState;
            return new MessageListItem.ThreadSeparatorItem(threadDateSeparatorItemState.getDate(), threadDateSeparatorItemState.getReplyCount());
        }
        if (messageListItemState instanceof TypingItemState) {
            return new MessageListItem.TypingItem(((TypingItemState) messageListItemState).getTypingUsers());
        }
        if (messageListItemState instanceof MessageItemState) {
            MessageItemState messageItemState = (MessageItemState) messageListItemState;
            return new MessageListItem.MessageItem(messageItemState.getMessage(), messageItemState.getGroupPosition(), messageItemState.isMine(), messageItemState.getMessageReadBy(), messageItemState.isInThread(), messageItemState.isMessageRead(), messageItemState.isMessageDelivered(), messageItemState.getShowMessageFooter(), messageItemState.getShowOriginalText());
        }
        if (messageListItemState instanceof EmptyThreadPlaceholderItemState) {
            return MessageListItem.ThreadPlaceholderItem.INSTANCE;
        }
        if (messageListItemState instanceof UnreadSeparatorItemState) {
            return new MessageListItem.UnreadSeparatorItem(((UnreadSeparatorItemState) messageListItemState).getUnreadCount());
        }
        if (messageListItemState instanceof StartOfTheChannelItemState) {
            return new MessageListItem.StartOfTheChannelItem(((StartOfTheChannelItemState) messageListItemState).getChannel());
        }
        throw new NoWhenBranchMatchedException();
    }
}
