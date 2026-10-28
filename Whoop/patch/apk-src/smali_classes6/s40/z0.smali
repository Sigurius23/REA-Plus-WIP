.class public final Ls40/z0;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# instance fields
.field public a:Lkotlin/jvm/functions/Function1;

.field public b:Ljava/util/List;

.field public synthetic c:I


# virtual methods
.method public final a(I)V
    .locals 2

    iget v0, p0, Ls40/z0;->c:I

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/i1;->notifyItemChanged(I)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/i1;->notifyItemChanged(I)V

    iput p1, p0, Ls40/z0;->c:I

    iget-object v0, p0, Ls40/z0;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ls40/z0;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Ls40/z0;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItemId(I)J
    .locals 2

    iget-object v0, p0, Ls40/z0;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/j6;

    invoke-virtual {p1}, Ly00/j6;->hashCode()I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 2

    check-cast p1, Ls40/y0;

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls40/z0;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/j6;

    const-string v1, "shippingMethod"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Ls40/y0;->a:Ls40/a1;

    invoke-virtual {v1, v0}, Ls40/a1;->setShippingMethod(Ly00/j6;)V

    iget v0, p0, Ls40/z0;->c:I

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v1, p2}, Ls40/a1;->setSelected(Z)V

    new-instance p2, Lb13/a;

    const/16 v0, 0xc

    invoke-direct {p2, v0, p0, p1}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 2

    const-string p2, "viewGroup"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ls40/y0;

    new-instance v0, Ls40/a1;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Ls40/a1;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Ls40/y0;-><init>(Ls40/a1;)V

    return-object p2
.end method
