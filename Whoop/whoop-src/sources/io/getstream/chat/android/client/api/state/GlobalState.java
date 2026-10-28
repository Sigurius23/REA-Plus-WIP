package io.getstream.chat.android.client.api.state;

import ec3.InterfaceC13037f2;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190\u00180\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0005R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001c0\u00180\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001c0\u00180\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000b0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0005R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000b0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/GlobalState;", "", "Lec3/f2;", "", "getTotalUnreadCount", "()Lec3/f2;", "totalUnreadCount", "getChannelUnreadCount", "channelUnreadCount", "getUnreadThreadsCount", "unreadThreadsCount", "", "Lio/getstream/chat/android/models/Mute;", "getMuted", "muted", "Lio/getstream/chat/android/models/ChannelMute;", "getChannelMutes", "channelMutes", "", "getBlockedUserIds", "blockedUserIds", "", "getBanned", "banned", "", "Lio/getstream/chat/android/models/TypingEvent;", "getTypingChannels", "typingChannels", "Lio/getstream/chat/android/models/DraftMessage;", "getChannelDraftMessages", "channelDraftMessages", "getThreadDraftMessages", "threadDraftMessages", "Lio/getstream/chat/android/models/Location;", "getActiveLiveLocations", "activeLiveLocations", "getCurrentUserActiveLiveLocations", "currentUserActiveLiveLocations", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface GlobalState {
    InterfaceC13037f2 getActiveLiveLocations();

    InterfaceC13037f2 getBanned();

    InterfaceC13037f2 getBlockedUserIds();

    InterfaceC13037f2 getChannelDraftMessages();

    InterfaceC13037f2 getChannelMutes();

    InterfaceC13037f2 getChannelUnreadCount();

    InterfaceC13037f2 getCurrentUserActiveLiveLocations();

    InterfaceC13037f2 getMuted();

    InterfaceC13037f2 getThreadDraftMessages();

    InterfaceC13037f2 getTotalUnreadCount();

    InterfaceC13037f2 getTypingChannels();

    InterfaceC13037f2 getUnreadThreadsCount();
}
