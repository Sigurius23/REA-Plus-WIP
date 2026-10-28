.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JQ\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
        "",
        "channel_cid",
        "",
        "message_id",
        "user_id",
        "latitude",
        "",
        "longitude",
        "created_by_device_id",
        "end_at",
        "Ljava/util/Date;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/util/Date;)V",
        "getChannel_cid",
        "()Ljava/lang/String;",
        "getMessage_id",
        "getUser_id",
        "getLatitude",
        "()D",
        "getLongitude",
        "getCreated_by_device_id",
        "getEnd_at",
        "()Ljava/util/Date;",
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
.field private final channel_cid:Ljava/lang/String;

.field private final created_by_device_id:Ljava/lang/String;

.field private final end_at:Ljava/util/Date;

.field private final latitude:D

.field private final longitude:D

.field private final message_id:Ljava/lang/String;

.field private final user_id:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/util/Date;)V
    .locals 1

    const-string v0, "channel_cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user_id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_by_device_id"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->channel_cid:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->message_id:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->user_id:Ljava/lang/String;

    iput-wide p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->latitude:D

    iput-wide p6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->longitude:D

    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    iput-object p9, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->end_at:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->channel_cid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->message_id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->user_id:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-wide p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->latitude:D

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-wide p6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->longitude:D

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p8, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_6

    iget-object p9, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->end_at:Ljava/util/Date;

    :cond_6
    move-object p10, p8

    move-object p11, p9

    move-wide p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->channel_cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->latitude:D

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->longitude:D

    return-wide v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->end_at:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;
    .locals 11

    const-string v0, "channel_cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user_id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_by_device_id"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-wide/from16 v7, p6

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/util/Date;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->channel_cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->channel_cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->message_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->message_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->user_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->user_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->latitude:D

    iget-wide v5, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->latitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->longitude:D

    iget-wide v5, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->longitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->end_at:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->end_at:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getChannel_cid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->channel_cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreated_by_device_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnd_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->end_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->latitude:D

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->longitude:D

    return-wide v0
.end method

.method public final getMessage_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->channel_cid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->message_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->user_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->latitude:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->longitude:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->end_at:Ljava/util/Date;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->channel_cid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->message_id:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->user_id:Ljava/lang/String;

    iget-wide v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->latitude:D

    iget-wide v5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->longitude:D

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;->end_at:Ljava/util/Date;

    const-string v9, ", message_id="

    const-string v10, ", user_id="

    const-string v11, "DownstreamLocationDto(channel_cid="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", longitude="

    const-string v2, ", created_by_device_id="

    invoke-static {v0, v1, v5, v6, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", end_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
