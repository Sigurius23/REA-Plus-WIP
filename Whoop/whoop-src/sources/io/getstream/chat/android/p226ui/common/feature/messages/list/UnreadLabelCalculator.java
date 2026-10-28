package io.getstream.chat.android.p226ui.common.feature.messages.list;

import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Message;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;", "", "<init>", "()V", "calculateUnreadLabel", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;", "channelUserRead", "Lio/getstream/chat/android/models/ChannelUserRead;", "messages", "", "Lio/getstream/chat/android/models/Message;", "currentUserId", "", "shouldShowButton", "", "calculateStandardUnreadLabel", "unreadMessages", "calculateUnreadLabelWithOwnMessagesFirst", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UnreadLabelCalculator {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    private final MessageListController.UnreadLabel calculateStandardUnreadLabel(ChannelUserRead channelUserRead, List<Message> unreadMessages, boolean shouldShowButton) {
        boolean z4;
        String lastReadMessageId = channelUserRead.getLastReadMessageId();
        if (lastReadMessageId != null) {
            if (unreadMessages.isEmpty()) {
                lastReadMessageId = null;
            }
            if (lastReadMessageId != null) {
                Message message = (Message) AbstractC25265s.m74114R0(unreadMessages);
                if (AbstractC22676k.m65745e(message != null ? message.getId() : null, lastReadMessageId)) {
                    lastReadMessageId = null;
                }
                if (lastReadMessageId != null) {
                    int unreadMessages2 = channelUserRead.getUnreadMessages();
                    if (shouldShowButton) {
                        List<Message> list = unreadMessages;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            z4 = false;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (!MessageUtils.isDeleted((Message) it.next())) {
                                    z4 = true;
                                }
                            }
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    return new MessageListController.UnreadLabel(unreadMessages2, lastReadMessageId, z4);
                }
            }
        }
        return null;
    }

    private final MessageListController.UnreadLabel calculateUnreadLabelWithOwnMessagesFirst(ChannelUserRead channelUserRead, List<Message> unreadMessages, String currentUserId, boolean shouldShowButton) {
        if (channelUserRead.getUnreadMessages() == 0) {
            return null;
        }
        Iterator<Message> it = unreadMessages.iterator();
        boolean z4 = false;
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (!AbstractC22676k.m65745e(it.next().getUser().getId(), currentUserId)) {
                break;
            }
            i13++;
        }
        int i14 = i13 > 0 ? i13 - 1 : -1;
        Message message = i14 != -1 ? (Message) AbstractC25265s.m74102I0(i14, unreadMessages) : null;
        if (message == null) {
            return null;
        }
        int unreadMessages2 = channelUserRead.getUnreadMessages();
        String id4 = message.getId();
        if (shouldShowButton) {
            List<Message> list = unreadMessages;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    if (!MessageUtils.isDeleted((Message) it3.next())) {
                        z4 = true;
                        break;
                    }
                }
            }
        }
        return new MessageListController.UnreadLabel(unreadMessages2, id4, z4);
    }

    public final MessageListController.UnreadLabel calculateUnreadLabel(ChannelUserRead channelUserRead, List<Message> messages, String currentUserId, boolean shouldShowButton) {
        List<Message> listM74128f1;
        Object next;
        Date createdAt;
        AbstractC22676k.m65750j(channelUserRead, "channelUserRead");
        AbstractC22676k.m65750j(messages, "messages");
        List<Message> list = messages;
        Iterator<T> it = list.iterator();
        C25271y c25271y = C25271y.f99162w;
        loop0: while (true) {
            listM74128f1 = c25271y;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Message message = (Message) it.next();
                if (AbstractC22676k.m65745e(channelUserRead.getLastReadMessageId(), message.getId())) {
                    break;
                }
                listM74128f1 = AbstractC25265s.m74128f1(message, listM74128f1);
            }
        }
        Iterator<T> it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!AbstractC22676k.m65745e(((Message) next).getId(), channelUserRead.getLastReadMessageId()));
        Message message2 = (Message) next;
        if (message2 == null) {
            if (!listM74128f1.isEmpty()) {
                List<Message> list2 = listM74128f1;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        if (!AbstractC22676k.m65745e(((Message) it4.next()).getUser().getId(), currentUserId)) {
                        }
                    }
                }
                return null;
            }
            return calculateStandardUnreadLabel(channelUserRead, listM74128f1, shouldShowButton);
        }
        Message message3 = (Message) AbstractC25265s.m74100H0(listM74128f1);
        boolean z4 = false;
        boolean z13 = message3 != null && AbstractC22676k.m65745e(message3.getUser().getId(), currentUserId);
        if (z13 && (createdAt = message3.getCreatedAt()) != null && createdAt.after(channelUserRead.getLastRead()) && AbstractC22676k.m65745e(channelUserRead.getLastRead(), message2.getCreatedAt())) {
            z4 = true;
        }
        return (!z13 || z4) ? calculateStandardUnreadLabel(channelUserRead, listM74128f1, shouldShowButton) : calculateUnreadLabelWithOwnMessagesFirst(channelUserRead, listM74128f1, currentUserId, shouldShowButton);
    }
}
