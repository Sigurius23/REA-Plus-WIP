.class public abstract Lrq2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lrq2/s;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "c",
        "(Lrq2/s;ZLandroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(Lrq2/s;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/u;->e(Lrq2/s;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrq2/s;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrq2/u;->d(Lrq2/s;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lrq2/s;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "step"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0xe8113fd

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Llz1/a;

    const/16 v2, 0x15

    invoke-direct {v1, p0, v2}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    const v2, -0x18805bf9

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lrq2/t;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lrq2/t;-><init>(Lrq2/s;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final d(Lrq2/s;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    move-object/from16 v3, p2

    const-string v0, "$this$BasicAnimationComponent"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    const/4 v11, 0x0

    invoke-static {v2, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    move-object v12, v3

    check-cast v12, Lp1/q;

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    iget-object v6, v12, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_0

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_0
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v3, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    invoke-static {v4, v12, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v3, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/s;->e()Lkd1/o;

    move-result-object v1

    if-nez v1, :cond_3

    const v0, 0x64523c3e

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    move-object/from16 v26, v6

    move-object/from16 v27, v7

    move-object v7, v3

    goto :goto_1

    :cond_3
    const v2, 0x64523c3f

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v4, Lkd1/o;->a:I

    const/4 v5, 0x3

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    move-object v2, v8

    const/16 v8, 0x61b0

    const/16 v9, 0x68

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->c:Ly2/b1;

    const/4 v5, 0x0

    move-object/from16 v16, v6

    const/4 v6, 0x0

    move-object/from16 v27, v7

    move-object/from16 v26, v16

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    :goto_1
    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v8, v1

    mul-float/2addr v0, v8

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v10, v0, v2, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {}, Ljr2/a;->e()Li2/t;

    move-result-object v1

    invoke-static {v0, v1}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->G:Lb2/m;

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v2, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v2, v7, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v12, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-eqz v4, :cond_4

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v7, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    move-object/from16 v1, v26

    goto :goto_4

    :cond_6
    :goto_3
    move-object/from16 v1, v27

    goto :goto_5

    :goto_4
    invoke-static {v2, v12, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_3

    :goto_5
    invoke-static {v7, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x3faf9040

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/s;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v26

    :goto_6
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/util/TextResource;

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float v5, v1, v8

    const/4 v6, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v10

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v27, v1

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v7, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljr2/c;->b()Lb91/a;

    move-result-object v20

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lrq2/s;->f()F

    move-result v1

    const-wide v5, 0x200000000L

    invoke-static {v1, v5, v6}, Lv63/c;->j(FJ)J

    move-result-wide v5

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v24, v1, 0x12

    const v25, 0x2fff0

    move-object v1, v2

    move-wide v2, v3

    move-wide v4, v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v13, v9

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    move/from16 v17, v14

    const-wide/16 v13, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x30

    move-object/from16 v30, v22

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, p2

    move-object/from16 v10, v27

    move/from16 v8, v29

    move-object/from16 v12, v30

    const/4 v11, 0x0

    goto/16 :goto_6

    :cond_7
    move-object/from16 v30, v12

    const/4 v0, 0x1

    move-object/from16 v15, v30

    const/4 v14, 0x0

    invoke-static {v15, v14, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lrq2/s;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/u;->c(Lrq2/s;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
