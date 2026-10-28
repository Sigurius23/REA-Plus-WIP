.class public interface abstract Lio/getstream/chat/android/client/channel/state/ChannelState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000c\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u000bR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R,\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00160\u00150\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0013R \u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00160\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0013R \u0010\u001c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00160\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0013R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0013R\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020 0\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0013R \u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\u00160\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u0013R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020&0\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u0013R \u0010+\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020)0\u00160\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u0013R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010\u0013R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020 0\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010\u0013R \u00102\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002000\u00160\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u0010\u0013R\u001a\u00104\u001a\u0008\u0012\u0004\u0012\u00020 0\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u0010\u0013R\u001a\u00107\u001a\u0008\u0012\u0004\u0012\u0002050\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u0010\u0013R\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u0002080\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010\u0013R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u0002080\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010\u0013R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u0002080\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010\u0013R\u001a\u0010@\u001a\u0008\u0012\u0004\u0012\u0002080\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010\u0013R\u001a\u0010B\u001a\u0008\u0012\u0004\u0012\u0002080\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010\u0013R\u001a\u0010D\u001a\u0008\u0012\u0004\u0012\u0002080\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010\u0013R\u001a\u0010F\u001a\u0008\u0012\u0004\u0012\u0002080\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010\u0013R\u0014\u0010I\u001a\u0002088&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010HR\u001a\u0010L\u001a\u0008\u0012\u0004\u0012\u00020J0\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010\u0013R\u001a\u0010N\u001a\u0008\u0012\u0004\u0012\u0002080\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010\u0013R\u001c\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010\u0013R \u0010T\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020R0\u00160\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010\u0013R\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008U\u0010\u0013\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006W\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "toChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "",
        "id",
        "Lio/getstream/chat/android/models/Message;",
        "getMessageById",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "getChannelType",
        "()Ljava/lang/String;",
        "channelType",
        "getChannelId",
        "channelId",
        "getCid",
        "cid",
        "Lec3/f2;",
        "getRepliedMessage",
        "()Lec3/f2;",
        "repliedMessage",
        "",
        "",
        "getQuotedMessagesMap",
        "quotedMessagesMap",
        "getMessages",
        "messages",
        "getPinnedMessages",
        "pinnedMessages",
        "Lio/getstream/chat/android/models/MessagesState;",
        "getMessagesState",
        "messagesState",
        "",
        "getWatcherCount",
        "watcherCount",
        "Lio/getstream/chat/android/models/User;",
        "getWatchers",
        "watchers",
        "Lio/getstream/chat/android/models/TypingEvent;",
        "getTyping",
        "typing",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "getReads",
        "reads",
        "getRead",
        "read",
        "getUnreadCount",
        "unreadCount",
        "Lio/getstream/chat/android/models/Member;",
        "getMembers",
        "members",
        "getMembersCount",
        "membersCount",
        "Lio/getstream/chat/android/models/ChannelData;",
        "getChannelData",
        "channelData",
        "",
        "getHidden",
        "hidden",
        "getMuted",
        "muted",
        "getLoading",
        "loading",
        "getLoadingOlderMessages",
        "loadingOlderMessages",
        "getLoadingNewerMessages",
        "loadingNewerMessages",
        "getEndOfOlderMessages",
        "endOfOlderMessages",
        "getEndOfNewerMessages",
        "endOfNewerMessages",
        "getRecoveryNeeded",
        "()Z",
        "recoveryNeeded",
        "Lio/getstream/chat/android/models/Config;",
        "getChannelConfig",
        "channelConfig",
        "getInsideSearch",
        "insideSearch",
        "Ljava/util/Date;",
        "getLastSentMessageDate",
        "lastSentMessageDate",
        "Lio/getstream/chat/android/models/Location;",
        "getActiveLiveLocations",
        "activeLiveLocations",
        "getMessageCount",
        "messageCount",
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
.method public abstract getActiveLiveLocations()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getChannelConfig()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getChannelData()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getChannelId()Ljava/lang/String;
.end method

.method public abstract getChannelType()Ljava/lang/String;
.end method

.method public abstract getCid()Ljava/lang/String;
.end method

.method public abstract getEndOfNewerMessages()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getEndOfOlderMessages()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getHidden()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getInsideSearch()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getLastSentMessageDate()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getLoading()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getLoadingNewerMessages()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getLoadingOlderMessages()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getMembers()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getMembersCount()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
.end method

.method public abstract getMessageCount()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getMessages()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getMessagesState()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getMuted()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getPinnedMessages()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getQuotedMessagesMap()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getRead()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getReads()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getRecoveryNeeded()Z
.end method

.method public abstract getRepliedMessage()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getTyping()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getUnreadCount()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getWatcherCount()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getWatchers()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract toChannel()Lio/getstream/chat/android/models/Channel;
.end method
