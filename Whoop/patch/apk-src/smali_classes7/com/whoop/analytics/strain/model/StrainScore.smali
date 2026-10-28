.class public final Lcom/whoop/analytics/strain/model/StrainScore;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/StrainScoreIF;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/analytics/strain/model/StrainScore$Builder;,
        Lcom/whoop/analytics/strain/model/StrainScore$Json;
    }
.end annotation

.annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
.end annotation


# instance fields
.field private final avgHr:Ljava/lang/Double;

.field private final kilojoules:Ljava/lang/Double;

.field private final maxHr:Ljava/lang/Double;

.field private final projectedStrainScore:Ljava/lang/Double;

.field private final scaledScore:Ljava/lang/Double;

.field private final state:Lcom/whoop/analytics/strain/model/AnalyticsState;

.field private final strainScore:Ljava/lang/Double;


# direct methods
.method private constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    .line 4
    iput-object p2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    .line 5
    iput-object p3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    .line 6
    iput-object p4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    .line 7
    iput-object p5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    .line 8
    iput-object p6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    .line 9
    iput-object p7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;Lcom/whoop/analytics/strain/model/StrainScore$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-void
.end method

.method public static builder()Lcom/whoop/analytics/strain/model/StrainScore$Builder;
    .locals 2

    new-instance v0, Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;-><init>(Lcom/whoop/analytics/strain/model/StrainScore$1;)V

    return-object v0
.end method

.method public static copyOf(Lcom/whoop/analytics/strain/model/StrainScoreIF;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 1

    instance-of v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/analytics/strain/model/StrainScore;

    return-object p0

    :cond_0
    invoke-static {}, Lcom/whoop/analytics/strain/model/StrainScore;->builder()Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->from(Lcom/whoop/analytics/strain/model/StrainScoreIF;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->build()Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object p0

    return-object p0
.end method

.method private equalTo(Lcom/whoop/analytics/strain/model/StrainScore;)Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object p1, p1, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static fromJson(Lcom/whoop/analytics/strain/model/StrainScore$Json;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
        mode = .enum Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DELEGATING:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/whoop/analytics/strain/model/StrainScore;->builder()Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Json;->strainScore:Ljava/util/Optional;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setStrainScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_0
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Json;->scaledScore:Ljava/util/Optional;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setScaledScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_1
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Json;->kilojoules:Ljava/util/Optional;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setKilojoules(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_2
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Json;->avgHr:Ljava/util/Optional;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setAvgHr(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_3
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Json;->maxHr:Ljava/util/Optional;

    if-eqz v1, :cond_4

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setMaxHr(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_4
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore$Json;->projectedStrainScore:Ljava/util/Optional;

    if-eqz v1, :cond_5

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setProjectedStrainScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_5
    iget-object p0, p0, Lcom/whoop/analytics/strain/model/StrainScore$Json;->state:Ljava/util/Optional;

    if-eqz p0, :cond_6

    invoke-virtual {v0, p0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setState(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    :cond_6
    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->build()Lcom/whoop/analytics/strain/model/StrainScore;

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
    instance-of v1, p1, Lcom/whoop/analytics/strain/model/StrainScore;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/whoop/analytics/strain/model/StrainScore;

    invoke-direct {p0, p1}, Lcom/whoop/analytics/strain/model/StrainScore;->equalTo(Lcom/whoop/analytics/strain/model/StrainScore;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getAvgHr()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "avgHr"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getKilojoules()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "kilojoules"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getMaxHr()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "maxHr"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getProjectedStrainScore()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "projectedStrainScore"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getScaledScore()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scaledScore"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getState()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getStrainScore()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "strainScore"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x2b5a5

    add-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    invoke-static {v2}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    shl-int/lit8 v0, v2, 0x5

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    shl-int/lit8 v0, v1, 0x5

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    invoke-static {v2}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    shl-int/lit8 v0, v2, 0x5

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    shl-int/lit8 v0, v1, 0x5

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    invoke-static {v2}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    shl-int/lit8 v0, v2, 0x5

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StrainScore{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    if-eqz v1, :cond_0

    const-string v1, "strainScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    const-string v2, ", "

    const/16 v3, 0xc

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v3, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, "scaledScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v3, :cond_3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v1, "kilojoules="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v3, :cond_5

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    const-string v1, "avgHr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v3, :cond_7

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    const-string v1, "maxHr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_8
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v3, :cond_9

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    const-string v1, "projectedStrainScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_a
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v3, :cond_b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    const-string v1, "state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_c
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withAvgHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v8, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-object v5, p1

    invoke-direct/range {v1 .. v8}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v1
.end method

.method public final withAvgHr(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/Double;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    invoke-static {p1, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-direct/range {v0 .. v7}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v0
.end method

.method public final withKilojoules(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v8, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-object v4, p1

    invoke-direct/range {v1 .. v8}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v1
.end method

.method public final withKilojoules(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/Double;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    invoke-static {p1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-direct/range {v0 .. v7}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v0
.end method

.method public final withMaxHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v8, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-object v6, p1

    invoke-direct/range {v1 .. v8}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v1
.end method

.method public final withMaxHr(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/Double;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    invoke-static {p1, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-direct/range {v0 .. v7}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v0
.end method

.method public final withProjectedStrainScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v8, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-object v7, p1

    invoke-direct/range {v1 .. v8}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v1
.end method

.method public final withProjectedStrainScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/Double;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    invoke-static {p1, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-direct/range {v0 .. v7}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v0
.end method

.method public final withScaledScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v8, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v1
.end method

.method public final withScaledScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/Double;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    invoke-static {p1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-direct/range {v0 .. v7}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v0
.end method

.method public final withState(Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    if-ne v0, p1, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    move-object v8, p1

    invoke-direct/range {v1 .. v8}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v1
.end method

.method public final withState(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "+",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/whoop/analytics/strain/model/AnalyticsState;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    if-ne p1, v7, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    invoke-direct/range {v0 .. v7}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v0
.end method

.method public final withStrainScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v1, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v8, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v1
.end method

.method public final withStrainScore(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Double;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/StrainScore;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Double;

    .line 4
    iget-object p1, p0, Lcom/whoop/analytics/strain/model/StrainScore;->strainScore:Ljava/lang/Double;

    invoke-static {p1, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/StrainScore;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/StrainScore;->scaledScore:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/analytics/strain/model/StrainScore;->kilojoules:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/StrainScore;->avgHr:Ljava/lang/Double;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/StrainScore;->maxHr:Ljava/lang/Double;

    iget-object v6, p0, Lcom/whoop/analytics/strain/model/StrainScore;->projectedStrainScore:Ljava/lang/Double;

    iget-object v7, p0, Lcom/whoop/analytics/strain/model/StrainScore;->state:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-direct/range {v0 .. v7}, Lcom/whoop/analytics/strain/model/StrainScore;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/whoop/analytics/strain/model/AnalyticsState;)V

    return-object v0
.end method
