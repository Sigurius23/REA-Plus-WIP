.class public interface abstract Lcom/whoop/analytics/strain/model/StateIF;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/hubspot/immutables/style/HubSpotStyle;
.end annotation

.annotation build Lorg/immutables/value/Value$Immutable;
.end annotation


# virtual methods
.method public abstract getAnaState()Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPrevMaxTime()J
.end method

.method public abstract getUserId()Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method
