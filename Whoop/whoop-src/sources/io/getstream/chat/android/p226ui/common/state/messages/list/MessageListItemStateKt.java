package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m65681d2 = {"stringify", "", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListItemStateKt {
    @InternalStreamChatApi
    public static final String stringify(MessageListItemState messageListItemState) {
        AbstractC22676k.m65750j(messageListItemState, "<this>");
        if (messageListItemState instanceof MessageItemState) {
            MessageItemState messageItemState = (MessageItemState) messageListItemState;
            return AbstractC26725a.m79503g("MessageItemState(message.text: ", messageItemState.getMessage().getText(), ", isMine: ", ")", messageItemState.isMine());
        }
        if (messageListItemState instanceof DateSeparatorItemState) {
            return "DateSeparatorItemState(date: " + ((DateSeparatorItemState) messageListItemState).getDate() + ")";
        }
        if (messageListItemState instanceof ThreadDateSeparatorItemState) {
            ThreadDateSeparatorItemState threadDateSeparatorItemState = (ThreadDateSeparatorItemState) messageListItemState;
            return "ThreadDateSeparatorItemState(date: " + threadDateSeparatorItemState.getDate() + ", replyCount: " + threadDateSeparatorItemState.getReplyCount() + ")";
        }
        if (messageListItemState instanceof SystemMessageItemState) {
            return AbstractC11895b.m31996o("SystemMessageItemState(message.text: ", ((SystemMessageItemState) messageListItemState).getMessage().getText(), ")");
        }
        if (messageListItemState instanceof ModeratedMessageItemState) {
            return AbstractC11895b.m31996o("ModeratedMessageItemState(message.text: ", ((ModeratedMessageItemState) messageListItemState).getMessage().getText(), ")");
        }
        if (messageListItemState instanceof TypingItemState) {
            return AbstractC2875y.m8296i(((TypingItemState) messageListItemState).getTypingUsers().size(), "TypingItemState(typingUsers.size: ", ")");
        }
        if (messageListItemState instanceof UnreadSeparatorItemState) {
            return AbstractC2875y.m8296i(((UnreadSeparatorItemState) messageListItemState).getUnreadCount(), "UnreadSeparatorItemState(unreadCount: ", ")");
        }
        if (messageListItemState instanceof StartOfTheChannelItemState) {
            return AbstractC11895b.m31996o("StartOfTheChannelItemState(channel.name: ", ((StartOfTheChannelItemState) messageListItemState).getChannel().getName(), ")");
        }
        if (messageListItemState instanceof EmptyThreadPlaceholderItemState) {
            return "EmptyThreadPlaceholderItemState";
        }
        throw new NoWhenBranchMatchedException();
    }
}
