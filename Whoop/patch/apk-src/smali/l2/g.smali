.class public final Ll2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll2/e;


# instance fields
.field public final b:Li2/w;

.field public final c:Lk2/b;

.field public final d:Landroid/graphics/RenderNode;

.field public e:J

.field public f:Landroid/graphics/Paint;

.field public g:Landroid/graphics/Matrix;

.field public h:Z

.field public i:F

.field public j:I

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:J

.field public q:J

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Lal/a;

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 4

    new-instance v0, Li2/w;

    invoke-direct {v0}, Li2/w;-><init>()V

    new-instance v1, Lk2/b;

    invoke-direct {v1}, Lk2/b;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll2/g;->b:Li2/w;

    iput-object v1, p0, Ll2/g;->c:Lk2/b;

    new-instance v0, Landroid/graphics/RenderNode;

    const-string v1, "graphicsLayer"

    invoke-direct {v0, v1}, Landroid/graphics/RenderNode;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Ll2/g;->e:J

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/RenderNode;->setClipToBounds(Z)Z

    invoke-virtual {p0, v0, v1}, Ll2/g;->Q(Landroid/graphics/RenderNode;I)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ll2/g;->i:F

    const/4 v2, 0x3

    iput v2, p0, Ll2/g;->j:I

    iput v0, p0, Ll2/g;->k:F

    iput v0, p0, Ll2/g;->l:F

    sget-wide v2, Li2/x;->b:J

    iput-wide v2, p0, Ll2/g;->p:J

    iput-wide v2, p0, Ll2/g;->q:J

    const/high16 v0, 0x41000000    # 8.0f

    iput v0, p0, Ll2/g;->u:F

    iput v1, p0, Ll2/g;->z:I

    return-void
.end method


# virtual methods
.method public final A(Ly3/c;Ly3/m;Ll2/c;La3/m1;)V
    .locals 5

    iget-object v0, p0, Ll2/g;->c:Lk2/b;

    iget-object v1, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v1}, Landroid/graphics/RenderNode;->beginRecording()Landroid/graphics/RecordingCanvas;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Ll2/g;->b:Li2/w;

    iget-object v3, v2, Li2/w;->a:Li2/c;

    iget-object v4, v3, Li2/c;->a:Landroid/graphics/Canvas;

    iput-object v1, v3, Li2/c;->a:Landroid/graphics/Canvas;

    iget-object v1, v0, Lk2/b;->x:La3/p;

    invoke-virtual {v1, p1}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v1, p2}, La3/p;->T(Ly3/m;)V

    iput-object p3, v1, La3/p;->y:Ljava/lang/Object;

    iget-wide p1, p0, Ll2/g;->e:J

    invoke-virtual {v1, p1, p2}, La3/p;->U(J)V

    invoke-virtual {v1, v3}, La3/p;->P(Li2/v;)V

    invoke-virtual {p4, v0}, La3/m1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v2, Li2/w;->a:Li2/c;

    iput-object v4, p1, Li2/c;->a:Landroid/graphics/Canvas;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {p1}, Landroid/graphics/RenderNode;->endRecording()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {p2}, Landroid/graphics/RenderNode;->endRecording()V

    throw p1
.end method

.method public final B(F)V
    .locals 1

    iput p1, p0, Ll2/g;->o:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setElevation(F)Z

    return-void
.end method

.method public final C(F)V
    .locals 1

    iput p1, p0, Ll2/g;->t:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setRotationZ(F)Z

    return-void
.end method

