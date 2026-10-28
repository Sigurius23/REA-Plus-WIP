.class public final Ll2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll2/e;


# static fields
.field public static final C:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field public A:Z

.field public B:Lal/a;

.field public final b:Li2/w;

.field public final c:Lk2/b;

.field public final d:Landroid/view/RenderNode;

.field public e:J

.field public f:Landroid/graphics/Paint;

.field public g:Landroid/graphics/Matrix;

.field public h:Z

.field public i:J

.field public j:I

.field public k:I

.field public l:F

.field public m:Z

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:J

.field public t:J

.field public u:F

.field public v:F

.field public w:F

.field public x:F

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Ll2/f;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 2

    .line 44
    new-instance v0, Li2/w;

    invoke-direct {v0}, Li2/w;-><init>()V

    .line 45
    new-instance v1, Lk2/b;

    invoke-direct {v1}, Lk2/b;-><init>()V

    .line 46
    invoke-direct {p0, p1, v0, v1}, Ll2/f;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Li2/w;Lk2/b;)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Li2/w;Lk2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Ll2/f;->b:Li2/w;

    .line 3
    iput-object p3, p0, Ll2/f;->c:Lk2/b;

    .line 4
    const-string p2, "Compose"

    invoke-static {p2, p1}, Landroid/view/RenderNode;->create(Ljava/lang/String;Landroid/view/View;)Landroid/view/RenderNode;

    move-result-object p1

    iput-object p1, p0, Ll2/f;->d:Landroid/view/RenderNode;

    const-wide/16 p2, 0x0

    .line 5
    iput-wide p2, p0, Ll2/f;->e:J

    .line 6
    iput-wide p2, p0, Ll2/f;->i:J

    .line 7
    sget-object p2, Ll2/f;->C:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 8
    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setScaleX(F)Z

    .line 9
    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setScaleY(F)Z

    .line 10
    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setTranslationX(F)Z

    .line 11
    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setTranslationY(F)Z

    .line 12
    invoke-virtual {p1}, Landroid/view/RenderNode;->getElevation()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setElevation(F)Z

    .line 13
    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotation()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotation(F)Z

    .line 14
    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotationX(F)Z

    .line 15
    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotationY(F)Z

    .line 16
    invoke-virtual {p1}, Landroid/view/RenderNode;->getCameraDistance()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    .line 17
    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    .line 18
    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    .line 19
    invoke-virtual {p1}, Landroid/view/RenderNode;->getClipToOutline()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    .line 20
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    .line 21
    invoke-virtual {p1}, Landroid/view/RenderNode;->getAlpha()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setAlpha(F)Z

    .line 22
    invoke-virtual {p1}, Landroid/view/RenderNode;->isValid()Z

    .line 23
    invoke-virtual {p1, p3, p3, p3, p3}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    .line 24
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->offsetLeftAndRight(I)Z

    .line 25
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->offsetTopAndBottom(I)Z

    .line 26
    invoke-static {p1}, Ll2/k;->a(Landroid/view/RenderNode;)I

    move-result p2

    .line 27
    invoke-static {p1, p2}, Ll2/k;->c(Landroid/view/RenderNode;I)V

    .line 28
    invoke-static {p1}, Ll2/k;->b(Landroid/view/RenderNode;)I

    move-result p2

    .line 29
    invoke-static {p1, p2}, Ll2/k;->d(Landroid/view/RenderNode;I)V

    .line 30
    invoke-static {p1}, Ll2/j;->a(Landroid/view/RenderNode;)V

    .line 31
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setLayerType(I)Z

    .line 32
    invoke-virtual {p1}, Landroid/view/RenderNode;->hasOverlappingRendering()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    .line 33
    :cond_0
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    .line 34
    invoke-virtual {p0, p3}, Ll2/f;->Q(I)V

    .line 35
    iput p3, p0, Ll2/f;->j:I

    const/4 p1, 0x3

    .line 36
    iput p1, p0, Ll2/f;->k:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 37
    iput p1, p0, Ll2/f;->l:F

    .line 38
    iput p1, p0, Ll2/f;->n:F

    .line 39
    iput p1, p0, Ll2/f;->o:F

    .line 40
    sget-wide p1, Li2/x;->b:J

    .line 41
    iput-wide p1, p0, Ll2/f;->s:J

    .line 42
    iput-wide p1, p0, Ll2/f;->t:J

    const/high16 p1, 0x41000000    # 8.0f

    .line 43
    iput p1, p0, Ll2/f;->x:F

    return-void
