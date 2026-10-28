package io.getstream.chat.android.p226ui.common.utils.extensions;

import android.content.Context;
import ec3.C13045h2;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19339f;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.PendingMessage;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.C19470R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import xb3.C38170e;
import xb3.C38171f;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a2\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u001ab\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010\u0018\u001a\u00020\u000f\u001a\f\u0010\u0019\u001a\u00020\u0006*\u00020\u0002H\u0002\u001a(\u0010\u001a\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u0016\u0010\u001b\u001a\u00020\u0006*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001c"}, m65681d2 = {"initials", "", "Lio/getstream/chat/android/models/Channel;", "getInitials", "(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;", "isDirectMessaging", "", "getPreviewMessage", "Lio/getstream/chat/android/models/Message;", "currentUser", "Lio/getstream/chat/android/models/User;", "getDisplayName", "context", "Landroid/content/Context;", "fallback", "", "maxMembers", "getMembersStatusText", "countCurrentUserAsOnlineMember", "countOtherUsersAsOnlineMembers", "userOnlineResId", "userLastSeenJustNowResId", "userLastSeenResId", "memberCountResId", "memberCountWithOnlineResId", "includesCurrentUser", "nameFromMembers", "isOneToOne", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelKt {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m55085e(User user) {
        return (String) nameFromMembers$lambda$9(user);
    }

    public static final String getDisplayName(Channel channel, Context context, User user, int i13, int i14) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(context, "context");
        String name = channel.getName();
        if (name.length() <= 0) {
            name = null;
        }
        if (name != null) {
            return name;
        }
        String strNameFromMembers = nameFromMembers(channel, context, user, i14);
        if (strNameFromMembers != null) {
            return strNameFromMembers;
        }
        String string = context.getString(i13);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    public static /* synthetic */ String getDisplayName$default(Channel channel, Context context, User user, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            user = (User) ((C13045h2) ChatClient.INSTANCE.instance().getClientState().getUser()).getValue();
        }
        if ((i15 & 8) != 0) {
            i14 = 2;
        }
        return getDisplayName(channel, context, user, i13, i14);
    }

    public static final String getInitials(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        return StringKt.initials(channel.getName());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    public static final String getMembersStatusText(Channel channel, Context context, User user, boolean z4, boolean z13, int i13, int i14, int i15, int i16, int i17) {
        boolean z14;
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(context, "context");
        if (isOneToOne(channel, user)) {
            if (!z13) {
                return "";
            }
            for (Member member : channel.getMembers()) {
                if (!AbstractC22676k.m65745e(member.getUser().getId(), user != null ? user.getId() : null)) {
                    return UserKt.getLastSeenText(member.getUser(), context, i13, i14, i15);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        String quantityString = context.getResources().getQuantityString(i16, channel.getMemberCount(), Integer.valueOf(channel.getMemberCount()));
        AbstractC22676k.m65749i(quantityString, "getQuantityString(...)");
        List<Member> members = channel.getMembers();
        int i18 = 0;
        if (!(members instanceof Collection) || !members.isEmpty()) {
            int i19 = 0;
            for (Member member2 : members) {
                if (!member2.getUser().getOnline()) {
                    z14 = false;
                } else if (AbstractC22676k.m65745e(member2.getUser().getId(), user != null ? user.getId() : null) ? z4 : z13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 && (i19 = i19 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
            i18 = i19;
        }
        if (i18 <= 0) {
            return quantityString;
        }
        String string = context.getString(i17, quantityString, Integer.valueOf(i18));
        AbstractC22676k.m65747g(string);
        return string;
    }

    public static /* synthetic */ String getMembersStatusText$default(Channel channel, Context context, User user, boolean z4, boolean z13, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 4) != 0) {
            z4 = true;
        }
        if ((i18 & 8) != 0) {
            z13 = true;
        }
        return getMembersStatusText(channel, context, user, z4, z13, i13, i14, i15, i16, i17);
    }

    public static final Message getPreviewMessage(Channel channel, User user) {
        AbstractC22676k.m65750j(channel, "<this>");
        PendingMessage pendingMessage = (PendingMessage) AbstractC25265s.m74114R0(channel.getPendingMessages());
        Object next = null;
        C38170e c38170e = new C38170e(AbstractC38176k.m122282r(AbstractC38176k.m122282r(new C38171f(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(AbstractC25265s.m74129g1(channel.isInsideSearch() ? channel.getCachedLatestMessages() : channel.getMessages(), AbstractC37056f.m118960L(pendingMessage != null ? pendingMessage.getMessage() : null))), new C19336c(27)), false, new C19336c(28)), new C19339f(user, 1)), new C19336c(29)));
        if (c38170e.hasNext()) {
            next = c38170e.next();
            if (c38170e.hasNext()) {
                Date createdAtOrDefault = MessageExtensionsKt.getCreatedAtOrDefault((Message) next, MessageKt.getNEVER());
                do {
                    Object next2 = c38170e.next();
                    Date createdAtOrDefault2 = MessageExtensionsKt.getCreatedAtOrDefault((Message) next2, MessageKt.getNEVER());
                    if (createdAtOrDefault.compareTo(createdAtOrDefault2) < 0) {
                        next = next2;
                        createdAtOrDefault = createdAtOrDefault2;
                    }
                } while (c38170e.hasNext());
            }
        }
        return (Message) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPreviewMessage$lambda$0(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return (it.getCreatedAt() == null && it.getCreatedLocallyAt() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPreviewMessage$lambda$1(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return MessageUtils.isDeleted(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPreviewMessage$lambda$2(User user, Message it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC22676k.m65745e(it.getUser().getId(), user != null ? user.getId() : null) || !it.getShadowed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPreviewMessage$lambda$3(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return MessageUtils.isRegular(it) || MessageUtils.isSystem(it);
    }

    private static final boolean includesCurrentUser(Channel channel) {
        String id4;
        User user = (User) ((C13045h2) ChatClient.INSTANCE.instance().getClientState().getUser()).getValue();
        if (user == null || (id4 = user.getId()) == null) {
            return false;
        }
        List<Member> members = channel.getMembers();
        if ((members instanceof Collection) && members.isEmpty()) {
            return false;
        }
        Iterator<T> it = members.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(((Member) it.next()).getUser().getId(), id4)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isDirectMessaging(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        return channel.getMembers().size() == 2 && includesCurrentUser(channel);
    }

    @InternalStreamChatApi
    public static final boolean isOneToOne(Channel channel, User user) {
        AbstractC22676k.m65750j(channel, "<this>");
        if (AbstractC39421y.m125930O(channel.getId(), "!members", false) && channel.getMembers().size() == 2) {
            List<Member> members = channel.getMembers();
            if (!(members instanceof Collection) || !members.isEmpty()) {
                Iterator<T> it = members.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((Member) it.next()).getUser().getId(), user != null ? user.getId() : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final String nameFromMembers(Channel channel, Context context, User user, int i13) {
        List<User> usersExcludingCurrent = ChannelExtensionKt.getUsersExcludingCurrent(channel, user);
        if (((ArrayList) usersExcludingCurrent).isEmpty()) {
            if (channel.getMembers().size() == 1) {
                return ((Member) AbstractC25265s.m74096F0(channel.getMembers())).getUser().getName();
            }
            return null;
        }
        String strM74110N0 = AbstractC25265s.m74110N0(AbstractC25265s.m74156w1(usersExcludingCurrent, i13), null, null, null, new C19336c(26), 31);
        int size = channel.getMembers().size() - i13;
        if (size <= 0) {
            return strM74110N0;
        }
        String string = context.getString(C19470R.string.stream_ui_channel_list_untitled_channel_plus_more, strM74110N0, Integer.valueOf(size));
        AbstractC22676k.m65747g(string);
        return string;
    }

    private static final CharSequence nameFromMembers$lambda$9(User it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getName();
    }
}
