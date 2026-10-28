.class public abstract Lkw1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a1\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "content",
        "Lkotlin/Function1;",
        "Lcom/whoop/membership/extensions/domain/models/CtaAction;",
        "Ll83/a0;",
        "onCtaClicked",
        "e",
        "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkw1/m;->f(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lkw1/m;->g(Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkw1/m;->h(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkw1/m;->i(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, -0x1c49163c

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    const/16 v5, 0x20

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v5

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :goto_3
    and-int/lit8 v7, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_6

    move v7, v10

    goto :goto_4

    :cond_6
    move v7, v9

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v12, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1e

    const/4 v7, 0x0

    if-eqz v0, :cond_7

    move-object v0, v7

    goto :goto_5

    :cond_7
    move-object v0, v2

    :goto_5
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_8

    new-instance v4, Lkm2/e;

    const/16 v6, 0x14

    invoke-direct {v4, v6}, Lkm2/e;-><init>(I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v4, v6

    :goto_6
    sget-object v6, Ll0/m;->e:Ll0/h;

    sget-object v8, Lb2/e;->N:Lb2/k;

    const/16 v11, 0x36

    invoke-static {v6, v8, v12, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    :cond_b
    invoke-static {v8, v12, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getTitle()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_e

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-nez v6, :cond_d

    goto :goto_9

    :cond_d
    :goto_8
    move-object v14, v6

    goto :goto_a

    :cond_e
    :goto_9
    sget v6, Lpv1/b;->h:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    goto :goto_8

    :goto_a
    new-instance v13, Lsz0/p0$b;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x6

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v18}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getSubtitle()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_f

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-nez v6, :cond_10

    :cond_f
    sget v6, Lpv1/b;->g:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    :cond_10
    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getPrimaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object v8

    if-eqz v8, :cond_11

    invoke-virtual {v8}, Lcom/whoop/membership/extensions/domain/models/Cta;->getTitle()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_11

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_12

    :cond_11
    sget v8, Lpv1/b;->f:I

    invoke-static {v8}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    :cond_12
    and-int/lit8 v11, v3, 0x70

    if-ne v11, v5, :cond_13

    move v14, v10

    goto :goto_b

    :cond_13
    move v14, v9

    :goto_b
    and-int/lit8 v3, v3, 0xe

    if-ne v3, v1, :cond_14

    move v15, v10

    goto :goto_c

    :cond_14
    move v15, v9

    :goto_c
    or-int/2addr v14, v15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_15

    if-ne v15, v2, :cond_16

    :cond_15
    new-instance v15, Lkw1/k;

    const/4 v14, 0x0

    invoke-direct {v15, v4, v0, v14}, Lkw1/k;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/extensions/domain/models/ProgressContent;I)V

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v15, Lc93/a;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getSecondaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object v14

    if-eqz v14, :cond_17

    invoke-virtual {v14}, Lcom/whoop/membership/extensions/domain/models/Cta;->getTitle()Ljava/lang/String;

    move-result-object v7

    :cond_17
    invoke-static {v7}, Lor2/o1;->d(Ljava/lang/String;)Z

    move-result v7

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getSecondaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object v14

    if-eqz v14, :cond_18

    invoke-virtual {v14}, Lcom/whoop/membership/extensions/domain/models/Cta;->getTitle()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_18

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    if-nez v14, :cond_19

    :cond_18
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    :cond_19
    if-ne v3, v1, :cond_1a

    move v1, v10

    goto :goto_d

    :cond_1a
    move v1, v9

    :goto_d
    if-ne v11, v5, :cond_1b

    move v9, v10

    :cond_1b
    or-int/2addr v1, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1c

    if-ne v3, v2, :cond_1d

    :cond_1c
    new-instance v3, Lkw1/k;

    const/4 v1, 0x1

    invoke-direct {v3, v0, v4, v1}, Lkw1/k;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v3, Lc93/a;

    sget v1, Lsz0/p0$b;->h:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v2, 0x3

    or-int/2addr v1, v5

    shl-int/lit8 v5, v2, 0x9

    or-int/2addr v1, v5

    shl-int/lit8 v2, v2, 0x15

    or-int/2addr v1, v2

    move v5, v7

    move-object v7, v14

    const/4 v14, 0x0

    move-object v2, v4

    move-object v4, v15

    const/16 v15, 0xe44

    move-object v9, v2

    const/4 v2, 0x0

    move-object v11, v0

    move-object v0, v13

    move v13, v1

    move-object v1, v6

    const/4 v6, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v19, v8

    move-object v8, v3

    move-object/from16 v3, v19

    invoke-static/range {v0 .. v15}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v16

    move-object/from16 v2, v18

    goto :goto_e

    :cond_1e
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v6

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1f

    new-instance v1, Lkw1/l;

    const/4 v6, 0x0

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-direct/range {v1 .. v6}, Lkw1/l;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;III)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final f(Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lcom/whoop/membership/extensions/domain/models/ProgressContent;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getPrimaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/membership/extensions/domain/models/Cta;->getAction()Lcom/whoop/membership/extensions/domain/models/CtaAction;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lcom/whoop/membership/extensions/domain/models/CtaAction;->RETRY:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    :cond_1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;)Ll83/a0;
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

.method private static final i(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lkw1/m;->e(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