.end method


# virtual methods
.method public final A(Ly3/c;Ly3/m;Ll2/c;La3/m1;)V
    .locals 16

    move-object/from16 v1, p0

    iget-object v0, v1, Ll2/f;->d:Landroid/view/RenderNode;

    iget-wide v2, v1, Ll2/f;->e:J

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    iget-wide v5, v1, Ll2/f;->i:J

    shr-long v3, v5, v4

    long-to-int v3, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-wide v3, v1, Ll2/f;->e:J

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    iget-wide v7, v1, Ll2/f;->i:J

    and-long v4, v7, v5

    long-to-int v4, v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/view/RenderNode;->start(II)Landroid/view/DisplayListCanvas;

    move-result-object v2

    :try_start_0
    iget-object v0, v1, Ll2/f;->b:Li2/w;

    iget-object v3, v0, Li2/w;->a:Li2/c;

    iget-object v4, v3, Li2/c;->a:Landroid/graphics/Canvas;

    move-object v5, v2

    check-cast v5, Landroid/graphics/Canvas;

    iput-object v5, v3, Li2/c;->a:Landroid/graphics/Canvas;

    iget-object v5, v1, Ll2/f;->c:Lk2/b;

    iget-wide v6, v1, Ll2/f;->e:J

    invoke-static {v6, v7}, Lv63/b;->l(J)J

    move-result-wide v6

    iget-object v8, v5, Lk2/b;->x:La3/p;

    iget-object v9, v5, Lk2/b;->x:La3/p;

    iget-object v10, v8, La3/p;->z:Ljava/lang/Object;

    check-cast v10, Lk2/b;

    iget-object v10, v10, Lk2/b;->w:Lk2/a;

    iget-object v11, v10, Lk2/a;->a:Ly3/c;

    iget-object v10, v10, Lk2/a;->b:Ly3/m;

    invoke-virtual {v8}, La3/p;->w()Li2/v;

    move-result-object v8

    invoke-virtual {v9}, La3/p;->A()J

    move-result-wide v12

    iget-object v14, v9, La3/p;->y:Ljava/lang/Object;

    check-cast v14, Ll2/c;

    move-object/from16 v15, p1

    invoke-virtual {v9, v15}, La3/p;->Q(Ly3/c;)V

    move-object/from16 v15, p2

    invoke-virtual {v9, v15}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v9, v3}, La3/p;->P(Li2/v;)V

    invoke-virtual {v9, v6, v7}, La3/p;->U(J)V

    move-object/from16 v6, p3

    iput-object v6, v9, La3/p;->y:Ljava/lang/Object;

    invoke-virtual {v3}, Li2/c;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v6, p4

    :try_start_1
    invoke-virtual {v6, v5}, La3/m1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v3}, Li2/c;->g()V

    invoke-virtual {v9, v11}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v9, v10}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v9, v8}, La3/p;->P(Li2/v;)V

    invoke-virtual {v9, v12, v13}, La3/p;->U(J)V

    iput-object v14, v9, La3/p;->y:Ljava/lang/Object;

    iget-object v0, v0, Li2/w;->a:Li2/c;

    iput-object v4, v0, Li2/c;->a:Landroid/graphics/Canvas;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, v1, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->end(Landroid/view/DisplayListCanvas;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    invoke-virtual {v3}, Li2/c;->g()V

    iget-object v3, v5, Lk2/b;->x:La3/p;

    invoke-virtual {v3, v11}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v3, v10}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v3, v8}, La3/p;->P(Li2/v;)V

    invoke-virtual {v3, v12, v13}, La3/p;->U(J)V

    iput-object v14, v3, La3/p;->y:Ljava/lang/Object;

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v3, v1, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v3, v2}, Landroid/view/RenderNode;->end(Landroid/view/DisplayListCanvas;)V

    throw v0
.end method

.method public final B(F)V
    .locals 1

    iput p1, p0, Ll2/f;->r:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setElevation(F)Z

    return-void
.end method

