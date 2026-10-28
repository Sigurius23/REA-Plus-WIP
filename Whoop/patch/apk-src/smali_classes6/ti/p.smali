.class public final Lti/p;
.super Lti/j;
.source "SourceFile"


# virtual methods
.method public final f(Lej/a;F)Ljava/lang/Object;
    .locals 9

    iget-object v0, p1, Lej/a;->b:Ljava/lang/Object;

    iget-object v1, p0, Lti/d;->e:Ld1/j;

    if-eqz v1, :cond_2

    iget v2, p1, Lej/a;->g:F

    iget-object v3, p1, Lej/a;->h:Ljava/lang/Float;

    if-nez v3, :cond_0

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_0
    move-object v4, v0

    check-cast v4, Lwi/b;

    iget-object p1, p1, Lej/a;->c:Ljava/lang/Object;

    if-nez p1, :cond_1

    move-object v5, v4

    goto :goto_1

    :cond_1
    check-cast p1, Lwi/b;

    move-object v5, p1

    :goto_1
    invoke-virtual {p0}, Lti/d;->c()F

    move-result v7

    iget v8, p0, Lti/d;->d:F

    move v6, p2

    invoke-virtual/range {v1 .. v8}, Ld1/j;->A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwi/b;

    return-object p1

    :cond_2
    move v6, p2

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p2, v6, p2

    if-nez p2, :cond_4

    iget-object p1, p1, Lej/a;->c:Ljava/lang/Object;

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    check-cast p1, Lwi/b;

    return-object p1

    :cond_4
    :goto_2
    check-cast v0, Lwi/b;

    return-object v0
.end method
