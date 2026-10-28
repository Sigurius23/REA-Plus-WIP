.class public abstract Lb30/j;
.super Lm/m;
.source "SourceFile"


# virtual methods
.method public final finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {p0}, Lb3/g1;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public abstract o()Le30/c;
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Le4/a;->P(Lg/l;)V

    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object p1

    new-instance v0, La1/b;

    const/16 v1, 0xe

    invoke-direct {v0, p0, v1}, La1/b;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lo73/a;->n(Lg/z;Lc4/d0;Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method
