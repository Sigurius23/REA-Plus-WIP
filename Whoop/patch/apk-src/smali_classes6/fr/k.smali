.class public final Lfr/k;
.super Lfr/m;
.source "SourceFile"


# static fields
.field public static final Q:Lfr/j;


# instance fields
.field public final L:Lfr/o;

.field public final M:Lg6/g;

.field public final N:Lg6/f;

.field public final O:Lfr/n;

.field public P:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfr/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfr/k;->Q:Lfr/j;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lfr/e;Lfr/o;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lfr/m;-><init>(Landroid/content/Context;Lfr/e;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lfr/k;->P:Z

    iput-object p3, p0, Lfr/k;->L:Lfr/o;

    new-instance p2, Lfr/n;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lfr/k;->O:Lfr/n;

    new-instance p2, Lg6/g;

    invoke-direct {p2}, Lg6/g;-><init>()V

    iput-object p2, p0, Lfr/k;->M:Lg6/g;

    const/high16 p3, 0x3f800000    # 1.0f

    float-to-double v0, p3

    iput-wide v0, p2, Lg6/g;->b:D

    iput-boolean p1, p2, Lg6/g;->c:Z

    const/high16 p1, 0x42480000    # 50.0f

    invoke-virtual {p2, p1}, Lg6/g;->a(F)V

    new-instance p1, Lg6/f;

    invoke-direct {p1, p0}, Lg6/f;-><init>(Lfr/k;)V

    iput-object p1, p0, Lfr/k;->N:Lg6/f;

    iput-object p2, p1, Lg6/f;->m:Lg6/g;

    iget p1, p0, Lfr/m;->H:F

    cmpl-float p1, p1, p3

    if-eqz p1, :cond_0

    iput p3, p0, Lfr/m;->H:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final d(ZZZ)Z
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lfr/m;->d(ZZZ)Z

    move-result p1

    iget-object p2, p0, Lfr/m;->y:Lfr/a;

    iget-object p3, p0, Lfr/m;->w:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "animator_duration_scale"

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p3, p2, v0}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result p2

    const/4 p3, 0x0

    cmpl-float p3, p2, p3

    if-nez p3, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Lfr/k;->P:Z

    return p1

    :cond_0
    const/4 p3, 0x0

    iput-boolean p3, p0, Lfr/k;->P:Z

    const/high16 p3, 0x42480000    # 50.0f

    div-float/2addr p3, p2

    iget-object p2, p0, Lfr/k;->M:Lg6/g;

    invoke-virtual {p2, p3}, Lg6/g;->a(F)V

    return p1
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 11

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p0}, Lfr/m;->b()F

    move-result v3

    iget-object v0, p0, Lfr/m;->z:Landroid/animation/ObjectAnimator;

    const/4 v6, 0x1

    const/4 v8, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v4, v6

    goto :goto_1

    :cond_2
    :goto_0
    move v4, v8

    :goto_1
    iget-object v0, p0, Lfr/m;->E:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    move v5, v6

    goto :goto_3

    :cond_4
    :goto_2
    move v5, v8

    :goto_3
    iget-object v0, p0, Lfr/k;->L:Lfr/o;

    iget-object v7, v0, Lfr/o;->a:Lfr/e;

    invoke-virtual {v7}, Lfr/e;->a()V

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lfr/o;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    iget-object v2, p0, Lfr/m;->I:Landroid/graphics/Paint;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v9, p0, Lfr/m;->x:Lfr/e;

    iget-object v0, v9, Lfr/e;->c:[I

    aget v0, v0, v8

    iget-object v10, p0, Lfr/k;->O:Lfr/n;

    iput v0, v10, Lfr/n;->c:I

    iget v0, v9, Lfr/e;->g:I

    if-lez v0, :cond_6

    iget-object v1, p0, Lfr/k;->L:Lfr/o;

    instance-of v1, v1, Lfr/q;

    if-eqz v1, :cond_5

    :goto_4
    move v7, v0

    goto :goto_5

    :cond_5
    int-to-float v0, v0

    iget v1, v10, Lfr/n;->b:F

    const/4 v3, 0x0

    const v4, 0x3c23d70a    # 0.01f

    invoke-static {v1, v3, v4}, Lrj/j;->q(FFF)F

    move-result v1

    mul-float/2addr v1, v0

    div-float/2addr v1, v4

    float-to-int v0, v1

    goto :goto_4

    :goto_5
    iget v3, v10, Lfr/n;->b:F

    iget v5, v9, Lfr/e;->d:I

    iget v6, p0, Lfr/m;->J:I

    iget-object v0, p0, Lfr/k;->L:Lfr/o;

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lfr/o;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    goto :goto_6

    :cond_6
    iget v5, v9, Lfr/e;->d:I

    iget v6, p0, Lfr/m;->J:I

    const/4 v7, 0x0

    iget-object v0, p0, Lfr/k;->L:Lfr/o;

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lfr/o;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    :goto_6
    iget-object v0, p0, Lfr/k;->L:Lfr/o;

    iget v3, p0, Lfr/m;->J:I

    invoke-virtual {v0, p1, v2, v10, v3}, Lfr/o;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lfr/n;I)V

    iget-object v0, v9, Lfr/e;->c:[I

    aget v0, v0, v8

    iget v3, p0, Lfr/m;->J:I

    iget-object v4, p0, Lfr/k;->L:Lfr/o;

    invoke-virtual {v4, p1, v2, v0, v3}, Lfr/o;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_7
    :goto_7
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Lfr/k;->L:Lfr/o;

    invoke-virtual {v0}, Lfr/o;->e()I

    move-result v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Lfr/k;->L:Lfr/o;

    invoke-virtual {v0}, Lfr/o;->f()I

    move-result v0

    return v0
.end method

.method public final jumpToCurrentState()V
    .locals 2

    iget-object v0, p0, Lfr/k;->N:Lg6/f;

    invoke-virtual {v0}, Lg6/f;->c()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x461c4000    # 10000.0f

    div-float/2addr v0, v1

    iget-object v1, p0, Lfr/k;->O:Lfr/n;

    iput v0, v1, Lfr/n;->b:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final onLevelChange(I)Z
    .locals 5

    iget-boolean v0, p0, Lfr/k;->P:Z

    const/4 v1, 0x1

    iget-object v2, p0, Lfr/k;->O:Lfr/n;

    const v3, 0x461c4000    # 10000.0f

    iget-object v4, p0, Lfr/k;->N:Lg6/f;

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lg6/f;->c()V

    int-to-float p1, p1

    div-float/2addr p1, v3

    iput p1, v2, Lfr/n;->b:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    goto :goto_0

    :cond_0
    iget v0, v2, Lfr/n;->b:F

    mul-float/2addr v0, v3

    iput v0, v4, Lg6/f;->b:F

    iput-boolean v1, v4, Lg6/f;->c:Z

    int-to-float p1, p1

    invoke-virtual {v4, p1}, Lg6/f;->a(F)V

    :goto_0
    return v1
.end method
