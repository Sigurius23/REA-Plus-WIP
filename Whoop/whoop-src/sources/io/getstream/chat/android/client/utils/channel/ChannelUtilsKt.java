package io.getstream.chat.android.client.utils.channel;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageType;
import java.util.Date;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0007\u001a$\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, m65681d2 = {"generateChannelIdIfNeeded", "", "channelId", "memberIds", "", "calculateNewLastMessageAt", "Ljava/util/Date;", "message", "Lio/getstream/chat/android/models/Message;", "currentLastMessageAt", "skipLastMsgUpdateForSystemMsgs", "", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelUtilsKt {
    public static final Date calculateNewLastMessageAt(Message message, Date date, boolean z4) {
        Date createdLocallyAt;
        AbstractC22676k.m65750j(message, "message");
        if (!message.getShadowed() && (!(AbstractC22676k.m65745e(message.getType(), MessageType.SYSTEM) && z4) && ((message.getParentId() == null || message.getShowInChannel()) && !((createdLocallyAt = message.getCreatedLocallyAt()) == null && (createdLocallyAt = message.getCreatedAt()) == null)))) {
            return (date == null || createdLocallyAt.after(date)) ? createdLocallyAt : date;
        }
        return date;
    }

    @InternalStreamChatApi
    public static final String generateChannelIdIfNeeded(String channelId, List<String> memberIds) {
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        return AbstractC39414r.m125890i0(channelId) ? AbstractC25265s.m74110N0(memberIds, null, "!members-", null, null, 61) : channelId;
    }
}
