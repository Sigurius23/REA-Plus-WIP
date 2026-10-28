.class public abstract Liy0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a1\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b\u00b2\u0006\u000c\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Li91/a;",
        "background",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "c",
        "(Lcom/whoop/design/util/TextResource;Li91/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isPressed",
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
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Liy0/b;->e(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Li91/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Liy0/b;->f(Lcom/whoop/design/util/TextResource;Li91/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;Li91/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Li91/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "text"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x3042ea7a    # 7.091E-10f

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    const/4 v5, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v7, p5, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_2

    move-object/from16 v8, p1

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v2, v9

    :goto_3
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_6

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :cond_6
    and-int/lit16 v9, v2, 0x93

    const/16 v11, 0x92

    const/4 v13, 0x0

    if-eq v9, v11, :cond_7

    const/4 v9, 0x1

    goto :goto_5

    :cond_7
    move v9, v13

    :goto_5
    and-int/lit8 v11, v2, 0x1

    invoke-virtual {v0, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_14

    if-eqz v7, :cond_8

    const/4 v7, 0x0

    move-object/from16 v33, v7

    goto :goto_6

    :cond_8
    move-object/from16 v33, v8

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_9

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v7

    :cond_9
    move-object v15, v7

    check-cast v15, Lj0/i;

    const/4 v7, 0x6

    invoke-static {v15, v0, v7}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v9

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v16

    invoke-static {v9}, Liy0/b;->d(Lp1/t2;)Z

    move-result v14

    if-eqz v14, :cond_a

    const v14, 0x2b325ce4

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->w()J

    move-result-wide v18

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    move-wide/from16 v21, v18

    goto :goto_7

    :cond_a
    const v14, 0x2b325ee6    # 6.337E-13f

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    move-wide/from16 v21, v16

    :goto_7
    invoke-static {v9}, Liy0/b;->d(Lp1/t2;)Z

    move-result v9

    if-eqz v9, :cond_b

    const v9, 0x2b3265a6

    invoke-virtual {v0, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    move-wide/from16 v18, v16

    goto :goto_8

    :cond_b
    const v9, 0x2b326a20

    invoke-virtual {v0, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->a1()J

    move-result-wide v18

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    :goto_8
    and-int/lit8 v9, v2, 0xe

    invoke-static {v4, v0, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v10, "activity_button_"

    invoke-direct {v12, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const-wide v13, 0x4033800000000000L    # 19.5

    double-to-float v13, v13

    int-to-float v3, v3

    mul-float/2addr v13, v3

    const/4 v3, 0x0

    invoke-static {v10, v13, v3, v5}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v10}, Lkd1/w;->b()Lk91/a;

    move-result-object v13

    invoke-virtual {v13}, Lk91/a;->c()Lt0/i;

    move-result-object v13

    invoke-static {v3, v13}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-nez v33, :cond_c

    invoke-static/range {v18 .. v19}, Li91/c;->o(J)Li91/a;

    move-result-object v13

    goto :goto_9

    :cond_c
    move-object/from16 v13, v33

    :goto_9
    invoke-static {v3, v13}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v5, v5

    if-eqz v33, :cond_d

    const v13, 0x2b32a405

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->V0()J

    move-result-wide v16

    const/4 v12, 0x0

    :goto_a
    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    move-wide/from16 v13, v16

    goto :goto_b

    :cond_d
    const/4 v12, 0x0

    const v13, 0x2b32a626

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    goto :goto_a

    :goto_b
    invoke-virtual {v10}, Lkd1/w;->b()Lk91/a;

    move-result-object v10

    invoke-virtual {v10}, Lk91/a;->c()Lt0/i;

    move-result-object v10

    invoke-static {v3, v5, v13, v14, v10}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v13

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v5, v10

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    and-int/lit16 v2, v2, 0x380

    const/16 v3, 0x100

    if-ne v2, v3, :cond_e

    const/4 v2, 0x1

    goto :goto_c

    :cond_e
    const/4 v2, 0x0

    :goto_c
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_f

    if-ne v3, v8, :cond_10

    :cond_f
    new-instance v3, Liy0/a;

    const/4 v2, 0x0

    invoke-direct {v3, v6, v2}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v19, v3

    check-cast v19, Lc93/a;

    const/16 v20, 0x1c

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v3, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_11

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_d
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    :cond_12
    invoke-static {v5, v0, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v0, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->t()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v9, v21

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v29, v0

    move-object v7, v2

    const/4 v0, 0x1

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v29

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    move-object/from16 v5, v33

    goto :goto_e

    :cond_14
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object v5, v8

    :goto_e
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_15

    new-instance v0, Lhy0/v;

    const/16 v3, 0x16

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final d(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
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

.method private static final e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;Li91/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Liy0/b;->c(Lcom/whoop/design/util/TextResource;Li91/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
