.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B5\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003JA\u0010\u0019\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;",
        "",
        "user",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "channel",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "created_at",
        "Ljava/util/Date;",
        "updated_at",
        "expires",
        "<init>",
        "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V",
        "getUser",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "getChannel",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "getCreated_at",
        "()Ljava/util/Date;",
        "getUpdated_at",
        "getExpires",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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

.field private final created_at:Ljava/util/Date;

.field private final expires:Ljava/util/Date;

.field private final updated_at:Ljava/util/Date;

.field private final user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V
    .locals 1

    const-string v0, "created_at"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updated_at"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->created_at:Ljava/util/Date;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->updated_at:Ljava/util/Date;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->expires:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->created_at:Ljava/util/Date;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->updated_at:Ljava/util/Date;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->expires:Ljava/util/Date;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->copy(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final component3()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->expires:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;
    .locals 7

    const-string v0, "created_at"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updated_at"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;-><init>(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->created_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->updated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->expires:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->expires:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getChannel()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final getCreated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getExpires()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->expires:Ljava/util/Date;

    return-object v0
.end method

.method public final getUpdated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->created_at:Ljava/util/Date;

    invoke-static {v3, v0, v2}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->updated_at:Ljava/util/Date;

    invoke-static {v3, v0, v2}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->expires:Ljava/util/Date;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->created_at:Ljava/util/Date;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->updated_at:Ljava/util/Date;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;->expires:Ljava/util/Date;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "DownstreamChannelMuteDto(user="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channel="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", created_at="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updated_at="

    const-string v1, ", expires="

    invoke-static {v5, v2, v0, v3, v1}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lev/n;->k(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
