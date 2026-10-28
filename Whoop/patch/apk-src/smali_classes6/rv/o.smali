.class public final Lrv/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/HashMap;

.field public c:Lcom/mapbox/maps/MapboxStyleManager;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv/o;->a:Ljava/lang/String;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lrv/o;->b:Ljava/util/HashMap;

    return-void
.end method

.method public static b()Lcom/mapbox/bindgen/Value;
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    const-string v4, "delay"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    const-string v2, "duration"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    return-object v1
.end method

.method public static c()Lcom/mapbox/bindgen/Value;
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    const-string v4, "delay"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(J)V

    const-string v2, "duration"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v0}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    return-object v1
.end method


# virtual methods
.method public final a(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/LayerPosition;)V
    .locals 2

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrv/o;->c:Lcom/mapbox/maps/MapboxStyleManager;

    new-instance v0, Lcom/mapbox/bindgen/Value;

    iget-object v1, p0, Lrv/o;->b:Ljava/util/HashMap;

    invoke-direct {v0, v1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/HashMap;)V

    invoke-virtual {p1, v0, p2}, Lcom/mapbox/maps/MapboxStyleManager;->addPersistentStyleLayer(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p2, Lcom/mapbox/maps/MapboxLocationComponentException;

    const-string v0, "Add layer failed: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V
    .locals 4

    iget-object v0, p0, Lrv/o;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lrv/o;->c:Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lrv/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleLayerProperty(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "\" failed:\nError: "

    const-string v2, "\nValue set: "

    const-string v3, "Set layer property \""

    invoke-static {v3, p1, v1, v0, v2}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MapboxLocationLayerWrapper"

    invoke-static {p2, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
