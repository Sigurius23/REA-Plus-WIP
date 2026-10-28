.class public final Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;
.super Lio/getstream/chat/android/client/events/CidEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/events/UserEvent;
.implements Lio/getstream/chat/android/client/events/HasUnreadCounts;
.implements Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u00083\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0097\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0008\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0008H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\u000bH\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\u0006H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\t\u00108\u001a\u00020\u0010H\u00c6\u0003J\t\u00109\u001a\u00020\u0010H\u00c6\u0003J\t\u0010:\u001a\u00020\u0010H\u00c6\u0003J\t\u0010;\u001a\u00020\u0006H\u00c6\u0003J\t\u0010<\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0010H\u00c6\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u00b4\u0001\u0010A\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00082\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00102\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\u0008\u0010E\u001a\u0004\u0018\u00010FH\u00d6\u0003J\t\u0010G\u001a\u00020\u0010H\u00d6\u0001J\t\u0010H\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001cR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0014\u0010\u000c\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001cR\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0014\u0010\u0011\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010&R\u0011\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010&R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u001cR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0096\u0004\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\u0008/\u0010.\u00a8\u0006I"
    }
    d2 = {
        "Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;",
        "Lio/getstream/chat/android/client/events/CidEvent;",
        "Lio/getstream/chat/android/client/events/UserEvent;",
        "Lio/getstream/chat/android/client/events/HasUnreadCounts;",
        "Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;",
        "type",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "rawCreatedAt",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "cid",
        "channelType",
        "channelId",
        "totalUnreadCount",
        "",
        "unreadChannels",
        "unreadMessages",
        "firstUnreadMessageId",
        "lastReadMessageAt",
        "lastReadMessageId",
        "threadId",
        "unreadThreads",
        "unreadThreadMessages",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V",
        "getType",
        "()Ljava/lang/String;",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getRawCreatedAt",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "getCid",
        "getChannelType",
        "getChannelId",
        "getTotalUnreadCount",
        "()I",
        "getUnreadChannels",
        "getUnreadMessages",
        "getFirstUnreadMessageId",
        "getLastReadMessageAt",
        "getLastReadMessageId",
        "getThreadId",
        "getUnreadThreads",
        "()Ljava/lang/Integer;",
        "getUnreadThreadMessages",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "copy",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
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
.field private final channelId:Ljava/lang/String;

.field private final channelType:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final createdAt:Ljava/util/Date;

.field private final firstUnreadMessageId:Ljava/lang/String;

.field private final lastReadMessageAt:Ljava/util/Date;

.field private final lastReadMessageId:Ljava/lang/String;

.field private final rawCreatedAt:Ljava/lang/String;

.field private final threadId:Ljava/lang/String;

.field private final totalUnreadCount:I

.field private final type:Ljava/lang/String;

.field private final unreadChannels:I

.field private final unreadMessages:I

.field private final unreadThreadMessages:Ljava/lang/Integer;

.field private final unreadThreads:I

.field private final user:Lio/getstream/chat/android/models/User;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawCreatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstUnreadMessageId"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastReadMessageAt"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/events/ChatEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->type:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->createdAt:Ljava/util/Date;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->rawCreatedAt:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->user:Lio/getstream/chat/android/models/User;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->cid:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelType:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelId:Ljava/lang/String;

    .line 9
    iput p8, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->totalUnreadCount:I

    .line 10
    iput p9, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadChannels:I

    .line 11
    iput p10, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadMessages:I

    .line 12
    iput-object p11, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->firstUnreadMessageId:Ljava/lang/String;

    .line 13
    iput-object p12, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageAt:Ljava/util/Date;

    move-object p1, p13

    .line 14
    iput-object p1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageId:Ljava/lang/String;

    move-object p1, p14

    .line 15
    iput-object p1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->threadId:Ljava/lang/String;

    move/from16 p1, p15

    .line 16
    iput p1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreads:I

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreadMessages:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p17

    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v11, v2

    goto :goto_0

    :cond_0
    move/from16 v11, p8

    :goto_0
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_1

    move v12, v2

    goto :goto_1

    :cond_1
    move/from16 v12, p9

    :goto_1
    and-int/lit16 v1, v0, 0x2000

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move-object/from16 v17, v3

    goto :goto_2

    :cond_2
    move-object/from16 v17, p14

    :goto_2
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_3

    move/from16 v18, v2

    goto :goto_3

    :cond_3
    move/from16 v18, p15

    :goto_3
    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    move-object/from16 v19, v3

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    move-object/from16 v3, p0

    goto :goto_4

    :cond_4
    move-object/from16 v19, p16

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    .line 18
    :goto_4
    invoke-direct/range {v3 .. v19}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->createdAt:Ljava/util/Date;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->rawCreatedAt:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->user:Lio/getstream/chat/android/models/User;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->cid:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelType:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelId:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->totalUnreadCount:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadChannels:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadMessages:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->firstUnreadMessageId:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageAt:Ljava/util/Date;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageId:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->threadId:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreads:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreadMessages:Ljava/lang/Integer;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadMessages:I

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->firstUnreadMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->threadId:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreads:I

    return v0
.end method

.method public final component16()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreadMessages:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->totalUnreadCount:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadChannels:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;
    .locals 18

    const-string v0, "type"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawCreatedAt"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstUnreadMessageId"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastReadMessageAt"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->user:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->totalUnreadCount:I

    iget v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->totalUnreadCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadChannels:I

    iget v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadChannels:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadMessages:I

    iget v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadMessages:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->firstUnreadMessageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->firstUnreadMessageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->threadId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->threadId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreads:I

    iget v3, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreads:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreadMessages:Ljava/lang/Integer;

    iget-object p1, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreadMessages:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getFirstUnreadMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->firstUnreadMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastReadMessageAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getLastReadMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getRawCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getThreadId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->threadId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalUnreadCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->totalUnreadCount:I

    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnreadChannels()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadChannels:I

    return v0
.end method

.method public final getUnreadMessages()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadMessages:I

    return v0
.end method

.method public final getUnreadThreadMessages()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreadMessages:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getUnreadThreads()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreads:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v2, v0, v1}, Ld13/a;->b(Lio/getstream/chat/android/models/User;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->totalUnreadCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadChannels:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadMessages:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->firstUnreadMessageId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageId:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->threadId:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreads:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreadMessages:Ljava/lang/Integer;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->type:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->createdAt:Ljava/util/Date;

    iget-object v3, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->user:Lio/getstream/chat/android/models/User;

    iget-object v5, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->cid:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelType:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->channelId:Ljava/lang/String;

    iget v8, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->totalUnreadCount:I

    iget v9, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadChannels:I

    iget v10, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadMessages:I

    iget-object v11, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->firstUnreadMessageId:Ljava/lang/String;

    iget-object v12, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageAt:Ljava/util/Date;

    iget-object v13, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->lastReadMessageId:Ljava/lang/String;

    iget-object v14, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->threadId:Ljava/lang/String;

    iget v15, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreads:I

    move/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->unreadThreadMessages:Ljava/lang/Integer;

    const-string v0, ", createdAt="

    move-object/from16 v17, v15

    const-string v15, ", rawCreatedAt="

    move-object/from16 v18, v13

    const-string v13, "NotificationMarkUnreadEvent(type="

    invoke-static {v13, v1, v0, v2, v15}, Lc13/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", user="

    const-string v2, ", cid="

    invoke-static {v0, v3, v1, v4, v2}, Ld13/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;)V

    const-string v1, ", channelType="

    const-string v2, ", channelId="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", totalUnreadCount="

    const-string v2, ", unreadChannels="

    invoke-static {v8, v7, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", unreadMessages="

    const-string v2, ", firstUnreadMessageId="

    invoke-static {v0, v9, v1, v10, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", lastReadMessageAt="

    const-string v2, ", lastReadMessageId="

    invoke-static {v0, v11, v1, v12, v2}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", threadId="

    const-string v2, ", unreadThreads="

    move-object/from16 v3, v18

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", unreadThreadMessages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
