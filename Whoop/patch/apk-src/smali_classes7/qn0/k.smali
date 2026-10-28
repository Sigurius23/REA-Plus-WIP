.class public abstract Lqn0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqn0/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aK\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\'\u0010\r\u001a\u00020\u000c*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Ljn0/d;",
        "joinChallengeState",
        "",
        "challengeName",
        "Lkotlin/Function1;",
        "Lmn0/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lln0/b;",
        "onNavigationEvent",
        "g",
        "(Ljn0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lsz0/p0;",
        "m",
        "(Ljn0/d;Lkotlin/jvm/functions/Function1;)Lsz0/p0;",
        "challenge-details_release"
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
.method public static synthetic a(Lmn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqn0/k;->h(Lmn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqn0/k;->n(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lln0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqn0/k;->i(Lln0/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lqn0/k;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljn0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lqn0/k;->l(Ljn0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqn0/k;->k(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ljn0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn0/d;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "joinChallengeState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeName"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v3, 0x2d058f74

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v5, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v5

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    and-int/lit8 v4, v5, 0x30

    const/16 v6, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v6

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p6, 0x4

    const/16 v7, 0x100

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move v9, v7

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    :goto_7
    and-int/lit16 v11, v3, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_b

    const/4 v11, 0x1

    goto :goto_8

    :cond_b
    move v11, v13

    :goto_8
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1d

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_c

    new-instance v4, Lqe0/b;

    const/16 v8, 0xe

    invoke-direct {v4, v8}, Lqe0/b;-><init>(I)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v4, v8

    :goto_9
    if-eqz v9, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v11, :cond_e

    new-instance v8, Lqe0/b;

    const/16 v9, 0xf

    invoke-direct {v8, v9}, Lqe0/b;-><init>(I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_f
    move-object v8, v10

    :goto_a
    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v0, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->u()J

    move-result-wide v9

    sget-object v12, Li2/w0;->a:Li2/v0;

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v9, v10, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lb2/e;->w:Lb2/m;

    invoke-static {v10, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_10

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v0, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_12

    :cond_11
    invoke-static {v13, v0, v13, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v0, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v8}, Lqn0/k;->m(Ljn0/d;Lkotlin/jvm/functions/Function1;)Lsz0/p0;

    move-result-object v9

    invoke-virtual {v1}, Ljn0/d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Ljn0/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    if-nez v12, :cond_13

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    :cond_13
    invoke-virtual {v1}, Ljn0/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    if-eqz v13, :cond_14

    const/4 v13, 0x1

    goto :goto_c

    :cond_14
    const/4 v13, 0x0

    :goto_c
    invoke-virtual {v1}, Ljn0/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    if-nez v14, :cond_15

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    :cond_15
    and-int/lit16 v15, v3, 0x380

    if-ne v15, v7, :cond_16

    const/16 v16, 0x1

    goto :goto_d

    :cond_16
    const/16 v16, 0x0

    :goto_d
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v6, :cond_17

    const/4 v3, 0x1

    goto :goto_e

    :cond_17
    const/4 v3, 0x0

    :goto_e
    or-int v3, v16, v3

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_18

    if-ne v6, v11, :cond_19

    :cond_18
    new-instance v6, Lc41/j0;

    const/16 v3, 0xc

    invoke-direct {v6, v4, v2, v3}, Lc41/j0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v6, Lc93/a;

    if-ne v15, v7, :cond_1a

    const/4 v3, 0x1

    goto :goto_f

    :cond_1a
    const/4 v3, 0x0

    :goto_f
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_1b

    if-ne v7, v11, :cond_1c

    :cond_1b
    new-instance v7, Lp62/h;

    const/16 v3, 0x1d

    invoke-direct {v7, v4, v3}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v7, Lc93/a;

    sget v3, Lsz0/p0;->d:I

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v15, v11, 0x3

    or-int/2addr v3, v15

    shl-int/lit8 v15, v11, 0x9

    or-int/2addr v3, v15

    shl-int/lit8 v11, v11, 0x15

    or-int v19, v3, v11

    const/16 v20, 0x6

    const/16 v21, 0xa44

    move-object v3, v8

    const/4 v8, 0x0

    move v11, v13

    move-object v13, v14

    move-object v14, v7

    move-object v7, v10

    move-object v10, v6

    move-object v6, v9

    move-object v9, v12

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    move-object/from16 v18, v0

    const/4 v0, 0x1

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v18

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v22, v4

    move-object v4, v3

    move-object/from16 v3, v22

    goto :goto_10

    :cond_1d
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, v8

    move-object v4, v10

    :goto_10
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1e

    new-instance v0, Lo72/a;

    const/16 v7, 0x10

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final h(Lmn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lln0/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Lmn0/a$b;

    invoke-direct {v0, p1}, Lmn0/a$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lmn0/a$a;->a:Lmn0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Ljn0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lqn0/k;->g(Ljn0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ljn0/d;Lkotlin/jvm/functions/Function1;)Lsz0/p0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn0/d;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lsz0/p0;"
        }
    .end annotation

    invoke-virtual {p0}, Ljn0/d;->c()Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    move-result-object v0

    sget-object v1, Lqn0/k$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    new-instance v1, Lsz0/p0$b;

    invoke-virtual {p0}, Ljn0/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance v0, Lsz0/p0$h;

    invoke-virtual {p0}, Ljn0/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v4, Lqn0/j;

    const/4 p0, 0x0

    invoke-direct {v4, p1, p0}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lsz0/p0$e;

    invoke-virtual {p0}, Ljn0/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    sget v0, Lgy0/a;->O4:I

    invoke-direct {p1, p0, v0}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    return-object p1
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lln0/b$a;->a:Lln0/b$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
