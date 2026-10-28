.class public final synthetic Lcom/mapbox/maps/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/QueryRenderedFeaturesCallback;
.implements Lcom/mapbox/bindgen/Expected$Action;


# instance fields
.field public final synthetic a:Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;

.field public final synthetic b:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;)V
    .locals 0

    iput-object p2, p0, Lcom/mapbox/maps/g;->a:Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;

    iput-object p1, p0, Lcom/mapbox/maps/g;->b:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Lcom/mapbox/bindgen/Expected;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/g;->a:Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;

    iget-object v1, p0, Lcom/mapbox/maps/g;->b:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    invoke-static {v0, v1, p1}, Lcom/mapbox/maps/MapboxMap;->x(Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method public run(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/g;->b:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, Lcom/mapbox/maps/g;->a:Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;

    invoke-static {v1, v0, p1}, Lcom/mapbox/maps/MapboxMap;->t(Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Ljava/util/List;)V

    return-void
.end method
