.class public final Lrv/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ltv/c;

.field public final b:Ljava/lang/ref/WeakReference;

.field public final c:Lev/i;

.field public final d:Lq30/w0;

.field public final e:Lq/f;

.field public f:Z

.field public g:Lcom/mapbox/geojson/Point;

.field public final h:Lrv/q;

.field public i:D

.field public final j:Lrv/q;

.field public final k:Lar/d;

.field public l:D

.field public final m:Lrv/q;

.field public n:Lrv/p;


# direct methods
.method public constructor <init>(Ltv/c;Ljava/lang/ref/WeakReference;Lev/i;Lq30/w0;Lq/f;)V
    .locals 1

    const-string v0, "weakContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delegateProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv/r;->a:Ltv/c;

    iput-object p2, p0, Lrv/r;->b:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lrv/r;->c:Lev/i;

    iput-object p4, p0, Lrv/r;->d:Lq30/w0;

    iput-object p5, p0, Lrv/r;->e:Lq/f;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrv/r;->f:Z

    new-instance p1, Lrv/q;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lrv/q;-><init>(Lrv/r;I)V

    iput-object p1, p0, Lrv/r;->h:Lrv/q;

    iget-object p1, p3, Lev/i;->b:Ljava/lang/Object;

    check-cast p1, Lcom/mapbox/maps/MapboxMap;

    invoke-interface {p1}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide p1

    iput-wide p1, p0, Lrv/r;->i:D

    new-instance p1, Lrv/q;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lrv/q;-><init>(Lrv/r;I)V

    iput-object p1, p0, Lrv/r;->j:Lrv/q;

    new-instance p1, Lar/d;

    const/16 p2, 0xe

    invoke-direct {p1, p0, p2}, Lar/d;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lrv/r;->k:Lar/d;

    new-instance p1, Lrv/q;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lrv/q;-><init>(Lrv/r;I)V

    iput-object p1, p0, Lrv/r;->m:Lrv/q;

    iget-object p1, p0, Lrv/r;->a:Ltv/c;

    invoke-virtual {p0, p1}, Lrv/r;->b(Ltv/c;)Lrv/p;

    move-result-object p1

    iput-object p1, p0, Lrv/r;->n:Lrv/p;

    return-void
.end method

