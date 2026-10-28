.class public final Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/SmoothingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# static fields
.field private static final INIT_BIT_LAST_USED_INDEX:J = 0x1L

.field private static final INIT_BIT_LAST_USED_TIME:J = 0x2L


# instance fields
.field private initBits:J

.field private lastUsedIndex:I

.field private lastUsedTime:J

.field private smoothedHrs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x3

    .line 3
    iput-wide v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->initBits:J

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->smoothedHrs:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/analytics/strain/model/SmoothingResult$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;-><init>()V

    return-void
.end method

.method private checkRequiredAttributes()V
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->initBits:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/hubspot/immutables/validation/InvalidImmutableStateException;

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->formatRequiredAttributesMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private formatRequiredAttributesMessage()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->lastUsedIndexIsSet()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "lastUsedIndex"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->lastUsedTimeIsSet()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "lastUsedTime"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot build SmoothingResult, some of required attributes are not set "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private lastUsedIndexIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->initBits:J

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

.method private lastUsedTimeIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->initBits:J

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


# virtual methods
.method public final addAllSmoothedHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->smoothedHrs:Ljava/util/List;

    const-string v2, "smoothedHrs element"

    invoke-static {v0, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final addSmoothedHrs(Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->smoothedHrs:Ljava/util/List;

    const-string v1, "smoothedHrs element"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final varargs addSmoothedHrs([Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;
    .locals 5

    .line 2
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 3
    iget-object v3, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->smoothedHrs:Ljava/util/List;

    const-string v4, "smoothedHrs element"

    invoke-static {v2, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public build()Lcom/whoop/analytics/strain/model/SmoothingResult;
    .locals 6

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->checkRequiredAttributes()V

    new-instance v0, Lcom/whoop/analytics/strain/model/SmoothingResult;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->smoothedHrs:Ljava/util/List;

    invoke-static {v1, v2}, Lcom/whoop/analytics/strain/model/SmoothingResult;->access$100(ZLjava/util/List;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->lastUsedIndex:I

    iget-wide v3, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->lastUsedTime:J

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/analytics/strain/model/SmoothingResult;-><init>(Ljava/util/List;IJLcom/whoop/analytics/strain/model/SmoothingResult$1;)V

    return-object v0
.end method

.method public final from(Lcom/whoop/analytics/strain/model/SmoothingResultIF;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;
    .locals 2

    const-string v0, "instance"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/SmoothingResultIF;->getSmoothedHrs()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->addAllSmoothedHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/SmoothingResultIF;->getLastUsedIndex()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->setLastUsedIndex(I)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/SmoothingResultIF;->getLastUsedTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->setLastUsedTime(J)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    return-object p0
.end method

.method public final setLastUsedIndex(I)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;
    .locals 4

    iput p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->lastUsedIndex:I

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->initBits:J

    const-wide/16 v2, -0x2

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->initBits:J

    return-object p0
.end method

.method public final setLastUsedTime(J)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;
    .locals 2

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->lastUsedTime:J

    iget-wide p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->initBits:J

    const-wide/16 v0, -0x3

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->initBits:J

    return-object p0
.end method

.method public final setSmoothedHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->smoothedHrs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0, p1}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->addAllSmoothedHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    move-result-object p1

    return-object p1
.end method
