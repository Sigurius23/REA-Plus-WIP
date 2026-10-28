.class public final Lg1/i8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg1/i8;

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg1/i8;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg1/i8;->a:Lg1/i8;

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Lg1/i8;->b:F

    const/16 v0, 0x118

    int-to-float v0, v0

    sput v0, Lg1/i8;->c:F

    const/4 v0, 0x1

    int-to-float v0, v0

    sput v0, Lg1/i8;->d:F

    const/4 v0, 0x2

    int-to-float v0, v0

    sput v0, Lg1/i8;->e:F

    return-void
.end method

.method public static d(Landroidx/compose/runtime/Composer;)Lt0/a;
    .locals 1

    sget-object v0, Lg1/m5;->a:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/l5;

    iget-object p0, p0, Lg1/l5;->a:Lt0/a;

    return-object p0
.end method

.method public static e(Landroidx/compose/runtime/Composer;)Lt0/a;
    .locals 7

    sget-object v0, Lg1/m5;->a:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/l5;

    iget-object v0, p0, Lg1/l5;->a:Lt0/a;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-object v3, Lt0/d;->a:Lt0/c;

    move-object v4, v3

    invoke-static/range {v0 .. v6}, Lt0/a;->d(Lt0/a;Lt0/b;Lt0/b;Lt0/b;Lt0/b;ILjava/lang/Object;)Lt0/a;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroidx/compose/ui/Modifier;ZZLj0/i;Lg1/e8;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Lg1/h8;

    invoke-direct {v0, p1, p2, p3, p4}, Lg1/h8;-><init>(ZZLj0/i;Lg1/e8;)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static g(JJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;
    .locals 46

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lg1/l1;->a:Lp1/b0;

    move-object/from16 v2, p16

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v3, v1, Li2/x;->a:J

    sget-object v1, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v1

    move-wide v4, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p0

    :goto_0
    and-int/lit8 v1, v0, 0x2

    const v2, 0x3ec28f5c    # 0.38f

    if-eqz v1, :cond_2

    sget-object v1, Lg1/l1;->a:Lp1/b0;

    move-object/from16 v3, p16

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v6, v1, Li2/x;->a:J

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v6, v7}, Li2/w0;->x(J)F

    goto :goto_1

    :cond_1
    invoke-static {v6, v7}, Li2/w0;->x(J)F

    :goto_1
    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v6

    goto :goto_2

    :cond_2
    move-wide/from16 v6, p2

    :goto_2
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_3

    sget-wide v8, Li2/x;->m:J

    move-wide/from16 v32, v8

    goto :goto_3

    :cond_3
    move-wide/from16 v32, p4

    :goto_3
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_4

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v3, p16

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->f()J

    move-result-wide v8

    goto :goto_4

    :cond_4
    move-wide/from16 v8, p6

    :goto_4
    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v3, p16

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->c()J

    move-result-wide v10

    and-int/lit8 v3, v0, 0x20

    if-eqz v3, :cond_7

    move-object/from16 v3, p16

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lg1/c1;

    invoke-virtual/range {v16 .. v16}, Lg1/c1;->f()J

    move-result-wide v12

    const-wide/high16 p2, 0x3fe0000000000000L    # 0.5

    sget-object v14, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v3, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Li2/x;

    iget-wide v14, v14, Li2/x;->a:J

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->i()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v14, v15}, Li2/w0;->x(J)F

    move-result v3

    float-to-double v14, v3

    cmpl-double v3, v14, p2

    if-lez v3, :cond_6

    goto :goto_5

    :cond_5
    invoke-static {v14, v15}, Li2/w0;->x(J)F

    move-result v3

    float-to-double v14, v3

    cmpg-double v3, v14, p2

    if-gez v3, :cond_6

    :goto_5
    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_6
    const v3, 0x3f5eb852    # 0.87f

    :goto_6
    invoke-static {v3, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    goto :goto_7

    :cond_7
    const-wide/high16 p2, 0x3fe0000000000000L    # 0.5

    move-wide/from16 v12, p8

    :goto_7
    and-int/lit8 v3, v0, 0x40

    if-eqz v3, :cond_9

    move-object/from16 v3, p16

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lg1/c1;

    invoke-virtual {v14}, Lg1/c1;->e()J

    move-result-wide v14

    sget-object v2, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    move-wide/from16 v17, v4

    iget-wide v4, v2, Li2/x;->a:J

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {v4, v5}, Li2/w0;->x(J)F

    :goto_8
    const v2, 0x3ec28f5c    # 0.38f

    goto :goto_9

    :cond_8
    invoke-static {v4, v5}, Li2/w0;->x(J)F

    goto :goto_8

    :goto_9
    invoke-static {v2, v14, v15}, Li2/x;->c(FJ)J

    move-result-wide v3

    move-wide v14, v3

    goto :goto_a

    :cond_9
    move-wide/from16 v17, v4

    move-wide/from16 v14, p10

    :goto_a
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_b

    sget-object v2, Lg1/l1;->a:Lp1/b0;

    move-object/from16 v3, p16

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v4, v2, Li2/x;->a:J

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {v4, v5}, Li2/w0;->x(J)F

    :goto_b
    const v2, 0x3ec28f5c    # 0.38f

    goto :goto_c

    :cond_a
    invoke-static {v4, v5}, Li2/w0;->x(J)F

    goto :goto_b

    :goto_c
    invoke-static {v2, v14, v15}, Li2/x;->c(FJ)J

    move-result-wide v3

    goto :goto_d

    :cond_b
    move-wide/from16 v3, p12

    :goto_d
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_c

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->c()J

    move-result-wide v19

    goto :goto_e

    :cond_c
    move-wide/from16 v19, p14

    :goto_e
    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    move-wide/from16 p4, v3

    invoke-virtual {v0}, Lg1/c1;->e()J

    move-result-wide v2

    const v0, 0x3f0a3d71    # 0.54f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    sget-object v4, Lg1/l1;->a:Lp1/b0;

    move-object/from16 v5, p16

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v0, v21

    check-cast v0, Li2/x;

    move-wide/from16 v21, v6

    iget-wide v6, v0, Li2/x;->a:J

    invoke-virtual {v5, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {v6, v7}, Li2/w0;->x(J)F

    :goto_f
    move-wide/from16 v6, v21

    const v0, 0x3ec28f5c    # 0.38f

    goto :goto_10

    :cond_d
    invoke-static {v6, v7}, Li2/w0;->x(J)F

    goto :goto_f

    :goto_10
    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v22

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    move-wide/from16 p7, v2

    invoke-virtual {v0}, Lg1/c1;->e()J

    move-result-wide v2

    const v0, 0x3f0a3d71    # 0.54f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    move-wide/from16 p9, v6

    iget-wide v5, v5, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v5, v6}, Li2/w0;->x(J)F

    :goto_11
    const v0, 0x3ec28f5c    # 0.38f

    goto :goto_12

    :cond_e
    invoke-static {v5, v6}, Li2/w0;->x(J)F

    goto :goto_11

    :goto_12
    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v28

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->c()J

    move-result-wide v30

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/c1;

    invoke-virtual {v5}, Lg1/c1;->f()J

    move-result-wide v5

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    move-wide/from16 v26, v2

    iget-wide v2, v7, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpl-double v0, v2, p2

    if-lez v0, :cond_10

    goto :goto_13

    :cond_f
    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpg-double v0, v2, p2

    if-gez v0, :cond_10

    :goto_13
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_14

    :cond_10
    const v0, 0x3f5eb852    # 0.87f

    :goto_14
    invoke-static {v0, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v34

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->e()J

    move-result-wide v2

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v5, v5, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    const v21, 0x3f3d70a4    # 0.74f

    if-eqz v0, :cond_11

    invoke-static {v5, v6}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v5, v0

    cmpl-double v0, v5, p2

    if-lez v0, :cond_12

    goto :goto_15

    :cond_11
    invoke-static {v5, v6}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v5, v0

    cmpg-double v0, v5, p2

    if-gez v0, :cond_12

    :goto_15
    move/from16 v0, v21

    goto :goto_16

    :cond_12
    const v0, 0x3f19999a    # 0.6f

    :goto_16
    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v5, v5, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {v5, v6}, Li2/w0;->x(J)F

    :goto_17
    const v0, 0x3ec28f5c    # 0.38f

    goto :goto_18

    :cond_13
    invoke-static {v5, v6}, Li2/w0;->x(J)F

    goto :goto_17

    :goto_18
    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v38

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->c()J

    move-result-wide v40

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/c1;

    invoke-virtual {v5}, Lg1/c1;->e()J

    move-result-wide v5

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v24

    move-object/from16 v7, v24

    check-cast v7, Li2/x;

    move-wide/from16 v36, v2

    iget-wide v2, v7, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpl-double v0, v2, p2

    if-lez v0, :cond_15

    goto :goto_19

    :cond_14
    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpg-double v0, v2, p2

    if-gez v0, :cond_15

    :goto_19
    move/from16 v7, v21

    goto :goto_1a

    :cond_15
    const v7, 0x3f19999a    # 0.6f

    :goto_1a
    invoke-static {v7, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v2

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    iget-wide v4, v4, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {v4, v5}, Li2/w0;->x(J)F

    :goto_1b
    const v0, 0x3ec28f5c    # 0.38f

    goto :goto_1c

    :cond_16
    invoke-static {v4, v5}, Li2/w0;->x(J)F

    goto :goto_1b

    :goto_1c
    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v44

    move-wide/from16 v42, v2

    new-instance v3, Lg1/y1;

    move-wide/from16 v24, p7

    move-wide/from16 v6, p9

    move-wide/from16 v4, v17

    move-wide/from16 v16, v19

    move-wide/from16 v18, p4

    move-wide/from16 v20, p7

    invoke-direct/range {v3 .. v45}, Lg1/y1;-><init>(JJJJJJJJJJJJJJJJJJJJJ)V

    return-object v3
.end method

.method public static h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;
    .locals 46

    move/from16 v0, p27

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lg1/l1;->a:Lp1/b0;

    move-object/from16 v2, p26

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v3, v1, Li2/x;->a:J

    sget-object v1, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v1

    move-wide v4, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p0

    :goto_0
    and-int/lit8 v1, v0, 0x2

    const v2, 0x3ec28f5c    # 0.38f

    if-eqz v1, :cond_2

    sget-object v1, Lg1/l1;->a:Lp1/b0;

    move-object/from16 v3, p26

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v6, v1, Li2/x;->a:J

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v6, v7}, Li2/w0;->x(J)F

    goto :goto_1

    :cond_1
    invoke-static {v6, v7}, Li2/w0;->x(J)F

    :goto_1
    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v6

    goto :goto_2

    :cond_2
    move-wide/from16 v6, p2

    :goto_2
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_3

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v3, p26

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->e()J

    move-result-wide v8

    const v1, 0x3df5c28f    # 0.12f

    invoke-static {v1, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v8

    move-wide/from16 v32, v8

    goto :goto_3

    :cond_3
    move-wide/from16 v32, p4

    :goto_3
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_4

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v3, p26

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->f()J

    move-result-wide v8

    goto :goto_4

    :cond_4
    move-wide/from16 v8, p6

    :goto_4
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_5

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v3, p26

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->c()J

    move-result-wide v10

    goto :goto_5

    :cond_5
    move-wide/from16 v10, p8

    :goto_5
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_8

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v15, p26

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lg1/c1;

    move-wide/from16 v17, v4

    invoke-virtual/range {v16 .. v16}, Lg1/c1;->f()J

    move-result-wide v3

    sget-object v5, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v15, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    const-wide/high16 p2, 0x3fe0000000000000L    # 0.5

    iget-wide v12, v5, Li2/x;->a:J

    invoke-virtual {v15, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->i()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {v12, v13}, Li2/w0;->x(J)F

    move-result v1

    float-to-double v12, v1

    cmpl-double v1, v12, p2

    if-lez v1, :cond_7

    goto :goto_6

    :cond_6
    invoke-static {v12, v13}, Li2/w0;->x(J)F

    move-result v1

    float-to-double v12, v1

    cmpg-double v1, v12, p2

    if-gez v1, :cond_7

    :goto_6
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_7

    :cond_7
    const v1, 0x3f5eb852    # 0.87f

    :goto_7
    invoke-static {v1, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    move-wide v12, v3

    goto :goto_8

    :cond_8
    move-wide/from16 v17, v4

    const-wide/high16 p2, 0x3fe0000000000000L    # 0.5

    move-wide/from16 v12, p10

    :goto_8
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_9

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v3, p26

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->e()J

    move-result-wide v3

    const v1, 0x3ed70a3d    # 0.42f

    invoke-static {v1, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    move-wide v14, v3

    goto :goto_9

    :cond_9
    move-wide/from16 v14, p12

    :goto_9
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_b

    sget-object v1, Lg1/l1;->a:Lp1/b0;

    move-object/from16 v3, p26

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v4, v1, Li2/x;->a:J

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->i()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {v4, v5}, Li2/w0;->x(J)F

    goto :goto_a

    :cond_a
    invoke-static {v4, v5}, Li2/w0;->x(J)F

    :goto_a
    invoke-static {v2, v14, v15}, Li2/x;->c(FJ)J

    move-result-wide v3

    goto :goto_b

    :cond_b
    move-wide/from16 v3, p14

    :goto_b
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_c

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v5, p26

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->c()J

    move-result-wide v19

    goto :goto_c

    :cond_c
    move-wide/from16 v19, p16

    :goto_c
    sget-object v1, Lg1/d1;->a:Lp1/u2;

    move-object/from16 v5, p26

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/c1;

    move-wide/from16 p4, v3

    invoke-virtual {v5}, Lg1/c1;->e()J

    move-result-wide v2

    const v4, 0x3f0a3d71    # 0.54f

    invoke-static {v4, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    sget-object v5, Lg1/l1;->a:Lp1/b0;

    move-object/from16 v4, p26

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v0, v21

    check-cast v0, Li2/x;

    move-wide/from16 v21, v6

    iget-wide v6, v0, Li2/x;->a:J

    invoke-virtual {v4, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {v6, v7}, Li2/w0;->x(J)F

    :goto_d
    move-wide/from16 v6, v21

    const v0, 0x3ec28f5c    # 0.38f

    goto :goto_e

    :cond_d
    invoke-static {v6, v7}, Li2/w0;->x(J)F

    goto :goto_d

    :goto_e
    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v22

    move-object/from16 v0, p26

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    move-wide/from16 p7, v2

    invoke-virtual {v0}, Lg1/c1;->e()J

    move-result-wide v2

    const v0, 0x3f0a3d71    # 0.54f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    move-object/from16 v0, p26

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    move-wide/from16 p9, v6

    iget-wide v6, v4, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {v6, v7}, Li2/w0;->x(J)F

    :goto_f
    const v0, 0x3ec28f5c    # 0.38f

    goto :goto_10

    :cond_e
    invoke-static {v6, v7}, Li2/w0;->x(J)F

    goto :goto_f

    :goto_10
    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v28

    move-object/from16 v0, p26

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->c()J

    move-result-wide v30

    const v0, 0x8000

    and-int v0, p27, v0

    if-eqz v0, :cond_11

    move-object/from16 v0, p26

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->f()J

    move-result-wide v6

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    move-wide/from16 v26, v2

    iget-wide v2, v4, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpl-double v0, v2, p2

    if-lez v0, :cond_10

    goto :goto_11

    :cond_f
    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpg-double v0, v2, p2

    if-gez v0, :cond_10

    :goto_11
    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_12

    :cond_10
    const v3, 0x3f5eb852    # 0.87f

    :goto_12
    invoke-static {v3, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v2

    move-wide/from16 v34, v2

    goto :goto_13

    :cond_11
    move-wide/from16 v26, v2

    move-wide/from16 v34, p18

    :goto_13
    const/high16 v0, 0x10000

    and-int v0, p27, v0

    if-eqz v0, :cond_14

    move-object/from16 v0, p26

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->e()J

    move-result-wide v6

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    iget-wide v2, v4, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpl-double v0, v2, p2

    if-lez v0, :cond_13

    goto :goto_14

    :cond_12
    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpg-double v0, v2, p2

    if-gez v0, :cond_13

    :goto_14
    const v0, 0x3f3d70a4    # 0.74f

    goto :goto_15

    :cond_13
    const v0, 0x3f19999a    # 0.6f

    :goto_15
    invoke-static {v0, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v2

    goto :goto_16

    :cond_14
    move-wide/from16 v2, p20

    :goto_16
    move-object/from16 v0, p26

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    iget-wide v6, v4, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {v6, v7}, Li2/w0;->x(J)F

    :goto_17
    const v0, 0x3ec28f5c    # 0.38f

    goto :goto_18

    :cond_15
    invoke-static {v6, v7}, Li2/w0;->x(J)F

    goto :goto_17

    :goto_18
    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v38

    move-object/from16 v0, p26

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->c()J

    move-result-wide v40

    const/high16 v0, 0x80000

    and-int v0, p27, v0

    if-eqz v0, :cond_18

    move-object/from16 v0, p26

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->e()J

    move-result-wide v6

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    move-wide/from16 v36, v2

    iget-wide v2, v4, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpl-double v0, v2, p2

    if-lez v0, :cond_17

    goto :goto_19

    :cond_16
    invoke-static {v2, v3}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v2, v0

    cmpg-double v0, v2, p2

    if-gez v0, :cond_17

    :goto_19
    const v2, 0x3f3d70a4    # 0.74f

    goto :goto_1a

    :cond_17
    const v2, 0x3f19999a    # 0.6f

    :goto_1a
    invoke-static {v2, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v2

    goto :goto_1b

    :cond_18
    move-wide/from16 v36, v2

    move-wide/from16 v2, p22

    :goto_1b
    const/high16 v0, 0x100000

    and-int v0, p27, v0

    if-eqz v0, :cond_1a

    move-object/from16 v0, p26

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    iget-wide v4, v4, Li2/x;->a:J

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {v4, v5}, Li2/w0;->x(J)F

    :goto_1c
    const v0, 0x3ec28f5c    # 0.38f

    goto :goto_1d

    :cond_19
    invoke-static {v4, v5}, Li2/w0;->x(J)F

    goto :goto_1c

    :goto_1d
    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v0

    move-wide/from16 v44, v0

    :goto_1e
    move-wide/from16 v42, v2

    goto :goto_1f

    :cond_1a
    move-wide/from16 v44, p24

    goto :goto_1e

    :goto_1f
    new-instance v3, Lg1/y1;

    move-wide/from16 v24, p7

    move-wide/from16 v6, p9

    move-wide/from16 v4, v17

    move-wide/from16 v16, v19

    move-wide/from16 v18, p4

    move-wide/from16 v20, p7

    invoke-direct/range {v3 .. v45}, Lg1/y1;-><init>(JJJJJJJJJJJJJJJJJJJJJ)V

    return-object v3
.end method


# virtual methods
.method public final a(ZZLj0/i;Lg1/e8;Li2/a1;FFLandroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v6, p5

    move-object/from16 v13, p8

    check-cast v13, Lp1/q;

    const v0, 0x38408b26

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    move/from16 v7, p1

    invoke-virtual {v13, v7}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p9, v0

    move/from16 v8, p2

    invoke-virtual {v13, v8}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    move-object/from16 v9, p3

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    move-object/from16 v5, p4

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x800

    goto :goto_3

    :cond_3
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x4000

    goto :goto_4

    :cond_4
    const/16 v1, 0x2000

    :goto_4
    or-int/2addr v0, v1

    const/high16 v1, 0x30000

    and-int v1, p9, v1

    if-nez v1, :cond_7

    and-int/lit8 v1, p10, 0x20

    if-nez v1, :cond_5

    move/from16 v1, p6

    invoke-virtual {v13, v1}, Lp1/q;->d(F)Z

    move-result v2

    if-eqz v2, :cond_6

    const/high16 v2, 0x20000

    goto :goto_5

    :cond_5
    move/from16 v1, p6

    :cond_6
    const/high16 v2, 0x10000

    :goto_5
    or-int/2addr v0, v2

    goto :goto_6

    :cond_7
    move/from16 v1, p6

    :goto_6
    const/high16 v2, 0x180000

    and-int v2, p9, v2

    if-nez v2, :cond_a

    and-int/lit8 v2, p10, 0x40

    if-nez v2, :cond_8

    move/from16 v2, p7

    invoke-virtual {v13, v2}, Lp1/q;->d(F)Z

    move-result v3

    if-eqz v3, :cond_9

    const/high16 v3, 0x100000

    goto :goto_7

    :cond_8
    move/from16 v2, p7

    :cond_9
    const/high16 v3, 0x80000

    :goto_7
    or-int/2addr v0, v3

    goto :goto_8

    :cond_a
    move/from16 v2, p7

    :goto_8
    const v3, 0x492493

    and-int/2addr v3, v0

    const v4, 0x492492

    const/4 v15, 0x0

    if-eq v3, v4, :cond_b

    const/4 v3, 0x1

    goto :goto_9

    :cond_b
    move v3, v15

    :goto_9
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v13, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v3, p9, 0x1

    const v4, -0x380001

    const v10, -0x70001

    if-eqz v3, :cond_f

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_b

    :cond_c
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v3, p10, 0x20

    if-eqz v3, :cond_d

    and-int/2addr v0, v10

    :cond_d
    and-int/lit8 v3, p10, 0x40

    if-eqz v3, :cond_e

    and-int/2addr v0, v4

    :cond_e
    :goto_a
    move v11, v1

    move v12, v2

    goto :goto_c

    :cond_f
    :goto_b
    and-int/lit8 v3, p10, 0x20

    if-eqz v3, :cond_10

    and-int/2addr v0, v10

    sget v1, Lg1/i8;->e:F

    :cond_10
    and-int/lit8 v3, p10, 0x40

    if-eqz v3, :cond_e

    and-int/2addr v0, v4

    sget v2, Lg1/i8;->d:F

    goto :goto_a

    :goto_c
    invoke-virtual {v13}, Lp1/q;->r()V

    and-int/lit16 v1, v0, 0x1ffe

    shr-int/lit8 v0, v0, 0x3

    const v2, 0xe000

    and-int/2addr v2, v0

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v0, v2

    or-int v14, v1, v0

    move-object v10, v5

    invoke-static/range {v7 .. v14}, Luf/c0;->y(ZZLj0/i;Lg1/e8;FFLandroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/t;

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v0, v6}, Lge3/g;->g(Landroidx/compose/ui/Modifier;Lf0/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v13, v15}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move v7, v11

    move v8, v12

    goto :goto_d

    :cond_11
    invoke-virtual {v13}, Lp1/q;->X()V

    move v7, v1

    move v8, v2

    :goto_d
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_12

    new-instance v0, Lg1/g8;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lg1/g8;-><init>(Lg1/i8;ZZLj0/i;Lg1/e8;Li2/a1;FFII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public final b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/e8;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 26

    move/from16 v0, p17

    move/from16 v1, p18

    move-object/from16 v2, p16

    check-cast v2, Lp1/q;

    const v3, 0x44d6c292

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_1

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p1

    move v6, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p2

    invoke-virtual {v2, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v6, v10

    goto :goto_3

    :cond_3
    move-object/from16 v7, p2

    :goto_3
    and-int/lit16 v10, v0, 0x180

    if-nez v10, :cond_5

    move/from16 v10, p3

    invoke-virtual {v2, v10}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x100

    goto :goto_4

    :cond_4
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v6, v13

    goto :goto_5

    :cond_5
    move/from16 v10, p3

    :goto_5
    and-int/lit16 v13, v0, 0xc00

    if-nez v13, :cond_7

    move/from16 v13, p4

    invoke-virtual {v2, v13}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x800

    goto :goto_6

    :cond_6
    const/16 v16, 0x400

    :goto_6
    or-int v6, v6, v16

    goto :goto_7

    :cond_7
    move/from16 v13, p4

    :goto_7
    and-int/lit16 v4, v0, 0x6000

    if-nez v4, :cond_9

    move-object/from16 v4, p5

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x4000

    goto :goto_8

    :cond_8
    const/16 v16, 0x2000

    :goto_8
    or-int v6, v6, v16

    goto :goto_9

    :cond_9
    move-object/from16 v4, p5

    :goto_9
    const/high16 v16, 0x30000

    and-int v17, v0, v16

    move-object/from16 v5, p6

    if-nez v17, :cond_b

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_a

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_a
    const/high16 v18, 0x10000

    :goto_a
    or-int v6, v6, v18

    :cond_b
    const/high16 v18, 0x180000

    and-int v18, v0, v18

    move/from16 v8, p7

    if-nez v18, :cond_d

    invoke-virtual {v2, v8}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_c

    const/high16 v19, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v19, 0x80000

    :goto_b
    or-int v6, v6, v19

    :cond_d
    and-int/lit16 v9, v1, 0x80

    const/high16 v20, 0xc00000

    if-eqz v9, :cond_e

    or-int v6, v6, v20

    move-object/from16 v11, p8

    goto :goto_d

    :cond_e
    and-int v20, v0, v20

    move-object/from16 v11, p8

    if-nez v20, :cond_10

    invoke-virtual {v2, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_f

    const/high16 v21, 0x800000

    goto :goto_c

    :cond_f
    const/high16 v21, 0x400000

    :goto_c
    or-int v6, v6, v21

    :cond_10
    :goto_d
    const/high16 v21, 0x6000000

    and-int v21, v0, v21

    move-object/from16 v12, p9

    if-nez v21, :cond_12

    invoke-virtual {v2, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_11

    const/high16 v22, 0x4000000

    goto :goto_e

    :cond_11
    const/high16 v22, 0x2000000

    :goto_e
    or-int v6, v6, v22

    :cond_12
    const/high16 v22, 0x30000000

    and-int v22, v0, v22

    move-object/from16 v14, p10

    if-nez v22, :cond_14

    invoke-virtual {v2, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_13

    const/high16 v23, 0x20000000

    goto :goto_f

    :cond_13
    const/high16 v23, 0x10000000

    :goto_f
    or-int v6, v6, v23

    :cond_14
    move/from16 v23, v9

    move-object/from16 v9, p11

    invoke-virtual {v2, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_15

    const/16 v17, 0x4

    goto :goto_10

    :cond_15
    const/16 v17, 0x2

    :goto_10
    const v24, 0x36000

    or-int v17, v24, v17

    move-object/from16 v15, p12

    invoke-virtual {v2, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_16

    const/16 v18, 0x20

    goto :goto_11

    :cond_16
    const/16 v18, 0x10

    :goto_11
    or-int v17, v17, v18

    move-object/from16 v0, p13

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_17

    const/16 v20, 0x100

    goto :goto_12

    :cond_17
    const/16 v20, 0x80

    :goto_12
    or-int v17, v17, v20

    and-int/lit16 v0, v1, 0x2000

    if-nez v0, :cond_18

    move-object/from16 v0, p14

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/16 v22, 0x800

    goto :goto_13

    :cond_18
    move-object/from16 v0, p14

    :cond_19
    const/16 v22, 0x400

    :goto_13
    or-int v0, v17, v22

    const v17, 0x12492493

    and-int v3, v6, v17

    const v4, 0x12492492

    if-ne v3, v4, :cond_1b

    const v3, 0x12493

    and-int/2addr v3, v0

    const v4, 0x12492

    if-eq v3, v4, :cond_1a

    goto :goto_14

    :cond_1a
    const/4 v3, 0x0

    goto :goto_15

    :cond_1b
    :goto_14
    const/4 v3, 0x1

    :goto_15
    and-int/lit8 v4, v6, 0x1

    invoke-virtual {v2, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-virtual {v2}, Lp1/q;->Z()V

    and-int/lit8 v3, p17, 0x1

    if-eqz v3, :cond_1e

    invoke-virtual {v2}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_1c

    goto :goto_16

    :cond_1c
    invoke-virtual {v2}, Lp1/q;->X()V

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_1d

    and-int/lit16 v0, v0, -0x1c01

    :cond_1d
    move-object/from16 v14, p14

    goto :goto_19

    :cond_1e
    :goto_16
    if-eqz v23, :cond_1f

    const/4 v3, 0x0

    goto :goto_17

    :cond_1f
    move-object v3, v11

    :goto_17
    and-int/lit16 v4, v1, 0x2000

    if-eqz v4, :cond_20

    sget v4, Lg1/p8;->a:F

    new-instance v11, Ll0/l1;

    invoke-direct {v11, v4, v4, v4, v4}, Ll0/l1;-><init>(FFFF)V

    and-int/lit16 v0, v0, -0x1c01

    goto :goto_18

    :cond_20
    move-object/from16 v11, p14

    :goto_18
    move-object v14, v11

    move-object v11, v3

    :goto_19
    invoke-virtual {v2}, Lp1/q;->r()V

    move-object/from16 v18, v2

    sget-object v2, Lg1/b9;->x:Lg1/b9;

    shl-int/lit8 v3, v6, 0x3

    and-int/lit8 v4, v3, 0x70

    or-int/lit8 v4, v4, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v4

    shr-int/lit8 v4, v6, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shr-int/lit8 v4, v6, 0x9

    const v17, 0xe000

    and-int v19, v4, v17

    or-int v3, v3, v19

    const/high16 v19, 0x70000

    and-int v19, v4, v19

    or-int v3, v3, v19

    const/high16 v19, 0x380000

    and-int v4, v4, v19

    or-int/2addr v3, v4

    shl-int/lit8 v4, v0, 0x15

    const/high16 v19, 0x1c00000

    and-int v4, v4, v19

    or-int/2addr v3, v4

    shl-int/lit8 v4, v6, 0xf

    const/high16 v19, 0xe000000

    and-int v4, v4, v19

    or-int/2addr v3, v4

    const/high16 v4, 0x70000000

    shl-int/lit8 v19, v6, 0x15

    and-int v4, v19, v4

    or-int v19, v3, v4

    shr-int/lit8 v3, v6, 0x12

    and-int/lit8 v3, v3, 0xe

    shr-int/lit8 v4, v6, 0xc

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v0, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v4, v0, 0x1c00

    or-int/2addr v3, v4

    and-int v0, v0, v17

    or-int/2addr v0, v3

    or-int v20, v0, v16

    move-object/from16 v3, p1

    move-object/from16 v16, p13

    move-object/from16 v17, p15

    move-object v4, v7

    move-object v6, v11

    move-object v7, v12

    move v12, v8

    move v11, v10

    move v10, v13

    move-object/from16 v8, p10

    move-object v13, v5

    move-object/from16 v5, p5

    invoke-static/range {v2 .. v20}, Lg1/p8;->a(Lg1/b9;Ljava/lang/String;Lc93/m;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Li2/a1;Lg1/e8;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v6

    move-object v15, v14

    goto :goto_1a

    :cond_21
    move-object/from16 v18, v2

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    move-object/from16 v15, p14

    move-object v9, v11

    :goto_1a
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_22

    move-object v2, v0

    new-instance v0, Lg1/f8;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, v1

    move-object/from16 v25, v2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v18}, Lg1/f8;-><init>(Lg1/i8;Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/e8;Ll0/k1;Lx1/b;II)V

    move-object/from16 v2, v25

    iput-object v0, v2, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method public final c(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;Ll0/k1;Landroidx/compose/runtime/Composer;III)V
    .locals 36

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v0, p16

    move-object/from16 v1, p13

    check-cast v1, Lp1/q;

    const v2, 0x7c7ffbf3

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v14

    goto :goto_1

    :cond_1
    move-object/from16 v2, p1

    move v5, v14

    :goto_1
    and-int/lit8 v6, v14, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p2

    invoke-virtual {v1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v5, v9

    goto :goto_3

    :cond_3
    move-object/from16 v6, p2

    :goto_3
    and-int/lit16 v9, v14, 0x180

    if-nez v9, :cond_5

    move/from16 v9, p3

    invoke-virtual {v1, v9}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x100

    goto :goto_4

    :cond_4
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    goto :goto_5

    :cond_5
    move/from16 v9, p3

    :goto_5
    and-int/lit16 v12, v14, 0xc00

    const/16 v16, 0x800

    if-nez v12, :cond_7

    move/from16 v12, p4

    invoke-virtual {v1, v12}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_6

    move/from16 v17, v16

    goto :goto_6

    :cond_6
    const/16 v17, 0x400

    :goto_6
    or-int v5, v5, v17

    goto :goto_7

    :cond_7
    move/from16 v12, p4

    :goto_7
    and-int/lit16 v3, v14, 0x6000

    if-nez v3, :cond_9

    move-object/from16 v3, p5

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_8

    const/16 v17, 0x4000

    goto :goto_8

    :cond_8
    const/16 v17, 0x2000

    :goto_8
    or-int v5, v5, v17

    goto :goto_9

    :cond_9
    move-object/from16 v3, p5

    :goto_9
    const/high16 v17, 0x30000

    and-int v18, v14, v17

    move-object/from16 v4, p6

    if-nez v18, :cond_b

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_a

    const/high16 v19, 0x20000

    goto :goto_a

    :cond_a
    const/high16 v19, 0x10000

    :goto_a
    or-int v5, v5, v19

    :cond_b
    and-int/lit8 v19, v0, 0x40

    const/4 v7, 0x0

    const/high16 v21, 0x180000

    if-eqz v19, :cond_c

    or-int v5, v5, v21

    goto :goto_c

    :cond_c
    and-int v19, v14, v21

    if-nez v19, :cond_e

    invoke-virtual {v1, v7}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_d

    const/high16 v19, 0x100000

    goto :goto_b

    :cond_d
    const/high16 v19, 0x80000

    :goto_b
    or-int v5, v5, v19

    :cond_e
    :goto_c
    and-int/lit16 v7, v0, 0x80

    const/high16 v21, 0xc00000

    if-eqz v7, :cond_f

    or-int v5, v5, v21

    move-object/from16 v8, p7

    goto :goto_e

    :cond_f
    and-int v21, v14, v21

    move-object/from16 v8, p7

    if-nez v21, :cond_11

    invoke-virtual {v1, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_10

    const/high16 v22, 0x800000

    goto :goto_d

    :cond_10
    const/high16 v22, 0x400000

    :goto_d
    or-int v5, v5, v22

    :cond_11
    :goto_e
    const/high16 v22, 0x6000000

    and-int v22, v14, v22

    move-object/from16 v10, p8

    if-nez v22, :cond_13

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_12

    const/high16 v23, 0x4000000

    goto :goto_f

    :cond_12
    const/high16 v23, 0x2000000

    :goto_f
    or-int v5, v5, v23

    :cond_13
    and-int/lit16 v11, v0, 0x200

    const/high16 v24, 0x30000000

    const/4 v13, 0x0

    if-eqz v11, :cond_14

    or-int v5, v5, v24

    goto :goto_11

    :cond_14
    and-int v11, v14, v24

    if-nez v11, :cond_16

    invoke-virtual {v1, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_15

    const/high16 v11, 0x20000000

    goto :goto_10

    :cond_15
    const/high16 v11, 0x10000000

    :goto_10
    or-int/2addr v5, v11

    :cond_16
    :goto_11
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_17

    or-int/lit8 v18, v15, 0x6

    move-object/from16 v13, p9

    goto :goto_13

    :cond_17
    move-object/from16 v13, p9

    invoke-virtual {v1, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_18

    const/16 v18, 0x4

    goto :goto_12

    :cond_18
    const/16 v18, 0x2

    :goto_12
    or-int v18, v15, v18

    :goto_13
    and-int/lit16 v2, v0, 0x800

    if-nez v2, :cond_19

    move-object/from16 v2, p10

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1a

    const/16 v20, 0x20

    goto :goto_14

    :cond_19
    move-object/from16 v2, p10

    :cond_1a
    const/16 v20, 0x10

    :goto_14
    or-int v18, v18, v20

    move-object/from16 v2, p11

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1b

    const/16 v22, 0x100

    goto :goto_15

    :cond_1b
    const/16 v22, 0x80

    :goto_15
    or-int v18, v18, v22

    and-int/lit16 v2, v15, 0xc00

    if-nez v2, :cond_1e

    and-int/lit16 v2, v0, 0x2000

    if-nez v2, :cond_1c

    move-object/from16 v2, p12

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1d

    goto :goto_16

    :cond_1c
    move-object/from16 v2, p12

    :cond_1d
    const/16 v16, 0x400

    :goto_16
    or-int v18, v18, v16

    :goto_17
    move/from16 v2, v18

    goto :goto_18

    :cond_1e
    move-object/from16 v2, p12

    goto :goto_17

    :goto_18
    const v16, 0x12492493

    and-int v3, v5, v16

    const v4, 0x12492492

    if-ne v3, v4, :cond_20

    and-int/lit16 v3, v2, 0x2493

    const/16 v4, 0x2492

    if-eq v3, v4, :cond_1f

    goto :goto_19

    :cond_1f
    const/4 v3, 0x0

    goto :goto_1a

    :cond_20
    :goto_19
    const/4 v3, 0x1

    :goto_1a
    and-int/lit8 v4, v5, 0x1

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_2a

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v3, v14, 0x1

    if-eqz v3, :cond_24

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_21

    goto :goto_1b

    :cond_21
    invoke-virtual {v1}, Lp1/q;->X()V

    and-int/lit16 v3, v0, 0x800

    if-eqz v3, :cond_22

    and-int/lit8 v2, v2, -0x71

    :cond_22
    and-int/lit16 v3, v0, 0x2000

    if-eqz v3, :cond_23

    and-int/lit16 v2, v2, -0x1c01

    :cond_23
    move-object/from16 v29, p10

    move-object/from16 v28, p12

    move-object/from16 v20, v8

    move-object/from16 v23, v13

    goto :goto_20

    :cond_24
    :goto_1b
    if-eqz v7, :cond_25

    const/4 v8, 0x0

    :cond_25
    if-eqz v11, :cond_26

    const/16 v24, 0x0

    goto :goto_1c

    :cond_26
    move-object/from16 v24, v13

    :goto_1c
    and-int/lit16 v3, v0, 0x800

    if-eqz v3, :cond_27

    invoke-static {v1}, Lg1/i8;->e(Landroidx/compose/runtime/Composer;)Lt0/a;

    move-result-object v3

    and-int/lit8 v2, v2, -0x71

    goto :goto_1d

    :cond_27
    move-object/from16 v3, p10

    :goto_1d
    and-int/lit16 v4, v0, 0x2000

    if-eqz v4, :cond_29

    if-nez v8, :cond_28

    sget v4, Lg1/p8;->a:F

    new-instance v7, Ll0/l1;

    invoke-direct {v7, v4, v4, v4, v4}, Ll0/l1;-><init>(FFFF)V

    goto :goto_1e

    :cond_28
    sget v4, Lg1/p8;->a:F

    sget v7, Lg1/u8;->a:F

    sget v11, Lg1/u8;->b:F

    new-instance v13, Ll0/l1;

    invoke-direct {v13, v4, v7, v4, v11}, Ll0/l1;-><init>(FFFF)V

    move-object v7, v13

    :goto_1e
    and-int/lit16 v2, v2, -0x1c01

    move-object/from16 v29, v3

    move-object/from16 v28, v7

    :goto_1f
    move-object/from16 v20, v8

    move-object/from16 v23, v24

    goto :goto_20

    :cond_29
    move-object/from16 v28, p12

    move-object/from16 v29, v3

    goto :goto_1f

    :goto_20
    invoke-virtual {v1}, Lp1/q;->r()V

    sget-object v16, Lg1/b9;->w:Lg1/b9;

    shl-int/lit8 v3, v5, 0x3

    and-int/lit8 v4, v3, 0x70

    or-int/lit8 v4, v4, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v4

    shr-int/lit8 v4, v5, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shr-int/lit8 v4, v5, 0x9

    const v7, 0xe000

    and-int v8, v4, v7

    or-int/2addr v3, v8

    const/high16 v8, 0x70000

    and-int/2addr v8, v4

    or-int/2addr v3, v8

    const/high16 v8, 0x380000

    and-int/2addr v4, v8

    or-int/2addr v3, v4

    shl-int/lit8 v4, v2, 0x15

    const/high16 v8, 0x1c00000

    and-int/2addr v4, v8

    or-int/2addr v3, v4

    shl-int/lit8 v4, v5, 0xf

    const/high16 v8, 0xe000000

    and-int/2addr v4, v8

    or-int/2addr v3, v4

    const/high16 v4, 0x70000000

    shl-int/lit8 v8, v5, 0x15

    and-int/2addr v4, v8

    or-int v33, v3, v4

    shr-int/lit8 v3, v5, 0x12

    and-int/lit8 v3, v3, 0xe

    or-int v3, v3, v17

    shr-int/lit8 v4, v5, 0xc

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v2, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shl-int/lit8 v2, v2, 0x6

    and-int/lit16 v4, v2, 0x1c00

    or-int/2addr v3, v4

    and-int/2addr v2, v7

    or-int v34, v3, v2

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v31, 0x0

    move-object/from16 v17, p1

    move-object/from16 v19, p5

    move-object/from16 v27, p6

    move-object/from16 v30, p11

    move-object/from16 v32, v1

    move-object/from16 v18, v6

    move/from16 v25, v9

    move-object/from16 v21, v10

    move/from16 v24, v12

    invoke-static/range {v16 .. v34}, Lg1/p8;->a(Lg1/b9;Ljava/lang/String;Lc93/m;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Li2/a1;Lg1/e8;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v8, v20

    move-object/from16 v10, v23

    move-object/from16 v13, v28

    move-object/from16 v11, v29

    goto :goto_21

    :cond_2a
    move-object/from16 v32, v1

    invoke-virtual/range {v32 .. v32}, Lp1/q;->X()V

    move-object/from16 v11, p10

    move-object v10, v13

    move-object/from16 v13, p12

    :goto_21
    invoke-virtual/range {v32 .. v32}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2b

    new-instance v0, Lc41/x4;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    move/from16 v16, p16

    move-object/from16 v35, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lc41/x4;-><init>(Lg1/i8;Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;Ll0/k1;III)V

    move-object v1, v0

    move-object/from16 v0, v35

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method
