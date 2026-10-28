.class public final La3/q2;
.super Lhb3/a0;
.source "SourceFile"


# virtual methods
.method public final e(III)V
    .locals 1

    iget-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast v0, La3/n0;

    invoke-virtual {v0, p1, p2, p3}, La3/n0;->i0(III)V

    return-void
.end method

.method public final f(II)V
    .locals 1

    iget-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast v0, La3/n0;

    invoke-virtual {v0, p1, p2}, La3/n0;->q0(II)V

    return-void
.end method

.method public final bridge synthetic g(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, La3/n0;

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    iget-object v0, v0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_0

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->A()V

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    invoke-virtual {v0}, La3/n0;->p0()V

    return-void
.end method

.method public final k(ILjava/lang/Object;)V
    .locals 1

    check-cast p2, La3/n0;

    iget-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast v0, La3/n0;

    invoke-virtual {v0, p1, p2}, La3/n0;->O(ILa3/n0;)V

    return-void
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast v0, La3/n0;

    invoke-virtual {v0}, La3/n0;->e()V

    return-void
.end method
