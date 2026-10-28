.class public final Lg1/a9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg1/a9;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg1/a9;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg1/a9;->a:Lg1/a9;

    return-void
.end method


# virtual methods
.method public final a(Lg1/g3;JJLg1/h8;ZLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v7, p6

    move/from16 v8, p7

    sget-object v0, Lc0/d;->z:Lc0/d;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v14, p9

    check-cast v14, Lp1/q;

    const v3, 0x1e5d6f90

    invoke-virtual {v14, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v14, v3}, Lp1/q;->e(I)Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p10, v3

    move-wide/from16 v5, p2

    invoke-virtual {v14, v5, v6}, Lp1/q;->f(J)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x20

    goto :goto_1

    :cond_1
    const/16 v9, 0x10

    :goto_1
    or-int/2addr v3, v9

    move-wide/from16 v9, p4

    invoke-virtual {v14, v9, v10}, Lp1/q;->f(J)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x100

    goto :goto_2

    :cond_2
    const/16 v11, 0x80

    :goto_2
    or-int/2addr v3, v11

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    const/16 v11, 0x800

    goto :goto_3

    :cond_3
    const/16 v11, 0x400

    :goto_3
    or-int/2addr v3, v11

    invoke-virtual {v14, v8}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x4000

    goto :goto_4

    :cond_4
    const/16 v11, 0x2000

    :goto_4
    or-int/2addr v3, v11

    const v11, 0x12493

    and-int/2addr v11, v3

    const v12, 0x12492

    const/4 v13, 0x1

    if-eq v11, v12, :cond_5

    move v11, v13

    goto :goto_5

    :cond_5
    move v11, v1

    :goto_5
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v14, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_19

    and-int/lit8 v11, v3, 0xe

    or-int/lit8 v11, v11, 0x30

    const-string v12, "TextFieldInputState"

    move-object/from16 v15, p1

    invoke-static {v15, v12, v14, v11, v1}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v11

    iget-object v12, v11, Ld0/z1;->a:Lal/a;

    iget-object v15, v11, Ld0/z1;->d:Lp1/k1;

    sget-object v16, Ld0/f;->i:Ld0/f2;

    invoke-virtual {v12}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lg1/g3;

    const v1, 0x173dd27e

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v17, 0x0

    const/high16 v19, 0x3f800000    # 1.0f

    if-eqz v1, :cond_6

    if-eq v1, v13, :cond_8

    if-ne v1, v4, :cond_7

    :cond_6
    move/from16 v1, v19

    :goto_6
    const/4 v4, 0x0

    goto :goto_7

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    move/from16 v1, v17

    goto :goto_6

    :goto_7
    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v15}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/g3;

    const v13, 0x173dd27e

    invoke-virtual {v14, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eqz v4, :cond_9

    const/4 v13, 0x1

    if-eq v4, v13, :cond_b

    const/4 v13, 0x2

    if-ne v4, v13, :cond_a

    :cond_9
    move/from16 v4, v19

    :goto_8
    const/4 v13, 0x0

    goto :goto_9

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    move/from16 v4, v17

    goto :goto_8

    :goto_9
    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v11}, Ld0/z1;->f()Ld0/t1;

    const v13, -0x34a96f9e

    invoke-virtual {v14, v13}, Lp1/q;->e0(I)V

    const/16 v13, 0x96

    move-object/from16 p9, v15

    const/4 v15, 0x0

    move-object/from16 v20, v1

    const/4 v1, 0x6

    move-object/from16 v21, v4

    move-object/from16 v22, v12

    const/4 v4, 0x0

    invoke-static {v13, v4, v15, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v12

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    move-object v4, v15

    const/high16 v15, 0x30000

    move-object v9, v11

    move v5, v13

    move-object/from16 v13, v16

    move-object/from16 v10, v20

    move-object/from16 v11, v21

    const/4 v6, 0x1

    invoke-static/range {v9 .. v15}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v10

    sget-object v11, Lg1/e1;->G:Lg1/e1;

    invoke-virtual/range {v22 .. v22}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg1/g3;

    const v15, 0x4a52d57d    # 3454303.2f

    invoke-virtual {v14, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_e

    if-eq v12, v6, :cond_d

    const/4 v1, 0x2

    if-ne v12, v1, :cond_c

    :goto_a
    move/from16 v1, v17

    :goto_b
    const/4 v12, 0x0

    goto :goto_c

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    if-eqz v8, :cond_e

    goto :goto_a

    :cond_e
    move/from16 v1, v19

    goto :goto_b

    :goto_c
    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual/range {p9 .. p9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg1/g3;

    invoke-virtual {v14, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_11

    if-eq v12, v6, :cond_10

    const/4 v15, 0x2

    if-ne v12, v15, :cond_f

    :goto_d
    const/4 v12, 0x0

    goto :goto_e

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_10
    if-eqz v8, :cond_11

    goto :goto_d

    :cond_11
    move/from16 v17, v19

    goto :goto_d

    :goto_e
    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-virtual {v9}, Ld0/z1;->f()Ld0/t1;

    move-result-object v15

    invoke-virtual {v11, v15, v14, v2}, Lg1/e1;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld0/c0;

    move-object v11, v10

    move-object v10, v1

    move-object v1, v11

    move-object v11, v12

    const/high16 v15, 0x30000

    move-object v12, v2

    invoke-static/range {v9 .. v15}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v2

    invoke-virtual/range {p9 .. p9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/g3;

    const v11, -0x77530c62

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    sget-object v12, Lg1/z8;->a:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v12, v10

    if-ne v10, v6, :cond_12

    move-wide/from16 v16, p2

    :goto_f
    const/4 v13, 0x0

    goto :goto_10

    :cond_12
    move-wide/from16 v16, p4

    goto :goto_f

    :goto_10
    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    invoke-static/range {v16 .. v17}, Li2/x;->g(J)Lj2/c;

    move-result-object v10

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v13, :cond_13

    if-ne v15, v4, :cond_14

    :cond_13
    new-instance v13, La3/m1;

    const/16 v15, 0x9

    invoke-direct {v13, v10, v15}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance v15, Ld0/f2;

    invoke-direct {v15, v0, v13}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v13, v15

    check-cast v13, Ld0/f2;

    invoke-virtual/range {v22 .. v22}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/g3;

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v12, v10

    if-ne v10, v6, :cond_15

    move-wide/from16 v5, p2

    :goto_11
    const/4 v15, 0x0

    goto :goto_12

    :cond_15
    move-wide/from16 v5, p4

    goto :goto_11

    :goto_12
    invoke-static {v14, v15, v5, v6}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v5

    invoke-virtual/range {p9 .. p9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/g3;

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v12, v6

    const/4 v10, 0x1

    if-ne v6, v10, :cond_16

    move-wide/from16 v10, p2

    goto :goto_13

    :cond_16
    move-wide/from16 v10, p4

    :goto_13
    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    new-instance v6, Li2/x;

    invoke-direct {v6, v10, v11}, Li2/x;-><init>(J)V

    invoke-virtual {v9}, Ld0/z1;->f()Ld0/t1;

    const v10, -0x78455a97

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    const/16 v11, 0x96

    const/4 v12, 0x6

    invoke-static {v11, v15, v10, v12}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v18

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    move-object v10, v5

    move-object v11, v6

    move-object/from16 v12, v18

    const/high16 v15, 0x30000

    invoke-static/range {v9 .. v15}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v5

    and-int/lit16 v3, v3, 0x1c00

    or-int/lit16 v3, v3, 0x180

    invoke-virtual/range {p9 .. p9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    shr-int/lit8 v10, v3, 0x6

    and-int/lit8 v10, v10, 0x70

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v7, v6, v14, v10}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li2/x;

    iget-wide v10, v6, Li2/x;->a:J

    invoke-static {v10, v11}, Li2/x;->g(J)Lj2/c;

    move-result-object v6

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_17

    if-ne v11, v4, :cond_18

    :cond_17
    new-instance v4, La3/m1;

    const/16 v10, 0x9

    invoke-direct {v4, v6, v10}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance v11, Ld0/f2;

    invoke-direct {v11, v0, v4}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v13, v11

    check-cast v13, Ld0/f2;

    shl-int/lit8 v0, v3, 0x3

    const v3, 0xe000

    and-int/2addr v0, v3

    const/16 v3, 0xc00

    or-int/2addr v0, v3

    invoke-virtual/range {v22 .. v22}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v3

    shr-int/lit8 v0, v0, 0x9

    and-int/lit8 v0, v0, 0x70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v3, v14, v4}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual/range {p9 .. p9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v3, v14, v0}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9}, Ld0/z1;->f()Ld0/t1;

    const v0, -0x462218a2

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    const/16 v0, 0x96

    const/4 v3, 0x6

    const/4 v4, 0x0

    const/4 v12, 0x0

    invoke-static {v0, v12, v4, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    const/high16 v15, 0x30000

    move-object v12, v0

    invoke-static/range {v9 .. v15}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v0

    iget-object v1, v1, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    iget-object v1, v5, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v3, v1, Li2/x;->a:J

    new-instance v11, Li2/x;

    invoke-direct {v11, v3, v4}, Li2/x;-><init>(J)V

    iget-object v0, v0, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    new-instance v12, Li2/x;

    invoke-direct {v12, v0, v1}, Li2/x;-><init>(J)V

    iget-object v0, v2, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    const/16 v0, 0x6000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v9, p8

    invoke-virtual/range {v9 .. v15}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    :cond_19
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_1a

    new-instance v0, Lg1/y8;

    const/4 v11, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lg1/y8;-><init>(Ljava/lang/Object;Ljava/lang/Enum;JJLkotlin/jvm/functions/Function3;ZLx1/b;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method
