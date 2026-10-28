.class public abstract Lsc3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v10, p1

    check-cast v10, Lp1/q;

    const p1, 0x5f8ca588

    invoke-virtual {v10, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v1, p1, 0x3

    if-ne v1, v0, :cond_2

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, p0

    goto :goto_3

    :cond_2
    :goto_1
    invoke-static {v10}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v0, v0, Ld40/n;->a:J

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    const v0, 0x7f0807a3

    goto :goto_2

    :cond_3
    const v0, 0x7f0807a2

    :goto_2
    const v1, 0x7f140fac

    invoke-static {v10, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lp40/a;

    const v3, 0x7f141094

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v4}, Lp40/a;-><init>(IILi2/p;)V

    new-instance v0, Ll83/k;

    const-string v3, "affirm"

    invoke-direct {v0, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v10}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v3, v0, Ld40/n;->e:J

    invoke-static {v10}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v0

    iget-object v5, v0, Lg1/h9;->f:Ll3/v0;

    shl-int/lit8 p1, p1, 0x3

    and-int/lit8 v11, p1, 0x70

    const/16 v12, 0x1e0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, v1

    move-object v1, p0

    invoke-static/range {v0 .. v12}, Lup/d;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance p1, Lb30/v3;

    const/4 v0, 0x6

    invoke-direct {p1, v1, p2, v0}, Lb30/v3;-><init>(Landroidx/compose/ui/Modifier;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final b(Lv20/a;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "label"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onClick"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v2, -0x407b0f6f

    invoke-virtual {v11, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x20

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    or-int v2, p4, v2

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x100

    goto :goto_1

    :cond_1
    const/16 v3, 0x80

    :goto_1
    or-int/2addr v2, v3

    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_3

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v11}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v14, 0x0

    if-eqz v3, :cond_5

    const/4 v4, 0x1

    if-ne v3, v4, :cond_4

    const v3, -0x7fdd9cf8

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    sget-object v3, Ld40/p;->e:Ld40/k;

    invoke-static {v3, v11}, Ld40/r;->g(Ld40/k;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object v15

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v11, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->f()J

    move-result-wide v16

    const/16 v28, 0x0

    const v29, 0xfffffe

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v15 .. v29}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v15

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget-object v4, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v11, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/l5;

    iget-object v4, v4, Lg1/l5;->a:Lt0/a;

    sget-object v5, Lg1/v0;->a:Ll0/l1;

    sget-wide v5, Li2/x;->m:J

    invoke-virtual {v11, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->f()J

    move-result-wide v7

    const/4 v12, 0x6

    const/16 v13, 0xc

    move-object v9, v4

    move-wide v3, v5

    move-wide v5, v7

    const-wide/16 v7, 0x0

    move-object/from16 v17, v9

    const-wide/16 v9, 0x0

    invoke-static/range {v3 .. v13}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v6

    new-instance v3, Ld30/b0;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v0, v15}, Ld30/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, -0x1415d98d

    invoke-static {v4, v11, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    shr-int/lit8 v2, v2, 0x6

    and-int/lit8 v2, v2, 0xe

    const v3, 0x30000030

    or-int v10, v2, v3

    move-object v9, v11

    const/16 v11, 0x15c

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, v16

    move-object/from16 v4, v17

    invoke-static/range {v1 .. v11}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v9

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    const v0, 0x4220a18

    invoke-static {v0, v11, v14}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_5
    const v1, 0x4220da3

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    shr-int/lit8 v1, v2, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    and-int/lit16 v2, v2, 0x380

    or-int v9, v1, v2

    const/16 v10, 0xf8

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p2

    move-object v8, v11

    invoke-static/range {v0 .. v10}, Lio/sentry/config/a;->i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_6

    new-instance v0, Ljp1/k;

    const/16 v5, 0x1b

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final c(Ln83/c;Lsc3/k;)V
    .locals 1

    instance-of v0, p1, Lsc3/c;

    if-eqz v0, :cond_0

    check-cast p1, Lsc3/c;

    iget-object p1, p1, Lsc3/c;->a:Lsc3/j;

    invoke-virtual {p0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    instance-of v0, p1, Lsc3/f;

    if-eqz v0, :cond_1

    check-cast p1, Lsc3/f;

    iget-object p1, p1, Lsc3/f;->a:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsc3/n;

    invoke-static {p0, v0}, Lsc3/l;->c(Ln83/c;Lsc3/k;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lsc3/h;

    if-nez v0, :cond_6

    instance-of v0, p1, Lsc3/s;

    if-eqz v0, :cond_2

    check-cast p1, Lsc3/s;

    iget-object p1, p1, Lsc3/s;->a:Lsc3/c;

    invoke-static {p0, p1}, Lsc3/l;->c(Ln83/c;Lsc3/k;)V

    return-void

    :cond_2
    instance-of v0, p1, Lsc3/b;

    if-eqz v0, :cond_4

    check-cast p1, Lsc3/b;

    iget-object v0, p1, Lsc3/b;->a:Lsc3/f;

    invoke-static {p0, v0}, Lsc3/l;->c(Ln83/c;Lsc3/k;)V

    iget-object p1, p1, Lsc3/b;->b:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsc3/k;

    invoke-static {p0, v0}, Lsc3/l;->c(Ln83/c;Lsc3/k;)V

    goto :goto_1

    :cond_3
    return-void

    :cond_4
    instance-of v0, p1, Lsc3/p;

    if-eqz v0, :cond_5

    check-cast p1, Lsc3/p;

    iget-object p1, p1, Lsc3/p;->b:Lsc3/f;

    invoke-static {p0, p1}, Lsc3/l;->c(Ln83/c;Lsc3/k;)V

    return-void

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    return-void
.end method

.method public static final d(Lj93/a0;)Lwb3/a;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->getUseK1Implementation()Z

    move-result v1

    const-string v2, "Not a readonly collection: "

    const-string v3, "Non-class type cannot be a mutable collection type: "

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Lwb3/h;

    iget-object v1, v1, Lwb3/h;->x:Llb3/y;

    instance-of v5, v1, Llb3/c0;

    if-eqz v5, :cond_3

    invoke-virtual {v1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    invoke-interface {v5}, Llb3/q0;->d()Lr93/h;

    move-result-object v5

    instance-of v6, v5, Lr93/e;

    if-eqz v6, :cond_0

    check-cast v5, Lr93/e;

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    if-eqz v5, :cond_2

    new-instance v0, Lwb3/h;

    check-cast v1, Llb3/c0;

    sget-object v3, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v5}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object v3

    invoke-static {v3}, Lq93/d;->h(Lva3/f;)Lva3/e;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v5}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v2

    invoke-virtual {v2, v3}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object v2

    invoke-interface {v2}, Lr93/h;->e()Llb3/q0;

    move-result-object v2

    const-string v3, "getTypeConstructor(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Llb3/o;->j(Llb3/c0;Llb3/q0;)Llb3/c0;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Lwb3/h;-><init>(Llb3/y;Lc93/a;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Non-simple type cannot be a mutable collection type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    move-object v1, v0

    check-cast v1, Lwb3/q;

    iget-object v5, v1, Lwb3/q;->x:Lj93/e;

    instance-of v6, v5, Lj93/d;

    if-eqz v6, :cond_5

    move-object v4, v5

    check-cast v4, Lj93/d;

    :cond_5
    if-eqz v4, :cond_7

    invoke-interface {v4}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    sget-object v3, Lq93/d;->a:Ljava/lang/String;

    new-instance v3, Lva3/f;

    invoke-direct {v3, v4}, Lva3/f;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lq93/d;->h(Lva3/f;)Lva3/e;

    move-result-object v3

    if-eqz v3, :cond_6

    new-instance v6, Lwb3/q;

    iget-object v7, v1, Lwb3/q;->x:Lj93/e;

    iget-object v8, v1, Lwb3/q;->y:Ljava/util/List;

    iget-boolean v9, v1, Lwb3/q;->z:Z

    iget-object v10, v1, Lwb3/q;->E:Ljava/util/List;

    iget-object v11, v1, Lwb3/q;->F:Lj93/a0;

    iget-boolean v12, v1, Lwb3/q;->G:Z

    iget-boolean v13, v1, Lwb3/q;->H:Z

    iget-boolean v14, v1, Lwb3/q;->I:Z

    check-cast v5, Lj93/d;

    invoke-static {v5, v3}, Lsb3/a;->i(Lj93/d;Lva3/e;)Lwb3/l;

    move-result-object v15

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v16}, Lwb3/q;-><init>(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/a0;ZZZLj93/d;Lc93/a;)V

    return-object v6

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    new-instance v1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final e(Lj93/a0;)Lwb3/a;
    .locals 13

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->getUseK1Implementation()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lwb3/h;

    iget-object v0, v0, Lwb3/h;->x:Llb3/y;

    instance-of v1, v0, Llb3/c0;

    if-eqz v1, :cond_0

    new-instance p0, Lwb3/h;

    move-object v1, v0

    check-cast v1, Llb3/c0;

    invoke-static {v0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object v0

    const-string v2, "Nothing"

    invoke-virtual {v0, v2}, Lo93/h;->k(Ljava/lang/String;)Lr93/e;

    move-result-object v0

    invoke-interface {v0}, Lr93/h;->e()Llb3/q0;

    move-result-object v0

    const-string v2, "getTypeConstructor(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Llb3/o;->j(Llb3/c0;Llb3/q0;)Llb3/c0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lwb3/h;-><init>(Llb3/y;Lc93/a;)V

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Non-simple type cannot be a Nothing type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v0, p0

    check-cast v0, Lwb3/q;

    iget-object v1, v0, Lwb3/q;->x:Lj93/e;

    const-class v2, Ljava/lang/Void;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v2, Lwb3/q;

    iget-object v3, v0, Lwb3/q;->x:Lj93/e;

    iget-object v4, v0, Lwb3/q;->y:Ljava/util/List;

    iget-boolean v5, v0, Lwb3/q;->z:Z

    iget-object v6, v0, Lwb3/q;->E:Ljava/util/List;

    iget-object v7, v0, Lwb3/q;->F:Lj93/a0;

    iget-boolean v8, v0, Lwb3/q;->G:Z

    iget-boolean v10, v0, Lwb3/q;->I:Z

    iget-object v11, v0, Lwb3/q;->J:Lj93/d;

    const/4 v12, 0x0

    const/4 v9, 0x1

    invoke-direct/range {v2 .. v12}, Lwb3/q;-><init>(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/a0;ZZZLj93/d;Lc93/a;)V

    return-object v2

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Nothing type\'s classifier must be Void::class: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final f(Lj93/a0;Lj93/a0;)Lwb3/a;
    .locals 3

    const-string v0, "lowerBound"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->getUseK1Implementation()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lwb3/h;

    check-cast p0, Lwb3/h;

    iget-object p0, p0, Lwb3/h;->x:Llb3/y;

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Llb3/c0;

    check-cast p1, Lwb3/h;

    iget-object p1, p1, Lwb3/h;->x:Llb3/y;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llb3/c0;

    invoke-static {p0, p1}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p0

    invoke-direct {v0, p0, v1}, Lwb3/h;-><init>(Llb3/y;Lc93/a;)V

    return-object v0

    :cond_0
    check-cast p0, Lwb3/a;

    check-cast p1, Lwb3/a;

    invoke-virtual {p0, p1}, Lwb3/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, Lwb3/i;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Lwb3/i;-><init>(Lwb3/a;Lwb3/a;ZLc93/a;)V

    return-object v0
.end method

.method public static g(Ljava/time/OffsetDateTime;)Ljava/lang/String;
    .locals 7

    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->getOffset()Ljava/time/ZoneOffset;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/time/ZoneOffset;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/time/OffsetDateTime;->atZoneSameInstant(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p0

    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    move-result-object p0

    :cond_0
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    move-result v0

    div-int/lit16 v1, v0, 0xe10

    rem-int/lit16 v0, v0, 0xe10

    div-int/lit8 v0, v0, 0x3c

    new-instance v2, Lvl/d;

    invoke-direct {v2, v1, v0}, Lvl/d;-><init>(II)V

    const/16 v0, 0x1d

    new-array v0, v0, [C

    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->getYear()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {v1, v3, v4, v0}, Lxl/b;->c(III[C)V

    const/16 v1, 0x2d

    aput-char v1, v0, v4

    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->getMonthValue()I

    move-result v3

    const/4 v4, 0x5

    const/4 v5, 0x2

    invoke-static {v3, v4, v5, v0}, Lxl/b;->c(III[C)V

    const/4 v3, 0x7

    aput-char v1, v0, v3

    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->getDayOfMonth()I

    move-result v1

    const/16 v3, 0x8

    invoke-static {v1, v3, v5, v0}, Lxl/b;->c(III[C)V

    const/16 v1, 0x54

    const/16 v3, 0xa

    aput-char v1, v0, v3

    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->getHour()I

    move-result v1

    const/16 v3, 0xb

    invoke-static {v1, v3, v5, v0}, Lxl/b;->c(III[C)V

    const/16 v1, 0xd

    const/16 v3, 0x3a

    aput-char v3, v0, v1

    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->getMinute()I

    move-result v1

    const/16 v4, 0xe

    invoke-static {v1, v4, v5, v0}, Lxl/b;->c(III[C)V

    const/16 v1, 0x10

    aput-char v3, v0, v1

    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->getSecond()I

    move-result v1

    const/16 v3, 0x11

    invoke-static {v1, v3, v5, v0}, Lxl/b;->c(III[C)V

    const/16 v1, 0x2e

    const/16 v3, 0x13

    aput-char v1, v0, v3

    invoke-virtual {p0}, Ljava/time/OffsetDateTime;->getNano()I

    move-result p0

    sget-object v1, Lwl/a;->a:[I

    aget v1, v1, v5

    int-to-double v3, v1

    int-to-double v5, p0

    div-double/2addr v5, v3

    double-to-int p0, v5

    const/16 v1, 0x14

    const/4 v3, 0x3

    invoke-static {p0, v1, v3, v0}, Lxl/b;->c(III[C)V

    const/16 p0, 0x17

    invoke-static {v0, p0, v2}, Lwl/a;->b([CILvl/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/net/Uri;)Z
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "content"

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "media"

    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static i(Ljava/lang/String;)Ljava/time/OffsetDateTime;
    .locals 29

    move-object/from16 v0, p0

    sget-object v1, Lvl/c;->e:Lvl/c;

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-ltz v2, :cond_1b

    const/4 v4, 0x4

    invoke-static {v3, v4, v0}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v7

    const/16 v16, 0x14

    const/16 v5, 0xd

    sget-object v17, Lvl/d;->c:Lvl/d;

    const/16 v18, 0x0

    const/16 v6, 0x8

    const/16 v8, 0x11

    const/16 v9, 0x13

    const/16 v19, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x1

    const/4 v12, 0x7

    const/16 v13, 0x10

    const/16 v14, 0xa

    if-ne v4, v2, :cond_0

    move v15, v5

    new-instance v5, Lvl/a;

    move v1, v14

    const/4 v14, 0x0

    move v2, v15

    const/4 v15, 0x0

    move v3, v6

    const/4 v6, 0x1

    move/from16 v20, v8

    const/4 v8, 0x0

    move/from16 v21, v9

    const/4 v9, 0x0

    move/from16 v22, v10

    const/4 v10, 0x0

    move/from16 v23, v11

    const/4 v11, 0x0

    move/from16 v24, v12

    const/4 v12, 0x0

    move/from16 v25, v13

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Lvl/a;-><init>(IIIIIIIILvl/d;I)V

    :goto_0
    move/from16 v27, v21

    move/from16 v21, v2

    move/from16 v2, v20

    move/from16 v20, v3

    move/from16 v3, v27

    :goto_1
    move/from16 v27, v4

    move-object/from16 v4, v17

    :goto_2
    move/from16 v17, v19

    goto/16 :goto_c

    :cond_0
    move v15, v5

    move v5, v6

    move/from16 v20, v8

    move/from16 v21, v9

    move/from16 v22, v10

    move/from16 v23, v11

    move v6, v12

    move/from16 v25, v13

    move v8, v14

    const/16 v9, 0x2d

    const/4 v10, 0x2

    invoke-static {v9, v10, v4, v0}, Lrg/a;->h(CIILjava/lang/String;)V

    const/4 v11, 0x5

    move v12, v8

    invoke-static {v11, v6, v0}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v8

    if-ne v6, v2, :cond_1

    move v13, v5

    new-instance v5, Lvl/a;

    const/4 v14, 0x0

    move v2, v15

    const/4 v15, 0x0

    const/4 v9, 0x0

    move/from16 v24, v6

    move v6, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v1, v12

    const/4 v12, 0x0

    move v3, v13

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Lvl/a;-><init>(IIIIIIIILvl/d;I)V

    goto :goto_0

    :cond_1
    move v10, v12

    const/4 v12, 0x3

    invoke-static {v9, v12, v6, v0}, Lrg/a;->h(CIILjava/lang/String;)V

    move v13, v9

    invoke-static {v5, v10, v0}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v9

    if-ne v10, v2, :cond_2

    move v14, v5

    new-instance v5, Lvl/a;

    move v3, v14

    const/4 v14, 0x0

    move v2, v15

    const/4 v15, 0x0

    move v1, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v24, v6

    move v6, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v28, v3

    move v3, v1

    move/from16 v1, v20

    move/from16 v20, v28

    invoke-direct/range {v5 .. v15}, Lvl/a;-><init>(IIIIIIIILvl/d;I)V

    move/from16 v27, v4

    move-object/from16 v4, v17

    move/from16 v17, v19

    move/from16 v3, v21

    move/from16 v21, v2

    move v2, v1

    goto/16 :goto_c

    :cond_2
    move/from16 v24, v6

    move v14, v10

    move/from16 v6, v20

    move/from16 v10, v22

    move/from16 v12, v25

    move/from16 v20, v5

    move v5, v15

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v15

    iget-object v6, v1, Lvl/c;->a:[C

    iget-object v14, v1, Lvl/c;->b:[C

    array-length v3, v6

    const/4 v4, 0x0

    :goto_3
    const/16 v11, 0xb

    if-ge v4, v3, :cond_19

    aget-char v13, v6, v4

    if-ne v13, v15, :cond_18

    invoke-static {v11, v5, v0}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v3

    const/16 v4, 0x3a

    invoke-static {v4, v10, v5, v0}, Lrg/a;->h(CIILjava/lang/String;)V

    const/16 v6, 0xe

    invoke-static {v6, v12, v0}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v11

    if-ne v2, v12, :cond_3

    move v2, v5

    new-instance v5, Lvl/a;

    const/4 v14, 0x0

    const/4 v15, 0x0

    move v1, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v25, v1

    move v6, v10

    const/16 v1, 0xa

    move v10, v3

    move/from16 v3, v21

    move/from16 v21, v2

    const/16 v2, 0x11

    invoke-direct/range {v5 .. v15}, Lvl/a;-><init>(IIIIIIIILvl/d;I)V

    move/from16 v22, v6

    :goto_4
    move-object/from16 v4, v17

    move/from16 v17, v19

    const/16 v27, 0x4

    goto/16 :goto_c

    :cond_3
    move/from16 v22, v10

    const/16 v2, 0x11

    const/16 v25, 0xa

    move v10, v3

    move/from16 v3, v21

    move/from16 v21, v5

    move v5, v12

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v12, 0x2b

    if-eq v6, v12, :cond_4

    const/16 v13, 0x2d

    if-eq v6, v13, :cond_4

    const/16 v13, 0x7a

    const/16 v15, 0x5a

    if-eq v6, v4, :cond_6

    if-eq v6, v15, :cond_4

    if-ne v6, v13, :cond_5

    :cond_4
    move-object/from16 v4, v17

    move/from16 v17, v19

    const/16 v27, 0x4

    goto/16 :goto_b

    :cond_5
    const/4 v12, 0x5

    new-array v1, v12, [C

    fill-array-data v1, :array_0

    invoke-static {v0, v5, v1}, Lrg/a;->s(Ljava/lang/String;I[C)V

    throw v18

    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v3, :cond_12

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    array-length v6, v14

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v6, :cond_d

    aget-char v12, v14, v5

    if-ne v12, v4, :cond_c

    move/from16 v4, v16

    const/4 v15, 0x0

    const/16 v26, 0x0

    :goto_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_8

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x30

    if-lt v5, v6, :cond_8

    const/16 v6, 0x39

    if-le v5, v6, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v15, v15, 0x1

    mul-int/lit8 v26, v26, 0xa

    add-int/lit8 v5, v5, -0x30

    add-int v26, v5, v26

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_8
    :goto_7
    add-int/lit8 v5, v4, -0x1

    if-eqz v15, :cond_b

    const/16 v6, 0x9

    if-gt v15, v6, :cond_a

    move v5, v15

    move/from16 v13, v26

    :goto_8
    if-ge v5, v6, :cond_9

    mul-int/lit8 v13, v13, 0xa

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_9
    invoke-static {v1, v0, v4}, Lwl/a;->c(Lvl/c;Ljava/lang/String;I)Lvl/d;

    move-result-object v14

    invoke-static {v2, v3, v0}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v12

    new-instance v5, Lvl/a;

    const/4 v6, 0x7

    move/from16 v1, v25

    const/16 v25, 0x10

    invoke-direct/range {v5 .. v15}, Lvl/a;-><init>(IIIIIIIILvl/d;I)V

    goto/16 :goto_4

    :cond_a
    new-instance v1, Ljava/time/format/DateTimeParseException;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Maximum supported number of fraction digits in second is 9, got %d: %s"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_b
    new-instance v1, Ljava/time/format/DateTimeParseException;

    const-string v2, "Must have at least 1 fraction digit: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, v5}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_c
    move/from16 v12, v25

    const/16 v25, 0x10

    add-int/lit8 v5, v5, 0x1

    move/from16 v25, v12

    const/16 v12, 0x2b

    goto :goto_5

    :cond_d
    move/from16 v12, v25

    const/16 v25, 0x10

    if-eq v4, v15, :cond_e

    if-ne v4, v13, :cond_f

    :cond_e
    move/from16 v1, v25

    const/4 v4, 0x4

    goto :goto_a

    :cond_f
    const/16 v5, 0x2b

    if-eq v4, v5, :cond_10

    const/16 v13, 0x2d

    if-ne v4, v13, :cond_11

    :cond_10
    const/4 v4, 0x4

    goto :goto_9

    :cond_11
    const/4 v4, 0x4

    new-array v1, v4, [C

    fill-array-data v1, :array_1

    array-length v2, v14

    add-int/2addr v2, v4

    new-array v2, v2, [C

    array-length v5, v14

    const/4 v6, 0x0

    invoke-static {v14, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v5, v14

    invoke-static {v1, v6, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0, v3, v2}, Lrg/a;->s(Ljava/lang/String;I[C)V

    throw v18

    :goto_9
    invoke-static {v1, v0, v3}, Lwl/a;->c(Lvl/c;Ljava/lang/String;I)Lvl/d;

    move-result-object v14

    move v1, v12

    invoke-static {v2, v3, v0}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v12

    new-instance v5, Lvl/a;

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/4 v6, 0x6

    move/from16 v1, v25

    invoke-direct/range {v5 .. v15}, Lvl/a;-><init>(IIIIIIIILvl/d;I)V

    goto/16 :goto_1

    :goto_a
    invoke-static {v2, v3, v0}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v12

    new-instance v5, Lvl/a;

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/4 v6, 0x6

    move-object/from16 v14, v17

    invoke-direct/range {v5 .. v15}, Lvl/a;-><init>(IIIIIIIILvl/d;I)V

    move/from16 v25, v1

    move/from16 v27, v4

    move-object v4, v14

    goto/16 :goto_2

    :cond_12
    move v1, v5

    move-object/from16 v14, v17

    const/16 v27, 0x4

    if-ne v4, v3, :cond_13

    invoke-static {v2, v3, v0}, Lxl/b;->b(IILjava/lang/String;)I

    move-result v12

    new-instance v5, Lvl/a;

    move-object v4, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v13, 0x0

    move/from16 v6, v19

    invoke-direct/range {v5 .. v15}, Lvl/a;-><init>(IIIIIIIILvl/d;I)V

    move/from16 v17, v6

    move/from16 v25, v1

    goto :goto_c

    :cond_13
    new-instance v2, Ljava/time/format/DateTimeParseException;

    const-string v3, "Unexpected end of input: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0, v1}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v2

    :goto_b
    invoke-static {v1, v0, v5}, Lwl/a;->c(Lvl/c;Ljava/lang/String;I)Lvl/d;

    move-result-object v14

    move/from16 v25, v5

    new-instance v5, Lvl/a;

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x0

    move/from16 v6, v22

    invoke-direct/range {v5 .. v15}, Lvl/a;-><init>(IIIIIIIILvl/d;I)V

    :goto_c
    invoke-static/range {v17 .. v17}, Le4/p;->e(I)I

    move-result v1

    iget v6, v5, Lvl/a;->w:I

    invoke-static {v6}, Le4/p;->e(I)I

    move-result v7

    if-gt v1, v7, :cond_17

    invoke-static/range {v22 .. v22}, Le4/p;->e(I)I

    move-result v0

    invoke-static {v6}, Le4/p;->e(I)I

    move-result v1

    if-gt v0, v1, :cond_16

    iget-object v0, v5, Lvl/a;->I:Lvl/d;

    if-eqz v0, :cond_15

    invoke-virtual {v0, v4}, Lvl/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    :goto_d
    move-object v13, v0

    goto :goto_e

    :cond_14
    iget v1, v0, Lvl/d;->a:I

    iget v0, v0, Lvl/d;->b:I

    invoke-static {v1, v0}, Ljava/time/ZoneOffset;->ofHoursMinutes(II)Ljava/time/ZoneOffset;

    move-result-object v0

    goto :goto_d

    :goto_e
    iget v6, v5, Lvl/a;->x:I

    iget v7, v5, Lvl/a;->y:I

    iget v8, v5, Lvl/a;->z:I

    iget v9, v5, Lvl/a;->E:I

    iget v10, v5, Lvl/a;->F:I

    iget v11, v5, Lvl/a;->G:I

    iget v12, v5, Lvl/a;->H:I

    invoke-static/range {v6 .. v13}, Ljava/time/OffsetDateTime;->of(IIIIIIILjava/time/ZoneOffset;)Ljava/time/OffsetDateTime;

    move-result-object v0

    return-object v0

    :cond_15
    invoke-virtual {v5}, Lvl/a;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/time/format/DateTimeParseException;

    const-string v2, "No timezone information: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v1, v2, v0, v3}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_16
    new-instance v0, Lcom/ethlo/time/internal/DateTimeFormatException;

    const-string v1, "No MINUTE field found"

    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    invoke-static/range {v20 .. v20}, Le4/p;->f(I)[I

    move-result-object v1

    invoke-static {v6}, Le4/p;->e(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    aget v1, v1, v4

    new-instance v4, Ljava/time/format/DateTimeParseException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Unexpected end of input, missing field "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    packed-switch v1, :pswitch_data_0

    const-string v1, "null"

    goto :goto_f

    :pswitch_0
    const-string v1, "ZONE_OFFSET"

    goto :goto_f

    :pswitch_1
    const-string v1, "NANO"

    goto :goto_f

    :pswitch_2
    const-string v1, "SECOND"

    goto :goto_f

    :pswitch_3
    const-string v1, "MINUTE"

    goto :goto_f

    :pswitch_4
    const-string v1, "HOUR"

    goto :goto_f

    :pswitch_5
    const-string v1, "DAY"

    goto :goto_f

    :pswitch_6
    const-string v1, "MONTH"

    goto :goto_f

    :pswitch_7
    const-string v1, "YEAR"

    :goto_f
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    packed-switch v6, :pswitch_data_1

    throw v18

    :pswitch_8
    move/from16 v2, v16

    goto :goto_10

    :pswitch_9
    move v2, v3

    goto :goto_10

    :pswitch_a
    move/from16 v2, v25

    goto :goto_10

    :pswitch_b
    move/from16 v2, v21

    goto :goto_10

    :pswitch_c
    const/16 v2, 0xa

    goto :goto_10

    :pswitch_d
    move/from16 v2, v24

    goto :goto_10

    :pswitch_e
    move/from16 v2, v27

    :goto_10
    :pswitch_f
    invoke-direct {v4, v1, v0, v2}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v4

    :cond_18
    move/from16 v13, v21

    move/from16 v21, v5

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v19, v13

    move/from16 v22, v10

    move/from16 v25, v12

    const/16 v10, 0x11

    const/4 v12, 0x5

    const/16 v13, 0x2d

    const/16 v27, 0x4

    add-int/lit8 v4, v4, 0x1

    move/from16 v10, v17

    move-object/from16 v17, v5

    move/from16 v5, v21

    move/from16 v21, v19

    move/from16 v19, v10

    move/from16 v10, v22

    move/from16 v12, v25

    goto/16 :goto_3

    :cond_19
    move/from16 v4, v23

    iget-object v1, v1, Lvl/c;->a:[C

    array-length v2, v1

    if-le v2, v4, :cond_1a

    invoke-static {v1}, Ljava/util/Arrays;->toString([C)Ljava/lang/String;

    move-result-object v1

    goto :goto_11

    :cond_1a
    const/16 v26, 0x0

    aget-char v1, v1, v26

    invoke-static {v1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    :goto_11
    new-instance v2, Ljava/time/format/DateTimeParseException;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v12, 0xa

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    filled-new-array {v1, v3, v4, v0}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "Expected character %s at position %d, found %s: %s"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0, v12}, Ljava/time/format/DateTimeParseException;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v2

    :cond_1b
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const/16 v26, 0x0

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "offset is %d which is equal to or larger than the input length of %d"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1c
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "text cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_f
    .end packed-switch

    :array_0
    .array-data 2
        0x3as
        0x5as
        0x7as
        0x2bs
        0x2ds
    .end array-data

    nop

    :array_1
    .array-data 2
        0x5as
        0x7as
        0x2bs
        0x2ds
    .end array-data
.end method

.method public static final j(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lsc3/r;Ljava/lang/String;Z)Luc3/l;
    .locals 9

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v0

    :goto_0
    add-int/2addr p0, p5

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eqz p5, :cond_2

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    const p1, 0x7fffffff

    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_2

    :cond_3
    const/4 p2, 0x0

    :goto_2
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-lt p0, v1, :cond_4

    invoke-static {p5, p3, p4, p0, p1}, Lsc3/l;->k(ZLsc3/r;Ljava/lang/String;II)Luc3/l;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p5, p3, p4, p0, p0}, Lsc3/l;->k(ZLsc3/r;Ljava/lang/String;II)Luc3/l;

    move-result-object v2

    :goto_3
    const-string v3, " "

    sget-object v4, Lm83/y;->w:Lm83/y;

    if-ge p0, v1, :cond_5

    new-instance v5, Luc3/l;

    add-int/lit8 p0, p0, 0x1

    invoke-static {p5, p3, p4, p0, p0}, Lsc3/l;->k(ZLsc3/r;Ljava/lang/String;II)Luc3/l;

    move-result-object v6

    new-instance v7, Luc3/l;

    new-instance v8, Luc3/m;

    invoke-direct {v8, v3}, Luc3/m;-><init>(Ljava/lang/String;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v7, v3, v4}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    filled-new-array {v7, v2}, [Luc3/l;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lsb3/a;->c(Ljava/util/List;)Luc3/l;

    move-result-object v2

    filled-new-array {v6, v2}, [Luc3/l;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v5, v4, v2}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    move-object v2, v5

    goto :goto_3

    :cond_5
    if-le p2, p1, :cond_6

    new-instance p0, Luc3/m;

    sub-int/2addr p2, p1

    invoke-static {p2, v3}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Luc3/m;-><init>(Ljava/lang/String;)V

    new-instance p1, Luc3/l;

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p1, p0, v4}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    filled-new-array {p1, v2}, [Luc3/l;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lsb3/a;->c(Ljava/util/List;)Luc3/l;

    move-result-object p0

    return-object p0

    :cond_6
    if-ne p2, p1, :cond_7

    return-object v2

    :cond_7
    new-instance p0, Luc3/l;

    add-int/2addr p2, v0

    invoke-static {p5, p3, p4, p2, p1}, Lsc3/l;->k(ZLsc3/r;Ljava/lang/String;II)Luc3/l;

    move-result-object p1

    filled-new-array {p1, v2}, [Luc3/l;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v4, p1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method public static final k(ZLsc3/r;Ljava/lang/String;II)Luc3/l;
    .locals 8

    add-int/lit8 v0, p0, 0x1

    if-lt p4, v0, :cond_1

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    if-eqz p0, :cond_0

    new-instance v1, Luc3/m;

    const-string v2, "-"

    invoke-direct {v1, v2}, Luc3/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v1, Luc3/f;

    new-instance v2, Luc3/q;

    sub-int/2addr p3, p0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sub-int/2addr p4, p0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move v7, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Luc3/q;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lsc3/r;Ljava/lang/String;Z)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p0}, Luc3/f;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p0

    new-instance p1, Luc3/l;

    sget-object p2, Lm83/y;->w:Lm83/y;

    invoke-direct {p1, p0, p2}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final l(Lh20/u2;)Ly00/z1;
    .locals 2

    iget-object p0, p0, Lh20/u2;->F:Lh20/n2;

    instance-of v0, p0, Lh20/m2;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Lh20/m2;

    iget-object p0, p0, Lh20/m2;->w:Lh20/s2;

    if-eqz p0, :cond_0

    iget-object v0, p0, Lh20/s2;->y:Ljava/lang/String;

    iget-object p0, p0, Lh20/s2;->x:Ljava/lang/String;

    new-instance v1, Ly00/z1;

    invoke-direct {v1, p0, v0}, Ly00/z1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v1

    :cond_1
    instance-of p0, p0, Lh20/l2;

    if-eqz p0, :cond_2

    return-object v1

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final m(Lxh/a;Lfi/i;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p4, Lxh/g;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lxh/g;

    iget v1, v0, Lxh/g;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxh/g;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxh/g;

    invoke-direct {v0, p4}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lxh/g;->H:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxh/g;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lxh/g;->G:I

    iget p1, v0, Lxh/g;->F:I

    iget-object p2, v0, Lxh/g;->E:Ljava/util/List;

    check-cast p2, Ljava/util/List;

    iget-object p3, v0, Lxh/g;->z:Lrh/f;

    iget-object v2, v0, Lxh/g;->y:Lfi/o;

    iget-object v4, v0, Lxh/g;->x:Lfi/i;

    iget-object v5, v0, Lxh/g;->w:Lxh/a;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v0

    move-object v0, p2

    move-object p2, v4

    move-object v4, v10

    move-object v10, v2

    move-object v2, p3

    move-object p3, v10

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p4, Lfi/j;->a:Lf93/a;

    invoke-static {p1, p4}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    return-object p0

    :cond_3
    iget-object v2, p0, Lxh/a;->a:Lrh/j;

    instance-of v4, v2, Lrh/a;

    if-nez v4, :cond_4

    sget-object v5, Lfi/j;->d:Lf93/a;

    invoke-static {p1, v5}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_4

    return-object p0

    :cond_4
    const/4 v5, 0x0

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, Lrh/a;

    iget-object v4, v4, Lrh/a;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v6

    if-nez v6, :cond_5

    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_5
    sget-object v7, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v6}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_2

    :cond_6
    iget-object v4, p2, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {v2, v4}, Lrh/o;->b(Lrh/j;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    sget-object v4, Lfi/k;->b:Lf93/a;

    invoke-static {p2, v4}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Bitmap$Config;

    iget-object v6, p2, Lfi/o;->b:Lgi/i;

    iget-object v7, p2, Lfi/o;->c:Lgi/g;

    iget-object v8, p2, Lfi/o;->d:Lgi/d;

    sget-object v9, Lgi/d;->x:Lgi/d;

    if-ne v8, v9, :cond_7

    move v8, v3

    goto :goto_1

    :cond_7
    move v8, v5

    :goto_1
    invoke-static {v2, v4, v6, v7, v8}, Lbi/g;->v(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lgi/i;Lgi/g;Z)Landroid/graphics/Bitmap;

    move-result-object v4

    :goto_2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v2, p4

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    move-object v10, p1

    move-object p1, p0

    move p0, v2

    move-object v2, v0

    move-object v0, p3

    move-object p3, p2

    move-object p2, v10

    :goto_3
    if-ge v5, p0, :cond_9

    invoke-interface {p4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lii/b;

    iget-object v7, p3, Lfi/o;->b:Lgi/i;

    iput-object p1, v2, Lxh/g;->w:Lxh/a;

    iput-object p2, v2, Lxh/g;->x:Lfi/i;

    iput-object p3, v2, Lxh/g;->y:Lfi/o;

    iput-object v0, v2, Lxh/g;->z:Lrh/f;

    move-object v8, p4

    check-cast v8, Ljava/util/List;

    iput-object v8, v2, Lxh/g;->E:Ljava/util/List;

    iput v5, v2, Lxh/g;->F:I

    iput p0, v2, Lxh/g;->G:I

    iput v3, v2, Lxh/g;->I:I

    invoke-virtual {v6, v4, v7, v2}, Lii/b;->transform(Landroid/graphics/Bitmap;Lgi/i;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_8

    return-object v1

    :cond_8
    move v10, v5

    move-object v5, p1

    move p1, v10

    move-object v10, v0

    move-object v0, p4

    move-object p4, v4

    move-object v4, v2

    move-object v2, v10

    :goto_4
    check-cast p4, Landroid/graphics/Bitmap;

    invoke-interface {v4}, Lq83/d;->getContext()Lq83/j;

    move-result-object v6

    invoke-static {v6}, Lbc3/f0;->o(Lq83/j;)V

    add-int/2addr p1, v3

    move-object v10, v5

    move v5, p1

    move-object p1, v10

    move-object v10, v4

    move-object v4, p4

    move-object p4, v0

    move-object v0, v2

    move-object v2, v10

    goto :goto_3

    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lrh/a;

    invoke-direct {p0, v4}, Lrh/a;-><init>(Landroid/graphics/Bitmap;)V

    iget-boolean p2, p1, Lxh/a;->b:Z

    iget-object p3, p1, Lxh/a;->c:Lsh/h;

    iget-object p1, p1, Lxh/a;->d:Ljava/lang/String;

    new-instance p4, Lxh/a;

    invoke-direct {p4, p0, p2, p3, p1}, Lxh/a;-><init>(Lrh/j;ZLsh/h;Ljava/lang/String;)V

    return-object p4
.end method

.method public static final n(Lorg/webrtc/MediaStreamTrack;Z)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/webrtc/MediaStreamTrack;->setEnabled(Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object v0, Lb23/g;->F:Lb23/g;

    const-string v1, "SafeCall"

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->c:Lb23/j;

    sget-object v0, Lb23/g;->F:Lb23/g;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Exception occurred: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
