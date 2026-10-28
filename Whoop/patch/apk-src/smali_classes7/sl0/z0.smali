.class public abstract Lsl0/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0008H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "icon",
        "",
        "alpha",
        "",
        "hasFeedback",
        "Lkotlin/Function1;",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "Ll83/a0;",
        "onFeedbackClicked",
        "e",
        "(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/z0;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/z0;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/z0;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsl0/z0;->i(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "IFZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "onFeedbackClicked"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x1e48d9c3

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v6, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v6, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    if-nez v3, :cond_5

    and-int/lit8 v3, p7, 0x2

    if-nez v3, :cond_3

    move/from16 v3, p1

    invoke-virtual {v12, v3}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    move/from16 v3, p1

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    goto :goto_3

    :cond_5
    move/from16 v3, p1

    :goto_3
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_6

    move/from16 v7, p2

    invoke-virtual {v12, v7}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v2, v2, 0xc00

    :cond_9
    move/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_9

    move/from16 v9, p3

    invoke-virtual {v12, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v2, v10

    :goto_7
    and-int/lit16 v10, v6, 0x6000

    const/16 v15, 0x4000

    if-nez v10, :cond_d

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    move v10, v15

    goto :goto_8

    :cond_c
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v2, v10

    :cond_d
    and-int/lit16 v10, v2, 0x2493

    const/16 v11, 0x2492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v10, v11, :cond_e

    move v10, v14

    goto :goto_9

    :cond_e
    move v10, v13

    :goto_9
    and-int/lit8 v11, v2, 0x1

    invoke-virtual {v12, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_29

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v10, v6, 0x1

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v10, :cond_12

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_f

    goto :goto_a

    :cond_f
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_10

    and-int/lit8 v2, v2, -0x71

    :cond_10
    move/from16 v18, v3

    move/from16 v28, v7

    :cond_11
    move v0, v9

    goto :goto_d

    :cond_12
    :goto_a
    if-eqz v0, :cond_13

    move-object v1, v11

    :cond_13
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_14

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->r()I

    move-result v0

    and-int/lit8 v2, v2, -0x71

    goto :goto_b

    :cond_14
    move v0, v3

    :goto_b
    if-eqz v4, :cond_15

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_c

    :cond_15
    move v3, v7

    :goto_c
    move/from16 v18, v0

    move/from16 v28, v3

    if-eqz v8, :cond_11

    move v0, v13

    :goto_d
    invoke-virtual {v12}, Lp1/q;->r()V

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v4, "whoop-coach-feedback-v3"

    invoke-interface {v3, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    if-eqz v3, :cond_21

    if-nez v0, :cond_21

    const v3, -0x3faff525

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    double-to-float v3, v8

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->J:Lb2/l;

    const/4 v10, 0x6

    invoke-static {v8, v9, v12, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    const p0, 0xe000

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-eqz v4, :cond_16

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_e
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v12, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_18

    :cond_17
    invoke-static {v9, v12, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v20, Lny0/q$b;->f:Lny0/q$b;

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->k0()I

    move-result v21

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_19

    sget-object v4, Lsl0/z0$a;->w:Lsl0/z0$a;

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v22

    new-instance v19, Lny0/o;

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x2f8

    const/16 v31, 0x0

    invoke-direct/range {v19 .. v31}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v4, Lwk0/b;->C0:I

    invoke-static {v12, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    and-int v2, v2, p0

    if-ne v2, v15, :cond_1a

    move v4, v14

    goto :goto_f

    :cond_1a
    move v4, v13

    :goto_f
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_1b

    if-ne v9, v7, :cond_1c

    :cond_1b
    new-instance v9, Lsl0/n;

    const/4 v4, 0x5

    invoke-direct {v9, v5, v4}, Lsl0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v11, v9

    check-cast v11, Lc93/a;

    move v4, v13

    sget v13, Lny0/o;->k:I

    move v9, v14

    const/16 v14, 0xc

    move v10, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object v4, v7

    move-object/from16 v7, v19

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/k0;->j0()I

    move-result v21

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_1d

    sget-object v3, Lsl0/z0$b;->w:Lsl0/z0$b;

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v22

    new-instance v19, Lny0/o;

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x2f8

    const/16 v31, 0x0

    invoke-direct/range {v19 .. v31}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lwk0/b;->B0:I

    invoke-static {v12, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    if-ne v2, v15, :cond_1e

    const/4 v2, 0x1

    goto :goto_10

    :cond_1e
    const/4 v2, 0x0

    :goto_10
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1f

    if-ne v3, v4, :cond_20

    :cond_1f
    new-instance v3, Lsl0/n;

    const/4 v2, 0x6

    invoke-direct {v3, v5, v2}, Lsl0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object v11, v3

    check-cast v11, Lc93/a;

    const/16 v14, 0xc

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v7, v19

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :cond_21
    move-object v4, v7

    move v7, v13

    move v3, v14

    const p0, 0xe000

    const v10, -0x3f9e886a

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    double-to-float v8, v8

    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v8, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->H:Lb2/m;

    invoke-static {v9, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_22

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_22
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_11
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_23

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_24

    :cond_23
    invoke-static {v7, v12, v7, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v17, Lny0/q$b;->f:Lny0/q$b;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_25

    sget-object v7, Lsl0/z0$c;->w:Lsl0/z0$c;

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    new-instance v16, Lny0/o;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x2f8

    move/from16 v25, v28

    const/16 v28, 0x0

    invoke-direct/range {v16 .. v28}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v28, v25

    sget v7, Lwk0/b;->A0:I

    invoke-static {v12, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    and-int v2, v2, p0

    if-ne v2, v15, :cond_26

    move v13, v3

    goto :goto_12

    :cond_26
    const/4 v13, 0x0

    :goto_12
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v13, :cond_27

    if-ne v2, v4, :cond_28

    :cond_27
    new-instance v2, Lsl0/n;

    const/4 v4, 0x7

    invoke-direct {v2, v5, v4}, Lsl0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    move-object v11, v2

    check-cast v11, Lc93/a;

    sget v13, Lny0/o;->k:I

    const/16 v14, 0xc

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v7, v16

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    :goto_13
    move v4, v0

    move/from16 v2, v18

    move/from16 v3, v28

    goto :goto_14

    :cond_29
    invoke-virtual {v12}, Lp1/q;->X()V

    move v2, v3

    move v3, v7

    move v4, v9

    :goto_14
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2a

    new-instance v0, Lis0/o;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lis0/o;-><init>(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->BETTER:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lsl0/z0;->e(Landroidx/compose/ui/Modifier;IFZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
