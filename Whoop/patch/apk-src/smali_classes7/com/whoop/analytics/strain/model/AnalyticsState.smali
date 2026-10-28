.class public final Lcom/whoop/analytics/strain/model/AnalyticsState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/AnalyticsStateIF;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;,
        Lcom/whoop/analytics/strain/model/AnalyticsState$Json;
    }
.end annotation

.annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
.end annotation


# instance fields
.field private final lastUsed:Ljava/lang/Long;

.field private final leftOverAccelX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final leftOverHrc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final leftOvers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field private final modHrs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    .line 4
    iput-object p2, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/analytics/strain/model/AnalyticsState$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic access$100(ZLjava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->createUnmodifiableList(ZLjava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static builder()Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 2

    new-instance v0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;-><init>(Lcom/whoop/analytics/strain/model/AnalyticsState$1;)V

    return-object v0
.end method

.method public static copyOf(Lcom/whoop/analytics/strain/model/AnalyticsStateIF;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 1

    instance-of v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/analytics/strain/model/AnalyticsState;

    return-object p0

    :cond_0
    invoke-static {}, Lcom/whoop/analytics/strain/model/AnalyticsState;->builder()Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->from(Lcom/whoop/analytics/strain/model/AnalyticsStateIF;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->build()Lcom/whoop/analytics/strain/model/AnalyticsState;

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

.method private equalTo(Lcom/whoop/analytics/strain/model/AnalyticsState;)Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static fromJson(Lcom/whoop/analytics/strain/model/AnalyticsState$Json;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
        mode = .enum Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DELEGATING:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/whoop/analytics/strain/model/AnalyticsState;->builder()Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Json;->lastUsed:Ljava/util/Optional;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLastUsed(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    :cond_0
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Json;->leftOvers:Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->addAllLeftOvers(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    :cond_1
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Json;->modHrs:Ljava/util/List;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->addAllModHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    :cond_2
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Json;->leftOverHrc:Ljava/util/Optional;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLeftOverHrc(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    :cond_3
    iget-object p0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Json;->leftOverAccelX:Ljava/util/Optional;

    if-eqz p0, :cond_4

    invoke-virtual {v0, p0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLeftOverAccelX(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->build()Lcom/whoop/analytics/strain/model/AnalyticsState;

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
    instance-of v1, p1, Lcom/whoop/analytics/strain/model/AnalyticsState;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-direct {p0, p1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->equalTo(Lcom/whoop/analytics/strain/model/AnalyticsState;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getLastUsed()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lastUsed"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getLeftOverAccelX()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "leftOverAccelX"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getLeftOverHrc()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "leftOverHrc"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getLeftOvers()Ljava/util/List;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "leftOvers"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    return-object v0
.end method

.method public getModHrs()Ljava/util/List;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "modHrs"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x2b5a5

    add-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    shl-int/lit8 v0, v2, 0x5

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    shl-int/lit8 v0, v1, 0x5

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    shl-int/lit8 v0, v2, 0x5

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnalyticsState{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    if-eqz v1, :cond_0

    const-string v1, "lastUsed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/16 v2, 0xf

    const-string v3, ", "

    if-le v1, v2, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, "leftOvers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "modHrs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "leftOverHrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "leftOverAccelX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withLastUsed(Ljava/lang/Long;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public final withLastUsed(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Long;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    invoke-static {p1, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-direct/range {v0 .. v5}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public final withLeftOverAccelX(Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    if-ne v0, p1, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public final withLeftOverAccelX(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/util/List;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    if-ne p1, v5, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    invoke-direct/range {v0 .. v5}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public final withLeftOverHrc(Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    if-ne v0, p1, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public final withLeftOverHrc(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/util/List;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    if-ne p1, v4, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-direct/range {v0 .. v5}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public final withLeftOvers(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->createSafeList(Ljava/lang/Iterable;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->createUnmodifiableList(ZLjava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 5
    new-instance v2, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-direct/range {v2 .. v7}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public final varargs withLeftOvers([Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->createSafeList(Ljava/lang/Iterable;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->createUnmodifiableList(ZLjava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 2
    new-instance v2, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-direct/range {v2 .. v7}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public final withModHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->modHrs:Ljava/util/List;

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->createSafeList(Ljava/lang/Iterable;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->createUnmodifiableList(ZLjava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 5
    new-instance v2, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-direct/range {v2 .. v7}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public final varargs withModHrs([Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->createSafeList(Ljava/lang/Iterable;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->createUnmodifiableList(ZLjava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 2
    new-instance v2, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->lastUsed:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOvers:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverHrc:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/AnalyticsState;->leftOverAccelX:Ljava/util/List;

    invoke-direct/range {v2 .. v7}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method
