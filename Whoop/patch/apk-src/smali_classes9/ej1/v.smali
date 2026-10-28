.class public abstract Lej1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lej1/v$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcj1/m;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Lcj1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;",
        "style",
        "Li2/t;",
        "p",
        "(Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;)Li2/t;",
        "q",
        "health_release"
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
.method public static synthetic a(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lej1/v;->m(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcj1/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lej1/v;->j(Lcj1/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/u;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lej1/v;->k(Lm91/u;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Li2/t;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lej1/v;->n(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Lej1/v;->l(Lm91/u;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lcj1/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lej1/v;->o(Landroidx/compose/ui/Modifier;Lcj1/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lej1/v;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lcj1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcj1/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "itemState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x1b08c46b

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :goto_4
    and-int/lit16 v9, v6, 0x93

    const/16 v11, 0x92

    const/4 v14, 0x0

    if-eq v9, v11, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    move v9, v14

    :goto_5
    and-int/lit8 v11, v6, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_21

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object/from16 v4, v16

    :cond_9
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_a

    new-instance v7, Lej1/n;

    const/4 v8, 0x4

    invoke-direct {v7, v8}, Lej1/n;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_b
    move-object v7, v8

    :goto_6
    invoke-virtual {v5}, Lcj1/m;->f()Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;

    move-result-object v8

    invoke-static {v8}, Lej1/v;->p(Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;)Li2/t;

    move-result-object v8

    invoke-virtual {v5}, Lcj1/m;->f()Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;

    move-result-object v9

    invoke-static {v9}, Lej1/v;->q(Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;)Li2/t;

    move-result-object v9

    invoke-virtual {v5}, Lcj1/m;->e()Z

    move-result v11

    const/16 v12, 0x8

    if-eqz v11, :cond_c

    int-to-float v11, v14

    goto :goto_7

    :cond_c
    int-to-float v11, v2

    int-to-float v15, v12

    mul-float/2addr v11, v15

    :goto_7
    sget-object v15, Lb2/e;->w:Lb2/m;

    invoke-static {v15, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_d

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v10, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v22, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_9

    :cond_e
    move-object/from16 v22, v4

    :goto_9
    invoke-static {v2, v10, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit16 v4, v6, 0x380

    const/16 v6, 0x100

    if-ne v4, v6, :cond_10

    const/4 v6, 0x1

    goto :goto_a

    :cond_10
    const/4 v6, 0x0

    :goto_a
    or-int/2addr v2, v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_11

    if-ne v6, v0, :cond_12

    :cond_11
    new-instance v6, Ld30/l;

    const/16 v2, 0x10

    invoke-direct {v6, v2, v5, v7}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v20, v6

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v14, v16

    const/4 v6, 0x3

    int-to-float v6, v6

    move/from16 v16, v6

    const/4 v5, 0x4

    int-to-float v6, v5

    mul-float v6, v6, v16

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    move-object/from16 p2, v9

    const/4 v9, 0x0

    invoke-static {v2, v8, v6, v9, v5}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v5, 0x2

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v2, v5, v11, v5, v5}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    invoke-static {v8, v6, v10, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_13

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v10, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_15

    :cond_14
    invoke-static {v8, v10, v8, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v10, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x45c352c7

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lcj1/m;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v13, v2, 0x1

    if-ltz v2, :cond_1b

    move-object v6, v3

    check-cast v6, Lm91/u;

    invoke-virtual/range {p1 .. p1}, Lcj1/m;->g()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    if-ne v2, v3, :cond_16

    const/4 v2, 0x1

    goto :goto_d

    :cond_16
    const/4 v2, 0x0

    :goto_d
    new-instance v8, Lej1/u;

    const/4 v3, 0x0

    invoke-direct {v8, v3, v6}, Lej1/u;-><init>(ILm91/u;)V

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    const/16 v15, 0x100

    if-ne v4, v15, :cond_17

    const/4 v9, 0x1

    goto :goto_e

    :cond_17
    const/4 v9, 0x0

    :goto_e
    or-int/2addr v3, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_18

    if-ne v9, v0, :cond_19

    :cond_18
    new-instance v9, La80/j;

    const/4 v3, 0x4

    invoke-direct {v9, v6, v7, v3}, La80/j;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/4 v12, 0x2

    move-object v3, v7

    const/4 v7, 0x0

    move-object/from16 v15, p2

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    if-nez v2, :cond_1a

    instance-of v2, v6, Lc51/s;

    if-nez v2, :cond_1a

    const v2, -0x18d49a8a

    invoke-static {v10, v2, v14, v5, v10}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1a
    const/4 v2, 0x0

    const v6, -0x18d353f3

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_f
    move-object v7, v3

    move v2, v13

    move-object/from16 p2, v15

    goto :goto_c

    :cond_1b
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_1c
    move-object/from16 v15, p2

    move-object v3, v7

    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    if-eqz v15, :cond_20

    const v1, -0x54f56365

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v1, v14}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1d

    new-instance v2, Lej1/n;

    const/4 v4, 0x5

    invoke-direct {v2, v4}, Lej1/n;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1e

    if-ne v4, v0, :cond_1f

    :cond_1e
    new-instance v4, Lc51/h;

    const/4 v0, 0x3

    invoke-direct {v4, v15, v0}, Lc51/h;-><init>(Li2/t;I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v4}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v10, v2}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v1, 0x1

    goto :goto_11

    :cond_20
    const/4 v2, 0x0

    const v0, -0x54e33c0f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_11
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object v6, v3

    move-object/from16 v4, v22

    goto :goto_12

    :cond_21
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v6, v8

    :goto_12
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Le11/b;

    const/16 v3, 0x8

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final i(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcj1/m;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcj1/m;->c()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lm91/u;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, -0x22e8df5b

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    instance-of p0, p0, Lhy0/h0;

    sget-object p1, Lb2/t;->w:Lb2/t;

    if-eqz p0, :cond_0

    const/16 p0, 0xc8

    int-to-float p0, p0

    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {p2, p0}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method private static final l(Lm91/u;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lr21/c;

    if-nez v0, :cond_1

    instance-of v0, p0, Lc41/p2;

    if-eqz v0, :cond_0

    instance-of v0, p2, Lc41/m2;

    if-eqz v0, :cond_0

    check-cast p0, Lc41/p2;

    invoke-virtual {p0}, Lc41/p2;->f()Ljava/lang/String;

    move-result-object p0

    const-string v0, "CALIBRATING_INFO_CALLOUT"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p0, Lcj1/j$a;->a:Lcj1/j$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->f(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Li2/t;Lk2/c;)Ll83/a0;
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "$this$drawWithContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v0

    check-cast v11, La3/p0;

    invoke-virtual {v11}, La3/p0;->a()V

    const/4 v1, 0x3

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v2, v1

    invoke-virtual {v11, v2}, La3/p0;->q0(F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    const/16 v12, 0x20

    shl-long v2, v3, v12

    const-wide v7, 0xffffffffL

    and-long v4, v5, v7

    or-long v6, v2, v4

    new-instance v9, Lk2/i;

    invoke-virtual {v11, v1}, La3/p0;->q0(F)F

    move-result v14

    const/16 v18, 0x0

    const/16 v19, 0x1e

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v9

    invoke-direct/range {v13 .. v19}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v10, 0xd6

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v8, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v0 .. v10}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    sget-object v0, Li2/t;->b:Li2/s;

    const v1, 0x3f333333    # 0.7f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-wide v2, Li2/x;->m:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f4ccccd    # 0.8f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-wide v3, Li2/x;->b:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v6, v3}, [Ll83/k;

    move-result-object v1

    iget-object v2, v11, La3/p0;->w:Lk2/b;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    shr-long/2addr v3, v12

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x2

    invoke-static {v3, v5, v6, v7, v8}, Lh2/b;->a(FFJI)J

    move-result-wide v6

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v2

    shr-long/2addr v2, v12

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr v2, v4

    const/16 v3, 0x19

    int-to-float v3, v3

    invoke-virtual {v11, v3}, La3/p0;->q0(F)F

    move-result v3

    add-float/2addr v3, v2

    const-wide v9, 0x7f8000007f800000L    # 1.404448428688076E306

    invoke-static {v3, v5, v9, v10, v8}, Lh2/b;->a(FFJI)J

    move-result-wide v4

    move-wide v2, v6

    const/16 v6, 0x8

    invoke-static/range {v0 .. v6}, Li2/s;->e(Li2/s;[Ll83/k;JJI)Li2/k0;

    move-result-object v1

    const/4 v8, 0x6

    const/16 v9, 0x3e

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Lcj1/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lej1/v;->h(Landroidx/compose/ui/Modifier;Lcj1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;)Li2/t;
    .locals 8

    sget-object v0, Lej1/v$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/16 v1, 0xe

    const v2, 0x3dcccccd    # 0.1f

    const/4 v3, 0x0

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Li2/t;->b:Li2/s;

    const-wide v4, 0xffffffffL

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v6

    invoke-static {v3, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    new-instance v0, Li2/x;

    invoke-direct {v0, v6, v7}, Li2/x;-><init>(J)V

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v2, Li2/x;

    invoke-direct {v2, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array {v0, v2}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0, v3, v3, v1}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Li2/t;->b:Li2/s;

    const-wide v4, 0xffff9e86L

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v0, Li2/x;

    invoke-direct {v0, v4, v5}, Li2/x;-><init>(J)V

    const-wide v4, 0xffb126ffL

    invoke-static {v4, v5}, Li2/w0;->e(J)J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v2, Li2/x;

    invoke-direct {v2, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array {v0, v2}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0, v3, v3, v1}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;)Li2/t;
    .locals 1

    sget-object v0, Lej1/v$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-static {}, Lgb1/b0;->F0()Li2/t;

    move-result-object p0

    return-object p0
.end method
