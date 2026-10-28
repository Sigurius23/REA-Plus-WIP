.class public abstract Lcz0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001ao\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000fH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lh2/c;",
        "contentRect",
        "scrubberRect",
        "Ld61/a;",
        "scrubberState",
        "",
        "Lcz0/r;",
        "scrubbableData",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onDataScrub",
        "",
        "longPressTimeoutMillis",
        "",
        "dimContentOnScrub",
        "Lkotlin/Function0;",
        "content",
        "d",
        "(Lh2/c;Lh2/c;Ld61/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLc93/m;Landroidx/compose/runtime/Composer;II)V",
        "isLongPressScrubFeatureEnabled",
        "callerLongPressTimeoutMillis",
        "h",
        "(ZJ)J",
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
.method public static synthetic a(Lh2/c;Lh2/c;Ld61/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Lcz0/f;->g(Lh2/c;Lh2/c;Ld61/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ld61/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcz0/f;->e(Ld61/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lh2/c;Ld61/a;ZLjava/lang/Object;Ldz0/c;Ljava/util/List;ZLc93/m;Lh2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lcz0/f;->f(Lh2/c;Ld61/a;ZLjava/lang/Object;Ldz0/c;Ljava/util/List;ZLc93/m;Lh2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lh2/c;Lh2/c;Ld61/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh2/c;",
            "Lh2/c;",
            "Ld61/a;",
            "Ljava/util/List<",
            "+",
            "Lcz0/r;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "JZ",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v9, p1

    move-object/from16 v2, p2

    move-object/from16 v8, p8

    move/from16 v10, p10

    const-string v0, "contentRect"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrubberRect"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrubberState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p9

    check-cast v11, Lp1/q;

    const v0, 0x9256a2d

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v10, 0x180

    if-nez v4, :cond_6

    and-int/lit16 v4, v10, 0x200

    if-nez v4, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_3

    :cond_4
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_6
    and-int/lit8 v4, p11, 0x8

    if-eqz v4, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move-object/from16 v5, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_7

    move-object/from16 v5, p3

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    const/16 v6, 0x800

    goto :goto_5

    :cond_9
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v0, v6

    :goto_6
    and-int/lit8 v6, p11, 0x10

    if-eqz v6, :cond_b

    or-int/lit16 v0, v0, 0x6000

    :cond_a
    move-object/from16 v7, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v7, v10, 0x6000

    if-nez v7, :cond_a

    move-object/from16 v7, p4

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/16 v12, 0x4000

    goto :goto_7

    :cond_c
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v0, v12

    :goto_8
    and-int/lit8 v12, p11, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_e

    or-int/2addr v0, v13

    :cond_d
    move-wide/from16 v13, p5

    goto :goto_a

    :cond_e
    and-int/2addr v13, v10

    if-nez v13, :cond_d

    move-wide/from16 v13, p5

    invoke-virtual {v11, v13, v14}, Lp1/q;->f(J)Z

    move-result v15

    if-eqz v15, :cond_f

    const/high16 v15, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v15, 0x10000

    :goto_9
    or-int/2addr v0, v15

    :goto_a
    and-int/lit8 v15, p11, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_10

    or-int v0, v0, v16

    move/from16 v3, p7

    goto :goto_c

    :cond_10
    and-int v16, v10, v16

    move/from16 v3, p7

    if-nez v16, :cond_12

    invoke-virtual {v11, v3}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v16, 0x80000

    :goto_b
    or-int v0, v0, v16

    :cond_12
    :goto_c
    const/high16 v16, 0xc00000

    and-int v16, v10, v16

    if-nez v16, :cond_14

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x800000

    goto :goto_d

    :cond_13
    const/high16 v16, 0x400000

    :goto_d
    or-int v0, v0, v16

    :cond_14
    const v16, 0x492493

    move/from16 v17, v0

    and-int v0, v17, v16

    const v1, 0x492492

    const/16 v16, 0x1

    if-eq v0, v1, :cond_15

    move/from16 v0, v16

    goto :goto_e

    :cond_15
    const/4 v0, 0x0

    :goto_e
    and-int/lit8 v1, v17, 0x1

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_22

    if-eqz v4, :cond_16

    sget-object v0, Lm83/y;->w:Lm83/y;

    move/from16 v28, v6

    move-object v6, v0

    move/from16 v0, v28

    goto :goto_f

    :cond_16
    move v0, v6

    move-object v6, v5

    :goto_f
    if-eqz v0, :cond_18

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_17

    new-instance v0, Lcom/whoop/profile/view/edit/form/c;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_10

    :cond_18
    move-object v0, v7

    :goto_10
    if-eqz v12, :cond_19

    const-wide/16 v4, 0xc8

    move-wide v13, v4

    :cond_19
    if-eqz v15, :cond_1a

    move/from16 v3, v16

    :cond_1a
    new-instance v5, Ldz0/c;

    new-instance v1, Lcz0/g;

    invoke-direct {v1, v2, v0}, Lcz0/g;-><init>(Ld61/a;Lkotlin/jvm/functions/Function1;)V

    const/4 v4, 0x0

    const/4 v7, 0x2

    invoke-direct {v5, v1, v4, v7, v4}, Ldz0/c;-><init>(Lcz0/g;Lcz0/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcz0/r;

    instance-of v7, v1, Lj71/b$g;

    if-eqz v7, :cond_1c

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Lj71/b$g;

    if-eqz v7, :cond_1b

    check-cast v1, Lj71/b$g;

    goto :goto_11

    :cond_1b
    move-object v1, v4

    :goto_11
    if-eqz v1, :cond_21

    invoke-virtual {v1}, Lj71/b$g;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_14

    :cond_1c
    instance-of v7, v1, Lj71/b$b;

    if-eqz v7, :cond_1e

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Lj71/b$b;

    if-eqz v7, :cond_1d

    check-cast v1, Lj71/b$b;

    goto :goto_12

    :cond_1d
    move-object v1, v4

    :goto_12
    if-eqz v1, :cond_21

    invoke-virtual {v1}, Lj71/b$b;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_14

    :cond_1e
    instance-of v1, v1, Lj71/b$a;

    if-eqz v1, :cond_20

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Lj71/b$a;

    if-eqz v7, :cond_1f

    check-cast v1, Lj71/b$a;

    goto :goto_13

    :cond_1f
    move-object v1, v4

    :goto_13
    if-eqz v1, :cond_21

    invoke-virtual {v1}, Lj71/b$a;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_14

    :cond_20
    const-string v4, ""

    :cond_21
    :goto_14
    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v1, v11, v7}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v12

    const-string v15, "scrubber-fix-enabled"

    invoke-interface {v12, v15}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v12

    invoke-virtual {v1, v11, v7}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    const-string v7, "graph-scrub-on-long-press-android"

    invoke-interface {v1, v7}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1, v13, v14}, Lcz0/f;->h(ZJ)J

    move-result-wide v17

    sget-object v1, Lb3/v1;->s:Lp1/u2;

    new-instance v15, Lkd1/a0;

    invoke-virtual {v11, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v16, v7

    check-cast v16, Lb3/j3;

    const/16 v26, 0x3c

    const/16 v27, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    invoke-direct/range {v15 .. v27}, Lkd1/a0;-><init>(Lb3/j3;JJJFJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v15}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v15

    move-object v7, v0

    new-instance v0, Lcz0/a;

    move v1, v12

    move-object v12, v7

    move v7, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v9}, Lcz0/a;-><init>(Lh2/c;Ld61/a;ZLjava/lang/Object;Ldz0/c;Ljava/util/List;ZLc93/m;Lh2/c;)V

    const v1, 0x74505eed

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v15, v0, v11, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v6

    move-object v5, v12

    :goto_15
    move v8, v3

    move-wide v6, v13

    goto :goto_16

    :cond_22
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v4, v5

    move-object v5, v7

    goto :goto_15

    :goto_16
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_23

    new-instance v0, Lcz0/b;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v9, p8

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcz0/b;-><init>(Lh2/c;Lh2/c;Ld61/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLc93/m;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final e(Ld61/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lh2/c;Ld61/a;ZLjava/lang/Object;Ldz0/c;Ljava/util/List;ZLc93/m;Lh2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p10, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p10, v1

    check-cast p9, Lp1/q;

    invoke-virtual {p9, p10, v0}, Lp1/q;->U(IZ)Z

    move-result p10

    if-eqz p10, :cond_9

    sget-object p10, Lb2/t;->w:Lb2/t;

    const/4 v0, 0x0

    invoke-static {p10, p0, v0, v3, v0}, Le61/h;->G(Landroidx/compose/ui/Modifier;Lh2/c;Lp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p10

    invoke-static {p1}, Ld61/b;->a(Ld61/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_1

    const p2, 0x3f7d70a4    # 0.99f

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ld61/b;->a(Ld61/a;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/high16 p2, 0x3e800000    # 0.25f

    goto :goto_1

    :cond_2
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_1
    invoke-static {p2, p10}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-virtual {p9, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p10

    invoke-virtual {p9, p5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p10, v0

    invoke-virtual {p9, p6}, Lp1/q;->h(Z)Z

    move-result v0

    or-int/2addr p10, v0

    invoke-virtual {p9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p10, :cond_3

    sget-object p10, Lp1/l;->a:Lp1/v0;

    if-ne v0, p10, :cond_4

    :cond_3
    new-instance v0, Lcz0/f$a;

    invoke-direct {v0, p4, p5, p6}, Lcz0/f$a;-><init>(Ldz0/c;Ljava/util/List;Z)V

    invoke-virtual {p9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {p2, p3, v0}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object p3, Lb2/e;->w:Lb2/m;

    invoke-static {p3, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p3

    iget-wide p5, p9, Lp1/q;->T:J

    invoke-static {p5, p6}, Ljava/lang/Long;->hashCode(J)I

    move-result p5

    invoke-virtual {p9}, Lp1/q;->m()Lp1/p1;

    move-result-object p6

    invoke-static {p9, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object p10, La3/l;->a:La3/k;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p10, La3/k;->b:La3/j;

    invoke-virtual {p9}, Lp1/q;->i0()V

    iget-boolean v0, p9, Lp1/q;->S:Z

    if-eqz v0, :cond_5

    invoke-virtual {p9, p10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p9}, Lp1/q;->s0()V

    :goto_2
    sget-object p10, La3/k;->g:La3/i;

    invoke-static {p9, p10, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->f:La3/i;

    invoke-static {p9, p3, p6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->j:La3/i;

    iget-boolean p6, p9, Lp1/q;->S:Z

    if-nez p6, :cond_6

    invoke-virtual {p9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p6

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p10

    invoke-static {p6, p10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p6

    if-nez p6, :cond_7

    :cond_6
    invoke-static {p5, p9, p5, p3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object p3, La3/k;->d:La3/i;

    invoke-static {p9, p3, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p7, p9, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p9, v1}, Lp1/q;->q(Z)V

    invoke-virtual {p4}, Ldz0/c;->a()Ljava/lang/Float;

    move-result-object p2

    if-eqz p2, :cond_8

    const p3, -0x4b430a08

    invoke-virtual {p9, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1}, Ld61/a;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p3

    const/4 p5, 0x0

    move-object p1, p8

    move-object p4, p9

    invoke-static/range {p0 .. p5}, Lcz0/o;->j(Lh2/c;Lh2/c;FLjava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_8
    move-object p4, p9

    const p0, -0x4b3fd3ed

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p4, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_9
    move-object p4, p9

    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lh2/c;Lh2/c;Ld61/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lcz0/f;->d(Lh2/c;Lh2/c;Ld61/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(ZJ)J
    .locals 2

    if-eqz p0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long p0, p1, v0

    if-nez p0, :cond_0

    const-wide/16 p0, 0xc8

    return-wide p0

    :cond_0
    return-wide p1
.end method
