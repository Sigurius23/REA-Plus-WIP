.class public final Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;
.super Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000cH\u00c6\u0003JQ\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
        "type",
        "",
        "created_at",
        "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "cid",
        "channel_type",
        "channel_id",
        "channel",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "user",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)V",
        "getType",
        "()Ljava/lang/String;",
        "getCreated_at",
        "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "getCid",
        "getChannel_type",
        "getChannel_id",
        "getChannel",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "getUser",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
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
        "",
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

.field private final channel_id:Ljava/lang/String;

.field private final channel_type:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

.field private final type:Ljava/lang/String;

.field private final user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_id"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->type:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->cid:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_type:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_id:Ljava/lang/String;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->cid:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_type:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_id:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->copy(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_type:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;
    .locals 9

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_id"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getChannel()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final getChannel_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannel_type()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_type:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreated_at()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v2, v0, v1}, Lc13/a;->d(Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->cid:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_type:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel_id:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/dto/ChannelDeletedEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    const-string v7, ", created_at="

    const-string v8, ", cid="

    const-string v9, "ChannelDeletedEventDto(type="

    invoke-static {v9, v0, v7, v1, v8}, Ld13/a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", channel_type="

    const-string v7, ", channel_id="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
