.class public final Lcom/whoop/ui/LoadingDial;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field w:Lcom/whoop/ui/ProgressDialLayout;

.field x:Landroid/widget/TextView;

.field y:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lnf1/h;->a:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/LoadingDial;->a(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/content/res/TypedArray;)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lnf1/f;->c:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget v0, Lnf1/d;->p:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ProgressDialLayout;

    iput-object v0, p0, Lcom/whoop/ui/LoadingDial;->w:Lcom/whoop/ui/ProgressDialLayout;

    sget v0, Lnf1/d;->r:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/LoadingDial;->x:Landroid/widget/TextView;

    sget v0, Lnf1/d;->q:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/LoadingDial;->y:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    sget v0, Lnf1/h;->d:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    sget v1, Lnf1/h;->b:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    sget v2, Lnf1/h;->c:I

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/whoop/ui/LoadingDial;->w:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v2}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v2

    sget v3, Lnf1/h;->c:I

    invoke-virtual {v2}, Lcom/whoop/ui/ProgressDial;->getThickness()F

    move-result v4

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    invoke-virtual {v2, p1}, Lcom/whoop/ui/ProgressDial;->setThickness(F)V

    :cond_0
    invoke-virtual {p0, v0, v1}, Lcom/whoop/ui/LoadingDial;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/LoadingDial;->x:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/LoadingDial;->y:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/ui/LoadingDial;->y:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/ui/LoadingDial;->y:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public setProgress(F)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/whoop/ui/LoadingDial;->w:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/ProgressDialLayout;->setProgress(F)V

    return-void
.end method
