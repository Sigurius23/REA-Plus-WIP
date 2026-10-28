.class public final Ld0/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/i2;


# instance fields
.field public E:[I

.field public F:[F

.field public G:Ld0/r;

.field public H:Ld0/r;

.field public I:Ld0/r;

.field public J:Ld0/r;

.field public K:[F

.field public L:[F

.field public M:Laj/d;

.field public final w:La0/f0;

.field public final x:La0/g0;

.field public final y:I

.field public final z:Ld0/z;


# direct methods
.method public constructor <init>(La0/f0;La0/g0;ILd0/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/n2;->w:La0/f0;

    iput-object p2, p0, Ld0/n2;->x:La0/g0;

    iput p3, p0, Ld0/n2;->y:I

    iput-object p4, p0, Ld0/n2;->z:Ld0/z;

    sget-object p1, Ld0/h2;->a:[I

    iput-object p1, p0, Ld0/n2;->E:[I

    sget-object p1, Ld0/h2;->b:[F

    iput-object p1, p0, Ld0/n2;->F:[F

    iput-object p1, p0, Ld0/n2;->K:[F

    iput-object p1, p0, Ld0/n2;->L:[F

    sget-object p1, Ld0/h2;->c:Laj/d;

    iput-object p1, p0, Ld0/n2;->M:Laj/d;

    return-void
.end method


# virtual methods
.method public final b(I)I
    .locals 5

    iget-object v0, p0, Ld0/n2;->w:La0/f0;

    iget v1, v0, La0/f0;->b:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lez v1, :cond_4

    iget v2, v0, La0/f0;->b:I

    if-gt v1, v2, :cond_4

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v1, :cond_1

    add-int v3, v2, v1

    ushr-int/lit8 v3, v3, 0x1

    iget-object v4, v0, La0/f0;->a:[I

    aget v4, v4, v3

    if-ge v4, p1, :cond_0

    add-int/lit8 v2, v3, 0x1

    goto :goto_0

    :cond_0
    if-le v4, p1, :cond_2

    add-int/lit8 v1, v3, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    neg-int v3, v2

    :cond_2
    const/4 p1, -0x1

    if-ge v3, p1, :cond_3

    add-int/lit8 v3, v3, 0x2

    neg-int p1, v3

    return p1

    :cond_3
    return v3

    :cond_4
    const-string p1, ""

    invoke-static {p1}, Lug/m;->Q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final d(IIZ)F
    .locals 4

    iget-object v0, p0, Ld0/n2;->w:La0/f0;

    iget v1, v0, La0/f0;->b:I

    add-int/lit8 v1, v1, -0x1

    const-wide/16 v2, 0x3e8

    if-lt p1, v1, :cond_0

    int-to-float p1, p2

    :goto_0
    long-to-float p2, v2

    div-float/2addr p1, p2

    return p1

    :cond_0
    invoke-virtual {v0, p1}, La0/f0;->c(I)I

    move-result v1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, La0/f0;->c(I)I

    move-result p1

    if-ne p2, v1, :cond_1

    int-to-float p1, v1

    goto :goto_0

    :cond_1
    sub-int/2addr p1, v1

    iget-object v0, p0, Ld0/n2;->x:La0/g0;

    invoke-virtual {v0, v1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld0/m2;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ld0/m2;->b:Ld0/z;

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Ld0/n2;->z:Ld0/z;

    :cond_3
    sub-int/2addr p2, v1

    int-to-float p2, p2

    int-to-float p1, p1

    div-float/2addr p2, p1

    invoke-interface {v0, p2}, Ld0/z;->i(F)F

    move-result p2

    if-eqz p3, :cond_4

    return p2

    :cond_4
    mul-float/2addr p1, p2

    int-to-float p2, v1

    add-float/2addr p1, p2

    goto :goto_0
.end method

.method public final e(Ld0/r;Ld0/r;Ld0/r;)V
    .locals 10

    iget-object v0, p0, Ld0/n2;->M:Laj/d;

    sget-object v1, Ld0/h2;->c:Laj/d;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v1, p0, Ld0/n2;->G:Ld0/r;

    iget-object v3, p0, Ld0/n2;->x:La0/g0;

    iget-object v4, p0, Ld0/n2;->w:La0/f0;

    if-nez v1, :cond_3

    invoke-virtual {p1}, Ld0/r;->c()Ld0/r;

    move-result-object v1

    iput-object v1, p0, Ld0/n2;->G:Ld0/r;

    invoke-virtual {p3}, Ld0/r;->c()Ld0/r;

    move-result-object p3

    iput-object p3, p0, Ld0/n2;->H:Ld0/r;

    iget p3, v4, La0/f0;->b:I

    new-array v1, p3, [F

    move v5, v2

    :goto_1
    if-ge v5, p3, :cond_1

    invoke-virtual {v4, v5}, La0/f0;->c(I)I

    move-result v6

    int-to-float v6, v6

    const-wide/16 v7, 0x3e8

    long-to-float v7, v7

    div-float/2addr v6, v7

    aput v6, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    iput-object v1, p0, Ld0/n2;->F:[F

    iget p3, v4, La0/f0;->b:I

    new-array v1, p3, [I

    move v5, v2

    :goto_2
    if-ge v5, p3, :cond_2

    invoke-virtual {v4, v5}, La0/f0;->c(I)I

    move-result v6

    invoke-virtual {v3, v6}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld0/m2;

    aput v2, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    iput-object v1, p0, Ld0/n2;->E:[I

    :cond_3
    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    iget-object p3, p0, Ld0/n2;->M:Laj/d;

    sget-object v0, Ld0/h2;->c:Laj/d;

    if-eq p3, v0, :cond_6

    iget-object p3, p0, Ld0/n2;->I:Ld0/r;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    iget-object p3, p0, Ld0/n2;->J:Ld0/r;

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    return-void

    :cond_6
    :goto_4
    iput-object p1, p0, Ld0/n2;->I:Ld0/r;

    iput-object p2, p0, Ld0/n2;->J:Ld0/r;

    invoke-virtual {p1}, Ld0/r;->b()I

    move-result p3

    rem-int/lit8 p3, p3, 0x2

    invoke-virtual {p1}, Ld0/r;->b()I

    move-result v0

    add-int/2addr v0, p3

    new-array p3, v0, [F

    iput-object p3, p0, Ld0/n2;->K:[F

    new-array p3, v0, [F

    iput-object p3, p0, Ld0/n2;->L:[F

    iget p3, v4, La0/f0;->b:I

    new-array v1, p3, [[F

    move v5, v2

    :goto_5
    if-ge v5, p3, :cond_b

    invoke-virtual {v4, v5}, La0/f0;->c(I)I

    move-result v6

    invoke-virtual {v3, v6}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ld0/m2;

    if-nez v6, :cond_7

    if-nez v7, :cond_7

    new-array v6, v0, [F

    move v7, v2

    :goto_6
    if-ge v7, v0, :cond_a

    invoke-virtual {p1, v7}, Ld0/r;->a(I)F

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_7
    iget v8, p0, Ld0/n2;->y:I

    if-ne v6, v8, :cond_8

    if-nez v7, :cond_8

    new-array v6, v0, [F

    move v7, v2

    :goto_7
    if-ge v7, v0, :cond_a

    invoke-virtual {p2, v7}, Ld0/r;->a(I)F

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_8
    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, v7, Ld0/m2;->a:Ld0/r;

    new-array v7, v0, [F

    move v8, v2

    :goto_8
    if-ge v8, v0, :cond_9

    invoke-virtual {v6, v8}, Ld0/r;->a(I)F

    move-result v9

    aput v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_9
    move-object v6, v7

    :cond_a
    aput-object v6, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_b
    new-instance p1, Laj/d;

    iget-object p2, p0, Ld0/n2;->E:[I

    iget-object p3, p0, Ld0/n2;->F:[F

    invoke-direct {p1, p2, p3, v1}, Laj/d;-><init>([I[F[[F)V

    iput-object p1, p0, Ld0/n2;->M:Laj/d;

    return-void
.end method

.method public final h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    const-wide/32 v3, 0xf4240

    div-long v3, p1, v3

    sget-object v5, Ld0/h2;->a:[I

    const/4 v5, 0x0

    int-to-long v6, v5

    sub-long/2addr v3, v6

    iget v6, v0, Ld0/n2;->y:I

    int-to-long v7, v6

    const-wide/16 v9, 0x0

    cmp-long v11, v3, v9

    if-gez v11, :cond_0

    move-wide v3, v9

    :cond_0
    cmp-long v9, v3, v7

    if-lez v9, :cond_1

    goto :goto_0

    :cond_1
    move-wide v7, v3

    :goto_0
    long-to-int v3, v7

    iget-object v4, v0, Ld0/n2;->x:La0/g0;

    invoke-virtual {v4, v3}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ld0/m2;

    if-eqz v7, :cond_2

    iget-object v1, v7, Ld0/m2;->a:Ld0/r;

    return-object v1

    :cond_2
    if-lt v3, v6, :cond_3

    return-object v2

    :cond_3
    if-gtz v3, :cond_4

    return-object v1

    :cond_4
    move-object/from16 v6, p5

    invoke-virtual {v0, v1, v2, v6}, Ld0/n2;->e(Ld0/r;Ld0/r;Ld0/r;)V

    iget-object v6, v0, Ld0/n2;->G:Ld0/r;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v0, Ld0/n2;->M:Laj/d;

    sget-object v8, Ld0/h2;->c:Laj/d;

    const/4 v9, 0x1

    if-eq v7, v8, :cond_e

    invoke-virtual {v0, v3}, Ld0/n2;->b(I)I

    move-result v1

    invoke-virtual {v0, v1, v3, v5}, Ld0/n2;->d(IIZ)F

    move-result v1

    iget-object v2, v0, Ld0/n2;->K:[F

    iget-object v3, v0, Ld0/n2;->M:Laj/d;

    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, [[Ld0/t;

    array-length v4, v3

    sub-int/2addr v4, v9

    aget-object v7, v3, v5

    aget-object v7, v7, v5

    iget v7, v7, Ld0/t;->a:F

    aget-object v8, v3, v4

    aget-object v8, v8, v5

    iget v8, v8, Ld0/t;->b:F

    array-length v10, v2

    cmpg-float v11, v1, v7

    if-ltz v11, :cond_5

    cmpl-float v11, v1, v8

    if-lez v11, :cond_6

    :cond_5
    move/from16 p2, v9

    goto/16 :goto_5

    :cond_6
    array-length v4, v3

    move v7, v5

    move v8, v7

    :goto_1
    if-ge v7, v4, :cond_d

    move v11, v5

    move v12, v11

    :goto_2
    add-int/lit8 v13, v10, -0x1

    if-ge v11, v13, :cond_9

    aget-object v13, v3, v7

    aget-object v13, v13, v12

    iget v14, v13, Ld0/t;->b:F

    cmpg-float v14, v1, v14

    if-gtz v14, :cond_8

    iget-boolean v8, v13, Ld0/t;->p:Z

    if-eqz v8, :cond_7

    iget v8, v13, Ld0/t;->a:F

    sub-float v14, v1, v8

    iget v15, v13, Ld0/t;->k:F

    mul-float/2addr v14, v15

    iget v5, v13, Ld0/t;->c:F

    move/from16 p2, v9

    iget v9, v13, Ld0/t;->e:F

    invoke-static {v9, v5, v14, v5}, Lb9/y;->a(FFFF)F

    move-result v5

    aput v5, v2, v11

    add-int/lit8 v5, v11, 0x1

    sub-float v8, v1, v8

    mul-float/2addr v8, v15

    iget v9, v13, Ld0/t;->d:F

    iget v13, v13, Ld0/t;->f:F

    invoke-static {v13, v9, v8, v9}, Lb9/y;->a(FFFF)F

    move-result v8

    aput v8, v2, v5

    goto :goto_3

    :cond_7
    move/from16 p2, v9

    invoke-virtual {v13, v1}, Ld0/t;->c(F)V

    iget v5, v13, Ld0/t;->q:F

    iget v8, v13, Ld0/t;->n:F

    iget v9, v13, Ld0/t;->h:F

    mul-float/2addr v8, v9

    add-float/2addr v8, v5

    aput v8, v2, v11

    add-int/lit8 v5, v11, 0x1

    iget v8, v13, Ld0/t;->r:F

    iget v9, v13, Ld0/t;->o:F

    iget v13, v13, Ld0/t;->i:F

    mul-float/2addr v9, v13

    add-float/2addr v9, v8

    aput v9, v2, v5

    :goto_3
    move/from16 v8, p2

    goto :goto_4

    :cond_8
    move/from16 p2, v9

    :goto_4
    add-int/lit8 v11, v11, 0x2

    add-int/lit8 v12, v12, 0x1

    move/from16 v9, p2

    const/4 v5, 0x0

    goto :goto_2

    :cond_9
    move/from16 p2, v9

    if-eqz v8, :cond_a

    goto/16 :goto_9

    :cond_a
    add-int/lit8 v7, v7, 0x1

    move/from16 v9, p2

    const/4 v5, 0x0

    goto :goto_1

    :goto_5
    cmpl-float v5, v1, v8

    if-lez v5, :cond_b

    move v7, v8

    goto :goto_6

    :cond_b
    const/4 v4, 0x0

    :goto_6
    sub-float/2addr v1, v7

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_7
    add-int/lit8 v9, v10, -0x1

    if-ge v5, v9, :cond_d

    aget-object v9, v3, v4

    aget-object v9, v9, v8

    iget-boolean v11, v9, Ld0/t;->p:Z

    iget v12, v9, Ld0/t;->r:F

    iget v13, v9, Ld0/t;->q:F

    if-eqz v11, :cond_c

    iget v11, v9, Ld0/t;->a:F

    sub-float v14, v7, v11

    iget v15, v9, Ld0/t;->k:F

    mul-float/2addr v14, v15

    move/from16 p3, v1

    iget v1, v9, Ld0/t;->c:F

    move-object/from16 p4, v3

    iget v3, v9, Ld0/t;->e:F

    invoke-static {v3, v1, v14, v1}, Lb9/y;->a(FFFF)F

    move-result v1

    mul-float v3, p3, v13

    add-float/2addr v3, v1

    aput v3, v2, v5

    add-int/lit8 v1, v5, 0x1

    sub-float v3, v7, v11

    mul-float/2addr v3, v15

    iget v11, v9, Ld0/t;->d:F

    iget v9, v9, Ld0/t;->f:F

    invoke-static {v9, v11, v3, v11}, Lb9/y;->a(FFFF)F

    move-result v3

    mul-float v9, p3, v12

    add-float/2addr v9, v3

    aput v9, v2, v1

    goto :goto_8

    :cond_c
    move/from16 p3, v1

    move-object/from16 p4, v3

    invoke-virtual {v9, v7}, Ld0/t;->c(F)V

    iget v1, v9, Ld0/t;->n:F

    iget v3, v9, Ld0/t;->h:F

    mul-float/2addr v1, v3

    add-float/2addr v1, v13

    invoke-virtual {v9}, Ld0/t;->a()F

    move-result v3

    mul-float v3, v3, p3

    add-float/2addr v3, v1

    aput v3, v2, v5

    add-int/lit8 v1, v5, 0x1

    iget v3, v9, Ld0/t;->o:F

    iget v11, v9, Ld0/t;->i:F

    mul-float/2addr v3, v11

    add-float/2addr v3, v12

    invoke-virtual {v9}, Ld0/t;->b()F

    move-result v9

    mul-float v9, v9, p3

    add-float/2addr v9, v3

    aput v9, v2, v1

    :goto_8
    add-int/lit8 v5, v5, 0x2

    add-int/lit8 v8, v8, 0x1

    move/from16 v1, p3

    move-object/from16 v3, p4

    goto :goto_7

    :cond_d
    :goto_9
    array-length v1, v2

    const/4 v5, 0x0

    :goto_a
    if-ge v5, v1, :cond_13

    aget v3, v2, v5

    invoke-virtual {v6, v3, v5}, Ld0/r;->e(FI)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_e
    move/from16 p2, v9

    invoke-virtual {v0, v3}, Ld0/n2;->b(I)I

    move-result v5

    move/from16 v7, p2

    invoke-virtual {v0, v5, v3, v7}, Ld0/n2;->d(IIZ)F

    move-result v3

    iget-object v7, v0, Ld0/n2;->w:La0/f0;

    invoke-virtual {v7, v5}, La0/f0;->c(I)I

    move-result v8

    invoke-virtual {v4, v8}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ld0/m2;

    if-eqz v8, :cond_10

    iget-object v8, v8, Ld0/m2;->a:Ld0/r;

    if-nez v8, :cond_f

    goto :goto_b

    :cond_f
    move-object v1, v8

    :cond_10
    :goto_b
    const/4 v8, 0x1

    add-int/2addr v5, v8

    invoke-virtual {v7, v5}, La0/f0;->c(I)I

    move-result v5

    invoke-virtual {v4, v5}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/m2;

    if-eqz v4, :cond_12

    iget-object v4, v4, Ld0/m2;->a:Ld0/r;

    if-nez v4, :cond_11

    goto :goto_c

    :cond_11
    move-object v2, v4

    :cond_12
    :goto_c
    invoke-virtual {v6}, Ld0/r;->b()I

    move-result v4

    const/4 v5, 0x0

    :goto_d
    if-ge v5, v4, :cond_13

    invoke-virtual {v1, v5}, Ld0/r;->a(I)F

    move-result v7

    invoke-virtual {v2, v5}, Ld0/r;->a(I)F

    move-result v8

    const/4 v9, 0x1

    int-to-float v10, v9

    sub-float/2addr v10, v3

    mul-float/2addr v10, v7

    mul-float/2addr v8, v3

    add-float/2addr v8, v10

    invoke-virtual {v6, v8, v5}, Ld0/r;->e(FI)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    :cond_13
    return-object v6
.end method

.method public final i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Ld0/n2;->y:I

    return v0
.end method

.method public final m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 14

    move-object/from16 v5, p5

    const-wide/32 v6, 0xf4240

    div-long v0, p1, v6

    sget-object v2, Ld0/h2;->a:[I

    const/4 v8, 0x0

    int-to-long v2, v8

    sub-long/2addr v0, v2

    iget v2, p0, Ld0/n2;->y:I

    int-to-long v2, v2

    const-wide/16 v9, 0x0

    cmp-long v4, v0, v9

    if-gez v4, :cond_0

    move-wide v0, v9

    :cond_0
    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    move-wide v11, v2

    goto :goto_0

    :cond_1
    move-wide v11, v0

    :goto_0
    cmp-long v0, v11, v9

    if-gez v0, :cond_2

    return-object v5

    :cond_2
    move-object/from16 v3, p3

    move-object/from16 v4, p4

    invoke-virtual {p0, v3, v4, v5}, Ld0/n2;->e(Ld0/r;Ld0/r;Ld0/r;)V

    iget-object v9, p0, Ld0/n2;->H:Ld0/r;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Ld0/n2;->M:Laj/d;

    sget-object v1, Ld0/h2;->c:Laj/d;

    if-eq v0, v1, :cond_a

    long-to-int v0, v11

    invoke-virtual {p0, v0}, Ld0/n2;->b(I)I

    move-result v1

    invoke-virtual {p0, v1, v0, v8}, Ld0/n2;->d(IIZ)F

    move-result v0

    iget-object v1, p0, Ld0/n2;->L:[F

    iget-object v2, p0, Ld0/n2;->M:Laj/d;

    iget-object v2, v2, Laj/d;->w:Ljava/lang/Object;

    check-cast v2, [[Ld0/t;

    aget-object v3, v2, v8

    aget-object v3, v3, v8

    iget v3, v3, Ld0/t;->a:F

    array-length v4, v2

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    aget-object v4, v2, v4

    aget-object v4, v4, v8

    iget v4, v4, Ld0/t;->b:F

    cmpg-float v6, v0, v3

    if-gez v6, :cond_3

    move v0, v3

    :cond_3
    cmpl-float v3, v0, v4

    if-lez v3, :cond_4

    goto :goto_1

    :cond_4
    move v4, v0

    :goto_1
    array-length v0, v1

    array-length v3, v2

    move v6, v8

    move v7, v6

    :goto_2
    if-ge v6, v3, :cond_9

    move v10, v8

    move v11, v10

    :goto_3
    add-int/lit8 v12, v0, -0x1

    if-ge v10, v12, :cond_7

    aget-object v12, v2, v6

    aget-object v12, v12, v11

    iget v13, v12, Ld0/t;->b:F

    cmpg-float v13, v4, v13

    if-gtz v13, :cond_6

    iget-boolean v7, v12, Ld0/t;->p:Z

    if-eqz v7, :cond_5

    iget v7, v12, Ld0/t;->q:F

    aput v7, v1, v10

    add-int/lit8 v7, v10, 0x1

    iget v12, v12, Ld0/t;->r:F

    aput v12, v1, v7

    goto :goto_4

    :cond_5
    invoke-virtual {v12, v4}, Ld0/t;->c(F)V

    invoke-virtual {v12}, Ld0/t;->a()F

    move-result v7

    aput v7, v1, v10

    add-int/lit8 v7, v10, 0x1

    invoke-virtual {v12}, Ld0/t;->b()F

    move-result v12

    aput v12, v1, v7

    :goto_4
    move v7, v5

    :cond_6
    add-int/lit8 v10, v10, 0x2

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_7
    if-eqz v7, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_9
    :goto_5
    array-length v0, v1

    :goto_6
    if-ge v8, v0, :cond_b

    aget v2, v1, v8

    invoke-virtual {v9, v2, v8}, Ld0/r;->e(FI)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_a
    const-wide/16 v0, 0x1

    sub-long v0, v11, v0

    mul-long v1, v0, v6

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Ld0/n2;->h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object v10

    mul-long v1, v11, v6

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    invoke-virtual/range {v0 .. v5}, Ld0/n2;->h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object v1

    invoke-virtual {v10}, Ld0/r;->b()I

    move-result v0

    :goto_7
    if-ge v8, v0, :cond_b

    invoke-virtual {v10, v8}, Ld0/r;->a(I)F

    move-result v2

    invoke-virtual {v1, v8}, Ld0/r;->a(I)F

    move-result v3

    sub-float/2addr v2, v3

    const/high16 v3, 0x447a0000    # 1000.0f

    mul-float/2addr v2, v3

    invoke-virtual {v9, v2, v8}, Ld0/r;->e(FI)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_b
    return-object v9
.end method
