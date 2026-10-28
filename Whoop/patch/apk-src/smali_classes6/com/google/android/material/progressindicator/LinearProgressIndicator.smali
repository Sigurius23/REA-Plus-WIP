.class public Lcom/google/android/material/progressindicator/LinearProgressIndicator;
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
    .locals 3

    const v0, 0x7f04036a

    const v1, 0x7f1505e4

    invoke-direct {p0, p1, p2, v0, v1}, Lfr/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance p1, Lfr/q;

    iget-object p2, p0, Lfr/d;->w:Lfr/e;

    check-cast p2, Lfr/u;

    invoke-direct {p1, p2}, Lfr/o;-><init>(Lfr/e;)V

    const/high16 v0, 0x43960000    # 300.0f

    iput v0, p1, Lfr/q;->b:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lfr/p;

    iget v2, p2, Lfr/u;->h:I

    if-nez v2, :cond_0

    new-instance v2, Lfr/r;

    invoke-direct {v2, p2}, Lfr/r;-><init>(Lfr/u;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lfr/t;

    invoke-direct {v2, v0, p2}, Lfr/t;-><init>(Landroid/content/Context;Lfr/u;)V

    :goto_0
    invoke-direct {v1, v0, p2, p1, v2}, Lfr/p;-><init>(Landroid/content/Context;Lfr/e;Lfr/o;Lb3/b;)V

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
    .locals 8

    new-instance v0, Lfr/u;

    const v1, 0x7f04036a

    const v2, 0x7f1505e4

    invoke-direct {v0, p1, p2, v1, v2}, Lfr/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v1, 0x0

    new-array v7, v1, [I

    const v5, 0x7f04036a

    const v6, 0x7f1505e4

    invoke-static {p1, p2, v5, v6}, Lcr/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    sget-object v4, Ljq/a;->r:[I

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v2 .. v7}, Lcr/m;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v0, Lfr/u;->h:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v0, Lfr/u;->i:I

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iget v3, v0, Lfr/e;->a:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v0, Lfr/u;->k:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Lfr/u;->a()V

    iget p1, v0, Lfr/u;->i:I

    if-ne p1, p2, :cond_0

    move v1, p2

    :cond_0
    iput-boolean v1, v0, Lfr/u;->j:Z

    return-object v0
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    if-eqz v0, :cond_0

    check-cast v0, Lfr/u;

    iget v0, v0, Lfr/u;->h:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Lfr/d;->b(I)V

    return-void
.end method

.method public getIndeterminateAnimationType()I
    .locals 1

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    check-cast v0, Lfr/u;

    iget v0, v0, Lfr/u;->h:I

    return v0
.end method

.method public getIndicatorDirection()I
    .locals 1

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    check-cast v0, Lfr/u;

    iget v0, v0, Lfr/u;->i:I

    return v0
.end method

.method public getTrackStopIndicatorSize()I
    .locals 1

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    check-cast v0, Lfr/u;

    iget v0, v0, Lfr/u;->k:I

    return v0
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    move-object p1, p0

    iget-object p2, p1, Lfr/d;->w:Lfr/e;

    move-object p3, p2

    check-cast p3, Lfr/u;

    move-object p4, p2

    check-cast p4, Lfr/u;

    iget p4, p4, Lfr/u;->i:I

    const/4 p5, 0x1

    if-eq p4, p5, :cond_2

    sget-object p4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p4

    if-ne p4, p5, :cond_0

    move-object p4, p2

    check-cast p4, Lfr/u;

    iget p4, p4, Lfr/u;->i:I

    const/4 v0, 0x2

    if-eq p4, v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p4

    if-nez p4, :cond_1

    check-cast p2, Lfr/u;

    iget p2, p2, Lfr/u;->i:I

    const/4 p4, 0x3

    if-ne p2, p4, :cond_1

    goto :goto_0

    :cond_1
    const/4 p5, 0x0

    :cond_2
    :goto_0
    iput-boolean p5, p3, Lfr/u;->j:Z

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p4

    add-int/2addr p4, p3

    sub-int/2addr p1, p4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p4

    add-int/2addr p4, p3

    sub-int/2addr p2, p4

    invoke-virtual {p0}, Lfr/d;->getIndeterminateDrawable()Lfr/p;

    move-result-object p3

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    invoke-virtual {p0}, Lfr/d;->getProgressDrawable()Lfr/k;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_1
    return-void
.end method

.method public setIndeterminateAnimationType(I)V
    .locals 3

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    move-object v1, v0

    check-cast v1, Lfr/u;

    iget v1, v1, Lfr/u;->h:I

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lfr/d;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    move-object v1, v0

    check-cast v1, Lfr/u;

    iput p1, v1, Lfr/u;->h:I

    move-object v1, v0

    check-cast v1, Lfr/u;

    invoke-virtual {v1}, Lfr/u;->a()V

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lfr/d;->getIndeterminateDrawable()Lfr/p;

    move-result-object p1

    new-instance v1, Lfr/r;

    check-cast v0, Lfr/u;

    invoke-direct {v1, v0}, Lfr/r;-><init>(Lfr/u;)V

    iput-object v1, p1, Lfr/p;->M:Lb3/b;

    iput-object p1, v1, Lb3/b;->b:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lfr/d;->getIndeterminateDrawable()Lfr/p;

    move-result-object p1

    new-instance v1, Lfr/t;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    check-cast v0, Lfr/u;

    invoke-direct {v1, v2, v0}, Lfr/t;-><init>(Landroid/content/Context;Lfr/u;)V

    iput-object v1, p1, Lfr/p;->M:Lb3/b;

    iput-object p1, v1, Lb3/b;->b:Ljava/lang/Object;

    :goto_1
    invoke-virtual {p0}, Lfr/d;->invalidate()V

    return-void
.end method

.method public varargs setIndicatorColor([I)V
    .locals 0

    invoke-super {p0, p1}, Lfr/d;->setIndicatorColor([I)V

    iget-object p1, p0, Lfr/d;->w:Lfr/e;

    check-cast p1, Lfr/u;

    invoke-virtual {p1}, Lfr/u;->a()V

    return-void
.end method

.method public setIndicatorDirection(I)V
    .locals 4

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    move-object v1, v0

    check-cast v1, Lfr/u;

    iput p1, v1, Lfr/u;->i:I

    move-object v1, v0

    check-cast v1, Lfr/u;

    const/4 v2, 0x1

    if-eq p1, v2, :cond_2

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    if-ne v3, v2, :cond_0

    check-cast v0, Lfr/u;

    iget v0, v0, Lfr/u;->i:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :cond_2
    :goto_0
    iput-boolean v2, v1, Lfr/u;->j:Z

    invoke-virtual {p0}, Lfr/d;->invalidate()V

    return-void
.end method

.method public setTrackCornerRadius(I)V
    .locals 0

    invoke-super {p0, p1}, Lfr/d;->setTrackCornerRadius(I)V

    iget-object p1, p0, Lfr/d;->w:Lfr/e;

    check-cast p1, Lfr/u;

    invoke-virtual {p1}, Lfr/u;->a()V

    invoke-virtual {p0}, Lfr/d;->invalidate()V

    return-void
.end method

.method public setTrackStopIndicatorSize(I)V
    .locals 3

    iget-object v0, p0, Lfr/d;->w:Lfr/e;

    move-object v1, v0

    check-cast v1, Lfr/u;

    iget v1, v1, Lfr/u;->k:I

    if-eq v1, p1, :cond_0

    move-object v1, v0

    check-cast v1, Lfr/u;

    move-object v2, v0

    check-cast v2, Lfr/u;

    iget v2, v2, Lfr/e;->a:I

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, v1, Lfr/u;->k:I

    check-cast v0, Lfr/u;

    invoke-virtual {v0}, Lfr/u;->a()V

    invoke-virtual {p0}, Lfr/d;->invalidate()V

    :cond_0
    return-void
.end method