.method public final D(Li2/v;)V
    .locals 1

    invoke-static {p1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object p1

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawRenderNode(Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public final E(Landroid/graphics/Outline;J)V
    .locals 0

    iget-object p2, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {p2, p1}, Landroid/graphics/RenderNode;->setOutline(Landroid/graphics/Outline;)Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll2/g;->h:Z

    invoke-virtual {p0}, Ll2/g;->P()V

    return-void
.end method

.method public final F(F)V
    .locals 1

    iput p1, p0, Ll2/g;->l:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setScaleY(F)Z

    return-void
.end method

.method public final G(J)V
    .locals 4

    const-wide v0, 0x7fffffff7fffffffL

    and-long/2addr v0, p1

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object p1, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {p1}, Landroid/graphics/RenderNode;->resetPivot()Z

    return-void

    :cond_0
    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    const/16 v1, 0x20

    shr-long v1, p1, v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/RenderNode;->setPivotX(F)Z

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setPivotY(F)Z

    return-void
.end method

.method public final H(F)V
    .locals 1

    iput p1, p0, Ll2/g;->i:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setAlpha(F)Z

    return-void
.end method

.method public final I()F
    .locals 1

    iget v0, p0, Ll2/g;->n:F

    return v0
.end method

.method public final J()F
    .locals 1

    iget v0, p0, Ll2/g;->m:F

    return v0
.end method

.method public final K()F
    .locals 1

    iget v0, p0, Ll2/g;->r:F

    return v0
.end method

.method public final L(I)V
    .locals 0

    iput p1, p0, Ll2/g;->z:I

    invoke-virtual {p0}, Ll2/g;->R()V

    return-void
.end method

.method public final M(F)V
    .locals 1

    iput p1, p0, Ll2/g;->m:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setTranslationX(F)Z

    return-void
.end method

.method public final N()F
    .locals 1

    iget v0, p0, Ll2/g;->o:F

    return v0
.end method

.method public final O()F
    .locals 1

    iget v0, p0, Ll2/g;->l:F

    return v0
.end method

.method public final P()V
    .locals 4

    iget-boolean v0, p0, Ll2/g;->v:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v3, p0, Ll2/g;->h:Z

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll2/g;->h:Z

    if-eqz v0, :cond_1

    move v1, v2

    :cond_1
    iget-boolean v0, p0, Ll2/g;->w:Z

    if-eq v3, v0, :cond_2

    iput-boolean v3, p0, Ll2/g;->w:Z

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, v3}, Landroid/graphics/RenderNode;->setClipToBounds(Z)Z

    :cond_2
    iget-boolean v0, p0, Ll2/g;->x:Z

    if-eq v1, v0, :cond_3

    iput-boolean v1, p0, Ll2/g;->x:Z

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, v1}, Landroid/graphics/RenderNode;->setClipToOutline(Z)Z

    :cond_3
    return-void
.end method

.method public final Q(Landroid/graphics/RenderNode;I)V
    .locals 3

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Ll2/g;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2}, Landroid/graphics/RenderNode;->setUseCompositingLayer(ZLandroid/graphics/Paint;)Z

    invoke-virtual {p1, v0}, Landroid/graphics/RenderNode;->setHasOverlappingRendering(Z)Z

    return-void

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne p2, v1, :cond_1

    iget-object p2, p0, Ll2/g;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, p2}, Landroid/graphics/RenderNode;->setUseCompositingLayer(ZLandroid/graphics/Paint;)Z

    invoke-virtual {p1, v2}, Landroid/graphics/RenderNode;->setHasOverlappingRendering(Z)Z

    return-void

    :cond_1
    iget-object p2, p0, Ll2/g;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, p2}, Landroid/graphics/RenderNode;->setUseCompositingLayer(ZLandroid/graphics/Paint;)Z

    invoke-virtual {p1, v0}, Landroid/graphics/RenderNode;->setHasOverlappingRendering(Z)Z

    return-void
.end method

.method public final R()V
    .locals 4

    iget v0, p0, Ll2/g;->z:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Ll2/g;->j:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll2/g;->y:Lal/a;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {p0, v1, v0}, Ll2/g;->Q(Landroid/graphics/RenderNode;I)V

    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {p0, v0, v1}, Ll2/g;->Q(Landroid/graphics/RenderNode;I)V

    return-void
.end method

.method public final a()F
    .locals 1

    iget v0, p0, Ll2/g;->i:F

    return v0
.end method

.method public final b()Lal/a;
    .locals 1

    iget-object v0, p0, Ll2/g;->y:Lal/a;

    return-object v0
