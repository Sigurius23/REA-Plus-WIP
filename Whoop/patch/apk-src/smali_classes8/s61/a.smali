.class public abstract Ls61/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lk61/a;",
        "fillState",
        "Lu61/a;",
        "segment",
        "Li71/h;",
        "scrollPosition",
        "Li71/g;",
        "dataScroller",
        "Ll83/a0;",
        "c",
        "(Lk61/a;Lu61/a;Li71/h;Li71/g;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Li71/h;Li71/g;Lu61/a;Li91/h;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ls61/a;->d(Li71/h;Li71/g;Lu61/a;Li91/h;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk61/a;Lu61/a;Li71/h;Li71/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ls61/a;->e(Lk61/a;Lu61/a;Li71/h;Li71/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lk61/a;Lu61/a;Li71/h;Li71/g;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move/from16 v6, p5

    const-string v0, "fillState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollPosition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataScroller"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p4

    check-cast v7, Lp1/q;

    const v0, 0x2dfae44f

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v6, 0x180

    const/16 v4, 0x100

    if-nez v3, :cond_5

    invoke-virtual {v7, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v4

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    and-int/lit16 v3, v6, 0xc00

    const/16 v5, 0x800

    if-nez v3, :cond_8

    and-int/lit16 v3, v6, 0x1000

    if-nez v3, :cond_6

    invoke-virtual {v7, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_4

    :cond_6
    invoke-virtual {v7, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_4
    if-eqz v3, :cond_7

    move v3, v5

    goto :goto_5

    :cond_7
    const/16 v3, 0x400

    :goto_5
    or-int/2addr v0, v3

    :cond_8
    and-int/lit16 v3, v0, 0x493

    const/16 v8, 0x492

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v3, v8, :cond_9

    move v3, v10

    goto :goto_6

    :cond_9
    move v3, v9

    :goto_6
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v7, v8, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual {p0}, Lk61/a;->c()Li91/a;

    move-result-object v3

    invoke-static {v3, v7, v9}, Li91/i;->a(Li91/a;Landroidx/compose/runtime/Composer;I)Li91/h;

    move-result-object v3

    sget-object v8, Lb2/t;->w:Lb2/t;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    and-int/lit16 v11, v0, 0x380

    if-ne v11, v4, :cond_a

    move v4, v10

    goto :goto_7

    :cond_a
    move v4, v9

    :goto_7
    and-int/lit16 v11, v0, 0x1c00

    if-eq v11, v5, :cond_b

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    invoke-virtual {v7, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_b
    move v9, v10

    :cond_c
    or-int v0, v4, v9

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_d

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v4, v0, :cond_e

    :cond_d
    new-instance v0, Lry2/d;

    const/4 v5, 0x1

    move-object v1, p2

    move-object v2, p3

    move-object v4, v3

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lry2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x6

    invoke-static {v8, v4, v7, v0}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_8

    :cond_f
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lr90/b;

    const/16 v6, 0x12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lr90/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final d(Li71/h;Li71/g;Lu61/a;Li91/h;Lk2/e;)Ll83/a0;
    .locals 9

    const-string v1, "$this$Canvas"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls61/d;

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v6, p4

    invoke-direct/range {v2 .. v8}, Ls61/d;-><init>(Lk61/c;Li71/h;Li71/g;Ly3/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p4}, Lk2/e;->d()J

    move-result-wide v3

    invoke-virtual {v2, p2, v3, v4}, Ls61/d;->a(Lu61/a;J)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ls61/e;->b(Ljava/util/List;)Li2/s0;

    move-result-object v3

    instance-of v1, p3, Li91/e;

    sget-object v6, Lk2/h;->a:Lk2/h;

    if-eqz v1, :cond_0

    move-object v0, p3

    check-cast v0, Li91/e;

    invoke-virtual {v0}, Li91/e;->a()Li2/t;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v7, 0x34

    move-object v2, p4

    invoke-static/range {v2 .. v7}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    goto :goto_0

    :cond_0
    instance-of v1, p3, Li91/g;

    if-eqz v1, :cond_1

    move-object v0, p3

    check-cast v0, Li91/g;

    invoke-virtual {v0}, Li91/g;->a()J

    move-result-wide v4

    move-object v7, v6

    const/4 v6, 0x0

    const/16 v8, 0x34

    move-object v2, p4

    invoke-static/range {v2 .. v8}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final e(Lk61/a;Lu61/a;Li71/h;Li71/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Ls61/a;->c(Lk61/a;Lu61/a;Li71/h;Li71/g;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
