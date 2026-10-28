.class public final Lh5/u1;
.super Lh5/t1;
.source "SourceFile"


# virtual methods
.method public final H()Z
    .locals 1

    iget-object v0, p0, Lh5/s1;->b:Landroid/view/WindowInsetsController;

    invoke-interface {v0}, Landroid/view/WindowInsetsController;->getSystemBarsAppearance()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
