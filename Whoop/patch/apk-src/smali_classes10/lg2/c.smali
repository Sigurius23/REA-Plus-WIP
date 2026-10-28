.class public abstract Llg2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llg2/b;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Llg2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "q",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "isToggleOn",
        "start-activity_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ltr2/n;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llg2/c;->k(Lkotlin/jvm/functions/Function1;Ltr2/n;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Llg2/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llg2/c;->p(Landroidx/compose/ui/Modifier;Llg2/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Lkotlin/jvm/functions/Function1;Llg2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Llg2/c;->l(Lp1/c1;Lkotlin/jvm/functions/Function1;Llg2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Llg2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llg2/c;->n(Lkotlin/jvm/functions/Function1;Llg2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llg2/c;->r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Llg2/b;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llg2/c;->m(Lkotlin/jvm/functions/Function1;Llg2/b;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llg2/b;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Llg2/c;->o(Llg2/b;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Llg2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llg2/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x5951d6c0

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v2

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit16 v8, v7, 0x93

    const/16 v11, 0x92

    if-eq v8, v11, :cond_7

    const/4 v8, 0x1

    goto :goto_4

    :cond_7
    const/4 v8, 0x0

    :goto_4
    and-int/lit8 v11, v7, 0x1

    invoke-virtual {v10, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_29

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_8

    move-object v4, v8

    :cond_8
    invoke-virtual {v5}, Llg2/b;->k()Z

    move-result v0

    invoke-virtual {v10, v0}, Lp1/q;->h(Z)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_9

    if-ne v11, v14, :cond_a

    :cond_9
    invoke-virtual {v5}, Llg2/b;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v11, Lp1/c1;

    invoke-virtual {v5}, Llg2/b;->g()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {v11}, Llg2/c;->i(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_5

    :cond_b
    const/4 v0, 0x0

    goto :goto_6

    :cond_c
    :goto_5
    const/4 v0, 0x1

    :goto_6
    int-to-float v2, v2

    mul-float v15, v2, v2

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v3

    sget-object v16, Li2/t;->b:Li2/s;

    const-wide v17, 0xff8b62ffL

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v12

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-static {v9, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    new-instance v9, Li2/x;

    invoke-direct {v9, v12, v13}, Li2/x;-><init>(J)V

    sget-wide v12, Li2/x;->m:J

    move/from16 p0, v0

    new-instance v0, Li2/x;

    invoke-direct {v0, v12, v13}, Li2/x;-><init>(J)V

    filled-new-array {v9, v0}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const-wide/16 v20, 0x0

    const/16 v22, 0xe

    const-wide/16 v18, 0x0

    invoke-static/range {v16 .. v22}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v14, :cond_d

    sget-object v9, Ltr2/n;->a:Ltr2/n$a;

    const-string v12, "TargetCard"

    invoke-virtual {v9, v12}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v9

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v9, Ltr2/n;

    and-int/lit16 v12, v7, 0x380

    const/16 v13, 0x100

    if-ne v12, v13, :cond_e

    const/4 v12, 0x1

    goto :goto_7

    :cond_e
    const/4 v12, 0x0

    :goto_7
    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_f

    if-ne v13, v14, :cond_10

    :cond_f
    new-instance v13, Ljp1/c;

    const/16 v12, 0x1c

    invoke-direct {v13, v12, v6, v9}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v9, v13

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5}, Llg2/b;->f()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v12

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v13, v13, v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move/from16 v33, v2

    const/4 v2, 0x0

    if-nez v13, :cond_11

    if-ne v1, v14, :cond_12

    :cond_11
    new-instance v1, Llg2/c$a;

    invoke-direct {v1, v9, v12, v2}, Llg2/c$a;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;Lq83/d;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v1, Lc93/m;

    sget-object v13, Lcom/whoop/navigation/models/GenericInteraction;->Companion:Lcom/whoop/navigation/models/GenericInteraction$Companion;

    invoke-static {v10, v1, v12}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v12, v15}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v13, 0x1

    if-eqz p0, :cond_13

    int-to-float v1, v13

    invoke-static {v1, v8, v0, v15}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_8

    :cond_13
    move-object v0, v8

    :goto_8
    invoke-interface {v12, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    if-eqz p0, :cond_14

    const v12, 0x3ac0c6aa

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    invoke-static {}, Lgb1/b0;->D()Li2/t;

    move-result-object v12

    const/4 v15, 0x0

    invoke-static {v8, v12, v2, v15, v1}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v12, v14

    const/4 v13, 0x0

    goto :goto_9

    :cond_14
    const v2, 0x3ac233e2

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v2, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    move-object v12, v14

    invoke-virtual {v2}, Ly81/i;->n()J

    move-result-wide v13

    sget-object v2, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v13, v14, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v13, 0x0

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_9
    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v2, v14

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v15

    move/from16 v16, v7

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v7, v10, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    move/from16 v17, v14

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    move/from16 v34, v2

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-eqz v2, :cond_15

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v10, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v10, v15, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    move-object/from16 v35, v4

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    :cond_16
    invoke-static {v13, v10, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v0, Lb2/e;->K:Lb2/l;

    invoke-static/range {v34 .. v34}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    move-object/from16 v18, v7

    const/16 v7, 0x36

    invoke-static {v13, v0, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    move-object v13, v8

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v19, v12

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_18

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_18
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v10, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_19

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    :cond_19
    invoke-static {v7, v10, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Llg2/b;->g()Z

    move-result v0

    if-eqz v0, :cond_1b

    const v0, 0x6fa100da

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v0, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->j()J

    move-result-wide v6

    new-instance v0, Ljp1/k;

    invoke-direct {v0, v11, v9, v5}, Ljp1/k;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Llg2/b;)V

    const v8, -0x41854ddc

    invoke-static {v8, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    move/from16 v8, v17

    const/16 v17, 0x6000

    move-object/from16 v11, v18

    const/16 v18, 0xd

    move-object/from16 v20, v9

    move-object v12, v10

    move-wide v9, v6

    move v6, v8

    const-wide/16 v7, 0x0

    move-object/from16 v21, v11

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move-object/from16 v25, v13

    move-object/from16 v22, v14

    const-wide/16 v13, 0x0

    move-object/from16 v42, v1

    move-object/from16 v41, v2

    move-object/from16 v38, v4

    move/from16 v37, v6

    move-object/from16 v39, v15

    move/from16 v36, v16

    move-object/from16 v2, v19

    move-object/from16 v6, v20

    move-object/from16 v43, v21

    move-object/from16 v40, v22

    move-object/from16 v16, v29

    const/4 v1, 0x0

    const/4 v4, 0x1

    move-object v15, v0

    move-object/from16 v0, v25

    invoke-static/range {v7 .. v18}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v16

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_1b
    move-object/from16 v42, v1

    move-object/from16 v41, v2

    move-object/from16 v38, v4

    move-object v6, v9

    move-object v12, v10

    move-object v0, v13

    move-object/from16 v40, v14

    move-object/from16 v39, v15

    move/from16 v36, v16

    move/from16 v37, v17

    move-object/from16 v43, v18

    move-object/from16 v2, v19

    const/4 v1, 0x0

    const/4 v4, 0x1

    const v7, 0x6fa88a5c

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v5}, Llg2/b;->h()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->K()Lb91/a;

    move-result-object v27

    invoke-virtual {v8, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    const/high16 v13, 0x3f800000    # 1.0f

    float-to-double v14, v13

    const-wide/16 v16, 0x0

    cmpl-double v14, v14, v16

    if-lez v14, :cond_1c

    goto :goto_d

    :cond_1c
    const-string v14, "invalid weight; must be greater than zero"

    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v14, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v14, v13, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    if-eqz p0, :cond_1d

    invoke-static {v0, v3}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    goto :goto_e

    :cond_1d
    move-object v3, v0

    :goto_e
    invoke-interface {v14, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v31, v13, 0x12

    const v32, 0x2fff8

    move v13, v9

    move-wide v9, v10

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v44, v30

    const/16 v30, 0x0

    move-object v4, v8

    move-object v8, v3

    move-object v3, v4

    move/from16 v4, v44

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v5}, Llg2/b;->b()Lgz0/m0;

    move-result-object v7

    if-nez v7, :cond_1e

    const v2, 0x6fae2a0a

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v13, 0x1

    goto :goto_10

    :cond_1e
    const v8, 0x6fae2a0b

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    invoke-static {v7, v12, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    sget v8, Lhg2/a;->a:I

    invoke-static {v12, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v10

    const/4 v3, 0x6

    int-to-float v4, v3

    mul-float v4, v4, v33

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1f

    if-ne v4, v2, :cond_20

    :cond_1f
    new-instance v4, Ll01/q;

    const/16 v2, 0xf

    invoke-direct {v4, v6, v5, v2}, Ll01/q;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object/from16 v17, v4

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v13, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    if-eqz p0, :cond_28

    const v2, -0x2675a9b9

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Llg2/b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-virtual {v5}, Llg2/b;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_21

    const v0, -0x26750e7b

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-static {v12, v1}, Llg2/c;->q(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    goto/16 :goto_19

    :cond_21
    const v2, -0x2673dd34

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Llg2/b;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_26

    const v2, -0x267366a7

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-static/range {v34 .. v34}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    move-object/from16 v11, v43

    const/4 v3, 0x6

    invoke-static {v2, v11, v12, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v12, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_22

    move-object/from16 v7, v42

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_11
    move-object/from16 v7, v41

    goto :goto_12

    :cond_22
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_11

    :goto_12
    invoke-static {v12, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v39

    invoke-static {v12, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_23

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    :cond_23
    move-object/from16 v2, v40

    goto :goto_14

    :cond_24
    :goto_13
    move-object/from16 v2, v38

    goto :goto_15

    :goto_14
    invoke-static {v3, v12, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_13

    :goto_15
    invoke-static {v12, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x3a543faa

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Llg2/b;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_25

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lm91/u;

    shl-int/lit8 v3, v36, 0x3

    and-int/lit16 v11, v3, 0x1c00

    move-object/from16 v29, v12

    const/4 v12, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p2

    move-object/from16 v10, v29

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v9

    move-object v12, v10

    goto :goto_16

    :cond_25
    move-object/from16 v3, p2

    const/4 v13, 0x1

    invoke-static {v12, v1, v13, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_17

    :cond_26
    move-object/from16 v3, p2

    const v2, -0x26702188

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v5}, Llg2/b;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_27

    const v2, -0x266f3167

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v13, 0x1

    int-to-float v0, v13

    mul-float v0, v0, v37

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    new-instance v0, Lih1/f;

    const/16 v2, 0x13

    invoke-direct {v0, v2, v5, v3}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x5b013d4

    invoke-static {v2, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v14, 0x1801b6

    const/16 v15, 0x38

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v13, v12

    move-object v12, v0

    invoke-static/range {v6 .. v15}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_27
    const v0, -0x26691b88

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_19
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_1a
    const/4 v13, 0x1

    goto :goto_1b

    :cond_28
    move-object/from16 v3, p2

    const v0, -0x2668be88

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_1a

    :goto_1b
    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    move-object/from16 v4, v35

    goto :goto_1c

    :cond_29
    move-object v3, v6

    move-object v12, v10

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2a

    new-instance v0, Ll72/h;

    const/16 v3, 0x16

    move-object/from16 v6, p2

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method

.method private static final i(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final j(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Ltr2/n;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;
    .locals 1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/whoop/navigation/models/GenericInteraction;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    :try_start_0
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "Failed to route target card interaction"

    invoke-interface {p1, v0, p0, p2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_1
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/c1;Lkotlin/jvm/functions/Function1;Llg2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    and-int/lit8 v3, p4, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v4, p4, 0x1

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v0}, Llg2/c;->i(Lp1/c1;)Z

    move-result v6

    sget-object v10, Lpz0/e;->Large:Lpz0/e;

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_2

    :cond_1
    new-instance v4, Ljs2/h;

    const/16 v3, 0xd

    invoke-direct {v4, v1, v2, v0, v3}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v12, v4

    check-cast v12, Lkotlin/jvm/functions/Function1;

    const/16 v14, 0x6000

    const/16 v15, 0x2d

    const/4 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v15}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Llg2/b;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p2, p3}, Llg2/c;->j(Lp1/c1;Z)V

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Llg2/b;->j()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Llg2/b;->i()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    :goto_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Llg2/b;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Llg2/b;->c()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Llg2/b;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string v0, "$this$FlowRow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p2, v0, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    and-int/2addr p4, v1

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Llg2/b;->e()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lm91/u;

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;Llg2/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llg2/c;->h(Landroidx/compose/ui/Modifier;Llg2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v8, p0

    check-cast v8, Lp1/q;

    const p0, 0x46f8afae

    invoke-virtual {v8, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    const/4 v11, 0x1

    if-eqz p1, :cond_0

    move v0, v11

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v8, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0x1e

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v0, v2, v4, v5}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, p0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p0

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->f:La3/i;

    invoke-static {v8, p0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->j:La3/i;

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v2, v8, v2, p0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p0, La3/k;->d:La3/i;

    invoke-static {v8, p0, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 p0, 0x8

    int-to-float p0, p0

    mul-float/2addr p0, v3

    invoke-static {p0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {p0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->c1()J

    move-result-wide v1

    int-to-float v3, v5

    const/16 v9, 0x186

    const/16 v10, 0x38

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v10}, Ll1/i3;->a(Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lk71/a0;

    const/16 v1, 0x15

    invoke-direct {v0, p1, v1}, Lk71/a0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Llg2/c;->q(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
