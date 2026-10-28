.class public final Landroidx/lifecycle/n0;
.super Landroidx/lifecycle/o0;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final E:Landroidx/lifecycle/g0;

.field public final synthetic F:Landroidx/lifecycle/p0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/p0;Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/n0;->F:Landroidx/lifecycle/p0;

    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/o0;-><init>(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    iput-object p2, p0, Landroidx/lifecycle/n0;->E:Landroidx/lifecycle/g0;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/n0;->E:Landroidx/lifecycle/g0;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    return-void
.end method

.method public final c(Landroidx/lifecycle/g0;)Z
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/n0;->E:Landroidx/lifecycle/g0;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/n0;->E:Landroidx/lifecycle/g0;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 2

    iget-object p1, p0, Landroidx/lifecycle/n0;->E:Landroidx/lifecycle/g0;

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p2

    sget-object v0, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-ne p2, v0, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/n0;->F:Landroidx/lifecycle/p0;

    iget-object p2, p0, Landroidx/lifecycle/o0;->w:Landroidx/lifecycle/v0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eq v0, p2, :cond_1

    invoke-virtual {p0}, Landroidx/lifecycle/n0;->d()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/lifecycle/o0;->a(Z)V

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    move-object v1, v0

    move-object v0, p2

    move-object p2, v1

    goto :goto_0

    :cond_1
    return-void
.end method
