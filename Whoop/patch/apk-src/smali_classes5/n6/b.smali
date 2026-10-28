.class public final Ln6/b;
.super Lhb3/a0;
.source "SourceFile"


# virtual methods
.method public final e(III)V
    .locals 1

    invoke-virtual {p0}, Ln6/b;->n()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, Lhb3/a0;->c(Ljava/util/ArrayList;III)V

    return-void
.end method

.method public final f(II)V
    .locals 2

    invoke-virtual {p0}, Ln6/b;->n()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/2addr p2, p1

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final g(ILjava/lang/Object;)V
    .locals 2

    check-cast p2, Ln6/i;

    iget-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ln6/k;

    iget v0, v0, Ln6/k;->a:I

    if-lez v0, :cond_1

    instance-of v1, p2, Ln6/k;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Ln6/k;

    add-int/lit8 v0, v0, -0x1

    iput v0, v1, Ln6/k;->a:I

    :cond_0
    invoke-virtual {p0}, Ln6/b;->n()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Too many embedded views for the current surface. The maximum depth is: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Lhb3/a0;->x:Ljava/lang/Object;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ln6/k;

    iget p2, p2, Ln6/k;->a:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final j()V
    .locals 2

    const-string v0, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren"

    iget-object v1, p0, Lhb3/a0;->x:Ljava/lang/Object;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ln6/k;

    iget-object v0, v1, Ln6/k;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final bridge synthetic k(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, Ln6/i;

    return-void
.end method

.method public final n()Ljava/util/ArrayList;
    .locals 2

    iget-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast v0, Ln6/i;

    instance-of v1, v0, Ln6/k;

    if-eqz v1, :cond_0

    check-cast v0, Ln6/k;

    iget-object v0, v0, Ln6/k;->b:Ljava/util/ArrayList;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Current node cannot accept children"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
