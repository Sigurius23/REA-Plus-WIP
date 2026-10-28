.class public abstract Ls61/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lk61/c;",
        "strokeState",
        "Lu61/a;",
        "segment",
        "Li71/h;",
        "scrollPosition",
        "Li71/g;",
        "dataScroller",
        "Ll83/a0;",
        "c",
        "(Lk61/c;Lu61/a;Li71/h;Li71/g;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lk61/c;Lu61/a;Li71/h;Li71/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ls61/c;->e(Lk61/c;Lu61/a;Li71/h;Li71/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk61/c;Li71/h;Li71/g;Lu61/a;Li91/h;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ls61/c;->d(Lk61/c;Li71/h;Li71/g;Lu61/a;Li91/h;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lk61/c;Lu61/a;Li71/h;Li71/g;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p5

    const-string v0, "strokeState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollPosition"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataScroller"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p4

    check-cast v7, Lp1/q;

    const v0, 0x3733aa62

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v6, 0x180

    const/16 v8, 0x100

    if-nez v5, :cond_5

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v8

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v6, 0xc00

    const/16 v9, 0x800

    if-nez v5, :cond_8

    and-int/lit16 v5, v6, 0x1000

    if-nez v5, :cond_6

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_4

    :cond_6
    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_4
    if-eqz v5, :cond_7

    move v5, v9

    goto :goto_5

    :cond_7
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    :cond_8
    and-int/lit16 v5, v0, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v5, v10, :cond_9

    move v5, v12

    goto :goto_6

    :cond_9
    move v5, v11

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v7, v10, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {p0}, Lk61/c;->c()Li91/a;

    move-result-object v5

    invoke-static {v5, v7, v11}, Li91/i;->a(Li91/a;Landroidx/compose/runtime/Composer;I)Li91/h;

    move-result-object v5

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    and-int/lit8 v13, v0, 0xe

    if-ne v13, v1, :cond_a

    move v1, v12

    goto :goto_7

    :cond_a
    move v1, v11

    :goto_7
    and-int/lit16 v13, v0, 0x380

    if-ne v13, v8, :cond_b

    move v8, v12

    goto :goto_8

    :cond_b
    move v8, v11

    :goto_8
    or-int/2addr v1, v8

    and-int/lit16 v8, v0, 0x1c00

    if-eq v8, v9, :cond_c

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_d

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_c
    move v11, v12

    :cond_d
    or-int v0, v1, v11

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_e

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_f

    :cond_e
    new-instance v0, Ls61/b;

    move-object v1, p0

    move-object v2, v3

    move-object v3, v4

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Ls61/b;-><init>(Lk61/c;Li71/h;Li71/g;Lu61/a;Li91/h;)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_f
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x6

    invoke-static {v10, v1, v7, v0}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_10
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, La11/e;

    const/16 v6, 0x13

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La11/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final d(Lk61/c;Li71/h;Li71/g;Lu61/a;Li91/h;Lk2/e;)Ll83/a0;
    .locals 8

    const-string v0, "$this$Canvas"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls61/d;

    invoke-direct {v0, p0, p1, p2, p5}, Ls61/d;-><init>(Lk61/c;Li71/h;Li71/g;Ly3/c;)V

    invoke-interface {p5}, Lk2/e;->d()J

    move-result-wide p0

    invoke-virtual {v0, p3, p0, p1}, Ls61/d;->c(Lu61/a;J)Ljava/util/List;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {p0}, Ls61/e;->b(Ljava/util/List;)Li2/s0;

    move-result-object v2

    invoke-virtual {v0}, Ls61/d;->b()Lk2/i;

    move-result-object v5

    instance-of p0, p4, Li91/e;

    if-eqz p0, :cond_0

    check-cast p4, Li91/e;

    invoke-virtual {p4}, Li91/e;->a()Li2/t;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v6, 0x34

    move-object v1, p5

    invoke-static/range {v1 .. v6}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    goto :goto_0

    :cond_0
    move-object v1, p5

    instance-of p0, p4, Li91/g;

    if-eqz p0, :cond_1

    check-cast p4, Li91/g;

    invoke-virtual {p4}, Li91/g;->a()J

    move-result-wide v3

    move-object v6, v5

    const/4 v5, 0x0

    const/16 v7, 0x34

    invoke-static/range {v1 .. v7}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lk61/c;Lu61/a;Li71/h;Li71/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Ls61/c;->c(Lk61/c;Lu61/a;Li71/h;Li71/g;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
