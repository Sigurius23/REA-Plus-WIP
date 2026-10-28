.class public final Lcom/whoop/analytics/strain/model/SmoothingResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/SmoothingResultIF;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;,
        Lcom/whoop/analytics/strain/model/SmoothingResult$Json;
    }
.end annotation

.annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
.end annotation


# instance fields
.field private final lastUsedIndex:I

.field private final lastUsedTime:J

.field private final smoothedHrs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;IJ)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->smoothedHrs:Ljava/util/List;

    .line 4
    iput p2, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    .line 5
    iput-wide p3, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;IJLcom/whoop/analytics/strain/model/SmoothingResult$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/analytics/strain/model/SmoothingResult;-><init>(Ljava/util/List;IJ)V

    return-void
.end method

.method public static synthetic access$100(ZLjava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->createUnmodifiableList(ZLjava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static builder()Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;
    .locals 2

    new-instance v0, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;-><init>(Lcom/whoop/analytics/strain/model/SmoothingResult$1;)V

    return-object v0
.end method

.method public static copyOf(Lcom/whoop/analytics/strain/model/SmoothingResultIF;)Lcom/whoop/analytics/strain/model/SmoothingResult;
    .locals 1

    instance-of v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/analytics/strain/model/SmoothingResult;

    return-object p0

    :cond_0
    invoke-static {}, Lcom/whoop/analytics/strain/model/SmoothingResult;->builder()Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->from(Lcom/whoop/analytics/strain/model/SmoothingResultIF;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->build()Lcom/whoop/analytics/strain/model/SmoothingResult;

    move-result-object p0

    return-object p0
.end method

.method private static createSafeList(Ljava/lang/Iterable;ZZ)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TT;>;ZZ)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz p2, :cond_2

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    const-string v2, "element"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method private static createUnmodifiableList(ZLjava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(Z",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    if-eqz p0, :cond_0

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of p0, p1, Ljava/util/ArrayList;

    if-eqz p0, :cond_1

    move-object p0, p1

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->trimToSize()V

    :cond_1
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0
.end method

.method private equalTo(Lcom/whoop/analytics/strain/model/SmoothingResult;)Z
    .locals 4

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->smoothedHrs:Ljava/util/List;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/SmoothingResult;->smoothedHrs:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    iget v1, p1, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    iget-wide v2, p1, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static fromJson(Lcom/whoop/analytics/strain/model/SmoothingResult$Json;)Lcom/whoop/analytics/strain/model/SmoothingResult;
    .locals 3
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
        mode = .enum Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DELEGATING:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/whoop/analytics/strain/model/SmoothingResult;->builder()Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->smoothedHrs:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->addAllSmoothedHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->lastUsedIndexIsSet:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->lastUsedIndex:I

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->setLastUsedIndex(I)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    :cond_1
    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->lastUsedTimeIsSet:Z

    if-eqz v1, :cond_2

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->lastUsedTime:J

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->setLastUsedTime(J)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->build()Lcom/whoop/analytics/strain/model/SmoothingResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/analytics/strain/model/SmoothingResult;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/whoop/analytics/strain/model/SmoothingResult;

    invoke-direct {p0, p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->equalTo(Lcom/whoop/analytics/strain/model/SmoothingResult;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getLastUsedIndex()I
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    return v0
.end method

.method public getLastUsedTime()J
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    return-wide v0
.end method

.method public getSmoothedHrs()Ljava/util/List;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->smoothedHrs:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->smoothedHrs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    const v1, 0x2b5a5

    add-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    iget v2, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    shl-int/lit8 v0, v1, 0x5

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SmoothingResult{smoothedHrs="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->smoothedHrs:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastUsedIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lastUsedTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    const-string v3, "}"

    invoke-static {v1, v2, v3, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withLastUsedIndex(I)Lcom/whoop/analytics/strain/model/SmoothingResult;
    .locals 4

    iget v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/SmoothingResult;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->smoothedHrs:Ljava/util/List;

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/whoop/analytics/strain/model/SmoothingResult;-><init>(Ljava/util/List;IJ)V

    return-object v0
.end method

.method public final withLastUsedTime(J)Lcom/whoop/analytics/strain/model/SmoothingResult;
    .locals 3

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/SmoothingResult;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->smoothedHrs:Ljava/util/List;

    iget v2, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/whoop/analytics/strain/model/SmoothingResult;-><init>(Ljava/util/List;IJ)V

    return-object v0
.end method

.method public final withSmoothedHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/SmoothingResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/SmoothingResult;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->smoothedHrs:Ljava/util/List;

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->createSafeList(Ljava/lang/Iterable;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->createUnmodifiableList(ZLjava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 5
    new-instance v0, Lcom/whoop/analytics/strain/model/SmoothingResult;

    iget v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/whoop/analytics/strain/model/SmoothingResult;-><init>(Ljava/util/List;IJ)V

    return-object v0
.end method

.method public final varargs withSmoothedHrs([Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Lcom/whoop/analytics/strain/model/SmoothingResult;
    .locals 4

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->createSafeList(Ljava/lang/Iterable;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->createUnmodifiableList(ZLjava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/whoop/analytics/strain/model/SmoothingResult;

    iget v1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedIndex:I

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/SmoothingResult;->lastUsedTime:J

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/whoop/analytics/strain/model/SmoothingResult;-><init>(Ljava/util/List;IJ)V

    return-object v0
.end method
