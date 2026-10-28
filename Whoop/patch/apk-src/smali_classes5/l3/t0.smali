.class public final Ll3/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp3/h;

.field public final b:Ly3/c;

.field public final c:Ly3/m;

.field public final d:Lgm/r;


# direct methods
.method public constructor <init>(Lp3/h;Ly3/c;Ly3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/t0;->a:Lp3/h;

    iput-object p2, p0, Ll3/t0;->b:Ly3/c;

    iput-object p3, p0, Ll3/t0;->c:Ly3/m;

    new-instance p1, Lgm/r;

    invoke-direct {p1}, Lgm/r;-><init>()V

    iput-object p1, p0, Ll3/t0;->d:Lgm/r;

    return-void
.end method

.method public static a(Ll3/t0;Ljava/lang/String;Ll3/v0;I)Ll3/r0;
    .locals 25

    move-object/from16 v0, p0

    and-int/lit8 v1, p3, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    move v9, v3

    goto :goto_0

    :cond_0
    move v9, v2

    :goto_0
    and-int/lit8 v1, p3, 0x10

    const v16, 0x7fffffff

    if-eqz v1, :cond_1

    move/from16 v14, v16

    goto :goto_1

    :cond_1
    move v14, v3

    :goto_1
    const/16 v1, 0xf

    invoke-static {v2, v2, v1}, Ly3/b;->b(III)J

    move-result-wide v3

    iget-object v12, v0, Ll3/t0;->c:Ly3/m;

    iget-object v11, v0, Ll3/t0;->b:Ly3/c;

    iget-object v13, v0, Ll3/t0;->a:Lp3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ll3/g;

    move-object/from16 v1, p1

    invoke-direct {v5, v1}, Ll3/g;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ll3/t0;->d:Lgm/r;

    move v8, v14

    move-wide v14, v3

    new-instance v4, Ll3/q0;

    sget-object v20, Lm83/y;->w:Lm83/y;

    const/4 v10, 0x1

    move-object/from16 v6, p2

    move-object/from16 v7, v20

    invoke-direct/range {v4 .. v15}, Ll3/q0;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;IZILy3/c;Ly3/m;Lp3/h;J)V

    move-object v1, v4

    move-object/from16 v18, v5

    move-object/from16 v21, v11

    move-wide v3, v14

    move v15, v10

    const/4 v5, 0x0

    if-eqz v0, :cond_5

    new-instance v6, Ll3/n;

    invoke-direct {v6, v1}, Ll3/n;-><init>(Ll3/q0;)V

    iget-object v7, v0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v7, La0/a0;

    if-eqz v7, :cond_2

    invoke-virtual {v7, v6}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll3/r0;

    goto :goto_2

    :cond_2
    iget-object v7, v0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v7, Ll3/n;

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, v0, Lgm/r;->z:Ljava/lang/Object;

    check-cast v6, Ll3/r0;

    :goto_2
    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    iget-object v7, v6, Ll3/r0;->b:Ll3/w;

    iget-object v7, v7, Ll3/w;->a:Laa3/i1;

    invoke-virtual {v7}, Laa3/i1;->b()Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    move-object v5, v6

    :cond_5
    :goto_3
    const/16 v6, 0x20

    const-wide v23, 0xffffffffL

    if-eqz v5, :cond_6

    iget-object v0, v5, Ll3/r0;->b:Ll3/w;

    iget v2, v0, Ll3/w;->d:F

    float-to-double v7, v2

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-float v2, v7

    float-to-int v2, v2

    iget v5, v0, Ll3/w;->e:F

    float-to-double v7, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-float v5, v7

    float-to-int v5, v5

    int-to-long v7, v2

    shl-long v6, v7, v6

    int-to-long v8, v5

    and-long v8, v8, v23

    or-long v5, v6, v8

    invoke-static {v3, v4, v5, v6}, Ly3/b;->d(JJ)J

    move-result-wide v2

    new-instance v4, Ll3/r0;

    invoke-direct {v4, v1, v0, v2, v3}, Ll3/r0;-><init>(Ll3/q0;Ll3/w;J)V

    return-object v4

    :cond_6
    move-object/from16 v5, p2

    invoke-static {v5, v12}, Ljc/x;->p0(Ll3/v0;Ly3/m;)Ll3/v0;

    move-result-object v19

    new-instance v17, Laa3/i1;

    move-object/from16 v22, v13

    invoke-direct/range {v17 .. v22}, Laa3/i1;-><init>(Ll3/g;Ll3/v0;Ljava/util/List;Ly3/c;Lp3/h;)V

    invoke-static {v3, v4}, Ly3/a;->k(J)I

    move-result v5

    if-nez v9, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {v3, v4}, Ly3/a;->e(J)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-static {v3, v4}, Ly3/a;->i(J)I

    move-result v16

    :cond_8
    :goto_4
    move/from16 v7, v16

    if-ne v5, v7, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual/range {v17 .. v17}, Laa3/i1;->c()F

    move-result v9

    float-to-double v9, v9

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-float v9, v9

    float-to-int v9, v9

    invoke-static {v9, v5, v7}, Le93/b;->n(III)I

    move-result v7

    :goto_5
    new-instance v10, Ll3/w;

    invoke-static {v3, v4}, Ly3/a;->h(J)I

    move-result v5

    invoke-static {v2, v7, v2, v5}, Lva3/l;->n(IIII)J

    move-result-wide v12

    move v14, v8

    move-object/from16 v11, v17

    invoke-direct/range {v10 .. v15}, Ll3/w;-><init>(Laa3/i1;JII)V

    new-instance v2, Ll3/r0;

    iget v5, v10, Ll3/w;->d:F

    float-to-double v7, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-float v5, v7

    float-to-int v5, v5

    iget v7, v10, Ll3/w;->e:F

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-float v7, v7

    float-to-int v7, v7

    int-to-long v8, v5

    shl-long v5, v8, v6

    int-to-long v7, v7

    and-long v7, v7, v23

    or-long/2addr v5, v7

    invoke-static {v3, v4, v5, v6}, Ly3/b;->d(JJ)J

    move-result-wide v3

    invoke-direct {v2, v1, v10, v3, v4}, Ll3/r0;-><init>(Ll3/q0;Ll3/w;J)V

    if-eqz v0, :cond_b

    iget-object v3, v0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v3, La0/a0;

    if-eqz v3, :cond_a

    new-instance v0, Ll3/n;

    invoke-direct {v0, v1}, Ll3/n;-><init>(Ll3/q0;)V

    invoke-virtual {v3, v0, v2}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_a
    new-instance v3, Ll3/n;

    invoke-direct {v3, v1}, Ll3/n;-><init>(Ll3/q0;)V

    iput-object v3, v0, Lgm/r;->y:Ljava/lang/Object;

    iput-object v2, v0, Lgm/r;->z:Ljava/lang/Object;

    :cond_b
    return-object v2
.end method
