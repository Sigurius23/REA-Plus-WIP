.class public interface abstract Lcom/mapbox/maps/interactions/FeatureStateCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/mapbox/maps/MapboxExperimental;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<FS:",
        "Lcom/mapbox/maps/interactions/FeatureState;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00e7\u0080\u0001\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/mapbox/maps/interactions/FeatureStateCallback;",
        "Lcom/mapbox/maps/interactions/FeatureState;",
        "FS",
        "",
        "state",
        "Ll83/a0;",
        "onFeatureState",
        "(Lcom/mapbox/maps/interactions/FeatureState;)V",
        "sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onFeatureState(Lcom/mapbox/maps/interactions/FeatureState;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TFS;)V"
        }
    .end annotation
.end method
