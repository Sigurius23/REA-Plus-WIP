.class public abstract Lsl0/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a1\u0010\u000b\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\u000f\u001a\u00020\u00042\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\rH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001f\u0010\u0014\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00040\rH\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lnl0/i;",
        "viewState",
        "Lkotlin/Function1;",
        "Lnl0/d;",
        "Ll83/a0;",
        "onViewEvent",
        "x",
        "(Lnl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Lnl0/h;",
        "items",
        "s",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lkotlin/Function0;",
        "onRetry",
        "C",
        "(Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "F",
        "(Landroidx/compose/runtime/Composer;I)V",
        "onNewConversationClicked",
        "o",
        "(Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lnl0/d$i;->a:Lnl0/d$i;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lnl0/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lsl0/p1;->x(Lnl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v14, p1

    check-cast v14, Lp1/q;

    const v2, 0x32e218a8

    invoke-virtual {v14, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v3, :cond_2

    move v3, v7

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    and-int/lit8 v5, v2, 0x1

    invoke-virtual {v14, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v8, Lsz0/p0$b;

    sget v3, Lwk0/b;->x:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lwk0/b;->z:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v5, Lwk0/b;->x0:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    and-int/lit8 v2, v2, 0xe

    if-ne v2, v4, :cond_3

    move v6, v7

    :cond_3
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_4

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_5

    :cond_4
    new-instance v2, Lsl0/a;

    const/16 v4, 0x9

    invoke-direct {v2, v0, v4}, Lsl0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v6, v2

    check-cast v6, Lc93/a;

    sget v2, Lsz0/p0$b;->h:I

    sget v4, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v4, 0x3

    or-int/2addr v2, v7

    shl-int/lit8 v4, v4, 0x9

    or-int v15, v2, v4

    const/16 v16, 0x6

    const/16 v17, 0xbe4

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v2, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_6
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lch0/t;

    const/16 v4, 0x15

    invoke-direct {v3, v1, v4, v0}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final D(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lsl0/p1;->C(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final F(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v0, p1

    move-object/from16 v13, p0

    check-cast v13, Lp1/q;

    const v1, 0x1709526e

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v13, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lsz0/p0$c;->f:I

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v4, 0x3

    or-int v14, v3, v4

    const/4 v15, 0x6

    const/16 v16, 0xbfc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lq81/f;

    const/16 v3, 0xd

    invoke-direct {v2, v0, v3}, Lq81/f;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final G(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lsl0/p1;->F(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lnl0/h;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/p1;->u(Lnl0/h;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsl0/p1;->t(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lnl0/d;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/p1;->y(Lnl0/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lnl0/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/p1;->z(Lkotlin/jvm/functions/Function1;Lnl0/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lnl0/n;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lsl0/p1;->v(Lnl0/n;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/p1;->q(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/p1;->p()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/p1;->D(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsl0/p1;->r(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsl0/p1;->G(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsl0/p1;->w(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lnl0/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsl0/p1;->B(Lnl0/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/p1;->A(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/p1;->E(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x5b2c7190

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x1

    const/4 v10, 0x2

    const/4 v11, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v3, p2, 0x6

    move/from16 v28, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p2, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v11

    goto :goto_0

    :cond_1
    move v4, v10

    :goto_0
    or-int v4, p2, v4

    move/from16 v28, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v28, p2

    :goto_1
    and-int/lit8 v4, v28, 0x3

    const/4 v12, 0x0

    if-eq v4, v10, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    move v4, v12

    :goto_2
    and-int/lit8 v5, v28, 0x1

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_4

    new-instance v2, Lsl0/a1;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lc93/a;

    move-object v15, v2

    goto :goto_3

    :cond_5
    move-object v15, v3

    :goto_3
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x6

    int-to-float v5, v4

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Ll0/m;->e:Ll0/h;

    sget-object v6, Lb2/e;->N:Lb2/k;

    const/16 v8, 0x36

    invoke-static {v5, v6, v7, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_6

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v7, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v6, v7, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v7, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0xf

    int-to-float v2, v2

    int-to-float v10, v11

    mul-float/2addr v2, v10

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o;->e()I

    move-result v6

    invoke-static {v6, v7, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->Y0()J

    move-result-wide v8

    move/from16 v16, v6

    move-wide/from16 v44, v8

    move-object v9, v5

    move-wide/from16 v5, v44

    const/16 v8, 0x1b0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v18, v3

    const/4 v3, 0x0

    move-object v11, v4

    move-object v4, v2

    move-object v2, v11

    move/from16 v19, v10

    move/from16 v11, v16

    move-object/from16 v10, v17

    move-object/from16 v13, v18

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/16 v2, 0x9

    int-to-float v2, v2

    mul-float v2, v2, v19

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v7, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v3, Lwk0/b;->w:I

    invoke-static {v3, v7, v12}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->q()Lb91/a;

    move-result-object v22

    invoke-virtual {v10, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v26, v6, 0x12

    const v27, 0x2fffa

    move v6, v2

    move-object v2, v3

    const/4 v3, 0x0

    move v8, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    move/from16 v23, v12

    const-wide/16 v11, 0x0

    move-object/from16 v25, v13

    const/4 v13, 0x0

    move-object/from16 v29, v14

    const/4 v14, 0x0

    move-object/from16 v30, v15

    const/16 v31, 0x4

    const-wide/16 v15, 0x0

    const/16 v32, 0x1

    const/16 v17, 0x0

    move/from16 v33, v18

    const/16 v18, 0x0

    move/from16 v34, v19

    const/16 v19, 0x0

    move-object/from16 v35, v20

    const/16 v20, 0x0

    move/from16 v36, v21

    const/16 v21, 0x0

    move/from16 v37, v23

    const/16 v23, 0x0

    move-object/from16 v38, v25

    const/16 v25, 0x0

    move-object/from16 v42, v29

    move-object/from16 v39, v30

    move/from16 v41, v33

    move/from16 v0, v34

    move/from16 v40, v36

    move-object/from16 v43, v38

    const/4 v1, 0x2

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    int-to-float v1, v1

    move-object/from16 v2, v43

    invoke-static {v1, v0, v2, v7}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget v0, Lwk0/b;->v:I

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v35

    move/from16 v3, v40

    invoke-virtual {v1, v7, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v4

    new-instance v14, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v14, v6}, Lw3/k;-><init>(I)V

    const v27, 0x2fdfa

    move/from16 v16, v3

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move/from16 v36, v16

    const-wide/16 v15, 0x0

    move-object/from16 v44, v2

    move-object v2, v0

    move-object/from16 v0, v44

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    move/from16 v6, v41

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v3, Lny0/v;->TextLarge:Lny0/v;

    sget v0, Lwk0/b;->u:I

    const/4 v2, 0x0

    invoke-static {v0, v7, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    move/from16 v11, v36

    invoke-virtual {v1, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    and-int/lit8 v5, v28, 0xe

    const/4 v6, 0x4

    if-ne v5, v6, :cond_9

    const/4 v12, 0x1

    goto :goto_5

    :cond_9
    move v12, v2

    :goto_5
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v12, :cond_b

    move-object/from16 v5, v42

    if-ne v2, v5, :cond_a

    goto :goto_6

    :cond_a
    move-object/from16 v14, v39

    goto :goto_7

    :cond_b
    :goto_6
    new-instance v2, Lsl0/a;

    const/16 v5, 0x8

    move-object/from16 v14, v39

    invoke-direct {v2, v14, v5}, Lsl0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_7
    move-object v10, v2

    check-cast v10, Lc93/a;

    const/16 v12, 0x30

    const/16 v13, 0x69

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v11, v7

    move-wide v6, v0

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v14, v3

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Lgt1/g;

    const/16 v2, 0x9

    move/from16 v3, p2

    move/from16 v4, p3

    invoke-direct {v1, v14, v3, v4, v2}, Lgt1/g;-><init>(Lc93/a;III)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final p()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lsl0/p1;->o(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnl0/h;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v9, p2

    check-cast v9, Lp1/q;

    const p2, -0x6aa0895

    invoke-virtual {v9, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_3
    and-int/lit8 v1, p2, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v1, v3, :cond_4

    move v1, v5

    goto :goto_3

    :cond_4
    move v1, v4

    :goto_3
    and-int/lit8 v3, p2, 0x1

    invoke-virtual {v9, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v3, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v0, v0

    mul-float/2addr v0, v6

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 p2, p2, 0x70

    if-ne p2, v2, :cond_5

    move v4, v5

    :cond_5
    or-int p2, v0, v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_6

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_7

    :cond_6
    new-instance v0, Lsl0/u;

    const/4 p2, 0x2

    invoke-direct {v0, p2, p0, p1}, Lsl0/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x6006

    const/16 v11, 0x1ee

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v11}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Leo2/k;

    const/4 v1, 0x3

    invoke-direct {v0, p3, v1, p0, p1}, Leo2/k;-><init>(IILjava/util/List;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final t(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 9

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnl0/h;

    new-instance v1, Lsl0/r0;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lsl0/r0;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lx1/b;

    const/4 v3, 0x1

    const v4, -0x1874c39b

    invoke-direct {v2, v1, v3, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v1, 0x0

    const/4 v4, 0x3

    invoke-static {p2, v1, v2, v4}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v0}, Lnl0/h;->a()Ljava/util/List;

    move-result-object v0

    new-instance v2, Lsc2/n;

    const/16 v5, 0x18

    invoke-direct {v2, v5}, Lsc2/n;-><init>(I)V

    sget-object v5, Lsl0/p1$c;->w:Lsl0/p1$c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    new-instance v7, Lsl0/p1$d;

    invoke-direct {v7, v2, v0}, Lsl0/p1$d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v2, Lsl0/p1$e;

    invoke-direct {v2, v5, v0}, Lsl0/p1$e;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v5, Lsl0/p1$f;

    invoke-direct {v5, v0, p1}, Lsl0/p1$f;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lx1/b;

    const v8, 0x2fd4df92

    invoke-direct {v0, v5, v3, v8}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v3, p2

    check-cast v3, Ln0/f;

    invoke-virtual {v3, v6, v7, v2, v0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object v0, Lsl0/m1;->a:Lsl0/m1;

    invoke-virtual {v0}, Lsl0/m1;->b()Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-static {p2, v1, v0, v4}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    goto :goto_0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lnl0/h;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v1

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lnl0/h;->b()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {p0, p2, p1}, Lsl0/h1;->b(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lnl0/n;)Ljava/lang/Object;
    .locals 1

    const-string v0, "conversation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lnl0/n;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lsl0/p1;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Lnl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl0/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lp1/q;

    const v2, 0x12bb586c

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_2

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v4

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :cond_4
    :goto_3
    and-int/lit8 v6, v2, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_5

    move v6, v8

    goto :goto_4

    :cond_5
    move v6, v9

    :goto_4
    and-int/lit8 v7, v2, 0x1

    invoke-virtual {v0, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_11

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_6

    new-instance v3, Lsc2/n;

    const/16 v5, 0x17

    invoke-direct {v3, v5}, Lsc2/n;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v3, p1

    :goto_5
    invoke-virtual {p0}, Lnl0/i;->d()Z

    move-result v5

    if-eqz v5, :cond_8

    const v2, 0x51470479

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-static {v0, v9}, Lsl0/p1;->F(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_8
    invoke-virtual {p0}, Lnl0/i;->c()Z

    move-result v5

    if-eqz v5, :cond_c

    const v5, 0x51470a45

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v2, v2, 0x70

    if-ne v2, v4, :cond_9

    goto :goto_6

    :cond_9
    move v8, v9

    :goto_6
    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_a

    if-ne v4, v6, :cond_b

    :cond_a
    new-instance v4, Lsl0/a0;

    const/16 v2, 0x8

    invoke-direct {v4, v2, v3, p0}, Lsl0/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lc93/a;

    invoke-static {v4, v0, v9}, Lsl0/p1;->C(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    invoke-virtual {p0}, Lnl0/i;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_10

    const v5, 0x51471c16

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v2, v2, 0x70

    if-ne v2, v4, :cond_d

    goto :goto_7

    :cond_d
    move v8, v9

    :goto_7
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v8, :cond_e

    if-ne v2, v6, :cond_f

    :cond_e
    new-instance v2, Lsl0/n;

    const/16 v4, 0x8

    invoke-direct {v2, v3, v4}, Lsl0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lc93/a;

    invoke-static {v2, v0, v9, v9}, Lsl0/p1;->o(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_10
    const v4, 0x51472ba7

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lnl0/i;->a()Ljava/util/List;

    move-result-object v4

    and-int/lit8 v2, v2, 0x70

    invoke-static {v4, v3, v0, v2}, Lsl0/p1;->s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v3, p1

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Lqk2/i;

    const/16 v5, 0x13

    move-object v1, p0

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final y(Lnl0/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lnl0/i;)Ll83/a0;
    .locals 1

    new-instance v0, Lnl0/d$f;

    invoke-virtual {p1}, Lnl0/i;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnl0/d$f;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
