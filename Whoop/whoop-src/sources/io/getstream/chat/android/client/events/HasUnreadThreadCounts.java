package io.getstream.chat.android.client.events;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0003\b\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;", "", "unreadThreads", "", "getUnreadThreads", "()Ljava/lang/Integer;", "unreadThreadMessages", "getUnreadThreadMessages", "Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;", "Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;", "Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface HasUnreadThreadCounts {
    Integer getUnreadThreadMessages();

    Integer getUnreadThreads();
}
