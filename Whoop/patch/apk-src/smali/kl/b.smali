.class public final Lkl/b;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Lkl/e;
.implements Landroid/graphics/drawable/Animatable;


# instance fields
.field public E:Z

.field public F:I

.field public final G:I

.field public H:Z

.field public I:Landroid/graphics/Paint;

.field public J:Landroid/graphics/Rect;

.field public final w:Lar/a;

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lar/a;)V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkl/b;->E:Z

    const/4 v0, -0x1

    iput v0, p0, Lkl/b;->G:I

    iput-object p1, p0, Lkl/b;->w:Lar/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, Lkl/b;->z:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request."

    invoke-static {v0, v2}, Lpf/c;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Lkl/b;->w:Lar/a;

    iget-object v2, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v2, Lkl/g;

    invoke-virtual {v2}, Lkl/g;->d()I

    move-result v2

    if-ne v2, v1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    :cond_0
    iget-boolean v2, p0, Lkl/b;->x:Z

    if-nez v2, :cond_1

    iput-boolean v1, p0, Lkl/b;->x:Z

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    invoke-virtual {v0, p0}, Lkl/g;->j(Lkl/b;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    iget-boolean v0, p0, Lkl/b;->z:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lkl/b;->H:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lkl/b;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p0}, Lkl/b;->getIntrinsicHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    iget-object v3, p0, Lkl/b;->J:Landroid/graphics/Rect;

    if-nez v3, :cond_1

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Lkl/b;->J:Landroid/graphics/Rect;

    :cond_1
    iget-object v3, p0, Lkl/b;->J:Landroid/graphics/Rect;

    const/16 v4, 0x77

    invoke-static {v4, v0, v1, v2, v3}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkl/b;->H:Z

    :cond_2
    iget-object v0, p0, Lkl/b;->w:Lar/a;

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    invoke-virtual {v0}, Lkl/g;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lkl/b;->J:Landroid/graphics/Rect;

    if-nez v1, :cond_3

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lkl/b;->J:Landroid/graphics/Rect;

    :cond_3
    iget-object v1, p0, Lkl/b;->J:Landroid/graphics/Rect;

    iget-object v2, p0, Lkl/b;->I:Landroid/graphics/Paint;

    if-nez v2, :cond_4

    new-instance v2, Landroid/graphics/Paint;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v2, p0, Lkl/b;->I:Landroid/graphics/Paint;

    :cond_4
    iget-object v2, p0, Lkl/b;->I:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, Lkl/b;->w:Lar/a;

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Lkl/b;->w:Lar/a;

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    invoke-virtual {v0}, Lkl/g;->e()I

    move-result v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Lkl/b;->w:Lar/a;

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    invoke-virtual {v0}, Lkl/g;->f()I

    move-result v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public final isRunning()Z
    .locals 1

    iget-boolean v0, p0, Lkl/b;->x:Z

    return v0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lkl/b;->H:Z

    return-void
.end method

.method public final setAlpha(I)V
    .locals 2

    iget-object v0, p0, Lkl/b;->I:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lkl/b;->I:Landroid/graphics/Paint;

    :cond_0
    iget-object v0, p0, Lkl/b;->I:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    iget-object v0, p0, Lkl/b;->I:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lkl/b;->I:Landroid/graphics/Paint;

    :cond_0
    iget-object v0, p0, Lkl/b;->I:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 2

    iget-boolean v0, p0, Lkl/b;->z:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View\'s visibility."

    invoke-static {v0, v1}, Lpf/c;->n(ZLjava/lang/String;)V

    iput-boolean p1, p0, Lkl/b;->E:Z

    if-nez p1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkl/b;->x:Z

    iget-object v0, p0, Lkl/b;->w:Lar/a;

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    invoke-virtual {v0, p0}, Lkl/g;->k(Lkl/b;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lkl/b;->y:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lkl/b;->a()V

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public final start()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkl/b;->y:Z

    const/4 v0, 0x0

    iput v0, p0, Lkl/b;->F:I

    iget-boolean v0, p0, Lkl/b;->E:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkl/b;->a()V

    :cond_0
    return-void
.end method

.method public final stop()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkl/b;->y:Z

    iput-boolean v0, p0, Lkl/b;->x:Z

    iget-object v0, p0, Lkl/b;->w:Lar/a;

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    invoke-virtual {v0, p0}, Lkl/g;->k(Lkl/b;)V

    return-void
.end method
