.class public final Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/HeartRateTimestamp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# static fields
.field private static final INIT_BIT_HEART_RATE:J = 0x2L

.field private static final INIT_BIT_TIME:J = 0x1L


# instance fields
.field private heartRate:D

.field private initBits:J

.field private time:J


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x3

    .line 3
    iput-wide v0, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->initBits:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/analytics/strain/model/HeartRateTimestamp$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;-><init>()V

    return-void
.end method

.method private checkRequiredAttributes()V
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->initBits:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/hubspot/immutables/validation/InvalidImmutableStateException;

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->formatRequiredAttributesMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private formatRequiredAttributesMessage()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->timeIsSet()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "time"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->heartRateIsSet()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "heartRate"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot build HeartRateTimestamp, some of required attributes are not set "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private from(Ljava/lang/Object;)V
    .locals 2

    .line 5
    instance-of v0, p1, Lcom/whoop/analytics/strain/model/BaseHeartRateTimestamp;

    if-eqz v0, :cond_0

    .line 6
    check-cast p1, Lcom/whoop/analytics/strain/model/BaseHeartRateTimestamp;

    .line 7
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/BaseHeartRateTimestamp;->getHeartRate()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->setHeartRate(D)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    .line 8
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/BaseHeartRateTimestamp;->getTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->setTime(J)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    :cond_0
    return-void
.end method

.method private heartRateIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->initBits:J

    const-wide/16 v2, 0x2

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private timeIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->initBits:J

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public build()Lcom/whoop/analytics/strain/model/HeartRateTimestamp;
    .locals 6

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->checkRequiredAttributes()V

    new-instance v0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->time:J

    iget-wide v3, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->heartRate:D

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;-><init>(JDLcom/whoop/analytics/strain/model/HeartRateTimestamp$1;)V

    return-object v0
.end method

.method public final from(Lcom/whoop/analytics/strain/model/BaseHeartRateTimestamp;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;
    .locals 1

    .line 1
    const-string v0, "instance"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p1}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->from(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final from(Lcom/whoop/analytics/strain/model/HeartRateTimestampIF;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;
    .locals 1

    .line 3
    const-string v0, "instance"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    invoke-direct {p0, p1}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->from(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final setHeartRate(D)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;
    .locals 2

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->heartRate:D

    iget-wide p1, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->initBits:J

    const-wide/16 v0, -0x3

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->initBits:J

    return-object p0
.end method

.method public final setTime(J)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;
    .locals 2

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->time:J

    iget-wide p1, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->initBits:J

    const-wide/16 v0, -0x2

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->initBits:J

    return-object p0
.end method
