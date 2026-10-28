.class public abstract Lzt2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzt2/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0007\u001a[\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lwt2/n;",
        "planState",
        "",
        "isUpdating",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onCurrentPlanClicked",
        "Lkotlin/Function1;",
        "Lvt2/g;",
        "onNavigationEvent",
        "",
        "onViewEvent",
        "h",
        "(Lwt2/n;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "event",
        "p",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "weekly-plan_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lzt2/j;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Le11/d;Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzt2/j;->l(Le11/d;Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lwt2/n;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lzt2/j;->o(Lwt2/n;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzt2/j;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lvt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzt2/j;->j(Lvt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lwt2/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzt2/j;->n(Lwt2/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzt2/j;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lwt2/n;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt2/n;",
            "Z",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v4, p4

    move/from16 v0, p6

    const-string v2, "planState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onViewEvent"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v2, -0x432a45fc

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v0, 0x6

    const/4 v3, 0x2

    const/4 v5, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v0

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    and-int/lit8 v6, p7, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_2

    move/from16 v7, p1

    invoke-virtual {v8, v7}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v2, v9

    :goto_3
    and-int/lit8 v9, p7, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v0, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p2

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v2, v12

    :goto_5
    and-int/lit16 v12, v0, 0x6000

    if-nez v12, :cond_9

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x4000

    goto :goto_6

    :cond_8
    const/16 v12, 0x2000

    :goto_6
    or-int/2addr v2, v12

    :cond_9
    and-int/lit16 v12, v2, 0x2093

    const/16 v14, 0x2092

    const/4 v15, 0x1

    const/4 v7, 0x0

    if-eq v12, v14, :cond_a

    move v12, v15

    goto :goto_7

    :cond_a
    move v12, v7

    :goto_7
    and-int/lit8 v14, v2, 0x1

    invoke-virtual {v8, v14, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_33

    if-eqz v6, :cond_b

    move v6, v7

    goto :goto_8

    :cond_b
    move/from16 v6, p1

    :goto_8
    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v12, :cond_c

    new-instance v9, Lzi1/e0;

    const/16 v11, 0xf

    invoke-direct {v9, v11}, Lzi1/e0;-><init>(I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v9, Lc93/a;

    goto :goto_9

    :cond_d
    move-object v9, v11

    :goto_9
    and-int/lit8 v11, p7, 0x8

    if-eqz v11, :cond_f

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v12, :cond_e

    new-instance v11, Lzm1/d;

    const/16 v14, 0x11

    invoke-direct {v11, v14}, Lzm1/d;-><init>(I)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v11, Lkotlin/jvm/functions/Function1;

    move-object/from16 v29, v11

    goto :goto_a

    :cond_f
    move-object/from16 v29, p3

    :goto_a
    invoke-virtual {v1}, Lwt2/n;->l()Lwt2/h;

    move-result-object v11

    invoke-virtual {v11}, Lwt2/h;->b()Lwt2/m;

    move-result-object v11

    sget-object v14, Lzt2/j$a;->a:[I

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v11, v14, v11

    const/4 v14, 0x3

    if-eq v11, v15, :cond_13

    if-eq v11, v3, :cond_12

    if-eq v11, v14, :cond_11

    if-ne v11, v5, :cond_10

    const v11, -0x21b07352

    invoke-virtual {v8, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-static {v11, v8, v3, v7}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    :goto_b
    move-wide/from16 v22, v16

    goto :goto_c

    :cond_10
    const v0, -0x21b097a0

    invoke-static {v0, v8, v7}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_11
    const v3, -0x21b07c69

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v3, v8, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->f()J

    move-result-wide v16

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    const v3, -0x21b084d4

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v3, v8, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v16

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    const v3, -0x21b08dd0

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v3, v8, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->a()J

    move-result-wide v16

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v11, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-eqz v5, :cond_14

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_14
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_d
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v8, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    :cond_15
    invoke-static {v10, v8, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lwt2/n;->e()Lwt2/d;

    move-result-object v7

    const v24, 0xe000

    if-nez v7, :cond_17

    const v0, -0x2dac56f0

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    move/from16 v25, v2

    move/from16 v40, v6

    move-object v1, v9

    move-object/from16 v37, v12

    move-object v3, v14

    const/4 v0, 0x1

    const/4 v4, 0x3

    move v12, v10

    goto/16 :goto_15

    :cond_17
    const/4 v10, 0x0

    const v15, -0x2dac56ef

    invoke-virtual {v8, v15}, Lp1/q;->e0(I)V

    const/16 v15, 0x32

    int-to-float v15, v15

    move-object/from16 p2, v7

    const/4 v10, 0x4

    int-to-float v7, v10

    mul-float/2addr v15, v7

    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v10, Lb2/e;->w:Lb2/m;

    const/4 v1, 0x0

    invoke-static {v10, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    move/from16 v25, v2

    iget-wide v1, v8, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v8, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 v21, v6

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_18

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v8, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_19

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    :cond_19
    invoke-static {v1, v8, v1, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v8, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0xc

    int-to-float v0, v0

    mul-float/2addr v0, v7

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lwt2/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lwt2/d;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1b

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1b

    const/4 v1, 0x1

    goto :goto_f

    :cond_1b
    const/4 v1, 0x0

    :goto_f
    invoke-virtual/range {p2 .. p2}, Lwt2/d;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1c

    const/4 v2, 0x1

    goto :goto_10

    :cond_1c
    const/4 v2, 0x0

    :goto_10
    move v10, v2

    goto :goto_11

    :cond_1d
    const/4 v10, 0x0

    :goto_11
    invoke-virtual/range {p2 .. p2}, Lwt2/d;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_1e

    move-object v11, v3

    goto :goto_12

    :cond_1e
    move-object v11, v2

    :goto_12
    invoke-virtual/range {p2 .. p2}, Lwt2/d;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1f

    goto :goto_13

    :cond_1f
    move-object v3, v2

    :goto_13
    and-int v2, v25, v24

    const/16 v6, 0x4000

    if-ne v2, v6, :cond_20

    const/4 v2, 0x1

    goto :goto_14

    :cond_20
    const/4 v2, 0x0

    :goto_14
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v2, :cond_21

    if-ne v13, v12, :cond_22

    :cond_21
    new-instance v13, Lzr1/a;

    const/4 v2, 0x2

    invoke-direct {v13, v4, v2}, Lzr1/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v13, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v2, v25, 0x70

    or-int/lit8 v2, v2, 0x6

    sget v15, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v15, v15, 0x9

    or-int/2addr v2, v15

    const/4 v15, 0x0

    const/16 v20, 0x0

    move/from16 v18, v6

    move/from16 v6, v21

    const/16 v21, 0xf04

    move/from16 v26, v7

    const/4 v7, 0x0

    move-object/from16 v17, v13

    const/16 v27, 0x1

    const/4 v13, 0x0

    move-object/from16 v30, v14

    const/4 v14, 0x0

    move/from16 v28, v15

    const/4 v15, 0x0

    const/16 v31, 0x100

    const/16 v16, 0x0

    move-object v4, v9

    move v9, v1

    move-object v1, v4

    move/from16 v19, v2

    move-object/from16 v18, v8

    move-object/from16 v37, v12

    move/from16 v2, v26

    const/4 v4, 0x3

    move-object v8, v0

    move-object v12, v3

    move/from16 v0, v27

    move-object/from16 v3, v30

    invoke-static/range {v5 .. v21}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move/from16 v40, v6

    move-object/from16 v8, v18

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    int-to-float v5, v4

    const/4 v12, 0x0

    invoke-static {v5, v2, v3, v8, v12}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_15
    invoke-virtual/range {p0 .. p0}, Lwt2/n;->d()Le11/d;

    move-result-object v2

    if-nez v2, :cond_23

    const v2, -0x2da12d3f

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move/from16 v14, v25

    move-object/from16 v15, v37

    const/4 v13, 0x4

    goto :goto_17

    :cond_23
    const v5, -0x2da12d3e

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    new-instance v13, Le11/d;

    invoke-virtual {v2}, Le11/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v2}, Le11/d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v2}, Le11/d;->b()I

    move-result v16

    invoke-virtual {v2}, Le11/d;->e()Lgz0/m0;

    move-result-object v17

    invoke-virtual {v2}, Le11/d;->a()Lcom/whoop/navigation/e;

    move-result-object v18

    invoke-direct/range {v13 .. v18}, Le11/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILgz0/m0;Lcom/whoop/navigation/e;)V

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    move/from16 v14, v25

    and-int/lit16 v6, v14, 0x380

    const/16 v7, 0x100

    if-ne v6, v7, :cond_24

    move v15, v0

    goto :goto_16

    :cond_24
    move v15, v12

    :goto_16
    or-int/2addr v5, v15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v15, v37

    if-nez v5, :cond_25

    if-ne v6, v15, :cond_26

    :cond_25
    new-instance v6, Lx30/j1;

    const/16 v5, 0x18

    invoke-direct {v6, v5, v2, v1}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object v7, v6

    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v2, Le11/d;->f:I

    shl-int/lit8 v9, v2, 0x3

    const/4 v10, 0x1

    const/4 v5, 0x0

    move-object v6, v13

    invoke-static/range {v5 .. v10}, Le11/c;->e(Landroidx/compose/ui/Modifier;Le11/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v13, 0x4

    int-to-float v2, v13

    invoke-static {v2, v2, v3, v8, v12}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_17
    invoke-virtual/range {p0 .. p0}, Lwt2/n;->i()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_27

    const v2, -0x2d96e201

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_27
    const v5, -0x2d96e200

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm91/u;

    and-int v6, v14, v24

    const/16 v7, 0x4000

    if-ne v6, v7, :cond_28

    move v6, v0

    goto :goto_19

    :cond_28
    move v6, v12

    :goto_19
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_2a

    if-ne v9, v15, :cond_29

    goto :goto_1a

    :cond_29
    move-object/from16 v10, p4

    goto :goto_1b

    :cond_2a
    :goto_1a
    new-instance v9, Lzr1/a;

    const/4 v6, 0x3

    move-object/from16 v10, p4

    invoke-direct {v9, v10, v6}, Lzr1/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v6, 0x0

    move/from16 v18, v7

    const/4 v7, 0x0

    move-object/from16 v41, v9

    move-object v9, v8

    move-object/from16 v8, v41

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v9

    int-to-float v5, v4

    int-to-float v6, v13

    invoke-static {v5, v6, v3, v8}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_18

    :cond_2b
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_1c
    invoke-virtual/range {p0 .. p0}, Lwt2/n;->c()Lzt2/e;

    move-result-object v2

    const/high16 v9, 0x3f800000    # 1.0f

    if-nez v2, :cond_2c

    const v2, -0x2d91505e

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move v11, v4

    move-object v5, v8

    const/4 v10, 0x2

    move-object v8, v3

    goto :goto_1d

    :cond_2c
    const v5, -0x2d91505d

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    move-object v5, v2

    invoke-static {v9, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v7, Ly71/g;->c:I

    or-int/2addr v6, v7

    sget v7, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v6, v7

    shl-int/2addr v6, v4

    or-int/lit8 v6, v6, 0x6

    shr-int/lit8 v7, v14, 0x6

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v6, v7

    const/4 v7, 0x0

    move-object v10, v8

    move-object v8, v3

    move-object v3, v5

    move-object v5, v10

    move v11, v4

    const/4 v10, 0x2

    move-object/from16 v4, p4

    invoke-static/range {v2 .. v7}, Lzt2/d;->e(Landroidx/compose/ui/Modifier;Lzt2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v2, v13

    invoke-static {v2, v2, v8, v5, v12}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_1d
    int-to-float v2, v0

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v3, v2

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v5, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/n;->l()Lwt2/h;

    move-result-object v4

    invoke-virtual {v4}, Lwt2/h;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v5, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v7, v5, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->P()Lb91/a;

    move-result-object v15

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v27, v16, 0x12

    const v28, 0x2fffa

    move/from16 v16, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object/from16 v17, v7

    move-object/from16 v30, v8

    const-wide/16 v7, 0x0

    move/from16 v18, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move/from16 v20, v11

    const/4 v11, 0x0

    move/from16 v39, v12

    move/from16 v38, v13

    const-wide/16 v12, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v25, v5

    move-wide/from16 v41, v22

    move/from16 v22, v6

    move-object/from16 v23, v15

    move-wide/from16 v5, v41

    const/4 v15, 0x0

    move/from16 v24, v16

    move-object/from16 v26, v17

    const-wide/16 v16, 0x0

    move/from16 v31, v18

    const/16 v18, 0x0

    move/from16 v32, v19

    const/16 v19, 0x0

    move/from16 v33, v20

    const/16 v20, 0x0

    move/from16 v34, v21

    const/16 v21, 0x0

    move/from16 v35, v22

    const/16 v22, 0x0

    move/from16 v36, v24

    const/16 v24, 0x0

    move-object/from16 v37, v26

    const/16 v26, 0x0

    move-object/from16 v0, v30

    move/from16 v30, v36

    move-object/from16 v38, v37

    move-object/from16 v36, v1

    move/from16 v37, v34

    move/from16 v1, v35

    move/from16 v34, v2

    move/from16 v2, v32

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual/range {p0 .. p0}, Lwt2/n;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-eqz v3, :cond_2d

    const v3, -0x2d89c8ac

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v4, v3

    mul-float/2addr v2, v4

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/n;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v8, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move/from16 v4, v37

    move-object/from16 v2, v38

    invoke-virtual {v2, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v2, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    const/16 v26, 0x0

    const v28, 0x2fffa

    move/from16 v21, v4

    const/4 v4, 0x0

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v37, v21

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move/from16 v38, v3

    move-object v3, v1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    move v1, v3

    goto :goto_1e

    :cond_2d
    move/from16 v4, v37

    move-object/from16 v2, v38

    const/4 v3, 0x0

    const/16 v38, 0x4

    invoke-virtual/range {p0 .. p0}, Lwt2/n;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-eqz v5, :cond_2e

    const v5, -0x2d855c72

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lwt2/n;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v8, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v2, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    const/16 v26, 0x0

    const v28, 0x2fffa

    move/from16 v37, v4

    const/4 v4, 0x0

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move/from16 v41, v3

    move-object v3, v1

    move/from16 v1, v41

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_2e
    move v1, v3

    move/from16 v37, v4

    const v3, -0x2d82752c

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual/range {p0 .. p0}, Lwt2/n;->j()Lwt2/g;

    move-result-object v3

    if-nez v3, :cond_2f

    const v0, -0x2d810a9f

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_1f
    const/4 v0, 0x1

    goto/16 :goto_21

    :cond_2f
    const v4, -0x2d810a9e

    move/from16 v5, v30

    invoke-static {v8, v4, v0, v5, v8}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    const/4 v4, 0x0

    const/4 v11, 0x3

    invoke-static {v0, v4, v11}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->L:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v5, v8, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_30

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_20

    :cond_30
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_20
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_31

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_32

    :cond_31
    invoke-static {v6, v8, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_32
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lb3/v1;->n:Lp1/u2;

    sget-object v5, Ly3/m;->w:Ly3/m;

    invoke-virtual {v4, v5}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    new-instance v5, Lw20/q;

    const/16 v6, 0x1c

    invoke-direct {v5, v3, v6}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    const v6, 0x733c407c

    invoke-static {v6, v8, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v6, 0x38

    invoke-static {v4, v5, v8, v6}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    const/4 v10, 0x4

    int-to-float v4, v10

    mul-float v4, v4, v34

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v8, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v33, 0x0

    const/16 v35, 0x7

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v30, v0

    invoke-static/range {v30 .. v35}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v5, v3

    invoke-virtual {v5}, Lwt2/g;->b()Ljava/lang/String;

    move-result-object v3

    move/from16 v6, v37

    invoke-virtual {v2, v8, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    invoke-virtual {v2, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v9

    const/16 v26, 0x30

    const v28, 0x2fff8

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move-wide/from16 v41, v9

    move-object v10, v5

    move-wide/from16 v5, v41

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v14, v12

    const-wide/16 v12, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const-wide/16 v16, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v31, v24

    const/16 v24, 0x0

    move v1, v4

    move/from16 v34, v37

    move-object v4, v0

    move-object/from16 v0, v30

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    const/4 v3, 0x1

    invoke-static {v8, v3, v0, v1, v8}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-virtual/range {v31 .. v31}, Lwt2/g;->a()I

    move-result v4

    sget-object v0, Li2/t;->b:Li2/s;

    move/from16 v6, v34

    invoke-virtual {v2, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->j()J

    move-result-wide v9

    new-instance v3, Li2/x;

    invoke-direct {v3, v9, v10}, Li2/x;-><init>(J)V

    invoke-virtual {v2, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->j()J

    move-result-wide v9

    new-instance v5, Li2/x;

    invoke-direct {v5, v9, v10}, Li2/x;-><init>(J)V

    filled-new-array {v3, v5}, [Li2/x;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v5, 0xe

    const/4 v7, 0x0

    invoke-static {v0, v3, v7, v7, v5}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    invoke-virtual {v2, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    const v12, 0x1b0180

    const/4 v13, 0x1

    move-wide v7, v2

    const/4 v3, 0x0

    const/16 v5, 0x64

    const/4 v9, 0x0

    move-object v6, v0

    move v10, v1

    move-object/from16 v11, v25

    invoke-static/range {v3 .. v13}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    move-object v8, v11

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_1f

    :goto_21
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, v29

    move-object/from16 v3, v36

    move/from16 v2, v40

    goto :goto_22

    :cond_33
    invoke-virtual {v8}, Lp1/q;->X()V

    move/from16 v2, p1

    move-object/from16 v4, p3

    move-object v3, v11

    :goto_22
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_34

    new-instance v0, Ltg2/i;

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Ltg2/i;-><init>(Lwt2/n;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_34
    return-void
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lvt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwt2/o$c;

    check-cast p1, Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p1, v1, v2, v1}, Lwt2/o$c;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Le11/d;Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "destination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le11/d;->e()Lgz0/m0;

    move-result-object p0

    if-eqz p0, :cond_0

    instance-of p0, p2, Lcom/whoop/navigation/e;

    if-eqz p0, :cond_0

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    sget-object p2, Lcom/whoop/navigation/AppScreen$m6;->w:Lcom/whoop/navigation/AppScreen$m6;

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lzt2/j;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lwt2/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/e;->L:Lb2/l;

    sget-object v1, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x30

    invoke-static {v1, v0, v4, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v1, v4, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lwt2/g;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, v2}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->C()Lb91/a;

    move-result-object v24

    invoke-virtual {v1, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v28, v9, 0x12

    const v29, 0x2fffa

    move v9, v5

    const/4 v5, 0x0

    move-wide v10, v7

    move v7, v9

    const-wide/16 v8, 0x0

    move-object v12, v6

    move-wide/from16 v31, v10

    move v11, v7

    move-wide/from16 v6, v31

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move v15, v13

    move-object/from16 v16, v14

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    move-object/from16 v20, v18

    const-wide/16 v17, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v30, v27

    const/16 v27, 0x0

    move-object/from16 v31, v4

    move-object v4, v0

    move/from16 v0, v26

    move-object/from16 v26, v31

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    int-to-float v10, v3

    const/4 v11, 0x7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, v30

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v6, Lgy0/f;->F1:I

    invoke-static {v6, v4, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->E()Lb91/a;

    move-result-object v24

    invoke-virtual {v1, v4, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    const/16 v27, 0x30

    const v29, 0x2fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lwt2/n;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lzt2/j;->h(Lwt2/n;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p0, Lcom/whoop/navigation/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/whoop/navigation/e;

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v3, v0, Lcom/whoop/navigation/ChallengeLandingScreenModel;

    if-eqz v3, :cond_1

    check-cast v0, Lcom/whoop/navigation/ChallengeLandingScreenModel;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    const-string v1, "jj_tile_on_weekly_plan"

    invoke-virtual {v0, v1}, Lcom/whoop/navigation/ChallengeLandingScreenModel;->copy(Ljava/lang/String;)Lcom/whoop/navigation/ChallengeLandingScreenModel;

    move-result-object v4

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    return-object v1

    :cond_4
    :goto_2
    return-object p0
.end method
