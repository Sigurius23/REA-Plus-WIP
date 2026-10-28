.class public final Lou/k;
.super Lou/h;
.source "SourceFile"


# static fields
.field public static final y:Ljava/util/HashSet;


# instance fields
.field public v:F

.field public w:F

.field public x:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lou/k;->y:Ljava/util/HashSet;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final b(I)Z
    .locals 1

    iget p1, p0, Lou/k;->x:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v0, p0, Lou/k;->w:F

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_0

    const/16 p1, 0xe

    invoke-super {p0, p1}, Lou/e;->b(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c()Z
    .locals 7

    iget-object v0, p0, Lou/a;->e:Landroid/view/MotionEvent;

    iget-object v1, p0, Lou/e;->l:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget-object v3, p0, Lou/a;->e:Landroid/view/MotionEvent;

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    add-float/2addr v3, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v3, v0

    iget-object v5, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    iget-object v6, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    add-float/2addr v1, v5

    div-float/2addr v1, v0

    sub-float/2addr v1, v3

    iget v0, p0, Lou/k;->x:F

    add-float/2addr v0, v1

    iput v0, p0, Lou/k;->x:F

    iget-boolean v0, p0, Lou/h;->q:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    cmpl-float v0, v1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    invoke-static {v0}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    const/16 v0, 0xe

    invoke-virtual {p0, v0}, Lou/k;->b(I)Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    :cond_2
    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    invoke-static {v0}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0
.end method

.method public final e()Z
    .locals 8

    invoke-super {p0}, Lou/e;->e()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    new-instance v0, Lou/g;

    iget-object v2, p0, Lou/e;->l:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-direct {v0, v4, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Lou/e;->m:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lou/d;

    iget v2, v0, Lou/d;->d:F

    float-to-double v4, v2

    iget v0, v0, Lou/d;->c:F

    float-to-double v6, v0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v4

    const-wide v6, 0x4056800000000000L    # 90.0

    sub-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    iget v0, p0, Lou/k;->v:F

    float-to-double v6, v0

    cmpg-double v0, v4, v6

    if-gtz v0, :cond_0

    return v3

    :cond_0
    return v1
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lou/k;->x:F

    return-void
.end method

.method public final i()V
    .locals 1

    invoke-super {p0}, Lou/h;->i()V

    iget-object v0, p0, Lou/a;->h:Ljava/lang/Object;

    invoke-static {v0}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0
.end method

.method public final j()Ljava/util/HashSet;
    .locals 1

    sget-object v0, Lou/k;->y:Ljava/util/HashSet;

    return-object v0
.end method
