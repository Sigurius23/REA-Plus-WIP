.class public abstract Lf0/k1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/s;


# instance fields
.field public O:Landroid/graphics/Rect;


# virtual methods
.method public final I0(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 4

    invoke-static {p1}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Ly2/y;->r(Ly2/y;Z)Lh2/c;

    move-result-object p1

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Lh2/c;->a:F

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    iget v2, p1, Lh2/c;->b:F

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v2

    iget v3, p1, Lh2/c;->c:F

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    iget p1, p1, Lh2/c;->d:F

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p0}, Lf0/k1;->X0()Lr1/c;

    move-result-object p1

    iget-object v1, p0, Lf0/k1;->O:Landroid/graphics/Rect;

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Lr1/c;->k(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0, p1}, Lf0/k1;->Y0(Lr1/c;)V

    iput-object v0, p0, Lf0/k1;->O:Landroid/graphics/Rect;

    return-void
.end method

.method public final Q0()V
    .locals 2

    invoke-virtual {p0}, Lf0/k1;->X0()Lr1/c;

    move-result-object v0

    iget-object v1, p0, Lf0/k1;->O:Landroid/graphics/Rect;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lr1/c;->k(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0, v0}, Lf0/k1;->Y0(Lr1/c;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lf0/k1;->O:Landroid/graphics/Rect;

    return-void
.end method

.method public abstract X0()Lr1/c;
.end method

.method public abstract Y0(Lr1/c;)V
.end method
