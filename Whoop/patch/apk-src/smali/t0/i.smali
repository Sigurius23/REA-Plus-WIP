.class public final Lt0/i;
.super Lt0/a;
.source "SourceFile"


# virtual methods
.method public final c(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)Lt0/a;
    .locals 1

    new-instance v0, Lt0/i;

    invoke-direct {v0, p1, p2, p3, p4}, Lt0/a;-><init>(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)V

    return-object v0
.end method

.method public final e(JFFFFLy3/m;)Li2/p0;
    .locals 16

    move-wide/from16 v0, p1

    move-object/from16 v2, p7

    add-float v3, p3, p4

    add-float v3, v3, p5

    add-float v3, v3, p6

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    const-wide/16 v4, 0x0

    if-nez v3, :cond_0

    new-instance v2, Li2/n0;

    invoke-static {v4, v5, v0, v1}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v0

    invoke-direct {v2, v0}, Li2/n0;-><init>(Lh2/c;)V

    return-object v2

    :cond_0
    new-instance v3, Li2/o0;

    invoke-static {v4, v5, v0, v1}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v6

    sget-object v0, Ly3/m;->w:Ly3/m;

    if-ne v2, v0, :cond_1

    move/from16 v1, p3

    goto :goto_0

    :cond_1
    move/from16 v1, p4

    :goto_0
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v7, v1

    const/16 v1, 0x20

    shl-long/2addr v4, v1

    const-wide v9, 0xffffffffL

    and-long/2addr v7, v9

    or-long/2addr v7, v4

    if-ne v2, v0, :cond_2

    move/from16 v4, p4

    goto :goto_1

    :cond_2
    move/from16 v4, p3

    :goto_1
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v11, v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v11, v1

    and-long/2addr v4, v9

    or-long/2addr v4, v11

    if-ne v2, v0, :cond_3

    move/from16 v11, p5

    goto :goto_2

    :cond_3
    move/from16 v11, p6

    :goto_2
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v14, v11

    shl-long v11, v12, v1

    and-long v13, v14, v9

    or-long/2addr v11, v13

    if-ne v2, v0, :cond_4

    move/from16 v0, p6

    goto :goto_3

    :cond_4
    move/from16 v0, p5

    :goto_3
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v13, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    move/from16 p1, v1

    int-to-long v1, v0

    shl-long v13, v13, p1

    and-long v0, v1, v9

    or-long/2addr v13, v0

    move-wide v9, v4

    invoke-static/range {v6 .. v14}, Lj93/l0;->c(Lh2/c;JJJJ)Lh2/d;

    move-result-object v0

    invoke-direct {v3, v0}, Li2/o0;-><init>(Lh2/d;)V

    return-object v3
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lt0/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lt0/a;->i()Lt0/b;

    move-result-object v1

    check-cast p1, Lt0/i;

    invoke-virtual {p1}, Lt0/a;->i()Lt0/b;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lt0/a;->h()Lt0/b;

    move-result-object v1

    invoke-virtual {p1}, Lt0/a;->h()Lt0/b;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lt0/a;->f()Lt0/b;

    move-result-object v1

    invoke-virtual {p1}, Lt0/a;->f()Lt0/b;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lt0/a;->g()Lt0/b;

    move-result-object v1

    invoke-virtual {p1}, Lt0/a;->g()Lt0/b;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, Lt0/a;->i()Lt0/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lt0/a;->h()Lt0/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p0}, Lt0/a;->f()Lt0/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lt0/a;->g()Lt0/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RoundedCornerShape(topStart = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lt0/a;->i()Lt0/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", topEnd = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lt0/a;->h()Lt0/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomEnd = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lt0/a;->f()Lt0/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomStart = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lt0/a;->g()Lt0/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
