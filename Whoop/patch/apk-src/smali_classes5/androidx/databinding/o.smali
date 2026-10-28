.class public final Landroidx/databinding/o;
.super Landroidx/databinding/b;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/lang/Object;Landroidx/databinding/a;I)V
    .locals 2

    check-cast p1, Landroidx/databinding/i;

    check-cast p1, Landroidx/databinding/z;

    iget-object p1, p1, Landroidx/databinding/z;->w:Landroidx/databinding/d0;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/databinding/a0;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/databinding/d0;->a()Z

    :cond_0
    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p1, Landroidx/databinding/d0;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/databinding/j;

    if-eq v1, p2, :cond_2

    :goto_0
    return-void

    :cond_2
    iget p1, p1, Landroidx/databinding/d0;->b:I

    invoke-virtual {v0, p1, p2, p3}, Landroidx/databinding/a0;->handleFieldChange(ILjava/lang/Object;I)V

    return-void
.end method
