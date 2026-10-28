.class public abstract Lm61/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll61/d;",
        "segmentState",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Ll61/d;Landroidx/compose/runtime/Composer;I)V",
        "Lk2/e;",
        "drawScope",
        "Li91/h;",
        "composedBackground",
        "Li2/s0;",
        "path",
        "Lk2/i;",
        "stroke",
        "f",
        "(Lk2/e;Li91/h;Li2/s0;Lk2/i;)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ll61/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm61/b;->e(Landroidx/compose/ui/Modifier;Ll61/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ll61/d;Li91/h;Li91/h;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm61/b;->d(Ll61/d;Li91/h;Li91/h;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Ll61/d;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x128bcf39

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    move v1, v4

    :goto_3
    and-int/2addr v0, v3

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Ll61/d;->a()Lk61/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lk61/a;->c()Li91/a;

    move-result-object v0

    goto :goto_4

    :cond_5
    move-object v0, v1

    :goto_4
    if-nez v0, :cond_6

    const v0, 0x3bc9babf

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    move-object v0, v1

    goto :goto_5

    :cond_6
    const v2, -0x612b0a7e

    invoke-virtual {p2, v2}, Lp1/q;->e0(I)V

    invoke-static {v0, p2, v4}, Li91/i;->a(Li91/a;Landroidx/compose/runtime/Composer;I)Li91/h;

    move-result-object v0

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {p1}, Ll61/d;->c()Lk61/c;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lk61/c;->c()Li91/a;

    move-result-object v2

    goto :goto_6

    :cond_7
    move-object v2, v1

    :goto_6
    if-nez v2, :cond_8

    const v2, 0x3bcac9ff

    invoke-virtual {p2, v2}, Lp1/q;->e0(I)V

    :goto_7
    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_8
    const v1, -0x612b01be

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-static {v2, p2, v4}, Li91/i;->a(Li91/a;Landroidx/compose/runtime/Composer;I)Li91/h;

    move-result-object v1

    goto :goto_7

    :goto_8
    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {p2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_9

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_a

    :cond_9
    new-instance v5, Ljs2/h;

    const/16 v3, 0x10

    invoke-direct {v5, p1, v0, v1, v3}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v5, p2, v4}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_b
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lkl2/f;

    const/16 v1, 0x17

    invoke-direct {v0, p0, p1, p3, v1}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final d(Ll61/d;Li91/h;Li91/h;Lk2/e;)Ll83/a0;
    .locals 11

    const-string v0, "$this$Canvas"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm61/a;

    invoke-virtual {p0}, Ll61/d;->c()Lk61/c;

    move-result-object v1

    invoke-direct {v0, v1, p3}, Lm61/a;-><init>(Lk61/c;Ly3/c;)V

    invoke-interface {p3}, Lk2/e;->d()J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Lm61/a;->b(Ll61/d;J)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Lh2/b;

    iget-wide v4, v4, Lh2/b;->a:J

    new-instance v6, Lh2/b;

    invoke-direct {v6, v4, v5}, Lh2/b;-><init>(J)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/k;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Lh2/b;

    iget-wide v4, v2, Lh2/b;->a:J

    new-instance v2, Lh2/b;

    invoke-direct {v2, v4, v5}, Lh2/b;-><init>(J)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lm61/a;->a()Lk2/i;

    move-result-object p0

    if-eqz p1, :cond_4

    invoke-static {v1, v3}, Ls61/e;->a(Ljava/util/List;Ljava/util/List;)Li2/s0;

    move-result-object v5

    instance-of v0, p1, Li91/e;

    if-eqz v0, :cond_2

    check-cast p1, Li91/e;

    invoke-virtual {p1}, Li91/e;->a()Li2/t;

    move-result-object v6

    const/4 v8, 0x0

    const/16 v9, 0x3c

    const/4 v7, 0x0

    move-object v4, p3

    invoke-static/range {v4 .. v9}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    goto :goto_2

    :cond_2
    move-object v4, p3

    instance-of p3, p1, Li91/g;

    if-eqz p3, :cond_3

    check-cast p1, Li91/g;

    invoke-virtual {p1}, Li91/g;->a()J

    move-result-wide v6

    const/4 v9, 0x0

    const/16 v10, 0x3c

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    goto :goto_2

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    move-object v4, p3

    :goto_2
    if-eqz p2, :cond_6

    if-eqz p0, :cond_5

    invoke-static {v1}, Ls61/e;->b(Ljava/util/List;)Li2/s0;

    move-result-object p1

    invoke-static {v4, p2, p1, p0}, Lm61/b;->f(Lk2/e;Li91/h;Li2/s0;Lk2/i;)V

    invoke-static {v3}, Ls61/e;->b(Ljava/util/List;)Li2/s0;

    move-result-object p1

    invoke-static {v4, p2, p1, p0}, Lm61/b;->f(Lk2/e;Li91/h;Li2/s0;Lk2/i;)V

    goto :goto_3

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "stroke was null when strokecolor was non null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Ll61/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lm61/b;->c(Landroidx/compose/ui/Modifier;Ll61/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lk2/e;Li91/h;Li2/s0;Lk2/i;)V
    .locals 13

    instance-of v0, p1, Li91/e;

    if-eqz v0, :cond_0

    check-cast p1, Li91/e;

    invoke-virtual {p1}, Li91/e;->a()Li2/t;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v5, 0x34

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v4, p3

    invoke-static/range {v0 .. v5}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    return-void

    :cond_0
    instance-of v0, p1, Li91/g;

    if-eqz v0, :cond_1

    check-cast p1, Li91/g;

    invoke-virtual {p1}, Li91/g;->a()J

    move-result-wide v8

    const/4 v10, 0x0

    const/16 v12, 0x34

    move-object v6, p0

    move-object v7, p2

    move-object/from16 v11, p3

    invoke-static/range {v6 .. v12}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    return-void

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
