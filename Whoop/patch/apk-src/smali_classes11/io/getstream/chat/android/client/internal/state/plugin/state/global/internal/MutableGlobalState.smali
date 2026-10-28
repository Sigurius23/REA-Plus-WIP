.class public final Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api/state/GlobalState;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0014\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\n2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\n2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0019\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u001b\u0010\"\u001a\u00020\n2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u0019\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010\'\u001a\u00020\n2\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008\'\u0010&J\u001d\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008+\u0010,J\u0015\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008/\u00100J\u001b\u00102\u001a\u00020\n2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020-0\u0019\u00a2\u0006\u0004\u00082\u0010\u001dJ\r\u00103\u001a\u00020\n\u00a2\u0006\u0004\u00083\u0010\u000cJ\u001f\u00104\u001a\u0008\u0012\u0004\u0012\u00020-0\u0019*\u0008\u0012\u0004\u0012\u00020-0\u0019H\u0002\u00a2\u0006\u0004\u00084\u00105J\u001b\u00107\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001506H\u0002\u00a2\u0006\u0004\u00087\u00108R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u00109R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010:R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010=R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010=R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010=R$\u0010A\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u0019\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010=R$\u0010B\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010=R$\u0010C\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0019\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010=R*\u0010E\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0D\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010=R*\u0010F\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0D\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010=R*\u0010G\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0D\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010=R\"\u0010H\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\u00190;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010=R \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010J\u001a\u0004\u0008K\u0010LR \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010J\u001a\u0004\u0008M\u0010LR \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010J\u001a\u0004\u0008N\u0010LR&\u0010O\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u00190I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008O\u0010J\u001a\u0004\u0008P\u0010LR&\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00190I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010J\u001a\u0004\u0008Q\u0010LR&\u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00190I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010J\u001a\u0004\u0008R\u0010LR \u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010J\u001a\u0004\u0008S\u0010LR,\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0D0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008T\u0010J\u001a\u0004\u0008U\u0010LR,\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0D0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008V\u0010J\u001a\u0004\u0008W\u0010LR,\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0D0I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008X\u0010J\u001a\u0004\u0008Y\u0010LR&\u0010Z\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\u00190I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008Z\u0010J\u001a\u0004\u0008[\u0010LR&\u0010\\\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0\u00190I8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\\\u0010J\u001a\u0004\u0008]\u0010L\u00a8\u0006^"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "userId",
        "Lkotlin/Function0;",
        "",
        "now",
        "<init>",
        "(Ljava/lang/String;Lc93/a;)V",
        "Ll83/a0;",
        "destroy",
        "()V",
        "",
        "totalUnreadCount",
        "setTotalUnreadCount",
        "(I)V",
        "channelUnreadCount",
        "setChannelUnreadCount",
        "unreadThreadsCount",
        "setUnreadThreadsCount",
        "",
        "banned",
        "setBanned",
        "(Z)V",
        "",
        "Lio/getstream/chat/android/models/ChannelMute;",
        "channelMutes",
        "setChannelMutes",
        "(Ljava/util/List;)V",
        "blockedUserIds",
        "setBlockedUserIds",
        "Lio/getstream/chat/android/models/Mute;",
        "mutedUsers",
        "setMutedUsers",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "draftMessage",
        "updateDraftMessage",
        "(Lio/getstream/chat/android/models/DraftMessage;)V",
        "removeDraftMessage",
        "cid",
        "Lio/getstream/chat/android/models/TypingEvent;",
        "typingEvent",
        "tryEmitTypingEvent",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/TypingEvent;)V",
        "Lio/getstream/chat/android/models/Location;",
        "location",
        "addLiveLocation",
        "(Lio/getstream/chat/android/models/Location;)V",
        "locations",
        "addLiveLocations",
        "removeExpiredLiveLocations",
        "removeExpired",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lkotlin/Function1;",
        "nonExpiredPredicate",
        "()Lkotlin/jvm/functions/Function1;",
        "Ljava/lang/String;",
        "Lc93/a;",
        "Lec3/p1;",
        "_totalUnreadCount",
        "Lec3/p1;",
        "_channelUnreadCount",
        "_unreadThreadsCount",
        "_banned",
        "_mutedUsers",
        "_channelMutes",
        "_blockedUsersIds",
        "",
        "_typingChannels",
        "_channelDraftMessages",
        "_threadDraftMessages",
        "_activeLiveLocations",
        "Lec3/f2;",
        "Lec3/f2;",
        "getTotalUnreadCount",
        "()Lec3/f2;",
        "getChannelUnreadCount",
        "getUnreadThreadsCount",
        "muted",
        "getMuted",
        "getChannelMutes",
        "getBlockedUserIds",
        "getBanned",
        "typingChannels",
        "getTypingChannels",
        "channelDraftMessages",
        "getChannelDraftMessages",
        "threadDraftMessages",
        "getThreadDraftMessages",
        "activeLiveLocations",
        "getActiveLiveLocations",
        "currentUserActiveLiveLocations",
        "getCurrentUserActiveLiveLocations",
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


