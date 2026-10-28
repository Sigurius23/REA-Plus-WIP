.class final synthetic Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getGeoJsonClusterChildren$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/QueryFeatureExtensionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/coroutine/MapboxMapExtKt;->getGeoJsonClusterChildren(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $tmp0:Lq83/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq83/d<",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/FeatureExtensionValue;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/FeatureExtensionValue;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getGeoJsonClusterChildren$2$1;->$tmp0:Lq83/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run(Lcom/mapbox/bindgen/Expected;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Lcom/mapbox/maps/FeatureExtensionValue;",
            ">;)V"
        }
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getGeoJsonClusterChildren$2$1;->$tmp0:Lq83/d;

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
