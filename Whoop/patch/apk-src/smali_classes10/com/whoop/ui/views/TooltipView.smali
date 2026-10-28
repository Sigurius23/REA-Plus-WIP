.class public Lcom/whoop/ui/views/TooltipView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private w:Lcom/whoop/ui/views/ColoredImageView;

.field private x:Landroid/view/View;

.field private y:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lvu1/j;->u0:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/views/TooltipView;->c(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic a(Landroid/widget/PopupWindow;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/views/TooltipView;->f(Landroid/widget/PopupWindow;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/whoop/ui/views/TooltipView;Landroid/view/View;Landroid/widget/PopupWindow;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Lcom/whoop/ui/views/TooltipView;->e(Landroid/view/View;Landroid/widget/PopupWindow;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method private c(Landroid/content/res/TypedArray;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lvu1/g;->c:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-direct {p0}, Lcom/whoop/ui/views/TooltipView;->d()V

    if-eqz p1, :cond_2

    sget v0, Lvu1/j;->w0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/views/TooltipView;->x:Landroid/view/View;

    sget v2, Lvu1/j;->w0:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_0
    sget v0, Lvu1/j;->v0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/ui/views/TooltipView;->w:Lcom/whoop/ui/views/ColoredImageView;

    sget v2, Lvu1/j;->v0:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/views/ColoredImageView;->setColor(I)V

    :cond_1
    sget v0, Lvu1/j;->x0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lvu1/j;->x0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/views/TooltipView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method private d()V
    .locals 1

    sget v0, Lvu1/e;->r:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/views/ColoredImageView;

    iput-object v0, p0, Lcom/whoop/ui/views/TooltipView;->w:Lcom/whoop/ui/views/ColoredImageView;

    sget v0, Lvu1/e;->s:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/TooltipView;->x:Landroid/view/View;

    sget v0, Lvu1/e;->t:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/views/TooltipView;->y:Landroid/widget/TextView;

    return-void
.end method

.method private synthetic e(Landroid/view/View;Landroid/widget/PopupWindow;Landroid/view/View;IIIIIIII)V
    .locals 0

    const/4 p3, 0x2

    new-array p4, p3, [I

    invoke-virtual {p1, p4}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p5, 0x0

    aget p6, p4, p5

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    div-int/2addr p1, p3

    add-int/2addr p1, p6

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p4}, Landroid/view/View;->getLocationOnScreen([I)V

    aget p2, p4, p5

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p4

    div-int/2addr p4, p3

    add-int/2addr p4, p2

    sub-int/2addr p1, p4

    invoke-virtual {p0}, Lcom/whoop/ui/views/TooltipView;->getArrowView()Lcom/whoop/ui/views/ColoredImageView;

    move-result-object p2

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method private static synthetic f(Landroid/widget/PopupWindow;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public g(Landroid/view/View;IJ)V
    .locals 7

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    new-instance v0, Landroid/widget/PopupWindow;

    const/4 v1, -0x2

    const/4 v2, 0x1

    invoke-direct {v0, p0, p2, v1, v2}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    new-instance v1, Lkn2/d;

    invoke-direct {v1, p0, p1, v0}, Lkn2/d;-><init>(Lcom/whoop/ui/views/TooltipView;Landroid/view/View;Landroid/widget/PopupWindow;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x2

    new-array v4, v1, [I

    invoke-virtual {p1, v4}, Landroid/view/View;->getLocationInWindow([I)V

    aget v5, v4, v3

    div-int/2addr p2, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v6

    div-int/2addr v6, v1

    sub-int/2addr p2, v6

    sub-int/2addr v5, p2

    aput v5, v4, v3

    aget p2, v4, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v5, p2

    aput v5, v4, v2

    aget p2, v4, v3

    invoke-virtual {v0, p1, v3, p2, v5}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    new-instance p1, Lkn2/e;

    invoke-direct {p1, v0, v3}, Lkn2/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    new-array p1, v1, [F

    fill-array-data p1, :array_0

    const-string p2, "alpha"

    invoke-static {p0, p2, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public getArrowView()Lcom/whoop/ui/views/ColoredImageView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/TooltipView;->w:Lcom/whoop/ui/views/ColoredImageView;

    return-object v0
.end method

.method public getFrame()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/TooltipView;->x:Landroid/view/View;

    return-object v0
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/TooltipView;->y:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTextColor(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/TooltipView;->y:Landroid/widget/TextView;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method
