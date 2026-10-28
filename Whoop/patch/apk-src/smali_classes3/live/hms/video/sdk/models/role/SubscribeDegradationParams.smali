.class public final Llive/hms/video/sdk/models/role/SubscribeDegradationParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u000c\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\r2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Llive/hms/video/sdk/models/role/SubscribeDegradationParams;",
        "",
        "packetLossThreshold",
        "",
        "degradeGracePeriodSeconds",
        "recoverGracePeriodSeconds",
        "<init>",
        "(JJJ)V",
        "getPacketLossThreshold",
        "()J",
        "getDegradeGracePeriodSeconds",
        "getRecoverGracePeriodSeconds",
        "isValid",
        "",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
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
.field private final degradeGracePeriodSeconds:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "degradeGracePeriodSeconds"
    .end annotation
.end field

.field private final packetLossThreshold:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "packetLossThreshold"
    .end annotation
.end field

.field private final recoverGracePeriodSeconds:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recoverGracePeriodSeconds"
    .end annotation
.end field


# direct methods
.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->packetLossThreshold:J

    iput-wide p3, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->degradeGracePeriodSeconds:J

    iput-wide p5, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->recoverGracePeriodSeconds:J

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/role/SubscribeDegradationParams;JJJILjava/lang/Object;)Llive/hms/video/sdk/models/role/SubscribeDegradationParams;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->packetLossThreshold:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->degradeGracePeriodSeconds:J

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-wide p5, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->recoverGracePeriodSeconds:J

    :cond_2
    move-object v0, p0

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->copy(JJJ)Llive/hms/video/sdk/models/role/SubscribeDegradationParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->packetLossThreshold:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->degradeGracePeriodSeconds:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->recoverGracePeriodSeconds:J

    return-wide v0
.end method

.method public final copy(JJJ)Llive/hms/video/sdk/models/role/SubscribeDegradationParams;
    .locals 7

    new-instance v0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;-><init>(JJJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;

    iget-wide v3, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->packetLossThreshold:J

    iget-wide v5, p1, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->packetLossThreshold:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->degradeGracePeriodSeconds:J

    iget-wide v5, p1, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->degradeGracePeriodSeconds:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->recoverGracePeriodSeconds:J

    iget-wide v5, p1, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->recoverGracePeriodSeconds:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDegradeGracePeriodSeconds()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->degradeGracePeriodSeconds:J

    return-wide v0
.end method

.method public final getPacketLossThreshold()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->packetLossThreshold:J

    return-wide v0
.end method

.method public final getRecoverGracePeriodSeconds()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->recoverGracePeriodSeconds:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->packetLossThreshold:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->degradeGracePeriodSeconds:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->recoverGracePeriodSeconds:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isValid()Z
    .locals 4

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->packetLossThreshold:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->degradeGracePeriodSeconds:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->recoverGracePeriodSeconds:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SubscribeDegradationParams(packetLossThreshold="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->packetLossThreshold:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", degradeGracePeriodSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->degradeGracePeriodSeconds:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", recoverGracePeriodSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sdk/models/role/SubscribeDegradationParams;->recoverGracePeriodSeconds:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
