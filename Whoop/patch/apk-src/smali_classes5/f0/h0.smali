.class public final Lf0/h0;
.super Lf0/k1;
.source "SourceFile"


# virtual methods
.method public final X0()Lr1/c;
    .locals 3

    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v1, v1, [Landroid/graphics/Rect;

    invoke-direct {v0, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    invoke-static {p0}, Ldp/d;->W(La3/n;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getSystemGestureExclusionRects()Ljava/util/List;

    move-result-object v1

    iget v2, v0, Lr1/c;->y:I

    invoke-virtual {v0, v2, v1}, Lr1/c;->c(ILjava/util/List;)V

    return-object v0
.end method

.method public final Y0(Lr1/c;)V
    .locals 1

    invoke-static {p0}, Ldp/d;->W(La3/n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lr1/c;->f()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemGestureExclusionRects(Ljava/util/List;)V

    return-void
.end method
