package io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.AbstractC1738u;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "<init>", "()V", "oldItem", "newItem", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "getMessageListItemChangePayload", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "getMessageChangePayload", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z", "areContentsTheSame", "", "getChangePayload", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Ljava/lang/Object;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListItemDiffCallback extends AbstractC1738u {
    public static final MessageListItemDiffCallback INSTANCE = new MessageListItemDiffCallback();

    private MessageListItemDiffCallback() {
    }

    private final MessageListItemPayloadDiff getMessageChangePayload(MessageListItem.MessageItem oldItem, MessageListItem.MessageItem newItem) {
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        Message message = oldItem.getMessage();
        Message message2 = newItem.getMessage();
        boolean z16 = !AbstractC22676k.m65745e(message.getText(), message2.getText());
        Message replyTo = message.getReplyTo();
        String text = replyTo != null ? replyTo.getText() : null;
        Message replyTo2 = message2.getReplyTo();
        boolean z17 = !AbstractC22676k.m65745e(text, replyTo2 != null ? replyTo2.getText() : null);
        boolean z18 = !AbstractC22676k.m65745e(message.getReactionGroups(), message2.getReactionGroups());
        boolean z19 = !AbstractC22676k.m65745e(message.getAttachments(), message2.getAttachments());
        boolean z24 = false;
        if (message.getReplyCount() != message2.getReplyCount()) {
            z4 = true;
            z13 = true;
        } else {
            z4 = true;
            z13 = false;
        }
        if (message.getSyncStatus() == message2.getSyncStatus()) {
            z4 = false;
        }
        boolean zM65745e = AbstractC22676k.m65745e(message.getDeletedAt(), message2.getDeletedAt()) ^ z4;
        if (oldItem.getPosition() != newItem.getPosition()) {
            z24 = z4;
        }
        if (message.getPinned() != message2.getPinned()) {
            z14 = z4;
            z15 = z14;
        } else {
            z14 = z4;
            z15 = false;
        }
        boolean zM65745e2 = AbstractC22676k.m65745e(message.getUser(), message2.getUser()) ^ z14;
        boolean zM65745e3 = AbstractC22676k.m65745e(message.getMentionedUsers(), message2.getMentionedUsers()) ^ z14;
        boolean z25 = z14;
        boolean z26 = oldItem.getShowMessageFooter() != newItem.getShowMessageFooter() ? z25 : false;
        boolean z27 = !AbstractC22676k.m65745e(message.getPoll(), message2.getPoll());
        boolean z28 = oldItem.isThreadMode() != newItem.isThreadMode() ? z25 : false;
        if (oldItem.getShowOriginalText() == newItem.getShowOriginalText()) {
            z25 = false;
        }
        return new MessageListItemPayloadDiff(z16, z17, z18, z19, z13, z4, zM65745e, z24, z15, zM65745e2, zM65745e3, z26, z27, z28, z25, oldItem.isMessageRead() != newItem.isMessageRead());
    }

    private final MessageListItemPayloadDiff getMessageListItemChangePayload(MessageListItem oldItem, MessageListItem newItem) {
        MessageListItem.MessageItem messageItem = oldItem instanceof MessageListItem.MessageItem ? (MessageListItem.MessageItem) oldItem : null;
        if (messageItem != null) {
            MessageListItem.MessageItem messageItem2 = newItem instanceof MessageListItem.MessageItem ? (MessageListItem.MessageItem) newItem : null;
            if (messageItem2 != null) {
                return INSTANCE.getMessageChangePayload(messageItem, messageItem2);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1738u
    @SuppressLint({"DiffUtilEquals"})
    public final boolean areContentsTheSame(MessageListItem oldItem, MessageListItem newItem) {
        List<User> users;
        AbstractC22676k.m65750j(oldItem, "oldItem");
        AbstractC22676k.m65750j(newItem, "newItem");
        if (oldItem instanceof MessageListItem.MessageItem) {
            MessageListItemPayloadDiff messageListItemChangePayload = getMessageListItemChangePayload(oldItem, newItem);
            return (messageListItemChangePayload == null || messageListItemChangePayload.anyChanged()) ? false : true;
        }
        arrayList = null;
        ArrayList arrayList = null;
        if (oldItem instanceof MessageListItem.DateSeparatorItem) {
            Date date = ((MessageListItem.DateSeparatorItem) oldItem).getDate();
            MessageListItem.DateSeparatorItem dateSeparatorItem = newItem instanceof MessageListItem.DateSeparatorItem ? (MessageListItem.DateSeparatorItem) newItem : null;
            return AbstractC22676k.m65745e(date, dateSeparatorItem != null ? dateSeparatorItem.getDate() : null);
        }
        if (oldItem instanceof MessageListItem.ThreadSeparatorItem) {
            return oldItem.equals(newItem instanceof MessageListItem.ThreadSeparatorItem ? (MessageListItem.ThreadSeparatorItem) newItem : null);
        }
        if (oldItem instanceof MessageListItem.LoadingMoreIndicatorItem) {
            return true;
        }
        if (!(oldItem instanceof MessageListItem.TypingItem)) {
            if (oldItem instanceof MessageListItem.ThreadPlaceholderItem) {
                return true;
            }
            if (oldItem instanceof MessageListItem.UnreadSeparatorItem) {
                MessageListItem.UnreadSeparatorItem unreadSeparatorItem = newItem instanceof MessageListItem.UnreadSeparatorItem ? (MessageListItem.UnreadSeparatorItem) newItem : null;
                return unreadSeparatorItem != null && ((MessageListItem.UnreadSeparatorItem) oldItem).getUnreadCount() == unreadSeparatorItem.getUnreadCount();
            }
            if (!(oldItem instanceof MessageListItem.StartOfTheChannelItem)) {
                throw new NoWhenBranchMatchedException();
            }
            Channel channel = ((MessageListItem.StartOfTheChannelItem) oldItem).getChannel();
            MessageListItem.StartOfTheChannelItem startOfTheChannelItem = newItem instanceof MessageListItem.StartOfTheChannelItem ? (MessageListItem.StartOfTheChannelItem) newItem : null;
            return AbstractC22676k.m65745e(channel, startOfTheChannelItem != null ? startOfTheChannelItem.getChannel() : null);
        }
        List<User> users2 = ((MessageListItem.TypingItem) oldItem).getUsers();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(users2, 10));
        Iterator<T> it = users2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((User) it.next()).getId());
        }
        MessageListItem.TypingItem typingItem = newItem instanceof MessageListItem.TypingItem ? (MessageListItem.TypingItem) newItem : null;
        if (typingItem != null && (users = typingItem.getUsers()) != null) {
            List<User> list = users;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((User) it3.next()).getId());
            }
        }
        return arrayList2.equals(arrayList);
    }

    @Override // androidx.recyclerview.widget.AbstractC1738u
    public final boolean areItemsTheSame(MessageListItem oldItem, MessageListItem newItem) {
        AbstractC22676k.m65750j(oldItem, "oldItem");
        AbstractC22676k.m65750j(newItem, "newItem");
        return oldItem.getStableId() == newItem.getStableId();
    }

    @Override // androidx.recyclerview.widget.AbstractC1738u
    public final Object getChangePayload(MessageListItem oldItem, MessageListItem newItem) {
        AbstractC22676k.m65750j(oldItem, "oldItem");
        AbstractC22676k.m65750j(newItem, "newItem");
        return getMessageListItemChangePayload(oldItem, newItem);
    }
}