.method public static d(Lrv/r;[DI)V
    .locals 4

    and-int/lit8 p2, p2, 0x4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    iget-object v2, p0, Lrv/r;->e:Lq/f;

    iget-object v2, v2, Lq/f;->x:Ljava/lang/Object;

    check-cast v2, Lsv/e;

    const-string v3, "bearings"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lrv/r;->a:Ltv/c;

    iget-boolean v3, v3, Ltv/c;->J:Z

    if-eqz v3, :cond_1

    iput-boolean v1, v2, Lsv/e;->G:Z

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lrv/r;->a([DLkotlin/jvm/functions/Function1;Z)V

    return-void

    :cond_1
    iget-boolean p1, v2, Lsv/e;->G:Z

    if-eqz p1, :cond_2

    new-array p1, v1, [D

    const-wide/16 v1, 0x0

    aput-wide v1, p1, v0

    new-instance v0, Lrv/q;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lrv/q;-><init>(Lrv/r;I)V

    invoke-virtual {p0, p1, v0, p2}, Lrv/r;->a([DLkotlin/jvm/functions/Function1;Z)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final a([DLkotlin/jvm/functions/Function1;Z)V
    .locals 9

    const-string v0, "bearings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-nez p3, :cond_1

    array-length p3, p1

    if-eqz p3, :cond_0

    array-length p3, p1

    sub-int/2addr p3, v0

    aget-wide v1, p1, p3

    iget-wide v3, p0, Lrv/r;->i:D

    sub-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpg-double p3, v1, v3

    if-gez p3, :cond_1

    return-void

    :cond_0
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "Array is empty."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p3, 0x2

    new-array v1, p3, [Ljava/lang/Object;

    new-array v2, p3, [D

    iget-wide v3, p0, Lrv/r;->i:D

    const/4 v5, 0x0

    add-int/2addr v5, v0

    const/4 v6, 0x0

    aput-wide v3, v2, v6

    aput-object p1, v1, v5

    move p1, v6

    move v3, p1

    :goto_0
    aget-object v4, v1, v3

    if-eqz v4, :cond_2

    check-cast v4, [D

    array-length v4, v4

    goto :goto_1

    :cond_2
    move v4, v0

    :goto_1
    add-int/2addr p1, v4

    if-eq v3, v0, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    new-array p1, p1, [D

    move v3, v6

    move v4, v3

    move v5, v4

    :goto_2
    aget-object v7, v1, v3

    if-eqz v7, :cond_5

    if-ge v4, v3, :cond_4

    sub-int v8, v3, v4

    invoke-static {v2, v4, p1, v5, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v5, v8

    :cond_4
    move-object v4, v7

    check-cast v4, [D

    array-length v4, v4

    invoke-static {v7, v6, p1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v5, v4

    add-int/lit8 v4, v3, 0x1

    :cond_5
    if-eq v3, v0, :cond_6

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    if-ge v4, p3, :cond_7

    rsub-int/lit8 p3, v4, 0x2

    invoke-static {v2, v4, p1, v5, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    array-length p3, p1

    invoke-static {p1, p3}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object p1

    const-string p3, "targets"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lrv/r;->e:Lq/f;

    iget-object p3, p3, Lq/f;->x:Ljava/lang/Object;

    check-cast p3, Lsv/e;

    sget-object v0, Lcom/mapbox/maps/util/MathUtils;->INSTANCE:Lcom/mapbox/maps/util/MathUtils;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/util/MathUtils;->prepareOptimalBearingPath([D)[D

    move-result-object p1

    invoke-static {p1}, Lm83/n;->c1([D)[Ljava/lang/Double;

    move-result-object p1

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, Lsv/d;->a([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final b(Ltv/c;)Lrv/p;
    .locals 2

    iget-object p1, p1, Ltv/c;->M:Lev/e;

    instance-of v0, p1, Lev/c;

    if-eqz v0, :cond_0

    check-cast p1, Lev/c;

    const-string v0, "weakContext"

    iget-object v1, p0, Lrv/r;->b:Ljava/lang/ref/WeakReference;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq/f;

    invoke-direct {v0, p1, v1}, Lq/f;-><init>(Lev/c;Ljava/lang/ref/WeakReference;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lev/d;

    if-eqz v0, :cond_1

    check-cast p1, Lev/d;

    new-instance v0, Lrv/s;

    invoke-direct {v0, p1}, Lrv/s;-><init>(Lev/d;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final c(Lcom/mapbox/maps/MapboxMap;)V
    .locals 8

    iget-object v0, p0, Lrv/r;->e:Lq/f;

    iget-object v1, v0, Lq/f;->E:Ljava/lang/Object;

    check-cast v1, Lsv/g;

    iget-object v2, v0, Lq/f;->x:Ljava/lang/Object;

    check-cast v2, Lsv/e;

    iget-object v3, v0, Lq/f;->y:Ljava/lang/Object;

    check-cast v3, Lsv/f;

    iget-object v0, v0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lsv/b;

    const-string v4, "style"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lrv/r;->n:Lrv/p;

    invoke-interface {v4}, Lrv/p;->f()Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "onBearingUpdated"

    iget-object v5, p0, Lrv/r;->j:Lrv/q;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onAccuracyRadiusUpdated"

    iget-object v6, p0, Lrv/r;->m:Lrv/q;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Lsv/d;->w:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lrv/r;->h:Lrv/q;

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    iput-object v7, v3, Lsv/d;->w:Lkotlin/jvm/functions/Function1;

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v2, Lsv/d;->w:Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iput-object v5, v2, Lsv/d;->w:Lkotlin/jvm/functions/Function1;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v0, Lsv/d;->w:Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iput-object v6, v0, Lsv/d;->w:Lkotlin/jvm/functions/Function1;

    :cond_2
    iget-object v4, p0, Lrv/r;->n:Lrv/p;

    const-string v5, "renderer"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v4, v2, Lsv/d;->y:Lrv/p;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v4, v3, Lsv/d;->y:Lrv/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v4, v1, Lsv/d;->y:Lrv/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v4, v0, Lsv/d;->y:Lrv/p;

    iget-object v2, p0, Lrv/r;->a:Ltv/c;

    iget-boolean v3, v2, Ltv/c;->x:Z

    iput-boolean v3, v1, Lsv/d;->z:Z

    iget v4, v2, Ltv/c;->z:F

    float-to-double v4, v4

    iput-wide v4, v1, Lsv/g;->G:D

    iget v4, v2, Ltv/c;->y:I

    iput v4, v1, Lsv/g;->H:I

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lsv/g;->d()V

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lsv/d;->b()V

    :goto_0
    iget-boolean v1, v2, Ltv/c;->E:Z

    iput-boolean v1, v0, Lsv/d;->z:Z

    iget v1, v2, Ltv/c;->F:I

    iput v1, v0, Lsv/b;->G:I

    iget v1, v2, Ltv/c;->G:I

    iput v1, v0, Lsv/b;->H:I

    iget-object v0, p0, Lrv/r;->g:Lcom/mapbox/geojson/Point;

    if-eqz v0, :cond_4

    filled-new-array {v0}, [Lcom/mapbox/geojson/Point;

    move-result-object v0

    invoke-virtual {p0, v0}, Lrv/r;->e([Lcom/mapbox/geojson/Point;)V

    :cond_4
    iget-wide v0, p0, Lrv/r;->i:D

    const/4 v2, 0x1

    new-array v3, v2, [D

    const/4 v4, 0x0

    aput-wide v0, v3, v4

    const/4 v0, 0x2

    invoke-static {p0, v3, v0}, Lrv/r;->d(Lrv/r;[DI)V

    iget-object v0, p0, Lrv/r;->n:Lrv/p;

    iget-object v1, p0, Lrv/r;->d:Lq30/w0;

    invoke-interface {v0, v1}, Lrv/p;->C(Lq30/w0;)V

    iget-object v0, p0, Lrv/r;->n:Lrv/p;

    invoke-interface {v0, p1}, Lrv/p;->Y(Lcom/mapbox/maps/MapboxStyleManager;)V

    iget-object p1, p0, Lrv/r;->a:Ltv/c;

    iget-object p1, p1, Ltv/c;->M:Lev/e;

    instance-of v0, p1, Lev/c;

    if-eqz v0, :cond_5

    check-cast p1, Lev/c;

    iget-object p1, p1, Lev/c;->z:Ljava/lang/String;

    goto :goto_1

    :cond_5
    instance-of v0, p1, Lev/d;

    if-eqz v0, :cond_a

    check-cast p1, Lev/d;

    iget-object p1, p1, Lev/d;->E:Ljava/lang/String;

    :goto_1
    if-eqz p1, :cond_8

    iget-object v0, p0, Lrv/r;->n:Lrv/p;

    invoke-static {p1}, Lcom/mapbox/bindgen/Value;->fromJson(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v1, "fromJson(it)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_7

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_6

    check-cast p1, Lcom/mapbox/bindgen/Value;

    invoke-interface {v0, p1}, Lrv/p;->K(Lcom/mapbox/bindgen/Value;)V

    goto :goto_2

    :cond_6
    new-instance p1, Lcom/mapbox/maps/MapboxLocationComponentException;

    const-string v0, "Error in parsing expression."

    invoke-direct {p1, v0}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Lcom/mapbox/maps/MapboxLocationComponentException;

    invoke-direct {p1, v1}, Lcom/mapbox/maps/MapboxLocationComponentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    iget-object p1, p0, Lrv/r;->g:Lcom/mapbox/geojson/Point;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lrv/r;->a:Ltv/c;

    iget-boolean p1, p1, Ltv/c;->w:Z

    if-eqz p1, :cond_9

    iput-boolean v4, p0, Lrv/r;->f:Z

    iget-object p1, p0, Lrv/r;->n:Lrv/p;

    invoke-interface {p1}, Lrv/p;->c()V

    goto :goto_3

    :cond_9
    iput-boolean v2, p0, Lrv/r;->f:Z

    iget-object p1, p0, Lrv/r;->n:Lrv/p;

    invoke-interface {p1}, Lrv/p;->f0()V

    :goto_3
    iget-object p1, p0, Lrv/r;->a:Ltv/c;

    iget-boolean p1, p1, Ltv/c;->E:Z

    if-eqz p1, :cond_b

    iget-wide v0, p0, Lrv/r;->l:D

    new-array p1, v2, [D

    aput-wide v0, p1, v4

    invoke-virtual {p0, p1}, Lrv/r;->f([D)V

    return-void

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    return-void
.end method

.method public final e([Lcom/mapbox/geojson/Point;)V
    .locals 3

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrv/r;->a:Ltv/c;

    iget-boolean v0, v0, Ltv/c;->w:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lrv/r;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lrv/r;->f:Z

    iget-object v0, p0, Lrv/r;->n:Lrv/p;

    invoke-interface {v0}, Lrv/p;->c()V

    :cond_0
    iget-object v0, p0, Lrv/r;->g:Lcom/mapbox/geojson/Point;

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    new-instance v2, Lkotlin/jvm/internal/k0;

    invoke-direct {v2, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    iget-object v0, v2, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Lcom/mapbox/geojson/Point;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mapbox/geojson/Point;

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, Lkotlin/jvm/internal/k0;

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    iget-object p1, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lcom/mapbox/geojson/Point;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, [Lcom/mapbox/geojson/Point;

    :cond_2
    array-length p1, v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/mapbox/geojson/Point;

    const-string v0, "targets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrv/r;->e:Lq/f;

    iget-object v0, v0, Lq/f;->y:Ljava/lang/Object;

    check-cast v0, Lsv/f;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lsv/d;->a([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final f([D)V
    .locals 11

    const-string v0, "radius"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    new-array v2, v0, [D

    iget-wide v3, p0, Lrv/r;->l:D

    const/4 v5, 0x0

    const/4 v6, 0x1

    add-int/2addr v5, v6

    const/4 v7, 0x0

    aput-wide v3, v2, v7

    aput-object p1, v1, v5

    move v3, v7

    move v4, v3

    :goto_0
    aget-object v5, v1, v4

    if-eqz v5, :cond_0

    check-cast v5, [D

    array-length v5, v5

    goto :goto_1

    :cond_0
    move v5, v6

    :goto_1
    add-int/2addr v3, v5

    if-eq v4, v6, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-array v3, v3, [D

    move v4, v7

    move v5, v4

    move v8, v5

    :goto_2
    aget-object v9, v1, v4

    if-eqz v9, :cond_3

    if-ge v5, v4, :cond_2

    sub-int v10, v4, v5

    invoke-static {v2, v5, v3, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v8, v10

    :cond_2
    move-object v5, v9

    check-cast v5, [D

    array-length v5, v5

    invoke-static {v9, v7, v3, v8, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v8, v5

    add-int/lit8 v5, v4, 0x1

    :cond_3
    if-eq v4, v6, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    if-ge v5, v0, :cond_5

    rsub-int/lit8 v0, v5, 0x2

    invoke-static {v2, v5, v3, v8, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    array-length v0, v3

    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object v0

    const-string v1, "targets"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lrv/r;->e:Lq/f;

    iget-object v2, v1, Lq/f;->z:Ljava/lang/Object;

    check-cast v2, Lsv/b;

    invoke-static {v0}, Lm83/n;->c1([D)[Ljava/lang/Double;

    move-result-object v0

    array-length v3, v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Lsv/d;->a([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    array-length v0, p1

    if-eqz v0, :cond_8

    array-length v0, p1

    sub-int/2addr v0, v6

    aget-wide v2, p1, v0

    iget-object p1, p0, Lrv/r;->a:Ltv/c;

    iget p1, p1, Ltv/c;->z:F

    float-to-int p1, p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_7

    iget-object p1, p0, Lrv/r;->c:Lev/i;

    iget-object v0, p1, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    iget-object p1, p1, Lev/i;->b:Ljava/lang/Object;

    check-cast p1, Lcom/mapbox/maps/MapboxMap;

    invoke-interface {p1}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v4

    invoke-virtual {v4}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v4

    invoke-interface {p1}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v6

    invoke-interface {v0, v4, v5, v6, v7}, Lmv/g;->getMetersPerPixelAtLatitude(DD)D

    move-result-wide v4

    div-double/2addr v2, v4

    iget-object p1, p0, Lrv/r;->a:Ltv/c;

    iget-object v0, v1, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lsv/g;

    iget-boolean p1, p1, Ltv/c;->x:Z

    iput-boolean p1, v0, Lsv/d;->z:Z

    if-eqz p1, :cond_6

    iput-wide v2, v0, Lsv/g;->G:D

    invoke-virtual {v0}, Lsv/g;->d()V

    return-void

    :cond_6
    invoke-virtual {v0}, Lsv/d;->b()V

    :cond_7
    return-void

    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Array is empty."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
