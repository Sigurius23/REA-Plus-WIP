.class public Lcom/google/android/material/progressindicator/CircularProgressIndicator;
.super Lfr/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lfr/d;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    const v0, 0x7f040115

    const v1, 0x7f1505d8

    invoke-direct {p0, p1, p2, v0, v1}, Lfr/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance p1, Lfr/f;

    iget-object p2, p0, Lfr/d;->w:Lfr/e;

    check-cast p2, Lfr/i;

    invoke-direct {p1, p2}, Lfr/o;-><init>(Lfr/e;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lfr/p;

    new-instance v2, Lfr/h;

    invoke-direct {v2, p2}, Lfr/h;-><init>(Lfr/i;)V

    invoke-direct {v1, v0, p2, p1, v2}, Lfr/p;-><init>(Landroid/content/Context;Lfr/e;Lfr/o;Lb3/b;)V

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v2, Lcc/p;

    invoke-direct {v2}, Lcc/p;-><init>()V

    sget-object v3, Lu4/k;->a:Ljava/lang/ThreadLocal;

    const v3, 0x7f0805fd

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lu4/b;->f(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, v2, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    iput-object v2, v1, Lfr/p;->N:Lcc/p;

    invoke-virtual {p0, v1}, Lfr/d;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lfr/k;

    invoke-direct {v1, v0, p2, p1}, Lfr/k;-><init>(Landroid/content/Context;Lfr/e;Lfr/o;)V

    invoke-virtual {p0, v1}, Lfr/d;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)Lfr/e;
    .locals 10

    new-instance v0, Lfr/i;

    const v4, 0x7f040115

    const v5, 0x7f1505d8

    invoke-direct {v0, p1, p2, v4, v5}, Lfr/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070384

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07037f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    const/4 v9, 0x0

    new-array v6, v9, [I

    invoke-static {p1, p2, v4, v5}, Lcr/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    sget-object v3, Ljq/a;->i:[I

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lcr/m;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {v1, p1, p2, v7}, Lkotlin/jvm/internal/j;->E(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    move-result v2

    iget v3, v0, Lfr/e;->a:I

    mul-int/2addr v3, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result p2

    iput p2, v0, Lfr/i;->h:I

    const/4 p2, 0x1

    invoke-static {v1, p1, p2, v8}, Lkotlin/jvm/internal/j;->E(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    move-result p2

    iput p2, v0, Lfr/i;->i:I

    invoke-virtual {p1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, v0, Lfr/i;->j:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Lfr/e;->a()V

    return-object v0
.end method

.method public getIndicatorDirection()I
    .locals 1

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    check-cast v0, Lfr/i;

    iget v0, v0, Lfr/i;->j:I

    return v0
.end method

.method public getIndicatorInset()I
    .locals 1

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    check-cast v0, Lfr/i;

    iget v0, v0, Lfr/i;->i:I

    return v0
.end method

.method public getIndicatorSize()I
    .locals 1

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    check-cast v0, Lfr/i;

    iget v0, v0, Lfr/i;->h:I

    return v0
.end method

.method public setIndicatorDirection(I)V
    .locals 1

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    check-cast v0, Lfr/i;

    iput p1, v0, Lfr/i;->j:I

    invoke-virtual {p0}, Lfr/d;->invalidate()V

    return-void
.end method

.method public setIndicatorInset(I)V
    .locals 2

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    move-object v1, v0

    check-cast v1, Lfr/i;

    iget v1, v1, Lfr/i;->i:I

    if-eq v1, p1, :cond_0

    check-cast v0, Lfr/i;

    iput p1, v0, Lfr/i;->i:I

    invoke-virtual {p0}, Lfr/d;->invalidate()V

    :cond_0
    return-void
.end method

.method public setIndicatorSize(I)V
    .locals 2

    invoke-virtual {p0}, Lfr/d;->getTrackThickness()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    move-object v1, v0

    check-cast v1, Lfr/i;

    iget v1, v1, Lfr/i;->h:I

    if-eq v1, p1, :cond_0

    move-object v1, v0

    check-cast v1, Lfr/i;

    iput p1, v1, Lfr/i;->h:I

    check-cast v0, Lfr/i;

    invoke-virtual {v0}, Lfr/e;->a()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p0}, Lfr/d;->invalidate()V

    :cond_0
    return-void
.end method

.method public setTrackThickness(I)V
    .locals 0

    invoke-super {p0, p1}, Lfr/d;->setTrackThickness(I)V

    iget-object p1, p0, Lfr/d;->w:Lfr/e;

    check-cast p1, Lfr/i;

    invoke-virtual {p1}, Lfr/e;->a()V

    return-void
.end method
