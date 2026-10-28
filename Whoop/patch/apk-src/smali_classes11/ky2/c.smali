.class public abstract Lky2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lky2/g$a$b;",
        "viewState",
        "Lkotlin/Function1;",
        "Lhy2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "onNavEvent",
        "f",
        "(Lky2/g$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "whooplabs_release"
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

    invoke-static {p0}, Lky2/c;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lky2/g$a$b;ILky2/i;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lky2/c;->h(Lkotlin/jvm/functions/Function1;Lky2/g$a$b;ILky2/i;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lky2/g$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lky2/c;->k(Lky2/g$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lky2/c;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lky2/c;->i(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lky2/g$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lky2/g$a$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    move/from16 v7, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x174b0171

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    if-eq v5, v10, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    move v5, v11

    :goto_4
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v12, v10, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_2c

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    iget-wide v3, v12, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v12, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v12, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v3, v12, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v1, 0x0

    invoke-static {v11, v9, v12, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v1, v12, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v22, v9

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v12, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    invoke-static {v1, v12, v1, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v12, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$b;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$b;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    and-int/lit16 v7, v0, 0x380

    const/16 v9, 0x100

    if-ne v7, v9, :cond_d

    const/4 v10, 0x1

    goto :goto_7

    :cond_d
    const/4 v10, 0x0

    :goto_7
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move/from16 v23, v10

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v23, :cond_f

    if-ne v9, v10, :cond_e

    goto :goto_8

    :cond_e
    move/from16 v23, v0

    goto :goto_9

    :cond_f
    :goto_8
    new-instance v9, Lky2/a;

    move/from16 v23, v0

    const/4 v0, 0x3

    invoke-direct {v9, v6, v0}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v9, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v24, v0, 0x3

    or-int v0, v0, v24

    invoke-static {v1, v2, v9, v12, v0}, Lky2/f;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v1, v0

    const-wide/16 v24, 0x0

    cmpl-double v1, v1, v24

    const-string v2, "invalid weight; must be greater than zero"

    if-lez v1, :cond_10

    goto :goto_a

    :cond_10
    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v21, v0, v9

    move/from16 v26, v9

    if-lez v21, :cond_11

    :goto_b
    move-object/from16 v27, v2

    const/4 v2, 0x1

    goto :goto_c

    :cond_11
    move v9, v0

    goto :goto_b

    :goto_c
    invoke-direct {v1, v9, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v0, 0x0

    invoke-static {v14, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    move-object v0, v10

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_12

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_12
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v12, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    :cond_13
    invoke-static {v9, v12, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v12, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v12, v2}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v9

    const/16 v1, 0xe

    invoke-static {v5, v9, v1}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->H:Lb2/m;

    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v9, v1, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    const/16 v9, 0x30

    invoke-static {v11, v2, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_15

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v12, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    invoke-static {v9, v12, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v12, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v9, v2

    cmpl-double v1, v9, v24

    if-lez v1, :cond_18

    goto :goto_f

    :cond_18
    invoke-static/range {v27 .. v27}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v9, v2, v26

    if-lez v9, :cond_19

    move/from16 v2, v26

    :goto_10
    const/4 v9, 0x1

    goto :goto_11

    :cond_19
    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_10

    :goto_11
    invoke-direct {v1, v2, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v12, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$b;->f()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x8

    if-nez v1, :cond_1a

    const v1, 0xd9fb9cf

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    move-object/from16 v34, v0

    move-object/from16 v30, v8

    move v0, v9

    move-object v1, v13

    move-object/from16 v31, v15

    move-object/from16 v32, v22

    const/high16 v2, 0x3f800000    # 1.0f

    :goto_12
    const/4 v14, 0x2

    goto :goto_13

    :cond_1a
    const/4 v9, 0x0

    const v10, 0xd9fb9d0

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    invoke-static {v1, v12, v9}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v9}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v11

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const/4 v14, 0x2

    int-to-float v9, v14

    int-to-float v14, v2

    mul-float v25, v9, v14

    const/4 v9, 0x1

    int-to-float v10, v9

    mul-float v26, v10, v14

    const/16 v28, 0x0

    const/16 v29, 0x8

    move/from16 v27, v25

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget v14, Liz0/m;->p:I

    shl-int/lit8 v14, v14, 0x9

    const/16 v16, 0x0

    const/16 v19, 0x1f4

    move/from16 v24, v9

    move-object v9, v10

    const/4 v10, 0x0

    move-object/from16 v17, v12

    const/16 v25, 0x20

    const/4 v12, 0x0

    move-object/from16 v26, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/16 v27, 0x100

    const/4 v14, 0x0

    move-object/from16 v28, v15

    const/4 v15, 0x0

    move/from16 v29, v16

    const/16 v16, 0x0

    move-object/from16 v34, v0

    move-object/from16 v30, v8

    move-object/from16 v32, v22

    move-object/from16 v31, v28

    move/from16 v0, v29

    const/high16 v2, 0x3f800000    # 1.0f

    move-object v8, v1

    move-object/from16 v1, v26

    invoke-static/range {v8 .. v19}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v17

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    int-to-float v8, v14

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v9, v8

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v14, v8, v2

    const/4 v8, 0x1

    int-to-float v5, v8

    mul-float v15, v5, v2

    const/16 v17, 0x0

    const/16 v18, 0x8

    move/from16 v16, v14

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v5, 0x6

    move-object/from16 v10, v32

    invoke-static {v9, v10, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_1b

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    :goto_14
    move-object/from16 v1, v30

    goto :goto_15

    :cond_1b
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_14

    :goto_15
    invoke-static {v12, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v31

    invoke-static {v12, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_1c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :cond_1c
    invoke-static {v9, v12, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v12, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x67c45ef

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$b;->h()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    move v3, v0

    :goto_16
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v22, v3, 0x1

    if-ltz v3, :cond_23

    move-object v4, v1

    check-cast v4, Lky2/i;

    invoke-virtual {v4}, Lky2/i;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v10, Lny0/e0;->TEXT:Lny0/e0;

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$b;->j()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_1e

    goto :goto_17

    :cond_1e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_1f

    move v13, v8

    goto :goto_18

    :cond_1f
    :goto_17
    move v13, v0

    :goto_18
    and-int/lit8 v1, v23, 0x70

    const/16 v11, 0x20

    if-ne v1, v11, :cond_20

    move v1, v8

    :goto_19
    move-object/from16 v2, p0

    goto :goto_1a

    :cond_20
    move v1, v0

    goto :goto_19

    :goto_1a
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v12, v3}, Lp1/q;->e(I)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v14, v34

    if-nez v1, :cond_21

    if-ne v5, v14, :cond_22

    :cond_21
    move/from16 v19, v0

    goto :goto_1b

    :cond_22
    move-object/from16 v1, p1

    move/from16 v19, v0

    goto :goto_1c

    :goto_1b
    new-instance v0, Lb30/o1;

    const/4 v5, 0x5

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v5}, Lb30/o1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :goto_1c
    move-object/from16 v17, v5

    check-cast v17, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0x180

    const/16 v20, 0xe9

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v33, v11

    move-object/from16 v18, v12

    const-wide/16 v11, 0x0

    move-object/from16 v34, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v2, v16

    const/16 v16, 0x0

    move v4, v2

    move/from16 v3, v19

    move-object/from16 v2, v34

    move/from16 v19, v0

    move/from16 v0, v33

    invoke-static/range {v8 .. v20}, Lny0/d1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v0, v3

    move v8, v4

    move-object/from16 v12, v18

    move/from16 v3, v22

    goto/16 :goto_16

    :cond_23
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_24
    move-object/from16 v1, p1

    move v3, v0

    move v4, v8

    move-object/from16 v2, v34

    const/16 v0, 0x20

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$b;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$b;->m()Z

    move-result v9

    and-int/lit8 v5, v23, 0x70

    if-ne v5, v0, :cond_25

    move v11, v4

    goto :goto_1d

    :cond_25
    move v11, v3

    :goto_1d
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v11, :cond_26

    if-ne v0, v2, :cond_27

    :cond_26
    new-instance v0, Lky2/a;

    const/4 v5, 0x4

    invoke-direct {v0, v1, v5}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object v11, v0

    check-cast v11, Lc93/a;

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v14, 0x4

    const/4 v10, 0x0

    invoke-static/range {v8 .. v14}, Lry2/i;->c(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_28

    const v0, 0xdbf951c

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_1f

    :cond_28
    const v0, 0xdbf951d

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/16 v9, 0x100

    if-ne v7, v9, :cond_29

    move v11, v4

    goto :goto_1e

    :cond_29
    move v11, v3

    :goto_1e
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v11, :cond_2a

    if-ne v5, v2, :cond_2b

    :cond_2a
    new-instance v5, Lky2/a;

    const/4 v2, 0x5

    invoke-direct {v5, v6, v2}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v5, Lc93/a;

    invoke-static {v0, v5, v12, v13}, Lky2/h;->c(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-static {v12, v4, v4, v4, v4}, Lb9/y;->B(Lp1/q;ZZZZ)V

    goto :goto_20

    :cond_2c
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_20
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2d

    new-instance v0, Lh02/i;

    const/16 v2, 0x19

    move-object/from16 v3, p0

    move-object v5, v1

    move-object v4, v6

    move/from16 v1, p4

    invoke-direct/range {v0 .. v5}, Lh02/i;-><init>(IILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2d
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lky2/g$a$b;ILky2/i;Z)Ll83/a0;
    .locals 0

    new-instance p4, Lhy2/a$d;

    invoke-virtual {p1}, Lky2/g$a$b;->a()I

    move-result p1

    invoke-virtual {p3}, Lky2/i;->a()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p4, p1, p2, p3}, Lhy2/a$d;-><init>(IILjava/lang/String;)V

    invoke-interface {p0, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhy2/a$c;->a:Lhy2/a$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lky2/g$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lky2/c;->f(Lky2/g$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
