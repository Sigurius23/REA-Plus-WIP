.class public final Ll2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll2/e;


# static fields
.field public static final B:Ll2/h;


# instance fields
.field public A:Lal/a;

.field public final b:Lm2/a;

.field public final c:Li2/w;

.field public final d:Ll2/l;

.field public final e:Landroid/content/res/Resources;

.field public final f:Landroid/graphics/Rect;

.field public g:Landroid/graphics/Paint;

.field public h:I

.field public i:I

.field public j:J

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:J

.field public w:J

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll2/h;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    sput-object v0, Ll2/i;->B:Ll2/h;

    return-void
.end method

.method public constructor <init>(Lm2/a;)V
    .locals 3

    new-instance v0, Li2/w;

    invoke-direct {v0}, Li2/w;-><init>()V

    new-instance v1, Lk2/b;

    invoke-direct {v1}, Lk2/b;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/i;->b:Lm2/a;

    iput-object v0, p0, Ll2/i;->c:Li2/w;

    new-instance v2, Ll2/l;

    invoke-direct {v2, p1, v0, v1}, Ll2/l;-><init>(Lm2/a;Li2/w;Lk2/b;)V

    iput-object v2, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Ll2/i;->e:Landroid/content/res/Resources;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll2/i;->f:Landroid/graphics/Rect;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ll2/i;->j:J

    invoke-static {}, Landroid/view/View;->generateViewId()I

    const/4 p1, 0x3

    iput p1, p0, Ll2/i;->n:I

    const/4 p1, 0x0

    iput p1, p0, Ll2/i;->o:I

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Ll2/i;->p:F

    iput p1, p0, Ll2/i;->q:F

    iput p1, p0, Ll2/i;->r:F

    sget-wide v0, Li2/x;->b:J

    iput-wide v0, p0, Ll2/i;->v:J

    iput-wide v0, p0, Ll2/i;->w:J

    return-void
.end method


# virtual methods
.method public final A(Ly3/c;Ly3/m;Ll2/c;La3/m1;)V
    .locals 5

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    iget-object v2, p0, Ll2/i;->b:Lm2/a;

    if-nez v1, :cond_0

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    iput-object p1, v0, Ll2/l;->G:Ly3/c;

    iput-object p2, v0, Ll2/l;->H:Ly3/m;

    iput-object p4, v0, Ll2/l;->I:Lkotlin/jvm/functions/Function1;

    iput-object p3, v0, Ll2/l;->J:Ll2/c;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x4

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :try_start_0
    iget-object p1, p0, Ll2/i;->c:Li2/w;

    sget-object p2, Ll2/i;->B:Ll2/h;

    iget-object p3, p1, Li2/w;->a:Li2/c;

    iget-object p4, p3, Li2/c;->a:Landroid/graphics/Canvas;

    iput-object p2, p3, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v3

    invoke-virtual {v2, p3, v0, v3, v4}, Lm2/a;->a(Li2/v;Landroid/view/View;J)V

    iget-object p1, p1, Li2/w;->a:Li2/c;

    iput-object p4, p1, Li2/c;->a:Landroid/graphics/Canvas;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public final B(F)V
    .locals 1

    iput p1, p0, Ll2/i;->u:F

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public final C(F)V
    .locals 1

    iput p1, p0, Ll2/i;->z:F

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotation(F)V

    return-void
.end method

.method public final D(Li2/v;)V
    .locals 4

    iget-boolean v0, p0, Ll2/i;->k:Z

    iget-object v1, p0, Ll2/i;->d:Ll2/l;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll2/i;->m:Z

    if-nez v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getClipToOutline()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Ll2/i;->l:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll2/i;->f:Landroid/graphics/Rect;

    const/4 v2, 0x0

    iput v2, v0, Landroid/graphics/Rect;->left:I

    iput v2, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    iput v2, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    iput v2, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    :cond_2
    invoke-static {p1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll2/i;->b:Lm2/a;

    invoke-virtual {v1}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1, v2, v3}, Lm2/a;->a(Li2/v;Landroid/view/View;J)V

    :cond_3
    return-void
.end method

