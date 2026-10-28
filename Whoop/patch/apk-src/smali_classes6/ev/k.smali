.class public final Lev/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lev/i;

.field public b:I

.field public c:Ll83/k;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final f:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final g:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final h:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public i:Lqv/c;


# direct methods
.method public constructor <init>(Lev/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev/k;->a:Lev/i;

    const/4 p1, 0x2

    iput p1, p0, Lev/k;->b:I

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lev/k;->d:Ljava/util/LinkedHashMap;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lev/k;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lev/k;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lev/k;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lev/k;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-void
.end method


# virtual methods
.method public final a(Lcom/mapbox/maps/CameraState;)V
    .locals 11

    iget-object v0, p0, Lev/k;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lev/g;

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v3

    const-string v1, "cameraState.center"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v5

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraState;->getPitch()D

    move-result-wide v7

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v9

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraState;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v4

    const-string v1, "cameraState.padding"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {v2 .. v10}, Lev/g;->d(Lcom/mapbox/geojson/Point;Lcom/mapbox/maps/EdgeInsets;DDD)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 2

    iget v0, p0, Lev/k;->b:I

    if-eq p1, v0, :cond_4

    iput p1, p0, Lev/k;->b:I

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    iget-object v0, p0, Lev/k;->d:Ljava/util/LinkedHashMap;

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lev/j;

    instance-of v1, v0, Lev/b;

    if-eqz v1, :cond_1

    check-cast v0, Lev/b;

    invoke-interface {v0}, Lev/b;->onStop()V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lev/j;

    instance-of v1, v0, Lev/b;

    if-eqz v1, :cond_3

    check-cast v0, Lev/b;

    invoke-interface {v0}, Lev/b;->onStart()V

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method
