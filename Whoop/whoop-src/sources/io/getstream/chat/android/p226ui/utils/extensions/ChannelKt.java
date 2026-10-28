package io.getstream.chat.android.p226ui.utils.extensions;

import android.content.Context;
import ec3.C13045h2;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001e\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0002\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0000\"\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"isCurrentUserBanned", "", "Lio/getstream/chat/android/models/Channel;", "getMembersStatusText", "", "context", "Landroid/content/Context;", "currentUser", "Lio/getstream/chat/android/models/User;", "getLastMessage", "Lio/getstream/chat/android/models/Message;", "readCount", "", "message", "EXTRA_DATA_MUTED", "isMuted", "(Lio/getstream/chat/android/models/Channel;)Z", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelKt {
    public static final String EXTRA_DATA_MUTED = "mutedChannel";

    public static final Message getLastMessage(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        return io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt.getPreviewMessage(channel, ChatUI.getCurrentUserProvider().getCurrentUser());
    }

    public static final String getMembersStatusText(Channel channel, Context context, User user) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt.getMembersStatusText$default(channel, context, user, false, false, C19469R.string.stream_ui_user_status_online, C19469R.string.stream_ui_user_status_last_seen_just_now, C19469R.string.stream_ui_user_status_last_seen, C19469R.plurals.stream_ui_channel_header_member_count, C19469R.string.stream_ui_channel_header_member_count_online, 12, null);
    }

    public static /* synthetic */ String getMembersStatusText$default(Channel channel, Context context, User user, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            user = ChatUI.getCurrentUserProvider().getCurrentUser();
        }
        return getMembersStatusText(channel, context, user);
    }

    public static final boolean isCurrentUserBanned(Channel channel) {
        String id4;
        AbstractC22676k.m65750j(channel, "<this>");
        User user = (User) ((C13045h2) ChatClient.INSTANCE.instance().getClientState().getUser()).getValue();
        if (user == null || (id4 = user.getId()) == null) {
            return false;
        }
        List<Member> members = channel.getMembers();
        if ((members instanceof Collection) && members.isEmpty()) {
            return false;
        }
        for (Member member : members) {
            if (AbstractC22676k.m65745e(member.getUser().getId(), id4) && member.getBanned()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isMuted(Channel channel) {
        AbstractC22676k.m65750j(channel, "<this>");
        Boolean bool = (Boolean) channel.getExtraData().get(EXTRA_DATA_MUTED);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final int readCount(Channel channel, Message message) {
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(message, "message");
        User user = (User) ((C13045h2) ChatClient.INSTANCE.instance().getClientState().getUser()).getValue();
        List<ChannelUserRead> read = channel.getRead();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = read.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!AbstractC22676k.m65745e(((ChannelUserRead) next).getUser().getId(), user != null ? user.getId() : null)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Date lastRead = ((ChannelUserRead) it3.next()).getLastRead();
            if (lastRead != null) {
                arrayList2.add(lastRead);
            }
        }
        int i13 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            if (((Date) it4.next()).getTime() >= MessageKt.getCreatedAtOrThrow(message).getTime() && (i13 = i13 + 1) < 0) {
                AbstractC37056f.m118976c0();
                throw null;
            }
        }
        return i13;
    }
}
