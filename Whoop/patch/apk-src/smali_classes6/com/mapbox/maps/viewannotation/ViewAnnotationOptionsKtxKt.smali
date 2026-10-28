.class public final Lcom/mapbox/maps/viewannotation/ViewAnnotationOptionsKtxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a=\u0010\n\u001a\u00020\u0001*\u00020\u00012*\u0010\t\u001a\u0016\u0012\u0012\u0008\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00020\u00000\u0007\"\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a+\u0010\u000c\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a5\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0008\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;",
        "Ll83/a0;",
        "block",
        "Lcom/mapbox/maps/ViewAnnotationOptions;",
        "viewAnnotationOptions",
        "(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions;",
        "",
        "Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;",
        "blocks",
        "annotationAnchors",
        "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;[Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;",
        "annotationAnchor",
        "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;",
        "",
        "layerId",
        "Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;",
        "annotatedLayerFeature",
        "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;",
        "Lcom/mapbox/geojson/Geometry;",
        "geometry",
        "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Lcom/mapbox/geojson/Geometry;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;",
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
.method public static final annotatedLayerFeature(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;

    invoke-direct {v0}, Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;-><init>()V

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;->layerId(Ljava/lang/String;)Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;->build()Lcom/mapbox/maps/AnnotatedLayerFeature;

    move-result-object p1

    invoke-static {p1}, Lcom/mapbox/maps/AnnotatedFeature;->valueOf(Lcom/mapbox/maps/AnnotatedLayerFeature;)Lcom/mapbox/maps/AnnotatedFeature;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->annotatedFeature(Lcom/mapbox/maps/AnnotatedFeature;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object p0

    const-string p1, "annotatedFeature(\n    An\u2026(block).build()\n    )\n  )"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic annotatedLayerFeature$default(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lcom/mapbox/maps/viewannotation/ViewAnnotationOptionsKtxKt$annotatedLayerFeature$1;->INSTANCE:Lcom/mapbox/maps/viewannotation/ViewAnnotationOptionsKtxKt$annotatedLayerFeature$1;

    :cond_0
    const-string p3, "<this>"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "layerId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "block"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;

    invoke-direct {p3}, Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;-><init>()V

    invoke-virtual {p3, p1}, Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;->layerId(Ljava/lang/String;)Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;->build()Lcom/mapbox/maps/AnnotatedLayerFeature;

    move-result-object p1

    invoke-static {p1}, Lcom/mapbox/maps/AnnotatedFeature;->valueOf(Lcom/mapbox/maps/AnnotatedLayerFeature;)Lcom/mapbox/maps/AnnotatedFeature;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->annotatedFeature(Lcom/mapbox/maps/AnnotatedFeature;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object p0

    const-string p1, "annotatedFeature(\n    An\u2026(block).build()\n    )\n  )"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final annotationAnchor(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;

    invoke-direct {v0}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;->build()Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->variableAnchors(Ljava/util/List;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object p0

    const-string p1, "variableAnchors(listOf(V\u2026().apply(block).build()))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final varargs annotationAnchors(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;[Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;",
            "[",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blocks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    new-instance v5, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;

    invoke-direct {v5}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;-><init>()V

    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;->build()Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-array p1, v2, [Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Lcom/mapbox/maps/ViewAnnotationAnchorConfig;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->variableAnchors(Ljava/util/List;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object p0

    const-string p1, "variableAnchors(\n    lis\u2026d() }.toTypedArray())\n  )"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final geometry(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Lcom/mapbox/geojson/Geometry;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geometry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/mapbox/maps/AnnotatedFeature;->valueOf(Lcom/mapbox/geojson/Geometry;)Lcom/mapbox/maps/AnnotatedFeature;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->annotatedFeature(Lcom/mapbox/maps/AnnotatedFeature;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final viewAnnotationOptions(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/mapbox/maps/ViewAnnotationOptions;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;

    invoke-direct {v0}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;-><init>()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/mapbox/maps/ViewAnnotationOptions$Builder;->build()Lcom/mapbox/maps/ViewAnnotationOptions;

    move-result-object p0

    const-string v0, "Builder().apply(block).build()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
