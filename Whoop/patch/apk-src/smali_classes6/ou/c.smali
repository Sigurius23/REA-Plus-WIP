.class public final Lou/c;
.super Lou/h;
.source "SourceFile"


# static fields
.field public static final y:Ljava/util/HashSet;


# instance fields
.field public v:Landroid/graphics/PointF;

.field public w:Z

.field public final x:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lou/c;->y:Ljava/util/HashSet;

    const/16 v1, 0xd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lou/h;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lou/c;->x:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lou/c;->x:Ljava/util/HashMap;

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v3, 0x5

    if-eq v0, v3, :cond_3

    const/4 v3, 0x6

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lou/c;->w:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    goto :goto_0

    :cond_3
    iput-boolean v1, p0, Lou/c;->w:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Lou/b;

    invoke-direct {v4, v0, v1}, Lou/b;-><init>(FF)V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-super {p0, p1}, Lou/h;->a(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final b(I)Z
    .locals 2

    const/16 p1, 0xd

    invoke-super {p0, p1}, Lou/e;->b(I)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lou/c;->x:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lou/b;

    iget v0, p1, Lou/b;->d:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-gez v0, :cond_0

    iget p1, p1, Lou/b;->e:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, p1, v1

    if-ltz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final c()Z
    .locals 10

    iget-object v0, p0, Lou/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lou/c;->x:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lou/b;

    iget-object v3, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v3, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    iget-object v4, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v4, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    invoke-virtual {v4, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    iget v4, v1, Lou/b;->c:F

    iput v3, v1, Lou/b;->c:F

    iget v4, v1, Lou/b;->a:F

    sub-float/2addr v4, v3

    iput v4, v1, Lou/b;->d:F

    iget v3, v1, Lou/b;->b:F

    sub-float/2addr v3, v2

    iput v3, v1, Lou/b;->e:F

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lou/h;->q:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lou/e;->n:Landroid/graphics/PointF;

    iget-object v2, p0, Lou/c;->v:Landroid/graphics/PointF;

    iget v3, v2, Landroid/graphics/PointF;->x:F

    iget v4, v0, Landroid/graphics/PointF;->x:F

    sub-float/2addr v3, v4

    iget v2, v2, Landroid/graphics/PointF;->y:F

    iget v4, v0, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v4

    iput-object v0, p0, Lou/c;->v:Landroid/graphics/PointF;

    iget-boolean v0, p0, Lou/c;->w:Z

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lou/c;->w:Z

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/e;

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, v2}, Lov/e;->a(Lou/c;FF)V

    return v1

    :cond_1
    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/e;

    invoke-virtual {v0, p0, v3, v2}, Lov/e;->a(Lou/c;FF)V

    return v1

    :cond_2
    const/16 v0, 0xd

    invoke-virtual {p0, v0}, Lou/c;->b(I)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lov/e;->a:Lou/c;

    if-eqz v2, :cond_3

    if-eq v2, p0, :cond_4

    :cond_3
    iput-object p0, v0, Lov/e;->a:Lou/c;

    :cond_4
    iget-object v0, v0, Lov/e;->b:Lov/o;

    iget-object v2, v0, Lov/o;->u0:Lpv/b;

    iget-boolean v2, v2, Lpv/b;->y:Z

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lov/o;->k()Lmv/c;

    move-result-object v0

    new-instance v2, Lcom/mapbox/maps/PlatformEventInfo;

    sget-object v3, Lcom/mapbox/maps/PlatformEventType;->DRAG_BEGIN:Lcom/mapbox/maps/PlatformEventType;

    new-instance v4, Lcom/mapbox/maps/ScreenCoordinate;

    iget-object v5, p0, Lou/e;->n:Landroid/graphics/PointF;

    iget v6, v5, Landroid/graphics/PointF;->x:F

    float-to-double v6, v6

    iget v5, v5, Landroid/graphics/PointF;->y:F

    float-to-double v8, v5

    invoke-direct {v4, v6, v7, v8, v9}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    invoke-direct {v2, v3, v4}, Lcom/mapbox/maps/PlatformEventInfo;-><init>(Lcom/mapbox/maps/PlatformEventType;Lcom/mapbox/maps/ScreenCoordinate;)V

    invoke-interface {v0, v2}, Lmv/c;->dispatch(Lcom/mapbox/maps/PlatformEventInfo;)V

    invoke-virtual {p0}, Lou/h;->h()V

    iget-object v0, p0, Lou/e;->n:Landroid/graphics/PointF;

    iput-object v0, p0, Lou/c;->v:Landroid/graphics/PointF;

    iput-boolean v1, p0, Lou/c;->w:Z

    const/4 v0, 0x1

    return v0

    :cond_6
    :goto_1
    return v1
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g()V
    .locals 0

    return-void
.end method

.method public final i()V
    .locals 9

    invoke-super {p0}, Lou/h;->i()V

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lov/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lov/e;->b:Lov/o;

    invoke-virtual {v0}, Lov/o;->k()Lmv/c;

    move-result-object v0

    new-instance v1, Lcom/mapbox/maps/PlatformEventInfo;

    sget-object v2, Lcom/mapbox/maps/PlatformEventType;->DRAG_END:Lcom/mapbox/maps/PlatformEventType;

    new-instance v3, Lcom/mapbox/maps/ScreenCoordinate;

    iget-object v4, p0, Lou/e;->n:Landroid/graphics/PointF;

    iget v5, v4, Landroid/graphics/PointF;->x:F

    float-to-double v5, v5

    iget v4, v4, Landroid/graphics/PointF;->y:F

    float-to-double v7, v4

    invoke-direct {v3, v5, v6, v7, v8}, Lcom/mapbox/maps/ScreenCoordinate;-><init>(DD)V

    invoke-direct {v1, v2, v3}, Lcom/mapbox/maps/PlatformEventInfo;-><init>(Lcom/mapbox/maps/PlatformEventType;Lcom/mapbox/maps/ScreenCoordinate;)V

    invoke-interface {v0, v1}, Lmv/c;->dispatch(Lcom/mapbox/maps/PlatformEventInfo;)V

    return-void
.end method

.method public final j()Ljava/util/HashSet;
    .locals 1

    sget-object v0, Lou/c;->y:Ljava/util/HashSet;

    return-object v0
.end method
