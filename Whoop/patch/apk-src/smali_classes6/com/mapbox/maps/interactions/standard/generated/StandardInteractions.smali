.class public final Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aQ\u0010\r\u001a\u00020\u000c*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001aQ\u0010\r\u001a\u00020\u000c*\u00020\u000f2\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u0011\u001aQ\u0010\u0013\u001a\u00020\u000c*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u000e\u001aQ\u0010\u0013\u001a\u00020\u000c*\u00020\u000f2\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0011\u001aQ\u0010\u0015\u001a\u00020\u000c*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u000e\u001aQ\u0010\u0015\u001a\u00020\u000c*\u00020\u000f2\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0011\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/mapbox/maps/ClickInteraction$Companion;",
        "",
        "importId",
        "Lcom/mapbox/bindgen/Value;",
        "filter",
        "",
        "radius",
        "Lkotlin/Function2;",
        "Lcom/mapbox/maps/interactions/standard/generated/StandardPoiFeature;",
        "Lcom/mapbox/maps/InteractionContext;",
        "",
        "onClick",
        "Lcom/mapbox/maps/MapInteraction;",
        "standardPoi",
        "(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;",
        "Lcom/mapbox/maps/LongClickInteraction$Companion;",
        "onLongClick",
        "(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;",
        "Lcom/mapbox/maps/interactions/standard/generated/StandardPlaceLabelsFeature;",
        "standardPlaceLabels",
        "Lcom/mapbox/maps/interactions/standard/generated/StandardBuildingsFeature;",
        "standardBuildings",
        "sdk-base_release"
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
.method public static final standardBuildings(Lcom/mapbox/maps/ClickInteraction$Companion;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardBuildings$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardBuildings(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 2
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardBuildings$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardBuildings(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 3
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardBuildings$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardBuildings(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Ljava/lang/Double;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onClick"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/mapbox/maps/ClickInteraction;

    .line 8
    new-instance v1, Lcom/mapbox/maps/FeaturesetDescriptor;

    if-nez p1, :cond_0

    .line 9
    const-string p0, "basemap"

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    const/4 v2, 0x0

    .line 10
    const-string v3, "buildings"

    invoke-direct {v1, v3, p0, v2}, Lcom/mapbox/maps/FeaturesetDescriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    new-instance v5, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardBuildings$1;

    invoke-direct {v5, p1}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardBuildings$1;-><init>(Ljava/lang/String;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/mapbox/maps/ClickInteraction;-><init>(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;Lkotlin/jvm/functions/Function3;)V

    return-object v0
.end method

.method public static final standardBuildings(Lcom/mapbox/maps/LongClickInteraction$Companion;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 4
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardBuildings$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardBuildings(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 5
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardBuildings$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardBuildings(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 6
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardBuildings$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardBuildings(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Ljava/lang/Double;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onLongClick"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/mapbox/maps/LongClickInteraction;

    .line 14
    new-instance v1, Lcom/mapbox/maps/FeaturesetDescriptor;

    if-nez p1, :cond_0

    .line 15
    const-string p0, "basemap"

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    const/4 v2, 0x0

    .line 16
    const-string v3, "buildings"

    invoke-direct {v1, v3, p0, v2}, Lcom/mapbox/maps/FeaturesetDescriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    new-instance v5, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardBuildings$2;

    invoke-direct {v5, p1}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardBuildings$2;-><init>(Ljava/lang/String;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 18
    invoke-direct/range {v0 .. v5}, Lcom/mapbox/maps/LongClickInteraction;-><init>(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;Lkotlin/jvm/functions/Function3;)V

    return-object v0
.end method

.method public static synthetic standardBuildings$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v0

    .line 1
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardBuildings(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic standardBuildings$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v0

    .line 2
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardBuildings(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPlaceLabels(Lcom/mapbox/maps/ClickInteraction$Companion;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPlaceLabels$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPlaceLabels(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 2
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPlaceLabels$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPlaceLabels(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 3
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPlaceLabels$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPlaceLabels(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Ljava/lang/Double;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onClick"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/mapbox/maps/ClickInteraction;

    .line 8
    new-instance v1, Lcom/mapbox/maps/FeaturesetDescriptor;

    if-nez p1, :cond_0

    .line 9
    const-string p0, "basemap"

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    const/4 v2, 0x0

    .line 10
    const-string v3, "place-labels"

    invoke-direct {v1, v3, p0, v2}, Lcom/mapbox/maps/FeaturesetDescriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    new-instance v5, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardPlaceLabels$1;

    invoke-direct {v5, p1}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardPlaceLabels$1;-><init>(Ljava/lang/String;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/mapbox/maps/ClickInteraction;-><init>(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;Lkotlin/jvm/functions/Function3;)V

    return-object v0
.end method

.method public static final standardPlaceLabels(Lcom/mapbox/maps/LongClickInteraction$Companion;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 4
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPlaceLabels$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPlaceLabels(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 5
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPlaceLabels$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPlaceLabels(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 6
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPlaceLabels$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPlaceLabels(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Ljava/lang/Double;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onLongClick"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/mapbox/maps/LongClickInteraction;

    .line 14
    new-instance v1, Lcom/mapbox/maps/FeaturesetDescriptor;

    if-nez p1, :cond_0

    .line 15
    const-string p0, "basemap"

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    const/4 v2, 0x0

    .line 16
    const-string v3, "place-labels"

    invoke-direct {v1, v3, p0, v2}, Lcom/mapbox/maps/FeaturesetDescriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    new-instance v5, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardPlaceLabels$2;

    invoke-direct {v5, p1}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardPlaceLabels$2;-><init>(Ljava/lang/String;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 18
    invoke-direct/range {v0 .. v5}, Lcom/mapbox/maps/LongClickInteraction;-><init>(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;Lkotlin/jvm/functions/Function3;)V

    return-object v0
.end method

.method public static synthetic standardPlaceLabels$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v0

    .line 1
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPlaceLabels(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic standardPlaceLabels$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v0

    .line 2
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPlaceLabels(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPoi(Lcom/mapbox/maps/ClickInteraction$Companion;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPoi$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPoi(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 2
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPoi$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPoi(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 3
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPoi$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPoi(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/ClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Ljava/lang/Double;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onClick"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/mapbox/maps/ClickInteraction;

    .line 8
    new-instance v1, Lcom/mapbox/maps/FeaturesetDescriptor;

    if-nez p1, :cond_0

    .line 9
    const-string p0, "basemap"

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    const/4 v2, 0x0

    .line 10
    const-string v3, "poi"

    invoke-direct {v1, v3, p0, v2}, Lcom/mapbox/maps/FeaturesetDescriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    new-instance v5, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardPoi$1;

    invoke-direct {v5, p1}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardPoi$1;-><init>(Ljava/lang/String;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/mapbox/maps/ClickInteraction;-><init>(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;Lkotlin/jvm/functions/Function3;)V

    return-object v0
.end method

.method public static final standardPoi(Lcom/mapbox/maps/LongClickInteraction$Companion;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 4
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPoi$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPoi(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 5
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPoi$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPoi(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    .line 6
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPoi$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final standardPoi(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/LongClickInteraction$Companion;",
            "Ljava/lang/String;",
            "Lcom/mapbox/bindgen/Value;",
            "Ljava/lang/Double;",
            "Lc93/m;",
            ")",
            "Lcom/mapbox/maps/MapInteraction;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onLongClick"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/mapbox/maps/LongClickInteraction;

    .line 14
    new-instance v1, Lcom/mapbox/maps/FeaturesetDescriptor;

    if-nez p1, :cond_0

    .line 15
    const-string p0, "basemap"

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    const/4 v2, 0x0

    .line 16
    const-string v3, "poi"

    invoke-direct {v1, v3, p0, v2}, Lcom/mapbox/maps/FeaturesetDescriptor;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    new-instance v5, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardPoi$2;

    invoke-direct {v5, p1}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions$standardPoi$2;-><init>(Ljava/lang/String;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 18
    invoke-direct/range {v0 .. v5}, Lcom/mapbox/maps/LongClickInteraction;-><init>(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;Lkotlin/jvm/functions/Function3;)V

    return-object v0
.end method

.method public static synthetic standardPoi$default(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v0

    .line 1
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPoi(Lcom/mapbox/maps/ClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic standardPoi$default(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;ILjava/lang/Object;)Lcom/mapbox/maps/MapInteraction;
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v0

    .line 2
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/interactions/standard/generated/StandardInteractions;->standardPoi(Lcom/mapbox/maps/LongClickInteraction$Companion;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Ljava/lang/Double;Lc93/m;)Lcom/mapbox/maps/MapInteraction;

    move-result-object p0

    return-object p0
.end method
