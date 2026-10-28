.class public abstract Ll1/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll0/l1;

.field public static final b:F

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x8

    int-to-float v0, v0

    const/4 v1, 0x6

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {v2, v2, v1, v0, v3}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v1

    sput-object v1, Ll1/d0;->a:Ll0/l1;

    sput v0, Ll1/d0;->b:F

    const/16 v0, 0xc

    int-to-float v0, v0

    sput v0, Ll1/d0;->c:F

    return-void
.end method

.method public static final a(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Li2/a1;FLl1/y;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move/from16 v10, p10

    move-object/from16 v4, p9

    check-cast v4, Lp1/q;

    const v0, 0xd18a3f1

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move v1, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    if-nez v2, :cond_3

    move-object/from16 v2, p1

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    goto :goto_3

    :cond_3
    move-object/from16 v2, p1

    :goto_3
    and-int/lit8 v3, p11, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v1, v1, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v4, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    :goto_5
    and-int/lit8 v6, p11, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v1, v1, 0xc00

    :cond_7
    move-object/from16 v7, p3

    goto :goto_7

    :cond_8
    and-int/lit16 v7, v10, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v4, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_6

    :cond_9
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v1, v8

    :goto_7
    and-int/lit16 v8, v10, 0x6000

    if-nez v8, :cond_a

    or-int/lit16 v1, v1, 0x2000

    :cond_a
    and-int/lit8 v8, p11, 0x20

    const/high16 v9, 0x30000

    if-eqz v8, :cond_c

    or-int/2addr v1, v9

    :cond_b
    move/from16 v9, p5

    goto :goto_9

    :cond_c
    and-int/2addr v9, v10

    if-nez v9, :cond_b

    move/from16 v9, p5

    invoke-virtual {v4, v9}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_d

    const/high16 v11, 0x20000

    goto :goto_8

    :cond_d
    const/high16 v11, 0x10000

    :goto_8
    or-int/2addr v1, v11

    :goto_9
    const/high16 v11, 0x180000

    and-int/2addr v11, v10

    move-object/from16 v13, p6

    if-nez v11, :cond_f

    invoke-virtual {v4, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/high16 v11, 0x100000

    goto :goto_a

    :cond_e
    const/high16 v11, 0x80000

    :goto_a
    or-int/2addr v1, v11

    :cond_f
    const/high16 v11, 0xc00000

    or-int/2addr v1, v11

    const/high16 v11, 0x6000000

    and-int/2addr v11, v10

    move-object/from16 v15, p8

    if-nez v11, :cond_11

    invoke-virtual {v4, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    const/high16 v11, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v11, 0x2000000

    :goto_b
    or-int/2addr v1, v11

    :cond_11
    const v11, 0x2492493

    and-int/2addr v11, v1

    const v12, 0x2492492

    if-eq v11, v12, :cond_12

    const/4 v11, 0x1

    goto :goto_c

    :cond_12
    const/4 v11, 0x0

    :goto_c
    and-int/lit8 v12, v1, 0x1

    invoke-virtual {v4, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v11, v10, 0x1

    const/4 v12, 0x3

    const p9, -0xe001

    const/4 v14, 0x0

    if-eqz v11, :cond_14

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_13

    goto :goto_d

    :cond_13
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int v1, v1, p9

    move-object/from16 v3, p4

    move-object/from16 v2, p7

    move-object v6, v5

    move-object/from16 v16, v7

    goto :goto_f

    :cond_14
    :goto_d
    if-eqz v3, :cond_15

    sget-object v3, Lb2/t;->w:Lb2/t;

    move-object v5, v3

    :cond_15
    if-eqz v6, :cond_16

    move-object v7, v14

    :cond_16
    sget-object v3, Ll1/b0;->a:Ll1/b0;

    sget-object v3, Lo1/g;->c:Lo1/t;

    invoke-static {v3, v4}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v3

    and-int v1, v1, p9

    if-eqz v8, :cond_17

    sget v6, Ll1/b0;->c:F

    goto :goto_e

    :cond_17
    move v6, v9

    :goto_e
    new-instance v8, Lc4/a0;

    invoke-direct {v8, v12}, Lc4/a0;-><init>(I)V

    move v9, v6

    move-object v2, v8

    move-object/from16 v16, v7

    move-object v6, v5

    :goto_f
    invoke-virtual {v4}, Lp1/q;->r()V

    invoke-static {v6, v14, v12}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v11, Ll1/c0;

    move-object/from16 v17, p1

    move-object v12, v3

    move v14, v9

    invoke-direct/range {v11 .. v17}, Ll1/c0;-><init>(Li2/a1;Ll1/y;FLx1/b;Lc93/m;Lx1/b;)V

    const v3, 0x421948f7

    invoke-static {v3, v4, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    and-int/lit8 v7, v1, 0xe

    or-int/lit16 v7, v7, 0xc00

    shr-int/lit8 v1, v1, 0xf

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v7

    move-object/from16 v18, v5

    move v5, v1

    move-object/from16 v1, v18

    invoke-static/range {v0 .. v5}, Ll1/a;->b(Lc93/a;Landroidx/compose/ui/Modifier;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v2

    move-object v0, v4

    move-object v3, v6

    move-object v5, v12

    move v6, v14

    move-object/from16 v4, v16

    goto :goto_10

    :cond_18
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v8, p7

    move-object v0, v4

    move-object v3, v5

    move-object v4, v7

    move v6, v9

    move-object/from16 v5, p4

    :goto_10
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_19

    new-instance v0, Ldn0/o;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Ldn0/o;-><init>(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Li2/a1;FLl1/y;Lc4/a0;Lx1/b;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method
