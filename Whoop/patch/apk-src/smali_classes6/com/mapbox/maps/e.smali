.class public final synthetic Lcom/mapbox/maps/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/bindgen/Expected$Action;
.implements Lcom/mapbox/maps/QueryFeatureStateCallback;


# instance fields
.field public final synthetic a:Lcom/mapbox/maps/interactions/FeatureStateCallback;

.field public final synthetic b:Lcom/mapbox/maps/interactions/FeaturesetFeature;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateCallback;)V
    .locals 0

    iput-object p2, p0, Lcom/mapbox/maps/e;->a:Lcom/mapbox/maps/interactions/FeatureStateCallback;

    iput-object p1, p0, Lcom/mapbox/maps/e;->b:Lcom/mapbox/maps/interactions/FeaturesetFeature;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Lcom/mapbox/bindgen/Expected;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/e;->a:Lcom/mapbox/maps/interactions/FeatureStateCallback;

    iget-object v1, p0, Lcom/mapbox/maps/e;->b:Lcom/mapbox/maps/interactions/FeaturesetFeature;

    invoke-static {v0, v1, p1}, Lcom/mapbox/maps/MapboxMap;->j(Lcom/mapbox/maps/interactions/FeatureStateCallback;Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method public run(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/e;->b:Lcom/mapbox/maps/interactions/FeaturesetFeature;

    check-cast p1, Lcom/mapbox/bindgen/Value;

    iget-object v1, p0, Lcom/mapbox/maps/e;->a:Lcom/mapbox/maps/interactions/FeatureStateCallback;

    invoke-static {v1, v0, p1}, Lcom/mapbox/maps/MapboxMap;->q(Lcom/mapbox/maps/interactions/FeatureStateCallback;Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method
