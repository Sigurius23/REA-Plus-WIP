.class public final Lbv/c;
.super Lav/e;
.source "SourceFile"


# static fields
.field public static final i:Landroid/os/HandlerThread;


# instance fields
.field public e:Lcom/mapbox/geojson/GeoJson;

.field public f:Ljava/lang/String;

.field public final g:Ll83/p;

.field public final h:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "GEOJSON_PARSER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    sput-object v0, Lbv/c;->i:Landroid/os/HandlerThread;

    return-void
.end method

.method public constructor <init>(La00/g;)V
    .locals 2

    iget-object v0, p1, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lav/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lav/e;->d()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p1, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    invoke-virtual {p0}, Lav/e;->f()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p1, La00/g;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lbv/c;->e:Lcom/mapbox/geojson/GeoJson;

    iget-object p1, p1, La00/g;->E:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lbv/c;->f:Ljava/lang/String;

    sget-object p1, Lbv/b;->y:Lbv/b;

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lbv/c;->g:Ll83/p;

    sget-object p1, Lbv/b;->x:Lbv/b;

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lbv/c;->h:Ll83/p;

    return-void
.end method


# virtual methods
.method public final b(Lcom/mapbox/maps/MapboxStyleManager;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lav/e;->b(Lcom/mapbox/maps/MapboxStyleManager;)V

    iget-object p1, p0, Lbv/c;->e:Lcom/mapbox/geojson/GeoJson;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lbv/c;->f:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lbv/c;->g(Lcom/mapbox/geojson/GeoJson;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const-string v0, "geojson"

    return-object v0
.end method

.method public final g(Lcom/mapbox/geojson/GeoJson;Ljava/lang/String;)V
    .locals 8

    const-string v0, "geoJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/mapbox/geojson/Feature;

    const-string v1, "valueOf(geoJson)"

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/mapbox/geojson/Feature;

    invoke-static {v0}, Lcom/mapbox/maps/GeoJSONSourceData;->valueOf(Lcom/mapbox/geojson/Feature;)Lcom/mapbox/maps/GeoJSONSourceData;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/mapbox/geojson/Geometry;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/mapbox/geojson/Geometry;

    invoke-static {v0}, Lcom/mapbox/maps/GeoJSONSourceData;->valueOf(Lcom/mapbox/geojson/Geometry;)Lcom/mapbox/maps/GeoJSONSourceData;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/mapbox/geojson/FeatureCollection;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/mapbox/geojson/FeatureCollection;

    invoke-virtual {v0}, Lcom/mapbox/geojson/FeatureCollection;->features()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/mapbox/maps/GeoJSONSourceData;->valueOf(Ljava/util/List;)Lcom/mapbox/maps/GeoJSONSourceData;

    move-result-object v0

    const-string v1, "valueOf(geoJson.features()!!)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    iget-object v3, p0, Lav/e;->d:Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v3, :cond_2

    iget-object v0, p0, Lbv/c;->g:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v2, Lbv/a;

    const/4 v7, 0x0

    move-object v4, p0

    move-object v5, p2

    invoke-direct/range {v2 .. v7}, Lbv/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_2
    move-object v4, p0

    move-object v5, p2

    :goto_2
    iput-object p1, v4, Lbv/c;->e:Lcom/mapbox/geojson/GeoJson;

    iput-object v5, v4, Lbv/c;->f:Ljava/lang/String;

    return-void

    :cond_3
    move-object v4, p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Incorrect GeoJson data format"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
