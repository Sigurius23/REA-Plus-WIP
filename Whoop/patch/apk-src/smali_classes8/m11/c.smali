.class public abstract Lm11/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lm11/d;",
        "state",
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/ui/Modifier;Lm11/d;Landroidx/compose/runtime/Composer;II)V",
        "Lm11/a;",
        "cell",
        "c",
        "(Landroidx/compose/ui/Modifier;Lm11/a;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lm11/d;",
        "exerciseBreakdownPreviewState",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lm11/d;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lm11/d;

    const-string v1, "WEIGHT"

    const-string v2, "TIME"

    const-string v3, "REPS"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lm11/a;

    const-string v3, "8"

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v4, v4}, Lm11/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly81/f;)V

    new-instance v3, Lm11/a;

    const-string v5, "150"

    const-string v6, "lbs"

    invoke-direct {v3, v5, v6, v4, v4}, Lm11/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly81/f;)V

    new-instance v5, Lm11/a;

    sget v6, Lgy0/a;->I0:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "45"

    const-string v8, "sec"

    invoke-direct {v5, v7, v8, v6, v4}, Lm11/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly81/f;)V

    filled-new-array {v2, v3, v5}, [Lm11/a;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Lm11/d;-><init>(ILjava/util/List;Ljava/util/List;)V

    sput-object v0, Lm11/c;->a:Lm11/d;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lm11/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm11/c;->d(Landroidx/compose/ui/Modifier;Lm11/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lm11/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm11/c;->f(Landroidx/compose/ui/Modifier;Lm11/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lm11/a;Landroidx/compose/runtime/Composer;II)V
    .locals 38

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x7bffe9b2

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    move-object/from16 v4, p1

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    goto :goto_3

    :cond_4
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    and-int/2addr v3, v9

    invoke-virtual {v5, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_11

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v3

    goto :goto_5

    :cond_6
    move-object v0, v2

    :goto_5
    sget-object v2, Lb2/e;->L:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x36

    invoke-static {v6, v2, v5, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_7

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v5, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-nez v15, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v10, v5, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v10, 0x8

    int-to-float v10, v10

    const/high16 v12, 0x3f000000    # 0.5f

    mul-float v26, v10, v12

    invoke-static/range {v26 .. v26}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    invoke-static {v10, v2, v5, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v9, v5, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v5, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    invoke-static {v9, v5, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v5, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lm11/a;->d()Ly81/f;

    move-result-object v1

    if-nez v1, :cond_d

    const v1, 0x7051de18

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    goto :goto_8

    :cond_d
    const v2, 0x7f7e8309

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v5, v8}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    invoke-static {v5, v8, v1, v2}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v1

    :goto_8
    const/4 v2, 0x6

    if-nez v1, :cond_e

    const v1, 0x7f7e8a20

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1, v5, v2, v8}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    :goto_9
    move-object v1, v0

    goto :goto_a

    :cond_e
    const v6, 0x7f7e80cd

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    iget-wide v9, v1, Li2/x;->a:J

    goto :goto_9

    :goto_a
    invoke-virtual {v4}, Lm11/a;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v5, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->C()Lb91/a;

    move-result-object v20

    const/16 v24, 0x0

    const v25, 0x2fffa

    move-object v11, v1

    const/4 v1, 0x0

    move-object/from16 v22, v5

    const-wide/16 v4, 0x0

    move-object v12, v6

    const/4 v6, 0x0

    const/4 v13, 0x1

    const/4 v7, 0x0

    move v14, v8

    const/4 v8, 0x0

    move/from16 v16, v2

    move-object v15, v3

    move-wide v2, v9

    const-wide/16 v9, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move/from16 v21, v13

    move/from16 v19, v14

    const-wide/16 v13, 0x0

    move-object/from16 v23, v15

    const/4 v15, 0x0

    move/from16 v27, v16

    const/16 v16, 0x0

    move-object/from16 v28, v17

    const/16 v17, 0x0

    move-object/from16 v29, v18

    const/16 v18, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move-object/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v29

    move-object/from16 v34, v32

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v22

    invoke-virtual/range {p1 .. p1}, Lm11/a;->b()Ljava/lang/String;

    move-result-object v0

    const-wide/high16 v1, -0x4020000000000000L    # -0.5

    const/4 v3, 0x0

    if-nez v0, :cond_f

    const v0, 0x7055c15d

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    move v8, v4

    move-object/from16 v32, v34

    :goto_b
    const/4 v9, 0x1

    goto/16 :goto_c

    :cond_f
    const/4 v4, 0x0

    const v6, 0x7055c15e

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    double-to-float v6, v1

    const/4 v7, 0x4

    int-to-float v8, v7

    mul-float/2addr v6, v8

    move-object/from16 v8, v34

    const/4 v9, 0x1

    invoke-static {v8, v3, v6, v9}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v12, v33

    const/4 v10, 0x6

    invoke-virtual {v12, v5, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->b()Lb91/a;

    move-result-object v20

    invoke-virtual {v12, v5, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    const/16 v24, 0x0

    const v25, 0x2fff8

    move v14, v4

    move-object/from16 v22, v5

    const-wide/16 v4, 0x0

    move-wide v15, v1

    move-object v1, v6

    const/4 v6, 0x0

    move/from16 v35, v7

    const/4 v7, 0x0

    move-object/from16 v32, v8

    const/4 v8, 0x0

    move v13, v9

    move/from16 v27, v10

    const-wide/16 v9, 0x0

    move-wide/from16 v36, v11

    move v12, v3

    move-wide/from16 v2, v36

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v31, v13

    move/from16 v30, v14

    const-wide/16 v13, 0x0

    move-wide/from16 v18, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-wide/from16 v33, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v22

    const/4 v8, 0x0

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lm11/a;->a()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_10

    const v0, 0x38e77938

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_10
    const v1, 0x38e77939

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v10, 0x6

    invoke-static {v0, v5, v10}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    const/4 v14, 0x0

    const/16 v15, 0xe

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v11, v26

    move-object/from16 v10, v32

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v7, 0x4

    int-to-float v2, v7

    const/high16 v3, 0x40800000    # 4.0f

    mul-float/2addr v3, v2

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v3, -0x4020000000000000L    # -0.5

    double-to-float v3, v3

    mul-float/2addr v3, v2

    const/4 v12, 0x0

    invoke-static {v1, v12, v3, v9}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-wide v3, Li2/x;->n:J

    const/16 v6, 0xc30

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    move-object/from16 v7, v28

    goto :goto_e

    :cond_11
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v7, v2

    :goto_e
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v6, Llq2/c;

    const/4 v11, 0x4

    move-object/from16 v8, p1

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-direct/range {v6 .. v11}, Llq2/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v6, v0, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final d(Landroidx/compose/ui/Modifier;Lm11/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lm11/c;->c(Landroidx/compose/ui/Modifier;Lm11/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lm11/d;Landroidx/compose/runtime/Composer;II)V
    .locals 37

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x416fe72f

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    and-int/2addr v5, v9

    invoke-virtual {v0, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1a

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_6

    move-object v1, v5

    goto :goto_4

    :cond_6
    move-object v1, v4

    :goto_4
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v3, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v3, v7

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v3, v7, v0, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-nez v14, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    :cond_8
    invoke-static {v7, v0, v7, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v14, Ll0/m;->g:Ll0/h;

    sget-object v15, Lb2/e;->J:Lb2/l;

    invoke-static {v14, v15, v0, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v0, v13, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-nez v3, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v8, v0, v8, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v0, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x1e48b08f

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lm11/d;->a()I

    move-result v3

    const/4 v6, 0x0

    :goto_7
    const-string v7, "invalid weight; must be greater than zero"

    const-wide/16 v8, 0x0

    if-ge v6, v3, :cond_f

    float-to-double v11, v4

    cmpl-double v8, v11, v8

    if-lez v8, :cond_d

    goto :goto_8

    :cond_d
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v15, 0x1

    invoke-direct {v7, v4, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v2}, Lm11/d;->c()Ljava/util/List;

    move-result-object v8

    invoke-static {v6, v8}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_e

    const-string v8, ""

    :cond_e
    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v0, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    invoke-virtual {v9, v0, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v11

    const/16 v27, 0x0

    const v28, 0x2fff8

    move v9, v3

    move v13, v4

    move-object v4, v7

    move-object v3, v8

    const-wide/16 v7, 0x0

    move v14, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v17, v5

    move-wide/from16 v35, v11

    move v12, v6

    move-wide/from16 v5, v35

    const/4 v11, 0x0

    move/from16 v18, v12

    move/from16 v19, v13

    const-wide/16 v12, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    move-object/from16 v22, v17

    const-wide/16 v16, 0x0

    move/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move-object/from16 v31, v22

    const/16 v22, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move/from16 v30, v25

    move-object/from16 v34, v31

    move-object/from16 v25, v0

    const/4 v0, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    add-int/lit8 v6, v30, 0x1

    move-object v0, v3

    move/from16 v3, v29

    move/from16 v10, v32

    move-object/from16 v5, v34

    const/high16 v4, 0x3f800000    # 1.0f

    goto/16 :goto_7

    :cond_f
    move-object v3, v0

    move-object/from16 v34, v5

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    const/4 v15, 0x1

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    const v4, 0x162a8c5e

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lm11/d;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    move-object/from16 v6, v34

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->L:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v11, v12, v3, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    iget-wide v12, v3, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v3, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    move-wide/from16 v16, v8

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_10

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_a
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v3, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v3, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-nez v9, :cond_11

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    :cond_11
    invoke-static {v12, v3, v12, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v3, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v8, -0x5c583cc0

    invoke-virtual {v3, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lm11/d;->a()I

    move-result v8

    move v9, v0

    :goto_b
    if-ge v9, v8, :cond_18

    invoke-static {v9, v5}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm11/a;

    if-eqz v10, :cond_15

    const v12, 0xf48d6ec

    invoke-virtual {v3, v12}, Lp1/q;->e0(I)V

    const p0, 0x7f7fffff    # Float.MAX_VALUE

    const/high16 v13, 0x3f800000    # 1.0f

    float-to-double v11, v13

    cmpl-double v11, v11, v16

    if-lez v11, :cond_13

    goto :goto_c

    :cond_13
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v12, v13, p0

    if-lez v12, :cond_14

    move/from16 v12, p0

    goto :goto_d

    :cond_14
    move v12, v13

    :goto_d
    invoke-direct {v11, v12, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v10, v3, v0, v0}, Lm11/c;->c(Landroidx/compose/ui/Modifier;Lm11/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_15
    const p0, 0x7f7fffff    # Float.MAX_VALUE

    const/high16 v13, 0x3f800000    # 1.0f

    const v10, 0xf4bd7fd

    invoke-virtual {v3, v10}, Lp1/q;->e0(I)V

    float-to-double v10, v13

    cmpl-double v10, v10, v16

    if-lez v10, :cond_16

    goto :goto_e

    :cond_16
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_e
    new-instance v10, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v11, v13, p0

    if-lez v11, :cond_17

    move/from16 v11, p0

    goto :goto_f

    :cond_17
    move v11, v13

    :goto_f
    invoke-direct {v10, v11, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v10, v3, v0}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    :goto_10
    add-int/lit8 v9, v9, 0x1

    goto :goto_b

    :cond_18
    const/high16 v13, 0x3f800000    # 1.0f

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    move-object/from16 v34, v6

    move-wide/from16 v8, v16

    goto/16 :goto_9

    :cond_19
    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1a
    move-object v3, v0

    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v1, v4

    :goto_11
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Llq2/c;

    const/4 v5, 0x3

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lm11/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lm11/c;->e(Landroidx/compose/ui/Modifier;Lm11/d;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
