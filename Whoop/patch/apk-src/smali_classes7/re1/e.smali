.class public abstract Lre1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001ae\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Loe1/e;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onTryAgainClicked",
        "Lkotlin/Function1;",
        "",
        "scrollDepthAnalyticsEvent",
        "Lne1/a;",
        "onNavigationEvent",
        "podcastAnalyticsEvent",
        "",
        "isArticleTileMediaCardEnabled",
        "b",
        "(Loe1/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V",
        "education_release"
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
.method public static synthetic a(Loe1/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lre1/e;->c(Loe1/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Loe1/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loe1/e;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v7, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    move-object/from16 v8, p4

    move/from16 v1, p7

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTryAgainClicked"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollDepthAnalyticsEvent"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "podcastAnalyticsEvent"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v2, -0x3bb4fd5d

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v2, v5

    :cond_5
    and-int/lit16 v5, v1, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v0, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v2, v5

    :cond_7
    and-int/lit16 v5, v1, 0x6000

    if-nez v5, :cond_9

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v2, v5

    :cond_9
    and-int/lit8 v5, p8, 0x20

    const/high16 v6, 0x30000

    if-eqz v5, :cond_b

    or-int/2addr v2, v6

    :cond_a
    move/from16 v6, p5

    goto :goto_7

    :cond_b
    and-int/2addr v6, v1

    if-nez v6, :cond_a

    move/from16 v6, p5

    invoke-virtual {v0, v6}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_c

    const/high16 v9, 0x20000

    goto :goto_6

    :cond_c
    const/high16 v9, 0x10000

    :goto_6
    or-int/2addr v2, v9

    :goto_7
    const v9, 0x12493

    and-int/2addr v9, v2

    const v10, 0x12492

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v9, v10, :cond_d

    move v9, v11

    goto :goto_8

    :cond_d
    move v9, v12

    :goto_8
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_18

    if-eqz v5, :cond_e

    move/from16 v16, v12

    goto :goto_9

    :cond_e
    move/from16 v16, v6

    :goto_9
    instance-of v5, v4, Loe1/e$c;

    if-eqz v5, :cond_f

    const v3, -0x2af28cd9

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    move-object v3, v4

    check-cast v3, Loe1/e$c;

    invoke-virtual {v3}, Loe1/e$c;->c()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v3}, Loe1/e$c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v3}, Loe1/e$c;->a()Lcom/whoop/educationModels/MediaHeader;

    move-result-object v10

    invoke-virtual {v3}, Loe1/e$c;->d()Lcom/whoop/educationModels/StickyButton;

    move-result-object v11

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    sget v5, Lcom/whoop/educationModels/MediaHeader;->$stable:I

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v3, v5

    sget v5, Lcom/whoop/educationModels/StickyButton;->$stable:I

    shl-int/lit8 v5, v5, 0x9

    or-int/2addr v3, v5

    shl-int/lit8 v2, v2, 0x9

    const/high16 v5, 0x70000

    and-int/2addr v5, v2

    or-int/2addr v3, v5

    const/high16 v5, 0x380000

    and-int/2addr v5, v2

    or-int/2addr v3, v5

    const/high16 v5, 0x1c00000

    and-int/2addr v5, v2

    or-int/2addr v3, v5

    const/high16 v5, 0xe000000

    and-int/2addr v2, v5

    or-int v18, v3, v2

    const/16 v19, 0x10

    move v2, v12

    const/4 v12, 0x0

    move-object/from16 v15, p4

    move-object/from16 v17, v0

    move v0, v2

    invoke-static/range {v8 .. v19}, Lre1/j;->P(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;Lue1/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move/from16 v21, v16

    move-object/from16 v5, v17

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_f
    move-object v5, v0

    move v0, v12

    move/from16 v21, v16

    instance-of v6, v4, Loe1/e$a;

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_13

    const v6, -0x2ae9d973

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    const-string v6, "EducationErrorScreen"

    invoke-static {v8, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v9, v5, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_10

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v5, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v5, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-nez v10, :cond_11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    :cond_11
    invoke-static {v9, v5, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v5, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v12, Lsz0/p0$b;

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lie1/c;->d:I

    const/4 v8, 0x0

    invoke-direct {v13, v6, v8, v3, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lie1/c;->b:I

    invoke-direct {v9, v10, v8, v3, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lsz0/p0$b;->h:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int/2addr v3, v8

    shl-int/lit8 v8, v2, 0x3

    and-int/lit16 v8, v8, 0x380

    or-int/2addr v3, v8

    sget v8, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v8, v8, 0x9

    or-int/2addr v3, v8

    const v8, 0xe000

    shl-int/lit8 v2, v2, 0x9

    and-int/2addr v2, v8

    or-int v18, v3, v2

    const/16 v19, 0x0

    const/16 v20, 0xfe0

    const/4 v10, 0x0

    move v2, v11

    const/4 v11, 0x0

    move-object/from16 v17, v5

    move-object v5, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v8, v9

    move-object/from16 v9, p1

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v17

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_13
    move v2, v11

    instance-of v3, v4, Loe1/e$b;

    if-eqz v3, :cond_17

    const v3, -0x2ae1c0ee

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget-object v3, Ll0/m;->e:Ll0/h;

    sget-object v6, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x36

    invoke-static {v3, v6, v5, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_14

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_14
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_b
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v5, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-nez v7, :cond_15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    :cond_15
    invoke-static {v6, v5, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v17, v5

    sget-object v5, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v3, Lsz0/p0$c;->f:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int v18, v3, v7

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v17

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_c
    move/from16 v9, v21

    goto :goto_d

    :cond_17
    const v1, -0x226aef72

    invoke-static {v1, v5, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_18
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move v9, v6

    :goto_d
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_19

    new-instance v0, Lb30/i2;

    const/16 v3, 0x11

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move/from16 v2, p8

    invoke-direct/range {v0 .. v9}, Lb30/i2;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final c(Loe1/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lre1/e;->b(Loe1/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
