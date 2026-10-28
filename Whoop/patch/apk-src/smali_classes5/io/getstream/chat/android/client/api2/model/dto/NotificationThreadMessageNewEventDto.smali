.class public final Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;
.super Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0008H\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\t\u0010&\u001a\u00020\u000cH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000eH\u00c6\u0003J\t\u0010(\u001a\u00020\u000eH\u00c6\u0003Jc\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\u000eH\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
        "type",
        "",
        "cid",
        "channel_id",
        "channel_type",
        "message",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "channel",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "created_at",
        "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "unread_threads",
        "",
        "unread_thread_messages",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)V",
        "getType",
        "()Ljava/lang/String;",
        "getCid",
        "getChannel_id",
        "getChannel_type",
        "getMessage",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "getChannel",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "getCreated_at",
        "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "getUnread_threads",
        "()I",
        "getUnread_thread_messages",
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

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# instance fields
.field private final channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

.field private final channel_id:Ljava/lang/String;

.field private final channel_type:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

.field private final message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

.field private final type:Ljava/lang/String;

.field private final unread_thread_messages:I

.field private final unread_threads:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->type:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->cid:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_id:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_type:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iput p8, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_threads:I

    iput p9, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_thread_messages:I

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->cid:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_id:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_type:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget p8, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_threads:I

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_thread_messages:I

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

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_type:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_threads:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_thread_messages:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;
    .locals 11

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_threads:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_threads:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_thread_messages:I

    iget p1, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_thread_messages:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getChannel()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final getChannel_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannel_type()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_type:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreated_at()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final getMessage()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnread_thread_messages()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_thread_messages:I

    return v0
.end method

.method public final getUnread_threads()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_threads:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v2, v0, v1}, Lc13/a;->d(Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_threads:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_thread_messages:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->cid:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_id:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel_type:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget v7, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_threads:I

    iget v8, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationThreadMessageNewEventDto;->unread_thread_messages:I

    const-string v9, ", cid="

    const-string v10, ", channel_id="

    const-string v11, "NotificationThreadMessageNewEventDto(type="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", channel_type="

    const-string v9, ", message="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", created_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unread_threads="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", unread_thread_messages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
