package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal;

import androidx.core.app.NotificationCompat;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.PushPreference;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0018\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001bH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001bH&¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001bH&¢\u0006\u0004\b\"\u0010 J\u001d\u0010&\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0010H&¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b/\u0010.J\u0017\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H&¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b4\u0010 J\u000f\u00105\u001a\u00020\u0010H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0010H&¢\u0006\u0004\b7\u00106J\u0011\u00108\u001a\u0004\u0018\u00010+H&¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H&¢\u0006\u0004\b:\u0010.J\u0019\u0010;\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b;\u0010<JH\u0010C\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u000e2\b\b\u0002\u0010?\u001a\u00020\u00102\b\b\u0002\u0010@\u001a\u00020\u00102\b\b\u0002\u0010A\u001a\u00020\u00102\b\b\u0002\u0010B\u001a\u00020\u0010H¦@¢\u0006\u0004\bC\u0010DJ\u001d\u0010G\u001a\u00020\u00042\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0#H&¢\u0006\u0004\bG\u0010'J\u0017\u0010I\u001a\u00020\u00042\u0006\u0010H\u001a\u00020EH&¢\u0006\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010Pø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006RÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;", "", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "query", "Ll83/a0;", "updateStateFromDatabase", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "setPaginationDirection", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "onQueryChannelResult", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V", "", MapboxMap.QFE_LIMIT, "", "userPresence", "watch", "(IZLq83/d;)Ljava/lang/Object;", "", "messageId", "loadAfter", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "loadBefore", "loadAround", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "getMessage", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "message", "upsertMessage", "(Lio/getstream/chat/android/models/Message;)V", "updateLastMessageAt", "deleteMessage", "", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "upsertMembers", "(Ljava/util/List;)V", "hidden", "setHidden", "(Z)V", "Ljava/util/Date;", HttpHeaders.DATE, "hideMessagesBefore", "(Ljava/util/Date;)V", "removeMessagesBefore", "Lio/getstream/chat/android/models/PushPreference;", "preference", "setPushPreference", "(Lio/getstream/chat/android/models/PushPreference;)V", "setRepliedMessage", "markRead", "()Z", "typingEventsEnabled", "getLastStartTypingEvent", "()Ljava/util/Date;", "setLastStartTypingEvent", "setKeystrokeParentMessageId", "(Ljava/lang/String;)V", "channel", "messageLimit", "shouldRefreshMessages", "scrollUpdate", "isNotificationUpdate", "isChannelsStateUpdate", "updateDataForChannel", "(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/events/ChatEvent;", "events", "handleEvents", NotificationCompat.CATEGORY_EVENT, "handleEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "getCid", "()Ljava/lang/String;", "cid", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "getMessagesUpdateLogic", "()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "messagesUpdateLogic", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelLogic {
    static /* synthetic */ Object updateDataForChannel$default(ChannelLogic channelLogic, Channel channel, int i13, boolean z4, boolean z13, boolean z14, boolean z15, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateDataForChannel");
        }
        if ((i14 & 4) != 0) {
            z4 = false;
        }
        if ((i14 & 8) != 0) {
            z13 = false;
        }
        if ((i14 & 16) != 0) {
            z14 = false;
        }
        if ((i14 & 32) != 0) {
            z15 = false;
        }
        return channelLogic.updateDataForChannel(channel, i13, z4, z13, z14, z15, interfaceC30057d);
    }

    static /* synthetic */ Object watch$default(ChannelLogic channelLogic, int i13, boolean z4, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: watch");
        }
        if ((i14 & 1) != 0) {
            i13 = 30;
        }
        return channelLogic.watch(i13, z4, interfaceC30057d);
    }

    void deleteMessage(Message message);

    String getCid();

    Date getLastStartTypingEvent();

    Message getMessage(String messageId);

    ChannelMessagesUpdateLogic getMessagesUpdateLogic();

    void handleEvent(ChatEvent event);

    void handleEvents(List<? extends ChatEvent> events);

    void hideMessagesBefore(Date date);

    Object loadAfter(String str, int i13, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d);

    Object loadAround(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d);

    Object loadBefore(String str, int i13, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d);

    boolean markRead();

    void onQueryChannelResult(QueryChannelRequest query, AbstractC26205h result);

    void removeMessagesBefore(Date date);

    void setHidden(boolean hidden);

    void setKeystrokeParentMessageId(String messageId);

    void setLastStartTypingEvent(Date date);

    void setPaginationDirection(QueryChannelRequest query);

    void setPushPreference(PushPreference preference);

    void setRepliedMessage(Message message);

    boolean typingEventsEnabled();

    Object updateDataForChannel(Channel channel, int i13, boolean z4, boolean z13, boolean z14, boolean z15, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void updateLastMessageAt(Message message);

    Object updateStateFromDatabase(QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void upsertMembers(List<Member> members);

    void upsertMessage(Message message);

    Object watch(int i13, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d);
}