.method public final C(F)V
    .locals 1

    iput p1, p0, Ll2/f;->w:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotation(F)Z

    return-void
.end method

.method public final D(Li2/v;)V
    .locals 1

    invoke-static {p1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.view.DisplayListCanvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/DisplayListCanvas;

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {p1, v0}, Landroid/view/DisplayListCanvas;->drawRenderNode(Landroid/view/RenderNode;)V

    return-void
.end method

.method public final E(Landroid/graphics/Outline;J)V
    .locals 0

    iput-wide p2, p0, Ll2/f;->i:J

    iget-object p2, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {p2, p1}, Landroid/view/RenderNode;->setOutline(Landroid/graphics/Outline;)Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll2/f;->h:Z

    invoke-virtual {p0}, Ll2/f;->P()V

    return-void
.end method

.method public final F(F)V
    .locals 1

    iput p1, p0, Ll2/f;->o:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleY(F)Z

    return-void
.end method

.method public final G(J)V
    .locals 6

    const-wide v0, 0x7fffffff7fffffffL

    and-long/2addr v0, p1

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, v0, v2

    const-wide v1, 0xffffffffL

    const/16 v3, 0x20

    if-nez v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll2/f;->m:Z

    iget-object p1, p0, Ll2/f;->d:Landroid/view/RenderNode;

    iget-wide v4, p0, Ll2/f;->e:J

    shr-long v3, v4, v3

    long-to-int p2, v3

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object p1, p0, Ll2/f;->d:Landroid/view/RenderNode;

    iget-wide v3, p0, Ll2/f;->e:J

    and-long/2addr v1, v3

    long-to-int p2, v1

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Ll2/f;->m:Z

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    shr-long v3, p1, v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setPivotY(F)Z

    return-void
.end method

.method public final H(F)V
    .locals 1

    iput p1, p0, Ll2/f;->l:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setAlpha(F)Z

    return-void
.end method

.method public final I()F
    .locals 1

    iget v0, p0, Ll2/f;->q:F

    return v0
.end method

.method public final J()F
    .locals 1

    iget v0, p0, Ll2/f;->p:F

    return v0
.end method

.method public final K()F
    .locals 1

    iget v0, p0, Ll2/f;->u:F

    return v0
.end method

.method public final L(I)V
    .locals 0

    iput p1, p0, Ll2/f;->j:I

    invoke-virtual {p0}, Ll2/f;->R()V

    return-void
.end method

.method public final M(F)V
    .locals 1

    iput p1, p0, Ll2/f;->p:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationX(F)Z

    return-void
.end method

.method public final N()F
    .locals 1

    iget v0, p0, Ll2/f;->r:F

    return v0
.end method

.method public final O()F
    .locals 1

    iget v0, p0, Ll2/f;->o:F

    return v0
.end method

.method public final P()V
    .locals 4

    iget-boolean v0, p0, Ll2/f;->y:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v3, p0, Ll2/f;->h:Z

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll2/f;->h:Z

    if-eqz v0, :cond_1

    move v1, v2

    :cond_1
    iget-boolean v0, p0, Ll2/f;->z:Z

    if-eq v3, v0, :cond_2

    iput-boolean v3, p0, Ll2/f;->z:Z

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    :cond_2
    iget-boolean v0, p0, Ll2/f;->A:Z

    if-eq v1, v0, :cond_3

    iput-boolean v1, p0, Ll2/f;->A:Z

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    :cond_3
    return-void
.end method

.method public final Q(I)V
    .locals 4

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setLayerType(I)Z

    iget-object p1, p0, Ll2/f;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    return-void

    :cond_0
    const/4 v3, 0x0

    if-ne p1, v1, :cond_1

    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setLayerType(I)Z

    iget-object p1, p0, Ll2/f;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    return-void

    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setLayerType(I)Z

    iget-object p1, p0, Ll2/f;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    return-void
.end method

.method public final R()V
    .locals 4

    iget v0, p0, Ll2/f;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Ll2/f;->k:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, v0}, Ll2/f;->Q(I)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Ll2/f;->Q(I)V

    return-void
.end method

.method public final a()F
    .locals 1

    iget v0, p0, Ll2/f;->l:F

    return v0
.end method

.method public final b()Lal/a;
    .locals 1

    iget-object v0, p0, Ll2/f;->B:Lal/a;

    return-object v0
