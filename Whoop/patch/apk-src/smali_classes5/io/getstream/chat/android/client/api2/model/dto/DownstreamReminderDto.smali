.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001BE\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003JU\u0010!\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0010R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0010\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;",
        "",
        "remind_at",
        "Ljava/util/Date;",
        "channel_cid",
        "",
        "channel",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "message_id",
        "message",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "created_at",
        "updated_at",
        "<init>",
        "(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/util/Date;Ljava/util/Date;)V",
        "getRemind_at",
        "()Ljava/util/Date;",
        "getChannel_cid",
        "()Ljava/lang/String;",
        "getChannel",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "getMessage_id",
        "getMessage",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "getCreated_at",
        "getUpdated_at",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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

.field private final channel_cid:Ljava/lang/String;

.field private final created_at:Ljava/util/Date;

.field private final message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

.field private final message_id:Ljava/lang/String;

.field private final remind_at:Ljava/util/Date;

.field private final updated_at:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/util/Date;Ljava/util/Date;)V
    .locals 1

    const-string v0, "channel_cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message_id"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updated_at"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->remind_at:Ljava/util/Date;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel_cid:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message_id:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->created_at:Ljava/util/Date;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->updated_at:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->remind_at:Ljava/util/Date;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel_cid:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message_id:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->created_at:Ljava/util/Date;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->updated_at:Ljava/util/Date;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->copy(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->remind_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel_cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final component6()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;
    .locals 9

    const-string v0, "channel_cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message_id"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updated_at"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;-><init>(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/util/Date;Ljava/util/Date;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->remind_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->remind_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel_cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel_cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->created_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->updated_at:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getChannel()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final getChannel_cid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel_cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getMessage()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final getMessage_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getRemind_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->remind_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getUpdated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->remind_at:Ljava/util/Date;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel_cid:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message_id:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v0, v2}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->updated_at:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->remind_at:Ljava/util/Date;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel_cid:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message_id:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->created_at:Ljava/util/Date;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderDto;->updated_at:Ljava/util/Date;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "DownstreamReminderDto(remind_at="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channel_cid="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", channel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", message_id="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", message="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", created_at="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updated_at="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lev/n;->k(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
