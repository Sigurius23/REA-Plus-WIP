.class public final Lov/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lov/c;
.implements Lev/m;


# static fields
.field public static final v0:Lfv/p;


# instance fields
.field public E:Lqg3/d;

.field public F:Lcom/mapbox/maps/MapboxStyleManager;

.field public final G:Ljava/util/LinkedHashSet;

.field public H:Lcom/mapbox/maps/MapboxMap;

.field public I:Lcom/mapbox/maps/MapboxMap;

.field public J:Lcom/mapbox/maps/MapboxMap;

.field public K:Lfv/a;

.field public final L:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final M:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final N:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final O:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final P:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final Q:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final R:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final S:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public T:Lcom/mapbox/maps/ScreenCoordinate;

.field public U:Lcom/mapbox/maps/ScreenCoordinate;

.field public V:Lcom/mapbox/maps/ScreenCoordinate;

.field public W:Z

.field public X:Z

.field public Y:F

.field public Z:F

.field public a0:F

.field public b0:D

.field public c0:Z

.field public d0:F

.field public e0:D

.field public f0:D

.field public g0:Lcom/mapbox/maps/ScreenCoordinate;

.field public h0:F

.field public i0:F

.field public j0:F

.field public k0:D

.field public l0:F

.field public m0:Lcom/mapbox/maps/ScreenCoordinate;

