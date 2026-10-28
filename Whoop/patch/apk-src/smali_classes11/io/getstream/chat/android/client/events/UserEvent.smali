.class public interface abstract Lio/getstream/chat/android/client/events/UserEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\"\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006(\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/events/UserEvent;",
        "",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "Lio/getstream/chat/android/client/events/AIIndicatorClearEvent;",
        "Lio/getstream/chat/android/client/events/AIIndicatorStopEvent;",
        "Lio/getstream/chat/android/client/events/AIIndicatorUpdatedEvent;",
        "Lio/getstream/chat/android/client/events/ChannelHiddenEvent;",
        "Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;",
        "Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;",
        "Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;",
        "Lio/getstream/chat/android/client/events/ChannelVisibleEvent;",
        "Lio/getstream/chat/android/client/events/GlobalUserBannedEvent;",
        "Lio/getstream/chat/android/client/events/GlobalUserUnbannedEvent;",
        "Lio/getstream/chat/android/client/events/MarkAllReadEvent;",
        "Lio/getstream/chat/android/client/events/MemberAddedEvent;",
        "Lio/getstream/chat/android/client/events/MemberRemovedEvent;",
        "Lio/getstream/chat/android/client/events/MemberUpdatedEvent;",
        "Lio/getstream/chat/android/client/events/MessageDeliveredEvent;",
        "Lio/getstream/chat/android/client/events/MessageReadEvent;",
        "Lio/getstream/chat/android/client/events/MessageUpdatedEvent;",
        "Lio/getstream/chat/android/client/events/NewMessageEvent;",
        "Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;",
        "Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;",
        "Lio/getstream/chat/android/client/events/NotificationInvitedEvent;",
        "Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;",
        "Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;",
        "Lio/getstream/chat/android/client/events/ReactionDeletedEvent;",
        "Lio/getstream/chat/android/client/events/ReactionNewEvent;",
        "Lio/getstream/chat/android/client/events/ReactionUpdateEvent;",
        "Lio/getstream/chat/android/client/events/TypingStartEvent;",
        "Lio/getstream/chat/android/client/events/TypingStopEvent;",
        "Lio/getstream/chat/android/client/events/UserDeletedEvent;",
        "Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;",
        "Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;",
        "Lio/getstream/chat/android/client/events/UserStartWatchingEvent;",
        "Lio/getstream/chat/android/client/events/UserStopWatchingEvent;",
        "Lio/getstream/chat/android/client/events/UserUpdatedEvent;",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getUser()Lio/getstream/chat/android/models/User;
.end method
