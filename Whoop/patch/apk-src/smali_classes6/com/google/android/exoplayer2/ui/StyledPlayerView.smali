.class public Lcom/google/android/exoplayer2/ui/StyledPlayerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic d0:I


# instance fields
.field public final E:Z

.field public final F:Landroid/widget/ImageView;

.field public final G:Lcom/google/android/exoplayer2/ui/SubtitleView;

.field public final H:Landroid/view/View;

.field public final I:Landroid/widget/TextView;

.field public final J:Ljo/s;

.field public final K:Landroid/widget/FrameLayout;

.field public final L:Landroid/widget/FrameLayout;

.field public M:Lrm/b1;

.field public N:Z

.field public O:Ljo/r;

.field public P:Z

.field public Q:Landroid/graphics/drawable/Drawable;

.field public R:I

.field public S:Z

.field public T:Ljava/lang/CharSequence;

.field public U:I

.field public V:Z

.field public W:Z

.field public a0:Z

.field public b0:I

.field public c0:Z

.field public final w:Ljo/x;

.field public final x:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

.field public final y:Landroid/view/View;

.field public final z:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v2, Ljo/x;

    invoke-direct {v2, p0}, Ljo/x;-><init>(Lcom/google/android/exoplayer2/ui/StyledPlayerView;)V

    iput-object v2, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->w:Ljo/x;

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    if-eqz v3, :cond_1

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->x:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->y:Landroid/view/View;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->z:Landroid/view/View;

    iput-boolean v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->E:Z

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->F:Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->G:Lcom/google/android/exoplayer2/ui/SubtitleView;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->H:Landroid/view/View;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->I:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->K:Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->L:Landroid/widget/FrameLayout;

    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget p1, Llo/y;->a:I

    const/16 v2, 0x17

    const v3, 0x7f0600e2

    const v4, 0x7f080404

    if-lt p1, v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v4, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, v3, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :goto_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v4, 0x7f0d017e

    invoke-virtual {v3, v4, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v3, 0x40000

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    const v3, 0x7f0a0457

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    iput-object v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->x:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v1}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->setResizeMode(I)V

    :cond_2
    const v4, 0x7f0a0479

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->y:Landroid/view/View;

    if-eqz v3, :cond_3

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    const/4 v5, -0x1

    invoke-direct {v4, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    new-instance v5, Landroid/view/SurfaceView;

    invoke-direct {v5, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->z:Landroid/view/View;

    invoke-virtual {v5, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v5, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5, v1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v3, v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_1

    :cond_3
    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->z:Landroid/view/View;

    :goto_1
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->E:Z

    const v3, 0x7f0a044f

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    iput-object v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->K:Landroid/widget/FrameLayout;

    const v3, 0x7f0a046a

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    iput-object v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->L:Landroid/widget/FrameLayout;

    const v3, 0x7f0a0450

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->F:Landroid/widget/ImageView;

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    move v3, v4

    goto :goto_2

    :cond_4
    move v3, v1

    :goto_2
    iput-boolean v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->P:Z

    const v3, 0x7f0a047c

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/ui/SubtitleView;

    iput-object v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->G:Lcom/google/android/exoplayer2/ui/SubtitleView;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/google/android/exoplayer2/ui/SubtitleView;->d()V

    invoke-virtual {v3}, Lcom/google/android/exoplayer2/ui/SubtitleView;->h()V

    :cond_5
    const v3, 0x7f0a0454

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->H:Landroid/view/View;

    const/16 v5, 0x8

    if-eqz v3, :cond_6

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    iput v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->R:I

    const v3, 0x7f0a045c

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->I:Landroid/widget/TextView;

    if-eqz v3, :cond_7

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    const v3, 0x7f0a0458

    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ljo/s;

    const v6, 0x7f0a0459

    invoke-virtual {p0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    if-eqz v5, :cond_8

    iput-object v5, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    goto :goto_3

    :cond_8
    if-eqz v6, :cond_9

    new-instance v0, Ljo/s;

    invoke-direct {v0, p1}, Ljo/s;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-virtual {v0, v3}, Landroid/view/View;->setId(I)V

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {p1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_3

    :cond_9
    iput-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    :goto_3
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    if-eqz p1, :cond_a

    const/16 v0, 0x1388

    goto :goto_4

    :cond_a
    move v0, v1

    :goto_4
    iput v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->U:I

    iput-boolean v4, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->a0:Z

    iput-boolean v4, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->V:Z

    iput-boolean v4, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->W:Z

    if-eqz p1, :cond_b

    move v1, v4

    :cond_b
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->N:Z

    if-eqz p1, :cond_e

    iget-object p1, p1, Ljo/s;->G0:Ldb/c0;

    iget v0, p1, Ldb/c0;->t:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_d

    const/4 v1, 0x2

    if-ne v0, v1, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual {p1}, Ldb/c0;->h()V

    invoke-virtual {p1, v1}, Ldb/c0;->k(I)V

    :cond_d
    :goto_5
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    iget-object p1, p1, Ljo/s;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->j()V

    return-void
.end method

.method public static a(Landroid/view/TextureView;I)V
    .locals 6

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    cmpl-float v4, v1, v3

    if-eqz v4, :cond_0

    cmpl-float v4, v2, v3

    if-eqz v4, :cond_0

    if-eqz p1, :cond_0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v5, v1, v4

    div-float v4, v2, v4

    int-to-float p1, p1

    invoke-virtual {v0, p1, v5, v4}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    invoke-virtual {v0, v3, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result p1

    div-float/2addr v1, p1

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result p1

    div-float/2addr v2, p1

    invoke-virtual {v0, v1, v2, v5, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    if-eqz v0, :cond_0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->i0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->W:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-virtual {v0}, Ljo/s;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljo/s;->getShowTimeoutMs()I

    move-result v0

    if-gtz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->e()Z

    move-result v1

    if-nez p1, :cond_2

    if-nez v0, :cond_2

    if-eqz v1, :cond_3

    :cond_2
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->f(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final d(Landroid/graphics/drawable/Drawable;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    if-lez v1, :cond_1

    if-lez v2, :cond_1

    int-to-float v1, v1

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->x:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->F:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    if-eqz v0, :cond_0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->i0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x13

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10e

    if-eq v0, v1, :cond_2

    const/16 v1, 0x16

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10f

    if-eq v0, v1, :cond_2

    const/16 v1, 0x14

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10d

    if-eq v0, v1, :cond_2

    const/16 v1, 0x15

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10c

    if-eq v0, v1, :cond_2

    const/16 v1, 0x17

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v3

    :goto_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Ljo/s;->g()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c(Z)V

    return v3

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v1, p1}, Ljo/s;->c(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_2
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c(Z)V

    return v3

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c(Z)V

    :cond_6
    return v2
.end method

.method public final e()Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->e0()I

    move-result v0

    iget-boolean v2, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->V:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    check-cast v2, Lrm/u;

    invoke-virtual {v2}, Lrm/u;->b0()Lrm/o1;

    move-result-object v2

    invoke-virtual {v2}, Lrm/o1;->p()Z

    move-result v2

    if-nez v2, :cond_2

    if-eq v0, v1, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->d0()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final f(Z)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->U:I

    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-virtual {v1, p1}, Ljo/s;->setShowTimeoutMs(I)V

    iget-object p1, v1, Ljo/s;->G0:Ldb/c0;

    iget-object v1, p1, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v1, Ljo/s;

    invoke-virtual {v1}, Ljo/s;->h()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1}, Ljo/s;->i()V

    iget-object v0, v1, Ljo/s;->E:Landroid/view/View;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_2
    invoke-virtual {p1}, Ldb/c0;->n()V

    return-void
.end method

.method public final g()Z
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-virtual {v0}, Ljo/s;->g()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c(Z)V

    return v3

    :cond_1
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->a0:Z

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljo/s;->f()V

    return v3

    :cond_2
    :goto_0
    return v1
.end method

.method public getAdOverlayInfos()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljo/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->L:Landroid/widget/FrameLayout;

    if-eqz v1, :cond_0

    new-instance v2, Ljo/a;

    invoke-direct {v2, v1}, Ljo/a;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    if-eqz v1, :cond_1

    new-instance v2, Ljo/a;

    invoke-direct {v2, v1}, Ljo/a;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v0}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v0

    return-object v0
.end method

.method public getAdViewGroup()Landroid/view/ViewGroup;
    .locals 2

    const-string v0, "exo_ad_overlay must be present for ad playback"

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->K:Landroid/widget/FrameLayout;

    invoke-static {v1, v0}, Llo/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public getControllerAutoShow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->V:Z

    return v0
.end method

.method public getControllerHideOnTouch()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->a0:Z

    return v0
.end method

.method public getControllerShowTimeoutMs()I
    .locals 1

    iget v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->U:I

    return v0
.end method

.method public getDefaultArtwork()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->Q:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getOverlayFrameLayout()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->L:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public getPlayer()Lrm/b1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    return-object v0
.end method

.method public getResizeMode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->x:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->getResizeMode()I

    move-result v0

    return v0
.end method

.method public getSubtitleView()Lcom/google/android/exoplayer2/ui/SubtitleView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->G:Lcom/google/android/exoplayer2/ui/SubtitleView;

    return-object v0
.end method

.method public getUseArtwork()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->P:Z

    return v0
.end method

.method public getUseController()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->N:Z

    return v0
.end method

.method public getVideoSurfaceView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->z:Landroid/view/View;

    return-object v0
.end method

.method public final h()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    if-eqz v0, :cond_0

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object v0, v0, Lrm/u;->I0:Lmo/r;

    goto :goto_0

    :cond_0
    sget-object v0, Lmo/r;->E:Lmo/r;

    :goto_0
    iget v1, v0, Lmo/r;->w:I

    iget v2, v0, Lmo/r;->x:I

    iget v3, v0, Lmo/r;->y:I

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    int-to-float v1, v1

    iget v0, v0, Lmo/r;->z:F

    mul-float/2addr v1, v0

    int-to-float v0, v2

    div-float/2addr v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    move v1, v4

    :goto_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->z:Landroid/view/View;

    instance-of v2, v0, Landroid/view/TextureView;

    if-eqz v2, :cond_7

    cmpl-float v2, v1, v4

    if-lez v2, :cond_4

    const/16 v2, 0x5a

    if-eq v3, v2, :cond_3

    const/16 v2, 0x10e

    if-ne v3, v2, :cond_4

    :cond_3
    const/high16 v2, 0x3f800000    # 1.0f

    div-float v1, v2, v1

    :cond_4
    iget v2, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->b0:I

    iget-object v5, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->w:Ljo/x;

    if-eqz v2, :cond_5

    invoke-virtual {v0, v5}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_5
    iput v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->b0:I

    if-eqz v3, :cond_6

    invoke-virtual {v0, v5}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_6
    check-cast v0, Landroid/view/TextureView;

    iget v2, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->b0:I

    invoke-static {v0, v2}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->a(Landroid/view/TextureView;I)V

    :cond_7
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->E:Z

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    move v4, v1

    :goto_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->x:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    if-eqz v0, :cond_9

    invoke-virtual {v0, v4}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    :cond_9
    return-void
.end method

.method public final i()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->H:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->e0()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    iget v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->R:I

    const/4 v4, 0x1

    if-eq v1, v3, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->d0()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v4, v2

    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method public final j()V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    if-eqz v1, :cond_3

    iget-boolean v2, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->N:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljo/s;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->a0:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1404ab

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1404b9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->I:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->T:Ljava/lang/CharSequence;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    if-eqz v1, :cond_1

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->B0()V

    iget-object v1, v1, Lrm/u;->K0:Lrm/v0;

    iget-object v1, v1, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    :cond_1
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method public final l(Z)V
    .locals 14

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    const/4 v1, 0x4

    const v2, 0x106000d

    iget-object v3, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->y:Landroid/view/View;

    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->F:Landroid/widget/ImageView;

    const/4 v5, 0x0

    if-eqz v0, :cond_a

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object v6, v0, Lrm/u;->K0:Lrm/v0;

    iget-object v6, v6, Lrm/v0;->i:Lio/x;

    iget-object v6, v6, Lio/x;->d:Lrm/q1;

    iget-object v6, v6, Lrm/q1;->w:Lzr/g0;

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->S:Z

    if-nez p1, :cond_1

    if-eqz v3, :cond_1

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object p1, v0, Lrm/u;->K0:Lrm/v0;

    iget-object p1, p1, Lrm/v0;->i:Lio/x;

    iget-object p1, p1, Lio/x;->d:Lrm/q1;

    iget-object p1, p1, Lrm/q1;->w:Lzr/g0;

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    if-ge v7, v8, :cond_4

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lrm/p1;

    iget-object v9, v8, Lrm/p1;->z:[Z

    array-length v10, v9

    move v11, v6

    :goto_1
    if-ge v11, v10, :cond_3

    aget-boolean v12, v9, v11

    const/4 v13, 0x1

    if-ne v12, v13, :cond_2

    iget v8, v8, Lrm/p1;->y:I

    const/4 v9, 0x2

    if-ne v8, v9, :cond_3

    move v6, v13

    goto :goto_2

    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    if-eqz v6, :cond_5

    if-eqz v4, :cond_c

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_5
    if-eqz v3, :cond_6

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->P:Z

    if-eqz p1, :cond_9

    invoke-static {v4}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object p1, v0, Lrm/u;->p0:Lrm/m0;

    iget-object p1, p1, Lrm/m0;->K:[B

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    array-length v0, p1

    invoke-static {p1, v5, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v0, v3, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->d(Landroid/graphics/drawable/Drawable;)Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_8

    goto :goto_5

    :cond_8
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->Q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->d(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_5

    :cond_9
    if-eqz v4, :cond_c

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_a
    :goto_4
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->S:Z

    if-nez p1, :cond_c

    if-eqz v4, :cond_b

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_b
    if-eqz v3, :cond_c

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_c
    :goto_5
    return-void
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->N:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c0:Z

    if-eqz p1, :cond_3

    iput-boolean v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c0:Z

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->performClick()Z

    move-result p1

    return p1

    :cond_2
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c0:Z

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c(Z)V

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final performClick()Z
    .locals 1

    invoke-super {p0}, Landroid/view/View;->performClick()Z

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->g()Z

    move-result v0

    return v0
.end method

.method public setAspectRatioListener(Ljo/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->x:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->setAspectRatioListener(Ljo/b;)V

    return-void
.end method

.method public setControllerAutoShow(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->V:Z

    return-void
.end method

.method public setControllerHideDuringAds(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->W:Z

    return-void
.end method

.method public setControllerHideOnTouch(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->a0:Z

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->j()V

    return-void
.end method

.method public setControllerOnFullScreenModeChangedListener(Ljo/m;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setOnFullScreenModeChangedListener(Ljo/m;)V

    return-void
.end method

.method public setControllerShowTimeoutMs(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    iput p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->U:I

    invoke-virtual {v0}, Ljo/s;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->e()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->f(Z)V

    :cond_0
    return-void
.end method

.method public setControllerVisibilityListener(Ljo/r;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v0, v0, Ljo/s;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->O:Ljo/r;

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->O:Ljo/r;

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public setCustomErrorMessage(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->I:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->i(Z)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->T:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->k()V

    return-void
.end method

.method public setDefaultArtwork(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->Q:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->Q:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->l(Z)V

    :cond_0
    return-void
.end method

.method public setErrorMessageProvider(Llo/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo/d;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->k()V

    :cond_0
    return-void
.end method

.method public setKeepContentOnPlayerReset(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->S:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->S:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->l(Z)V

    :cond_0
    return-void
.end method

.method public setPlayer(Lrm/b1;)V
    .locals 11

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Llo/a;->i(Z)V

    if-eqz p1, :cond_2

    move-object v0, p1

    check-cast v0, Lrm/u;

    iget-object v0, v0, Lrm/u;->T:Landroid/os/Looper;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v2

    :goto_2
    invoke-static {v0}, Llo/a;->e(Z)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    if-ne v0, p1, :cond_3

    goto/16 :goto_6

    :cond_3
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->z:Landroid/view/View;

    iget-object v4, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->w:Ljo/x;

    if-eqz v0, :cond_5

    check-cast v0, Lrm/u;

    invoke-virtual {v0, v4}, Lrm/u;->o0(Lrm/z0;)V

    instance-of v5, v1, Landroid/view/TextureView;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, Landroid/view/TextureView;

    invoke-virtual {v0}, Lrm/u;->B0()V

    iget-object v6, v0, Lrm/u;->w0:Landroid/view/TextureView;

    if-ne v5, v6, :cond_5

    invoke-virtual {v0}, Lrm/u;->S()V

    goto :goto_3

    :cond_4
    instance-of v5, v1, Landroid/view/SurfaceView;

    if-eqz v5, :cond_5

    move-object v5, v1

    check-cast v5, Landroid/view/SurfaceView;

    invoke-virtual {v0}, Lrm/u;->B0()V

    invoke-virtual {v5}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v5

    invoke-virtual {v0}, Lrm/u;->B0()V

    if-eqz v5, :cond_5

    iget-object v6, v0, Lrm/u;->t0:Landroid/view/SurfaceHolder;

    if-ne v5, v6, :cond_5

    invoke-virtual {v0}, Lrm/u;->S()V

    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->G:Lcom/google/android/exoplayer2/ui/SubtitleView;

    const/4 v5, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/ui/SubtitleView;->setCues(Ljava/util/List;)V

    :cond_6
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result v6

    iget-object v7, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    if-eqz v6, :cond_7

    invoke-virtual {v7, p1}, Ljo/s;->setPlayer(Lrm/b1;)V

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->i()V

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->k()V

    invoke-virtual {p0, v2}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->l(Z)V

    if-eqz p1, :cond_13

    move-object v6, p1

    check-cast v6, La2/a;

    const/16 v7, 0x1b

    invoke-virtual {v6, v7}, La2/a;->A(I)Z

    move-result v7

    if-eqz v7, :cond_11

    instance-of v7, v1, Landroid/view/TextureView;

    if-eqz v7, :cond_b

    check-cast v1, Landroid/view/TextureView;

    move-object v2, p1

    check-cast v2, Lrm/u;

    invoke-virtual {v2}, Lrm/u;->B0()V

    invoke-virtual {v2}, Lrm/u;->p0()V

    iput-object v1, v2, Lrm/u;->w0:Landroid/view/TextureView;

    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v7

    if-eqz v7, :cond_8

    const-string v7, "ExoPlayerImpl"

    const-string v8, "Replacing existing SurfaceTextureListener."

    invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    iget-object v7, v2, Lrm/u;->Y:Lrm/r;

    invoke-virtual {v1, v7}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    invoke-virtual {v1}, Landroid/view/TextureView;->isAvailable()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v7

    goto :goto_4

    :cond_9
    move-object v7, v5

    :goto_4
    if-nez v7, :cond_a

    invoke-virtual {v2, v5}, Lrm/u;->w0(Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v3}, Lrm/u;->l0(II)V

    goto/16 :goto_5

    :cond_a
    new-instance v5, Landroid/view/Surface;

    invoke-direct {v5, v7}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {v2, v5}, Lrm/u;->w0(Ljava/lang/Object;)V

    iput-object v5, v2, Lrm/u;->s0:Landroid/view/Surface;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v2, v5, v1}, Lrm/u;->l0(II)V

    goto/16 :goto_5

    :cond_b
    instance-of v7, v1, Landroid/view/SurfaceView;

    if-eqz v7, :cond_10

    check-cast v1, Landroid/view/SurfaceView;

    move-object v7, p1

    check-cast v7, Lrm/u;

    iget-object v8, v7, Lrm/u;->Y:Lrm/r;

    invoke-virtual {v7}, Lrm/u;->B0()V

    instance-of v9, v1, Lmo/j;

    if-eqz v9, :cond_c

    invoke-virtual {v7}, Lrm/u;->p0()V

    invoke-virtual {v7, v1}, Lrm/u;->w0(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v7, v1}, Lrm/u;->s0(Landroid/view/SurfaceHolder;)V

    goto/16 :goto_5

    :cond_c
    instance-of v9, v1, Lno/m;

    if-eqz v9, :cond_d

    invoke-virtual {v7}, Lrm/u;->p0()V

    move-object v5, v1

    check-cast v5, Lno/m;

    iput-object v5, v7, Lrm/u;->u0:Lno/m;

    iget-object v5, v7, Lrm/u;->Z:Lrm/s;

    invoke-virtual {v7, v5}, Lrm/u;->U(Lrm/c1;)Lrm/d1;

    move-result-object v5

    iget-boolean v9, v5, Lrm/d1;->g:Z

    xor-int/2addr v9, v2

    invoke-static {v9}, Llo/a;->i(Z)V

    const/16 v9, 0x2710

    iput v9, v5, Lrm/d1;->d:I

    iget-object v9, v7, Lrm/u;->u0:Lno/m;

    iget-boolean v10, v5, Lrm/d1;->g:Z

    xor-int/2addr v2, v10

    invoke-static {v2}, Llo/a;->i(Z)V

    iput-object v9, v5, Lrm/d1;->e:Ljava/lang/Object;

    invoke-virtual {v5}, Lrm/d1;->c()V

    iget-object v2, v7, Lrm/u;->u0:Lno/m;

    iget-object v2, v2, Lno/m;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v7, Lrm/u;->u0:Lno/m;

    invoke-virtual {v2}, Lno/m;->getVideoSurface()Landroid/view/Surface;

    move-result-object v2

    invoke-virtual {v7, v2}, Lrm/u;->w0(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v7, v1}, Lrm/u;->s0(Landroid/view/SurfaceHolder;)V

    goto :goto_5

    :cond_d
    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v7}, Lrm/u;->B0()V

    if-nez v1, :cond_e

    invoke-virtual {v7}, Lrm/u;->S()V

    goto :goto_5

    :cond_e
    invoke-virtual {v7}, Lrm/u;->p0()V

    iput-boolean v2, v7, Lrm/u;->v0:Z

    iput-object v1, v7, Lrm/u;->t0:Landroid/view/SurfaceHolder;

    invoke-interface {v1, v8}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {v7, v2}, Lrm/u;->w0(Ljava/lang/Object;)V

    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-virtual {v7, v2, v1}, Lrm/u;->l0(II)V

    goto :goto_5

    :cond_f
    invoke-virtual {v7, v5}, Lrm/u;->w0(Ljava/lang/Object;)V

    invoke-virtual {v7, v3, v3}, Lrm/u;->l0(II)V

    :cond_10
    :goto_5
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->h()V

    :cond_11
    if-eqz v0, :cond_12

    const/16 v1, 0x1c

    invoke-virtual {v6, v1}, La2/a;->A(I)Z

    move-result v1

    if-eqz v1, :cond_12

    move-object v1, p1

    check-cast v1, Lrm/u;

    invoke-virtual {v1}, Lrm/u;->B0()V

    iget-object v1, v1, Lrm/u;->E0:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/SubtitleView;->setCues(Ljava/util/List;)V

    :cond_12
    check-cast p1, Lrm/u;

    invoke-virtual {p1, v4}, Lrm/u;->Q(Lrm/z0;)V

    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->c(Z)V

    return-void

    :cond_13
    if-eqz v7, :cond_14

    invoke-virtual {v7}, Ljo/s;->f()V

    :cond_14
    :goto_6
    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setRepeatToggleModes(I)V

    return-void
.end method

.method public setResizeMode(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->x:Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->setResizeMode(I)V

    return-void
.end method

.method public setShowBuffering(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->R:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->R:I

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->i()V

    :cond_0
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setShowFastForwardButton(Z)V

    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setShowMultiWindowTimeBar(Z)V

    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setShowNextButton(Z)V

    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setShowPreviousButton(Z)V

    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setShowRewindButton(Z)V

    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setShowShuffleButton(Z)V

    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setShowSubtitleButton(Z)V

    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljo/s;->setShowVrButton(Z)V

    return-void
.end method

.method public setShutterBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->y:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public setUseArtwork(Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->F:Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Llo/a;->i(Z)V

    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->P:Z

    if-eq v1, p1, :cond_2

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->P:Z

    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->l(Z)V

    :cond_2
    return-void
.end method

.method public setUseController(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->J:Ljo/s;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Llo/a;->i(Z)V

    iget-boolean v1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->N:Z

    if-ne v1, p1, :cond_2

    return-void

    :cond_2
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->N:Z

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->m()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->M:Lrm/b1;

    invoke-virtual {v0, p1}, Ljo/s;->setPlayer(Lrm/b1;)V

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljo/s;->f()V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ljo/s;->setPlayer(Lrm/b1;)V

    :cond_4
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->j()V

    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->z:Landroid/view/View;

    instance-of v1, v0, Landroid/view/SurfaceView;

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
