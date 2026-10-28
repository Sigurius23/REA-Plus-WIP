.class public abstract Lyq2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "",
        "recoveryLevel",
        "",
        "isFoundingMember",
        "isWhoopPro",
        "levelNumber",
        "Ll83/a0;",
        "c",
        "(Ljava/lang/String;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "Lkd1/o;",
        "imageSource",
        "",
        "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
        "text",
        "e",
        "(Lkd1/o;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ljava/lang/String;ZZLjava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lyq2/a;->d(Ljava/lang/String;ZZLjava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkd1/o;Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyq2/a;->f(Lkd1/o;Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/lang/String;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v1, p0

    move/from16 v7, p1

    move/from16 v8, p2

    move-object/from16 v9, p3

    move/from16 v10, p5

    const-string v0, "recoveryLevel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "levelNumber"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x241e26ee

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v3, v10, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v11, v7}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v10, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v11, v8}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    and-int/lit16 v3, v10, 0xc00

    if-nez v3, :cond_7

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    and-int/lit16 v3, v0, 0x493

    const/16 v4, 0x492

    const/4 v12, 0x1

    if-eq v3, v4, :cond_8

    move v3, v12

    goto :goto_5

    :cond_8
    const/4 v3, 0x0

    :goto_5
    and-int/2addr v0, v12

    invoke-virtual {v11, v0, v3}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object v0, Ll0/m;->a:Ll0/e;

    int-to-float v14, v12

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr v0, v14

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v0, v3}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v18, 0x0

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v19, v0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v5, 0xa

    int-to-float v5, v5

    int-to-float v15, v2

    mul-float/2addr v5, v15

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0x36

    invoke-static {v3, v4, v11, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v11, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v11, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v3, v11, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lkd1/o$c;

    const/16 v5, 0xe

    move-object v2, v6

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object v13, v4

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    sget v2, Lyp2/c;->n:I

    invoke-static {v11, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v12}, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;-><init>(Ljava/lang/String;Z)V

    new-instance v2, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    const/4 v3, 0x0

    invoke-direct {v2, v9, v3}, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;-><init>(Ljava/lang/String;Z)V

    filled-new-array {v1, v2}, [Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget v2, Lkd1/o$c;->f:I

    invoke-static {v0, v1, v11, v2}, Lyq2/a;->e(Lkd1/o;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v0, 0x4023000000000000L    # 9.5

    if-eqz v7, :cond_c

    const v2, 0x104ece2e

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->X0()J

    move-result-wide v4

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    double-to-float v6, v0

    mul-float/2addr v6, v15

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v17, 0x6

    const/16 v18, 0xc

    move v6, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v21, v11

    move-object v11, v2

    move/from16 v2, v16

    move-object/from16 v16, v21

    move-wide/from16 v21, v4

    move v4, v3

    move v3, v12

    move-object v5, v13

    move-wide/from16 v12, v21

    invoke-static/range {v11 .. v18}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v16

    new-instance v12, Lkd1/o$a;

    sget v13, Lyp2/a;->a:I

    invoke-direct {v12, v13}, Lkd1/o$a;-><init>(I)V

    new-instance v13, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    sget v14, Lyp2/c;->k:I

    invoke-static {v11, v14}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14, v3}, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;-><init>(Ljava/lang/String;Z)V

    new-instance v14, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    sget v15, Lyp2/c;->o:I

    invoke-static {v11, v15}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v15

    invoke-direct {v14, v15, v4}, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;-><init>(Ljava/lang/String;Z)V

    filled-new-array {v13, v14}, [Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    move-result-object v13

    invoke-static {v13}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    sget v14, Lkd1/o$a;->c:I

    invoke-static {v12, v13, v11, v14}, Lyq2/a;->e(Lkd1/o;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    move v4, v3

    move v3, v12

    move-object v5, v13

    move v6, v14

    move v2, v15

    const v12, 0x1056edd8

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    :goto_7
    if-eqz v8, :cond_d

    const v12, 0x1057905a

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v11, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->X0()J

    move-result-wide v12

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    double-to-float v0, v0

    mul-float/2addr v0, v2

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v17, 0x6

    const/16 v18, 0xc

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v11

    move-object v11, v0

    invoke-static/range {v11 .. v18}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v16

    new-instance v0, Lkd1/o$a;

    sget v1, Lyp2/a;->e:I

    invoke-direct {v0, v1}, Lkd1/o$a;-><init>(I)V

    new-instance v1, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    sget v2, Lyp2/c;->B:I

    invoke-static {v11, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;-><init>(Ljava/lang/String;Z)V

    new-instance v2, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    sget v5, Lyp2/c;->r:I

    invoke-static {v11, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5, v4}, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;-><init>(Ljava/lang/String;Z)V

    filled-new-array {v1, v2}, [Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget v2, Lkd1/o$a;->c:I

    invoke-static {v0, v1, v11, v2}, Lyq2/a;->e(Lkd1/o;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const v0, 0x105f82f8

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_f

    new-instance v0, Lg40/s0;

    const/4 v6, 0x2

    move-object/from16 v1, p0

    move v2, v7

    move v3, v8

    move-object v4, v9

    move v5, v10

    invoke-direct/range {v0 .. v6}, Lg40/s0;-><init>(Ljava/lang/Object;ZZLjava/lang/Object;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final d(Ljava/lang/String;ZZLjava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lyq2/a;->c(Ljava/lang/String;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lkd1/o;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/o;",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v7, p3

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v1, -0x3c2aa1d8

    invoke-virtual {v15, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, v7, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v7

    goto :goto_2

    :cond_2
    move v1, v7

    :goto_2
    and-int/lit8 v2, v7, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v2, v8, :cond_5

    move v2, v9

    goto :goto_4

    :cond_5
    move v2, v10

    :goto_4
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {v15, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    int-to-float v2, v9

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    const/16 v4, 0x36

    invoke-static {v2, v3, v15, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v15, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v15, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v15, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v15, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v15, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v3, v15, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v15, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lkd1/o;->a:I

    and-int/lit8 v1, v1, 0xe

    or-int v4, v3, v1

    const/4 v5, 0x3

    const/4 v1, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    move-object/from16 v36, v15

    move-object v15, v3

    move-object/from16 v3, v36

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    sget v2, Lyp2/c;->p:I

    invoke-static {v3, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/16 v16, 0x0

    const/16 v17, 0x7c

    move v4, v10

    const/4 v10, 0x0

    move-object v5, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object v9, v2

    move v0, v4

    move-object/from16 v35, v5

    move-object v5, v8

    move-object v4, v15

    move-object/from16 v2, v19

    const/16 v34, 0x12

    move-object v8, v1

    move-object v15, v3

    move-object/from16 v1, v18

    move-object/from16 v3, v20

    invoke-static/range {v8 .. v17}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v15, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v15, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    move-object/from16 v11, v35

    invoke-static {v15, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v15, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v15, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    invoke-static {v9, v15, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v15, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x74a56b94

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    move-object v1, v6

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;->getText()Ljava/lang/String;

    move-result-object v8

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v15, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v28

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/HighlightedText;->getHighlighted()Z

    move-result v2

    if-eqz v2, :cond_c

    const v2, 0x8400935

    invoke-static {v15, v2, v3, v15, v4}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v2

    :goto_8
    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move-wide v10, v2

    goto :goto_9

    :cond_c
    const v2, 0x8400d72

    invoke-static {v15, v2, v3, v15, v4}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v2

    goto :goto_8

    :goto_9
    sget v2, Lb91/a;->d:I

    shl-int/lit8 v32, v2, 0x12

    const v33, 0x2fffa

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move-object v3, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v30, v3

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v30

    goto :goto_7

    :cond_d
    move-object v3, v15

    const/4 v2, 0x1

    invoke-static {v3, v0, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_a

    :cond_e
    move-object v3, v15

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Lyf1/e;

    const/4 v2, 0x6

    move-object/from16 v3, p0

    invoke-direct {v1, v3, v6, v7, v2}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final f(Lkd1/o;Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyq2/a;->e(Lkd1/o;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
