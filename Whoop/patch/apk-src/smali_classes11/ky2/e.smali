.class public abstract Lky2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lky2/g;",
        "viewState",
        "Lkotlin/Function1;",
        "Lhy2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "onNavEvent",
        "i",
        "(Lky2/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lky2/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lky2/e;->l(Lkotlin/jvm/functions/Function1;Lky2/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lky2/e;->k(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lky2/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lky2/e;->o(Lkotlin/jvm/functions/Function1;Lky2/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lky2/e;->m(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lky2/e;->n(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lky2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lky2/e;->j(Lkotlin/jvm/functions/Function1;Lky2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lky2/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lky2/e;->q(Lky2/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lky2/e;->p(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lky2/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lky2/g;",
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

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, 0x5a59b38

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x4

    const/4 v6, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit8 v7, v1, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_4

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v7, v8

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :cond_4
    and-int/lit16 v7, v1, 0x180

    const/16 v9, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v9

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit16 v7, v0, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v7, v10, :cond_7

    move v7, v11

    goto :goto_5

    :cond_7
    move v7, v12

    :goto_5
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v13, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_2e

    sget-object v7, Lky2/g$d;->a:Lky2/g$d;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_8

    const v2, 0x22cdd8d2

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v2, Lsz0/p0$c;->f:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v19, v2, v8

    const/16 v20, 0x0

    const/16 v21, 0xffc

    const/4 v8, 0x0

    move v2, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move v15, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move-object/from16 v24, v17

    const/16 v17, 0x0

    move/from16 v2, v23

    move-object/from16 v25, v24

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v18

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move/from16 v26, v0

    move-object/from16 v2, v25

    goto/16 :goto_17

    :cond_8
    move v7, v2

    move-object/from16 v25, v10

    move/from16 v22, v11

    move v2, v12

    instance-of v10, v3, Lky2/g$b;

    if-eqz v10, :cond_11

    const v10, 0x22d17920

    invoke-virtual {v13, v10}, Lp1/q;->e0(I)V

    new-instance v14, Lsz0/p0$b;

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lyw2/e;->l:I

    const/4 v11, 0x0

    invoke-direct {v15, v10, v11, v6, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lyw2/e;->n:I

    invoke-direct {v10, v12, v11, v6, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lyw2/e;->B:I

    invoke-direct {v12, v15, v11, v6, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lyw2/e;->a:I

    invoke-direct {v15, v2, v11, v6, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v2, v0, 0x70

    if-ne v2, v8, :cond_9

    move/from16 v11, v22

    goto :goto_6

    :cond_9
    const/4 v11, 0x0

    :goto_6
    and-int/lit8 v2, v0, 0xe

    if-eq v2, v7, :cond_b

    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_a

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_7

    :cond_a
    const/4 v2, 0x0

    goto :goto_8

    :cond_b
    :goto_7
    move/from16 v2, v22

    :goto_8
    or-int/2addr v2, v11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_c

    move-object/from16 v2, v25

    if-ne v6, v2, :cond_d

    goto :goto_9

    :cond_c
    move-object/from16 v2, v25

    :goto_9
    new-instance v6, Lj11/q;

    const/16 v7, 0x1b

    invoke-direct {v6, v7, v5, v3}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lc93/a;

    and-int/lit16 v7, v0, 0x380

    if-ne v7, v9, :cond_e

    move/from16 v11, v22

    goto :goto_a

    :cond_e
    const/4 v11, 0x0

    :goto_a
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v11, :cond_f

    if-ne v7, v2, :cond_10

    :cond_f
    new-instance v7, Lky2/a;

    const/4 v8, 0x6

    invoke-direct {v7, v4, v8}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lc93/a;

    const/high16 v8, 0x30000

    sget v11, Lsz0/p0$b;->h:I

    or-int/2addr v8, v11

    sget v11, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v16, v11, 0x3

    or-int v8, v8, v16

    shl-int/lit8 v16, v11, 0x9

    or-int v8, v8, v16

    shl-int/lit8 v11, v11, 0x15

    or-int v19, v8, v11

    const/16 v20, 0x6

    const/16 v21, 0xa44

    const/4 v8, 0x0

    const/4 v11, 0x1

    move/from16 v16, v9

    move-object v9, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    move-object v13, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x1

    move/from16 v24, v17

    const/16 v17, 0x0

    move-object v1, v10

    move-object v10, v6

    move-object v6, v14

    move-object v14, v7

    move-object v7, v1

    move/from16 v1, v22

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v18

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    :goto_b
    move/from16 v26, v0

    goto/16 :goto_17

    :cond_11
    move/from16 v1, v22

    move-object/from16 v2, v25

    instance-of v6, v3, Lky2/g$a;

    if-eqz v6, :cond_1c

    const v6, 0x22de4e66

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    move-object v6, v3

    check-cast v6, Lky2/g$a;

    invoke-virtual {v6}, Lky2/g$a;->a()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const v9, 0x32ac56c4

    invoke-virtual {v13, v9, v7}, Lp1/q;->b0(ILjava/lang/Object;)V

    sget-object v7, Lb2/e;->w:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v7, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_12

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v13, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v13, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_13

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    :cond_13
    invoke-static {v9, v13, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v13, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v7, v6, Lky2/g$a$b;

    if-eqz v7, :cond_15

    const v7, -0x563c2fe6

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    move-object v7, v3

    check-cast v7, Lky2/g$a$b;

    and-int/lit16 v9, v0, 0x3fe

    invoke-static {v7, v5, v4, v13, v9}, Lky2/c;->f(Lky2/g$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_15
    const/4 v9, 0x0

    instance-of v7, v6, Lky2/g$a$a;

    if-eqz v7, :cond_1b

    const v7, -0x5635f746

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    move-object v7, v3

    check-cast v7, Lky2/g$a$a;

    and-int/lit16 v10, v0, 0x3fe

    invoke-static {v7, v5, v4, v13, v10}, Lky2/b;->f(Lky2/g$a$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v6}, Lky2/g$a;->c()Lky2/l;

    move-result-object v7

    if-nez v7, :cond_16

    const v7, -0x56309481

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    move-object/from16 v22, v6

    move v1, v8

    goto :goto_e

    :cond_16
    const v9, -0x56309480

    invoke-virtual {v13, v9}, Lp1/q;->e0(I)V

    move-object v9, v6

    new-instance v6, Lsz0/p0$e;

    invoke-virtual {v7}, Lky2/l;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v11

    invoke-virtual {v11}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v11

    invoke-virtual {v11}, Lgz0/k0;->T()I

    move-result v11

    invoke-direct {v6, v10, v11}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-virtual {v7}, Lky2/l;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v10, Lsz0/p0$e;->g:I

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v11, 0x3

    or-int v19, v10, v11

    const/16 v20, 0x36

    const/16 v21, 0x3fc

    move v10, v8

    const/4 v8, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    const/16 v16, 0x0

    move/from16 v24, v17

    const/16 v17, 0x1

    move/from16 v1, v24

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v18

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual/range {v22 .. v22}, Lky2/g$a;->b()Lky2/k;

    move-result-object v6

    if-nez v6, :cond_17

    const v1, -0x5628b8c6

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v15, 0x1

    goto :goto_11

    :cond_17
    const v7, -0x5628b8c5

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lky2/k;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    and-int/lit8 v7, v0, 0x70

    if-ne v7, v1, :cond_18

    const/4 v11, 0x1

    goto :goto_10

    :cond_18
    const/4 v11, 0x0

    :goto_10
    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_19

    if-ne v7, v2, :cond_1a

    :cond_19
    new-instance v7, Lky2/d;

    const/4 v1, 0x0

    invoke-direct {v7, v5, v6, v1}, Lky2/d;-><init>(Lkotlin/jvm/functions/Function1;Lky2/k;I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v18, v7

    check-cast v18, Lc93/a;

    new-instance v14, Lsz0/p0$h;

    const-wide/16 v16, 0x0

    const/16 v19, 0x2

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v20}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6}, Lky2/k;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->f(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v1, Lsz0/p0$h;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v19, v1, v6

    const/16 v20, 0x36

    const/16 v21, 0x3fc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object v6, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v18

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_11
    invoke-static {v13, v15, v9, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto/16 :goto_b

    :cond_1b
    const v0, -0xb0a42b8

    invoke-static {v0, v13, v9}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1c
    move v1, v8

    const/4 v9, 0x0

    instance-of v6, v3, Lky2/g$e;

    if-eqz v6, :cond_1d

    const v1, 0x22ff30f5

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    new-instance v1, Lcom/whoop/whooplabs/feature/navigation/c$f;

    move-object v6, v3

    check-cast v6, Lky2/g$e;

    invoke-virtual {v6}, Lky2/g$e;->a()I

    move-result v7

    invoke-virtual {v6}, Lky2/g$e;->b()Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v1, v7, v6}, Lcom/whoop/whooplabs/feature/navigation/c$f;-><init>(ILjava/lang/Integer;)V

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_b

    :cond_1d
    instance-of v6, v3, Lky2/g$c;

    if-eqz v6, :cond_29

    const v6, 0x230282ea

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    move-object/from16 v22, v3

    check-cast v22, Lky2/g$c;

    invoke-virtual/range {v22 .. v22}, Lky2/g$c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual/range {v22 .. v22}, Lky2/g$c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual/range {v22 .. v22}, Lky2/g$c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {v22 .. v22}, Lky2/g$c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    and-int/lit8 v6, v0, 0x70

    if-ne v6, v1, :cond_1e

    const/4 v8, 0x1

    goto :goto_12

    :cond_1e
    const/4 v8, 0x0

    :goto_12
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_1f

    if-ne v12, v2, :cond_20

    :cond_1f
    new-instance v12, Lky2/a;

    const/4 v8, 0x7

    invoke-direct {v12, v5, v8}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v12, Lc93/a;

    and-int/lit16 v8, v0, 0x380

    const/16 v14, 0x100

    if-ne v8, v14, :cond_21

    const/4 v8, 0x1

    goto :goto_13

    :cond_21
    const/4 v8, 0x0

    :goto_13
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v8, :cond_22

    if-ne v14, v2, :cond_23

    :cond_22
    new-instance v14, Lky2/a;

    const/16 v8, 0x8

    invoke-direct {v14, v4, v8}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    move-object v8, v14

    check-cast v8, Lc93/a;

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v25, v14, 0x3

    shl-int/lit8 v15, v14, 0x9

    or-int v15, v25, v15

    shl-int/lit8 v16, v14, 0xc

    or-int v15, v15, v16

    shl-int/lit8 v14, v14, 0xf

    or-int/2addr v14, v15

    const/16 v15, 0x40

    move/from16 v16, v6

    move-object v6, v12

    const/4 v12, 0x0

    move/from16 v26, v0

    move/from16 v0, v16

    invoke-static/range {v6 .. v15}, Lkz2/c;->n(Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {v22 .. v22}, Lky2/g$c;->f()Lky2/l;

    move-result-object v6

    if-nez v6, :cond_24

    const v6, 0x2309fe02

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_24
    const v7, 0x2309fe03

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    move-object v7, v6

    new-instance v6, Lsz0/p0$e;

    invoke-virtual {v7}, Lky2/l;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/k0;->T()I

    move-result v9

    invoke-direct {v6, v8, v9}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-virtual {v7}, Lky2/l;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v8, Lsz0/p0$e;->g:I

    or-int v19, v8, v25

    const/16 v20, 0x36

    const/16 v21, 0x3fc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v18

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual/range {v22 .. v22}, Lky2/g$c;->e()Lky2/k;

    move-result-object v6

    if-nez v6, :cond_25

    const v0, 0x23107eed

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_25
    const v7, 0x23107eee

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lky2/k;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    if-ne v0, v1, :cond_26

    const/4 v11, 0x1

    goto :goto_15

    :cond_26
    const/4 v11, 0x0

    :goto_15
    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_27

    if-ne v1, v2, :cond_28

    :cond_27
    new-instance v1, Lky2/d;

    const/4 v0, 0x1

    invoke-direct {v1, v5, v6, v0}, Lky2/d;-><init>(Lkotlin/jvm/functions/Function1;Lky2/k;I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    move-object/from16 v18, v1

    check-cast v18, Lc93/a;

    new-instance v14, Lsz0/p0$h;

    const-wide/16 v16, 0x0

    const/16 v19, 0x2

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v20}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6}, Lky2/k;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->f(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v0, Lsz0/p0$h;->h:I

    or-int v19, v0, v25

    const/16 v20, 0x36

    const/16 v21, 0x3fc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object v6, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v18

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_29
    move/from16 v26, v0

    instance-of v0, v3, Lky2/g$f;

    if-eqz v0, :cond_2d

    const v0, 0x32ae3cf3

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    move-object v0, v3

    check-cast v0, Lky2/g$f;

    and-int/lit8 v1, v26, 0xe

    shr-int/lit8 v6, v26, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v1, v6

    invoke-static {v0, v4, v13, v1}, Lky2/j;->d(Lky2/g$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    :goto_17
    move/from16 v0, v26

    and-int/lit16 v0, v0, 0x380

    const/16 v14, 0x100

    if-ne v0, v14, :cond_2a

    const/4 v11, 0x1

    goto :goto_18

    :cond_2a
    const/4 v11, 0x0

    :goto_18
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v11, :cond_2b

    if-ne v0, v2, :cond_2c

    :cond_2b
    new-instance v0, Lky2/a;

    const/16 v1, 0x9

    invoke-direct {v0, v4, v1}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v0, Lc93/a;

    const/4 v1, 0x6

    const/4 v9, 0x0

    const/4 v15, 0x1

    invoke-static {v0, v15, v13, v1, v9}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_19

    :cond_2d
    const/4 v9, 0x0

    const v0, 0x32abd87b    # 2.0005464E-8f

    invoke-static {v0, v13, v9}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_2e
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_19
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_2f

    new-instance v0, Lh02/i;

    const/16 v2, 0x1a

    move/from16 v1, p4

    invoke-direct/range {v0 .. v5}, Lh02/i;-><init>(IILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lky2/g;)Ll83/a0;
    .locals 2

    new-instance v0, Lhy2/a$b;

    check-cast p1, Lky2/g$b;

    invoke-virtual {p1}, Lky2/g$b;->a()I

    move-result v1

    invoke-virtual {p1}, Lky2/g$b;->b()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lhy2/a$b;-><init>(ILjava/lang/Integer;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lky2/k;)Ll83/a0;
    .locals 1

    new-instance v0, Lhy2/a$f;

    invoke-virtual {p1}, Lky2/k;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object p1

    invoke-direct {v0, p1}, Lhy2/a$f;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhy2/a$e;->a:Lhy2/a$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lky2/k;)Ll83/a0;
    .locals 1

    new-instance v0, Lhy2/a$f;

    invoke-virtual {p1}, Lky2/k;->a()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;

    move-result-object p1

    invoke-direct {v0, p1}, Lhy2/a$f;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lky2/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lky2/e;->i(Lky2/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
