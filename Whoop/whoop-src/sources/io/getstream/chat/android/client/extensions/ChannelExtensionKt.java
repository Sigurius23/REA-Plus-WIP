package io.getstream.chat.android.client.extensions;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelMute;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t*\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t*\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u001a\u001c\u0010\u0013\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u001a\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u00022\n\u0010\u0016\u001a\u00060\u0011j\u0002`\u0012H\u0000\u001a\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\t*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\t*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019¨\u0006\u001b"}, m65681d2 = {"isAnonymousChannel", "", "Lio/getstream/chat/android/models/Channel;", "isPinned", "isArchive", "isMutedFor", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "getUsersExcludingCurrent", "", "currentUser", "getMembersExcludingCurrent", "Lio/getstream/chat/android/models/Member;", "countUnreadMentionsForUser", "", "currentUserUnreadCount", "currentUserId", "", "Lio/getstream/chat/android/models/UserId;", "syncUnreadCountWithReads", "userRead", "Lio/getstream/chat/android/models/ChannelUserRead;", "userId", "readsOf", "message", "Lio/getstream/chat/android/models/Message;", "deliveredReadsOf", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelExtensionKt {
    public static final int countUnreadMentionsForUser(Channel channel, User user) {
        List<Message> messages;
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(user, "user");
        ChannelUserRead channelUserReadUserRead = userRead(channel, user.getId());
        Date lastRead = channelUserReadUserRead != null ? channelUserReadUserRead.getLastRead() : null;
        if (lastRead == null) {
            messages = channel.getMessages();
        } else {
            List<Message> messages2 = channel.getMessages();
            ArrayList arrayList = new ArrayList();
            for (Object obj : messages2) {
                if (MessageKt.wasCreatedAfter((Message) obj, lastRead)) {
                    arrayList.add(obj);
                }
            }
            messages = arrayList;
        }
        List<Message> list = messages;
        int i13 = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (MessageKt.containsUserMention((Message) it.next(), user) && (i13 = i13 + 1) < 0) {
                AbstractC37056f.m118976c0();
                throw null;
            }
        }
        return i13;
    }

    public static final int currentUserUnreadCount(Channel channel, String str) {
        ChannelUserRead channelUserReadUserRead;
        AbstractC22676k.m65750j(channel, "<this>");
        if (str == null || (channelUserReadUserRead = userRead(channel, str)) == null) {
            return 0;
        }
        return channelUserReadUserRead.getUnreadMessages();
    }

    public static /* synthetic */ int currentUserUnreadCount$default(Channel channel, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            User currentUser = ChatClient.INSTANCE.instance().getCurrentUser();
            str = currentUser != null ? currentUser.getId() : null;
        }
        return currentUserUnreadCount(channel, str);
    }

    public static final List<ChannelUserRead> deliveredReadsOf(Channel channel, Message message) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(message, "message");
        List<ChannelUserRead> read = channel.getRead();
        ArrayList arrayList = new ArrayList();
        for (Object obj : read) {
            ChannelUserRead channelUserRead = (ChannelUserRead) obj;
            if (!AbstractC22676k.m65745e(channelUserRead.getUser().getId(), message.getUser().getId())) {
                Date lastDeliveredAt = channelUserRead.getLastDeliveredAt();
                if (lastDeliveredAt == null) {
                    lastDeliveredAt = MessageKt.getNEVER();
                }
                if (lastDeliveredAt.compareTo(MessageExtensionsKt.getCreatedAtOrDefault(message, MessageKt.getNEVER())) >= 0) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @InternalStreamChatApi
    public static final List<Member> getMembersExcludingCurrent(Channel channel, User user) {
        AbstractC22676k.m65750j(channel, "<this>");
        List<Member> members = channel.getMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : members) {
            if (!AbstractC22676k.m65745e(((Member) obj).getUser().getId(), user != null ? user.getId() : null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List getMembersExcludingCurrent$default(Channel channel, User user, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = ChatClient.INSTANCE.instance().getCurrentUser();
        }
        return getMembersExcludingCurrent(channel, user);
    }

    @InternalStreamChatApi
    public static final List<User> getUsersExcludingCurrent(Channel channel, User user) {
        AbstractC22676k.m65750j(channel, "<this>");
        List<Member> membersExcludingCurrent = getMembersExcludingCurrent(channel, user);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(membersExcludingCurrent, 10));
        Iterator<T> it = membersExcludingCurrent.iterator();
        while (it.hasNext()) {
            arrayList.add(((Member) it.next()).getUser());
        }
        return arrayList;
    }

    public static /* synthetic */ List getUsersExcludingCurrent$default(Channel channel, User user, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = ChatClient.INSTANCE.instance().getCurrentUser();
        }
        return getUsersExcludingCurrent(channel, user);
    }

    public static final boolean isAnonymousChannel(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        return StringExtensionsKt.isAnonymousChannelId(channel.getId());
    }

    public static final boolean isArchive(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        Member membership = channel.getMembership();
        return (membership != null ? membership.getArchivedAt() : null) != null;
    }

    public static final boolean isMutedFor(Channel channel, User user) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(user, "user");
        List<ChannelMute> channelMutes = user.getChannelMutes();
        if ((channelMutes instanceof Collection) && channelMutes.isEmpty()) {
            return false;
        }
        Iterator<T> it = channelMutes.iterator();
        while (it.hasNext()) {
            Channel channel2 = ((ChannelMute) it.next()).getChannel();
            if (AbstractC22676k.m65745e(channel2 != null ? channel2.getCid() : null, channel.getCid())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isPinned(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        Member membership = channel.getMembership();
        return (membership != null ? membership.getPinnedAt() : null) != null;
    }

    public static final List<ChannelUserRead> readsOf(Channel channel, Message message) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(message, "message");
        List<ChannelUserRead> read = channel.getRead();
        ArrayList arrayList = new ArrayList();
        for (Object obj : read) {
            ChannelUserRead channelUserRead = (ChannelUserRead) obj;
            if (!AbstractC22676k.m65745e(channelUserRead.getUser().getId(), message.getUser().getId()) && channelUserRead.getLastRead().compareTo(MessageExtensionsKt.getCreatedAtOrDefault(message, MessageKt.getNEVER())) >= 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Channel syncUnreadCountWithReads(Channel channel, String str) {
        AbstractC22676k.m65750j(channel, "<this>");
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, currentUserUnreadCount(channel, str), null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -131073, 7, null);
    }

    public static /* synthetic */ Channel syncUnreadCountWithReads$default(Channel channel, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            User currentUser = ChatClient.INSTANCE.instance().getCurrentUser();
            str = currentUser != null ? currentUser.getId() : null;
        }
        return syncUnreadCountWithReads(channel, str);
    }

    public static final ChannelUserRead userRead(Channel channel, String userId) {
        Object next;
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(userId, "userId");
        Iterator<T> it = channel.getRead().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC22676k.m65745e(((ChannelUserRead) next).getUser().getId(), userId)) {
                return (ChannelUserRead) next;
            }
        }
        next = null;
        return (ChannelUserRead) next;
    }
}
