.class public abstract Lu71/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a\u00b2\u0006\u000e\u0010\u0019\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lu71/j;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "r",
        "(Lu71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isExpanded",
        "onClick",
        "C",
        "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lu71/f;",
        "tags",
        "m",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "p",
        "(Lu71/j;Landroidx/compose/runtime/Composer;I)V",
        "Lu71/k;",
        "note",
        "expanded",
        "z",
        "(Lu71/k;ZLandroidx/compose/runtime/Composer;I)V",
        "expandedState",
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


# direct methods
.method private static final A(Lu71/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v3, p3, 0x1

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-static {v0, v3, v4}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v2, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    const/16 v5, 0x36

    invoke-static {v2, v4, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v9, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v9, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lu71/k;->a()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v9, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    int-to-float v2, v3

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v7

    const/16 v10, 0x1b0

    const/4 v11, 0x0

    const-string v5, ""

    invoke-static/range {v4 .. v11}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v0, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    const/16 v28, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Lu71/k;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lu71/g;->z(Lu71/k;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, 0x23bd6362

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/4 v12, 0x0

    if-eq v4, v6, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    move v4, v12

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v8, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    if-eqz v0, :cond_5

    sget v4, Lgy0/f;->N0:I

    goto :goto_4

    :cond_5
    sget v4, Lgy0/f;->O0:I

    :goto_4
    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v13

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v4

    if-eqz v0, :cond_6

    invoke-virtual {v4}, Lgz0/i0;->B()I

    move-result v4

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Lgz0/i0;->l()I

    move-result v4

    :goto_5
    const-wide/16 v6, 0x0

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-static {v6, v7, v9, v12, v10}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v16

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_7

    invoke-static {v8}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v6

    :cond_7
    move-object v15, v6

    check-cast v15, Lj0/i;

    new-instance v6, Li3/i;

    invoke-direct {v6, v12}, Li3/i;-><init>(I)V

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v5, :cond_8

    const/4 v3, 0x1

    goto :goto_6

    :cond_8
    move v3, v12

    :goto_6
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_9

    if-ne v5, v7, :cond_a

    :cond_9
    new-instance v5, Lsg2/i;

    const/16 v3, 0x18

    invoke-direct {v5, v1, v3}, Lsg2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v19, v5

    check-cast v19, Lc93/a;

    const/16 v20, 0x8

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/16 v17, 0x1

    move-object/from16 v18, v6

    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v5, v8, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_b

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_7
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v6, v8, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v15, 0x6

    invoke-static {v4, v8, v15}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    invoke-static {v13, v8, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v8, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    const/4 v9, 0x0

    const/4 v10, 0x4

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v11, v16

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget-object v3, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual {v3}, Lny0/n0;->getIconPaddingLeft-D9Ej5fM()F

    move-result v4

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v8, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v13, v8, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v8, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v3}, Lny0/n0;->getStyle()Lb91/a;

    move-result-object v23

    const/16 v27, 0x0

    const v28, 0x2fffa

    move-object v3, v4

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

    const/16 v26, 0x0

    const/4 v0, 0x1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v3, Lih2/a;

    const/4 v4, 0x4

    move/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lih2/a;-><init>(ZLkotlin/jvm/functions/Function1;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private static final E(ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lu71/g;->C(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lu71/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu71/g;->A(Lu71/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lu71/j;Ljava/util/List;ZLp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lu71/g;->w(Lu71/j;Ljava/util/List;ZLp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lu71/g;->v(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lu71/k;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu71/g;->B(Lu71/k;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lu71/g;->x(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu71/g;->E(ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lu71/g;->s(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lu71/j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu71/g;->q(Lu71/j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lu71/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lu71/g;->y(Lu71/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lu71/g;->D(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu71/g;->o(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu71/g;->n(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu71/f;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v7, p1

    check-cast v7, Lp1/q;

    const p1, -0x2ce37f5e

    invoke-virtual {v7, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-nez p1, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v2, p1, 0x3

    const/4 v10, 0x0

    const/4 v3, 0x1

    if-eq v2, v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    move v0, v10

    :goto_2
    and-int/2addr p1, v3

    invoke-virtual {v7, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    const p1, 0x41ded1c4

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    const/4 v0, 0x0

    const/4 v2, 0x3

    invoke-static {p1, v0, v2}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float p1, v2

    int-to-float v1, v1

    mul-float/2addr p1, v1

    invoke-static {p1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    invoke-static {p1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    new-instance p1, Leh0/b;

    const/4 v3, 0x4

    invoke-direct {p1, p0, v3}, Leh0/b;-><init>(Ljava/util/List;I)V

    const v3, 0x28400f22

    invoke-static {v3, v7, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x1801b0

    const/16 v9, 0x38

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_3
    const p1, 0x41e98da0

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Lbm0/o;

    const/16 v1, 0x16

    invoke-direct {v0, p0, p2, v1}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final n(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    const-string v0, "$this$FlowRow"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu71/f;

    invoke-virtual {v1}, Lu71/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lu71/f;->a()Ly71/g;

    move-result-object v11

    invoke-virtual {v1}, Lu71/f;->b()Lhy0/o1;

    move-result-object v14

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v1, v3, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X()J

    move-result-wide v6

    const v8, 0x3e19999a    # 0.15f

    invoke-static {v8, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    invoke-virtual {v1, v3, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v8

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v1, v5

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    int-to-float v1, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v16, v1, v5

    const/16 v31, 0x0

    const v32, 0x7ff1b4

    move-object/from16 v28, v3

    move-object v3, v4

    move-wide v4, v6

    const/4 v6, 0x0

    move-wide v7, v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x30

    invoke-static/range {v3 .. v32}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v3, v28

    goto :goto_1

    :cond_1
    move-object/from16 v28, v3

    invoke-virtual/range {v28 .. v28}, Lp1/q;->X()V

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lu71/g;->m(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lu71/j;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x719be04b

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v5, v4, :cond_2

    move v4, v11

    goto :goto_2

    :cond_2
    move v4, v10

    :goto_2
    and-int/2addr v2, v11

    invoke-virtual {v7, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    const/high16 v12, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->K:Lb2/l;

    int-to-float v5, v11

    const/16 v6, 0x8

    int-to-float v6, v6

    const/16 v8, 0x36

    invoke-static {v5, v6, v4, v7, v8}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v5, v7, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v7, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v14, 0x6

    int-to-float v2, v14

    int-to-float v15, v3

    mul-float/2addr v2, v15

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lu71/j;->e()I

    move-result v2

    invoke-static {v2, v7, v14}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v7, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v5

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    move-object/from16 v16, v3

    const-string v3, ""

    move-object/from16 v11, v16

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lu71/j;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v7, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v7, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v11, v7, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    const/16 v26, 0x0

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v17, v12

    const-wide/16 v11, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move/from16 v20, v15

    move-object/from16 v21, v16

    const-wide/16 v15, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v28, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move-object/from16 v30, v21

    const/16 v21, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move-object/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v0, v31

    move-object/from16 v33, v32

    const/4 v1, 0x1

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    float-to-double v2, v0

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_6

    goto :goto_4

    :cond_6
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    invoke-static {v0, v1, v7}, Ldc/b;->y(FZLp1/q;)V

    const/4 v0, 0x5

    int-to-float v0, v0

    mul-float v0, v0, v29

    move-object/from16 v2, v33

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {v30 .. v30}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/w;->s()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v0, v7, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    move-object/from16 v11, v30

    invoke-virtual {v11, v7, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const-string v3, ""

    move-object v2, v0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Lsl0/j2;

    const/4 v2, 0x7

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final q(Lu71/j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lu71/g;->p(Lu71/j;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final r(Lu71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu71/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    const v0, 0x140ad42e

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v3

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v7

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v10, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_12

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_6

    new-instance v2, Lu71/c;

    const/4 v4, 0x1

    invoke-direct {v2, v4}, Lu71/c;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v13, v2

    goto :goto_5

    :cond_7
    move-object v13, v4

    :goto_5
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_8

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v4, v2

    check-cast v4, Lp1/c1;

    invoke-static {v4}, Lu71/g;->t(Lp1/c1;)Z

    move-result v2

    const/4 v6, 0x5

    if-eqz v2, :cond_9

    invoke-virtual {v1}, Lu71/j;->b()Ljava/util/List;

    move-result-object v2

    goto :goto_6

    :cond_9
    invoke-virtual {v1}, Lu71/j;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v6}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    :goto_6
    invoke-virtual {v1}, Lu71/j;->f()Lu71/k;

    move-result-object v9

    const/4 v11, 0x0

    if-eqz v9, :cond_a

    invoke-virtual {v9}, Lu71/k;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    goto :goto_7

    :cond_a
    move-object v9, v11

    :goto_7
    if-nez v9, :cond_b

    const v9, 0x582e6990

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    :goto_8
    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_b
    const v11, 0x582e6991

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    invoke-static {v9, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    goto :goto_8

    :goto_9
    if-nez v11, :cond_c

    const-string v11, ""

    :cond_c
    invoke-virtual {v1}, Lu71/j;->b()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-gt v9, v6, :cond_e

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v6

    const/16 v9, 0x8c

    if-le v6, v9, :cond_d

    goto :goto_a

    :cond_d
    move v6, v7

    goto :goto_b

    :cond_e
    :goto_a
    move v6, v8

    :goto_b
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_f

    move v7, v8

    :cond_f
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v7, :cond_10

    if-ne v0, v5, :cond_11

    :cond_10
    new-instance v0, Lsg2/i;

    const/16 v3, 0x17

    invoke-direct {v0, v13, v3}, Lsg2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v18, v0

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v0, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a1()J

    move-result-wide v8

    new-instance v0, Lay/a0;

    const/16 v5, 0x9

    move v3, v6

    invoke-direct/range {v0 .. v5}, Lay/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v1, 0xa97529e

    invoke-static {v1, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/high16 v11, 0xc00000

    const/16 v12, 0x7a

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v7

    const/4 v7, 0x0

    move-wide v3, v8

    const/4 v8, 0x0

    move-object v9, v0

    invoke-static/range {v1 .. v12}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v13

    goto :goto_c

    :cond_12
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v4

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lu71/a;

    const/4 v5, 0x2

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lu71/a;-><init>(Lu71/j;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final s(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lp1/c1;)Z
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

.method private static final u(Lp1/c1;Z)V
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

.method private static final v(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lu71/j;Ljava/util/List;ZLp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p5, v1

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p5, v0}, Lp1/q;->U(IZ)Z

    move-result p5

    if-eqz p5, :cond_7

    int-to-float p5, v3

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p5, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p5, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p5}, Ll0/m;->i(F)Ll0/k;

    move-result-object p5

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {p5, v3, p4, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p5

    iget-wide v3, p4, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p4}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p4}, Lp1/q;->i0()V

    iget-boolean v6, p4, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {p4, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p4}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p4, v5, p5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p5, La3/k;->f:La3/i;

    invoke-static {p4, p5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p5, La3/k;->j:La3/i;

    iget-boolean v4, p4, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, p4, v3, p5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p5, La3/k;->d:La3/i;

    invoke-static {p4, p5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, p4, v2}, Lu71/g;->p(Lu71/j;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p1, p4, v2}, Lu71/g;->m(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lu71/j;->f()Lu71/k;

    move-result-object p0

    if-nez p0, :cond_4

    const p0, -0x70232394

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    const p1, -0x70232393

    invoke-virtual {p4, p1}, Lp1/q;->e0(I)V

    invoke-static {p3}, Lu71/g;->t(Lp1/c1;)Z

    move-result p1

    invoke-static {p0, p1, p4, v2}, Lu71/g;->z(Lu71/k;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    :goto_2
    if-eqz p2, :cond_6

    const p0, -0x70216df1

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    invoke-static {p3}, Lu71/g;->t(Lp1/c1;)Z

    move-result p0

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_5

    new-instance p1, Lq12/c;

    const/16 p2, 0x10

    invoke-direct {p1, p2, p3}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {p4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p1, Lkotlin/jvm/functions/Function1;

    const/16 p2, 0x30

    invoke-static {p0, p1, p4, p2}, Lu71/g;->C(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    const p0, -0x701f6426

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {p4, v1}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lu71/g;->t(Lp1/c1;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1}, Lu71/g;->u(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lu71/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lu71/g;->r(Lu71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lu71/k;ZLandroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v9, p2

    check-cast v9, Lp1/q;

    const p2, -0x6bd72570

    invoke-virtual {v9, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-nez p2, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v9, p1}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr p2, v2

    :cond_3
    and-int/lit8 v2, p2, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_4

    move v2, v5

    goto :goto_3

    :cond_4
    move v2, v4

    :goto_3
    and-int/2addr p2, v5

    invoke-virtual {v9, p2, v2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lu71/k;->b()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    invoke-static {p2, v9, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p2

    if-nez p1, :cond_5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x8c

    if-le v2, v3, :cond_5

    invoke-static {v3, p2}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "\u2026"

    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_5
    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v0, v0

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    new-instance v0, Lpp2/o;

    const/16 v1, 0xe

    invoke-direct {v0, v1, p0, p2}, Lpp2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p2, -0x6c599f00    # -4.199994E-27f

    invoke-static {p2, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0xc00006

    const/16 v11, 0x76

    const/4 v1, 0x0

    move-object v0, v2

    const-wide/16 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v11}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lam0/b;

    const/16 v1, 0xe

    invoke-direct {v0, p0, p1, p3, v1}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method
