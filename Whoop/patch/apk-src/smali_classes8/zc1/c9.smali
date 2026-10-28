.class public abstract Lzc1/c9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\t\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0006\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0007\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0008\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "g",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/util/TextResource;",
        "repsText1",
        "timeText1",
        "repsText2",
        "timeText2",
        "repsText3",
        "design-showcase_release"
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
.method public static synthetic a(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/c9;->m(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/c9;->j(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/c9;->r(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/c9;->u(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/c9;->w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/c9;->p(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0x32f4d50

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v8, 0x1

    if-eqz v0, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v1, v3, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, v5, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v1, v10, :cond_4

    invoke-static {}, Ll31/n;->d()Lr41/i$d;

    move-result-object v1

    invoke-virtual {v1}, Lr41/i$d;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lp1/c1;

    const-string v2, "Weightlifting Set - Edit (a.k.a. Default)"

    invoke-static {v2, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Ll31/n;->d()Lr41/i$d;

    move-result-object v11

    invoke-static {v1}, Lzc1/c9;->h(Lp1/c1;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v21, 0x1f7

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v11 .. v22}, Lr41/i$d;->y(Lr41/i$d;Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ILjava/lang/Object;)Lr41/i$d;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_5

    new-instance v3, Lzc1/e8;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v1}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v1, Lr41/i$d;->y:I

    or-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x6

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_6

    invoke-static {}, Ll31/n;->c()Lr41/i$c;

    move-result-object v1

    invoke-virtual {v1}, Lr41/i$c;->t()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lp1/c1;

    const-string v2, "Weightlifting Set - Current - Rest Period - Time Input"

    invoke-static {v2, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Ll31/n;->c()Lr41/i$c;

    move-result-object v11

    invoke-static {v1}, Lzc1/c9;->s(Lp1/c1;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v27, 0x7fef

    const/16 v28, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v11 .. v28}, Lr41/i$c;->y(Lr41/i$c;Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILny0/q;Ly81/f;Ly81/f;ZILjava/lang/Object;)Lr41/i$c;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_7

    new-instance v3, Lzc1/e8;

    const/16 v4, 0x9

    invoke-direct {v3, v4, v1}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v1, Lr41/i$c;->H:I

    or-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x6

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_8

    invoke-static {}, Ll31/n;->b()Lr41/i$c;

    move-result-object v1

    invoke-virtual {v1}, Lr41/i$c;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v1, Lp1/c1;

    const-string v2, "Weightlifting Set - Current - Active"

    invoke-static {v2, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Ll31/n;->b()Lr41/i$c;

    move-result-object v11

    invoke-static {v1}, Lzc1/c9;->v(Lp1/c1;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v27, 0x7ff7

    const/16 v28, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v11 .. v28}, Lr41/i$c;->y(Lr41/i$c;Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILny0/q;Ly81/f;Ly81/f;ZILjava/lang/Object;)Lr41/i$c;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_9

    new-instance v3, Lzc1/e8;

    const/16 v4, 0xa

    invoke-direct {v3, v4, v1}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x6

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_a

    invoke-static {}, Ll31/n;->e()Lr41/i$e;

    move-result-object v1

    invoke-virtual {v1}, Lr41/i$e;->t()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lp1/c1;

    const-string v2, "Weightlifting Set - In Progress - Time Input"

    invoke-static {v2, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Ll31/n;->e()Lr41/i$e;

    move-result-object v11

    invoke-static {v1}, Lzc1/c9;->k(Lp1/c1;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v27, 0x7fef

    const/16 v28, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v11 .. v28}, Lr41/i$e;->y(Lr41/i$e;Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILjava/lang/Object;ZILy81/f;Lny0/q;Ly81/f;ZILjava/lang/Object;)Lr41/i$e;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_b

    new-instance v3, Lzc1/e8;

    const/16 v4, 0xb

    invoke-direct {v3, v4, v1}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v1, Lr41/i$e;->D:I

    or-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x6

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_c

    invoke-static {}, Ll31/n;->a()Lr41/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lr41/i$a;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v1, Lp1/c1;

    const-string v2, "Weightlifting Set - Completed"

    invoke-static {v2, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Ll31/n;->a()Lr41/i$a;

    move-result-object v11

    invoke-static {v1}, Lzc1/c9;->n(Lp1/c1;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v20, 0xf7

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v11 .. v21}, Lr41/i$a;->y(Lr41/i$a;Ljava/util/UUID;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;IILjava/lang/Object;)Lr41/i$a;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_d

    new-instance v3, Lzc1/e8;

    const/16 v4, 0xc

    invoke-direct {v3, v4, v1}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v1, Lr41/i$a;->B:I

    or-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x6

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_e
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_f

    new-instance v2, Lzc1/w8;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lzc1/w8;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final h(Lp1/c1;)Lcom/whoop/design/util/TextResource;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/design/util/TextResource;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/util/TextResource;

    return-object p0
.end method

.method private static final i(Lp1/c1;Lcom/whoop/design/util/TextResource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/design/util/TextResource;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr41/b;

    if-eqz v0, :cond_0

    check-cast p1, Lr41/b;

    invoke-virtual {p1}, Lr41/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p0, p1}, Lzc1/c9;->i(Lp1/c1;Lcom/whoop/design/util/TextResource;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/c1;)Lcom/whoop/design/util/TextResource;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/design/util/TextResource;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/util/TextResource;

    return-object p0
.end method

.method private static final l(Lp1/c1;Lcom/whoop/design/util/TextResource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/design/util/TextResource;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final m(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr41/d;

    if-eqz v0, :cond_0

    check-cast p1, Lr41/d;

    invoke-virtual {p1}, Lr41/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p0, p1}, Lzc1/c9;->l(Lp1/c1;Lcom/whoop/design/util/TextResource;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lp1/c1;)Lcom/whoop/design/util/TextResource;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/design/util/TextResource;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/util/TextResource;

    return-object p0
.end method

.method private static final o(Lp1/c1;Lcom/whoop/design/util/TextResource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/design/util/TextResource;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final p(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr41/b;

    if-eqz v0, :cond_0

    check-cast p1, Lr41/b;

    invoke-virtual {p1}, Lr41/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p0, p1}, Lzc1/c9;->o(Lp1/c1;Lcom/whoop/design/util/TextResource;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lp1/c1;Lcom/whoop/design/util/TextResource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/design/util/TextResource;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final r(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr41/b;

    if-eqz v0, :cond_0

    check-cast p1, Lr41/b;

    invoke-virtual {p1}, Lr41/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p0, p1}, Lzc1/c9;->q(Lp1/c1;Lcom/whoop/design/util/TextResource;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;)Lcom/whoop/design/util/TextResource;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/design/util/TextResource;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/util/TextResource;

    return-object p0
.end method

.method private static final t(Lp1/c1;Lcom/whoop/design/util/TextResource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/design/util/TextResource;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final u(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr41/d;

    if-eqz v0, :cond_0

    check-cast p1, Lr41/d;

    invoke-virtual {p1}, Lr41/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p0, p1}, Lzc1/c9;->t(Lp1/c1;Lcom/whoop/design/util/TextResource;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/c1;)Lcom/whoop/design/util/TextResource;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/design/util/TextResource;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/util/TextResource;

    return-object p0
.end method

.method private static final w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/c9;->g(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
