.class public Lcom/whoop/ui/pills/StrokedPillFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private w:Lgn2/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lvu1/j;->i0:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->a(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/content/res/TypedArray;)V
    .locals 4

    new-instance v0, Lgn2/d;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lgn2/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->w:Lgn2/d;

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcn2/a;->a(Landroid/content/Context;I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->e:I

    invoke-static {v0, v1}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->setPillColor(I)V

    if-eqz p1, :cond_4

    sget v0, Lvu1/j;->m0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget v0, Lvu1/j;->m0:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->setStrokeWidth(F)V

    :cond_0
    sget v0, Lvu1/j;->j0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lvu1/j;->j0:I

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->setPillColor(I)V

    :cond_1
    sget v0, Lvu1/j;->n0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->w:Lgn2/d;

    sget v2, Lvu1/j;->n0:I

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lgn2/d;->i(Z)V

    :cond_2
    sget v0, Lvu1/j;->l0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->w:Lgn2/d;

    sget v2, Lvu1/j;->l0:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Lgn2/d;->g(Z)V

    :cond_3
    sget v0, Lvu1/j;->k0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->w:Lgn2/d;

    sget v2, Lvu1/j;->k0:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    invoke-virtual {v0, p1}, Lgn2/d;->f(I)V

    :cond_4
    return-void
.end method


# virtual methods
.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget-object p1, p0, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->w:Lgn2/d;

    invoke-virtual {p1, p2}, Lgn2/d;->b(I)V

    return-void
.end method

.method public setPillColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->w:Lgn2/d;

    invoke-virtual {v0, p1}, Lgn2/d;->d(I)V

    return-void
.end method

.method public setPillStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->w:Lgn2/d;

    invoke-virtual {v0, p1}, Lgn2/d;->f(I)V

    invoke-super {p0}, Landroid/view/View;->refreshDrawableState()V

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillFrameLayout;->w:Lgn2/d;

    invoke-virtual {v0, p1}, Lgn2/d;->h(F)V

    return-void
.end method
