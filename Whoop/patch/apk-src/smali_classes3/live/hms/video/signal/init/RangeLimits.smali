.class public final Llive/hms/video/signal/init/RangeLimits;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0014"
    }
    d2 = {
        "Llive/hms/video/signal/init/RangeLimits;",
        "",
        "low",
        "",
        "high",
        "<init>",
        "(JJ)V",
        "getLow",
        "()J",
        "getHigh",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final high:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "high"
    .end annotation
.end field

.field private final low:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "low"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/signal/init/RangeLimits;->low:J

    iput-wide p3, p0, Llive/hms/video/signal/init/RangeLimits;->high:J

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/init/RangeLimits;JJILjava/lang/Object;)Llive/hms/video/signal/init/RangeLimits;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Llive/hms/video/signal/init/RangeLimits;->low:J

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    iget-wide p3, p0, Llive/hms/video/signal/init/RangeLimits;->high:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/signal/init/RangeLimits;->copy(JJ)Llive/hms/video/signal/init/RangeLimits;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/signal/init/RangeLimits;->low:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/signal/init/RangeLimits;->high:J

    return-wide v0
.end method

.method public final copy(JJ)Llive/hms/video/signal/init/RangeLimits;
    .locals 1

    new-instance v0, Llive/hms/video/signal/init/RangeLimits;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/signal/init/RangeLimits;-><init>(JJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/init/RangeLimits;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/init/RangeLimits;

    iget-wide v3, p0, Llive/hms/video/signal/init/RangeLimits;->low:J

    iget-wide v5, p1, Llive/hms/video/signal/init/RangeLimits;->low:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llive/hms/video/signal/init/RangeLimits;->high:J

    iget-wide v5, p1, Llive/hms/video/signal/init/RangeLimits;->high:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHigh()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/signal/init/RangeLimits;->high:J

    return-wide v0
.end method

.method public final getLow()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/signal/init/RangeLimits;->low:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Llive/hms/video/signal/init/RangeLimits;->low:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Llive/hms/video/signal/init/RangeLimits;->high:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RangeLimits(low="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/signal/init/RangeLimits;->low:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", high="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/signal/init/RangeLimits;->high:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
