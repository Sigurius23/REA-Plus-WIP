.class public final Lg1/d2;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:Lg1/a0;

.field public P:Lej1/h;

.field public Q:Lh0/d2;

.field public R:Z


# virtual methods
.method public final Q0()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg1/d2;->R:Z

    return-void
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 6

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    invoke-interface {p1}, Ly2/r;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lg1/d2;->R:Z

    if-nez v0, :cond_1

    :cond_0
    iget v0, p2, Ly2/j1;->w:I

    iget v1, p2, Ly2/j1;->x:I

    int-to-long v2, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    int-to-long v0, v1

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    iget-object v2, p0, Lg1/d2;->P:Lej1/h;

    new-instance v3, Ly3/l;

    invoke-direct {v3, v0, v1}, Ly3/l;-><init>(J)V

    new-instance v0, Ly3/a;

    invoke-direct {v0, p3, p4}, Ly3/a;-><init>(J)V

    invoke-virtual {v2, v3, v0}, Lej1/h;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll83/k;

    iget-object p4, p0, Lg1/d2;->O:Lg1/a0;

    iget-object v0, p3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lg1/k3;

    iget-object p3, p3, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {p4, v0, p3}, Lg1/a0;->k(Lg1/k3;Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p1}, Ly2/r;->A()Z

    move-result p3

    if-nez p3, :cond_3

    iget-boolean p3, p0, Lg1/d2;->R:Z

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p3, 0x1

    :goto_1
    iput-boolean p3, p0, Lg1/d2;->R:Z

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Lep1/g;

    const/16 v1, 0xb

    invoke-direct {v0, p1, p0, p2, v1}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
