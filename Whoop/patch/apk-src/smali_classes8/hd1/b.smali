.class public abstract Lhd1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lid1/e;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lid1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "design-showcase_release"
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lhd1/b;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lid1/e;Lkotlin/jvm/functions/Function1;Lo0/s;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lhd1/b;->g(Lid1/e;Lkotlin/jvm/functions/Function1;Lo0/s;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lid1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lhd1/b;->i(Lid1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lid1/e;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lhd1/b;->h(Lid1/e;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lid1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lid1/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, -0x59001275

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v3

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v15, 0x0

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    move v5, v15

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v11, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_6

    new-instance v2, Lhb1/h;

    const/4 v4, 0x6

    invoke-direct {v2, v4}, Lhb1/h;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v2, v4

    :goto_5
    invoke-virtual {v1}, Lid1/e;->b()Lid1/a;

    move-result-object v4

    instance-of v6, v4, Lid1/a$a;

    if-eqz v6, :cond_b

    const v6, -0x194533b1

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    new-instance v6, Lo0/b;

    check-cast v4, Lid1/a$a;

    invoke-virtual {v4}, Lid1/a$a;->a()I

    move-result v4

    invoke-direct {v6, v4}, Lo0/b;-><init>(I)V

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_8

    goto :goto_6

    :cond_8
    move v7, v15

    :goto_6
    or-int v0, v4, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_9

    if-ne v3, v5, :cond_a

    :cond_9
    new-instance v3, Lhd1/a;

    const/4 v0, 0x0

    invoke-direct {v3, v1, v2, v0}, Lhd1/a;-><init>(Lid1/e;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    const/16 v14, 0x3fe

    move-object v12, v11

    move-object v11, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v2

    move-object v2, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v14}, Lse/h;->k(Lo0/b;Landroidx/compose/ui/Modifier;Lo0/y;Ll0/k1;Ll0/l;Ll0/i;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object v14, v0

    goto :goto_8

    :cond_b
    move-object v14, v2

    move-object v12, v11

    sget-object v2, Lid1/a$b;->a:Lid1/a$b;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    const v2, -0x194512a2

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_c

    goto :goto_7

    :cond_c
    move v7, v15

    :goto_7
    or-int v0, v2, v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_d

    if-ne v2, v5, :cond_e

    :cond_d
    new-instance v2, Lhd1/a;

    const/4 v0, 0x1

    invoke-direct {v2, v1, v14, v0}, Lhd1/a;-><init>(Lid1/e;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    move-object v11, v12

    const/4 v12, 0x0

    const/16 v13, 0x1ff

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v13}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v11

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_8
    move-object v3, v14

    goto :goto_9

    :cond_f
    const v0, -0x19453be7

    invoke-static {v0, v12, v15}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_10
    move-object v12, v11

    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v4

    :goto_9
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lfc0/e;

    const/16 v5, 0x13

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lid1/e;Lkotlin/jvm/functions/Function1;Lo0/s;)Ll83/a0;
    .locals 4

    const-string v0, "$this$LazyVerticalGrid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lid1/e;->a()Ljava/util/List;

    move-result-object p0

    sget-object v0, Lhd1/b$a;->w:Lhd1/b$a;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lhd1/b$b;

    invoke-direct {v2, v0, p0}, Lhd1/b$b;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lhd1/b$c;

    invoke-direct {v0, p0, p1}, Lhd1/b$c;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const v3, -0x4297e015

    invoke-direct {p0, v0, p1, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p2, Lo0/g;

    invoke-virtual {p2, v1, v2, p0}, Lo0/g;->q(ILkotlin/jvm/functions/Function1;Lx1/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lid1/e;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lid1/e;->a()Ljava/util/List;

    move-result-object p0

    sget-object v0, Lhd1/b$d;->w:Lhd1/b$d;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lhd1/b$e;

    invoke-direct {v2, v0, p0}, Lhd1/b$e;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lhd1/b$f;

    invoke-direct {v0, p0, p1}, Lhd1/b$f;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const v3, 0x2fd4df92

    invoke-direct {p0, v0, p1, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p2, Ln0/f;

    const/4 p1, 0x0

    invoke-virtual {p2, v1, p1, v2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lid1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lhd1/b;->e(Lid1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
