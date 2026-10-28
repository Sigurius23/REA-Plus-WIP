.class public abstract Lmr/k;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final L:Lmr/j;


# instance fields
.field public final E:F

.field public final F:I

.field public final G:I

.field public H:Landroid/content/res/ColorStateList;

.field public I:Landroid/graphics/PorterDuff$Mode;

.field public J:Landroid/graphics/Rect;

.field public K:Z

.field public w:Lmr/l;

.field public final x:Lkr/k;

.field public y:I

.field public final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmr/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmr/j;-><init>(I)V

    sput-object v0, Lmr/k;->L:Lmr/j;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, v0}, Lqr/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v1, Ljq/a;->J:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p0, v2}, Lh5/h0;->k(Landroid/view/View;F)V

    :cond_0
    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lmr/k;->y:I

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-nez v2, :cond_1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    invoke-static {p1, p2, v0, v0}, Lkr/k;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Lkr/j;

    move-result-object p2

    invoke-virtual {p2}, Lkr/j;->a()Lkr/k;

    move-result-object p2

    iput-object p2, p0, Lmr/k;->x:Lkr/k;

    :cond_2
    const/4 p2, 0x3

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lmr/k;->z:F

    const/4 p2, 0x4

    invoke-static {v1, p1, p2}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lmr/k;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    const/4 p1, 0x5

    const/4 p2, -0x1

    invoke-virtual {v1, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v3}, Lcr/m;->h(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-virtual {p0, p1}, Lmr/k;->setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    const/4 p1, 0x1

    invoke-virtual {v1, p1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Lmr/k;->E:F

    invoke-virtual {v1, v0, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p0, Lmr/k;->F:I

    const/4 v2, 0x7

    invoke-virtual {v1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lmr/k;->G:I

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    sget-object p2, Lmr/k;->L:Lmr/j;

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_5

    invoke-virtual {p0}, Lmr/k;->getBackgroundOverlayColorAlpha()F

    move-result p1

    const p2, 0x7f040168

    invoke-static {p0, p2}, Lrj/o;->u(Landroid/view/View;I)I

    move-result p2

    const v1, 0x7f040151

    invoke-static {p0, v1}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v1

    invoke-static {p1, p2, v1}, Lrj/o;->x(FII)I

    move-result p1

    iget-object p2, p0, Lmr/k;->x:Lkr/k;

    if-eqz p2, :cond_3

    sget-object v0, Lmr/l;->x:Lh8/a;

    new-instance v0, Lkr/g;

    invoke-direct {v0, p2}, Lkr/g;-><init>(Lkr/k;)V

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkr/g;->m(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget-object v1, Lmr/l;->x:Lh8/a;

    const v1, 0x7f07039a

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v1, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    move-object v0, v1

    :goto_0
    iget-object p1, p0, Lmr/k;->H:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_4

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_4
    sget-object p1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p0, v0}, Lmr/k;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_5
    return-void
.end method

.method public static synthetic a(Lmr/k;Lmr/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lmr/k;->setBaseTransientBottomBar(Lmr/l;)V

    return-void
.end method

.method private setBaseTransientBottomBar(Lmr/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmr/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lmr/k;->w:Lmr/l;

    return-void
.end method


# virtual methods
.method public getActionTextColorAlpha()F
    .locals 1

    iget v0, p0, Lmr/k;->E:F

    return v0
.end method

.method public getAnimationMode()I
    .locals 1

    iget v0, p0, Lmr/k;->y:I

    return v0
.end method

.method public getBackgroundOverlayColorAlpha()F
    .locals 1

    iget v0, p0, Lmr/k;->z:F

    return v0
.end method

.method public getMaxInlineActionWidth()I
    .locals 1

    iget v0, p0, Lmr/k;->G:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Lmr/k;->F:I

    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lmr/k;->w:Lmr/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmr/l;->c()V

    :cond_0
    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, Lh5/f0;->c(Landroid/view/View;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 6

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lmr/k;->w:Lmr/l;

    if-eqz v0, :cond_3

    invoke-static {}, La00/g;->o()La00/g;

    move-result-object v1

    iget-object v2, v0, Lmr/l;->w:Lmr/g;

    iget-object v3, v1, La00/g;->x:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    invoke-virtual {v1, v2}, La00/g;->r(Lmr/g;)Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_2

    iget-object v1, v1, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Lmr/o;

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Lmr/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_0

    move v1, v5

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v5, v4

    :cond_2
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_3

    sget-object v1, Lmr/l;->A:Landroid/os/Handler;

    new-instance v2, Lmr/e;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lmr/e;-><init>(Lmr/l;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_3
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    move-object p1, p0

    iget-object p2, p1, Lmr/k;->w:Lmr/l;

    if-eqz p2, :cond_0

    iget-boolean p3, p2, Lmr/l;->t:Z

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Lmr/l;->f()V

    const/4 p3, 0x0

    iput-boolean p3, p2, Lmr/l;->t:Z

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    iget p1, p0, Lmr/k;->F:I

    if-lez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-le v0, p1, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    :cond_0
    return-void
.end method

.method public setAnimationMode(I)V
    .locals 0

    iput p1, p0, Lmr/k;->y:I

    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lmr/k;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lmr/k;->H:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v0, p0, Lmr/k;->H:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lmr/k;->I:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iput-object p1, p0, Lmr/k;->H:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lmr/k;->I:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eq v0, p1, :cond_0

    invoke-super {p0, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iput-object p1, p0, Lmr/k;->I:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eq v0, p1, :cond_0

    invoke-super {p0, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean v0, p0, Lmr/k;->K:Z

    if-nez v0, :cond_0

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lmr/k;->J:Landroid/graphics/Rect;

    iget-object p1, p0, Lmr/k;->w:Lmr/l;

    if-eqz p1, :cond_0

    sget-object v0, Lmr/l;->x:Lh8/a;

    invoke-virtual {p1}, Lmr/l;->g()V

    :cond_0
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lmr/k;->L:Lmr/j;

    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-super {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