.method public final E(Landroid/graphics/Outline;J)V
    .locals 2

    iget-object p2, p0, Ll2/i;->d:Ll2/l;

    iput-object p1, p2, Ll2/l;->E:Landroid/graphics/Outline;

    invoke-virtual {p2}, Landroid/view/View;->invalidateOutline()V

    iget-boolean p3, p0, Ll2/i;->m:Z

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p3, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getClipToOutline()Z

    move-result p3

    if-eqz p3, :cond_1

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p2, v1}, Landroid/view/View;->setClipToOutline(Z)V

    iget-boolean p2, p0, Ll2/i;->m:Z

    if-eqz p2, :cond_1

    iput-boolean v0, p0, Ll2/i;->m:Z

    iput-boolean v1, p0, Ll2/i;->k:Z

    :cond_1
    if-eqz p1, :cond_2

    move v0, v1

    :cond_2
    iput-boolean v0, p0, Ll2/i;->l:Z

    return-void
.end method

.method public final F(F)V
    .locals 1

    iput p1, p0, Ll2/i;->r:F

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public final G(J)V
    .locals 4

    const-wide v0, 0x7fffffff7fffffffL

    and-long/2addr v0, p1

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, v0, v2

    iget-object v1, p0, Ll2/i;->d:Ll2/l;

    if-nez v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->resetPivot()V

    return-void

    :cond_0
    const/16 v0, 0x20

    shr-long v2, p1, v0

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setPivotX(F)V

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {v1, p1}, Landroid/view/View;->setPivotY(F)V

    return-void
.end method

.method public final H(F)V
    .locals 1

    iput p1, p0, Ll2/i;->p:F

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final I()F
    .locals 1

    iget v0, p0, Ll2/i;->t:F

    return v0
.end method

.method public final J()F
    .locals 1

    iget v0, p0, Ll2/i;->s:F

    return v0
.end method

.method public final K()F
    .locals 1

    iget v0, p0, Ll2/i;->x:F

    return v0
.end method

.method public final L(I)V
    .locals 0

    iput p1, p0, Ll2/i;->o:I

    invoke-virtual {p0}, Ll2/i;->Q()V

    return-void
.end method

.method public final M(F)V
    .locals 1

    iput p1, p0, Ll2/i;->s:F

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method public final N()F
    .locals 1

    iget v0, p0, Ll2/i;->u:F

    return v0
.end method

.method public final O()F
    .locals 1

    iget v0, p0, Ll2/i;->r:F

    return v0
.end method

