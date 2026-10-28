.class public interface abstract Lcom/whoop/analytics/strain/model/SmoothingResultIF;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/hubspot/immutables/style/HubSpotStyle;
.end annotation

.annotation build Lorg/immutables/value/Value$Immutable;
.end annotation


# virtual methods
.method public abstract getLastUsedIndex()I
.end method

.method public abstract getLastUsedTime()J
.end method

.method public abstract getSmoothedHrs()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;"
        }
    .end annotation
.end method
