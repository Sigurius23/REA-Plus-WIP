.class public abstract Ljs1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a=\u0010\t\u001a\u00020\u00072\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a-\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "Lh11/h;",
        "days",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "index",
        "",
        "isFirst",
        "h",
        "(ILjava/util/List;Z)Z",
        "journal-home-tile-mini-arch_release"
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

    invoke-static {p0}, Ljs1/g;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljs1/g;->f(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p6}, Ljs1/g;->g(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh11/h;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "days"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x3d50cb89

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_4

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_4
    :goto_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_7

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_4

    :cond_6
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    :goto_5
    and-int/lit16 v3, v0, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x1

    if-eq v3, v4, :cond_8

    move v3, v5

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    :goto_6
    and-int/2addr v0, v5

    invoke-virtual {p3, v0, v3}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz v1, :cond_9

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_9
    if-eqz v2, :cond_b

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_a

    new-instance p2, Lji0/b;

    const/16 v0, 0x9

    invoke-direct {p2, v0}, Lji0/b;-><init>(I)V

    invoke-virtual {p3, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_b
    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    invoke-interface {v1}, Ly3/c;->getDensity()F

    move-result v1

    new-instance v2, Ly3/d;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v2, v1, v3}, Ly3/d;-><init>(FF)V

    invoke-virtual {v0, v2}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v1, Lg1/e7;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p0, p2, v2}, Lg1/e7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, -0x107f16c9

    invoke-static {v2, p3, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p3, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    move-object v5, p1

    move-object v6, p2

    goto :goto_8

    :cond_c
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v3, Ljs1/f;

    move-object v4, p0

    move v7, p4

    move v8, p5

    invoke-direct/range {v3 .. v8}, Ljs1/f;-><init>(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)V

    iput-object v3, p1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/2addr p4, v2

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_6

    const/4 p3, 0x3

    int-to-float p3, p3

    const/4 p4, 0x4

    int-to-float p4, p4

    mul-float/2addr p3, p4

    const/4 p4, 0x0

    invoke-static {p0, p3, p4, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object p3, Ll0/m;->g:Ll0/h;

    sget-object p4, Lb2/e;->J:Lb2/l;

    const/4 v0, 0x6

    invoke-static {p3, p4, v8, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object p3

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result p4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    invoke-static {v8, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_1

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v8, v3, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->f:La3/i;

    invoke-static {v8, p3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->j:La3/i;

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {p4, v8, p4, p3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p3, La3/k;->d:La3/i;

    invoke-static {v8, p3, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p0, -0x32f3b5d2    # -1.4710448E8f

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    move-object p0, p1

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move p3, v1

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    add-int/lit8 v0, p3, 0x1

    if-ltz p3, :cond_4

    move-object v4, p4

    check-cast v4, Lh11/h;

    invoke-static {p3, p1, v2}, Ljs1/g;->h(ILjava/util/List;Z)Z

    move-result v6

    invoke-static {p3, p1, v1}, Ljs1/g;->h(ILjava/util/List;Z)Z

    move-result v7

    sget v9, Lh11/h;->o:I

    const/4 v10, 0x0

    move-object v5, p2

    invoke-static/range {v4 .. v10}, Ljs1/e;->s(Lh11/h;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V

    move p3, v0

    goto :goto_2

    :cond_4
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_5
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ljs1/g;->d(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(ILjava/util/List;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lh11/h;",
            ">;Z)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p2, v0

    if-ne p0, p2, :cond_1

    :goto_0
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh11/h;

    invoke-virtual {p0}, Lh11/h;->l()Lh11/a;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    const/4 p1, 0x7

    if-lt p0, p1, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
