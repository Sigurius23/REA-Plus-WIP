.class public abstract Landroidx/fragment/app/o2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z


# virtual methods
.method public final a(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/o2;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/o2;->c(Landroid/view/ViewGroup;)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/o2;->b:Z

    return-void
.end method

.method public b()Z
    .locals 1

    instance-of v0, p0, Landroidx/fragment/app/i;

    return v0
.end method

.method public abstract c(Landroid/view/ViewGroup;)V
.end method

.method public abstract d(Landroid/view/ViewGroup;)V
.end method

.method public e(Lg/a;Landroid/view/ViewGroup;)V
    .locals 0

    const-string p1, "container"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public f(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/o2;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/o2;->f(Landroid/view/ViewGroup;)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/o2;->a:Z

    return-void
.end method
