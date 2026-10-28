package io.getstream.chat.android.client.channel.state;

import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R,\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160\u00150\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00160\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00160\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00160\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00160\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0013R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020 0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0013R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00160\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0013R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0013R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002050\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0013R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002080\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0013R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u0002080\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0013R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u0002080\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0013R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u0002080\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0013R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u0002080\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0013R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u0002080\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0013R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u0002080\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0013R\u0014\u0010I\u001a\u0002088&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0013R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u0002080\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0013R\u001c\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0013R \u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0\u00160\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0013R\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006WÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/channel/state/ChannelState;", "", "Lio/getstream/chat/android/models/Channel;", "toChannel", "()Lio/getstream/chat/android/models/Channel;", "", "id", "Lio/getstream/chat/android/models/Message;", "getMessageById", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "getChannelType", "()Ljava/lang/String;", "channelType", "getChannelId", "channelId", "getCid", "cid", "Lec3/f2;", "getRepliedMessage", "()Lec3/f2;", "repliedMessage", "", "", "getQuotedMessagesMap", "quotedMessagesMap", "getMessages", "messages", "getPinnedMessages", "pinnedMessages", "Lio/getstream/chat/android/models/MessagesState;", "getMessagesState", "messagesState", "", "getWatcherCount", "watcherCount", "Lio/getstream/chat/android/models/User;", "getWatchers", "watchers", "Lio/getstream/chat/android/models/TypingEvent;", "getTyping", "typing", "Lio/getstream/chat/android/models/ChannelUserRead;", "getReads", "reads", "getRead", "read", "getUnreadCount", "unreadCount", "Lio/getstream/chat/android/models/Member;", "getMembers", QueryChannelRequest.KEY_MEMBERS, "getMembersCount", "membersCount", "Lio/getstream/chat/android/models/ChannelData;", "getChannelData", "channelData", "", "getHidden", "hidden", "getMuted", "muted", "getLoading", "loading", "getLoadingOlderMessages", "loadingOlderMessages", "getLoadingNewerMessages", "loadingNewerMessages", "getEndOfOlderMessages", "endOfOlderMessages", "getEndOfNewerMessages", "endOfNewerMessages", "getRecoveryNeeded", "()Z", "recoveryNeeded", "Lio/getstream/chat/android/models/Config;", "getChannelConfig", "channelConfig", "getInsideSearch", "insideSearch", "Ljava/util/Date;", "getLastSentMessageDate", "lastSentMessageDate", "Lio/getstream/chat/android/models/Location;", "getActiveLiveLocations", "activeLiveLocations", "getMessageCount", "messageCount", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelState {
    InterfaceC13037f2 getActiveLiveLocations();

    InterfaceC13037f2 getChannelConfig();

    InterfaceC13037f2 getChannelData();

    String getChannelId();

    String getChannelType();

    String getCid();

    InterfaceC13037f2 getEndOfNewerMessages();

    InterfaceC13037f2 getEndOfOlderMessages();

    InterfaceC13037f2 getHidden();

    InterfaceC13037f2 getInsideSearch();

    InterfaceC13037f2 getLastSentMessageDate();

    InterfaceC13037f2 getLoading();

    InterfaceC13037f2 getLoadingNewerMessages();

    InterfaceC13037f2 getLoadingOlderMessages();

    InterfaceC13037f2 getMembers();

    InterfaceC13037f2 getMembersCount();

    Message getMessageById(String id4);

    InterfaceC13037f2 getMessageCount();

    InterfaceC13037f2 getMessages();

    InterfaceC13037f2 getMessagesState();

    InterfaceC13037f2 getMuted();

    InterfaceC13037f2 getPinnedMessages();

    InterfaceC13037f2 getQuotedMessagesMap();

    InterfaceC13037f2 getRead();

    InterfaceC13037f2 getReads();

    /* JADX INFO: renamed from: getRecoveryNeeded */
    boolean get_recoveryNeeded();

    InterfaceC13037f2 getRepliedMessage();

    InterfaceC13037f2 getTyping();

    InterfaceC13037f2 getUnreadCount();

    InterfaceC13037f2 getWatcherCount();

    InterfaceC13037f2 getWatchers();

    Channel toChannel();
}
