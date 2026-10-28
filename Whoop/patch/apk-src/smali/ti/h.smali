.class public final Lti/h;
.super Lti/j;
.source "SourceFile"


# virtual methods
.method public final f(Lej/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lti/h;->m(Lej/a;F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public final l()F
    .locals 2

    iget-object v0, p0, Lti/d;->c:Lti/b;

    invoke-interface {v0}, Lti/b;->b()Lej/a;

    move-result-object v0

    invoke-virtual {p0}, Lti/d;->c()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lti/h;->m(Lej/a;F)F

    move-result v0

    return v0
.end method

.method public final m(Lej/a;F)F
    .locals 10

    iget-object v0, p1, Lej/a;->b:Ljava/lang/Object;

    iget-object v1, p1, Lej/a;->b:Ljava/lang/Object;

    if-eqz v0, :cond_4

    iget-object v0, p1, Lej/a;->c:Ljava/lang/Object;

    if-eqz v0, :cond_4

    iget-object v2, p0, Lti/d;->e:Ld1/j;

    if-eqz v2, :cond_0

    iget v3, p1, Lej/a;->g:F

    iget-object v0, p1, Lej/a;->h:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    move-object v5, v1

    check-cast v5, Ljava/lang/Float;

    iget-object v0, p1, Lej/a;->c:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {p0}, Lti/d;->d()F

    move-result v8

    iget v9, p0, Lti/d;->d:F

    move v7, p2

    invoke-virtual/range {v2 .. v9}, Ld1/j;->A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    return p1

    :cond_0
    move v7, p2

    :cond_1
    iget p2, p1, Lej/a;->i:F

    const v0, -0x358c9d09

    cmpl-float p2, p2, v0

    if-nez p2, :cond_2

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iput p2, p1, Lej/a;->i:F

    :cond_2
    iget p2, p1, Lej/a;->i:F

    iget v1, p1, Lej/a;->j:F

    cmpl-float v0, v1, v0

    if-nez v0, :cond_3

    iget-object v0, p1, Lej/a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p1, Lej/a;->j:F

    :cond_3
    iget p1, p1, Lej/a;->j:F

    invoke-static {p2, p1, v7}, Ldj/g;->f(FFF)F

    move-result p1

    return p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing values for keyframe."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
