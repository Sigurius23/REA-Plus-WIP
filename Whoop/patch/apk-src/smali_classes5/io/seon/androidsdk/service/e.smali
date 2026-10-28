.class public final Lio/seon/androidsdk/service/e;
.super Lio/seon/androidsdk/service/e1;
.source "SourceFile"


# instance fields
.field public final synthetic h:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lio/seon/androidsdk/service/e;->h:I

    const/16 v0, 0xbb8

    const/4 v1, 0x4

    .line 1
    invoke-direct {p0, v0, v1}, Lio/seon/androidsdk/service/e1;-><init>(II)V

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    .line 2
    iput p3, p0, Lio/seon/androidsdk/service/e;->h:I

    invoke-direct {p0, p1, p2}, Lio/seon/androidsdk/service/e1;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a([F)V
    .locals 7

    iget v0, p0, Lio/seon/androidsdk/service/e;->h:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lio/seon/androidsdk/service/e1;->a([F)V

    return-void

    :pswitch_0
    const/4 v0, 0x4

    new-array v0, v0, [F

    const/4 v3, 0x3

    invoke-static {p1, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v4, p0, Lio/seon/androidsdk/service/e1;->d:I

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    if-nez v4, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget v4, p0, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v4, v2

    iget v2, p0, Lio/seon/androidsdk/service/e1;->e:I

    add-int/2addr v4, v2

    rem-int/2addr v4, v2

    iget-object v2, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v2, [[F

    aget-object v2, v2, v4

    array-length v4, v2

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_3

    array-length v4, p1

    if-lt v4, v3, :cond_3

    array-length v4, v2

    if-ge v4, v3, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    array-length v4, p1

    if-ge v1, v4, :cond_4

    aget v4, p1, v1

    aget v6, v2, v1

    sub-float/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v6, v4, v5

    if-lez v6, :cond_2

    move v5, v4

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    const/high16 v5, -0x40800000    # -1.0f

    :cond_4
    aput v5, v0, v3

    invoke-super {p0, v0}, Lio/seon/androidsdk/service/e1;->a([F)V

    return-void

    :pswitch_1
    aget v0, p1, v1

    aget v3, p1, v2

    const/4 v4, 0x2

    aget p1, p1, v4

    mul-float/2addr v0, v0

    mul-float/2addr v3, v3

    add-float/2addr v3, v0

    mul-float/2addr p1, p1

    add-float/2addr p1, v3

    float-to-double v3, p1

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    double-to-float p1, v3

    new-array v0, v2, [F

    aput p1, v0, v1

    invoke-super {p0, v0}, Lio/seon/androidsdk/service/e1;->a([F)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g()La0/i;
    .locals 13

    iget v0, p0, Lio/seon/androidsdk/service/e1;->e:I

    iget-object v1, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v1, [[F

    iget v2, p0, Lio/seon/androidsdk/service/e1;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ge v2, v3, :cond_0

    new-instance v0, La0/i;

    new-array v1, v4, [F

    const/4 v3, -0x1

    invoke-direct {v0, v3, v3, v1, v2}, La0/i;-><init>(II[FI)V

    return-object v0

    :cond_0
    const-string v3, "Index out of bounds"

    if-lez v2, :cond_9

    iget v2, p0, Lio/seon/androidsdk/service/e1;->b:I

    rem-int/2addr v2, v0

    aget-object v2, v1, v2

    const/4 v5, 0x1

    move v7, v4

    move v8, v7

    move v6, v5

    :goto_0
    iget v9, p0, Lio/seon/androidsdk/service/e1;->d:I

    if-ge v6, v9, :cond_7

    if-ge v6, v9, :cond_6

    iget v9, p0, Lio/seon/androidsdk/service/e1;->b:I

    add-int/2addr v9, v6

    rem-int/2addr v9, v0

    aget-object v9, v1, v9

    invoke-static {v2, v9}, Ljava/util/Arrays;->equals([F[F)Z

    move-result v10

    if-nez v10, :cond_5

    if-eqz v9, :cond_4

    if-eqz v2, :cond_4

    array-length v10, v9

    array-length v11, v2

    if-eq v10, v11, :cond_1

    goto :goto_2

    :cond_1
    move v10, v4

    :goto_1
    array-length v11, v9

    if-ge v10, v11, :cond_3

    aget v11, v9, v10

    aget v12, v2, v10

    sub-float/2addr v11, v12

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v11

    const v12, 0x3dcccccd    # 0.1f

    cmpl-float v11, v11, v12

    if-lez v11, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_4
    :goto_2
    add-int/lit8 v7, v7, 0x1

    :cond_5
    :goto_3
    add-int/lit8 v6, v6, 0x1

    move-object v2, v9

    goto :goto_0

    :cond_6
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0, v3}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-array v0, v9, [F

    :goto_4
    iget v2, p0, Lio/seon/androidsdk/service/e1;->d:I

    if-ge v4, v2, :cond_8

    aget-object v2, v1, v4

    const/4 v3, 0x3

    aget v2, v2, v3

    aput v2, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_8
    invoke-static {v0}, Ljava/util/Arrays;->sort([F)V

    iget v1, p0, Lio/seon/androidsdk/service/e1;->d:I

    add-int/lit8 v1, v1, -0xa

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v2, p0, Lio/seon/androidsdk/service/e1;->d:I

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([FII)[F

    move-result-object v0

    new-instance v1, La0/i;

    iget v2, p0, Lio/seon/androidsdk/service/e1;->d:I

    invoke-direct {v1, v7, v8, v0, v2}, La0/i;-><init>(II[FI)V

    return-object v1

    :cond_9
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0, v3}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Lio/seon/androidsdk/service/h;
    .locals 12

    iget v5, p0, Lio/seon/androidsdk/service/e1;->d:I

    if-nez v5, :cond_0

    new-instance v0, Lio/seon/androidsdk/service/h;

    const/high16 v4, -0x40800000    # -1.0f

    const/4 v6, 0x0

    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, -0x40800000    # -1.0f

    invoke-direct/range {v0 .. v6}, Lio/seon/androidsdk/service/h;-><init>(FFFFII)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, [[F

    const/4 v1, 0x0

    invoke-static {v0, v1, v5}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[F

    iget v7, p0, Lio/seon/androidsdk/service/e1;->d:I

    new-array v2, v7, [F

    move v3, v1

    :goto_0
    iget v4, p0, Lio/seon/androidsdk/service/e1;->d:I

    if-ge v3, v4, :cond_1

    aget-object v4, v0, v3

    aget v4, v4, v1

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Ljava/util/Arrays;->sort([F)V

    aget v4, v2, v1

    add-int/lit8 v0, v7, -0x1

    aget v5, v2, v0

    int-to-double v8, v0

    const-wide v10, 0x3fee666666666666L    # 0.95

    mul-double/2addr v8, v10

    double-to-int v1, v8

    aget v6, v2, v1

    rem-int/lit8 v1, v7, 0x2

    if-eqz v1, :cond_2

    div-int/lit8 v0, v7, 0x2

    aget v0, v2, v0

    :goto_1
    move v3, v0

    goto :goto_2

    :cond_2
    div-int/lit8 v0, v0, 0x2

    aget v0, v2, v0

    div-int/lit8 v1, v7, 0x2

    aget v1, v2, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    goto :goto_1

    :goto_2
    new-instance v2, Lio/seon/androidsdk/service/h;

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lio/seon/androidsdk/service/h;-><init>(FFFFII)V

    return-object v2
.end method

.method public i()Lio/seon/androidsdk/service/h;
    .locals 12

    iget v5, p0, Lio/seon/androidsdk/service/e1;->d:I

    if-nez v5, :cond_0

    new-instance v0, Lio/seon/androidsdk/service/h;

    const/high16 v4, -0x40800000    # -1.0f

    const/4 v6, 0x1

    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, -0x40800000    # -1.0f

    invoke-direct/range {v0 .. v6}, Lio/seon/androidsdk/service/h;-><init>(FFFFII)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, [[F

    const/4 v1, 0x0

    invoke-static {v0, v1, v5}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[F

    array-length v7, v0

    new-array v2, v7, [F

    move v3, v1

    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_1

    aget-object v4, v0, v3

    aget v4, v4, v1

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Ljava/util/Arrays;->sort([F)V

    aget v5, v2, v1

    add-int/lit8 v0, v7, -0x1

    aget v4, v2, v0

    int-to-double v8, v0

    const-wide v10, 0x3fee666666666666L    # 0.95

    mul-double/2addr v8, v10

    double-to-int v1, v8

    aget v6, v2, v1

    rem-int/lit8 v1, v7, 0x2

    if-eqz v1, :cond_2

    div-int/lit8 v0, v7, 0x2

    aget v0, v2, v0

    :goto_1
    move v3, v0

    goto :goto_2

    :cond_2
    div-int/lit8 v0, v0, 0x2

    aget v0, v2, v0

    div-int/lit8 v1, v7, 0x2

    aget v1, v2, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    goto :goto_1

    :goto_2
    new-instance v2, Lio/seon/androidsdk/service/h;

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Lio/seon/androidsdk/service/h;-><init>(FFFFII)V

    return-object v2
.end method
