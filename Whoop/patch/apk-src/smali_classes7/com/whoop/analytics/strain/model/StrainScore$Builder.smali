.class public final Lcom/whoop/analytics/strain/model/StrainScore$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/StrainScore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private avgHr:Ljava/lang/Double;

.field private kilojoules:Ljava/lang/Double;

.field private maxHr:Ljava/lang/Double;

.field private projectedStrainScore:Ljava/lang/Double;

.field private scaledScore:Ljava/lang/Double;

.field private state:Lcom/whoop/analytics/strain/model/AnalyticsState;

.field private strainScore:Ljava/lang/Double;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/analytics/strain/model/StrainScore$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 9

    new-instance v0, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->strainScore:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->scaledScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->kilojoules:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->avgHr:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->maxHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->projectedStrainScore:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;Lcom/whoop/analytics/strain/model/StrainScore$1;)V

    return-object v0
.end method

.method public final from(Lcom/whoop/analytics/strain/model/StrainScoreIF;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 2

    const-string v0, "instance"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StrainScoreIF;->getStrainScore()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setStrainScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_0
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StrainScoreIF;->getScaledScore()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setScaledScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_1
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StrainScoreIF;->getKilojoules()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setKilojoules(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_2
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StrainScoreIF;->getAvgHr()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setAvgHr(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_3
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StrainScoreIF;->getMaxHr()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setMaxHr(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_4
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StrainScoreIF;->getProjectedStrainScore()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setProjectedStrainScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_5
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StrainScoreIF;->getState()Ljava/util/Optional;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0, p1}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setState(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_6
    return-object p0
.end method

.method public final setAvgHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->avgHr:Ljava/lang/Double;

    return-object p0
.end method

.method public final setAvgHr(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->avgHr:Ljava/lang/Double;

    return-object p0
.end method

.method public final setKilojoules(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->kilojoules:Ljava/lang/Double;

    return-object p0
.end method

.method public final setKilojoules(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->kilojoules:Ljava/lang/Double;

    return-object p0
.end method

.method public final setMaxHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->maxHr:Ljava/lang/Double;

    return-object p0
.end method

.method public final setMaxHr(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->maxHr:Ljava/lang/Double;

    return-object p0
.end method

.method public final setProjectedStrainScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->projectedStrainScore:Ljava/lang/Double;

    return-object p0
.end method

.method public final setProjectedStrainScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->projectedStrainScore:Ljava/lang/Double;

    return-object p0
.end method

.method public final setScaledScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->scaledScore:Ljava/lang/Double;

    return-object p0
.end method

.method public final setScaledScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->scaledScore:Ljava/lang/Double;

    return-object p0
.end method

.method public final setState(Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    return-object p0
.end method

.method public final setState(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "+",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    return-object p0
.end method

.method public final setStrainScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->strainScore:Ljava/lang/Double;

    return-object p0
.end method

.method public final setStrainScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->strainScore:Ljava/lang/Double;

    return-object p0
.end method
