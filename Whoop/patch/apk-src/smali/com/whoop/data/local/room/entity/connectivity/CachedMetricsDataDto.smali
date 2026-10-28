.class public final Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;",
        "",
        "packetRevision",
        "",
        "timestamp",
        "",
        "packetData",
        "Ljava/nio/ByteBuffer;",
        "versionId",
        "<init>",
        "(IJLjava/nio/ByteBuffer;I)V",
        "getPacketRevision",
        "()I",
        "getTimestamp",
        "()J",
        "getPacketData",
        "()Ljava/nio/ByteBuffer;",
        "getVersionId",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final packetData:Ljava/nio/ByteBuffer;

.field private final packetRevision:I

.field private final timestamp:J

.field private final versionId:I


# direct methods
.method public constructor <init>(IJLjava/nio/ByteBuffer;I)V
    .locals 1

    const-string v0, "packetData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetRevision:I

    iput-wide p2, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->timestamp:J

    iput-object p4, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetData:Ljava/nio/ByteBuffer;

    iput p5, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->versionId:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;IJLjava/nio/ByteBuffer;IILjava/lang/Object;)Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetRevision:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->timestamp:J

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p4, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetData:Ljava/nio/ByteBuffer;

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget p5, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->versionId:I

    :cond_3
    move-object p6, p4

    move p7, p5

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->copy(IJLjava/nio/ByteBuffer;I)Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetRevision:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->timestamp:J

    return-wide v0
.end method

.method public final component3()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetData:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->versionId:I

    return v0
.end method

.method public final copy(IJLjava/nio/ByteBuffer;I)Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;
    .locals 7

    const-string v0, "packetData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;

    move v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;-><init>(IJLjava/nio/ByteBuffer;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;

    iget v1, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetRevision:I

    iget v3, p1, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetRevision:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->timestamp:J

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetData:Ljava/nio/ByteBuffer;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetData:Ljava/nio/ByteBuffer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->versionId:I

    iget p1, p1, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->versionId:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getPacketData()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetData:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final getPacketRevision()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetRevision:I

    return v0
.end method

.method public final getTimestamp()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->timestamp:J

    return-wide v0
.end method

.method public final getVersionId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->versionId:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetRevision:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->timestamp:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetData:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->versionId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetRevision:I

    iget-wide v1, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->timestamp:J

    iget-object v3, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->packetData:Ljava/nio/ByteBuffer;

    iget v4, p0, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;->versionId:I

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CachedMetricsDataDto(packetRevision="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", packetData="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", versionId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
