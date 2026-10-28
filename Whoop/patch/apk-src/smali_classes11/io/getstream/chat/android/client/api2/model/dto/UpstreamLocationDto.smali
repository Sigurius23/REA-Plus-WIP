.class public final Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J3\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;",
        "",
        "latitude",
        "",
        "longitude",
        "created_by_device_id",
        "",
        "end_at",
        "Ljava/util/Date;",
        "<init>",
        "(DDLjava/lang/String;Ljava/util/Date;)V",
        "getLatitude",
        "()D",
        "getLongitude",
        "getCreated_by_device_id",
        "()Ljava/lang/String;",
        "getEnd_at",
        "()Ljava/util/Date;",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private final created_by_device_id:Ljava/lang/String;

.field private final end_at:Ljava/util/Date;

.field private final latitude:D

.field private final longitude:D


# direct methods
.method public constructor <init>(DDLjava/lang/String;Ljava/util/Date;)V
    .locals 1

    const-string v0, "created_by_device_id"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->latitude:D

    iput-wide p3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->longitude:D

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->end_at:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;DDLjava/lang/String;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->latitude:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->longitude:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    :cond_2
    move-object v5, p5

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->end_at:Ljava/util/Date;

    :cond_3
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->copy(DDLjava/lang/String;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->latitude:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->longitude:D

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->end_at:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(DDLjava/lang/String;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;
    .locals 8

    const-string v0, "created_by_device_id"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;-><init>(DDLjava/lang/String;Ljava/util/Date;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;

    iget-wide v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->latitude:D

    iget-wide v5, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->latitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->longitude:D

    iget-wide v5, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->longitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->end_at:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->end_at:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCreated_by_device_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnd_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->end_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->latitude:D

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->longitude:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->longitude:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->end_at:Ljava/util/Date;

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
    .locals 8

    iget-wide v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->latitude:D

    iget-wide v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->longitude:D

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->created_by_device_id:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamLocationDto;->end_at:Ljava/util/Date;

    const-string v6, "UpstreamLocationDto(latitude="

    const-string v7, ", longitude="

    invoke-static {v6, v0, v1, v7}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", created_by_device_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", end_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
