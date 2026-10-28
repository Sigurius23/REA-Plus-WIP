.class public abstract Lnr0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aA\u0010\u0011\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001aA\u0010\u0016\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00142\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a5\u0010\u0018\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\'\u0010\u001d\u001a\u00020\u00062\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001bH\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006!\u00b2\u0006\u000c\u0010\u0013\u001a\u00020\u000f8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lny0/h;",
        "state",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "primaryAnalyticEvent",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "G",
        "(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lnr0/g;",
        "itemState",
        "onViewEvent",
        "Lnr0/c;",
        "defaultViewState",
        "w",
        "(Landroidx/compose/ui/Modifier;Lnr0/g;Lkotlin/jvm/functions/Function1;Lnr0/c;Landroidx/compose/runtime/Composer;II)V",
        "viewState",
        "",
        "path",
        "n",
        "(Landroidx/compose/ui/Modifier;Lnr0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "s",
        "(Landroidx/compose/ui/Modifier;Lnr0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "error",
        "Lkotlin/Function0;",
        "onDismiss",
        "C",
        "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "E",
        "(Landroidx/compose/runtime/Composer;I)V",
        "community-highlights_release"
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
.method private static final A(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lnr0/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lld1/c;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Landroidx/compose/ui/Modifier;Lnr0/g;Lkotlin/jvm/functions/Function1;Lnr0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lnr0/f;->w(Landroidx/compose/ui/Modifier;Lnr0/g;Lkotlin/jvm/functions/Function1;Lnr0/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    check-cast p2, Lp1/q;

    const v0, 0x2edac2b0

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

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v1, v3, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v5

    :goto_3
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    if-eqz p0, :cond_8

    const v3, -0x7c9801e8

    invoke-virtual {p2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_5

    goto :goto_4

    :cond_5
    move v4, v5

    :goto_4
    or-int v0, v3, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_6

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_7

    :cond_6
    new-instance v2, Lnr0/f$b;

    const/4 v0, 0x0

    invoke-direct {v2, v1, p1, v0}, Lnr0/f$b;-><init>(Landroid/content/Context;Lc93/a;Lq83/d;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/m;

    invoke-static {p2, v2, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    const v0, -0x7c94576e

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Lcp0/i;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p1, p3, v1}, Lcp0/i;-><init>(Ljava/lang/String;Lc93/a;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final D(Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lnr0/f;->C(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v9, p0

    check-cast v9, Lp1/q;

    const p0, 0x39ba5f4b

    invoke-virtual {v9, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    const/4 v12, 0x1

    if-eqz p1, :cond_0

    move v0, v12

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lny0/g;->COMPACT:Lny0/g;

    invoke-virtual {v2}, Lny0/g;->getVerticalPadding-D9Ej5fM()F

    move-result v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, p0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p0

    iget-wide v2, v9, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v9, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v9, v4, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->f:La3/i;

    invoke-static {v9, p0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->j:La3/i;

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v2, v9, v2, p0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p0, La3/k;->d:La3/i;

    invoke-static {v9, p0, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 p0, 0x4

    int-to-float p0, p0

    mul-float/2addr p0, p0

    invoke-static {p0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget p0, Lgy0/e;->d:I

    invoke-static {p0}, Lv41/r0$d;->b(I)I

    move-result p0

    invoke-static {p0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v1

    const/4 v10, 0x6

    const/16 v11, 0x1fc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lm22/t;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final F(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lnr0/f;->E(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final G(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lny0/h;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    invoke-static {p0, p1, p2}, Lev/n;->y(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    new-instance p0, Lnr0/a$c;

    invoke-direct {p0, v0}, Lnr0/a$c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    if-eqz p1, :cond_2

    new-instance v0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-direct {v0, p0, p1}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lnr0/f;->u(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lnr0/f;->A(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnr0/f;->p(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lny0/h;Lm91/o;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lnr0/f;->t(Lm91/u;Lm91/o;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lnr0/g;Lkotlin/jvm/functions/Function1;Lnr0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lnr0/f;->B(Landroidx/compose/ui/Modifier;Lnr0/g;Lkotlin/jvm/functions/Function1;Lnr0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lnr0/f;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3, p4}, Lnr0/f;->D(Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnr0/f;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lnr0/f;->F(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;Lnr0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lnr0/f;->r(Landroidx/compose/ui/Modifier;Lnr0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/compose/ui/Modifier;Lnr0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lnr0/f;->v(Landroidx/compose/ui/Modifier;Lnr0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnr0/f;->x(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lnr0/g;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lnr0/f;->y(Lnr0/g;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Landroidx/compose/ui/Modifier;Lnr0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lnr0/c;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move/from16 v6, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x6412ac76

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v6, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v6

    :goto_1
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v3, v8

    :goto_4
    and-int/lit8 v8, p6, 0x8

    const/16 v9, 0x800

    if-eqz v8, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    move v12, v9

    goto :goto_5

    :cond_a
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v3, v12

    :goto_6
    and-int/lit16 v12, v3, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    if-eq v12, v13, :cond_b

    const/4 v12, 0x1

    goto :goto_7

    :cond_b
    move v12, v14

    :goto_7
    and-int/lit8 v13, v3, 0x1

    invoke-virtual {v10, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1d

    if-eqz v0, :cond_c

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v13, v0

    goto :goto_8

    :cond_c
    move-object v13, v2

    :goto_8
    if-eqz v4, :cond_d

    const-string v0, ""

    goto :goto_9

    :cond_d
    move-object v0, v7

    :goto_9
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_e

    new-instance v4, Lno1/g;

    const/16 v7, 0xb

    invoke-direct {v4, v7}, Lno1/g;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_f
    move-object v4, v11

    :goto_a
    invoke-virtual {v1}, Lnr0/c;->b()Ljava/lang/String;

    move-result-object v7

    and-int/lit16 v8, v3, 0x1c00

    if-ne v8, v9, :cond_10

    const/4 v11, 0x1

    goto :goto_b

    :cond_10
    move v11, v14

    :goto_b
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_11

    if-ne v12, v2, :cond_12

    :cond_11
    new-instance v12, Lmf2/e;

    const/16 v11, 0x18

    invoke-direct {v12, v4, v11}, Lmf2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v12, Lc93/a;

    invoke-static {v7, v12, v10, v14}, Lnr0/f;->C(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_13

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v10, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_15

    :cond_14
    invoke-static {v5, v10, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnr0/c;->f()Z

    move-result v5

    if-eqz v5, :cond_16

    const v2, 0x3491ec9a

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    sget-object v2, Le31/d;->a:Le31/d;

    invoke-virtual {v2}, Le31/d;->a()Le31/c;

    move-result-object v7

    sget v11, Le31/c;->g:I

    const/4 v12, 0x6

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_d
    move-object v7, v0

    move-object v2, v4

    :goto_e
    const/4 v0, 0x1

    goto/16 :goto_11

    :cond_16
    invoke-virtual {v1}, Lnr0/c;->e()Z

    move-result v5

    if-eqz v5, :cond_1b

    const v5, 0x3491fea6

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Le31/d;->a:Le31/d;

    invoke-virtual {v5}, Le31/d;->c()Le31/c;

    move-result-object v7

    if-ne v8, v9, :cond_17

    const/4 v5, 0x1

    goto :goto_f

    :cond_17
    move v5, v14

    :goto_f
    and-int/lit16 v3, v3, 0x380

    const/16 v6, 0x100

    if-ne v3, v6, :cond_18

    const/4 v3, 0x1

    goto :goto_10

    :cond_18
    move v3, v14

    :goto_10
    or-int/2addr v3, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_19

    if-ne v5, v2, :cond_1a

    :cond_19
    new-instance v5, Lc41/j0;

    const/16 v2, 0x8

    invoke-direct {v5, v4, v0, v2}, Lc41/j0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v9, v5

    check-cast v9, Lc93/a;

    sget v11, Le31/c;->g:I

    const/4 v12, 0x2

    const/4 v8, 0x0

    invoke-static/range {v7 .. v12}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_1b
    invoke-virtual {v1}, Lnr0/c;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1c

    const v2, 0x34921ecb

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, v3, 0x70

    shr-int/lit8 v3, v3, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    const/4 v5, 0x1

    move-object v7, v0

    const/4 v0, 0x0

    move-object v3, v4

    move v4, v2

    move-object v2, v3

    move-object v3, v10

    invoke-static/range {v0 .. v5}, Lnr0/f;->s(Landroidx/compose/ui/Modifier;Lnr0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1c
    move-object v7, v0

    move-object v2, v4

    const v0, 0x5db3af12

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_11
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object v4, v2

    move-object v1, v13

    :goto_12
    move-object v3, v7

    goto :goto_13

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v2

    move-object v4, v11

    goto :goto_12

    :goto_13
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1e

    new-instance v0, Lkw1/c;

    const/16 v7, 0x19

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final o(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lnr0/a$a;->a:Lnr0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Lnr0/a$b;

    invoke-direct {v0, p1}, Lnr0/a$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Landroidx/compose/ui/Modifier;Lnr0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lnr0/f;->n(Landroidx/compose/ui/Modifier;Lnr0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;Lnr0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lnr0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move/from16 v7, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x54cac416

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, v7, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v4, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_4

    move-object/from16 v5, p1

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    goto :goto_3

    :cond_4
    move-object/from16 v5, p1

    :goto_3
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v4, v6

    :cond_6
    and-int/lit16 v6, v4, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    if-eq v6, v9, :cond_7

    const/4 v6, 0x1

    goto :goto_5

    :cond_7
    move v6, v10

    :goto_5
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v12, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_16

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_8

    move-object v0, v6

    goto :goto_6

    :cond_8
    move-object v0, v2

    :goto_6
    invoke-virtual {v5}, Lnr0/c;->c()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v2

    shr-int/lit8 v9, v4, 0x3

    and-int/lit8 v9, v9, 0x70

    invoke-static {v2, v3, v12, v9}, Lsz0/t0;->c(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v1, v1

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v1, v13

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v1, v14, v12, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v12, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v12, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v14, v12, v14, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lnr0/c;->d()Ljava/lang/String;

    move-result-object v1

    const/16 v34, 0x0

    if-eqz v1, :cond_c

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_c

    move-object v8, v1

    goto :goto_8

    :cond_c
    move-object/from16 v8, v34

    :goto_8
    if-nez v8, :cond_d

    const v1, -0x22bec988

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move v1, v10

    goto/16 :goto_9

    :cond_d
    const v1, -0x22bec987

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v14

    mul-float v18, v1, v13

    const/16 v21, 0x0

    const/16 v22, 0xe

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v1, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v1, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->P()Lb91/a;

    move-result-object v28

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v32, v1, 0x12

    const v33, 0x2fff8

    move v1, v10

    move-object/from16 v30, v12

    move-wide v10, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    move/from16 v19, v17

    const-wide/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const-wide/16 v21, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v31, v29

    const/16 v29, 0x0

    move/from16 v35, v31

    const/16 v31, 0x0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_9
    const v8, -0x3aed396b

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lnr0/c;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    move v10, v1

    :goto_a
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_15

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v16, v10, 0x1

    if-ltz v10, :cond_14

    check-cast v8, Lm91/o;

    invoke-virtual {v8}, Lm91/o;->c()Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_e

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    :cond_e
    const v10, 0x194f887a

    invoke-virtual {v12, v10, v9}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-virtual {v8}, Lm91/o;->e()Lm91/u;

    move-result-object v9

    instance-of v10, v9, Lny0/h;

    if-eqz v10, :cond_13

    const v10, 0x194f960e

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lnr0/c;->g()Z

    move-result v10

    if-eqz v10, :cond_f

    const v8, 0x194f9bc5

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-static {v12, v1}, Lnr0/f;->E(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    const/16 v36, 0x100

    goto :goto_c

    :cond_f
    const v10, 0x194fa34a

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move-object v11, v9

    check-cast v11, Lny0/h;

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v9, v13

    and-int/lit16 v13, v4, 0x380

    const/16 v14, 0x100

    if-ne v13, v14, :cond_10

    const/4 v13, 0x1

    goto :goto_b

    :cond_10
    move v13, v1

    :goto_b
    or-int/2addr v9, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_11

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v13, v9, :cond_12

    :cond_11
    new-instance v13, Ln0/j;

    const/4 v9, 0x6

    invoke-direct {v13, v11, v8, v3, v9}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v13, Lc93/a;

    move-object v9, v11

    move-object v11, v13

    const/4 v13, 0x6

    move/from16 v36, v14

    const/4 v14, 0x4

    move-object v8, v10

    const/4 v10, 0x0

    invoke-static/range {v8 .. v14}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object v9, v0

    move v13, v1

    move v10, v2

    move v8, v4

    move-object v11, v6

    goto :goto_d

    :cond_13
    const/16 v36, 0x100

    const v9, 0x194fcc68

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    move v9, v2

    new-instance v2, Lno0/r0;

    const/4 v10, 0x1

    invoke-direct {v2, v10}, Lno0/r0;-><init>(I)V

    sget v10, Lm91/o;->c:I

    shl-int/lit8 v11, v4, 0x3

    and-int/lit16 v11, v11, 0x1c00

    or-int/2addr v10, v11

    move-object v11, v6

    const/4 v6, 0x2

    move v13, v1

    const/4 v1, 0x0

    move v5, v10

    move v10, v9

    move-object v9, v0

    move-object v0, v8

    move v8, v4

    move-object v4, v12

    invoke-static/range {v0 .. v6}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    move-object/from16 v5, p1

    move-object/from16 v3, p2

    move v4, v8

    move-object v0, v9

    move v2, v10

    move-object v6, v11

    move v1, v13

    move/from16 v10, v16

    goto/16 :goto_a

    :cond_14
    invoke-static {}, Lwb3/f;->d0()V

    throw v34

    :cond_15
    move-object v9, v0

    move v13, v1

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object v1, v9

    goto :goto_e

    :cond_16
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, v2

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lm31/h;

    const/16 v6, 0x15

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move v4, v7

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final t(Lm91/u;Lm91/o;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    check-cast p0, Lny0/h;

    invoke-virtual {p1}, Lm91/o;->d()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lnr0/f;->G(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x371013f0

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    return-object p0
.end method

.method private static final v(Landroidx/compose/ui/Modifier;Lnr0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lnr0/f;->s(Landroidx/compose/ui/Modifier;Lnr0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Landroidx/compose/ui/Modifier;Lnr0/g;Lkotlin/jvm/functions/Function1;Lnr0/c;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lnr0/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lnr0/c;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, 0x89f2128

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v5, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    const/16 v12, 0x20

    if-nez v6, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v12

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    :goto_4
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_a

    and-int/lit8 v8, p6, 0x8

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_5

    :cond_8
    move-object/from16 v8, p3

    :cond_9
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v4, v10

    goto :goto_6

    :cond_a
    move-object/from16 v8, p3

    :goto_6
    and-int/lit16 v10, v4, 0x493

    const/16 v11, 0x492

    const/4 v14, 0x0

    if-eq v10, v11, :cond_b

    const/4 v10, 0x1

    goto :goto_7

    :cond_b
    move v10, v14

    :goto_7
    and-int/lit8 v11, v4, 0x1

    invoke-virtual {v9, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_2f

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v10, v5, 0x1

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_f

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_d

    and-int/lit16 v4, v4, -0x1c01

    :cond_d
    move-object v0, v3

    move-object v3, v7

    :cond_e
    move-object v7, v8

    goto :goto_b

    :cond_f
    :goto_8
    if-eqz v0, :cond_10

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_9

    :cond_10
    move-object v0, v3

    :goto_9
    if-eqz v6, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_11

    new-instance v3, Lno1/g;

    const/16 v6, 0xa

    invoke-direct {v3, v6}, Lno1/g;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_12
    move-object v3, v7

    :goto_a
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_e

    new-instance v16, Lnr0/c;

    const/16 v25, 0xfe

    const/16 v26, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v26}, Lnr0/c;-><init>(ZZZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v4, v4, -0x1c01

    move-object/from16 v7, v16

    :goto_b
    invoke-virtual {v9}, Lp1/q;->r()V

    and-int/lit8 v6, v4, 0x70

    if-ne v6, v12, :cond_13

    const/4 v8, 0x1

    goto :goto_c

    :cond_13
    move v8, v14

    :goto_c
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_14

    if-ne v10, v11, :cond_15

    :cond_14
    new-instance v10, Lnr0/e;

    const/4 v8, 0x0

    invoke-direct {v10, v2, v8}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v10, Lc93/a;

    shr-int/lit8 v8, v4, 0x9

    const v15, 0x51c1188b

    invoke-virtual {v9, v15}, Lp1/q;->e0(I)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v15, v9, v13}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v15

    move/from16 p0, v13

    const-string v13, "safe-design-view-model-injection-android"

    invoke-interface {v15, v13}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v13

    const-class v15, Lnr0/b;

    const/4 v12, 0x0

    if-nez v13, :cond_22

    const v13, -0x2a32dbfc

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    invoke-static {v9}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_16

    const v13, -0x2a322beb

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    goto :goto_e

    :cond_16
    const v13, -0x2a322bea

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    sget-object v13, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    const-string v14, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v13

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit8 v14, v8, 0xe

    xor-int/lit8 v14, v14, 0x6

    if-le v14, v1, :cond_17

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_18

    :cond_17
    and-int/lit8 v14, v8, 0x6

    if-ne v14, v1, :cond_19

    :cond_18
    const/4 v14, 0x1

    goto :goto_d

    :cond_19
    const/4 v14, 0x0

    :goto_d
    or-int/2addr v13, v14

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_1a

    if-ne v14, v11, :cond_1b

    :cond_1a
    sget-object v13, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v13, Lld1/b;

    invoke-direct {v13, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v19, v10

    move-object/from16 v21, v12

    move-object/from16 v20, v13

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v14

    invoke-virtual {v9, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v14, Lld1/c;

    const/4 v13, 0x0

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_e
    if-nez v14, :cond_21

    const v13, -0x2a2a887e

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit8 v13, v8, 0xe

    xor-int/lit8 v13, v13, 0x6

    if-le v13, v1, :cond_1c

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1d

    :cond_1c
    and-int/lit8 v8, v8, 0x6

    if-ne v8, v1, :cond_1e

    :cond_1d
    const/4 v1, 0x1

    goto :goto_f

    :cond_1e
    const/4 v1, 0x0

    :goto_f
    or-int/2addr v1, v12

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v1, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_1f

    if-ne v8, v11, :cond_20

    :cond_1f
    new-instance v8, Lld1/b;

    invoke-direct {v8, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object v14, v8

    check-cast v14, Lld1/b;

    const/4 v13, 0x0

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_21
    const/4 v13, 0x0

    const v1, -0x1a22aa39

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object/from16 v17, v7

    :goto_11
    move v1, v6

    goto :goto_16

    :cond_22
    move v13, v14

    const v14, -0x2a28ba09

    invoke-static {v9, v14, v13, v9}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v16

    sget-object v13, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    instance-of v14, v13, Landroid/app/Application;

    if-eqz v14, :cond_23

    check-cast v13, Landroid/app/Application;

    move-object/from16 v18, v13

    goto :goto_12

    :cond_23
    const/16 v18, 0x0

    :goto_12
    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit8 v14, v8, 0xe

    xor-int/lit8 v14, v14, 0x6

    if-le v14, v1, :cond_24

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_25

    :cond_24
    and-int/lit8 v8, v8, 0x6

    if-ne v8, v1, :cond_26

    :cond_25
    const/4 v1, 0x1

    goto :goto_13

    :cond_26
    const/4 v1, 0x0

    :goto_13
    or-int/2addr v1, v13

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v1, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_28

    if-ne v8, v11, :cond_27

    goto :goto_14

    :cond_27
    move-object/from16 v17, v7

    goto :goto_15

    :cond_28
    :goto_14
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    move-object/from16 v17, v7

    move-object/from16 v20, v10

    move-object/from16 v21, v12

    invoke-static/range {v16 .. v21}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v8

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    move-object v14, v8

    check-cast v14, Lld1/c;

    const/4 v13, 0x0

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_11

    :goto_16
    invoke-virtual {v14}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v6

    shr-int/lit8 v7, v4, 0x6

    and-int/lit8 v10, v7, 0x70

    move-object v7, v11

    const/4 v11, 0x2

    const/4 v8, 0x0

    move-object v12, v7

    move-object/from16 v7, v17

    invoke-static/range {v6 .. v11}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v6

    invoke-virtual {v2}, Lnr0/g;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    const/16 v10, 0x20

    if-ne v1, v10, :cond_29

    const/4 v1, 0x1

    goto :goto_17

    :cond_29
    move v1, v13

    :goto_17
    or-int/2addr v1, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_2a

    if-ne v8, v12, :cond_2b

    :cond_2a
    new-instance v8, Lnr0/f$a;

    const/4 v1, 0x0

    invoke-direct {v8, v14, v2, v1}, Lnr0/f$a;-><init>(Lld1/c;Lnr0/g;Lq83/d;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v8, Lc93/m;

    invoke-static {v9, v8, v7}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6}, Lnr0/f;->z(Lp1/t2;)Lnr0/c;

    move-result-object v7

    invoke-virtual {v2}, Lnr0/g;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v6, v4, 0x380

    const/16 v10, 0x100

    if-ne v6, v10, :cond_2c

    const/4 v13, 0x1

    :cond_2c
    or-int/2addr v1, v13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_2d

    if-ne v6, v12, :cond_2e

    :cond_2d
    new-instance v6, Lb03/b;

    const/4 v1, 0x5

    invoke-direct {v6, v14, v3, v1}, Lb03/b;-><init>(Lld1/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v6, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v11, v4, 0xe

    const/4 v12, 0x0

    move-object v10, v9

    move-object v9, v6

    move-object v6, v0

    invoke-static/range {v6 .. v12}, Lnr0/f;->n(Landroidx/compose/ui/Modifier;Lnr0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    move-object v1, v6

    move-object/from16 v4, v17

    goto :goto_18

    :cond_2f
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v7

    move-object v4, v8

    :goto_18
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_30

    new-instance v0, Lkw1/c;

    const/16 v7, 0x18

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final x(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lnr0/g;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Lnr0/g;->b()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final z(Lp1/t2;)Lnr0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lnr0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnr0/c;

    return-object p0
.end method