.field public n0:[Landroid/animation/ValueAnimator;

.field public o0:[Landroid/animation/ValueAnimator;

.field public final p0:Ljava/util/ArrayList;

.field public final q0:Lh8/a;

.field public r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

.field public final s0:Landroid/os/Handler;

.field public t0:Z

.field public u0:Lpv/b;

.field public final w:Landroid/content/Context;

.field public x:F

.field public y:Lio/sentry/android/replay/video/d;

.field public z:Lov/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lfv/p;

    const-string v2, "Maps-Gestures"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Lfv/p;-><init>(Ljava/lang/String;Ljava/lang/Long;Landroid/animation/TimeInterpolator;)V

    sput-object v1, Lov/o;->v0:Lfv/p;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;F)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    iput v0, p0, Lov/o;->x:F

    .line 3
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lov/o;->G:Ljava/util/LinkedHashSet;

    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->L:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->M:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 6
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->N:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 7
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->O:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->P:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 9
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->Q:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->R:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->S:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 12
    new-instance v0, Lcom/mapbox/maps/ScreenCoordinate;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    iput-object v0, p0, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    .line 13
    iput-object v0, p0, Lov/o;->U:Lcom/mapbox/maps/ScreenCoordinate;

    .line 14
    iput-object v0, p0, Lov/o;->V:Lcom/mapbox/maps/ScreenCoordinate;

    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lov/o;->W:Z

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lov/o;->p0:Ljava/util/ArrayList;

    .line 17
    new-instance v0, Lh8/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lh8/a;-><init>(I)V

    iput-object v0, p0, Lov/o;->q0:Lh8/a;

    .line 18
    iput-object p1, p0, Lov/o;->w:Landroid/content/Context;

    .line 19
    iput p2, p0, Lov/o;->x:F

    .line 20
    sget-object p2, Lov/p;->a:[I

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, p2, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "context.obtainStyledAttr\u2026ble.mapbox_MapView, 0, 0)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    :try_start_0
    new-instance p2, Lj43/a;

    const/4 v0, 0x5

    invoke-direct {p2, p1, v0}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    .line 22
    new-instance v0, Lpv/a;

    invoke-direct {v0}, Lpv/a;-><init>()V

    invoke-virtual {p2, v0}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lpv/a;->a()Lpv/b;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 24
    iput-object p2, p0, Lov/o;->u0:Lpv/b;

    .line 25
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lov/o;->s0:Landroid/os/Handler;

    return-void

    :catchall_0
    move-exception p2

    .line 26
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;F)V
    .locals 3

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 28
    iput v0, p0, Lov/o;->x:F

    .line 29
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lov/o;->G:Ljava/util/LinkedHashSet;

    .line 30
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->L:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 31
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->M:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 32
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->N:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 33
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->O:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 34
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->P:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 35
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->Q:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 36
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->R:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 37
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lov/o;->S:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 38
    new-instance v0, Lcom/mapbox/maps/ScreenCoordinate;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    iput-object v0, p0, Lov/o;->T:Lcom/mapbox/maps/ScreenCoordinate;

    .line 39
    iput-object v0, p0, Lov/o;->U:Lcom/mapbox/maps/ScreenCoordinate;

    .line 40
    iput-object v0, p0, Lov/o;->V:Lcom/mapbox/maps/ScreenCoordinate;

    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lov/o;->W:Z

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lov/o;->p0:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Lh8/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lh8/a;-><init>(I)V

    iput-object v0, p0, Lov/o;->q0:Lh8/a;

    .line 44
    iput-object p1, p0, Lov/o;->w:Landroid/content/Context;

    .line 45
    iput p3, p0, Lov/o;->x:F

    .line 46
    sget-object p3, Lov/p;->a:[I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "context.obtainStyledAttr\u2026ble.mapbox_MapView, 0, 0)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    :try_start_0
    new-instance p2, Lj43/a;

    const/4 p3, 0x5

    invoke-direct {p2, p1, p3}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    .line 48
    new-instance p3, Lpv/a;

    invoke-direct {p3}, Lpv/a;-><init>()V

    invoke-virtual {p2, p3}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Lpv/a;->a()Lpv/b;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 50
    iput-object p2, p0, Lov/o;->u0:Lpv/b;

    .line 51
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lov/o;->s0:Landroid/os/Handler;

    return-void

    :catchall_0
    move-exception p2

    .line 52
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method


# virtual methods
.method public final a()V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lov/o;->F:Lcom/mapbox/maps/MapboxStyleManager;

    iget-object v1, p0, Lov/o;->G:Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mapbox/common/Cancelable;

    invoke-interface {v3}, Lcom/mapbox/common/Cancelable;->cancel()V

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    iget-object v1, p0, Lov/o;->L:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v1, p0, Lov/o;->s0:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lcom/mapbox/maps/Style;)V
    .locals 0

    iput-object p1, p0, Lov/o;->F:Lcom/mapbox/maps/MapboxStyleManager;

    return-void
.end method

.method public final e(Landroid/content/Context;Landroid/util/AttributeSet;F)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/sentry/android/replay/video/d;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v1, Lou/i;

    invoke-direct {v1, p1, v0}, Lou/h;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    iput-object v1, v0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    new-instance v2, Lou/o;

    invoke-direct {v2, p1, v0}, Lou/o;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    iput-object v2, v0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    new-instance v4, Lou/j;

    invoke-direct {v4, p1, v0}, Lou/h;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    iput-object v4, v0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    new-instance v5, Lou/k;

    invoke-direct {v5, p1, v0}, Lou/h;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    new-instance v6, Lou/f;

    invoke-direct {v6, p1, v0}, Lou/e;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    iput-object v6, v0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    new-instance v7, Lou/c;

    invoke-direct {v7, p1, v0}, Lou/c;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    iput-object v7, v0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    new-instance v8, Lou/n;

    invoke-direct {v8, p1, v0}, Lou/n;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    iput-object v8, v0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lou/a;

    instance-of v3, v2, Lou/e;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Lou/e;

    iget-object v4, v3, Lou/a;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070286

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    iput v4, v3, Lou/e;->j:F

    :cond_1
    instance-of v3, v2, Lou/o;

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Lou/o;

    iget-object v4, v3, Lou/a;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070282

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    iput v4, v3, Lou/o;->E:F

    :cond_2
    instance-of v3, v2, Lou/j;

    const/high16 v4, 0x41a00000    # 20.0f

    const v5, 0x7f070283

    if-eqz v3, :cond_3

    move-object v3, v2

    check-cast v3, Lou/j;

    iget-object v6, v3, Lou/a;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    iput v6, v3, Lou/j;->w:F

    iput v4, v3, Lou/j;->v:F

    :cond_3
    instance-of v3, v2, Lou/k;

    if-eqz v3, :cond_4

    move-object v3, v2

    check-cast v3, Lou/k;

    iget-object v6, v3, Lou/a;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    iput v5, v3, Lou/k;->w:F

    iput v4, v3, Lou/k;->v:F

    :cond_4
    instance-of v3, v2, Lou/f;

    if-eqz v3, :cond_5

    move-object v3, v2

    check-cast v3, Lou/f;

    iget-object v4, v3, Lou/a;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070281

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    iput v4, v3, Lou/f;->q:F

    const-wide/16 v4, 0x96

    iput-wide v4, v3, Lou/f;->p:J

    :cond_5
    instance-of v3, v2, Lou/i;

    if-eqz v3, :cond_0

    check-cast v2, Lou/i;

    const v3, 0x4174cccd    # 15.3f

    iput v3, v2, Lou/i;->v:F

    goto/16 :goto_0

    :cond_6
    iput-object v0, p0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    new-instance v1, Lqg3/d;

    invoke-direct {v1, v0}, Lqg3/d;-><init>(Lio/sentry/android/replay/video/d;)V

    iput-object v1, p0, Lov/o;->E:Lqg3/d;

    iput p3, p0, Lov/o;->x:F

    sget-object p3, Lov/p;->a:[I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "context.obtainStyledAttr\u2026ble.mapbox_MapView, 0, 0)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance p2, Lj43/a;

    const/4 p3, 0x5

    invoke-direct {p2, p1, p3}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    new-instance p3, Lpv/a;

    invoke-direct {p3}, Lpv/a;-><init>()V

    invoke-virtual {p2, p3}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Lpv/a;->a()Lpv/b;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iput-object p2, p0, Lov/o;->u0:Lpv/b;

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public final f(Lev/i;)V
    .locals 4

    new-instance v0, Lov/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lov/n;-><init>(Lov/o;I)V

    iget-object v1, p1, Lev/i;->a:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/maps/MapboxMap;

    new-instance v2, Lcom/mapbox/maps/a;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lcom/mapbox/maps/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lcom/mapbox/maps/MapboxMap;->getStyle(Lcom/mapbox/maps/Style$OnStyleLoaded;)V

    iget-object v0, p1, Lev/i;->d:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    iput-object v0, p0, Lov/o;->H:Lcom/mapbox/maps/MapboxMap;

    iget-object v0, p1, Lev/i;->b:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    iput-object v0, p0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    iget-object v0, p1, Lev/i;->g:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    const-string v1, "<set-?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lov/o;->J:Lcom/mapbox/maps/MapboxMap;

    iget-object p1, p1, Lev/i;->i:Ljava/lang/Object;

    check-cast p1, Lcom/mapbox/maps/MapController;

    const-string v0, "MAPBOX_CAMERA_PLUGIN_ID"

    invoke-interface {p1, v0}, Lmv/f;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object p1

    check-cast p1, Lfv/a;

    if-eqz p1, :cond_2

    iput-object p1, p0, Lov/o;->K:Lfv/a;

    new-instance v0, Lov/d;

    invoke-direct {v0, p0}, Lov/d;-><init>(Lov/o;)V

    check-cast p1, Lfv/h;

    iget-object p1, p1, Lfv/h;->F:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    new-instance p1, Lcom/mapbox/maps/util/CoreGesturesHandler;

    iget-object v0, p0, Lov/o;->H:Lcom/mapbox/maps/MapboxMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v2, :cond_0

    invoke-direct {p1, v0, v2}, Lcom/mapbox/maps/util/CoreGesturesHandler;-><init>(Lmv/h;Lmv/a;)V

    iput-object p1, p0, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    return-void

    :cond_0
    const-string p1, "mapCameraManagerDelegate"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "mapTransformDelegate"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance p1, Lcom/mapbox/maps/plugin/InvalidPluginConfigurationException;

    const-string v0, "Can\'t look up an instance of plugin, is it available on the clazz path and loaded through the map?"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Lov/o;->u0:Lpv/b;

    iget-boolean v1, v0, Lpv/b;->y:Z

    const/4 v2, 0x0

    const-string v3, "gesturesManager"

    if-eqz v1, :cond_1

    iget-object v1, p0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v1, Lou/c;

    iget-boolean v1, v1, Lou/h;->q:Z

    if-nez v1, :cond_9

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    iget-boolean v1, v0, Lpv/b;->x:Z

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lpv/b;->H:Z

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lpv/b;->G:Z

    if-eqz v1, :cond_3

    :cond_2
    iget-object v1, p0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v1, :cond_a

    iget-object v1, v1, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v1, Lou/o;

    iget-boolean v1, v1, Lou/h;->q:Z

    if-nez v1, :cond_9

    :cond_3
    iget-boolean v1, v0, Lpv/b;->w:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v1, :cond_4

    iget-object v1, v1, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v1, Lou/i;

    iget-boolean v1, v1, Lou/h;->q:Z

    if-nez v1, :cond_9

    goto :goto_1

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_1
    iget-boolean v0, v0, Lpv/b;->E:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v0, Lou/j;

    iget-boolean v0, v0, Lou/h;->q:Z

    if-nez v0, :cond_9

    goto :goto_2

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    :goto_2
    iget-object v0, p0, Lov/o;->K:Lfv/a;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lov/o;->L:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v0, Lfv/h;

    invoke-virtual {v0, v1}, Lfv/h;->b(Ljava/util/List;)V

    return-void

    :cond_8
    const-string v0, "cameraAnimationsPlugin"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_9
    return-void

    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final i(DDLcom/mapbox/maps/ScreenCoordinate;J)[Landroid/animation/ValueAnimator;
    .locals 5

    iget-object v0, p0, Lov/o;->K:Lfv/a;

    const/4 v1, 0x0

    const-string v2, "cameraAnimationsPlugin"

    if-eqz v0, :cond_2

    add-double/2addr p3, p1

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Double;

    move-result-object p3

    const/4 p4, 0x1

    invoke-static {p3, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    const-string v0, "targets"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    new-instance p2, Lfv/i;

    array-length v3, p3

    invoke-static {p3, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    const-string v3, "Maps-Gestures"

    invoke-direct {p2, p3, p1, v3}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    new-instance p1, Lov/l;

    const/4 p3, 0x3

    iget-object v4, p0, Lov/o;->q0:Lh8/a;

    invoke-direct {p1, v4, p6, p7, p3}, Lov/l;-><init>(Lh8/a;JI)V

    new-instance p3, Lgv/i;

    invoke-direct {p3, p2, p1}, Lgv/i;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    new-instance p1, Lov/k;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lov/k;-><init>(Lov/o;I)V

    invoke-virtual {p3, p1}, Lgv/d;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, Lov/o;->r0:Lcom/mapbox/maps/util/CoreGesturesHandler;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/mapbox/maps/util/CoreGesturesHandler;->getCoreGestureAnimatorHandler()Landroid/animation/AnimatorListenerAdapter;

    move-result-object p1

    invoke-virtual {p3, p1}, Lgv/d;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, Lov/o;->K:Lfv/a;

    if-eqz p1, :cond_0

    filled-new-array {p5}, [Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object p1

    invoke-static {p1, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfv/i;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1, p5, v3}, Lfv/i;-><init>([Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/String;)V

    new-instance p1, Lov/l;

    invoke-direct {p1, v4, p6, p7, p2}, Lov/l;-><init>(Lh8/a;JI)V

    new-instance p5, Lgv/a;

    invoke-direct {p5, v0, p1}, Lgv/a;-><init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V

    new-instance p1, Lov/k;

    invoke-direct {p1, p0, p4}, Lov/k;-><init>(Lov/o;I)V

    invoke-virtual {p5, p1}, Lgv/d;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-array p1, p2, [Landroid/animation/ValueAnimator;

    const/4 p2, 0x0

    aput-object p3, p1, p2

    aput-object p5, p1, p4

    return-object p1

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "coreGesturesHandler"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final initialize()V
    .locals 14

    iget-object v0, p0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    const/4 v1, 0x0

    const-string v2, "gesturesManager"

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v7, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v8, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v9, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-array v4, v5, [Ljava/util/Set;

    const/4 v10, 0x0

    aput-object v7, v4, v10

    aput-object v8, v4, v3

    aput-object v9, v4, v6

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    iget-object v7, v0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v4, v0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v4, Lou/i;

    const/high16 v7, 0x40400000    # 3.0f

    iput v7, v4, Lou/i;->v:F

    iget-object v4, v0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v4, Lou/j;

    const/high16 v7, 0x42340000    # 45.0f

    iput v7, v4, Lou/j;->v:F

    iput-object v0, p0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    new-instance v0, Lov/i;

    iget-object v4, p0, Lov/o;->w:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f070282

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    invoke-direct {v0, p0, v7}, Lov/i;-><init>(Lov/o;F)V

    new-instance v7, Lov/e;

    invoke-direct {v7, p0}, Lov/e;-><init>(Lov/o;)V

    iput-object v7, p0, Lov/o;->z:Lov/e;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v9, 0x7f07028c

    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    iput v7, p0, Lov/o;->Y:F

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v9, 0x7f070289

    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    iput v7, p0, Lov/o;->Z:F

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v9, 0x7f07028d

    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    iput v7, p0, Lov/o;->a0:F

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v9, 0x7f070284

    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    float-to-double v10, v7

    const-wide v12, 0x3f70624dd2f1a9fcL    # 0.004

    mul-double/2addr v10, v12

    iput-wide v10, p0, Lov/o;->b0:D

    new-instance v7, Lov/g;

    invoke-direct {v7, p0}, Lov/g;-><init>(Lov/o;)V

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f07028b

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    iput v10, p0, Lov/o;->h0:F

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f070280

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    iput v10, p0, Lov/o;->i0:F

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f07028a

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    iput v10, p0, Lov/o;->j0:F

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v9

    float-to-double v9, v9

    const-wide v11, 0x3f2cd5f99c38b04cL    # 2.2000000000000003E-4

    mul-double/2addr v9, v11

    iput-wide v9, p0, Lov/o;->k0:D

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    iput v4, p0, Lov/o;->l0:F

    new-instance v4, Lov/f;

    invoke-direct {v4, p0}, Lov/f;-><init>(Lov/o;)V

    new-instance v8, Lov/h;

    invoke-direct {v8, p0}, Lov/h;-><init>(Lov/o;)V

    new-instance v9, Lov/j;

    invoke-direct {v9, p0}, Lov/j;-><init>(Lov/o;)V

    iget-object v10, p0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    if-eqz v10, :cond_2

    iget-object v11, v10, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast v11, Lou/n;

    iput-object v0, v11, Lou/a;->h:Ljava/lang/Object;

    iget-object v0, p0, Lov/o;->z:Lov/e;

    if-eqz v0, :cond_1

    iget-object v11, v10, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v11, Lou/c;

    iput-object v0, v11, Lou/a;->h:Ljava/lang/Object;

    if-eqz v10, :cond_0

    iget-object v0, v10, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v0, Lou/o;

    iput-object v7, v0, Lou/a;->h:Ljava/lang/Object;

    iget-object v0, v10, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v0, Lou/i;

    iput-object v4, v0, Lou/a;->h:Ljava/lang/Object;

    iget-object v0, v10, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v0, Lou/j;

    iput-object v8, v0, Lou/a;->h:Ljava/lang/Object;

    iget-object v0, v10, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v0, Lou/f;

    iput-object v9, v0, Lou/a;->h:Ljava/lang/Object;

    invoke-virtual {p0}, Lov/o;->k()Lmv/c;

    move-result-object v0

    sget-object v1, Lcom/mapbox/maps/ClickInteraction;->Companion:Lcom/mapbox/maps/ClickInteraction$Companion;

    new-instance v2, Lov/n;

    invoke-direct {v2, p0, v3}, Lov/n;-><init>(Lov/o;I)V

    invoke-virtual {v1, v2}, Lcom/mapbox/maps/ClickInteraction$Companion;->map(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ClickInteraction;

    move-result-object v1

    invoke-interface {v0, v1}, Lmv/c;->addInteraction(Lcom/mapbox/maps/MapInteraction;)Lcom/mapbox/common/Cancelable;

    move-result-object v0

    iget-object v1, p0, Lov/o;->G:Ljava/util/LinkedHashSet;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lov/o;->k()Lmv/c;

    move-result-object v0

    sget-object v2, Lcom/mapbox/maps/LongClickInteraction;->Companion:Lcom/mapbox/maps/LongClickInteraction$Companion;

    new-instance v3, Lov/n;

    invoke-direct {v3, p0, v6}, Lov/n;-><init>(Lov/o;I)V

    invoke-virtual {v2, v3}, Lcom/mapbox/maps/LongClickInteraction$Companion;->map(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/LongClickInteraction;

    move-result-object v2

    invoke-interface {v0, v2}, Lmv/c;->addInteraction(Lcom/mapbox/maps/MapInteraction;)Lcom/mapbox/common/Cancelable;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lov/o;->k()Lmv/c;

    move-result-object v0

    sget-object v2, Lcom/mapbox/maps/DragInteraction;->Companion:Lcom/mapbox/maps/DragInteraction$Companion;

    new-instance v3, Lov/n;

    invoke-direct {v3, p0, v5}, Lov/n;-><init>(Lov/o;I)V

    new-instance v4, Lov/n;

    const/4 v5, 0x4

    invoke-direct {v4, p0, v5}, Lov/n;-><init>(Lov/o;I)V

    new-instance v5, Lov/n;

    const/4 v6, 0x5

    invoke-direct {v5, p0, v6}, Lov/n;-><init>(Lov/o;I)V

    invoke-virtual {v2, v3, v4, v5}, Lcom/mapbox/maps/DragInteraction$Companion;->invoke(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/DragInteraction;

    move-result-object v2

    invoke-interface {v0, v2}, Lmv/c;->addInteraction(Lcom/mapbox/maps/MapInteraction;)Lcom/mapbox/common/Cancelable;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "moveGestureListener"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final j()V
    .locals 2

    iget-boolean v0, p0, Lov/o;->t0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lov/o;->E:Lqg3/d;

    if-eqz v0, :cond_0

    sget-object v1, Lov/a;->w:Lov/a;

    invoke-virtual {v0, v1}, Lqg3/d;->A(Lov/a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lov/o;->t0:Z

    return-void

    :cond_0
    const-string v0, "gestureState"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method

.method public final k()Lmv/c;
    .locals 1

    iget-object v0, p0, Lov/o;->J:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapInteractionDelegate"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final l(ZLcom/mapbox/maps/ScreenCoordinate;)V
    .locals 9

    const-string v0, "zoomFocalPoint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lov/o;->n0:[Landroid/animation/ValueAnimator;

    invoke-virtual {p0, v0}, Lov/o;->o([Landroid/animation/ValueAnimator;)V

    iget-object v0, p0, Lov/o;->y:Lio/sentry/android/replay/video/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v0, Lou/o;

    const-string v2, "gesturesManager.standardScaleGestureDetector"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lov/o;->R:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v0, p0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lmv/a;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    int-to-double v4, p1

    const-wide/16 v7, 0x12c

    move-object v1, p0

    move-object v6, p2

    invoke-virtual/range {v1 .. v8}, Lov/o;->i(DDLcom/mapbox/maps/ScreenCoordinate;J)[Landroid/animation/ValueAnimator;

    move-result-object p1

    move-object p2, v1

    iput-object p1, p2, Lov/o;->n0:[Landroid/animation/ValueAnimator;

    invoke-virtual {p0, p1}, Lov/o;->n([Landroid/animation/ValueAnimator;)V

    return-void

    :cond_1
    move-object p2, p0

    const-string p1, "mapCameraManagerDelegate"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    move-object p2, p0

    invoke-static {v0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_3
    move-object p2, p0

    const-string p1, "gesturesManager"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final m(Lcom/mapbox/maps/ScreenCoordinate;)Z
    .locals 13

    iget-object v0, p0, Lov/o;->F:Lcom/mapbox/maps/MapboxStyleManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "name"

    invoke-virtual {v0, v2}, Lcom/mapbox/maps/MapboxStyleManager;->getStyleProjectionProperty(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v0}, Lcom/mapbox/maps/StylePropertyValue;->getKind()Lcom/mapbox/maps/StylePropertyValueKind;

    move-result-object v2

    sget-object v3, Lcom/mapbox/maps/StylePropertyValueKind;->UNDEFINED:Lcom/mapbox/maps/StylePropertyValueKind;

    const-string v4, "MERCATOR"

    if-ne v2, v3, :cond_2

    move-object v0, v4

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/mapbox/maps/StylePropertyValue;->getValue()Lcom/mapbox/bindgen/Value;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Value;->getContents()Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lov/o;->H:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lmv/h;->getSize()Lcom/mapbox/maps/Size;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/Size;->getHeight()F

    move-result v0

    float-to-double v2, v0

    const-wide v4, 0x3fa47ae147ae147bL    # 0.04

    mul-double/2addr v4, v2

    const/4 v0, 0x2

    int-to-double v2, v0

    div-double v2, v4, v2

    const-wide/high16 v6, 0x4024000000000000L    # 10.0

    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/mapbox/maps/ScreenCoordinate;->getX()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    const-wide/16 v8, 0x0

    const-string v10, "Gestures"

    if-eqz v0, :cond_4

    const-string v0, "isPointAboveHorizon: screen coordinate x is NaN."

    invoke-static {v10, v0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    move-wide v6, v8

    :cond_4
    invoke-virtual {p1}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "isPointAboveHorizon: screen coordinate y is NaN."

    invoke-static {v10, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-wide v8, v11

    :goto_2
    new-instance p1, Lcom/mapbox/maps/ScreenCoordinate;

    sub-double/2addr v8, v4

    invoke-direct {p1, v6, v7, v8, v9}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    iget-object v0, p0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    const-string v4, "mapCameraManagerDelegate"

    if-eqz v0, :cond_8

    invoke-interface {v0, p1}, Lmv/a;->coordinateForPixel(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;

    move-result-object v0

    iget-object v5, p0, Lov/o;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v5, :cond_7

    invoke-interface {v5, v0}, Lmv/a;->pixelForCoordinate(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/mapbox/maps/ScreenCoordinate;->getY()D

    move-result-wide v4

    add-double/2addr v4, v2

    cmpl-double p1, v0, v4

    if-ltz p1, :cond_6

    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_3
    const/4 p1, 0x0

    return p1

    :cond_7
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_8
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_9
    const-string p1, "mapTransformDelegate"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final n([Landroid/animation/ValueAnimator;)V
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    iget-object v3, p0, Lov/o;->p0:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iget-object v0, p0, Lov/o;->s0:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    new-instance p1, Llr/e;

    const/4 v1, 0x6

    invoke-direct {p1, p0, v1}, Llr/e;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v1, 0x96

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final o([Landroid/animation/ValueAnimator;)V
    .locals 5

    if-eqz p1, :cond_1

    iget-object v0, p0, Lov/o;->K:Lfv/a;

    if-eqz v0, :cond_0

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/animation/ValueAnimator;

    check-cast v0, Lfv/h;

    const-string v1, "cameraAnimators"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v2, Leb/s;

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-direct {v2, p1, v0, v4, v3}, Leb/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v1, v2}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    return-void

    :cond_0
    const-string p1, "cameraAnimationsPlugin"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public final onSizeChanged(II)V
    .locals 3

    new-instance v0, Lcom/mapbox/maps/ScreenCoordinate;

    div-int/lit8 p1, p1, 0x2

    int-to-double v1, p1

    div-int/lit8 p2, p2, 0x2

    int-to-double p1, p2

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    iput-object v0, p0, Lov/o;->U:Lcom/mapbox/maps/ScreenCoordinate;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lov/o;->W:Z

    return-void
.end method
