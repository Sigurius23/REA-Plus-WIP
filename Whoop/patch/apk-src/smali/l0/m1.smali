.class public final Ll0/m1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:Ll0/k1;


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 9

    iget-object v0, p0, Ll0/m1;->O:Ll0/k1;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v1

    invoke-interface {v0, v1}, Ll0/k1;->b(Ly3/m;)F

    move-result v0

    iget-object v1, p0, Ll0/m1;->O:Ll0/k1;

    invoke-interface {v1}, Ll0/k1;->d()F

    move-result v1

    iget-object v2, p0, Ll0/m1;->O:Ll0/k1;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v3

    invoke-interface {v2, v3}, Ll0/k1;->c(Ly3/m;)F

    move-result v2

    iget-object v3, p0, Ll0/m1;->O:Ll0/k1;

    invoke-interface {v3}, Ll0/k1;->a()F

    move-result v3

    const/4 v4, 0x0

    int-to-float v5, v4

    invoke-static {v0, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v6

    const/4 v7, 0x1

    if-ltz v6, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    move v6, v4

    :goto_0
    invoke-static {v1, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-ltz v8, :cond_1

    move v8, v7

    goto :goto_1

    :cond_1
    move v8, v4

    :goto_1
    and-int/2addr v6, v8

    invoke-static {v2, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-ltz v8, :cond_2

    move v8, v7

    goto :goto_2

    :cond_2
    move v8, v4

    :goto_2
    and-int/2addr v6, v8

    invoke-static {v3, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-ltz v5, :cond_3

    move v4, v7

    :cond_3
    and-int/2addr v4, v6

    if-nez v4, :cond_4

    const-string v4, "Padding must be non-negative"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_4
    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result v0

    invoke-interface {p1, v2}, Ly3/c;->F(F)I

    move-result v2

    add-int/2addr v2, v0

    invoke-interface {p1, v1}, Ly3/c;->F(F)I

    move-result v1

    invoke-interface {p1, v3}, Ly3/c;->F(F)I

    move-result v3

    add-int/2addr v3, v1

    neg-int v4, v2

    neg-int v5, v3

    invoke-static {v4, p3, p4, v5}, Ly3/b;->i(IJI)J

    move-result-wide v4

    invoke-interface {p2, v4, v5}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget v4, p2, Ly2/j1;->w:I

    add-int/2addr v4, v2

    invoke-static {v4, p3, p4}, Ly3/b;->g(IJ)I

    move-result v2

    iget v4, p2, Ly2/j1;->x:I

    add-int/2addr v4, v3

    invoke-static {v4, p3, p4}, Ly3/b;->f(IJ)I

    move-result p3

    new-instance p4, Lg1/p3;

    const/4 v3, 0x2

    invoke-direct {p4, p2, v0, v1, v3}, Lg1/p3;-><init>(Ly2/j1;III)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, v2, p3, p2, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
