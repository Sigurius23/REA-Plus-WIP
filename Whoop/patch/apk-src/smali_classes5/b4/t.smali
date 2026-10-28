.class public final Lb4/t;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements Lg2/q;


# virtual methods
.method public final j0(Lg2/m;)V
    .locals 1

    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lb4/n;->e(Lb2/v;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1, v0}, Lg2/m;->b(Z)V

    return-void
.end method
