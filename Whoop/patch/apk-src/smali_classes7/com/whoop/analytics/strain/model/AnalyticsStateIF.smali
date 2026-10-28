.class public interface abstract Lcom/whoop/analytics/strain/model/AnalyticsStateIF;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/hubspot/immutables/style/HubSpotStyle;
.end annotation

.annotation build Lorg/immutables/value/Value$Immutable;
.end annotation


# virtual methods
.method public abstract getLastUsed()Ljava/util/Optional;
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
.end method

.method public abstract getLeftOverAccelX()Ljava/util/Optional;
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
.end method

.method public abstract getLeftOverHrc()Ljava/util/Optional;
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
.end method

.method public abstract getLeftOvers()Ljava/util/List;
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
.end method

.method public abstract getModHrs()Ljava/util/List;
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
.end method
