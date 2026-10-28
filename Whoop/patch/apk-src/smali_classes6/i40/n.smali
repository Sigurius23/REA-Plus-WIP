.class public final Li40/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li40/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li40/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li40/n;->a:Li40/n;

    return-void
.end method


# virtual methods
.method public final a(Li40/i;JJLg1/h8;ZLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v8, p7

    sget-object v0, Lc0/d;->z:Lc0/d;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v14, p9

    check-cast v14, Lp1/q;

    const v4, -0x2f346fe5

    invoke-virtual {v14, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x2

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int v4, p10, v4

    move-wide/from16 v9, p2

    invoke-virtual {v14, v9, v10}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v4, v6

    move-wide/from16 v11, p4

    invoke-virtual {v14, v11, v12}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v4, v6

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x800

    goto :goto_3

    :cond_3
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v4, v6

    invoke-virtual {v14, v8}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x4000

    goto :goto_4

    :cond_4
    const/16 v6, 0x2000

    :goto_4
    or-int/2addr v4, v6

    const v6, 0x12493

    and-int/2addr v6, v4

    const v13, 0x12492

    if-ne v6, v13, :cond_6

    invoke-virtual {v14}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v14}, Lp1/q;->X()V

    goto/16 :goto_14

    :cond_6
    :goto_5
    and-int/lit8 v6, v4, 0xe

    or-int/lit8 v6, v6, 0x30

    const-string v13, "TextFieldInputState"

    invoke-static {v2, v13, v14, v6, v1}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v6

    iget-object v13, v6, Ld0/z1;->a:Lal/a;

    iget-object v15, v6, Ld0/z1;->d:Lp1/k1;

    move-object/from16 v16, v13

    sget-object v13, Ld0/f;->i:Ld0/f2;

    invoke-virtual/range {v16 .. v16}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Li40/i;

    const v1, -0x4081ac77

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v17, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x1

    const/high16 v20, 0x3f800000    # 1.0f

    if-eqz v1, :cond_7

    if-eq v1, v15, :cond_9

    if-ne v1, v5, :cond_8

    :cond_7
    move/from16 v1, v20

    :goto_6
    const/4 v5, 0x0

    goto :goto_7

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    move/from16 v1, v17

    goto :goto_6

    :goto_7
    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual/range {v19 .. v19}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li40/i;

    const v15, -0x4081ac77

    invoke-virtual {v14, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_a

    const/4 v15, 0x1

    if-eq v5, v15, :cond_c

    const/4 v15, 0x2

    if-ne v5, v15, :cond_b

    :cond_a
    move/from16 v5, v20

    :goto_8
    const/4 v15, 0x0

    goto :goto_9

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    move/from16 v5, v17

    goto :goto_8

    :goto_9
    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v6}, Ld0/z1;->f()Ld0/t1;

    move-result-object v15

    move-object/from16 p9, v1

    const-string v1, "$this$animateFloat"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x6c7f1f93

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    const/16 v1, 0x96

    const/4 v15, 0x0

    const/4 v2, 0x6

    move-object/from16 v22, v5

    const/4 v5, 0x0

    invoke-static {v1, v5, v15, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v12

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    move-object v5, v15

    const/high16 v15, 0x30000

    move-object/from16 v10, p9

    move-object v9, v6

    move-object/from16 v11, v22

    const/4 v6, 0x1

    invoke-static/range {v9 .. v15}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Li40/i;

    const v12, 0x68ce34c8

    invoke-virtual {v14, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eqz v11, :cond_f

    if-eq v11, v6, :cond_e

    const/4 v15, 0x2

    if-ne v11, v15, :cond_d

    :goto_a
    move/from16 v11, v17

    :goto_b
    const/4 v15, 0x0

    goto :goto_c

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    if-eqz v8, :cond_f

    goto :goto_a

    :cond_f
    move/from16 v11, v20

    goto :goto_b

    :goto_c
    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-virtual/range {v19 .. v19}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Li40/i;

    invoke-virtual {v14, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_12

    if-eq v12, v6, :cond_11

    const/4 v15, 0x2

    if-ne v12, v15, :cond_10

    :goto_d
    const/4 v15, 0x0

    goto :goto_e

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_11
    if-eqz v8, :cond_12

    goto :goto_d

    :cond_12
    move/from16 v17, v20

    goto :goto_d

    :goto_e
    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-virtual {v9}, Ld0/z1;->f()Ld0/t1;

    move-result-object v15

    sget-object v1, Li40/l;->w:Li40/l;

    invoke-virtual {v1, v15, v14, v3}, Li40/l;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld0/c0;

    move-object v15, v12

    move-object v12, v1

    move-object v1, v10

    move-object v10, v11

    move-object v11, v15

    const/high16 v15, 0x30000

    invoke-static/range {v9 .. v15}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v3

    invoke-virtual/range {v19 .. v19}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li40/i;

    const v11, -0xec9357

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    sget-object v12, Li40/m;->a:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v12, v10

    if-ne v10, v6, :cond_13

    move-wide/from16 v20, p2

    :goto_f
    const/4 v10, 0x0

    goto :goto_10

    :cond_13
    move-wide/from16 v20, p4

    goto :goto_f

    :goto_10
    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    invoke-static/range {v20 .. v21}, Li2/x;->g(J)Lj2/c;

    move-result-object v10

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v13, :cond_14

    if-ne v15, v2, :cond_15

    :cond_14
    new-instance v13, La3/m1;

    const/16 v15, 0x9

    invoke-direct {v13, v10, v15}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance v15, Ld0/f2;

    invoke-direct {v15, v0, v13}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v13, v15

    check-cast v13, Ld0/f2;

    invoke-virtual/range {v16 .. v16}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li40/i;

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v12, v10

    if-ne v10, v6, :cond_16

    move-wide/from16 v5, p2

    :goto_11
    const/4 v15, 0x0

    goto :goto_12

    :cond_16
    move-wide/from16 v5, p4

    goto :goto_11

    :goto_12
    invoke-static {v14, v15, v5, v6}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v10

    invoke-virtual/range {v19 .. v19}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li40/i;

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v12, v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_17

    move-wide/from16 v5, p2

    goto :goto_13

    :cond_17
    move-wide/from16 v5, p4

    :goto_13
    invoke-static {v14, v15, v5, v6}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v11

    invoke-virtual {v9}, Ld0/z1;->f()Ld0/t1;

    move-result-object v5

    const-string v6, "$this$animateColor"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x189261b4

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    const/4 v8, 0x6

    const/16 v12, 0x96

    invoke-static {v12, v15, v5, v8}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v18

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    move-object/from16 v12, v18

    const/high16 v15, 0x30000

    invoke-static/range {v9 .. v15}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v5

    and-int/lit16 v4, v4, 0x1c00

    or-int/lit16 v4, v4, 0x180

    invoke-virtual/range {v19 .. v19}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    shr-int/lit8 v10, v4, 0x6

    and-int/lit8 v10, v10, 0x70

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v7, v8, v14, v10}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li2/x;

    iget-wide v10, v8, Li2/x;->a:J

    invoke-static {v10, v11}, Li2/x;->g(J)Lj2/c;

    move-result-object v8

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_18

    if-ne v11, v2, :cond_19

    :cond_18
    new-instance v2, La3/m1;

    const/16 v10, 0x9

    invoke-direct {v2, v8, v10}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance v11, Ld0/f2;

    invoke-direct {v11, v0, v2}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v13, v11

    check-cast v13, Ld0/f2;

    shl-int/lit8 v0, v4, 0x3

    const v2, 0xe000

    and-int/2addr v0, v2

    const/16 v2, 0xc00

    or-int/2addr v0, v2

    invoke-virtual/range {v16 .. v16}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v0, v0, 0x9

    and-int/lit8 v0, v0, 0x70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v2, v14, v4}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual/range {v19 .. v19}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v2, v14, v0}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9}, Ld0/z1;->f()Ld0/t1;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3ed6f069

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    const/4 v8, 0x6

    const/16 v12, 0x96

    const/4 v15, 0x0

    invoke-static {v12, v15, v0, v8}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v12

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    const/high16 v15, 0x30000

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

    iget-wide v1, v1, Li2/x;->a:J

    new-instance v11, Li2/x;

    invoke-direct {v11, v1, v2}, Li2/x;-><init>(J)V

    iget-object v0, v0, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    new-instance v12, Li2/x;

    invoke-direct {v12, v0, v1}, Li2/x;-><init>(J)V

    iget-object v0, v3, Ld0/v1;->J:Lp1/k1;

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

    :goto_14
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_1a

    new-instance v0, Lg1/y8;

    const/4 v11, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lg1/y8;-><init>(Ljava/lang/Object;Ljava/lang/Enum;JJLkotlin/jvm/functions/Function3;ZLx1/b;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method
