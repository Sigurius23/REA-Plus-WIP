.class public final Lcom/mapbox/maps/renderer/RenderThreadStats;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/mapbox/maps/MapboxExperimental;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/renderer/RenderThreadStats$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001!BU\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u001d\u001a\u00020\u001eH\u0016J\u0008\u0010\u001f\u001a\u00020 H\u0016R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0014\u0010\u0011R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0017\u00a8\u0006\""
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/RenderThreadStats;",
        "",
        "totalTime",
        "",
        "totalFrames",
        "totalDroppedFrames",
        "frameTimeList",
        "",
        "",
        "percentile50",
        "percentile90",
        "percentile95",
        "percentile99",
        "(JJJLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V",
        "getFrameTimeList",
        "()Ljava/util/List;",
        "getPercentile50",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getPercentile90",
        "getPercentile95",
        "getPercentile99",
        "getTotalDroppedFrames",
        "()J",
        "getTotalFrames",
        "getTotalTime",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Builder",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final frameTimeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private final percentile50:Ljava/lang/Double;

.field private final percentile90:Ljava/lang/Double;

.field private final percentile95:Ljava/lang/Double;

.field private final percentile99:Ljava/lang/Double;

.field private final totalDroppedFrames:J

.field private final totalFrames:J

.field private final totalTime:J


# direct methods
.method private constructor <init>(JJJLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalTime:J

    .line 4
    iput-wide p3, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalFrames:J

    .line 5
    iput-wide p5, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalDroppedFrames:J

    .line 6
    iput-object p7, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->frameTimeList:Ljava/util/List;

    .line 7
    iput-object p8, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile50:Ljava/lang/Double;

    .line 8
    iput-object p9, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile90:Ljava/lang/Double;

    .line 9
    iput-object p10, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile95:Ljava/lang/Double;

    .line 10
    iput-object p11, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile99:Ljava/lang/Double;

    return-void
.end method

.method public synthetic constructor <init>(JJJLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lcom/mapbox/maps/renderer/RenderThreadStats;-><init>(JJJLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lcom/mapbox/maps/renderer/RenderThreadStats;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.mapbox.maps.renderer.RenderThreadStats"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/mapbox/maps/renderer/RenderThreadStats;

    iget-wide v3, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalTime:J

    iget-wide v5, p1, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalFrames:J

    iget-wide v5, p1, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalFrames:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalDroppedFrames:J

    iget-wide v5, p1, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalDroppedFrames:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile50:Ljava/lang/Double;

    iget-object v3, p1, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile50:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Double;Ljava/lang/Double;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile90:Ljava/lang/Double;

    iget-object v3, p1, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile90:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Double;Ljava/lang/Double;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile95:Ljava/lang/Double;

    iget-object v3, p1, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile95:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Double;Ljava/lang/Double;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile99:Ljava/lang/Double;

    iget-object v3, p1, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile99:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Double;Ljava/lang/Double;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->frameTimeList:Ljava/util/List;

    iget-object p1, p1, Lcom/mapbox/maps/renderer/RenderThreadStats;->frameTimeList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getFrameTimeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->frameTimeList:Ljava/util/List;

    return-object v0
.end method

.method public final getPercentile50()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile50:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPercentile90()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile90:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPercentile95()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile95:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPercentile99()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile99:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTotalDroppedFrames()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalDroppedFrames:J

    return-wide v0
.end method

.method public final getTotalFrames()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalFrames:J

    return-wide v0
.end method

.method public final getTotalTime()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 9

    iget-wide v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalFrames:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v0, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalDroppedFrames:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iget-object v5, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile50:Ljava/lang/Double;

    iget-object v6, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile90:Ljava/lang/Double;

    iget-object v7, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile95:Ljava/lang/Double;

    iget-object v8, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile99:Ljava/lang/Double;

    filled-new-array/range {v2 .. v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RenderThreadStats(totalTime="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalFrames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalFrames:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalDroppedFrames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->totalDroppedFrames:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", frameTimeList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->frameTimeList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", percentile50="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile50:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", percentile90="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile90:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", percentile95="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile95:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", percentile99="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderThreadStats;->percentile99:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
