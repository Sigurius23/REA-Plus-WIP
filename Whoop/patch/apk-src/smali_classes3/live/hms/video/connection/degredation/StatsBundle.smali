.class public final Llive/hms/video/connection/degredation/StatsBundle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003JI\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/StatsBundle;",
        "",
        "packetLoss",
        "",
        "allStats",
        "",
        "",
        "Llive/hms/video/connection/degredation/WebrtcStats;",
        "totalPackets",
        "packetLossTracks",
        "",
        "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
        "<init>",
        "(JLjava/util/Map;JLjava/util/Map;)V",
        "getPacketLoss",
        "()J",
        "getAllStats",
        "()Ljava/util/Map;",
        "getTotalPackets",
        "getPacketLossTracks",
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
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final allStats:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/connection/degredation/WebrtcStats;",
            ">;"
        }
    .end annotation
.end field

.field private final packetLoss:J

.field private final packetLossTracks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
            ">;"
        }
    .end annotation
.end field

.field private final totalPackets:J


# direct methods
.method public constructor <init>(JLjava/util/Map;JLjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Llive/hms/video/connection/degredation/WebrtcStats;",
            ">;J",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
            ">;)V"
        }
    .end annotation

    const-string v0, "allStats"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packetLossTracks"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLoss:J

    iput-object p3, p0, Llive/hms/video/connection/degredation/StatsBundle;->allStats:Ljava/util/Map;

    iput-wide p4, p0, Llive/hms/video/connection/degredation/StatsBundle;->totalPackets:J

    iput-object p6, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLossTracks:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/degredation/StatsBundle;JLjava/util/Map;JLjava/util/Map;ILjava/lang/Object;)Llive/hms/video/connection/degredation/StatsBundle;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLoss:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Llive/hms/video/connection/degredation/StatsBundle;->allStats:Ljava/util/Map;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-wide p4, p0, Llive/hms/video/connection/degredation/StatsBundle;->totalPackets:J

    :cond_2
    move-wide v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p6, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLossTracks:Ljava/util/Map;

    :cond_3
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Llive/hms/video/connection/degredation/StatsBundle;->copy(JLjava/util/Map;JLjava/util/Map;)Llive/hms/video/connection/degredation/StatsBundle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLoss:J

    return-wide v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/connection/degredation/WebrtcStats;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/degredation/StatsBundle;->allStats:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/degredation/StatsBundle;->totalPackets:J

    return-wide v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLossTracks:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(JLjava/util/Map;JLjava/util/Map;)Llive/hms/video/connection/degredation/StatsBundle;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Llive/hms/video/connection/degredation/WebrtcStats;",
            ">;J",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
            ">;)",
            "Llive/hms/video/connection/degredation/StatsBundle;"
        }
    .end annotation

    const-string v0, "allStats"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packetLossTracks"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/connection/degredation/StatsBundle;

    move-wide v2, p1

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Llive/hms/video/connection/degredation/StatsBundle;-><init>(JLjava/util/Map;JLjava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/degredation/StatsBundle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/degredation/StatsBundle;

    iget-wide v3, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLoss:J

    iget-wide v5, p1, Llive/hms/video/connection/degredation/StatsBundle;->packetLoss:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/connection/degredation/StatsBundle;->allStats:Ljava/util/Map;

    iget-object v3, p1, Llive/hms/video/connection/degredation/StatsBundle;->allStats:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/connection/degredation/StatsBundle;->totalPackets:J

    iget-wide v5, p1, Llive/hms/video/connection/degredation/StatsBundle;->totalPackets:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLossTracks:Ljava/util/Map;

    iget-object p1, p1, Llive/hms/video/connection/degredation/StatsBundle;->packetLossTracks:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAllStats()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/connection/degredation/WebrtcStats;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/degredation/StatsBundle;->allStats:Ljava/util/Map;

    return-object v0
.end method

.method public final getPacketLoss()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLoss:J

    return-wide v0
.end method

.method public final getPacketLossTracks()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLossTracks:Ljava/util/Map;

    return-object v0
.end method

.method public final getTotalPackets()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/degredation/StatsBundle;->totalPackets:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLoss:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/connection/degredation/StatsBundle;->allStats:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/connection/degredation/StatsBundle;->totalPackets:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLossTracks:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StatsBundle(packetLoss="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLoss:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", allStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/StatsBundle;->allStats:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalPackets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/connection/degredation/StatsBundle;->totalPackets:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetLossTracks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/degredation/StatsBundle;->packetLossTracks:Ljava/util/Map;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lr;->m(Ljava/lang/StringBuilder;Ljava/util/Map;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
