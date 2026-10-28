package io.getstream.chat.android.client.events;

import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0013\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/events/ChatEvent;", "", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "rawCreatedAt", "getRawCreatedAt", "seq", "", "getSeq", "()I", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/ConnectedEvent;", "Lio/getstream/chat/android/client/events/ConnectingEvent;", "Lio/getstream/chat/android/client/events/ConnectionErrorEvent;", "Lio/getstream/chat/android/client/events/DisconnectedEvent;", "Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;", "Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;", "Lio/getstream/chat/android/client/events/ErrorEvent;", "Lio/getstream/chat/android/client/events/GlobalUserBannedEvent;", "Lio/getstream/chat/android/client/events/GlobalUserUnbannedEvent;", "Lio/getstream/chat/android/client/events/HealthEvent;", "Lio/getstream/chat/android/client/events/MarkAllReadEvent;", "Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;", "Lio/getstream/chat/android/client/events/NotificationMutesUpdatedEvent;", "Lio/getstream/chat/android/client/events/UnknownEvent;", "Lio/getstream/chat/android/client/events/UserDeletedEvent;", "Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;", "Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;", "Lio/getstream/chat/android/client/events/UserUpdatedEvent;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ChatEvent {
    private final int seq;

    public /* synthetic */ ChatEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Date getCreatedAt();

    public abstract String getRawCreatedAt();

    public final int getSeq() {
        return this.seq;
    }

    public abstract String getType();

    private ChatEvent() {
        this.seq = ChatEventKt.seqGenerator.incrementAndGet();
    }
}
