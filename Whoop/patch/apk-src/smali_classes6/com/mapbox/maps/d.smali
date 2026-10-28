.class public final synthetic Lcom/mapbox/maps/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/bindgen/Expected$Action;
.implements Lcom/mapbox/maps/QueryFeatureStateCallback;


# instance fields
.field public final synthetic a:Lcom/mapbox/maps/interactions/FeatureStateCallback;

.field public final synthetic b:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/maps/interactions/FeatureStateCallback;Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/d;->a:Lcom/mapbox/maps/interactions/FeatureStateCallback;

    iput-object p2, p0, Lcom/mapbox/maps/d;->b:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Lcom/mapbox/bindgen/Expected;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/d;->a:Lcom/mapbox/maps/interactions/FeatureStateCallback;

    iget-object v1, p0, Lcom/mapbox/maps/d;->b:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    invoke-static {v0, v1, p1}, Lcom/mapbox/maps/MapboxMap;->b(Lcom/mapbox/maps/interactions/FeatureStateCallback;Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method public run(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/d;->b:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    check-cast p1, Lcom/mapbox/bindgen/Value;

    iget-object v1, p0, Lcom/mapbox/maps/d;->a:Lcom/mapbox/maps/interactions/FeatureStateCallback;

    invoke-static {v1, v0, p1}, Lcom/mapbox/maps/MapboxMap;->h(Lcom/mapbox/maps/interactions/FeatureStateCallback;Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method
