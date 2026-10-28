.class public abstract Lg1/c8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Ld0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x5a

    int-to-float v0, v0

    sput v0, Lg1/c8;->a:F

    sget-object v0, Ld0/b0;->a:Ld0/v;

    const/4 v1, 0x2

    const/16 v2, 0xfa

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    sput-object v0, Lg1/c8;->b:Ld0/e2;

    return-void
.end method

.method public static final a(ILandroidx/compose/ui/Modifier;JJFLx1/b;Lc93/m;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move/from16 v11, p11

    move-object/from16 v0, p10

    check-cast v0, Lp1/q;

    const v1, -0x4cfb6fcf

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    move/from16 v7, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v7}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v2, v11, 0x30

    move-object/from16 v12, p1

    if-nez v2, :cond_3

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v11, 0x180

    move-wide/from16 v14, p2

    if-nez v2, :cond_5

    invoke-virtual {v0, v14, v15}, Lp1/q;->f(J)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v11, 0xc00

    move-wide/from16 v8, p4

    if-nez v2, :cond_7

    invoke-virtual {v0, v8, v9}, Lp1/q;->f(J)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v11, 0x6000

    move/from16 v3, p6

    if-nez v2, :cond_9

    invoke-virtual {v0, v3}, Lp1/q;->d(F)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    const/high16 v2, 0x30000

    and-int/2addr v2, v11

    move-object/from16 v6, p7

    if-nez v2, :cond_b

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v2, 0x10000

    :goto_6
    or-int/2addr v1, v2

    :cond_b
    const/high16 v10, 0x180000

    and-int v2, v11, v10

    move-object/from16 v5, p8

    if-nez v2, :cond_d

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/high16 v2, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v2, 0x80000

    :goto_7
    or-int/2addr v1, v2

    :cond_d
    const/high16 v2, 0xc00000

    and-int/2addr v2, v11

    move-object/from16 v4, p9

    if-nez v2, :cond_f

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    const/high16 v2, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v2, 0x400000

    :goto_8
    or-int/2addr v1, v2

    :cond_f
    const v2, 0x492493

    and-int/2addr v2, v1

    const v13, 0x492492

    if-eq v2, v13, :cond_10

    const/4 v2, 0x1

    goto :goto_9

    :cond_10
    const/4 v2, 0x0

    :goto_9
    and-int/lit8 v13, v1, 0x1

    invoke-virtual {v0, v13, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v2, v11, 0x1

    if-eqz v2, :cond_12

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_a

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_12
    :goto_a
    invoke-virtual {v0}, Lp1/q;->r()V

    new-instance v2, Lg1/z7;

    invoke-direct/range {v2 .. v7}, Lg1/z7;-><init>(FLx1/b;Lc93/m;Lx1/b;I)V

    const v3, -0x5de31a8b

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v20

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/2addr v2, v10

    and-int/lit16 v3, v1, 0x380

    or-int/2addr v2, v3

    and-int/lit16 v1, v1, 0x1c00

    or-int v22, v2, v1

    const/16 v23, 0x32

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v21, v0

    move-wide/from16 v16, v8

    invoke-static/range {v12 .. v23}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_b

    :cond_13
    move-object/from16 v21, v0

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    :goto_b
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_14

    new-instance v0, Lg1/h0;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v11}, Lg1/h0;-><init>(ILandroidx/compose/ui/Modifier;JJFLx1/b;Lc93/m;Lx1/b;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final b(ILandroidx/compose/ui/Modifier;JJLx1/b;Lc93/m;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, 0x6bf9fe0

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_1

    move/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_1
    move/from16 v1, p0

    move v3, v10

    :goto_1
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v10, 0x180

    move-wide/from16 v13, p2

    if-nez v4, :cond_5

    invoke-virtual {v0, v13, v14}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit16 v4, v10, 0xc00

    move-wide/from16 v5, p4

    if-nez v4, :cond_7

    invoke-virtual {v0, v5, v6}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v3, v4

    :cond_7
    and-int/lit16 v4, v10, 0x6000

    if-nez v4, :cond_9

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v3, v4

    :cond_9
    const/high16 v4, 0x30000

    and-int/2addr v4, v10

    if-nez v4, :cond_b

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v4, 0x10000

    :goto_6
    or-int/2addr v3, v4

    :cond_b
    const/high16 v4, 0x180000

    and-int v11, v10, v4

    if-nez v11, :cond_d

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v11, 0x80000

    :goto_7
    or-int/2addr v3, v11

    :cond_d
    const v11, 0x92493

    and-int/2addr v11, v3

    const v12, 0x92492

    const/4 v15, 0x0

    if-eq v11, v12, :cond_e

    const/4 v11, 0x1

    goto :goto_8

    :cond_e
    move v11, v15

    :goto_8
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v11, v10, 0x1

    if-eqz v11, :cond_10

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_f

    goto :goto_9

    :cond_f
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_10
    :goto_9
    invoke-virtual {v0}, Lp1/q;->r()V

    new-instance v11, Lqc1/a;

    const/16 v12, 0xc

    invoke-direct {v11, v12}, Lqc1/a;-><init>(I)V

    invoke-static {v2, v15, v11}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    new-instance v12, Lg1/b8;

    const/4 v15, 0x0

    invoke-direct {v12, v9, v8, v7, v15}, Lg1/b8;-><init>(Lx1/b;Lc93/m;Lx1/b;I)V

    const v15, -0x260df3e4

    invoke-static {v15, v0, v12}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v19

    and-int/lit16 v12, v3, 0x380

    or-int/2addr v4, v12

    and-int/lit16 v3, v3, 0x1c00

    or-int v21, v4, v3

    const/16 v22, 0x32

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v0

    move-wide v15, v5

    invoke-static/range {v11 .. v22}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_a

    :cond_11
    move-object/from16 v20, v0

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    :goto_a
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_12

    new-instance v0, Lg1/x7;

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    invoke-direct/range {v0 .. v10}, Lg1/x7;-><init>(ILandroidx/compose/ui/Modifier;JJLx1/b;Lc93/m;Lx1/b;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method
