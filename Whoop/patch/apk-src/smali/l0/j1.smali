.class public final Ll0/j1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:F

.field public P:F

.field public Q:F

.field public R:F

.field public S:Z


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 5

    iget v0, p0, Ll0/j1;->O:F

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result v0

    iget v1, p0, Ll0/j1;->Q:F

    invoke-interface {p1, v1}, Ly3/c;->F(F)I

    move-result v1

    add-int/2addr v1, v0

    iget v0, p0, Ll0/j1;->P:F

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result v0

    iget v2, p0, Ll0/j1;->R:F

    invoke-interface {p1, v2}, Ly3/c;->F(F)I

    move-result v2

    add-int/2addr v2, v0

    neg-int v0, v1

    neg-int v3, v2

    invoke-static {v0, p3, p4, v3}, Ly3/b;->i(IJI)J

    move-result-wide v3

    invoke-interface {p2, v3, v4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget v0, p2, Ly2/j1;->w:I

    add-int/2addr v0, v1

    invoke-static {v0, p3, p4}, Ly3/b;->g(IJ)I

    move-result v0

    iget v1, p2, Ly2/j1;->x:I

    add-int/2addr v1, v2

    invoke-static {v1, p3, p4}, Ly3/b;->f(IJ)I

    move-result p3

    new-instance p4, Lbp0/n;

    const/16 v1, 0x19

    invoke-direct {p4, v1, p0, p2}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, v0, p3, p2, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
