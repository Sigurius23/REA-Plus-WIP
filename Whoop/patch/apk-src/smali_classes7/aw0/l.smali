.class public abstract Law0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\u000c\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lyv0/g;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "d",
        "(Lyv0/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lm91/p;",
        "a",
        "Lm91/p;",
        "h",
        "()Lm91/p;",
        "activityTargetsDesignItemViewFactory",
        "core-details_release"
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
.field private static final a:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lat2/b1;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lat2/b1;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Law0/l;->a:Lm91/p;

    return-void
.end method

.method public static synthetic a(Lyv0/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Law0/l;->e(Lyv0/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyv0/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Law0/l;->f(Lyv0/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Law0/l;->g(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lyv0/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 52

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, -0x64d1ea84

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v5, p4, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :goto_3
    and-int/lit8 v7, v2, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v7, v8, :cond_5

    move v7, v9

    goto :goto_4

    :cond_5
    move v7, v10

    :goto_4
    and-int/2addr v2, v9

    invoke-virtual {v0, v2, v7}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_13

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_6

    move-object v5, v2

    goto :goto_5

    :cond_6
    move-object v5, v2

    move-object v2, v6

    :goto_5
    invoke-virtual {v1}, Lyv0/g;->a()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v0, Law0/k;

    const/4 v5, 0x0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Law0/k;-><init>(Lyv0/g;Landroidx/compose/ui/Modifier;III)V

    :goto_6
    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    move-object v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v11

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v7, v11

    const/4 v12, 0x0

    invoke-static {v6, v12, v7, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v7, v4

    mul-float/2addr v7, v11

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    sget-object v13, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v12, v13, v0, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v2, v0, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-eqz v4, :cond_8

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v0, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v0, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    move/from16 v17, v8

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v2, v0, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v6, v1

    invoke-virtual/range {p0 .. p0}, Lyv0/g;->b()Ljava/lang/String;

    move-result-object v1

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v0, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lb91/d;->P()Lb91/a;

    move-result-object v21

    invoke-virtual {v8, v0, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ly81/i;->y()J

    move-result-wide v19

    sget v22, Lb91/a;->d:I

    shl-int/lit8 v25, v22, 0x12

    const v26, 0x2fffa

    move-object/from16 v17, v2

    const/4 v2, 0x0

    move-object/from16 v23, v5

    move-object/from16 v22, v6

    const-wide/16 v5, 0x0

    move/from16 v24, v7

    const/4 v7, 0x0

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move/from16 v28, v9

    const/4 v9, 0x0

    move/from16 v30, v10

    move/from16 v29, v11

    const-wide/16 v10, 0x0

    move-object/from16 v31, v12

    const/4 v12, 0x0

    move-object/from16 v32, v13

    const/4 v13, 0x0

    move/from16 v34, v14

    move-object/from16 v33, v15

    const-wide/16 v14, 0x0

    const/16 v35, 0x2

    const/16 v16, 0x0

    move-object/from16 v36, v17

    const/16 v17, 0x0

    const/16 v37, 0x1

    const/16 v18, 0x0

    move-object/from16 v38, v3

    move-wide/from16 v50, v19

    move-object/from16 v20, v4

    move-wide/from16 v3, v50

    const/16 v19, 0x0

    move-object/from16 v39, v20

    const/16 v20, 0x0

    move-object/from16 v40, v22

    const/16 v22, 0x0

    move/from16 v41, v24

    const/16 v24, 0x0

    move-object/from16 v49, v23

    move/from16 v48, v28

    move-object/from16 v45, v31

    move-object/from16 v42, v32

    move-object/from16 v43, v33

    move-object/from16 v47, v36

    move-object/from16 v46, v38

    move-object/from16 v44, v39

    move-object/from16 v23, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v23

    move-object/from16 v5, v49

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v3, v27

    move/from16 v4, v48

    invoke-virtual {v3, v1, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->a1()J

    move-result-wide v3

    const/4 v6, 0x3

    int-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v7, v7

    invoke-static {v2, v6, v7, v3, v4}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v2

    mul-float v6, v6, v29

    move/from16 v7, v41

    invoke-static {v2, v7, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    move-object/from16 v4, v42

    const/4 v6, 0x6

    invoke-static {v3, v4, v1, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-eqz v7, :cond_b

    move-object/from16 v7, v43

    invoke-virtual {v1, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v7, v44

    goto :goto_9

    :cond_b
    invoke-virtual {v1}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v1, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v45

    invoke-static {v1, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    move-object/from16 v3, v46

    goto :goto_b

    :cond_d
    :goto_a
    move-object/from16 v3, v47

    goto :goto_c

    :goto_b
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x4d120fd8    # 1.53157E8f

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lyv0/g;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v10, 0x0

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v10, 0x1

    const/4 v6, 0x0

    if-ltz v10, :cond_11

    check-cast v3, Lyv0/e;

    if-lez v10, :cond_e

    const v7, -0x25e1ba88

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x1

    int-to-float v9, v8

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v1, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->W0()J

    move-result-wide v9

    sget-object v11, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v9, v10, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v9, 0x0

    invoke-static {v7, v1, v9}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_e
    const/4 v8, 0x1

    const/4 v9, 0x0

    const v7, -0x25dddf41

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    :goto_e
    instance-of v7, v3, Lyv0/e$a;

    if-eqz v7, :cond_f

    const v7, -0x7d17a200

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    check-cast v3, Lyv0/e$a;

    const/4 v7, 0x2

    invoke-static {v3, v6, v1, v9, v7}, Law0/f;->b(Lyv0/e$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_f
    const/4 v7, 0x2

    instance-of v10, v3, Lyv0/e$b;

    if-eqz v10, :cond_10

    const v10, -0x7d1797fc

    invoke-virtual {v1, v10}, Lp1/q;->e0(I)V

    check-cast v3, Lyv0/e$b;

    invoke-static {v3, v6, v1, v9, v7}, Law0/e;->c(Lyv0/e$b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    :goto_f
    move v10, v4

    goto :goto_d

    :cond_10
    const v0, -0x7d17a95a

    invoke-static {v0, v1, v9}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_11
    invoke-static {}, Lwb3/f;->d0()V

    throw v6

    :cond_12
    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v1, v9, v8, v8}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v2, v40

    goto :goto_10

    :cond_13
    move-object v1, v0

    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v2, v6

    :goto_10
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v0, Law0/k;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Law0/k;-><init>(Lyv0/g;Landroidx/compose/ui/Modifier;III)V

    goto/16 :goto_6

    :cond_14
    return-void
.end method

.method private static final e(Lyv0/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Law0/l;->d(Lyv0/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lyv0/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Law0/l;->d(Lyv0/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lyv0/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Law0/j;

    invoke-direct {v1}, Law0/j;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h()Lm91/p;
    .locals 1

    sget-object v0, Law0/l;->a:Lm91/p;

    return-object v0
.end method
