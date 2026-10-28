.class public final Lmx/b;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# instance fields
.field public a:Lmx/c;


# virtual methods
.method public final a(Lmm/d;)V
    .locals 1

    iget-object v0, p0, Lmx/b;->a:Lmx/c;

    invoke-virtual {v0, p1}, Lmx/c;->V(Lnx/e;)V

    return-void
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lmx/b;->a:Lmx/c;

    invoke-virtual {v0}, Lmx/c;->p()I

    move-result v0

    return v0
.end method

.method public final getItemId(I)J
    .locals 2

    iget-object v0, p0, Lmx/b;->a:Lmx/c;

    invoke-virtual {v0, p1}, Lmx/c;->t(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    iget-object v0, p0, Lmx/b;->a:Lmx/c;

    invoke-virtual {v0, p1}, Lmx/c;->q(I)I

    move-result p1

    return p1
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 1

    iget-object v0, p0, Lmx/b;->a:Lmx/c;

    check-cast p1, Llx/d;

    invoke-virtual {v0, p1, p2}, Lmx/c;->a(Llx/d;I)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 1

    iget-object v0, p0, Lmx/b;->a:Lmx/c;

    invoke-virtual {v0, p1, p2}, Lmx/c;->d(Landroid/view/ViewGroup;I)Llx/d;

    move-result-object p1

    return-object p1
.end method
