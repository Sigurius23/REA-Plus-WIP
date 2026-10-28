.class public final Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;
.super Lio/getstream/chat/android/client/events/CidEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/events/HasChannel;
.implements Lio/getstream/chat/android/client/events/HasUnreadCounts;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BS\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\rH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000fH\u00c6\u0003J\t\u0010(\u001a\u00020\u000fH\u00c6\u0003Jc\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\u000fH\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0008\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0014R\u0014\u0010\u000c\u001a\u00020\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;",
        "Lio/getstream/chat/android/client/events/CidEvent;",
        "Lio/getstream/chat/android/client/events/HasChannel;",
        "Lio/getstream/chat/android/client/events/HasUnreadCounts;",
        "type",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "rawCreatedAt",
        "cid",
        "channelType",
        "channelId",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "totalUnreadCount",
        "",
        "unreadChannels",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;II)V",
        "getType",
        "()Ljava/lang/String;",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getRawCreatedAt",
        "getCid",
        "getChannelType",
        "getChannelId",
        "getChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "getTotalUnreadCount",
        "()I",
        "getUnreadChannels",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
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
.field private final channel:Lio/getstream/chat/android/models/Channel;

.field private final channelId:Ljava/lang/String;

.field private final channelType:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final createdAt:Ljava/util/Date;

.field private final rawCreatedAt:Ljava/lang/String;

.field private final totalUnreadCount:I

.field private final type:Ljava/lang/String;

.field private final unreadChannels:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;II)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawCreatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/events/ChatEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->type:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->createdAt:Ljava/util/Date;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->rawCreatedAt:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->cid:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelType:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelId:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channel:Lio/getstream/chat/android/models/Channel;

    .line 9
    iput p8, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->totalUnreadCount:I

    .line 10
    iput p9, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->unreadChannels:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p10, 0x80

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move p8, v0

    :cond_0
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_1

    move p10, v0

    :goto_0
    move p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move p10, p9

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p10}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;II)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;IIILjava/lang/Object;)Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->createdAt:Ljava/util/Date;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->rawCreatedAt:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->cid:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelType:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelId:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channel:Lio/getstream/chat/android/models/Channel;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget p8, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->totalUnreadCount:I

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->unreadChannels:I

    :cond_8
    move p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;II)Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->totalUnreadCount:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->unreadChannels:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;II)Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;
    .locals 11

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawCreatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;II)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->totalUnreadCount:I

    iget v3, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->totalUnreadCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->unreadChannels:I

    iget p1, p1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->unreadChannels:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getChannel()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getRawCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalUnreadCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->totalUnreadCount:I

    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnreadChannels()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->unreadChannels:I

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->totalUnreadCount:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->unreadChannels:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->createdAt:Ljava/util/Date;

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->cid:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelType:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channelId:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->channel:Lio/getstream/chat/android/models/Channel;

    iget v7, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->totalUnreadCount:I

    iget v8, p0, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->unreadChannels:I

    const-string v9, ", createdAt="

    const-string v10, ", rawCreatedAt="

    const-string v11, "NotificationChannelTruncatedEvent(type="

    invoke-static {v11, v0, v9, v1, v10}, Lc13/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cid="

    const-string v9, ", channelType="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", channelId="

    const-string v2, ", channel="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalUnreadCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", unreadChannels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
