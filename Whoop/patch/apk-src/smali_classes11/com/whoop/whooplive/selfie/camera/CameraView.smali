.class public Lcom/whoop/whooplive/selfie/camera/CameraView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private E:Z

.field private F:Lmh3/c;

.field private G:Lbh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbh3/b;"
        }
    .end annotation
.end field

.field private w:Lvz2/e;

.field private x:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

.field private y:Landroid/widget/TextView;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Lmh3/c;

    .line 4
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->F:Lmh3/c;

    .line 6
    new-instance p1, Lcom/whoop/whooplive/selfie/camera/CameraView$a;

    invoke-direct {p1, p0}, Lcom/whoop/whooplive/selfie/camera/CameraView$a;-><init>(Lcom/whoop/whooplive/selfie/camera/CameraView;)V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->G:Lbh3/b;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/whooplive/selfie/camera/CameraView;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->e(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static bridge synthetic b(Lcom/whoop/whooplive/selfie/camera/CameraView;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->y:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/whoop/whooplive/selfie/camera/CameraView;)Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->x:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    return-object p0
.end method

.method private synthetic e(Ljava/lang/Boolean;)V
    .locals 0

    iget-boolean p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->z:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {p1}, Lvz2/e;->D()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->z:Z

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method


# virtual methods
.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->E()Z

    move-result v0

    return v0
.end method

.method public f()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lvz2/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->N()Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public g()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lvz2/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->O()Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public getCameraToUse()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->B()I

    move-result v0

    return v0
.end method

.method public getPreview()Landroid/view/TextureView;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->x:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    return-object v0
.end method

.method public h()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->P()Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->b0()V

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->U()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->X()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->u()V

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->E:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->E:Z

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->L()V

    :cond_0
    return-void
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->a0()V

    return-void
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->c0()V

    return-void
.end method

.method public m(Lxg3/g;Lxg3/g;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxg3/g<",
            "Luz2/a;",
            ">;",
            "Lxg3/g<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lvz2/e;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->x:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1, p2}, Lvz2/e;-><init>(Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;Landroid/content/Context;Lxg3/g;Lxg3/g;)V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->F:Lmh3/c;

    invoke-virtual {v0}, Lvz2/e;->M()Lxg3/g;

    move-result-object p2

    new-instance v0, Lo52/m0;

    const/16 v1, 0x1c

    invoke-direct {v0, p0, v1}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->G:Lbh3/b;

    invoke-virtual {p2, v0, v1}, Lxg3/g;->L(Lbh3/b;Lbh3/b;)Lxg3/t;

    move-result-object p2

    invoke-virtual {p1, p2}, Lmh3/c;->c(Lxg3/t;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->R()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->F:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->d()V

    return-void
.end method

.method public onFinishInflate()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget v0, Lpz2/e;->G:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->x:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    sget v0, Lpz2/e;->i:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->y:Landroid/widget/TextView;

    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0}, Lvz2/e;->D()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->z:Z

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void

    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {p2}, Lvz2/a;->a(I)I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-static {p1}, Lvz2/a;->a(I)I

    move-result v1

    if-ge p2, v1, :cond_2

    iget-object p2, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->x:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/view/View;->measure(II)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->x:Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    invoke-static {p2}, Lvz2/a;->b(I)I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p1, v1, p2}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public setFlashMode(Lvz2/g;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->w:Lvz2/e;

    invoke-virtual {v0, p1}, Lvz2/e;->W(Lvz2/g;)V

    return-void
.end method

.method public setRecreateRenderer(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView;->E:Z

    return-void
.end method
