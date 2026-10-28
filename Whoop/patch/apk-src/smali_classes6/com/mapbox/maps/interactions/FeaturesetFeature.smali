.class public Lcom/mapbox/maps/interactions/FeaturesetFeature;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
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
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B5\u0008\u0007\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0007\u001a\u000c\u0012\u0004\u0012\u00028\u0000\u0012\u0002\u0008\u00030\u0006\u0012\u0006\u0010\u0008\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R!\u0010\u0007\u001a\u000c\u0012\u0004\u0012\u00028\u0000\u0012\u0002\u0008\u00030\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0008\u001a\u00028\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u001b\u0010*\u001a\u00020%8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lcom/mapbox/maps/interactions/FeaturesetFeature;",
        "Lcom/mapbox/maps/interactions/FeatureState;",
        "FS",
        "",
        "Lcom/mapbox/maps/FeaturesetFeatureId;",
        "id",
        "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;",
        "descriptor",
        "state",
        "Lcom/mapbox/geojson/Feature;",
        "originalFeature",
        "<init>",
        "(Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/geojson/Feature;)V",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "Lcom/mapbox/maps/FeaturesetFeatureId;",
        "getId",
        "()Lcom/mapbox/maps/FeaturesetFeatureId;",
        "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;",
        "getDescriptor",
        "()Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;",
        "Lcom/mapbox/maps/interactions/FeatureState;",
        "getState",
        "()Lcom/mapbox/maps/interactions/FeatureState;",
        "Lcom/mapbox/geojson/Feature;",
        "getOriginalFeature$sdk_base_release",
        "()Lcom/mapbox/geojson/Feature;",
        "Lcom/mapbox/geojson/Geometry;",
        "geometry",
        "Lcom/mapbox/geojson/Geometry;",
        "getGeometry",
        "()Lcom/mapbox/geojson/Geometry;",
        "Lorg/json/JSONObject;",
        "properties$delegate",
        "Ll83/h;",
        "getProperties",
        "()Lorg/json/JSONObject;",
        "properties",
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


# instance fields
.field private final descriptor:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor<",
            "TFS;*>;"
        }
    .end annotation
.end field

.field private final geometry:Lcom/mapbox/geojson/Geometry;

.field private final id:Lcom/mapbox/maps/FeaturesetFeatureId;

.field private final originalFeature:Lcom/mapbox/geojson/Feature;

.field private final properties$delegate:Ll83/h;

.field private final state:Lcom/mapbox/maps/interactions/FeatureState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TFS;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/geojson/Feature;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/FeaturesetFeatureId;",
            "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor<",
            "TFS;*>;TFS;",
            "Lcom/mapbox/geojson/Feature;",
            ")V"
        }
    .end annotation

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalFeature"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->id:Lcom/mapbox/maps/FeaturesetFeatureId;

    iput-object p2, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->descriptor:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    iput-object p3, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->state:Lcom/mapbox/maps/interactions/FeatureState;

    iput-object p4, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->originalFeature:Lcom/mapbox/geojson/Feature;

    invoke-virtual {p4}, Lcom/mapbox/geojson/Feature;->geometry()Lcom/mapbox/geojson/Geometry;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->geometry:Lcom/mapbox/geojson/Geometry;

    new-instance p1, Lcom/mapbox/maps/interactions/FeaturesetFeature$properties$2;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/interactions/FeaturesetFeature$properties$2;-><init>(Lcom/mapbox/maps/interactions/FeaturesetFeature;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->properties$delegate:Ll83/h;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.mapbox.maps.interactions.FeaturesetFeature<*>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/mapbox/maps/interactions/FeaturesetFeature;

    iget-object v1, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->descriptor:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    iget-object v3, p1, Lcom/mapbox/maps/interactions/FeaturesetFeature;->descriptor:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->originalFeature:Lcom/mapbox/geojson/Feature;

    iget-object v3, p1, Lcom/mapbox/maps/interactions/FeaturesetFeature;->originalFeature:Lcom/mapbox/geojson/Feature;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->state:Lcom/mapbox/maps/interactions/FeatureState;

    iget-object v3, p1, Lcom/mapbox/maps/interactions/FeaturesetFeature;->state:Lcom/mapbox/maps/interactions/FeatureState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->id:Lcom/mapbox/maps/FeaturesetFeatureId;

    iget-object p1, p1, Lcom/mapbox/maps/interactions/FeaturesetFeature;->id:Lcom/mapbox/maps/FeaturesetFeatureId;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDescriptor()Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor<",
            "TFS;*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->descriptor:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    return-object v0
.end method

.method public getGeometry()Lcom/mapbox/geojson/Geometry;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->geometry:Lcom/mapbox/geojson/Geometry;

    return-object v0
.end method

.method public final getId()Lcom/mapbox/maps/FeaturesetFeatureId;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->id:Lcom/mapbox/maps/FeaturesetFeatureId;

    return-object v0
.end method

.method public final getOriginalFeature$sdk_base_release()Lcom/mapbox/geojson/Feature;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->originalFeature:Lcom/mapbox/geojson/Feature;

    return-object v0
.end method

.method public final getProperties()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->properties$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    return-object v0
.end method

.method public final getState()Lcom/mapbox/maps/interactions/FeatureState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TFS;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->state:Lcom/mapbox/maps/interactions/FeatureState;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->descriptor:Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;

    iget-object v1, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->originalFeature:Lcom/mapbox/geojson/Feature;

    iget-object v2, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->state:Lcom/mapbox/maps/interactions/FeatureState;

    iget-object v3, p0, Lcom/mapbox/maps/interactions/FeaturesetFeature;->id:Lcom/mapbox/maps/FeaturesetFeatureId;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
