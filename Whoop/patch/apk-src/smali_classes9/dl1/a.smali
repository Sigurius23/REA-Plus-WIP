.class public abstract Ldl1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\u008b\u0001\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00050\t2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\tH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lal1/d;",
        "viewState",
        "Lkotlin/Function2;",
        "Lxk1/c;",
        "",
        "Ll83/a0;",
        "onClickCommonQuestionCard",
        "Lkotlin/Function0;",
        "onClickBackButton",
        "Lkotlin/Function1;",
        "Lcom/whoop/navigation/AiAction;",
        "onClickOpenInAppSupport",
        "",
        "onClickBrowseAll",
        "onTryAgainClicked",
        "",
        "onCallTileClicked",
        "b",
        "(Lal1/d;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "help-center_release"
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
.method public static synthetic a(Lal1/d;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Ldl1/a;->c(Lal1/d;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lal1/d;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lal1/d;",
            "Lc93/m;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v0, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    sget-object v6, Lb2/e;->w:Lb2/m;

    const-string v8, "viewState"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onClickCommonQuestionCard"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onClickBackButton"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onClickOpenInAppSupport"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onClickBrowseAll"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onTryAgainClicked"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onCallTileClicked"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p7

    check-cast v8, Lp1/q;

    const v9, -0x59dbefe

    invoke-virtual {v8, v9}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v9, v10, 0x6

    const/4 v11, 0x2

    if-nez v9, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    move v9, v11

    :goto_0
    or-int/2addr v9, v10

    goto :goto_1

    :cond_1
    move v9, v10

    :goto_1
    and-int/lit8 v12, v10, 0x30

    if-nez v12, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    const/16 v12, 0x20

    goto :goto_2

    :cond_2
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v9, v12

    :cond_3
    and-int/lit16 v12, v10, 0x180

    if-nez v12, :cond_5

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x100

    goto :goto_3

    :cond_4
    const/16 v12, 0x80

    :goto_3
    or-int/2addr v9, v12

    :cond_5
    and-int/lit16 v12, v10, 0xc00

    if-nez v12, :cond_7

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x800

    goto :goto_4

    :cond_6
    const/16 v12, 0x400

    :goto_4
    or-int/2addr v9, v12

    :cond_7
    and-int/lit16 v12, v10, 0x6000

    if-nez v12, :cond_9

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x4000

    goto :goto_5

    :cond_8
    const/16 v12, 0x2000

    :goto_5
    or-int/2addr v9, v12

    :cond_9
    const/high16 v12, 0x30000

    and-int/2addr v12, v10

    if-nez v12, :cond_b

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/high16 v12, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v12, 0x10000

    :goto_6
    or-int/2addr v9, v12

    :cond_b
    const/high16 v12, 0x180000

    and-int/2addr v12, v10

    if-nez v12, :cond_d

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v12, 0x80000

    :goto_7
    or-int/2addr v9, v12

    :cond_d
    const v12, 0x92493

    and-int/2addr v12, v9

    const v13, 0x92492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v12, v13, :cond_e

    move v12, v14

    goto :goto_8

    :cond_e
    move v12, v15

    :goto_8
    and-int/lit8 v13, v9, 0x1

    invoke-virtual {v8, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_18

    instance-of v12, v1, Lal1/d$c;

    if-eqz v12, :cond_f

    const v6, 0x6ff13b88

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Lal1/d$c;

    invoke-virtual {v6}, Lal1/d$c;->a()Lxk1/e;

    move-result-object v6

    const v11, 0xfff0

    and-int/2addr v11, v9

    const/high16 v12, 0x70000

    shr-int/lit8 v9, v9, 0x3

    and-int/2addr v9, v12

    or-int/2addr v9, v11

    move-object/from16 v27, v3

    move-object v3, v2

    move-object v2, v6

    move-object v6, v5

    move-object v5, v4

    move-object/from16 v4, v27

    invoke-static/range {v2 .. v9}, Ldl1/d;->w(Lxk1/e;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_f
    instance-of v2, v1, Lal1/d$b;

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_13

    const v2, 0x6ff7eef2

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-static {v6, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_10

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_9
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v8, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    :cond_11
    invoke-static {v4, v8, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v8, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget v2, Lsz0/p0$c;->f:I

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    or-int v24, v2, v3

    const/16 v25, 0x0

    const/16 v26, 0xffc

    const/4 v13, 0x0

    move v2, v14

    const/4 v14, 0x0

    move v3, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move v4, v3

    move-object/from16 v23, v8

    invoke-static/range {v11 .. v26}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_13
    move v2, v14

    move v4, v15

    instance-of v5, v1, Lal1/d$a;

    if-eqz v5, :cond_17

    const v5, 0x6ffada94

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-static {v6, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_14

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_14
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    :cond_15
    invoke-static {v6, v8, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v12, Lsz0/p0$b;

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v3, Ltk1/a;->b:I

    const/4 v5, 0x0

    invoke-direct {v13, v3, v5, v11, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v7, Ltk1/a;->a:I

    invoke-direct {v6, v7, v5, v11, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v5, Lsz0/p0$b;->h:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int/2addr v5, v7

    shr-int/lit8 v7, v9, 0x9

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v5, v7

    sget v7, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v7, 0x9

    or-int/2addr v5, v7

    const v7, 0xe000

    shr-int/lit8 v9, v9, 0x3

    and-int/2addr v7, v9

    or-int v15, v5, v7

    const/16 v16, 0x0

    const/16 v17, 0xfe0

    const/4 v7, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v5, v2

    move-object v2, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v14, v5

    move-object v5, v6

    move-object/from16 v6, p5

    move v1, v4

    move-object v4, v0

    move v0, v14

    move-object/from16 v14, v23

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v8, v14

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_17
    move v1, v4

    const v0, -0x1529c8f5

    invoke-static {v0, v8, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_18
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_19

    new-instance v0, Lb30/u2;

    const/4 v9, 0x3

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lb30/u2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final c(Lal1/d;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p8

    invoke-static/range {v1 .. v9}, Ldl1/a;->b(Lal1/d;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
