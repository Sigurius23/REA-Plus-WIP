.class public abstract Lau1/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u001aS\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aG\u0010\u000e\u001a\u00020\u0003*\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\r2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a5\u0010\u0016\u001a\u00020\u0003*\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lzt1/c;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBack",
        "Lkotlin/Function1;",
        "Lzt1/d;",
        "onViewEvent",
        "Lyt1/a;",
        "onNavigation",
        "F",
        "(Lzt1/c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ll0/y;",
        "Lzt1/c$c;",
        "t",
        "(Ll0/y;Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ln0/u;",
        "",
        "buffer",
        "",
        "nextToken",
        "onLoadMore",
        "N",
        "(Ln0/u;ILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "K",
        "(Lzt1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "labrador_release"
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
.method private static final A(Lzt1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string v0, "$this$item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p4, v0

    :cond_1
    and-int/lit8 v0, p4, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    and-int/2addr p4, v2

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_3

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/4 p4, 0x7

    invoke-static {p2, p3, p4}, Landroidx/compose/foundation/lazy/a;->a(Landroidx/compose/foundation/lazy/a;Landroidx/compose/ui/Modifier;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget p2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, p2, 0x3

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lau1/h;->e(Landroidx/compose/ui/Modifier;Lzt1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lzt1/c$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    const-string v0, "$this$item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p4, v0

    :cond_1
    and-int/lit8 v0, p4, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    and-int/2addr p4, v3

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_8

    const/high16 p4, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {p4, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p4

    const/4 v0, 0x7

    invoke-static {p2, p4, v0}, Landroidx/compose/foundation/lazy/a;->a(Landroidx/compose/foundation/lazy/a;Landroidx/compose/ui/Modifier;I)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object p4, Lb2/e;->E:Lb2/m;

    invoke-static {p4, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p4

    iget-wide v0, p3, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {p3, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v6, p3, Lp1/q;->S:Z

    if-eqz v6, :cond_3

    invoke-virtual {p3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_2
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p3, v5, p4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->f:La3/i;

    invoke-static {p3, p4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->j:La3/i;

    iget-boolean v1, p3, Lp1/q;->S:Z

    if-nez v1, :cond_4

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    invoke-static {v0, p3, v0, p4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object p4, La3/k;->d:La3/i;

    invoke-static {p3, p4, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 p2, 0x3

    int-to-float p2, p2

    const/16 p4, 0x8

    int-to-float p4, p4

    mul-float v6, p2, p4

    const/4 v8, 0x0

    const/16 v9, 0xd

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_6

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v0, p4, :cond_7

    :cond_6
    new-instance v0, Lau1/p;

    const/4 p4, 0x0

    invoke-direct {v0, p0, p1, p4}, Lau1/p;-><init>(Lkotlin/jvm/functions/Function1;Lzt1/c$c;I)V

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Lc93/a;

    const/4 p0, 0x6

    invoke-static {p2, v0, p3, p0, v2}, Lau1/e;->d(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_8
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;Lzt1/c$c;)Ll83/a0;
    .locals 1

    new-instance v0, Lzt1/d$a;

    invoke-virtual {p1}, Lzt1/c$c;->f()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lzt1/d$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;Lzt1/c$c;)Ll83/a0;
    .locals 1

    new-instance v0, Lzt1/d$d;

    invoke-virtual {p1}, Lzt1/c$c;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lzt1/d$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Ll0/y;Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lau1/q;->t(Ll0/y;Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final F(Lzt1/c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzt1/c;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x523251a1

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, v5, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_5

    :cond_8
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v0, v7

    :goto_6
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move-object/from16 v8, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_9

    move-object/from16 v8, p3

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x800

    goto :goto_7

    :cond_b
    const/16 v9, 0x400

    :goto_7
    or-int/2addr v0, v9

    :goto_8
    and-int/lit16 v9, v0, 0x493

    const/16 v11, 0x492

    const/4 v15, 0x1

    if-eq v9, v11, :cond_c

    move v9, v15

    goto :goto_9

    :cond_c
    const/4 v9, 0x0

    :goto_9
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_19

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_d

    new-instance v2, Lat2/k;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lat2/k;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v2, Lc93/a;

    goto :goto_a

    :cond_e
    move-object v2, v3

    :goto_a
    if-eqz v4, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_f

    new-instance v3, Lat2/b1;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lat2/b1;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_b

    :cond_10
    move-object v3, v6

    :goto_b
    if-eqz v7, :cond_12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_11

    new-instance v4, Lat2/b1;

    const/4 v6, 0x7

    invoke-direct {v4, v6}, Lat2/b1;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_c

    :cond_12
    move-object v4, v8

    :goto_c
    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->M:Lb2/k;

    sget-object v11, Ll0/m;->c:Ll0/g;

    const/16 v13, 0x30

    invoke-static {v11, v9, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_13

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_d
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v10, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_15

    :cond_14
    invoke-static {v11, v10, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v10, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v16, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    sget v7, Lrs1/f;->o0:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v17

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v19

    sget v7, Lgy0/f;->K:I

    invoke-static {v10, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v20

    const v33, 0xfff2

    const/16 v34, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v16 .. v34}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v7, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v7, v7, 0x3

    const/16 v17, 0x6

    or-int/lit8 v7, v7, 0x6

    shl-int/lit8 v8, v0, 0x6

    and-int/lit16 v8, v8, 0x1c00

    or-int v13, v7, v8

    const/16 v14, 0x34

    const/4 v8, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v2

    move-object/from16 v7, v16

    const/4 v2, 0x0

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v9

    sget-object v6, Lzt1/c$a;->a:Lzt1/c$a;

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    const v6, -0x7014282

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v3, v12, v0, v2}, Lau1/l;->d(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    :goto_e
    move-object v8, v3

    move-object v9, v4

    goto :goto_f

    :cond_16
    sget-object v6, Lzt1/c$b;->a:Lzt1/c$b;

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    const v0, -0x70135ab

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-static {v12, v2}, Lau1/m;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_17
    instance-of v6, v1, Lzt1/c$c;

    if-eqz v6, :cond_18

    const v6, -0x7012aac

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    move-object v7, v1

    check-cast v7, Lzt1/c$c;

    shl-int/lit8 v6, v0, 0x3

    and-int/lit8 v6, v6, 0x70

    or-int v6, v17, v6

    and-int/lit16 v8, v0, 0x380

    or-int/2addr v6, v8

    and-int/lit16 v0, v0, 0x1c00

    or-int v11, v6, v0

    move-object v10, v12

    const/4 v12, 0x0

    sget-object v6, Ll0/z;->a:Ll0/z;

    move-object v8, v3

    move-object v9, v4

    invoke-static/range {v6 .. v12}, Lau1/q;->t(Ll0/y;Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v10

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object v3, v8

    move-object v4, v9

    move-object v2, v13

    goto :goto_10

    :cond_18
    const v0, -0x7014af7

    invoke-static {v0, v12, v2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_19
    move-object v12, v10

    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v6

    move-object v4, v8

    :goto_10
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1a

    new-instance v0, La81/f;

    const/4 v7, 0x5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final G()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final H(Lzt1/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lyt1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lzt1/c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lau1/q;->F(Lzt1/c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lzt1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzt1/c$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x4d85f806

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    move/from16 v29, v4

    and-int/lit8 v4, v29, 0x13

    const/16 v30, 0x1

    const/16 v6, 0x12

    const/4 v8, 0x0

    if-eq v4, v6, :cond_4

    move/from16 v4, v30

    goto :goto_3

    :cond_4
    move v4, v8

    :goto_3
    and-int/lit8 v9, v29, 0x1

    invoke-virtual {v3, v9, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v0}, Lzt1/c$c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v3, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    int-to-float v10, v5

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v10, v11

    const/4 v11, 0x0

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v10, v11, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v3, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v15

    invoke-virtual {v13, v3, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/d;->O()Lb91/a;

    move-result-object v23

    sget v17, Lb91/a;->d:I

    shl-int/lit8 v27, v17, 0x12

    const v28, 0x2fff8

    move v6, v7

    move/from16 v17, v8

    const-wide/16 v7, 0x0

    move/from16 v18, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v25, v3

    move-object v3, v4

    move-object v4, v11

    const/4 v11, 0x0

    move-object/from16 v21, v12

    move-object/from16 v20, v13

    const-wide/16 v12, 0x0

    move/from16 v22, v14

    const/4 v14, 0x0

    move/from16 v24, v5

    move-wide/from16 v40, v15

    move/from16 v16, v6

    move-wide/from16 v5, v40

    const/4 v15, 0x0

    move/from16 v26, v16

    move/from16 v31, v17

    const-wide/16 v16, 0x0

    move/from16 v32, v18

    const/16 v18, 0x0

    move/from16 v33, v19

    const/16 v19, 0x0

    move-object/from16 v34, v20

    const/16 v20, 0x0

    move-object/from16 v35, v21

    const/16 v21, 0x0

    move/from16 v36, v22

    const/16 v22, 0x0

    move/from16 v37, v24

    const/16 v24, 0x0

    move/from16 v38, v26

    const/16 v26, 0x30

    move/from16 v2, v32

    move/from16 v1, v33

    move-object/from16 v0, v35

    move/from16 v39, v36

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {p0 .. p0}, Lzt1/c$c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v3, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, v34

    move/from16 v5, v39

    invoke-virtual {v1, v3, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v1, v3, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    move-wide v5, v6

    const-wide/16 v7, 0x0

    move-object v3, v4

    move-object v4, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {p0 .. p0}, Lzt1/c$c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v0

    if-eqz v0, :cond_9

    const v0, -0x790fe37a

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    sget-object v4, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual/range {p0 .. p0}, Lzt1/c$c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v0, v6, :cond_5

    sget-object v0, Lau1/q$a;->w:Lau1/q$a;

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    new-instance v7, Ly71/g;

    invoke-static {v1}, Lih0/d0;->E(Lx81/d;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v8, 0x2

    invoke-direct {v7, v0, v1, v8, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v0, v29, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    :goto_4
    move-object/from16 v0, p0

    goto :goto_5

    :cond_6
    const/16 v30, 0x0

    goto :goto_4

    :goto_5
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int v1, v30, v1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_8

    if-ne v8, v6, :cond_7

    goto :goto_6

    :cond_7
    move-object/from16 v6, p1

    goto :goto_7

    :cond_8
    :goto_6
    new-instance v8, La20/g;

    const/16 v1, 0x10

    move-object/from16 v6, p1

    invoke-direct {v8, v1, v6, v0}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_7
    move-object v15, v8

    check-cast v15, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v1, v2, 0x6

    or-int/lit8 v1, v1, 0x30

    sget v2, Ly71/g;->c:I

    shl-int/lit8 v2, v2, 0xc

    or-int v17, v1, v2

    const/16 v18, 0x0

    const/16 v19, 0xfa9

    move-object/from16 v25, v3

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    move-object/from16 v16, v25

    invoke-static/range {v3 .. v19}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v16

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_9
    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v4, -0x790a2338

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_a
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_b

    new-instance v3, Lk;

    const/16 v4, 0x9

    move/from16 v5, p3

    invoke-direct {v3, v0, v1, v5, v4}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final L(Lkotlin/jvm/functions/Function1;Lzt1/c$c;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lyt1/a$b;

    invoke-virtual {p1}, Lzt1/c$c;->d()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p2, p1}, Lyt1/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lzt1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lau1/q;->K(Lzt1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Ln0/u;ILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/u;",
            "I",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x4e3f24fc

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    and-int/lit8 v2, p6, 0x1

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v0, p1}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v1, v6

    :cond_4
    :goto_3
    and-int/lit16 v6, v5, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v7

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    :cond_6
    and-int/lit16 v6, v5, 0xc00

    const/16 v8, 0x800

    if-nez v6, :cond_8

    invoke-virtual {v0, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    move v6, v8

    goto :goto_5

    :cond_7
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v1, v6

    :cond_8
    and-int/lit16 v6, v1, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v6, v9, :cond_9

    move v6, v11

    goto :goto_6

    :cond_9
    move v6, v10

    :goto_6
    and-int/lit8 v9, v1, 0x1

    invoke-virtual {v0, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_11

    if-eqz v2, :cond_a

    move p1, v10

    :cond_a
    and-int/lit16 v2, v1, 0x380

    if-ne v2, v7, :cond_b

    move v2, v11

    goto :goto_7

    :cond_b
    move v2, v10

    :goto_7
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_c

    if-ne v6, v7, :cond_d

    :cond_c
    new-instance v2, Lam2/h;

    const/4 v6, 0x2

    invoke-direct {v2, p0, p2, p1, v6}, Lam2/h;-><init>(Ln0/u;Ljava/lang/String;II)V

    invoke-static {v2}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v6

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lp1/t2;

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit16 v1, v1, 0x1c00

    if-ne v1, v8, :cond_e

    move v10, v11

    :cond_e
    or-int v1, v2, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_f

    if-ne v2, v7, :cond_10

    :cond_f
    new-instance v2, Lau1/q$b;

    const/4 v1, 0x0

    invoke-direct {v2, v6, p3, v1}, Lau1/q$b;-><init>(Lp1/t2;Lc93/a;Lq83/d;)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, Lc93/m;

    invoke-static {v0, v2, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :goto_8
    move v2, p1

    goto :goto_9

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_8

    :goto_9
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_12

    new-instance v0, Lau1/n;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lau1/n;-><init>(Ln0/u;ILjava/lang/String;Lc93/a;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final O(Ln0/u;Ljava/lang/String;I)Z
    .locals 1

    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    check-cast v0, Ln0/o;

    iget p1, v0, Ln0/o;->a:I

    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object p0

    iget p0, p0, Ln0/n;->n:I

    sub-int/2addr p0, p2

    const/4 p2, 0x1

    sub-int/2addr p0, p2

    if-lt p1, p0, :cond_0

    return p2

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final P(Ln0/u;ILjava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lau1/q;->N(Ln0/u;ILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lzt1/c$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lau1/q;->D(Lkotlin/jvm/functions/Function1;Lzt1/c$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ln0/u;ILjava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lau1/q;->P(Ln0/u;ILjava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lzt1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lau1/q;->M(Lzt1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lyt1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lau1/q;->v(Lyt1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lzt1/d;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lau1/q;->u(Lzt1/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lau1/q;->x(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lzt1/d;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lau1/q;->H(Lzt1/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lzt1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lau1/q;->A(Lzt1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lzt1/c$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lau1/q;->B(Lkotlin/jvm/functions/Function1;Lzt1/c$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lzt1/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lau1/q;->z(Lzt1/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lzt1/c$c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lau1/q;->L(Lkotlin/jvm/functions/Function1;Lzt1/c$c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Lzt1/c$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lau1/q;->C(Lkotlin/jvm/functions/Function1;Lzt1/c$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lau1/q;->w(Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ln0/u;Ljava/lang/String;I)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lau1/q;->O(Ln0/u;Ljava/lang/String;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic o(Ll0/y;Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lau1/q;->E(Ll0/y;Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lau1/q;->y(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q()Ll83/a0;
    .locals 1

    invoke-static {}, Lau1/q;->G()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic r(Lzt1/c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lau1/q;->J(Lzt1/c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lyt1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lau1/q;->I(Lyt1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Ll0/y;Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/y;",
            "Lzt1/c$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x5d907dd2

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v4, v5, 0x30

    const/16 v6, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit8 v4, p6, 0x2

    const/16 v7, 0x100

    if-eqz v4, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    move v9, v7

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v0, v9

    :goto_4
    and-int/lit8 v9, p6, 0x4

    if-eqz v9, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move-object/from16 v12, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v12, v5, 0xc00

    if-nez v12, :cond_7

    move-object/from16 v12, p3

    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    const/16 v13, 0x800

    goto :goto_5

    :cond_9
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v0, v13

    :goto_6
    and-int/lit16 v13, v0, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x1

    const/4 v12, 0x0

    if-eq v13, v14, :cond_a

    move v13, v15

    goto :goto_7

    :cond_a
    move v13, v12

    :goto_7
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v10, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_16

    const/16 v13, 0x8

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_b

    new-instance v4, Lat2/b1;

    invoke-direct {v4, v13}, Lat2/b1;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v4, v8

    :goto_8
    if-eqz v9, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v14, :cond_d

    new-instance v8, Lat2/b1;

    const/16 v9, 0x9

    invoke-direct {v8, v9}, Lat2/b1;-><init>(I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_e
    move-object/from16 v8, p3

    :goto_9
    shr-int/lit8 v9, v0, 0x3

    and-int/lit8 v9, v9, 0xe

    shr-int/lit8 v16, v0, 0x6

    and-int/lit8 v16, v16, 0x70

    or-int v9, v9, v16

    invoke-static {v2, v8, v10, v9}, Lau1/q;->K(Lzt1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const v9, 0x3b6876f7

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v10, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly3/c;

    int-to-float v6, v6

    sget-object v16, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v10}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v11

    iget-object v11, v11, Ll0/c2;->e:Ll0/b;

    invoke-virtual {v11}, Ll0/b;->e()Lv4/b;

    move-result-object v11

    iget v11, v11, Lv4/b;->d:I

    invoke-interface {v9, v11}, Ly3/c;->e0(I)F

    move-result v9

    add-float/2addr v9, v6

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    const/4 v6, 0x3

    invoke-static {v12, v12, v10, v6}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v6

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v1, v11, v12}, Ll0/y;->a(Ll0/y;Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v12, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    int-to-float v11, v15

    int-to-float v12, v13

    mul-float v19, v11, v12

    const/16 v21, 0x0

    const/16 v22, 0xd

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v13, v3

    mul-float/2addr v13, v12

    const/4 v12, 0x0

    invoke-static {v13, v12, v13, v9, v3}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v3

    invoke-static/range {v19 .. v19}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit16 v13, v0, 0x380

    if-ne v13, v7, :cond_f

    move/from16 v17, v15

    goto :goto_a

    :cond_f
    const/16 v17, 0x0

    :goto_a
    or-int v12, v12, v17

    and-int/lit16 v0, v0, 0x1c00

    const/16 v7, 0x800

    if-ne v0, v7, :cond_10

    move v0, v15

    goto :goto_b

    :cond_10
    const/4 v0, 0x0

    :goto_b
    or-int/2addr v0, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_11

    if-ne v7, v14, :cond_12

    :cond_11
    new-instance v7, Lq;

    const/4 v0, 0x5

    invoke-direct {v7, v2, v4, v8, v0}, Lq;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    const/16 v16, 0x6000

    const/16 v12, 0x100

    const/16 v17, 0x1e8

    move/from16 v18, v15

    move-object v15, v10

    const/4 v10, 0x0

    move-object/from16 v19, v14

    move-object v14, v7

    move-object v7, v6

    move-object v6, v11

    const/4 v11, 0x0

    move/from16 v20, v12

    const/4 v12, 0x0

    move/from16 v21, v13

    const/4 v13, 0x0

    move-object v1, v8

    move-object v8, v3

    move-object v3, v1

    move-object/from16 v23, v19

    move/from16 v1, v20

    move/from16 v19, v0

    move/from16 v0, v21

    invoke-static/range {v6 .. v17}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v2}, Lzt1/c$c;->f()Ljava/lang/String;

    move-result-object v8

    if-ne v0, v1, :cond_13

    const/16 v19, 0x1

    :cond_13
    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int v0, v19, v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_14

    move-object/from16 v0, v23

    if-ne v1, v0, :cond_15

    :cond_14
    new-instance v1, Lau1/p;

    const/4 v0, 0x1

    invoke-direct {v1, v4, v2, v0}, Lau1/p;-><init>(Lkotlin/jvm/functions/Function1;Lzt1/c$c;I)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v9, v1

    check-cast v9, Lc93/a;

    const/16 v11, 0x30

    const/4 v12, 0x0

    move-object v6, v7

    const/4 v7, 0x0

    move-object v10, v15

    invoke-static/range {v6 .. v12}, Lau1/q;->N(Ln0/u;ILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v24, v4

    move-object v4, v3

    move-object/from16 v3, v24

    goto :goto_c

    :cond_16
    move-object v15, v10

    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object v3, v8

    :goto_c
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, La81/f;

    const/4 v7, 0x6

    move-object/from16 v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final u(Lzt1/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lyt1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 9

    const-string v0, "$this$LazyColumn"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lzt1/c$c;->j()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Lau1/s;->a:Lau1/s;

    sget-object v2, Lau1/a;->a:Lau1/a;

    invoke-virtual {v2}, Lau1/a;->c()Lkotlin/jvm/functions/Function3;

    move-result-object v2

    move-object v3, p3

    check-cast v3, Ln0/f;

    const-string v4, "top loader"

    invoke-virtual {v3, v4, v0, v2}, Ln0/f;->q(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lzt1/c$c;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lau1/c;->a:Lau1/c;

    new-instance v2, Lau1/o;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lau1/o;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lx1/b;

    const v4, -0x5d9af555

    invoke-direct {v3, v2, v1, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v2, p3

    check-cast v2, Ln0/f;

    const-string v4, "top error"

    invoke-virtual {v2, v4, v0, v3}, Ln0/f;->q(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lzt1/c$c;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzt1/a;

    invoke-virtual {v2}, Lzt1/a;->b()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lau1/b;->a:Lau1/b;

    new-instance v5, Lau1/o;

    const/4 v6, 0x1

    invoke-direct {v5, v2, v6}, Lau1/o;-><init>(Ljava/lang/Object;I)V

    new-instance v6, Lx1/b;

    const v7, 0x2e62791e

    invoke-direct {v6, v5, v1, v7}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v5, p3

    check-cast v5, Ln0/f;

    invoke-virtual {v5, v3, v4, v6}, Ln0/f;->q(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    invoke-virtual {v2}, Lzt1/a;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzt1/b;

    invoke-virtual {v3}, Lzt1/b;->b()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lau1/t;->a:Lau1/t;

    new-instance v7, Ll;

    const/4 v8, 0x3

    invoke-direct {v7, v8, v3, p2}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lx1/b;

    const v8, -0x705d075a

    invoke-direct {v3, v7, v1, v8}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v5, v4, v6, v3}, Ln0/f;->q(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lzt1/c$c;->b()Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p0, Lau1/s;->a:Lau1/s;

    sget-object p1, Lau1/a;->a:Lau1/a;

    invoke-virtual {p1}, Lau1/a;->d()Lkotlin/jvm/functions/Function3;

    move-result-object p1

    check-cast p3, Ln0/f;

    const-string p2, "bottom loader"

    invoke-virtual {p3, p2, p0, p1}, Ln0/f;->q(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lzt1/c$c;->a()Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Lau1/c;->a:Lau1/c;

    new-instance v0, Ll;

    const/4 v2, 0x4

    invoke-direct {v0, p1, p0, v2}, Ll;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    new-instance p0, Lx1/b;

    const p1, 0x6895fee2

    invoke-direct {p0, v0, v1, p1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p3, Ln0/f;

    const-string p1, "bottom error"

    invoke-virtual {p3, p1, p2, p0}, Ln0/f;->q(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    :cond_5
    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    and-int/2addr p3, v3

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_8

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    const/4 v0, 0x7

    invoke-static {p1, p3, v0}, Landroidx/compose/foundation/lazy/a;->a(Landroidx/compose/foundation/lazy/a;Landroidx/compose/ui/Modifier;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p3, Lb2/e;->E:Lb2/m;

    invoke-static {p3, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p3

    iget-wide v0, p2, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {p2, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v5, p2, Lp1/q;->S:Z

    if-eqz v5, :cond_3

    invoke-virtual {p2, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_2
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p2, v4, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->f:La3/i;

    invoke-static {p2, p3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->j:La3/i;

    iget-boolean v1, p2, Lp1/q;->S:Z

    if-nez v1, :cond_4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    invoke-static {v0, p2, v0, p3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object p3, La3/k;->d:La3/i;

    invoke-static {p2, p3, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_6

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p3, p1, :cond_7

    :cond_6
    new-instance p3, Lau1/j;

    const/4 p1, 0x1

    invoke-direct {p3, p0, p1}, Lau1/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p2, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast p3, Lc93/a;

    const/4 p0, 0x0

    invoke-static {p0, p3, p2, v2, v3}, Lau1/e;->d(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_8
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzt1/d$e;->a:Lzt1/d$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lzt1/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    and-int/2addr p3, v2

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_3

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/4 v0, 0x7

    invoke-static {p1, p3, v0}, Landroidx/compose/foundation/lazy/a;->a(Landroidx/compose/foundation/lazy/a;Landroidx/compose/ui/Modifier;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p0}, Lzt1/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    sget p3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 p3, p3, 0x3

    invoke-static {p1, p0, p2, p3}, Lau1/i;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