# instance fields
.field private _activeLiveLocations:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _banned:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _blockedUsersIds:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _channelDraftMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _channelMutes:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _channelUnreadCount:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _mutedUsers:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _threadDraftMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _totalUnreadCount:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _typingChannels:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _unreadThreadsCount:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final activeLiveLocations:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final banned:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final blockedUserIds:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelDraftMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelMutes:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelUnreadCount:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final currentUserActiveLiveLocations:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final muted:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final threadDraftMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final totalUnreadCount:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final typingChannels:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final unreadThreadsCount:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->userId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->now:Lc93/a;

    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_totalUnreadCount:Lec3/p1;

    .line 5
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelUnreadCount:Lec3/p1;

    .line 6
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_unreadThreadsCount:Lec3/p1;

    .line 7
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_banned:Lec3/p1;

    .line 8
    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_mutedUsers:Lec3/p1;

    .line 9
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelMutes:Lec3/p1;

    .line 10
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_blockedUsersIds:Lec3/p1;

    .line 11
    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_typingChannels:Lec3/p1;

    .line 12
    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelDraftMessages:Lec3/p1;

    .line 13
    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_threadDraftMessages:Lec3/p1;

    .line 14
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_activeLiveLocations:Lec3/p1;

    .line 15
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_totalUnreadCount:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->totalUnreadCount:Lec3/f2;

    .line 16
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelUnreadCount:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->channelUnreadCount:Lec3/f2;

    .line 17
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_unreadThreadsCount:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->unreadThreadsCount:Lec3/f2;

    .line 18
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_mutedUsers:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->muted:Lec3/f2;

    .line 19
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelMutes:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->channelMutes:Lec3/f2;

    .line 20
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_blockedUsersIds:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->blockedUserIds:Lec3/f2;

    .line 21
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_banned:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->banned:Lec3/f2;

    .line 22
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_typingChannels:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->typingChannels:Lec3/f2;

    .line 23
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelDraftMessages:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->channelDraftMessages:Lec3/f2;

    .line 24
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_threadDraftMessages:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->threadDraftMessages:Lec3/f2;

    .line 25
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_activeLiveLocations:Lec3/p1;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->activeLiveLocations:Lec3/f2;

    .line 26
    new-instance p2, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;I)V

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->mapState(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->currentUserActiveLiveLocations:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 27
    sget-object p2, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$1;

    .line 28
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;-><init>(Ljava/lang/String;Lc93/a;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->currentUserActiveLiveLocations$lambda$1(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final addLiveLocations$lambda$14$lambda$13(Ljava/util/List;Lio/getstream/chat/android/models/Location;)Z
    .locals 3

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Location;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Location;->getMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Location;->getMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/models/Location;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->nonExpiredPredicate$lambda$16(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/models/Location;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Ljava/util/List;Lio/getstream/chat/android/models/Location;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->addLiveLocations$lambda$14$lambda$13(Ljava/util/List;Lio/getstream/chat/android/models/Location;)Z

    move-result p0

    return p0
.end method

.method private static final currentUserActiveLiveLocations$lambda$1(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Ljava/util/List;)Ljava/util/List;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Location;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Location;->getUserId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->userId:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private final nonExpiredPredicate()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;I)V

    return-object v0
.end method

.method private static final nonExpiredPredicate$lambda$16(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/models/Location;)Z
    .locals 3

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Location;->getEndAt()Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/Date;

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->now:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p1, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final removeExpired(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Location;

    invoke-static {p0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->b(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/models/Location;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final addLiveLocation(Lio/getstream/chat/android/models/Location;)V
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->addLiveLocations(Ljava/util/List;)V

    return-void
.end method

.method public final addLiveLocations(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;)V"
        }
    .end annotation

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_activeLiveLocations:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v3

    new-instance v4, Lej1/s;

    const/4 v5, 0x2

    invoke-direct {v4, p1, v5}, Lej1/s;-><init>(Ljava/util/List;I)V

    new-instance v6, Lxb3/f;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v7, v4}, Lxb3/f;-><init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v3

    new-array v4, v5, [Lxb3/i;

    aput-object v6, v4, v7

    const/4 v5, 0x1

    aput-object v3, v4, v5

    invoke-static {v4}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object v3

    new-instance v4, Lxa0/a;

    const/4 v6, 0x3

    invoke-direct {v4, v6}, Lxa0/a;-><init>(I)V

    invoke-static {v3, v4}, Lxb3/k;->v(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object v3

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/a;

    invoke-direct {v4, p0, v5}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;I)V

    invoke-static {v3, v4}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v3

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState$addLiveLocations$lambda$14$$inlined$sortedBy$1;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v3, v4}, Lxb3/k;->C(Lxb3/i;Ljava/util/Comparator;)Lxb3/o;

    move-result-object v3

    invoke-static {v3}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final destroy()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_totalUnreadCount:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelUnreadCount:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_unreadThreadsCount:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_mutedUsers:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelMutes:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_blockedUsersIds:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_banned:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_typingChannels:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelDraftMessages:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_threadDraftMessages:Lec3/p1;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_activeLiveLocations:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {v1, v0, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final getActiveLiveLocations()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->activeLiveLocations:Lec3/f2;

    return-object v0
.end method

.method public final getBanned()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->banned:Lec3/f2;

    return-object v0
.end method

.method public final getBlockedUserIds()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->blockedUserIds:Lec3/f2;

    return-object v0
.end method

.method public final getChannelDraftMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->channelDraftMessages:Lec3/f2;

    return-object v0
.end method

.method public final getChannelMutes()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->channelMutes:Lec3/f2;

    return-object v0
.end method

.method public final getChannelUnreadCount()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->channelUnreadCount:Lec3/f2;

    return-object v0
.end method

.method public final getCurrentUserActiveLiveLocations()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->currentUserActiveLiveLocations:Lec3/f2;

    return-object v0
.end method

.method public final getMuted()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->muted:Lec3/f2;

    return-object v0
.end method

.method public final getThreadDraftMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->threadDraftMessages:Lec3/f2;

    return-object v0
.end method

.method public final getTotalUnreadCount()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->totalUnreadCount:Lec3/f2;

    return-object v0
.end method

.method public final getTypingChannels()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->typingChannels:Lec3/f2;

    return-object v0
.end method

.method public final getUnreadThreadsCount()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->unreadThreadsCount:Lec3/f2;

    return-object v0
.end method

.method public final removeDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V
    .locals 4

    const-string v0, "draftMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getParentId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_threadDraftMessages:Lec3/p1;

    if-eqz v2, :cond_0

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-static {v0, v3}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelDraftMessages:Lec3/p1;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getParentId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    move-object v0, v1

    :cond_1
    if-eqz v0, :cond_2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final removeExpiredLiveLocations()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_activeLiveLocations:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    invoke-direct {p0, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->removeExpired(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final setBanned(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_banned:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setBlockedUserIds(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "blockedUserIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_blockedUsersIds:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setChannelMutes(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;)V"
        }
    .end annotation

    const-string v0, "channelMutes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelMutes:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setChannelUnreadCount(I)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelUnreadCount:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setMutedUsers(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mutedUsers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_mutedUsers:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setTotalUnreadCount(I)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_totalUnreadCount:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setUnreadThreadsCount(I)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_unreadThreadsCount:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final tryEmitTypingEvent(Ljava/lang/String;Lio/getstream/chat/android/models/TypingEvent;)V
    .locals 3

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typingEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_typingChannels:Lec3/p1;

    if-eqz v0, :cond_1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/TypingEvent;->getUsers()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final updateDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V
    .locals 5

    const-string v0, "draftMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getParentId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_threadDraftMessages:Lec3/p1;

    if-eqz v2, :cond_0

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v4}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->_channelDraftMessages:Lec3/p1;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getParentId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    move-object v0, v1

    :cond_1
    if-eqz v0, :cond_2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getCid()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v4}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
