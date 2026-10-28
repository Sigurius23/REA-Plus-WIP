.class public abstract Li21/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aq\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Li2/x;",
        "titleColor",
        "subTitle",
        "subTitleColor",
        "primaryButtonText",
        "Ly11/r;",
        "horizontalImpactBarViewState",
        "Lt71/g$b;",
        "impactCardType",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ly11/r;Lt71/g$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Li21/t;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li21/t;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ly11/r;Lt71/g$b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p14}, Li21/t;->k(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ly11/r;Lt71/g$b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly11/r;Lcom/whoop/design/util/TextResource;JLt71/g$b;Lcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Li21/t;->h(Ly11/r;Lcom/whoop/design/util/TextResource;JLt71/g$b;Lcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li21/t;->i(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ly11/r;Lt71/g$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "J",
            "Lcom/whoop/design/util/TextResource;",
            "J",
            "Lcom/whoop/design/util/TextResource;",
            "Ly11/r;",
            "Lt71/g$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v9, p8

    move-object/from16 v5, p9

    move/from16 v12, p12

    move/from16 v13, p13

    const-string v0, "horizontalImpactBarViewState"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactCardType"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p11

    check-cast v11, Lp1/q;

    const v0, 0x22076b11

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v13, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v12, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v12, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v12

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v12

    :goto_1
    and-int/lit8 v3, v12, 0x30

    if-nez v3, :cond_5

    and-int/lit8 v3, v13, 0x2

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v3, p1

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    goto :goto_3

    :cond_5
    move-object/from16 v3, p1

    :goto_3
    and-int/lit16 v4, v12, 0x180

    if-nez v4, :cond_7

    and-int/lit8 v4, v13, 0x4

    move-wide/from16 v6, p2

    if-nez v4, :cond_6

    invoke-virtual {v11, v6, v7}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x100

    goto :goto_4

    :cond_6
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v2, v4

    goto :goto_5

    :cond_7
    move-wide/from16 v6, p2

    :goto_5
    and-int/lit16 v4, v12, 0xc00

    if-nez v4, :cond_a

    and-int/lit8 v4, v13, 0x8

    if-nez v4, :cond_8

    move-object/from16 v4, p4

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_6

    :cond_8
    move-object/from16 v4, p4

    :cond_9
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v2, v8

    goto :goto_7

    :cond_a
    move-object/from16 v4, p4

    :goto_7
    and-int/lit16 v8, v12, 0x6000

    if-nez v8, :cond_c

    and-int/lit8 v8, v13, 0x10

    move-wide/from16 v14, p5

    if-nez v8, :cond_b

    invoke-virtual {v11, v14, v15}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x4000

    goto :goto_8

    :cond_b
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v2, v8

    goto :goto_9

    :cond_c
    move-wide/from16 v14, p5

    :goto_9
    const/high16 v8, 0x30000

    and-int/2addr v8, v12

    if-nez v8, :cond_f

    and-int/lit8 v8, v13, 0x20

    if-nez v8, :cond_d

    move-object/from16 v8, p7

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_d
    move-object/from16 v8, p7

    :cond_e
    const/high16 v10, 0x10000

    :goto_a
    or-int/2addr v2, v10

    goto :goto_b

    :cond_f
    move-object/from16 v8, p7

    :goto_b
    const/high16 v10, 0x180000

    and-int/2addr v10, v12

    if-nez v10, :cond_11

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    const/high16 v10, 0x100000

    goto :goto_c

    :cond_10
    const/high16 v10, 0x80000

    :goto_c
    or-int/2addr v2, v10

    :cond_11
    const/high16 v10, 0xc00000

    and-int/2addr v10, v12

    if-nez v10, :cond_13

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_12

    const/high16 v10, 0x800000

    goto :goto_d

    :cond_12
    const/high16 v10, 0x400000

    :goto_d
    or-int/2addr v2, v10

    :cond_13
    and-int/lit16 v10, v13, 0x100

    const/high16 v16, 0x6000000

    if-eqz v10, :cond_14

    or-int v2, v2, v16

    move/from16 p11, v0

    move-object/from16 v0, p10

    goto :goto_f

    :cond_14
    and-int v16, v12, v16

    move/from16 p11, v0

    move-object/from16 v0, p10

    if-nez v16, :cond_16

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_15

    const/high16 v16, 0x4000000

    goto :goto_e

    :cond_15
    const/high16 v16, 0x2000000

    :goto_e
    or-int v2, v2, v16

    :cond_16
    :goto_f
    const v16, 0x2492493

    and-int v0, v2, v16

    const v1, 0x2492492

    move/from16 v16, v2

    if-eq v0, v1, :cond_17

    const/4 v0, 0x1

    goto :goto_10

    :cond_17
    const/4 v0, 0x0

    :goto_10
    and-int/lit8 v1, v16, 0x1

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v0, v12, 0x1

    const v17, -0xe001

    const v18, -0x70001

    const/4 v1, 0x6

    if-eqz v0, :cond_1e

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_13

    :cond_18
    invoke-virtual {v11}, Lp1/q;->X()V

    and-int/lit8 v0, v13, 0x2

    if-eqz v0, :cond_19

    and-int/lit8 v0, v16, -0x71

    goto :goto_11

    :cond_19
    move/from16 v0, v16

    :goto_11
    and-int/lit8 v10, v13, 0x4

    if-eqz v10, :cond_1a

    and-int/lit16 v0, v0, -0x381

    :cond_1a
    and-int/lit8 v10, v13, 0x8

    if-eqz v10, :cond_1b

    and-int/lit16 v0, v0, -0x1c01

    :cond_1b
    and-int/lit8 v10, v13, 0x10

    if-eqz v10, :cond_1c

    and-int v0, v0, v17

    :cond_1c
    and-int/lit8 v10, v13, 0x20

    if-eqz v10, :cond_1d

    and-int v0, v0, v18

    :cond_1d
    move-object/from16 v9, p10

    move-object v2, v3

    move-object v10, v8

    move-wide/from16 v27, v14

    move-object/from16 v14, p0

    move v15, v0

    :goto_12
    move-wide/from16 v29, v6

    move-object v6, v4

    move-wide/from16 v3, v29

    move-wide/from16 v7, v27

    goto/16 :goto_16

    :cond_1e
    :goto_13
    if-eqz p11, :cond_1f

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_14

    :cond_1f
    move-object/from16 v0, p0

    :goto_14
    and-int/lit8 v19, v13, 0x2

    if-eqz v19, :cond_20

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    and-int/lit8 v16, v16, -0x71

    :cond_20
    move/from16 v2, v16

    and-int/lit8 v16, v13, 0x4

    if-eqz v16, :cond_21

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    and-int/lit16 v2, v2, -0x381

    :cond_21
    and-int/lit8 v16, v13, 0x8

    if-eqz v16, :cond_22

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    and-int/lit16 v2, v2, -0x1c01

    :cond_22
    and-int/lit8 v16, v13, 0x10

    if-eqz v16, :cond_23

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->b1()J

    move-result-wide v14

    and-int v2, v2, v17

    :cond_23
    and-int/lit8 v16, v13, 0x20

    if-eqz v16, :cond_24

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    and-int v2, v2, v18

    :cond_24
    if-eqz v10, :cond_26

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v10, v1, :cond_25

    new-instance v10, Lhu1/g;

    const/16 v1, 0x14

    invoke-direct {v10, v1}, Lhu1/g;-><init>(I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object v1, v10

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v9, v1

    :goto_15
    move-object v10, v8

    move-wide/from16 v27, v14

    move-object v14, v0

    move v15, v2

    move-object v2, v3

    goto :goto_12

    :cond_26
    move-object/from16 v9, p10

    goto :goto_15

    :goto_16
    invoke-virtual {v11}, Lp1/q;->r()V

    sget-object v0, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v0}, Lkd1/w;->a()Lk91/a;

    move-result-object v0

    invoke-virtual {v0}, Lk91/a;->c()Lt0/i;

    move-result-object v17

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a1()J

    move-result-wide v18

    const/4 v0, 0x0

    int-to-float v0, v0

    move v1, v0

    new-instance v0, Li21/p;

    move/from16 v16, v1

    move-object/from16 v1, p8

    invoke-direct/range {v0 .. v10}, Li21/p;-><init>(Ly11/r;Lcom/whoop/design/util/TextResource;JLt71/g$b;Lcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;)V

    move-object v1, v0

    move-object v0, v2

    move-wide/from16 v20, v3

    move-object/from16 v22, v6

    move-wide/from16 v23, v7

    move-object/from16 v26, v9

    move-object/from16 v25, v10

    const v2, 0x7c7ada8a

    invoke-static {v2, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    and-int/lit8 v1, v15, 0xe

    const/high16 v2, 0x1b0000

    or-int v9, v1, v2

    const/16 v10, 0x18

    const/4 v5, 0x0

    move-object v8, v11

    move-object v1, v14

    move/from16 v6, v16

    move-object/from16 v2, v17

    move-wide/from16 v3, v18

    invoke-static/range {v1 .. v10}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v1

    move-object v1, v8

    move-object v3, v0

    move-object/from16 v5, v22

    move-wide/from16 v6, v23

    move-object/from16 v8, v25

    move-object/from16 v11, v26

    goto :goto_17

    :cond_27
    move-object v1, v11

    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v2, p0

    move-object/from16 v11, p10

    move-object v5, v4

    move-wide/from16 v20, v6

    move-wide v6, v14

    :goto_17
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_28

    new-instance v0, Li21/q;

    const/4 v14, 0x1

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object v1, v2

    move-object v2, v3

    move-wide/from16 v3, v20

    invoke-direct/range {v0 .. v14}, Li21/q;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ly11/r;Lcom/whoop/design/util/TextResource;JLt71/g$b;Lcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 40

    and-int/lit8 v1, p11, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v5, p11, 0x1

    move-object/from16 v6, p10

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_12

    sget-object v1, Lb2/e;->M:Lb2/k;

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v4, v4

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v10, v4, v9

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, Ll0/m;->c:Ll0/g;

    const/16 v12, 0x30

    invoke-static {v11, v1, v6, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v6, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v6, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v15, v6, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v6, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v6, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v12, v6, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v6, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x36

    invoke-static {v8, v12, v6, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move/from16 v16, v9

    move/from16 p11, v10

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_4

    invoke-virtual {v6, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v6, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v9, v6, v9, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v6, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, p1

    const/4 v5, 0x0

    invoke-static {v3, v6, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v5, v6, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->r()Lb91/a;

    move-result-object v26

    const/16 v30, 0x0

    const v31, 0x2fffa

    move-object v9, v7

    const/4 v7, 0x0

    move-object/from16 v17, v11

    const-wide/16 v10, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    move/from16 v21, v16

    const-wide/16 v15, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move-object/from16 v24, v18

    const/16 v18, 0x0

    move-object/from16 v27, v19

    move-object/from16 v25, v20

    const-wide/16 v19, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v29, v22

    const/16 v22, 0x0

    move-object/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v24

    const/16 v24, 0x0

    move-object/from16 v34, v25

    const/16 v25, 0x0

    move-object/from16 v35, v27

    const/16 v27, 0x0

    move-object/from16 v36, v29

    const/16 v29, 0x0

    move/from16 p1, v28

    move-object/from16 v0, v32

    move/from16 v32, p11

    move-object/from16 p11, v1

    move-object/from16 v28, v6

    move-object/from16 v1, v35

    move-object/from16 v35, v2

    move-object v6, v3

    move-object v2, v9

    move-object/from16 v3, v34

    move-wide/from16 v8, p2

    move-object/from16 v34, v5

    move-object/from16 v5, v33

    move/from16 v33, v4

    move-object/from16 v4, v36

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    sget-object v7, Ll0/m;->b:Ll0/e;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v8, 0x36

    invoke-static {v7, v5, v6, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v6, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v6, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v7, v35

    goto :goto_6

    :cond_9
    :goto_5
    invoke-static {v8, v6, v8, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v6, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p4 .. p4}, Lt71/g$b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v6, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p4 .. p4}, Lt71/g$b;->c()Ly81/f;

    move-result-object v10

    invoke-virtual {v10, v6, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    move-object/from16 v9, v34

    const/4 v12, 0x6

    invoke-virtual {v9, v6, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->A()Lb91/a;

    move-result-object v26

    const/16 v30, 0x0

    const v31, 0x2fffa

    move-object/from16 v35, v7

    const/4 v7, 0x0

    move-object/from16 v28, v6

    move-object v6, v8

    move-wide v8, v10

    const-wide/16 v10, 0x0

    move/from16 v37, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v36, v5

    move-object/from16 v5, v34

    move-object/from16 v34, v1

    move/from16 v1, v37

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    sget v7, Lgy0/f;->F1:I

    const/4 v9, 0x0

    invoke-static {v7, v6, v9}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p4 .. p4}, Lt71/g$b;->c()Ly81/f;

    move-result-object v8

    invoke-virtual {v8, v6, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-virtual {v5, v6, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->C()Lb91/a;

    move-result-object v26

    move-object v6, v7

    const/4 v7, 0x0

    move-wide v8, v10

    const-wide/16 v10, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v7}, Lp1/q;->q(Z)V

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v9, p0

    invoke-static {v8, v9, v6, v10, v7}, Ly11/n;->f(Landroidx/compose/ui/Modifier;Ly11/r;Landroidx/compose/runtime/Composer;II)V

    invoke-static/range {v32 .. v32}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v14, 0x0

    const/16 v15, 0xd

    const/4 v11, 0x0

    const/4 v13, 0x0

    move/from16 v12, v32

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v9, p11

    const/16 v10, 0x36

    invoke-static {v7, v9, v6, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_a

    invoke-virtual {v6, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_b

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    :cond_b
    move-object/from16 v7, v34

    goto :goto_9

    :cond_c
    move-object/from16 v7, v34

    :goto_8
    move-object/from16 v9, v35

    goto :goto_a

    :goto_9
    invoke-static {v9, v6, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v6, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v34, v7

    sget-object v7, Lhy0/g;->DOTTED:Lhy0/g;

    const/16 v17, 0x30

    const/16 v18, 0xfd

    move-object/from16 v28, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v35, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v28

    move-object/from16 v38, v34

    move-object/from16 v39, v35

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v6, p5

    move-object/from16 v7, v16

    const/4 v9, 0x0

    invoke-static {v6, v7, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v7, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    const/16 v30, 0x0

    const v31, 0x2fffa

    move-object/from16 v28, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-wide/from16 v8, p6

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    const/4 v7, 0x1

    int-to-float v8, v7

    mul-float v8, v8, p1

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v9

    mul-float v7, v7, p1

    invoke-static {v2, v7, v8}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v8, p8

    invoke-virtual {v6, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_d

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v10, v9, :cond_e

    :cond_d
    new-instance v10, Lgz/a;

    const/16 v9, 0x14

    invoke-direct {v10, v8, v9}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v10, Lc93/a;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 p0, v7

    move/from16 p5, v8

    move/from16 p1, v9

    move-object/from16 p4, v10

    move-object/from16 p2, v11

    move-object/from16 p3, v12

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x4

    int-to-float v8, v8

    move/from16 v9, v33

    move-object/from16 v10, v36

    const/16 v11, 0x36

    invoke-static {v9, v8, v10, v6, v11}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v9

    iget-wide v10, v6, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v6, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v6, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    move-object/from16 v0, v38

    goto :goto_d

    :cond_11
    :goto_c
    move-object/from16 v9, v39

    goto :goto_e

    :goto_d
    invoke-static {v10, v6, v10, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v6, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, p9

    const/4 v9, 0x0

    invoke-static {v0, v6, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v6, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->k()Lb91/a;

    move-result-object v26

    invoke-virtual {v5, v6, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    new-instance v7, Lw3/k;

    invoke-direct {v7, v1}, Lw3/k;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0x2fdfa

    move-object/from16 v18, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v6

    move-object v6, v0

    move v0, v8

    move-wide v8, v3

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    mul-float v8, v0, v0

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/w;->b()I

    move-result v2

    invoke-static {v2, v6, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    invoke-virtual {v5, v6, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v3

    const/16 v1, 0x1b0

    const/4 v5, 0x0

    move-object/from16 p2, v0

    move/from16 p6, v1

    move-object/from16 p0, v2

    move-wide/from16 p3, v3

    move/from16 p7, v5

    move-object/from16 p5, v6

    move-object/from16 p1, v7

    invoke-static/range {p0 .. p7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x1

    invoke-static {v6, v7, v7, v7}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_f

    :cond_12
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Li21/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li21/r;-><init>(I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ly11/r;Lt71/g$b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v13

    move-object v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v14, p12

    move-object/from16 v12, p13

    invoke-static/range {v1 .. v14}, Li21/t;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ly11/r;Lt71/g$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
