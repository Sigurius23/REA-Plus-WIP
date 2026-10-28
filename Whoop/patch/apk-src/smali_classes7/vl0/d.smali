.class public abstract Lvl0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a7\u0010\u0013\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lvl0/e;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "t",
        "(Landroidx/compose/ui/Modifier;Lvl0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lm91/u;",
        "widget",
        "",
        "path",
        "G",
        "(Lm91/u;Ljava/lang/String;)Lm91/u;",
        "Lol0/c;",
        "viewState",
        "onEvent",
        "s",
        "(Landroidx/compose/ui/Modifier;Lol0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "event",
        "I",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V",
        "Lol0/c$a;",
        "Lol0/a;",
        "o",
        "(Lol0/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "H",
        "()Landroidx/compose/ui/Modifier;",
        "aiDashedBorderModifier",
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
.method private static final A(Landroidx/compose/ui/Modifier;Lvl0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lvl0/d;->t(Landroidx/compose/ui/Modifier;Lvl0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lol0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p4, v2

    move-object v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-virtual {p0}, Lol0/c;->e()Lm91/u;

    move-result-object v1

    new-instance v3, Law0/a;

    const/16 p0, 0xc

    invoke-direct {v3, p0, p2}, Law0/a;-><init>(ILandroidx/compose/ui/Modifier;)V

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_1

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p2, p0, :cond_2

    :cond_1
    new-instance p2, Lv41/b0;

    const/4 p0, 0x4

    invoke-direct {p2, p1, p0}, Lv41/b0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, -0xcdb823e

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lvl0/d;->I(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Landroidx/compose/ui/Modifier;Lol0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lvl0/d;->s(Landroidx/compose/ui/Modifier;Lol0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final G(Lm91/u;Ljava/lang/String;)Lm91/u;
    .locals 8

    const-string v0, "widget"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lih0/h0;

    if-eqz v0, :cond_2

    invoke-static {p1}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object p1

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object p1

    move-object v0, p0

    check-cast v0, Lih0/h0;

    const-string p0, "conversationFingerprint"

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    invoke-virtual {v0}, Lih0/h0;->c()Ljava/lang/String;

    move-result-object p0

    :cond_0
    move-object v3, p0

    const-string p0, "turnId"

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_1

    invoke-virtual {v0}, Lih0/h0;->g()Ljava/lang/String;

    move-result-object p0

    :cond_1
    move-object v4, p0

    const/16 v6, 0x13

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lih0/h0;->b(Lih0/h0;Lah0/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lih0/h0;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method private static final H()Landroidx/compose/ui/Modifier;
    .locals 8

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v3, v0, v1

    invoke-static {}, Lgb1/b0;->P()Li2/t;

    move-result-object v4

    const/4 v0, 0x3

    int-to-float v7, v0

    mul-float/2addr v1, v7

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    const/4 v0, 0x5

    int-to-float v6, v0

    invoke-static/range {v2 .. v7}, Lgb1/g;->e(Landroidx/compose/ui/Modifier;FLi2/t;Li2/a1;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public static final I(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lol0/a;

    if-nez v0, :cond_1

    instance-of v0, p0, Lc91/a;

    if-nez v0, :cond_1

    instance-of v0, p0, Lny0/h;

    if-nez v0, :cond_1

    instance-of v0, p0, Lcom/whoop/design/item/DesignItemInteraction;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lol0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lvl0/d;->F(Landroidx/compose/ui/Modifier;Lol0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lol0/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvl0/d;->z(Lol0/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lol0/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvl0/d;->y(Lol0/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lol0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvl0/d;->C(Lol0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvl0/d;->u(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lvl0/d;->p()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lol0/b;Ljava/lang/String;ZLih0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvl0/d;->w(Lol0/b;Ljava/lang/String;ZLih0/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;Lvl0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lvl0/d;->A(Landroidx/compose/ui/Modifier;Lvl0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lol0/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvl0/d;->q(Lol0/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lvl0/d;->E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/compose/ui/Modifier;Lol0/c;Lol0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lvl0/d;->x(Landroidx/compose/ui/Modifier;Lol0/c;Lol0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvl0/d;->B(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lol0/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvl0/d;->r(Lol0/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvl0/d;->D(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lol0/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lol0/c$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v3, 0x7bb266ac

    invoke-virtual {v6, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v5, p3, 0x30

    const/16 v7, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v7

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v8, 0x12

    const/4 v15, 0x1

    const/4 v9, 0x0

    if-eq v5, v8, :cond_5

    move v5, v15

    goto :goto_4

    :cond_5
    move v5, v9

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v6, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-virtual {v0}, Lol0/c$a;->b()Le31/c;

    move-result-object v5

    invoke-virtual {v5}, Le31/c;->j()Lsz0/p0;

    move-result-object v8

    instance-of v10, v8, Lsz0/p0$c;

    if-eqz v10, :cond_9

    const v3, 0x4d565345    # 2.2473634E8f

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-static {}, Lvl0/d;->H()Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x6

    int-to-float v5, v5

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v5, v7

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-eqz v11, :cond_6

    invoke-virtual {v6, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v6, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v6, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v7, v6, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v6, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide v7, 0x4036800000000000L    # 22.5

    double-to-float v3, v7

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v4, Lgy0/e;->b:I

    invoke-static {v4}, Lv41/r0$d;->b(I)I

    move-result v4

    invoke-static {v4}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v4

    const/4 v13, 0x6

    const/16 v14, 0x1fc

    const/4 v5, 0x0

    move-object v12, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v2, v16

    invoke-static/range {v3 .. v14}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_9
    move-object v12, v6

    move v2, v9

    instance-of v6, v8, Lsz0/p0$h;

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    const v3, 0x4d5687ef    # 2.2495205E8f

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Le31/c;->j()Lsz0/p0;

    move-result-object v3

    invoke-virtual {v3}, Lsz0/p0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_a

    new-instance v3, Lve/a;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lve/a;-><init>(I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v17, v3

    check-cast v17, Lc93/a;

    new-instance v13, Lsz0/p0$h;

    const-wide/16 v15, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v19}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Le31/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v18, Le31/c;

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x39

    const/16 v26, 0x0

    move-object/from16 v20, v13

    invoke-direct/range {v18 .. v26}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v7, Le31/c;->g:I

    const/4 v8, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v12

    move-object/from16 v3, v18

    invoke-static/range {v3 .. v8}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_b
    const v5, 0x4d56b2cc

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-static {}, Lvl0/d;->H()Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    :cond_d
    invoke-static {v9, v12, v9, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v5, v3

    invoke-virtual {v0}, Lol0/c$a;->b()Le31/c;

    move-result-object v3

    and-int/lit8 v6, v5, 0xe

    if-eq v6, v4, :cond_10

    and-int/lit8 v4, v5, 0x8

    if-eqz v4, :cond_f

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    goto :goto_7

    :cond_f
    move v9, v2

    goto :goto_8

    :cond_10
    :goto_7
    move v9, v15

    :goto_8
    and-int/lit8 v4, v5, 0x70

    if-ne v4, v7, :cond_11

    move v4, v15

    goto :goto_9

    :cond_11
    move v4, v2

    :goto_9
    or-int/2addr v4, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_12

    if-ne v5, v8, :cond_13

    :cond_12
    new-instance v5, Lui0/q;

    const/16 v4, 0x11

    invoke-direct {v5, v0, v1, v4}, Lui0/q;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Lc93/a;

    sget v7, Le31/c;->g:I

    const/4 v8, 0x2

    const/4 v4, 0x0

    move-object v6, v12

    invoke-static/range {v3 .. v8}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_14
    move-object v12, v6

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_15

    new-instance v3, Lv90/e;

    const/4 v4, 0x5

    move/from16 v5, p3

    invoke-direct {v3, v0, v1, v5, v4}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final p()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q(Lol0/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lol0/c$a;->a()Lol0/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lol0/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lvl0/d;->o(Lol0/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Landroidx/compose/ui/Modifier;Lol0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lol0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p3

    check-cast v0, Lp1/q;

    const v1, 0x55b9e3d1

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, p4, 0x6

    move v5, v3

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, p4

    goto :goto_1

    :cond_2
    move v5, p4

    :goto_1
    and-int/lit8 v6, p4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v5, v5, 0x180

    goto :goto_4

    :cond_5
    and-int/lit16 v7, p4, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v0, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    :cond_7
    :goto_4
    and-int/lit16 v8, v5, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move v8, v10

    :goto_5
    and-int/lit8 v9, v5, 0x1

    invoke-virtual {v0, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_e

    if-eqz v1, :cond_9

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v1, p0

    :goto_6
    if-eqz v6, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v3, v6, :cond_a

    new-instance v3, Lve0/d;

    const/16 v6, 0xa

    invoke-direct {v3, v6}, Lve0/d;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v3, p2

    :goto_7
    invoke-virtual {p1}, Lol0/c;->c()Lol0/c$a;

    move-result-object v6

    if-eqz v6, :cond_c

    const v6, -0x312fb31e

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lol0/c;->c()Lol0/c$a;

    move-result-object v6

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0x70

    invoke-static {v6, v3, v0, v5}, Lvl0/d;->o(Lol0/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    invoke-virtual {p1}, Lol0/c;->e()Lm91/u;

    move-result-object v5

    if-eqz v5, :cond_d

    const v5, -0x312f9f69

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-static {}, Lm91/l;->C()Lp1/t1;

    move-result-object v5

    invoke-static {}, Lsl0/m0;->c()Lm91/p;

    move-result-object v6

    invoke-virtual {v5, v6}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v5

    new-instance v6, Lvl0/c;

    const/4 v7, 0x0

    invoke-direct {v6, p1, v3, v1, v7}, Lvl0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v7, -0x39d494ce

    invoke-static {v7, v0, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/16 v7, 0x38

    invoke-static {v5, v6, v0, v7}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const v5, 0xb409151

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, p0

    move-object v3, p2

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Lv31/d;

    const/16 v6, 0x9

    move-object v2, p1

    move v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lv31/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final t(Landroidx/compose/ui/Modifier;Lvl0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lvl0/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x49dbb86a    # 1799949.2f

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit16 v7, v3, 0x93

    const/16 v9, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v7, v9, :cond_8

    move v7, v12

    goto :goto_5

    :cond_8
    move v7, v11

    :goto_5
    and-int/2addr v3, v12

    invoke-virtual {v8, v3, v7}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_22

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v14, v0

    goto :goto_6

    :cond_9
    move-object v14, v1

    :goto_6
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    new-instance v1, Lve0/d;

    const/16 v3, 0xb

    invoke-direct {v1, v3}, Lve0/d;-><init>(I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object/from16 v17, v1

    goto :goto_7

    :cond_b
    move-object/from16 v17, v6

    :goto_7
    invoke-virtual {v2}, Lvl0/e;->b()Lol0/c;

    move-result-object v1

    invoke-virtual {v2}, Lvl0/e;->a()Ljava/lang/String;

    move-result-object v3

    const v5, 0x51c1188b

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v8, v6}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v5

    const-string v6, "safe-design-view-model-injection-android"

    invoke-interface {v5, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    const-class v6, Lol0/b;

    const/4 v13, 0x0

    const/4 v7, 0x0

    if-nez v5, :cond_12

    const v5, -0x2a32dbfc

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-static {v8}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v19

    if-nez v19, :cond_c

    const v5, -0x2a322beb

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    move-object v5, v7

    move-object v9, v13

    goto :goto_a

    :cond_c
    const v5, -0x2a322bea

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const-string v9, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v18, v5

    check-cast v18, Landroid/app/Application;

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_e

    if-ne v9, v0, :cond_d

    goto :goto_8

    :cond_d
    move-object v5, v7

    goto :goto_9

    :cond_e
    :goto_8
    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v20

    new-instance v5, Lld1/b;

    invoke-direct {v5, v1}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v23, v3

    move-object/from16 v22, v5

    move-object/from16 v21, v7

    invoke-static/range {v18 .. v23}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v9

    move-object/from16 v5, v21

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v9, Lld1/c;

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_a
    if-nez v9, :cond_11

    const v6, -0x2a2a887e

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_f

    if-ne v5, v0, :cond_10

    :cond_f
    new-instance v5, Lld1/b;

    invoke-direct {v5, v1}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v9, v5

    check-cast v9, Lld1/b;

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    const v1, -0x1a22aa39

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_12
    move-object v5, v7

    const v7, -0x2a28ba09

    invoke-static {v8, v7, v11, v8}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v18

    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    instance-of v9, v7, Landroid/app/Application;

    if-eqz v9, :cond_13

    check-cast v7, Landroid/app/Application;

    move-object/from16 v20, v7

    goto :goto_d

    :cond_13
    move-object/from16 v20, v13

    :goto_d
    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_14

    if-ne v9, v0, :cond_15

    :cond_14
    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v21

    move-object/from16 v19, v1

    move-object/from16 v23, v3

    move-object/from16 v22, v5

    invoke-static/range {v18 .. v23}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v9

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v9, Lld1/c;

    goto :goto_c

    :goto_e
    const-string v1, "null cannot be cast to non-null type com.whoop.bot.presentation.chatminiarchwidget.ChatMiniArchWidgetViewModel"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v9

    check-cast v1, Lol0/b;

    invoke-virtual {v1}, Lol0/b;->getViewState()Lec3/l;

    move-result-object v5

    invoke-virtual {v2}, Lvl0/e;->b()Lol0/c;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_16

    if-ne v6, v0, :cond_17

    :cond_16
    new-instance v6, Lvl0/d$a;

    invoke-direct {v6, v1, v2, v13}, Lvl0/d$a;-><init>(Lol0/b;Lvl0/e;Lq83/d;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v6, Lc93/m;

    invoke-static {v8, v6, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Lvl0/d;->v(Lp1/t2;)Lol0/c;

    move-result-object v5

    invoke-virtual {v2}, Lvl0/e;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_18

    if-ne v6, v0, :cond_1b

    :cond_18
    invoke-static {v3}, Lvl0/d;->v(Lp1/t2;)Lol0/c;

    move-result-object v5

    invoke-virtual {v5}, Lol0/c;->e()Lm91/u;

    move-result-object v5

    if-eqz v5, :cond_1a

    invoke-static {v3}, Lvl0/d;->v(Lp1/t2;)Lol0/c;

    move-result-object v6

    invoke-virtual {v2}, Lvl0/e;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lvl0/d;->G(Lm91/u;Ljava/lang/String;)Lm91/u;

    move-result-object v5

    invoke-static {v6, v13, v5, v12, v13}, Lol0/c;->b(Lol0/c;Lol0/c$a;Lm91/u;ILjava/lang/Object;)Lol0/c;

    move-result-object v5

    if-nez v5, :cond_19

    goto :goto_f

    :cond_19
    move-object v6, v5

    goto :goto_10

    :cond_1a
    :goto_f
    invoke-static {v3}, Lvl0/d;->v(Lp1/t2;)Lol0/c;

    move-result-object v3

    move-object v6, v3

    :goto_10
    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v15, v6

    check-cast v15, Lol0/c;

    invoke-virtual {v15}, Lol0/c;->e()Lm91/u;

    move-result-object v3

    instance-of v5, v3, Lih0/h0;

    if-eqz v5, :cond_1c

    check-cast v3, Lih0/h0;

    goto :goto_11

    :cond_1c
    move-object v3, v13

    :goto_11
    if-eqz v3, :cond_1d

    invoke-virtual {v3}, Lih0/h0;->c()Ljava/lang/String;

    move-result-object v13

    :cond_1d
    if-nez v13, :cond_1e

    const-string v13, ""

    :cond_1e
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1f

    move v11, v12

    :cond_1f
    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v8, v11}, Lp1/q;->h(Z)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_20

    if-ne v5, v0, :cond_21

    :cond_20
    new-instance v5, Lam2/i0;

    const/16 v0, 0xe

    invoke-direct {v5, v1, v13, v11, v0}, Lam2/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {}, Lih0/c;->e()Lp1/t1;

    move-result-object v0

    invoke-virtual {v0, v5}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v13, Lo71/b;

    const/16 v18, 0x9

    move-object/from16 v16, v1

    invoke-direct/range {v13 .. v18}, Lo71/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    const v1, -0x1f3df2d6

    invoke-static {v1, v8, v13}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v3, 0x38

    invoke-static {v0, v1, v8, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v1, v14

    move-object/from16 v3, v17

    goto :goto_12

    :cond_22
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v6

    :goto_12
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_23

    new-instance v0, Lv31/d;

    const/16 v6, 0xa

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lv31/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final u(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/t2;)Lol0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lol0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lol0/c;

    return-object p0
.end method

.method private static final w(Lol0/b;Ljava/lang/String;ZLih0/b;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p1, p2}, Lol0/b;->n(Lih0/b;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Landroidx/compose/ui/Modifier;Lol0/c;Lol0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p5, v2

    move-object v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p5, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {v4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p4, p5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_1

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne p5, p4, :cond_2

    :cond_1
    new-instance p5, Lvl0/b;

    const/4 p4, 0x1

    invoke-direct {p5, p2, p3, p4}, Lvl0/b;-><init>(Lol0/b;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p5

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lvl0/d;->s(Landroidx/compose/ui/Modifier;Lol0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lol0/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvl0/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lvl0/b;-><init>(Lol0/b;Lkotlin/jvm/functions/Function1;I)V

    invoke-static {p2, v0}, Lvl0/d;->I(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lol0/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "routed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lol0/a;

    if-eqz v0, :cond_0

    check-cast p2, Lol0/a;

    invoke-virtual {p0, p2}, Lol0/b;->o(Lol0/a;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