.end method

.method public final c(F)V
    .locals 1

    iput p1, p0, Ll2/g;->n:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setTranslationY(F)Z

    return-void
.end method

.method public final d(I)V
    .locals 1

    iput p1, p0, Ll2/g;->j:I

    iget-object v0, p0, Ll2/g;->f:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll2/g;->f:Landroid/graphics/Paint;

    :cond_0
    invoke-static {p1}, Li2/b;->d(I)Landroid/graphics/BlendMode;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setBlendMode(Landroid/graphics/BlendMode;)V

    invoke-virtual {p0}, Ll2/g;->R()V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0}, Landroid/graphics/RenderNode;->discardDisplayList()V

    return-void
.end method

.method public final f(IJI)V
    .locals 4

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    const/16 v1, 0x20

    shr-long v1, p2, v1

    long-to-int v1, v1

    add-int/2addr v1, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v2, p2

    long-to-int v2, v2

    add-int/2addr v2, p4

    invoke-virtual {v0, p1, p4, v1, v2}, Landroid/graphics/RenderNode;->setPosition(IIII)Z

    invoke-static {p2, p3}, Lv63/b;->l(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll2/g;->e:J

    return-void
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Ll2/g;->z:I

    return v0
.end method

.method public final h()Li2/y;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Ll2/g;->s:F

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0}, Landroid/graphics/RenderNode;->hasDisplayList()Z

    move-result v0

    return v0
.end method

.method public final k()F
    .locals 1

    iget v0, p0, Ll2/g;->t:F

    return v0
.end method

.method public final l()J
    .locals 2

    iget-wide v0, p0, Ll2/g;->p:J

    return-wide v0
.end method

.method public final m(Lal/a;)V
    .locals 2

    iput-object p1, p0, Ll2/g;->y:Lal/a;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, Ld2/b;->s(Landroid/graphics/RenderNode;Lal/a;)V

    :cond_0
    return-void
.end method

.method public final n()J
    .locals 2

    iget-wide v0, p0, Ll2/g;->q:J

    return-wide v0
.end method

.method public final o(J)V
    .locals 1

    iput-wide p1, p0, Ll2/g;->p:J

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setAmbientShadowColor(I)Z

    return-void
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Ll2/g;->f:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll2/g;->f:Landroid/graphics/Paint;

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Ll2/g;->R()V

    return-void
.end method

.method public final q(F)V
    .locals 1

    iput p1, p0, Ll2/g;->k:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setScaleX(F)Z

    return-void
.end method

.method public final r()F
    .locals 1

    iget v0, p0, Ll2/g;->u:F

    return v0
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, Ll2/g;->v:Z

    invoke-virtual {p0}, Ll2/g;->P()V

    return-void
.end method

.method public final t(J)V
    .locals 1

    iput-wide p1, p0, Ll2/g;->q:J

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setSpotShadowColor(I)Z

    return-void
.end method

.method public final u()Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, Ll2/g;->g:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll2/g;->g:Landroid/graphics/Matrix;

    :cond_0
    iget-object v1, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v1, v0}, Landroid/graphics/RenderNode;->getMatrix(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public final v(F)V
    .locals 1

    iput p1, p0, Ll2/g;->u:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setCameraDistance(F)Z

    return-void
.end method

.method public final w(F)V
    .locals 1

    iput p1, p0, Ll2/g;->r:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setRotationX(F)Z

    return-void
.end method

.method public final x()I
    .locals 1

    iget v0, p0, Ll2/g;->j:I

    return v0
.end method

.method public final y(F)V
    .locals 1

    iput p1, p0, Ll2/g;->s:F

    iget-object v0, p0, Ll2/g;->d:Landroid/graphics/RenderNode;

    invoke-virtual {v0, p1}, Landroid/graphics/RenderNode;->setRotationY(F)Z

    return-void
.end method

.method public final z()F
    .locals 1

    iget v0, p0, Ll2/g;->k:F

    return v0
.end method