.method public final P(I)V
    .locals 4

    const/4 v0, 0x2

    iget-object v1, p0, Ll2/i;->d:Ll2/l;

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    iget-object p1, p0, Ll2/i;->g:Landroid/graphics/Paint;

    invoke-virtual {v1, v0, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Ll2/i;->g:Landroid/graphics/Paint;

    invoke-virtual {v1, v3, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    move v2, v3

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ll2/i;->g:Landroid/graphics/Paint;

    invoke-virtual {v1, v3, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :goto_0
    invoke-virtual {v1, v2}, Ll2/l;->setCanUseCompositingLayer$ui_graphics_release(Z)V

    return-void
.end method

.method public final Q()V
    .locals 4

    iget v0, p0, Ll2/i;->o:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Ll2/i;->n:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, v0}, Ll2/i;->P(I)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Ll2/i;->P(I)V

    return-void
.end method

.method public final a()F
    .locals 1

    iget v0, p0, Ll2/i;->p:F

    return v0
.end method

.method public final b()Lal/a;
    .locals 1

    iget-object v0, p0, Ll2/i;->A:Lal/a;

    return-object v0
.end method

.method public final c(F)V
    .locals 1

    iput p1, p0, Ll2/i;->t:F

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public final d(I)V
    .locals 2

    iput p1, p0, Ll2/i;->n:I

    iget-object v0, p0, Ll2/i;->g:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll2/i;->g:Landroid/graphics/Paint;

    :cond_0
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    invoke-static {p1}, Li2/b;->e(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {p0}, Ll2/i;->Q()V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Ll2/i;->b:Lm2/a;

    iget-object v1, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method public final f(IJI)V
    .locals 4

    iget-wide v0, p0, Ll2/i;->j:J

    invoke-static {v0, v1, p2, p3}, Ly3/l;->a(JJ)Z

    move-result v0

    iget-object v1, p0, Ll2/i;->d:Ll2/l;

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll2/i;->m:Z

    if-nez v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getClipToOutline()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ll2/i;->k:Z

    :cond_1
    const/16 v0, 0x20

    shr-long v2, p2, v0

    long-to-int v0, v2

    add-int/2addr v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v2, p2

    long-to-int v2, v2

    add-int/2addr v2, p4

    invoke-virtual {v1, p1, p4, v0, v2}, Landroid/view/View;->layout(IIII)V

    iput-wide p2, p0, Ll2/i;->j:J

    goto :goto_0

    :cond_2
    iget p2, p0, Ll2/i;->h:I

    if-eq p2, p1, :cond_3

    sub-int p2, p1, p2

    invoke-virtual {v1, p2}, Landroid/view/View;->offsetLeftAndRight(I)V

    :cond_3
    iget p2, p0, Ll2/i;->i:I

    if-eq p2, p4, :cond_4

    sub-int p2, p4, p2

    invoke-virtual {v1, p2}, Landroid/view/View;->offsetTopAndBottom(I)V

    :cond_4
    :goto_0
    iput p1, p0, Ll2/i;->h:I

    iput p4, p0, Ll2/i;->i:I

    return-void
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Ll2/i;->o:I

    return v0
.end method

.method public final h()Li2/y;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Ll2/i;->y:F

    return v0
.end method

.method public final k()F
    .locals 1

    iget v0, p0, Ll2/i;->z:F

    return v0
.end method

.method public final l()J
    .locals 2

    iget-wide v0, p0, Ll2/i;->v:J

    return-wide v0
.end method

.method public final m(Lal/a;)V
    .locals 2

    iput-object p1, p0, Ll2/i;->A:Lal/a;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-static {v0, p1}, Ld2/b;->t(Landroid/view/View;Lal/a;)V

    :cond_0
    return-void
.end method

.method public final n()J
    .locals 2

    iget-wide v0, p0, Ll2/i;->w:J

    return-wide v0
.end method

.method public final o(J)V
    .locals 1

    iput-wide p1, p0, Ll2/i;->v:J

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setOutlineAmbientShadowColor(I)V

    return-void
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Ll2/i;->g:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll2/i;->g:Landroid/graphics/Paint;

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Ll2/i;->Q()V

    return-void
.end method

.method public final q(F)V
    .locals 1

    iput p1, p0, Ll2/i;->q:F

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method

.method public final r()F
    .locals 2

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0}, Landroid/view/View;->getCameraDistance()F

    move-result v0

    iget-object v1, p0, Ll2/i;->e:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final s(Z)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Ll2/i;->l:Z

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iput-boolean v2, p0, Ll2/i;->m:Z

    iput-boolean v1, p0, Ll2/i;->k:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Ll2/i;->l:Z

    if-eqz p1, :cond_1

    move v0, v1

    :cond_1
    iget-object p1, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {p1, v0}, Landroid/view/View;->setClipToOutline(Z)V

    return-void
.end method

.method public final t(J)V
    .locals 1

    iput-wide p1, p0, Ll2/i;->w:J

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setOutlineSpotShadowColor(I)V

    return-void
.end method

.method public final u()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final v(F)V
    .locals 1

    iget-object v0, p0, Ll2/i;->e:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setCameraDistance(F)V

    return-void
.end method

.method public final w(F)V
    .locals 1

    iput p1, p0, Ll2/i;->x:F

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationX(F)V

    return-void
.end method

.method public final x()I
    .locals 1

    iget v0, p0, Ll2/i;->n:I

    return v0
.end method

.method public final y(F)V
    .locals 1

    iput p1, p0, Ll2/i;->y:F

    iget-object v0, p0, Ll2/i;->d:Ll2/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationY(F)V

    return-void
.end method

.method public final z()F
    .locals 1

    iget v0, p0, Ll2/i;->q:F

    return v0
.end method
