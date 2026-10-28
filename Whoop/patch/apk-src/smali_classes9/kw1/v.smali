.class public abstract Lkw1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a;\u0010\u0008\u001a\u00020\u00042\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "content",
        "Lkotlin/Function1;",
        "Lcom/whoop/membership/extensions/domain/models/CtaAction;",
        "Ll83/a0;",
        "onCtaClicked",
        "",
        "isFromLto",
        "f",
        "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V",
        "membership_release"
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
.method public static synthetic a(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkw1/v;->j(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;ZLcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lkw1/v;->h(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkw1/v;->g(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;ZLcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkw1/v;->i(Lkotlin/jvm/functions/Function1;ZLcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkw1/v;->k(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, 0x1ecfa0b4

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v3, v4, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v2

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, p5, 0x2

    const/16 v7, 0x20

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v8, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    move v9, v7

    goto :goto_2

    :cond_5
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v5, v9

    :goto_3
    and-int/lit8 v9, p5, 0x4

    const/16 v10, 0x100

    if-eqz v9, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v4, 0x180

    if-nez v11, :cond_6

    move/from16 v11, p2

    invoke-virtual {v0, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_8

    move v12, v10

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    :goto_5
    and-int/lit16 v12, v5, 0x93

    const/16 v13, 0x92

    if-eq v12, v13, :cond_9

    const/4 v12, 0x1

    goto :goto_6

    :cond_9
    const/4 v12, 0x0

    :goto_6
    and-int/lit8 v13, v5, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_28

    if-eqz v1, :cond_a

    const/4 v3, 0x0

    :cond_a
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_b

    new-instance v6, Lkm2/e;

    const/16 v8, 0x19

    invoke-direct {v6, v8}, Lkm2/e;-><init>(I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_c
    move-object v6, v8

    :goto_7
    if-eqz v9, :cond_d

    const/4 v8, 0x0

    goto :goto_8

    :cond_d
    move v8, v11

    :goto_8
    sget-object v9, Ll0/m;->e:Ll0/h;

    sget-object v11, Lb2/e;->N:Lb2/k;

    const/16 v13, 0x36

    invoke-static {v9, v11, v0, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_e

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    :cond_f
    invoke-static {v11, v0, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getTitle()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-nez v9, :cond_11

    goto :goto_b

    :cond_11
    :goto_a
    move-object/from16 v19, v9

    goto :goto_c

    :cond_12
    :goto_b
    sget v9, Lpv1/b;->n:I

    invoke-static {v9}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    goto :goto_a

    :goto_c
    and-int/lit16 v9, v5, 0x380

    if-ne v9, v10, :cond_13

    const/4 v11, 0x1

    goto :goto_d

    :cond_13
    const/4 v11, 0x0

    :goto_d
    and-int/lit8 v12, v5, 0x70

    if-ne v12, v7, :cond_14

    const/4 v13, 0x1

    goto :goto_e

    :cond_14
    const/4 v13, 0x0

    :goto_e
    or-int/2addr v11, v13

    and-int/lit8 v5, v5, 0xe

    if-ne v5, v2, :cond_15

    const/4 v13, 0x1

    goto :goto_f

    :cond_15
    const/4 v13, 0x0

    :goto_f
    or-int/2addr v11, v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_16

    if-ne v13, v1, :cond_17

    :cond_16
    new-instance v13, Lkw1/u;

    invoke-direct {v13, v8, v6, v3}, Lkw1/u;-><init>(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/extensions/domain/models/ProgressContent;)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v22, v13

    check-cast v22, Lc93/a;

    new-instance v18, Lsz0/p0$h;

    const-wide/16 v20, 0x0

    const/16 v23, 0x2

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v24}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v3, :cond_18

    invoke-virtual {v3}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getSubtitle()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_18

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    if-nez v11, :cond_19

    :cond_18
    sget v11, Lpv1/b;->m:I

    invoke-static {v11}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    :cond_19
    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getPrimaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object v13

    if-eqz v13, :cond_1a

    invoke-virtual {v13}, Lcom/whoop/membership/extensions/domain/models/Cta;->getTitle()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_1a

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    if-nez v13, :cond_1b

    :cond_1a
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    :cond_1b
    if-ne v12, v7, :cond_1c

    const/4 v14, 0x1

    goto :goto_10

    :cond_1c
    const/4 v14, 0x0

    :goto_10
    if-ne v9, v10, :cond_1d

    const/4 v9, 0x1

    goto :goto_11

    :cond_1d
    const/4 v9, 0x0

    :goto_11
    or-int/2addr v9, v14

    if-ne v5, v2, :cond_1e

    const/4 v10, 0x1

    goto :goto_12

    :cond_1e
    const/4 v10, 0x0

    :goto_12
    or-int/2addr v9, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_1f

    if-ne v10, v1, :cond_20

    :cond_1f
    new-instance v10, Lkw1/u;

    invoke-direct {v10, v6, v8, v3}, Lkw1/u;-><init>(Lkotlin/jvm/functions/Function1;ZLcom/whoop/membership/extensions/domain/models/ProgressContent;)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object v9, v10

    check-cast v9, Lc93/a;

    if-eqz v3, :cond_21

    invoke-virtual {v3}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getSecondaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object v10

    if-eqz v10, :cond_21

    invoke-virtual {v10}, Lcom/whoop/membership/extensions/domain/models/Cta;->getTitle()Ljava/lang/String;

    move-result-object v10

    goto :goto_13

    :cond_21
    const/4 v10, 0x0

    :goto_13
    invoke-static {v10}, Lor2/o1;->d(Ljava/lang/String;)Z

    move-result v10

    if-eqz v3, :cond_22

    invoke-virtual {v3}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getSecondaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object v14

    if-eqz v14, :cond_22

    invoke-virtual {v14}, Lcom/whoop/membership/extensions/domain/models/Cta;->getTitle()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_22

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    if-nez v14, :cond_23

    :cond_22
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    :cond_23
    if-ne v5, v2, :cond_24

    const/4 v2, 0x1

    goto :goto_14

    :cond_24
    const/4 v2, 0x0

    :goto_14
    if-ne v12, v7, :cond_25

    const/16 v16, 0x1

    goto :goto_15

    :cond_25
    const/16 v16, 0x0

    :goto_15
    or-int v2, v2, v16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_26

    if-ne v5, v1, :cond_27

    :cond_26
    new-instance v5, Lkw1/k;

    const/4 v1, 0x6

    invoke-direct {v5, v3, v6, v1}, Lkw1/k;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v5, Lc93/a;

    sget v1, Lsz0/p0$h;->h:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v2, 0x3

    or-int/2addr v1, v7

    shl-int/lit8 v7, v2, 0x9

    or-int/2addr v1, v7

    shl-int/lit8 v2, v2, 0x15

    or-int/2addr v1, v2

    const/16 v19, 0x0

    const/16 v20, 0xe44

    const/4 v7, 0x0

    move-object v2, v6

    move-object v6, v11

    const/4 v11, 0x0

    move-object v12, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v0

    move v0, v8

    move-object v8, v13

    move-object v13, v5

    move-object/from16 v5, v18

    move/from16 v18, v1

    const/4 v1, 0x1

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v17

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    move-object v1, v3

    move v3, v0

    goto :goto_16

    :cond_28
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, v3

    move-object v2, v8

    move v3, v11

    :goto_16
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_29

    new-instance v0, Lbg0/h;

    const/16 v6, 0x10

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final g(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/whoop/membership/extensions/domain/models/CtaAction;->GO_HOME:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    sget-object p0, Lcom/whoop/membership/extensions/domain/models/CtaAction;->DISMISS_TO_ROOT:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getAutoDismissAction()Lcom/whoop/membership/extensions/domain/models/CtaAction;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;ZLcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;->GO_HOME:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getPrimaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/Cta;->getAction()Lcom/whoop/membership/extensions/domain/models/CtaAction;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    sget-object p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;->UNKNOWN:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    :cond_2
    :goto_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getSecondaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/membership/extensions/domain/models/Cta;->getAction()Lcom/whoop/membership/extensions/domain/models/CtaAction;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lkw1/v;->f(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
