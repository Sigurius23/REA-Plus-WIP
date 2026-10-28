.class public final Landroidx/recyclerview/widget/b1;
.super Landroidx/recyclerview/widget/c1;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/u1;I)V
    .locals 0

    iput p2, p0, Landroidx/recyclerview/widget/b1;->d:I

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/c1;-><init>(Landroidx/recyclerview/widget/u1;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedBottom(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :goto_0
    add-int/2addr p1, v0

    return p1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedRight(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/view/View;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedMeasuredHeight(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :goto_0
    add-int/2addr p1, v0

    return p1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedMeasuredWidth(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedMeasuredWidth(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    :goto_0
    add-int/2addr p1, v0

    return p1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedMeasuredHeight(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Landroid/view/View;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedTop(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    :goto_0
    sub-int/2addr p1, v0

    return p1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/u1;->getDecoratedLeft(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g()I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result v0

    :goto_0
    sub-int/2addr v1, v0

    return v1

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getHeightMode()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getWidthMode()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getWidthMode()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getHeightMode()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l()I
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result v0

    :goto_0
    sub-int/2addr v1, v0

    return v1

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Landroid/view/View;)I
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/recyclerview/widget/c1;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Landroidx/recyclerview/widget/u1;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    iget p1, v2, Landroid/graphics/Rect;->bottom:I

    return p1

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/recyclerview/widget/c1;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Landroidx/recyclerview/widget/u1;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    iget p1, v2, Landroid/graphics/Rect;->right:I

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Landroid/view/View;)I
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/recyclerview/widget/c1;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Landroidx/recyclerview/widget/u1;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    iget p1, v2, Landroid/graphics/Rect;->top:I

    return p1

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/recyclerview/widget/c1;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1, v2}, Landroidx/recyclerview/widget/u1;->getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V

    iget p1, v2, Landroid/graphics/Rect;->left:I

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o(I)V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/b1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/u1;->offsetChildrenVertical(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c1;->a:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/u1;->offsetChildrenHorizontal(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
