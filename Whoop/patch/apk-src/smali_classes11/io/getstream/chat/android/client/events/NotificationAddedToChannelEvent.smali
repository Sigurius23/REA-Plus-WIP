.class public final Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;
.super Lio/getstream/chat/android/client/events/CidEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/events/HasChannel;
.implements Lio/getstream/chat/android/client/events/HasMember;
.implements Lio/getstream/chat/android/client/events/HasUnreadCounts;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B[\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\u000eH\u00c6\u0003J\t\u0010,\u001a\u00020\u0010H\u00c6\u0003J\t\u0010-\u001a\u00020\u0012H\u00c6\u0003J\t\u0010.\u001a\u00020\u0012H\u00c6\u0003Jm\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u00c6\u0001J\u0013\u00100\u001a\u0002012\u0008\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u00020\u0012H\u00d6\u0001J\t\u00105\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0017R\u0014\u0010\n\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0017R\u0014\u0010\u000c\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0017R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#\u00a8\u00066"
    }
    d2 = {
        "Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;",
        "Lio/getstream/chat/android/client/events/CidEvent;",
        "Lio/getstream/chat/android/client/events/HasChannel;",
        "Lio/getstream/chat/android/client/events/HasMember;",
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
        "member",
        "Lio/getstream/chat/android/models/Member;",
        "totalUnreadCount",
        "",
        "unreadChannels",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;II)V",
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
        "getMember",
        "()Lio/getstream/chat/android/models/Member;",
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
        "component10",
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

.field private final member:Lio/getstream/chat/android/models/Member;

.field private final rawCreatedAt:Ljava/lang/String;

.field private final totalUnreadCount:I

.field private final type:Ljava/lang/String;

.field private final unreadChannels:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;II)V
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

    const-string v0, "member"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/events/ChatEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->type:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->createdAt:Ljava/util/Date;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->rawCreatedAt:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->cid:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelType:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelId:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channel:Lio/getstream/chat/android/models/Channel;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->member:Lio/getstream/chat/android/models/Member;

    .line 10
    iput p9, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->totalUnreadCount:I

    .line 11
    iput p10, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->unreadChannels:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p11, 0x100

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move p9, v0

    :cond_0
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_1

    move p11, v0

    :goto_0
    move p10, p9

    move-object p9, p8

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
    move p11, p10

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p11}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;II)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;IIILjava/lang/Object;)Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->createdAt:Ljava/util/Date;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->rawCreatedAt:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->cid:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelType:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelId:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channel:Lio/getstream/chat/android/models/Channel;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->member:Lio/getstream/chat/android/models/Member;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget p9, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->totalUnreadCount:I

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget p10, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->unreadChannels:I

    :cond_9
    move p11, p9

    move p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;II)Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->unreadChannels:I

    return v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final component8()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->member:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->totalUnreadCount:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;II)Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;
    .locals 12

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawCreatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "member"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Member;II)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->member:Lio/getstream/chat/android/models/Member;

    iget-object v3, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->member:Lio/getstream/chat/android/models/Member;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->totalUnreadCount:I

    iget v3, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->totalUnreadCount:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->unreadChannels:I

    iget p1, p1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->unreadChannels:I

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getChannel()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getMember()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->member:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final getRawCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->rawCreatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalUnreadCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->totalUnreadCount:I

    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnreadChannels()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->unreadChannels:I

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->rawCreatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->member:Lio/getstream/chat/android/models/Member;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Member;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->totalUnreadCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->unreadChannels:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->createdAt:Ljava/util/Date;

    iget-object v2, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->rawCreatedAt:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->cid:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelType:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channelId:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v7, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->member:Lio/getstream/chat/android/models/Member;

    iget v8, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->totalUnreadCount:I

    iget v9, p0, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->unreadChannels:I

    const-string v10, ", createdAt="

    const-string v11, ", rawCreatedAt="

    const-string v12, "NotificationAddedToChannelEvent(type="

    invoke-static {v12, v0, v10, v1, v11}, Lc13/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cid="

    const-string v10, ", channelType="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", channelId="

    const-string v2, ", channel="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", member="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalUnreadCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unreadChannels="

    const-string v2, ")"

    invoke-static {v0, v8, v1, v9, v2}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
