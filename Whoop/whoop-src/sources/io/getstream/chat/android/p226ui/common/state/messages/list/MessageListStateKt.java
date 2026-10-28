package io.getstream.chat.android.p226ui.common.state.messages.list;

import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import java.util.List;
import java.util.ListIterator;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020\u0002H\u0080\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"stringify", "", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;", "lastItemOrNull", "T", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListStateKt {
    public static final <T extends MessageListItemState> T lastItemOrNull(MessageListState messageListState) {
        AbstractC22676k.m65750j(messageListState, "<this>");
        List<MessageListItemState> messageItems = messageListState.getMessageItems();
        ListIterator<MessageListItemState> listIterator = messageItems.listIterator(messageItems.size());
        if (!listIterator.hasPrevious()) {
            AbstractC22676k.m65756p();
            throw null;
        }
        listIterator.previous();
        AbstractC22676k.m65756p();
        throw null;
    }

    public static final String stringify(MessageListState messageListState) {
        AbstractC22676k.m65750j(messageListState, "<this>");
        int size = messageListState.getMessageItems().size();
        NewMessageState newMessageState = messageListState.getNewMessageState();
        boolean endOfNewMessagesReached = messageListState.getEndOfNewMessagesReached();
        boolean endOfOldMessagesReached = messageListState.getEndOfOldMessagesReached();
        boolean zIsLoading = messageListState.isLoading();
        boolean zIsLoadingNewerMessages = messageListState.isLoadingNewerMessages();
        boolean zIsLoadingOlderMessages = messageListState.isLoadingOlderMessages();
        User currentUser = messageListState.getCurrentUser();
        String id4 = currentUser != null ? currentUser.getId() : null;
        String parentMessageId = messageListState.getParentMessageId();
        int unreadCount = messageListState.getUnreadCount();
        MessageListController.UnreadLabel unreadLabel = messageListState.getUnreadLabel();
        SelectedMessageState selectedMessageState = messageListState.getSelectedMessageState();
        StringBuilder sb4 = new StringBuilder("MessageListState(messageItems.size: ");
        sb4.append(size);
        sb4.append(", newMessageState: ");
        sb4.append(newMessageState);
        sb4.append(", endOfNewMessagesReached: ");
        AbstractC38963t7.m124392v(sb4, endOfNewMessagesReached, ", endOfOldMessagesReached: ", endOfOldMessagesReached, ", isLoading: ");
        AbstractC38963t7.m124392v(sb4, zIsLoading, ", isLoadingNewerMessages: ", zIsLoadingNewerMessages, ", isLoadingOlderMessages: ");
        AbstractC38963t7.m124391u(sb4, zIsLoadingOlderMessages, ", currentUser.id: ", id4, ", parentMessageId: ");
        AbstractC11266d.m30470x(unreadCount, parentMessageId, ", unreadCount: ", ", unreadLabel: ", sb4);
        sb4.append(unreadLabel);
        sb4.append(", selectedMessageState: ");
        sb4.append(selectedMessageState);
        sb4.append(")");
        return sb4.toString();
    }
}
