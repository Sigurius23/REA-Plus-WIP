.class public final Lcom/mapbox/maps/coroutine/MapFeatureQueryDelegateExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a9\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u00070\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u000cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0010"
    }
    d2 = {
        "Lmv/b;",
        "Lcom/mapbox/maps/RenderedQueryGeometry;",
        "geometry",
        "Lcom/mapbox/maps/RenderedQueryOptions;",
        "options",
        "Lcom/mapbox/bindgen/Expected;",
        "",
        "",
        "Lcom/mapbox/maps/QueriedRenderedFeature;",
        "queryRenderedFeatures",
        "(Lmv/b;Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lq83/d;)Ljava/lang/Object;",
        "sourceId",
        "Lcom/mapbox/maps/SourceQueryOptions;",
        "Lcom/mapbox/maps/QueriedSourceFeature;",
        "querySourceFeatures",
        "(Lmv/b;Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lq83/d;)Ljava/lang/Object;",
        "maps-sdk_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final queryRenderedFeatures(Lmv/b;Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    const/4 v1, 0x1

    invoke-direct {v0, v1, p3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p3, Lcom/mapbox/maps/coroutine/MapFeatureQueryDelegateExtKt$queryRenderedFeatures$2$1;

    invoke-direct {p3, v0}, Lcom/mapbox/maps/coroutine/MapFeatureQueryDelegateExtKt$queryRenderedFeatures$2$1;-><init>(Lq83/d;)V

    invoke-interface {p0, p1, p2, p3}, Lmv/b;->queryRenderedFeatures(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final querySourceFeatures(Lmv/b;Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    const/4 v1, 0x1

    invoke-direct {v0, v1, p3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p3, Lcom/mapbox/maps/coroutine/MapFeatureQueryDelegateExtKt$querySourceFeatures$2$1;

    invoke-direct {p3, v0}, Lcom/mapbox/maps/coroutine/MapFeatureQueryDelegateExtKt$querySourceFeatures$2$1;-><init>(Lq83/d;)V

    invoke-interface {p0, p1, p2, p3}, Lmv/b;->querySourceFeatures(Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lcom/mapbox/maps/QuerySourceFeaturesCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method
