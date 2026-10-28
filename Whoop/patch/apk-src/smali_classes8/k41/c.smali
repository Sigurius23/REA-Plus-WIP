.class public abstract Lk41/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a#\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012\u00b2\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lk41/d;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lk41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Lk41/a;",
        "Ljava/time/Instant;",
        "instant",
        "",
        "j",
        "(Ljava/util/List;Ljava/time/Instant;)Ljava/lang/Integer;",
        "currentIndex",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lk41/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lk41/c;->g(Landroidx/compose/ui/Modifier;Lk41/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lk41/c;->f(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lk41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lk41/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p3

    check-cast v4, Lp1/q;

    const v0, 0x2d2b0efa

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v7, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_2
    move v1, v7

    :goto_1
    and-int/lit8 v2, v7, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_4
    and-int/lit16 v2, v7, 0x180

    if-nez v2, :cond_6

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_3

    :cond_5
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_6
    and-int/lit16 v2, v1, 0x93

    const/16 v5, 0x92

    const/4 v8, 0x0

    if-eq v2, v5, :cond_7

    const/4 v2, 0x1

    goto :goto_4

    :cond_7
    move v2, v8

    :goto_4
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v4, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_f

    if-eqz v0, :cond_8

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_8
    invoke-virtual {p1}, Lk41/d;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_9

    if-ne v2, v5, :cond_a

    :cond_9
    invoke-virtual {p1}, Lk41/d;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    move-result-object v2

    const-string v6, "instant(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lk41/c;->j(Ljava/util/List;Ljava/time/Instant;)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lp1/c1;

    sget-object v0, Lj8/c;->a:Lp1/t1;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/g0;

    invoke-virtual {p1}, Lk41/d;->a()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x0

    if-nez v9, :cond_b

    if-ne v10, v5, :cond_c

    :cond_b
    new-instance v10, Lk41/c$a;

    invoke-direct {v10, v0, p1, v2, v11}, Lk41/c$a;-><init>(Landroidx/lifecycle/g0;Lk41/d;Lp1/c1;Lq83/d;)V

    invoke-virtual {v4, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lc93/m;

    invoke-static {v6, v0, v10, v4}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-static {v2}, Lk41/c;->d(Lp1/c1;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lk41/d;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk41/a;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lk41/a;->a()Lm91/o;

    move-result-object v11

    :cond_d
    move-object v0, v11

    if-eqz v0, :cond_e

    const v2, 0x45d46d8a

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    new-instance v2, Law0/a;

    const/4 v5, 0x6

    invoke-direct {v2, v5, p0}, Law0/a;-><init>(ILandroidx/compose/ui/Modifier;)V

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v5, v1, 0x1c00

    const/4 v6, 0x2

    const/4 v1, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v6}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_e
    const v0, 0x45d6bea8

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    :goto_5
    move-object v1, p0

    goto :goto_6

    :cond_f
    invoke-virtual {v4}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_10

    new-instance v0, Ljp1/d;

    const/4 v6, 0x7

    move-object v2, p1

    move-object v3, p2

    move/from16 v5, p5

    move v4, v7

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final d(Lp1/c1;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method private static final e(Lp1/c1;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, 0x1db7b165

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lk41/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lk41/c;->c(Landroidx/compose/ui/Modifier;Lk41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic h(Lp1/c1;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lk41/c;->e(Lp1/c1;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final synthetic i(Ljava/util/List;Ljava/time/Instant;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Lk41/c;->j(Ljava/util/List;Ljava/time/Instant;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Ljava/util/List;Ljava/time/Instant;)Ljava/lang/Integer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lk41/a;",
            ">;",
            "Ljava/time/Instant;",
            ")",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk41/a;

    invoke-virtual {v1}, Lk41/a;->b()Ljava/time/Instant;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lk41/a;->b()Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/time/Instant;->isAfter(Ljava/time/Instant;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :cond_2
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-ltz p1, :cond_3

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method
