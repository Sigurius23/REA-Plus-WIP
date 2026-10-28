.class public final Lfv/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfv/a;
.implements Lev/g;


# static fields
.field public static final synthetic W:[Lj93/z;


# instance fields
.field public final E:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final F:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final G:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final H:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final I:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final J:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final K:Lfv/f;

.field public final L:Lfv/f;

.field public final M:Lfv/f;

.field public final N:Lfv/f;

.field public final O:Lfv/f;

.field public final P:Lfv/f;

.field public Q:Lcom/mapbox/maps/CameraOptions$Builder;

.field public R:Lev/i;

.field public S:Lcom/mapbox/maps/MapboxMap;

.field public T:Lcom/mapbox/maps/MapboxMap;

.field public U:Lfv/n;

.field public final V:Ljava/util/List;

.field public final w:Ljava/util/HashSet;

.field public final x:Ljava/util/LinkedHashSet;

.field public y:Lfv/o;

.field public final z:Ljava/util/concurrent/CopyOnWriteArraySet;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lfv/h;

    const-string v2, "center"

    const-string v3, "getCenter()Lcom/mapbox/geojson/Point;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const-string v3, "zoom"

    const-string v5, "getZoom()Ljava/lang/Double;"

    invoke-static {v1, v3, v5, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v3

    const-string v5, "padding"

    const-string v6, "getPadding()Lcom/mapbox/maps/EdgeInsets;"

    invoke-static {v1, v5, v6, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v5

    const-string v6, "anchor"

    const-string v7, "getAnchor()Lcom/mapbox/maps/ScreenCoordinate;"

    invoke-static {v1, v6, v7, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v6

    const-string v7, "bearing"

    const-string v8, "getBearing()Ljava/lang/Double;"

    invoke-static {v1, v7, v8, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v7

    const-string v8, "pitch"

    const-string v9, "getPitch()Ljava/lang/Double;"

    invoke-static {v1, v8, v9, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v1

    const/4 v2, 0x6

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v5, v2, v0

    const/4 v0, 0x3

    aput-object v6, v2, v0

    const/4 v0, 0x4

    aput-object v7, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lfv/h;->W:[Lj93/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lfv/h;->w:Ljava/util/HashSet;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lfv/h;->x:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lfv/h;->z:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lfv/h;->E:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lfv/h;->F:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lfv/h;->G:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lfv/h;->H:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lfv/h;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lfv/h;->J:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Lfv/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lfv/f;-><init>(Lfv/h;I)V

    iput-object v0, p0, Lfv/h;->K:Lfv/f;

    new-instance v0, Lfv/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lfv/f;-><init>(Lfv/h;I)V

    iput-object v0, p0, Lfv/h;->L:Lfv/f;

    new-instance v0, Lfv/f;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lfv/f;-><init>(Lfv/h;I)V

    iput-object v0, p0, Lfv/h;->M:Lfv/f;

    new-instance v0, Lfv/f;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lfv/f;-><init>(Lfv/h;I)V

    iput-object v0, p0, Lfv/h;->N:Lfv/f;

    new-instance v0, Lfv/f;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lfv/f;-><init>(Lfv/h;I)V

    iput-object v0, p0, Lfv/h;->O:Lfv/f;

    new-instance v0, Lfv/f;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lfv/f;-><init>(Lfv/h;I)V

    iput-object v0, p0, Lfv/h;->P:Lfv/f;

    new-instance v0, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v0}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    iput-object v0, p0, Lfv/h;->Q:Lcom/mapbox/maps/CameraOptions$Builder;

    const/high16 v0, 0x3e800000    # 0.25f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lfv/h;->V:Ljava/util/List;

    return-void
.end method

.method public static m(Lgv/d;Ljava/lang/Object;Lcom/mapbox/maps/CameraOptions$Builder;)V
    .locals 2

    instance-of v0, p0, Lgv/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of p0, p1, Lcom/mapbox/geojson/Point;

    if-eqz p0, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/mapbox/geojson/Point;

    :cond_0
    invoke-virtual {p2, v1}, Lcom/mapbox/maps/CameraOptions$Builder;->center(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/CameraOptions$Builder;

    return-void

    :cond_1
    instance-of v0, p0, Lgv/i;

    if-eqz v0, :cond_3

    instance-of p0, p1, Ljava/lang/Double;

    if-eqz p0, :cond_2

    move-object v1, p1

    check-cast v1, Ljava/lang/Double;

    :cond_2
    invoke-virtual {p2, v1}, Lcom/mapbox/maps/CameraOptions$Builder;->zoom(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    return-void

    :cond_3
    instance-of v0, p0, Lgv/a;

    if-eqz v0, :cond_5

    instance-of p0, p1, Lcom/mapbox/maps/ScreenCoordinate;

    if-eqz p0, :cond_4

    move-object v1, p1

    check-cast v1, Lcom/mapbox/maps/ScreenCoordinate;

    :cond_4
    invoke-virtual {p2, v1}, Lcom/mapbox/maps/CameraOptions$Builder;->anchor(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions$Builder;

    return-void

    :cond_5
    instance-of v0, p0, Lgv/g;

    if-eqz v0, :cond_7

    instance-of p0, p1, Lcom/mapbox/maps/EdgeInsets;

    if-eqz p0, :cond_6

    move-object v1, p1

    check-cast v1, Lcom/mapbox/maps/EdgeInsets;

    :cond_6
    invoke-virtual {p2, v1}, Lcom/mapbox/maps/CameraOptions$Builder;->padding(Lcom/mapbox/maps/EdgeInsets;)Lcom/mapbox/maps/CameraOptions$Builder;

    return-void

    :cond_7
    instance-of v0, p0, Lgv/e;

    if-eqz v0, :cond_9

    instance-of p0, p1, Ljava/lang/Double;

    if-eqz p0, :cond_8

    move-object v1, p1

    check-cast v1, Ljava/lang/Double;

    :cond_8
    invoke-virtual {p2, v1}, Lcom/mapbox/maps/CameraOptions$Builder;->bearing(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    return-void

    :cond_9
    instance-of p0, p0, Lgv/h;

    if-eqz p0, :cond_b

    instance-of p0, p1, Ljava/lang/Double;

    if-eqz p0, :cond_a

    move-object v1, p1

    check-cast v1, Ljava/lang/Double;

    :cond_a
    invoke-virtual {p2, v1}, Lcom/mapbox/maps/CameraOptions$Builder;->pitch(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    :cond_b
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    const/4 v0, 0x0

    new-array v0, v0, [Lgv/d;

    iget-object v1, p0, Lfv/h;->w:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lgv/d;

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/ValueAnimator;

    const-string v2, "cameraAnimators"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v3, Leb/s;

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-direct {v3, v0, p0, v5, v4}, Leb/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    iget-object v0, p0, Lfv/h;->y:Lfv/o;

    if-eqz v0, :cond_0

    new-instance v3, Lfv/d;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lfv/d;-><init>(Lfv/o;I)V

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    :cond_0
    iget-object v0, p0, Lfv/h;->z:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lfv/h;->E:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lfv/h;->H:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lfv/h;->I:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lfv/h;->G:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lfv/h;->F:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lfv/h;->J:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lfv/h;->w:Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgv/d;

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    iget-object v3, v1, Lgv/d;->x:Ljava/lang/String;

    invoke-static {v2, v3}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v3, Lfv/c;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lfv/c;-><init>(Lgv/d;I)V

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    goto :goto_0

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lfv/h;->y:Lfv/o;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lfv/o;->a:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-static {p1, v0}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lfv/h;->y:Lfv/o;

    if-eqz p1, :cond_3

    sget-object v0, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v1, Lfv/d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lfv/d;-><init>(Lfv/o;I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    :cond_3
    return-void
.end method

.method public final d(Lcom/mapbox/geojson/Point;Lcom/mapbox/maps/EdgeInsets;DDD)V
    .locals 2

    invoke-static {p7, p8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p7

    const/4 p8, 0x4

    sget-object v0, Lfv/h;->W:[Lj93/z;

    aget-object p8, v0, p8

    iget-object v1, p0, Lfv/h;->O:Lfv/f;

    invoke-interface {v1, p0, p8, p7}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    const/4 p7, 0x0

    aget-object p7, v0, p7

    iget-object p8, p0, Lfv/h;->K:Lfv/f;

    invoke-interface {p8, p0, p7, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    const/4 p1, 0x2

    aget-object p1, v0, p1

    iget-object p7, p0, Lfv/h;->M:Lfv/f;

    invoke-interface {p7, p0, p1, p2}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    invoke-static {p5, p6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const/4 p2, 0x5

    aget-object p2, v0, p2

    iget-object p5, p0, Lfv/h;->P:Lfv/f;

    invoke-interface {p5, p0, p2, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const/4 p2, 0x1

    aget-object p2, v0, p2

    iget-object p3, p0, Lfv/h;->L:Lfv/f;

    invoke-interface {p3, p0, p2, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final e()V
    .locals 7

    iget-object v0, p0, Lfv/h;->Q:Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-virtual {p0}, Lfv/h;->i()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/CameraOptions$Builder;->anchor(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v0

    const-string v1, "cameraOptionsBuilder.anchor(anchor).build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/mapbox/maps/util/CameraOptionsUtils;->isEmpty(Lcom/mapbox/maps/CameraOptions;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getAnchor()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v1

    if-eqz v1, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getPitch()Ljava/lang/Double;

    move-result-object v1

    sget-object v2, Lfv/h;->W:[Lj93/z;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    const-wide/high16 v5, 0x404e000000000000L    # 60.0

    cmpl-double v3, v3, v5

    if-gez v3, :cond_6

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    const/4 v1, 0x5

    aget-object v1, v2, v1

    iget-object v5, p0, Lfv/h;->P:Lfv/f;

    invoke-interface {v5, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    cmpl-double v1, v3, v5

    if-nez v1, :cond_6

    :cond_2
    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getZoom()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getZoom()Ljava/lang/Double;

    move-result-object v1

    const/4 v3, 0x1

    aget-object v3, v2, v3

    iget-object v4, p0, Lfv/h;->L:Lfv/f;

    invoke-interface {v4, p0, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Double;Ljava/lang/Double;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getBearing()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getBearing()Ljava/lang/Double;

    move-result-object v1

    const/4 v3, 0x4

    aget-object v3, v2, v3

    iget-object v4, p0, Lfv/h;->O:Lfv/f;

    invoke-interface {v4, p0, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Double;Ljava/lang/Double;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v1

    const/4 v3, 0x0

    aget-object v3, v2, v3

    iget-object v4, p0, Lfv/h;->K:Lfv/f;

    invoke-interface {v4, p0, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mapbox/geojson/Point;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraOptions;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v1

    const/4 v3, 0x2

    aget-object v2, v2, v3

    iget-object v3, p0, Lfv/h;->M:Lfv/f;

    invoke-interface {v3, p0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/EdgeInsets;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_6
    :goto_0
    :try_start_0
    iget-object v1, p0, Lfv/h;->S:Lcom/mapbox/maps/MapboxMap;

    if-eqz v1, :cond_7

    invoke-interface {v1, v0}, Lmv/a;->setCamera(Lcom/mapbox/maps/CameraOptions;)V

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_7
    const-string v1, "mapCameraManagerDelegate"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception while setting camera options : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " CameraOptions = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Mbgl-CameraManager"

    invoke-static {v1, v0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    :goto_2
    new-instance v0, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v0}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    iput-object v0, p0, Lfv/h;->Q:Lcom/mapbox/maps/CameraOptions$Builder;

    return-void
.end method

.method public final f(Lev/i;)V
    .locals 1

    iput-object p1, p0, Lfv/h;->R:Lev/i;

    iget-object v0, p1, Lev/i;->b:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    iput-object v0, p0, Lfv/h;->S:Lcom/mapbox/maps/MapboxMap;

    iget-object p1, p1, Lev/i;->d:Ljava/lang/Object;

    check-cast p1, Lcom/mapbox/maps/MapboxMap;

    iput-object p1, p0, Lfv/h;->T:Lcom/mapbox/maps/MapboxMap;

    new-instance p1, Lfv/n;

    iget-object v0, p0, Lfv/h;->R:Lev/i;

    if-eqz v0, :cond_0

    invoke-direct {p1, v0}, Lfv/n;-><init>(Lev/i;)V

    iput-object p1, p0, Lfv/h;->U:Lfv/n;

    return-void

    :cond_0
    const-string p1, "mapDelegateProvider"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final h(Lcom/mapbox/maps/CameraOptions;Lfv/p;Landroid/animation/AnimatorListenerAdapter;)Lcom/mapbox/common/Cancelable;
    .locals 10

    const-string v0, "cameraOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/mapbox/maps/util/CameraOptionsUtils;->isEmpty(Lcom/mapbox/maps/CameraOptions;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Mbgl-CameraManager"

    const-string p2, "No-op easeTo camera high-level animation as CameraOptions.isEmpty == true."

    invoke-static {p1, p2}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/mapbox/maps/f;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Lcom/mapbox/maps/f;-><init>(I)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lfv/h;->U:Lfv/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    sget-object v2, Lfv/n;->e:Ljava/util/HashMap;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v0, Lfv/n;->c:Lcom/mapbox/maps/MapboxMap;

    invoke-interface {v0}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mapbox/maps/CameraOptions;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v4

    const-string v5, "targets"

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    filled-new-array {v4}, [Lcom/mapbox/geojson/Point;

    move-result-object v4

    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v7

    const-string v8, "currentCameraState.center"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lfv/i;

    array-length v9, v4

    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v8, v4, v7, v1}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v4, Lfv/j;->w:Lfv/j;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    new-instance v7, Lgv/f;

    sget-object v9, Lgv/k;->a:Lgv/j;

    invoke-direct {v7, v9, v8, v4}, Lgv/f;-><init>(Landroid/animation/TypeEvaluator;Lfv/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Lcom/mapbox/maps/CameraOptions;->getAnchor()Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v4

    if-eqz v4, :cond_2

    filled-new-array {v4}, [Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v7

    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lfv/i;

    array-length v9, v7

    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-direct {v8, v7, v4, v1}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v4, Lfv/j;->E:Lfv/j;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    new-instance v7, Lgv/a;

    invoke-direct {v7, v8, v4}, Lgv/a;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p1}, Lcom/mapbox/maps/CameraOptions;->getBearing()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_3

    filled-new-array {v4}, [Ljava/lang/Double;

    move-result-object v4

    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    new-instance v8, Lfv/i;

    array-length v9, v4

    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v8, v4, v7, v1}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v4, Lfv/j;->y:Lfv/j;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    new-instance v7, Lgv/e;

    invoke-direct {v7, v8, v4}, Lgv/e;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p1}, Lcom/mapbox/maps/CameraOptions;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v4

    if-eqz v4, :cond_4

    filled-new-array {v4}, [Lcom/mapbox/maps/EdgeInsets;

    move-result-object v4

    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v7

    const-string v8, "currentCameraState.padding"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lfv/i;

    array-length v9, v4

    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v8, v4, v7, v1}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v4, Lfv/j;->F:Lfv/j;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    new-instance v7, Lgv/g;

    invoke-direct {v7, v8, v4}, Lgv/g;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {p1}, Lcom/mapbox/maps/CameraOptions;->getPitch()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_5

    filled-new-array {v4}, [Ljava/lang/Double;

    move-result-object v4

    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getPitch()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    new-instance v8, Lfv/i;

    array-length v9, v4

    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v8, v4, v7, v1}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object v4, Lfv/j;->z:Lfv/j;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    new-instance v7, Lgv/h;

    invoke-direct {v7, v8, v4}, Lgv/h;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {p1}, Lcom/mapbox/maps/CameraOptions;->getZoom()Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_6

    filled-new-array {p1}, [Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    new-instance v4, Lfv/i;

    array-length v5, p1

    invoke-static {p1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v4, p1, v0, v1}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    sget-object p1, Lfv/j;->x:Lfv/j;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    new-instance v0, Lgv/i;

    invoke-direct {v0, v4, p1}, Lgv/i;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {v3, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/ValueAnimator;

    const-string v2, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lgv/d;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    const/4 v0, 0x0

    new-array v0, v0, [Lgv/d;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Lgv/d;

    invoke-virtual {p0, p1, p2, p3}, Lfv/h;->l([Lgv/d;Lfv/p;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;

    move-result-object p1

    return-object p1

    :cond_8
    const-string p1, "cameraAnimationsFactory"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final i()Lcom/mapbox/maps/ScreenCoordinate;
    .locals 2

    sget-object v0, Lfv/h;->W:[Lj93/z;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lfv/h;->N:Lfv/f;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/ScreenCoordinate;

    return-object v0
.end method

.method public final initialize()V
    .locals 0

    return-void
.end method

.method public final varargs j([Landroid/animation/ValueAnimator;)V
    .locals 8

    array-length v0, p1

    const-string v1, "Mbgl-CameraManager"

    if-nez v0, :cond_0

    const-string p1, "No-op playAnimatorsTogether() as no animators are passed"

    invoke-static {v1, p1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    aget-object v5, p1, v4

    instance-of v6, v5, Lgv/d;

    if-eqz v6, :cond_2

    move-object v6, v5

    check-cast v6, Lgv/d;

    const/4 v7, 0x1

    iput-boolean v7, v6, Lgv/d;->K:Z

    iget-object v7, v6, Lgv/d;->x:Ljava/lang/String;

    if-nez v7, :cond_1

    const-string v7, "Maps-CameraInternal"

    iput-object v7, v6, Lgv/d;->x:Ljava/lang/String;

    :cond_1
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const-string v5, "All animators must be CameraAnimator\'s to be played together!"

    invoke-static {v1, v5}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    new-array p1, v3, [Lgv/d;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Lgv/d;

    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/animation/ValueAnimator;

    const-string v2, "cameraAnimators"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v4, La3/z0;

    const/4 v5, 0x7

    invoke-direct {v4, v5, p1, p0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v3, v3, [Lgv/d;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lgv/d;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/Animator;

    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v0, Lav/b;

    const/16 v1, 0xf

    invoke-direct {v0, p1, v1}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v0}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-void
.end method

.method public final k(Lcom/mapbox/maps/ScreenCoordinate;)V
    .locals 2

    sget-object v0, Lfv/h;->W:[Lj93/z;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lfv/h;->N:Lfv/f;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final l([Lgv/d;Lfv/p;Landroid/animation/Animator$AnimatorListener;)Lcom/mapbox/common/Cancelable;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-object v4, v2, Lfv/p;->a:Ljava/lang/String;

    array-length v5, v0

    const-string v6, "Mbgl-CameraManager"

    if-nez v5, :cond_0

    const-string v0, "No-op camera high-level animation as CameraOptions are empty."

    invoke-static {v6, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/f;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Lcom/mapbox/maps/f;-><init>(I)V

    return-object v0

    :cond_0
    array-length v5, v0

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    const/4 v9, 0x1

    if-ge v8, v5, :cond_1

    aget-object v10, v0, v8

    iput-boolean v9, v10, Lgv/d;->K:Z

    iput-object v4, v10, Lgv/d;->x:Ljava/lang/String;

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    iget-object v5, v1, Lfv/h;->y:Lfv/o;

    if-eqz v5, :cond_2

    sget-object v8, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v10, Lfv/d;

    const/4 v11, 0x0

    invoke-direct {v10, v5, v11}, Lfv/d;-><init>(Lfv/o;I)V

    invoke-virtual {v8, v10}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    :cond_2
    array-length v5, v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Landroid/animation/ValueAnimator;

    const-string v8, "cameraAnimators"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v10, La3/z0;

    const/4 v11, 0x7

    invoke-direct {v10, v11, v5, v1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v10}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    iget-object v10, v2, Lfv/p;->b:Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    invoke-virtual {v5, v10, v11}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    iget-object v2, v2, Lfv/p;->c:Landroid/animation/TimeInterpolator;

    if-eqz v2, :cond_3

    invoke-virtual {v5, v2}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_3
    if-eqz v3, :cond_4

    new-instance v2, Lev/h;

    const/4 v10, 0x2

    invoke-direct {v2, v5, v3, v1, v10}, Lev/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v2}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    :cond_4
    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/Animator;

    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->getDuration()J

    move-result-wide v2

    const-wide/16 v10, 0x0

    cmp-long v0, v2, v10

    if-nez v0, :cond_5

    goto/16 :goto_7

    :cond_5
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->getChildAnimations()Ljava/util/ArrayList;

    move-result-object v0

    const-string v2, "animatorSet.childAnimations"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/animation/Animator;

    const-string v12, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Lgv/d;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->getChildAnimations()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-eq v0, v8, :cond_7

    goto/16 :goto_7

    :cond_7
    new-instance v8, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v8}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgv/d;

    invoke-virtual {v0}, Landroid/animation/Animator;->getDuration()J

    move-result-wide v12

    iget-object v0, v1, Lfv/h;->V:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v7, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v15, 0x0

    if-eqz v0, :cond_d

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    move-wide/from16 p1, v10

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v10

    invoke-virtual {v8, v15}, Lcom/mapbox/maps/CameraOptions$Builder;->center(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/mapbox/maps/CameraOptions$Builder;->padding(Lcom/mapbox/maps/EdgeInsets;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/mapbox/maps/CameraOptions$Builder;->anchor(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/mapbox/maps/CameraOptions$Builder;->zoom(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/mapbox/maps/CameraOptions$Builder;->bearing(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object v0

    invoke-virtual {v0, v15}, Lcom/mapbox/maps/CameraOptions$Builder;->pitch(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lgv/d;

    invoke-virtual {v3}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v16

    cmp-long v0, v16, p1

    const-string v9, "Unable to calculate animated value ahead of time for "

    if-eqz v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lgv/d;->k()Lfv/j;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": startDelay != 0 is not supported"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :cond_8
    invoke-virtual {v3}, Landroid/animation/Animator;->getDuration()J

    move-result-wide v17

    cmp-long v0, v17, v12

    if-eqz v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lgv/d;->k()Lfv/j;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": different duration is not supported"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :cond_9
    :try_start_0
    iget-object v0, v3, Lgv/d;->z:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2

    move-object/from16 v17, v2

    :try_start_1
    iget-object v2, v3, Lgv/d;->y:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v2, :cond_a

    move-wide/from16 v18, v12

    :try_start_2
    array-length v12, v0

    const/4 v13, 0x1

    if-gt v12, v13, :cond_b

    invoke-virtual {v3}, Landroid/animation/Animator;->getInterpolator()Landroid/animation/TimeInterpolator;

    move-result-object v12

    invoke-interface {v12, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v12

    iget-object v13, v3, Lgv/d;->w:Landroid/animation/TypeEvaluator;

    invoke-static {v0}, Lm83/n;->E0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v13, v12, v2, v0}, Landroid/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v0, v8}, Lfv/h;->m(Lgv/d;Ljava/lang/Object;Lcom/mapbox/maps/CameraOptions$Builder;)V

    goto :goto_6

    :catch_0
    move-exception v0

    goto :goto_5

    :cond_a
    move-wide/from16 v18, v12

    :cond_b
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v2, "getAnimatedValueAt() is only supported for single target animations with a start value."

    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_1
    move-exception v0

    :goto_4
    move-wide/from16 v18, v12

    goto :goto_5

    :catch_2
    move-exception v0

    move-object/from16 v17, v2

    goto :goto_4

    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lgv/d;->k()Lfv/j;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v17

    move-wide/from16 v12, v18

    const/16 v3, 0xa

    const/4 v9, 0x1

    goto/16 :goto_3

    :cond_c
    move-object/from16 v17, v2

    move-wide/from16 v18, v12

    invoke-virtual {v8}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object v0

    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->getDuration()J

    move-result-wide v2

    long-to-float v2, v2

    mul-float/2addr v2, v10

    float-to-long v2, v2

    new-instance v9, Lcom/mapbox/maps/CameraAnimationHintStage$Builder;

    invoke-direct {v9}, Lcom/mapbox/maps/CameraAnimationHintStage$Builder;-><init>()V

    invoke-virtual {v9, v0}, Lcom/mapbox/maps/CameraAnimationHintStage$Builder;->camera(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CameraAnimationHintStage$Builder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lcom/mapbox/maps/CameraAnimationHintStage$Builder;->progress(J)Lcom/mapbox/maps/CameraAnimationHintStage$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraAnimationHintStage$Builder;->build()Lcom/mapbox/maps/CameraAnimationHintStage;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide/from16 v10, p1

    move-object/from16 v2, v17

    const/16 v3, 0xa

    const/4 v9, 0x1

    goto/16 :goto_2

    :cond_d
    new-instance v0, Lcom/mapbox/maps/CameraAnimationHint$Builder;

    invoke-direct {v0}, Lcom/mapbox/maps/CameraAnimationHint$Builder;-><init>()V

    invoke-virtual {v0, v7}, Lcom/mapbox/maps/CameraAnimationHint$Builder;->stages(Ljava/util/List;)Lcom/mapbox/maps/CameraAnimationHint$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraAnimationHint$Builder;->build()Lcom/mapbox/maps/CameraAnimationHint;

    move-result-object v0

    iget-object v2, v1, Lfv/h;->T:Lcom/mapbox/maps/MapboxMap;

    if-eqz v2, :cond_e

    const-string v3, "cameraAnimationHint"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Lmv/h;->setCameraAnimationHint(Lcom/mapbox/maps/CameraAnimationHint;)V

    goto :goto_7

    :cond_e
    const-string v0, "mapTransformDelegate"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v15

    :cond_f
    :goto_7
    new-instance v0, Lfv/o;

    invoke-direct {v0, v4, v5}, Lfv/o;-><init>(Ljava/lang/String;Landroid/animation/AnimatorSet;)V

    iput-object v0, v1, Lfv/h;->y:Lfv/o;

    sget-object v2, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v3, Lfv/d;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lfv/d;-><init>(Lfv/o;I)V

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    return-object v0
.end method
