.class public interface abstract Lcom/whoop/analytics/strain/model/StrainScoreIF;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/hubspot/immutables/style/HubSpotStyle;
.end annotation

.annotation build Lorg/immutables/value/Value$Immutable;
.end annotation


# virtual methods
.method public abstract getAvgHr()Ljava/util/Optional;
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
.end method

.method public abstract getKilojoules()Ljava/util/Optional;
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
.end method

.method public abstract getMaxHr()Ljava/util/Optional;
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
.end method

.method public abstract getProjectedStrainScore()Ljava/util/Optional;
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
.end method

.method public abstract getScaledScore()Ljava/util/Optional;
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
.end method

.method public abstract getState()Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getStrainScore()Ljava/util/Optional;
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
.end method
