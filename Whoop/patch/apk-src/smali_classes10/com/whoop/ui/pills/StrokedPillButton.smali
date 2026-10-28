.class public Lcom/whoop/ui/pills/StrokedPillButton;
.super Landroid/widget/Button;
.source "SourceFile"


# instance fields
.field private w:Lgn2/d;

.field private x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/ui/pills/StrokedPillButton;->x:Z

    sget-object v0, Lvu1/j;->b0:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/pills/StrokedPillButton;->a(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/content/res/TypedArray;)V
    .locals 3

    new-instance v0, Lgn2/d;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lgn2/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whoop/ui/pills/StrokedPillButton;->w:Lgn2/d;

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcn2/a;->a(Landroid/content/Context;I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/pills/StrokedPillButton;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->e:I

    invoke-static {v0, v1}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/pills/StrokedPillButton;->setPillColor(I)V

    if-eqz p1, :cond_4

    sget v0, Lvu1/j;->f0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lvu1/j;->f0:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/pills/StrokedPillButton;->setStrokeWidth(F)V

    :cond_0
    sget v0, Lvu1/j;->c0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lvu1/j;->c0:I

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/ui/pills/StrokedPillButton;->setPillColor(I)V

    :cond_1
    sget v0, Lvu1/j;->d0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillButton;->w:Lgn2/d;

    sget v1, Lvu1/j;->d0:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lgn2/d;->c(F)V

    :cond_2
    sget v0, Lvu1/j;->g0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillButton;->w:Lgn2/d;

    sget v1, Lvu1/j;->g0:I

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {v0, v1}, Lgn2/d;->i(Z)V

    :cond_3
    sget v0, Lvu1/j;->e0:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, Lvu1/j;->e0:I

    const/high16 v1, -0x1000000

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/pills/StrokedPillButton;->setStrokeColor(I)V

    :cond_4
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Boolean;II)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/ui/pills/StrokedPillButton;->x:Z

    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/ui/pills/StrokedPillButton;->x:Z

    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/ui/pills/StrokedPillButton;->setPillColor(I)V

    iget-object p1, p0, Lcom/whoop/ui/pills/StrokedPillButton;->w:Lgn2/d;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/content/Context;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lgn2/d;->f(I)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget-object p1, p0, Lcom/whoop/ui/pills/StrokedPillButton;->w:Lgn2/d;

    invoke-virtual {p1, p2}, Lgn2/d;->b(I)V

    return-void
.end method

.method public setPillColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillButton;->w:Lgn2/d;

    invoke-virtual {v0, p1}, Lgn2/d;->d(I)V

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillButton;->w:Lgn2/d;

    invoke-virtual {v0, p1}, Lgn2/d;->f(I)V

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/pills/StrokedPillButton;->w:Lgn2/d;

    invoke-virtual {v0, p1}, Lgn2/d;->h(F)V

    return-void
.end method
