.class public abstract Lnm1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lnm1/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "b",
        "(Lnm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "home_release"
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
.method public static synthetic a(Lnm1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lnm1/b;->c(Lnm1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lnm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnm1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x4593566b

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_4
    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v2, v3, :cond_5

    move v2, v4

    goto :goto_4

    :cond_5
    move v2, v5

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    const/16 v2, 0xc

    int-to-float v2, v2

    int-to-float v1, v1

    mul-float/2addr v2, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x6

    invoke-static {v2, v3, p2, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v6, p2, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {p2, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v8, p2, Lp1/q;->S:Z

    if-eqz v8, :cond_6

    invoke-virtual {p2, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p2, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p2, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, p2, Lp1/q;->S:Z

    if-nez v6, :cond_7

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v3, p2, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p2, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnm1/c;->c()Lnm1/e;

    move-result-object v1

    if-nez v1, :cond_9

    const v1, -0x4cf5b7e7

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v1, -0x4cf5b7e6

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lnm1/c;->c()Lnm1/e;

    move-result-object v1

    sget v2, Lcom/whoop/navigation/e;->d:I

    and-int/lit8 v3, v0, 0x70

    or-int/2addr v2, v3

    invoke-static {v1, p1, p2, v2}, Lnm1/d;->c(Lnm1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {p0}, Lnm1/c;->e()Lnm1/i;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v3, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v2, v3

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v2

    invoke-static {v1, p1, p2, v0, v5}, Lnm1/h;->g(Lnm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, La11/j;

    const/16 v1, 0xd

    invoke-direct {v0, p0, p1, p3, v1}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(Lnm1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lnm1/b;->b(Lnm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
