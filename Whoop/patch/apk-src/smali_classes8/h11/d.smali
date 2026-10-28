.class public abstract Lh11/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh11/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001aA\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0017\u0010\u0014\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000e\u001a\u0004\u0008\u0013\u0010\u0010\"\u0017\u0010\u0017\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000e\u001a\u0004\u0008\u0016\u0010\u0010\u00a8\u0006\u0018"
    }
    d2 = {
        "Lh11/h;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onClick",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "automationTag",
        "e",
        "(Lh11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "j",
        "()F",
        "DATE_PILL_WIDTH",
        "b",
        "getDATE_PILL_HEIGHT",
        "DATE_PILL_HEIGHT",
        "c",
        "k",
        "MULTI_DAY_CYCLE_PILL_WIDTH",
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
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2c

    int-to-float v0, v0

    sput v0, Lh11/d;->a:F

    const/16 v0, 0x46

    int-to-float v0, v0

    sput v0, Lh11/d;->b:F

    const/16 v0, 0x50

    int-to-float v0, v0

    sput v0, Lh11/d;->c:F

    return-void
.end method

.method public static synthetic a(Lh11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lh11/d;->i(Lh11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh11/h;JFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lh11/d;->h(Lh11/h;JFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lh11/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh11/d;->g(Lh11/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh11/d;->f(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lh11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 62
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh11/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v27

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onClick"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v3, -0xf417236

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v5, 0x6

    const/4 v14, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v5, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v14

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v5

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    :cond_4
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v3, v12

    :goto_7
    and-int/lit16 v12, v3, 0x493

    const/16 v13, 0x492

    if-eq v12, v13, :cond_b

    const/4 v12, 0x1

    goto :goto_8

    :cond_b
    const/4 v12, 0x0

    :goto_8
    and-int/lit8 v13, v3, 0x1

    invoke-virtual {v11, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_51

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_c

    move-object v6, v12

    goto :goto_9

    :cond_c
    move-object v6, v8

    :goto_9
    const/16 v32, 0x0

    if-eqz v9, :cond_d

    move-object/from16 v8, v32

    goto :goto_a

    :cond_d
    move-object v8, v10

    :goto_a
    invoke-virtual {v1}, Lh11/h;->l()Lh11/a;

    move-result-object v9

    if-eqz v9, :cond_e

    const/16 v22, 0x1

    goto :goto_b

    :cond_e
    const/16 v22, 0x0

    :goto_b
    const/4 v9, 0x6

    if-eqz v22, :cond_f

    int-to-float v10, v9

    :goto_c
    int-to-float v13, v14

    mul-float/2addr v10, v13

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    goto :goto_d

    :cond_f
    const/16 v10, 0xa

    int-to-float v10, v10

    goto :goto_c

    :goto_d
    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-virtual {v13, v11, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->b1()J

    move-result-wide v0

    invoke-virtual/range {p0 .. p0}, Lh11/h;->l()Lh11/a;

    move-result-object v16

    const/4 v9, 0x5

    const/16 v15, 0x8

    if-eqz v16, :cond_10

    int-to-float v7, v9

    int-to-float v9, v14

    :goto_e
    mul-float/2addr v7, v9

    goto :goto_f

    :cond_10
    int-to-float v7, v14

    int-to-float v9, v15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p0 .. p0}, Lh11/h;->p()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-virtual/range {p0 .. p0}, Lh11/h;->o()Lh11/g;

    move-result-object v9

    move/from16 v24, v15

    sget-object v15, Lh11/g;->INVALID:Lh11/g;

    if-eq v9, v15, :cond_12

    invoke-virtual/range {p0 .. p0}, Lh11/h;->q()Z

    move-result v9

    if-nez v9, :cond_12

    const/16 v34, 0x1

    goto :goto_10

    :cond_11
    move/from16 v24, v15

    :cond_12
    const/16 v34, 0x0

    :goto_10
    invoke-virtual/range {p0 .. p0}, Lh11/h;->o()Lh11/g;

    move-result-object v9

    sget-object v15, Lh11/g;->INVALID:Lh11/g;

    if-eq v9, v15, :cond_13

    invoke-virtual/range {p0 .. p0}, Lh11/h;->o()Lh11/g;

    move-result-object v9

    sget-object v14, Lh11/g;->NO_APPOINTMENTS:Lh11/g;

    if-eq v9, v14, :cond_13

    const/16 v35, 0x1

    goto :goto_11

    :cond_13
    const/16 v35, 0x0

    :goto_11
    invoke-static {v6, v8}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lh11/h;->c()Ljava/lang/String;

    move-result-object v14

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v14, :cond_14

    const v14, -0x50f99697

    invoke-virtual {v11, v14}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    move/from16 v26, v3

    move-object/from16 v3, v32

    goto :goto_12

    :cond_14
    move/from16 v26, v3

    const v3, -0x50f99696

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    move/from16 v17, v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v17, :cond_15

    if-ne v3, v4, :cond_16

    :cond_15
    new-instance v3, Lb30/y4;

    const/16 v5, 0x1b

    invoke-direct {v3, v14, v5}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    invoke-static {v12, v14, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_12
    if-nez v3, :cond_17

    move-object v3, v12

    :cond_17
    invoke-interface {v9, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-eqz v22, :cond_18

    sget v5, Lh11/d;->c:F

    goto :goto_13

    :cond_18
    sget v5, Lh11/d;->a:F

    :goto_13
    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v5, Lh11/d;->b:F

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-eqz v34, :cond_1f

    const v5, -0x50eeedfb

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v5, v26, 0xe

    const/4 v9, 0x4

    if-eq v5, v9, :cond_1b

    and-int/lit8 v5, v26, 0x8

    if-eqz v5, :cond_19

    move-object/from16 v5, p0

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    goto :goto_14

    :cond_19
    move-object/from16 v5, p0

    :cond_1a
    const/4 v9, 0x0

    goto :goto_15

    :cond_1b
    move-object/from16 v5, p0

    :goto_14
    const/4 v9, 0x1

    :goto_15
    and-int/lit8 v14, v26, 0x70

    move-object/from16 v28, v6

    const/16 v6, 0x20

    if-ne v14, v6, :cond_1c

    const/4 v6, 0x1

    goto :goto_16

    :cond_1c
    const/4 v6, 0x0

    :goto_16
    or-int/2addr v6, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_1d

    if-ne v9, v4, :cond_1e

    :cond_1d
    new-instance v9, Lf1/w1;

    const/16 v6, 0x13

    invoke-direct {v9, v6, v5, v2}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object/from16 v20, v9

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v12

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object/from16 v14, v16

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_1f
    move-object/from16 v5, p0

    move-object/from16 v28, v6

    move-object v14, v12

    const/4 v6, 0x0

    const v9, -0x50e8e818

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    :goto_17
    invoke-interface {v3, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v6, 0x1

    int-to-float v9, v6

    invoke-virtual {v5}, Lh11/h;->q()Z

    move-result v6

    if-eqz v6, :cond_20

    sget-wide v16, Li2/x;->f:J

    :goto_18
    move-object/from16 v19, v14

    move-object/from16 v18, v15

    move-wide/from16 v14, v16

    goto :goto_19

    :cond_20
    sget-wide v16, Li2/x;->m:J

    goto :goto_18

    :goto_19
    invoke-static {v3, v9, v14, v15, v10}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v6, 0x6

    invoke-virtual {v13, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->W0()J

    move-result-wide v14

    invoke-static {v3, v14, v15, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit8 v6, v26, 0xe

    const/4 v10, 0x4

    if-eq v6, v10, :cond_22

    and-int/lit8 v6, v26, 0x8

    if-eqz v6, :cond_21

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_21

    goto :goto_1a

    :cond_21
    const/4 v6, 0x0

    goto :goto_1b

    :cond_22
    :goto_1a
    const/4 v6, 0x1

    :goto_1b
    invoke-virtual {v11, v0, v1}, Lp1/q;->f(J)Z

    move-result v10

    or-int/2addr v6, v10

    invoke-virtual {v11, v7}, Lp1/q;->d(F)Z

    move-result v10

    or-int/2addr v6, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_23

    if-ne v10, v4, :cond_24

    :cond_23
    new-instance v10, Lcz0/l;

    invoke-direct {v10, v5, v0, v1, v7}, Lcz0/l;-><init>(Lh11/h;JF)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v10}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    const/4 v14, 0x0

    invoke-static {v1, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_25

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_25
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1c
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_26

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_27

    :cond_26
    invoke-static {v4, v11, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v11, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v19

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v5}, Lh11/h;->j()Lgz0/m0;

    move-result-object v7

    if-eqz v7, :cond_28

    const/4 v7, 0x0

    int-to-float v12, v7

    const/4 v7, 0x4

    :goto_1d
    const/4 v2, 0x2

    goto :goto_1e

    :cond_28
    const/4 v7, 0x4

    int-to-float v12, v7

    mul-float/2addr v12, v9

    goto :goto_1d

    :goto_1e
    int-to-float v5, v2

    int-to-float v2, v7

    mul-float v7, v5, v2

    invoke-static {v10, v12, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Ll0/m;->e:Ll0/h;

    move/from16 v16, v7

    sget-object v7, Lb2/e;->N:Lb2/k;

    move-object/from16 v36, v1

    const/16 v1, 0x36

    move-object/from16 v17, v8

    invoke-static {v12, v7, v11, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move/from16 v37, v2

    iget-wide v1, v11, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 v19, v7

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_29

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1f

    :cond_29
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1f
    invoke-static {v11, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_2a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    :cond_2a
    invoke-static {v1, v11, v1, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2b
    invoke-static {v11, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v12, v2, v11, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_2c

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_20

    :cond_2c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_20
    invoke-static {v11, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_2d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    :cond_2d
    invoke-static {v7, v11, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2e
    invoke-static {v11, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lh11/h;->j()Lgz0/m0;

    move-result-object v1

    if-nez v1, :cond_2f

    const v1, 0x3d7a167c

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    move/from16 v40, v5

    move-object v1, v6

    move/from16 p3, v9

    move/from16 v39, v16

    move-object/from16 v38, v17

    move-object/from16 v5, v19

    move-object/from16 p2, v28

    const/16 v25, 0x4

    move-object/from16 v16, v0

    move-object v0, v13

    goto :goto_23

    :cond_2f
    const v2, 0x3d7a167d

    const/4 v7, 0x6

    invoke-static {v11, v2, v1, v11, v7}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lh11/h;->o()Lh11/g;

    move-result-object v2

    sget-object v8, Lh11/d$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v8, v2

    const/4 v8, 0x1

    if-ne v2, v8, :cond_30

    const v2, -0x7b093f63

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->Y0()J

    move-result-wide v20

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    :goto_21
    const/4 v8, 0x5

    goto :goto_22

    :cond_30
    const/4 v2, 0x0

    const v8, -0x7b0937a0

    invoke-static {v11, v8, v13, v11, v7}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v20

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto :goto_21

    :goto_22
    int-to-float v10, v8

    mul-float v10, v10, v37

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/16 v12, 0x1b0

    move-object/from16 v26, v13

    const/4 v13, 0x0

    move/from16 v29, v7

    const/4 v7, 0x0

    move-object/from16 p2, v6

    move-object v6, v1

    move-object/from16 v1, p2

    move/from16 v40, v5

    move/from16 p3, v9

    move-object v8, v10

    move/from16 v39, v16

    move-object/from16 v38, v17

    move-object/from16 v5, v19

    move-wide/from16 v9, v20

    move-object/from16 p2, v28

    const/16 v25, 0x4

    move-object/from16 v16, v0

    move-object/from16 v0, v26

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    :goto_23
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    const-string v42, "invalid weight; must be greater than zero"

    const-wide/16 v43, 0x0

    if-eqz v22, :cond_33

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v8, v7

    cmpl-double v6, v8, v43

    if-lez v6, :cond_31

    goto :goto_24

    :cond_31
    invoke-static/range {v42 .. v42}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_24
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v7, v2

    if-lez v6, :cond_32

    move v7, v2

    :goto_25
    const/4 v6, 0x1

    goto :goto_26

    :cond_32
    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_25

    :goto_26
    invoke-direct {v12, v7, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    goto :goto_27

    :cond_33
    const/4 v6, 0x1

    move-object/from16 v12, v16

    :goto_27
    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v7, v5, v11, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object v10, v7

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_34

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_28

    :cond_34
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_28
    invoke-static {v11, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_35

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_36

    :cond_35
    invoke-static {v6, v11, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_36
    invoke-static {v11, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lh11/h;->g()Lh11/a;

    move-result-object v6

    invoke-virtual {v6}, Lh11/a;->b()Ljava/lang/String;

    move-result-object v6

    if-eqz v35, :cond_37

    const v7, -0x51706fa5

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x6

    invoke-virtual {v0, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->d1()J

    move-result-wide v12

    const/4 v9, 0x0

    :goto_29
    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    goto :goto_2a

    :cond_37
    const/4 v7, 0x6

    const/4 v9, 0x0

    const v12, -0x51706bc5

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->Y0()J

    move-result-wide v12

    goto :goto_29

    :goto_2a
    invoke-virtual {v0, v11, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->c()Lb91/a;

    move-result-object v26

    new-instance v9, Lw3/k;

    move/from16 v41, v2

    const/4 v2, 0x3

    invoke-direct {v9, v2}, Lw3/k;-><init>(I)V

    const v30, 0xc00c30

    const v31, 0xd5fa

    move/from16 v29, v7

    const/4 v7, 0x0

    move-object/from16 v17, v10

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move/from16 v19, v8

    move-object/from16 v61, v18

    move-object/from16 v18, v9

    move-wide v8, v12

    move-object/from16 v13, v61

    const/4 v12, 0x0

    move-object/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    move-object/from16 v45, v16

    const-wide/16 v15, 0x0

    move-object/from16 v46, v17

    const/16 v17, 0x0

    move/from16 v48, v19

    move-object/from16 v47, v20

    const-wide/16 v19, 0x0

    move-object/from16 v49, v21

    const/16 v21, 0x1

    move-object/from16 v50, v22

    const/16 v22, 0x0

    const/16 v51, 0x1

    const/16 v23, 0x1

    move/from16 v52, v24

    const/16 v24, 0x0

    move/from16 v53, v25

    const/16 v25, 0x0

    move/from16 v54, v29

    const/16 v29, 0x0

    move-object/from16 v59, v45

    move-object/from16 v58, v46

    move-object/from16 v55, v47

    move-object/from16 v56, v49

    move-object/from16 v57, v50

    move/from16 v2, v54

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual/range {p0 .. p0}, Lh11/h;->g()Lh11/a;

    move-result-object v6

    invoke-virtual {v6}, Lh11/a;->a()Ljava/lang/String;

    move-result-object v6

    if-eqz v35, :cond_38

    const v7, -0x517034e2

    invoke-static {v11, v7, v0, v11, v2}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    const/4 v14, 0x0

    :goto_2b
    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    move-wide v8, v7

    goto :goto_2c

    :cond_38
    const/4 v14, 0x0

    const v7, -0x517030a5

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->Y0()J

    move-result-wide v7

    goto :goto_2b

    :goto_2c
    invoke-virtual {v0, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->D()Lb91/a;

    move-result-object v26

    new-instance v7, Lw3/k;

    const/4 v10, 0x3

    invoke-direct {v7, v10}, Lw3/k;-><init>(I)V

    const v30, 0xc00c00

    const v31, 0xddfa

    move-object/from16 v18, v7

    const/4 v7, 0x0

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    const/4 v14, 0x1

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lh11/h;->l()Lh11/a;

    move-result-object v46

    if-nez v46, :cond_39

    const v5, 0x3d9433f3

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    move-object v5, v0

    move-object/from16 v33, v1

    move-object/from16 v47, v4

    move v1, v14

    move-object/from16 v2, v56

    move-object/from16 v4, v57

    move-object/from16 v0, v59

    goto/16 :goto_39

    :cond_39
    const v6, 0x3d9433f4

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    mul-float v15, p3, v37

    move-object/from16 v6, v59

    invoke-static {v15, v6}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v11, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v7, 0x0

    move/from16 v8, v40

    const/4 v9, 0x2

    invoke-static {v6, v8, v7, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v8, v58

    const/16 v9, 0x30

    invoke-static {v8, v5, v11, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_3a

    move-object/from16 v9, v56

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_2d
    move-object/from16 v14, v57

    goto :goto_2e

    :cond_3a
    move-object/from16 v9, v56

    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_2d

    :goto_2e
    invoke-static {v11, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-nez v10, :cond_3b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3c

    :cond_3b
    invoke-static {v12, v11, v12, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3c
    invoke-static {v11, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v7, v2

    move/from16 v10, v37

    invoke-static {v7, v10, v6, v11}, Ld;->w(FFLb2/t;Lp1/q;)V

    if-eqz v34, :cond_3d

    sget-wide v12, Li2/x;->f:J

    goto :goto_2f

    :cond_3d
    sget-wide v12, Li2/x;->d:J

    :goto_2f
    invoke-static {v10, v6}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v34, v3

    const-wide v2, 0x3ffccccccccccccdL    # 1.8

    double-to-float v2, v2

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v58, v8

    move-wide v7, v12

    const/4 v12, 0x6

    const/16 v13, 0xc

    move-object/from16 v56, v9

    const/4 v9, 0x0

    move/from16 v37, v10

    const/4 v10, 0x0

    move-object/from16 v40, v0

    move-object/from16 v47, v4

    move-object v0, v6

    move-object/from16 v3, v58

    const/16 v4, 0x30

    move-object v6, v2

    move-object/from16 v2, v56

    invoke-static/range {v6 .. v13}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    const/16 v6, 0x8

    int-to-float v6, v6

    const/4 v8, 0x1

    invoke-static {v0, v6, v11, v8}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v11, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v8, v7

    cmpl-double v6, v8, v43

    if-lez v6, :cond_3e

    goto :goto_30

    :cond_3e
    invoke-static/range {v42 .. v42}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_30
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v8, v7, v41

    if-lez v8, :cond_3f

    move/from16 v7, v41

    :cond_3f
    const/4 v8, 0x1

    invoke-direct {v6, v7, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v3, v5, v11, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_40

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_31

    :cond_40
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_31
    invoke-static {v11, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v34

    invoke-static {v11, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_42

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_41

    goto :goto_33

    :cond_41
    :goto_32
    move-object/from16 v4, v47

    goto :goto_34

    :cond_42
    :goto_33
    invoke-static {v4, v11, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_32

    :goto_34
    invoke-static {v11, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v46 .. v46}, Lh11/a;->b()Ljava/lang/String;

    move-result-object v6

    if-eqz v35, :cond_43

    const v5, 0x323697fe

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    move-object/from16 v5, v40

    const/4 v7, 0x6

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->d1()J

    move-result-wide v9

    const/4 v12, 0x0

    :goto_35
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_36

    :cond_43
    move-object/from16 v5, v40

    const/4 v7, 0x6

    const/4 v12, 0x0

    const v9, 0x32369bde

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->Y0()J

    move-result-wide v9

    goto :goto_35

    :goto_36
    invoke-virtual {v5, v11, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->c()Lb91/a;

    move-result-object v26

    new-instance v7, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v7, v12}, Lw3/k;-><init>(I)V

    const v30, 0xc00c30

    const v31, 0xd5fa

    move-object/from16 v18, v7

    const/4 v7, 0x0

    move/from16 v23, v8

    move-wide v8, v9

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v57, v14

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    move/from16 v60, v23

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v29, 0x0

    move-object/from16 v33, v1

    move-object/from16 v47, v4

    move-object/from16 v4, v57

    move/from16 v1, v60

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual/range {v46 .. v46}, Lh11/a;->a()Ljava/lang/String;

    move-result-object v6

    if-eqz v35, :cond_44

    const v7, 0x3236d681

    const/4 v8, 0x6

    invoke-static {v11, v7, v5, v11, v8}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v9

    const/4 v14, 0x0

    :goto_37
    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_38

    :cond_44
    const/4 v8, 0x6

    const/4 v14, 0x0

    const v7, 0x3236dabe

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->Y0()J

    move-result-wide v9

    goto :goto_37

    :goto_38
    invoke-virtual {v5, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->D()Lb91/a;

    move-result-object v26

    new-instance v7, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v7, v12}, Lw3/k;-><init>(I)V

    const v30, 0xc00c00

    const v31, 0xddfa

    move-object/from16 v18, v7

    const/4 v7, 0x0

    move-wide v8, v9

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_39
    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lh11/h;->n()Z

    move-result v6

    if-eqz v6, :cond_50

    const v6, -0x122d40bf

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    mul-float v9, p3, v37

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v11, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    mul-float v6, v37, v37

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lh11/h;->o()Lh11/g;

    move-result-object v7

    move-object/from16 v13, v55

    if-ne v7, v13, :cond_45

    const v7, -0x122a1e80

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x6

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->Y0()J

    move-result-wide v7

    invoke-static/range {v39 .. v39}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    move/from16 v10, p3

    invoke-static {v0, v10, v7, v8, v9}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v14, 0x0

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto/16 :goto_3e

    :cond_45
    const/4 v14, 0x0

    const v7, -0x122516ca

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lh11/h;->i()Ly81/e;

    move-result-object v7

    if-nez v7, :cond_46

    const v7, -0x122394a0

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_3a
    move-object/from16 v7, v32

    goto :goto_3b

    :cond_46
    const v8, 0x7b492cc1

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-interface {v7, v11, v14}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-static {v11, v14, v7, v8}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v32

    goto :goto_3a

    :goto_3b
    if-nez v7, :cond_4b

    const v7, -0x12225e42

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lh11/h;->o()Lh11/g;

    move-result-object v7

    sget-object v8, Lh11/d$a;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v8, v7

    const/4 v9, 0x2

    if-eq v7, v9, :cond_4a

    const/4 v12, 0x3

    if-eq v7, v12, :cond_49

    const/4 v9, 0x4

    if-eq v7, v9, :cond_48

    const/4 v8, 0x5

    if-eq v7, v8, :cond_47

    const v7, 0x7b497554

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x6

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->F()J

    move-result-wide v8

    const/4 v14, 0x0

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_3c

    :cond_47
    const/4 v7, 0x6

    const/4 v14, 0x0

    const v8, 0x7b496b57

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->C()J

    move-result-wide v8

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_3c

    :cond_48
    const/4 v7, 0x6

    const/4 v14, 0x0

    const v8, 0x7b495e94

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->F()J

    move-result-wide v8

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_3c

    :cond_49
    const/4 v7, 0x6

    const/4 v14, 0x0

    const v8, 0x7b4951b5

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->Y0()J

    move-result-wide v8

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_3c

    :cond_4a
    const/4 v7, 0x6

    const/4 v14, 0x0

    const v8, 0x7b4943da

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->a()J

    move-result-wide v8

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_3c
    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_3d

    :cond_4b
    const/4 v14, 0x0

    const v8, 0x7b492bbf

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    iget-wide v8, v7, Li2/x;->a:J

    :goto_3d
    invoke-static/range {v39 .. v39}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v0, v8, v9, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_3e
    invoke-interface {v6, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v36

    invoke-static {v7, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_4c

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3f

    :cond_4c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_3f
    invoke-static {v11, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_4d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4e

    :cond_4d
    move-object/from16 v2, v33

    goto :goto_41

    :cond_4e
    :goto_40
    move-object/from16 v4, v47

    goto :goto_42

    :goto_41
    invoke-static {v8, v11, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_40

    :goto_42
    invoke-static {v11, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lh11/h;->o()Lh11/g;

    move-result-object v2

    sget-object v3, Lh11/g;->COMPLETED_JOURNAL:Lh11/g;

    if-ne v2, v3, :cond_4f

    const v2, 0x73969a6b

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    move/from16 v2, v39

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/i0;->i()I

    move-result v0

    const/16 v7, 0x36

    invoke-static {v0, v11, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    const/4 v7, 0x6

    invoke-virtual {v5, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v9

    sget v0, Lgy0/f;->d:I

    invoke-static {v11, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/16 v12, 0x180

    const/4 v13, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x0

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_43

    :cond_4f
    const/4 v14, 0x0

    const v0, 0x739f0f55

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_43
    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_44

    :cond_50
    const/4 v14, 0x0

    const v0, -0x120ba88c

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_44
    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    move-object/from16 v4, v38

    goto :goto_45

    :cond_51
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v3, v8

    move-object v4, v10

    :goto_45
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_52

    new-instance v0, Lg1/m3;

    const/16 v7, 0x8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_52
    return-void
.end method

.method private static final f(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lh11/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Lh11/h;->k()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lh11/b;

    invoke-virtual {p0}, Lh11/h;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lh11/h;->e()Ljava/lang/Long;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lh11/b;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_0
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lh11/h;JFLk2/e;)Ll83/a0;
    .locals 16

    move/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "$this$drawBehind"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lh11/h;->m()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lh11/h;->q()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v5

    invoke-interface {v1, v0}, Ly3/c;->q0(F)F

    move-result v2

    invoke-interface {v1, v0}, Ly3/c;->q0(F)F

    move-result v0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v7, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const-wide v9, 0xffffffffL

    and-long/2addr v7, v9

    or-long/2addr v7, v2

    new-instance v9, Lk2/i;

    const/4 v0, 0x3

    int-to-float v0, v0

    invoke-interface {v1, v0}, Ly3/c;->q0(F)F

    move-result v10

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    new-instance v14, Li2/k;

    new-instance v2, Landroid/graphics/DashPathEffect;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v14, v2}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v15, 0xe

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/4 v10, 0x0

    const/16 v11, 0xe2

    const-wide/16 v3, 0x0

    move-object v0, v1

    move-wide/from16 v1, p1

    invoke-static/range {v0 .. v11}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :array_0
    .array-data 4
        0x41400000    # 12.0f
        0x40c00000    # 6.0f
    .end array-data
.end method

.method private static final i(Lh11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lh11/d;->e(Lh11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j()F
    .locals 1

    sget v0, Lh11/d;->a:F

    return v0
.end method

.method public static final k()F
    .locals 1

    sget v0, Lh11/d;->c:F

    return v0
.end method
