.class public abstract Lnx1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljx1/e;",
        "viewState",
        "",
        "isIndependentCheckout",
        "Lkotlin/Function1;",
        "Llx1/e;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/membership/management/navigation/b;",
        "onNavEvent",
        "f",
        "(Ljx1/e;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "membership_release"
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
.method public static synthetic a(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lnx1/b;->j(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lnx1/b;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lnx1/b;->i(Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljx1/e;Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lnx1/b;->h(Ljx1/e;Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljx1/e;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lnx1/b;->k(Ljx1/e;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljx1/e;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljx1/e;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v2, p3

    move/from16 v6, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p4

    check-cast v7, Lp1/q;

    const v0, -0x3f5bb4b5

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v4, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v5, p6, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v6, 0x30

    if-nez v9, :cond_2

    move/from16 v9, p1

    invoke-virtual {v7, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v0, v10

    :goto_3
    and-int/lit16 v10, v6, 0x180

    const/16 v11, 0x100

    if-nez v10, :cond_6

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    move v10, v11

    goto :goto_4

    :cond_5
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :cond_6
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_8

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x800

    goto :goto_5

    :cond_7
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v0, v10

    :cond_8
    and-int/lit16 v10, v0, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v10, v13, :cond_9

    move v10, v14

    goto :goto_6

    :cond_9
    move v10, v15

    :goto_6
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v7, v13, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_21

    if-eqz v5, :cond_a

    move v9, v15

    :cond_a
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v5, v10, :cond_b

    new-instance v5, Lnx1/a;

    const/4 v13, 0x0

    invoke-direct {v5, v13}, Lnx1/a;-><init>(I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lc93/a;

    const/16 v13, 0x30

    invoke-static {v5, v15, v7, v13, v14}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v7, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->o()J

    move-result-wide v13

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v13, v14, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v13, v7, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v7, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v7, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-nez v12, :cond_d

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    :cond_d
    invoke-static {v13, v7, v13, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v7, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v9, :cond_f

    sget-object v5, Lcom/whoop/membership/management/navigation/b$b;->a:Lcom/whoop/membership/management/navigation/b$b;

    goto :goto_8

    :cond_f
    sget-object v5, Lcom/whoop/membership/management/navigation/b$c;->a:Lcom/whoop/membership/management/navigation/b$c;

    :goto_8
    instance-of v8, v1, Ljx1/e$a;

    if-eqz v8, :cond_19

    const v8, 0x4f736c24

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    new-instance v19, Lsz0/p0$b;

    sget v8, Lpv1/b;->e:I

    invoke-static {v8}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v20

    const/16 v23, 0x6

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v19 .. v24}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v12, Lpv1/b;->l:I

    invoke-static {v12}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    sget v13, Lpv1/b;->a:I

    invoke-static {v13}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v14

    move-object v13, v1

    check-cast v13, Ljx1/e$a;

    invoke-virtual {v13}, Ljx1/e$a;->b()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-lez v13, :cond_10

    move-object v13, v12

    const/4 v12, 0x1

    goto :goto_9

    :cond_10
    move-object v13, v12

    const/4 v12, 0x0

    :goto_9
    and-int/lit8 v15, v0, 0xe

    if-ne v15, v4, :cond_11

    const/4 v4, 0x1

    goto :goto_a

    :cond_11
    const/4 v4, 0x0

    :goto_a
    and-int/lit16 v15, v0, 0x380

    if-ne v15, v11, :cond_12

    const/4 v11, 0x1

    goto :goto_b

    :cond_12
    const/4 v11, 0x0

    :goto_b
    or-int/2addr v4, v11

    and-int/lit16 v11, v0, 0x1c00

    const/16 v0, 0x800

    if-ne v11, v0, :cond_13

    const/4 v0, 0x1

    goto :goto_c

    :cond_13
    const/4 v0, 0x0

    :goto_c
    or-int/2addr v0, v4

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_14

    if-ne v4, v10, :cond_15

    :cond_14
    new-instance v0, Lnw0/e;

    move-object v3, v5

    const/4 v5, 0x2

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Lnw0/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    move-object v5, v3

    move-object v3, v4

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :cond_15
    check-cast v4, Lc93/a;

    const/16 v0, 0x800

    if-ne v11, v0, :cond_16

    const/4 v0, 0x1

    goto :goto_d

    :cond_16
    const/4 v0, 0x0

    :goto_d
    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v0, v11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v0, :cond_17

    if-ne v11, v10, :cond_18

    :cond_17
    new-instance v11, Lmi2/o;

    const/16 v0, 0xc

    invoke-direct {v11, v0, v2, v5}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v15, v11

    check-cast v15, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int/2addr v0, v5

    sget v5, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v10, v5, 0x9

    or-int/2addr v0, v10

    shl-int/lit8 v5, v5, 0x15

    or-int v20, v0, v5

    const/16 v21, 0x30

    const/16 v22, 0x644

    move v0, v9

    const/4 v9, 0x0

    move-object v10, v13

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    move-object/from16 v11, v19

    move-object/from16 v19, v7

    move-object v7, v11

    move-object v11, v4

    const/4 v4, 0x1

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v19

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_11

    :cond_19
    const/4 v4, 0x1

    const/16 v17, 0x0

    sget-object v8, Ljx1/e$b;->a:Ljx1/e$b;

    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1a

    const v0, 0x4f849bd7

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    move-object/from16 v19, v7

    sget-object v7, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v0, Lsz0/p0$c;->f:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int v20, v0, v5

    const/16 v21, 0x30

    const/16 v22, 0x7fc

    move v0, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v5, v17

    const/16 v17, 0x0

    const/16 v18, 0x1

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v19

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_11

    :cond_1a
    move v8, v9

    sget-object v9, Ljx1/e$c;->a:Ljx1/e$c;

    invoke-virtual {v1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_20

    const v9, 0x4f88e458

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    sget v9, Lpv1/b;->o:I

    invoke-static {v9}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v20

    and-int/lit8 v9, v0, 0x70

    const/16 v12, 0x20

    if-ne v9, v12, :cond_1b

    move v14, v4

    goto :goto_e

    :cond_1b
    move/from16 v14, v17

    :goto_e
    and-int/lit16 v9, v0, 0x1c00

    const/16 v12, 0x800

    if-ne v9, v12, :cond_1c

    move v9, v4

    goto :goto_f

    :cond_1c
    move/from16 v9, v17

    :goto_f
    or-int/2addr v9, v14

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v9, v12

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v11, :cond_1d

    move v14, v4

    goto :goto_10

    :cond_1d
    move/from16 v14, v17

    :goto_10
    or-int v0, v9, v14

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_1e

    if-ne v9, v10, :cond_1f

    :cond_1e
    new-instance v9, Ldn0/k;

    invoke-direct {v9, v8, v2, v5, v3}, Ldn0/k;-><init>(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object/from16 v23, v9

    check-cast v23, Lc93/a;

    new-instance v19, Lsz0/p0$h;

    const-wide/16 v21, 0x0

    const/16 v24, 0x2

    const/16 v25, 0x0

    invoke-direct/range {v19 .. v25}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v0, v8

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v5, Lsz0/p0$h;->h:I

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v9, 0x3

    or-int v20, v5, v9

    const/16 v21, 0x30

    const/16 v22, 0x7fc

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v5, v17

    const/16 v17, 0x0

    const/16 v18, 0x1

    move-object/from16 v26, v19

    move-object/from16 v19, v7

    move-object/from16 v7, v26

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v19

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    move v9, v0

    goto :goto_12

    :cond_20
    move/from16 v5, v17

    const v0, -0x47c27e62

    invoke-static {v0, v7, v5}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_21
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_22

    new-instance v0, Law0/h;

    const/16 v7, 0x16

    move-object v4, v2

    move v5, v6

    move v2, v9

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Law0/h;-><init>(Ljava/lang/Object;ZLl83/e;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Ljx1/e;Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    check-cast p0, Ljx1/e$a;

    invoke-virtual {p0}, Ljx1/e$a;->c()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Llx1/a$a;

    invoke-virtual {p0}, Ljx1/e$a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Ljx1/e$a;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Ljx1/e$a;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object p0

    invoke-direct {p1, p2, v0, p0}, Llx1/a$a;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/payments/domain/models/Card;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/whoop/membership/management/navigation/b$e;->a:Lcom/whoop/membership/management/navigation/b$e;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Llx1/f;->a:Llx1/f;

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ljx1/e;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lnx1/b;->f(Ljx1/e;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