.end method

.method public final c(F)V
    .locals 1

    iput p1, p0, Ll2/f;->q:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationY(F)Z

    return-void
.end method

.method public final d(I)V
    .locals 2

    iget v0, p0, Ll2/f;->k:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Ll2/f;->k:I

    iget-object v0, p0, Ll2/f;->f:Landroid/graphics/Paint;

    if-nez v0, :cond_1

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll2/f;->f:Landroid/graphics/Paint;

    :cond_1
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    invoke-static {p1}, Li2/b;->e(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {p0}, Ll2/f;->R()V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-static {v0}, Ll2/j;->a(Landroid/view/RenderNode;)V

    return-void
.end method

.method public final f(IJI)V
    .locals 6

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    const/16 v1, 0x20

    shr-long v1, p2, v1

    long-to-int v1, v1

    add-int v2, p1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v3, p2

    long-to-int v3, v3

    add-int v4, p4, v3

    invoke-virtual {v0, p1, p4, v2, v4}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    iget-wide v4, p0, Ll2/f;->e:J

    invoke-static {v4, v5, p2, p3}, Ly3/l;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll2/f;->m:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll2/f;->d:Landroid/view/RenderNode;

    int-to-float p4, v1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p4, v0

    invoke-virtual {p1, p4}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object p1, p0, Ll2/f;->d:Landroid/view/RenderNode;

    int-to-float p4, v3

    div-float/2addr p4, v0

    invoke-virtual {p1, p4}, Landroid/view/RenderNode;->setPivotY(F)Z

    :cond_0
    iput-wide p2, p0, Ll2/f;->e:J

    :cond_1
    return-void
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Ll2/f;->j:I

    return v0
.end method

.method public final h()Li2/y;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Ll2/f;->v:F

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->isValid()Z

    move-result v0

    return v0
.end method

.method public final k()F
    .locals 1

    iget v0, p0, Ll2/f;->w:F

    return v0
.end method

.method public final l()J
    .locals 2

    iget-wide v0, p0, Ll2/f;->s:J

    return-wide v0
.end method

.method public final m(Lal/a;)V
    .locals 0

    iput-object p1, p0, Ll2/f;->B:Lal/a;

    return-void
.end method

.method public final n()J
    .locals 2

    iget-wide v0, p0, Ll2/f;->t:J

    return-wide v0
.end method

.method public final o(J)V
    .locals 1

    iput-wide p1, p0, Ll2/f;->s:J

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-static {v0, p1}, Ll2/k;->c(Landroid/view/RenderNode;I)V

    return-void
.end method

.method public final p()V
    .locals 0

    invoke-virtual {p0}, Ll2/f;->R()V

    return-void
.end method

.method public final q(F)V
    .locals 1

    iput p1, p0, Ll2/f;->n:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleX(F)Z

    return-void
.end method

.method public final r()F
    .locals 1

    iget v0, p0, Ll2/f;->x:F

    return v0
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, Ll2/f;->y:Z

    invoke-virtual {p0}, Ll2/f;->P()V

    return-void
.end method

.method public final t(J)V
    .locals 1

    iput-wide p1, p0, Ll2/f;->t:J

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-static {v0, p1}, Ll2/k;->d(Landroid/view/RenderNode;I)V

    return-void
.end method

.method public final u()Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, Ll2/f;->g:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll2/f;->g:Landroid/graphics/Matrix;

    :cond_0
    iget-object v1, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v1, v0}, Landroid/view/RenderNode;->getMatrix(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public final v(F)V
    .locals 1

    iput p1, p0, Ll2/f;->x:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    neg-float p1, p1

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    return-void
.end method

.method public final w(F)V
    .locals 1

    iput p1, p0, Ll2/f;->u:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationX(F)Z

    return-void
.end method

.method public final x()I
    .locals 1

    iget v0, p0, Ll2/f;->k:I

    return v0
.end method

.method public final y(F)V
    .locals 1

    iput p1, p0, Ll2/f;->v:F

    iget-object v0, p0, Ll2/f;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationY(F)Z

    return-void
.end method

.method public final z()F
    .locals 1

    iget v0, p0, Ll2/f;->n:F

    return v0
.end method
