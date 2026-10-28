.class public abstract Lky2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lky2/g$a$a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lhy2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "onNavEvent",
        "f",
        "(Lky2/g$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

    invoke-static {p0}, Lky2/b;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lky2/g$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lky2/b;->k(Lky2/g$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lky2/b;->i(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lky2/b;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lky2/g$a$a;Lky2/i;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lky2/b;->h(Lkotlin/jvm/functions/Function1;Lky2/g$a$a;Lky2/i;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lky2/g$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lky2/g$a$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v5, p1

    move-object/from16 v4, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, 0x6296ab42

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v0, 0x93

    const/16 v9, 0x92

    const/4 v11, 0x0

    if-eq v6, v9, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    move v6, v11

    :goto_4
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v15, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_29

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v2, v15, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v15, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v15, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v15, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v2, v15, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v15, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v8, v15, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 v21, v12

    iget-wide v11, v15, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v15, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 v22, v8

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v15, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    invoke-static {v11, v15, v11, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v15, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$a;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$a;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    and-int/lit16 v9, v0, 0x380

    const/16 v11, 0x100

    if-ne v9, v11, :cond_d

    const/4 v12, 0x1

    goto :goto_7

    :cond_d
    const/4 v12, 0x0

    :goto_7
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    move/from16 v23, v12

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v23, :cond_f

    if-ne v11, v12, :cond_e

    goto :goto_8

    :cond_e
    move/from16 v23, v0

    goto :goto_9

    :cond_f
    :goto_8
    new-instance v11, Lky2/a;

    move/from16 v23, v0

    const/4 v0, 0x0

    invoke-direct {v11, v4, v0}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v11, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v24, v0, 0x3

    or-int v0, v0, v24

    invoke-static {v1, v8, v11, v15, v0}, Lky2/f;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move v1, v9

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v8, v0

    const-wide/16 v24, 0x0

    cmpl-double v8, v8, v24

    const-string v9, "invalid weight; must be greater than zero"

    if-lez v8, :cond_10

    goto :goto_a

    :cond_10
    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v11, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v19, v0, v11

    move/from16 v26, v11

    if-lez v19, :cond_11

    :goto_b
    move/from16 v27, v1

    const/4 v1, 0x1

    goto :goto_c

    :cond_11
    move v11, v0

    goto :goto_b

    :goto_c
    invoke-direct {v8, v11, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v0, v21

    const/4 v8, 0x0

    invoke-static {v0, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    move-object v11, v9

    iget-wide v8, v15, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 v21, v11

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-eqz v11, :cond_12

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_12
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v15, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_13

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    invoke-static {v8, v15, v8, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v15, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x1

    const/4 v8, 0x0

    invoke-static {v8, v15, v1}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v0

    const/16 v8, 0xe

    invoke-static {v6, v0, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, Lb2/e;->H:Lb2/m;

    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v9, v0, v8}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v28

    int-to-float v0, v1

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v30, v0, v1

    const/16 v32, 0x0

    const/16 v33, 0xd

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v28 .. v33}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v8, v30

    sget-object v9, Lb2/e;->N:Lb2/k;

    const/16 v11, 0x30

    invoke-static {v10, v9, v15, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object/from16 v28, v10

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v15}, Lp1/q;->i0()V

    move/from16 v29, v1

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-eqz v1, :cond_15

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v15, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_16

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_16
    invoke-static {v10, v15, v10, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v15, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v9, v0

    cmpl-double v1, v9, v24

    if-lez v1, :cond_18

    goto :goto_f

    :cond_18
    invoke-static/range {v21 .. v21}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v9, v0, v26

    if-lez v9, :cond_19

    move/from16 v0, v26

    :goto_10
    const/4 v9, 0x1

    goto :goto_11

    :cond_19
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_10

    :goto_11
    invoke-direct {v1, v0, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v15, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$a;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1a

    const v0, -0x75600cbe

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    move v4, v1

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object v3, v6

    move-object v1, v7

    move-object/from16 v35, v12

    move-object/from16 v26, v13

    move-object v0, v14

    move-object/from16 v2, v22

    move/from16 v34, v27

    move-object/from16 v5, v28

    :goto_12
    const/high16 v10, 0x3f800000    # 1.0f

    goto :goto_13

    :cond_1a
    const/4 v1, 0x0

    const v10, -0x75600cbd

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    invoke-static {v0, v15, v1}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move/from16 v17, v9

    invoke-static {v15, v1}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v9

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v1, 0x2

    int-to-float v10, v1

    mul-float v10, v10, v29

    invoke-static {v11, v10, v8, v10, v10}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v8, Liz0/m;->p:I

    shl-int/lit8 v8, v8, 0x9

    move/from16 v10, v17

    const/16 v17, 0x1f4

    move/from16 v16, v8

    const/16 v11, 0x20

    const/4 v8, 0x0

    move/from16 v21, v10

    const/4 v10, 0x0

    move/from16 v24, v11

    const/4 v11, 0x0

    move-object/from16 v25, v12

    const/4 v12, 0x0

    move-object/from16 v26, v13

    const/4 v13, 0x0

    move-object/from16 v29, v14

    const/4 v14, 0x0

    move-object v4, v7

    move-object v7, v1

    move-object v1, v4

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object v3, v6

    move-object/from16 v2, v22

    move-object/from16 v35, v25

    move/from16 v34, v27

    move-object/from16 v5, v28

    const/4 v4, 0x0

    move-object v6, v0

    move-object/from16 v0, v29

    invoke-static/range {v6 .. v17}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-static {v10, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v5, v2, v15, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v15, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v15, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-eqz v8, :cond_1b

    invoke-virtual {v15, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_1b
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v15, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v26

    invoke-static {v15, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_1c

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    :cond_1c
    move-object/from16 v0, v19

    goto :goto_16

    :cond_1d
    :goto_15
    move-object/from16 v0, v18

    goto :goto_17

    :goto_16
    invoke-static {v5, v15, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_15

    :goto_17
    invoke-static {v15, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x7e52f859

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$a;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lky2/i;

    invoke-virtual {v1}, Lky2/i;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lky2/g$a$a;->j()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1}, Lky2/i;->a()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v2, v15, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v11

    new-instance v7, Lsy0/k$g;

    invoke-virtual {v2, v15, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v9, 0x2

    invoke-direct {v7, v2, v5, v9, v5}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x3fb33333    # 1.4f

    invoke-static {v2, v3}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    and-int/lit8 v2, v23, 0x70

    const/16 v5, 0x20

    if-ne v2, v5, :cond_1e

    const/4 v10, 0x1

    :goto_19
    move-object v2, v3

    move-object/from16 v3, p0

    goto :goto_1a

    :cond_1e
    move v10, v4

    goto :goto_19

    :goto_1a
    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v10, v14

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v10, v14

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v10, :cond_20

    move-object/from16 v10, v35

    if-ne v14, v10, :cond_1f

    goto :goto_1b

    :cond_1f
    move-object/from16 v5, p1

    goto :goto_1c

    :cond_20
    move-object/from16 v10, v35

    :goto_1b
    new-instance v14, Ljs2/h;

    const/4 v9, 0x5

    move-object/from16 v5, p1

    invoke-direct {v14, v5, v3, v1, v9}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v15, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1c
    move-object/from16 v18, v14

    check-cast v18, Lkotlin/jvm/functions/Function1;

    const v1, 0x186000

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v1, v9

    sget v9, Lsy0/k$g;->d:I

    shl-int/lit8 v9, v9, 0x3

    or-int v20, v1, v9

    const/16 v21, 0x0

    const/16 v22, 0x388

    const/4 v9, 0x0

    move-object/from16 v35, v10

    const/4 v10, 0x1

    const/4 v14, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v1, v35

    invoke-static/range {v6 .. v22}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v3, v2

    move-object/from16 v15, v19

    goto/16 :goto_18

    :cond_21
    move-object/from16 v3, p0

    move-object/from16 v5, p1

    move-object/from16 v1, v35

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    const/4 v9, 0x1

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v3}, Lky2/g$a$a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v3}, Lky2/g$a$a;->m()Z

    move-result v7

    and-int/lit8 v0, v23, 0x70

    const/16 v11, 0x20

    if-ne v0, v11, :cond_22

    const/4 v10, 0x1

    goto :goto_1d

    :cond_22
    move v10, v4

    :goto_1d
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v10, :cond_23

    if-ne v0, v1, :cond_24

    :cond_23
    new-instance v0, Lky2/a;

    const/4 v2, 0x1

    invoke-direct {v0, v5, v2}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object v9, v0

    check-cast v9, Lc93/a;

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v12, 0x4

    const/4 v8, 0x0

    move-object v10, v15

    invoke-static/range {v6 .. v12}, Lry2/i;->c(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3}, Lky2/g$a$a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_25

    const v0, -0x753db537

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    move-object/from16 v6, p2

    :goto_1e
    const/4 v1, 0x1

    goto :goto_22

    :cond_25
    const v0, -0x753db536

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lky2/g$a$a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v2, v34

    const/16 v6, 0x100

    if-ne v2, v6, :cond_26

    const/4 v10, 0x1

    goto :goto_1f

    :cond_26
    move v10, v4

    :goto_1f
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v10, :cond_28

    if-ne v2, v1, :cond_27

    goto :goto_20

    :cond_27
    move-object/from16 v6, p2

    goto :goto_21

    :cond_28
    :goto_20
    new-instance v2, Lky2/a;

    const/4 v1, 0x2

    move-object/from16 v6, p2

    invoke-direct {v2, v6, v1}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_21
    check-cast v2, Lc93/a;

    invoke-static {v0, v2, v15, v11}, Lky2/h;->c(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    goto :goto_1e

    :goto_22
    invoke-static {v15, v1, v1, v1, v1}, Lb9/y;->B(Lp1/q;ZZZZ)V

    goto :goto_23

    :cond_29
    move-object v6, v4

    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_23
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2a

    new-instance v0, Lh02/i;

    const/16 v2, 0x18

    move/from16 v1, p4

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Lh02/i;-><init>(IILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lky2/g$a$a;Lky2/i;Z)Ll83/a0;
    .locals 1

    new-instance v0, Lhy2/a$a;

    invoke-virtual {p1}, Lky2/g$a$a;->a()I

    move-result p1

    invoke-virtual {p2}, Lky2/i;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, p2, p3}, Lhy2/a$a;-><init>(ILjava/lang/String;Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method private static final k(Lky2/g$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lky2/b;->f(Lky2/g$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
