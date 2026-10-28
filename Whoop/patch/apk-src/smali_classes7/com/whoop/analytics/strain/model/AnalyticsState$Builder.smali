.class public final Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/AnalyticsState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private lastUsed:Ljava/lang/Long;

.field private leftOverAccelX:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private leftOverHrc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private leftOvers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field private modHrs:Ljava/util/List;
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
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOvers:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->modHrs:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/analytics/strain/model/AnalyticsState$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public final addAllLeftOvers(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
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

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOvers:Ljava/util/List;

    const-string v2, "leftOvers element"

    invoke-static {v0, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final addAllModHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
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

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->modHrs:Ljava/util/List;

    const-string v2, "modHrs element"

    invoke-static {v0, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final addLeftOvers(Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOvers:Ljava/util/List;

    const-string v1, "leftOvers element"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final varargs addLeftOvers([Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 2
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 3
    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOvers:Ljava/util/List;

    const-string v4, "leftOvers element"

    invoke-static {v2, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final addModHrs(Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->modHrs:Ljava/util/List;

    const-string v1, "modHrs element"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final varargs addModHrs([Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 2
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 3
    iget-object v3, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->modHrs:Ljava/util/List;

    const-string v4, "modHrs element"

    invoke-static {v2, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public build()Lcom/whoop/analytics/strain/model/AnalyticsState;
    .locals 7

    new-instance v0, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->lastUsed:Ljava/lang/Long;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOvers:Ljava/util/List;

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lcom/whoop/analytics/strain/model/AnalyticsState;->access$100(ZLjava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->modHrs:Ljava/util/List;

    invoke-static {v3, v4}, Lcom/whoop/analytics/strain/model/AnalyticsState;->access$100(ZLjava/util/List;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOverHrc:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOverAccelX:Ljava/util/List;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/analytics/strain/model/AnalyticsState;-><init>(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/analytics/strain/model/AnalyticsState$1;)V

    return-object v0
.end method

.method public final from(Lcom/whoop/analytics/strain/model/AnalyticsStateIF;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 2

    const-string v0, "instance"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/AnalyticsStateIF;->getLastUsed()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLastUsed(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    :cond_0
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/AnalyticsStateIF;->getLeftOvers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->addAllLeftOvers(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/AnalyticsStateIF;->getModHrs()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->addAllModHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/AnalyticsStateIF;->getLeftOverHrc()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLeftOverHrc(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    :cond_1
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/AnalyticsStateIF;->getLeftOverAccelX()Ljava/util/Optional;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLeftOverAccelX(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    :cond_2
    return-object p0
.end method

.method public final setLastUsed(Ljava/lang/Long;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->lastUsed:Ljava/lang/Long;

    return-object p0
.end method

.method public final setLastUsed(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->lastUsed:Ljava/lang/Long;

    return-object p0
.end method

.method public final setLeftOverAccelX(Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOverAccelX:Ljava/util/List;

    return-object p0
.end method

.method public final setLeftOverAccelX(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOverAccelX:Ljava/util/List;

    return-object p0
.end method

.method public final setLeftOverHrc(Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOverHrc:Ljava/util/List;

    return-object p0
.end method

.method public final setLeftOverHrc(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOverHrc:Ljava/util/List;

    return-object p0
.end method

.method public final setLeftOvers(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->leftOvers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0, p1}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->addAllLeftOvers(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setModHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->modHrs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p0, p1}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->addAllModHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object p1

    return-object p1
.end method
