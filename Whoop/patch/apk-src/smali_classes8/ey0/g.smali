.class public abstract Ley0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u001a?\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a?\u0010\u0012\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a-\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019\u00b2\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcy0/c$d;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcy0/a;",
        "Ll83/a0;",
        "onEvent",
        "",
        "pillar",
        "Lf0/r1;",
        "scrollState",
        "n",
        "(Lcy0/c$d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lf0/r1;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcy0/c$b;",
        "toolbarState",
        "",
        "showIconGlow",
        "z",
        "(Landroidx/compose/ui/Modifier;Lcy0/c$b;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lm91/u;",
        "item",
        "",
        "u",
        "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "deep-dive_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;Lcy0/c$b;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lcy0/c$b;->d()Lcy0/a;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lcy0/c$b;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcy0/a$f;

    invoke-virtual {p1}, Lcy0/c$b;->a()Lm91/u;

    move-result-object p1

    const-string v1, ""

    invoke-direct {v0, p2, p1, v1}, Lcy0/a$f;-><init>(Ljava/lang/Object;Lm91/u;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lcy0/c$b;ZLkotlin/jvm/functions/Function1;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "$this$GlowEffect"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p5, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p5, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p5

    :goto_1
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_2

    move v5, v7

    goto :goto_2

    :cond_2
    move v5, v8

    :goto_2
    and-int/2addr v3, v7

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Lcy0/c$b;->f()Lgz0/m0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    const/4 v5, 0x6

    invoke-static {v3, v14, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v9

    invoke-virtual {v0}, Lcy0/c$b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v14, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    if-eqz p1, :cond_3

    const v3, -0x30720112

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-static {v3, v14, v5, v8}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    :goto_3
    move-wide v12, v5

    goto :goto_4

    :cond_3
    const v3, -0x3071fcd5

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-static {v3, v14, v5, v8}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    goto :goto_3

    :goto_4
    const/4 v3, 0x7

    int-to-float v3, v3

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->F:Lb2/m;

    invoke-interface {v2, v3, v4}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_4

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_5

    :cond_4
    new-instance v4, Ley0/e;

    const/4 v3, 0x0

    invoke-direct {v4, v1, v0, v3}, Ley0/e;-><init>(Lkotlin/jvm/functions/Function1;Lcy0/c$b;I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lc93/a;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {v2, v8, v1, v4, v0}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_6
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;Lcy0/c$b;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lcy0/c$b;->e()Lcy0/a;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Landroidx/compose/ui/Modifier;Lcy0/c$b;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ley0/g;->z(Landroidx/compose/ui/Modifier;Lcy0/c$b;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lm91/u;Lcy0/c$d;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ley0/g;->r(Lkotlin/jvm/functions/Function1;Lm91/u;Lcy0/c$d;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lcy0/c$b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ley0/g;->D(Lkotlin/jvm/functions/Function1;Lcy0/c$b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lcy0/c$b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ley0/g;->A(Lkotlin/jvm/functions/Function1;Lcy0/c$b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lcy0/c$b;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ley0/g;->B(Lkotlin/jvm/functions/Function1;Lcy0/c$b;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lm91/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ley0/g;->y(Lm91/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcy0/c$d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lf0/r1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ley0/g;->t(Lcy0/c$d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lf0/r1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ley0/g;->s(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ley0/g;->v(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/Modifier;Lcy0/c$b;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ley0/g;->E(Landroidx/compose/ui/Modifier;Lcy0/c$b;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcy0/c$b;ZLkotlin/jvm/functions/Function1;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ley0/g;->C(Lcy0/c$b;ZLkotlin/jvm/functions/Function1;Ll0/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ley0/g;->w(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ley0/g;->x(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lcy0/c$d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ley0/g;->q(Lkotlin/jvm/functions/Function1;Lcy0/c$d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lcy0/c$d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lf0/r1;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcy0/c$d;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            "Lf0/r1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p5

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v3, 0xc7743fc

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v4, v0, 0x30

    const/16 v12, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v12

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :goto_4
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_9

    and-int/lit8 v6, p6, 0x8

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_5

    :cond_7
    move-object/from16 v6, p3

    :cond_8
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v3, v7

    goto :goto_6

    :cond_9
    move-object/from16 v6, p3

    :goto_6
    and-int/lit16 v7, v3, 0x493

    const/16 v8, 0x492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v7, v8, :cond_a

    move v7, v14

    goto :goto_7

    :cond_a
    move v7, v15

    :goto_7
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_28

    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v7, v0, 0x1

    if-eqz v7, :cond_d

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_9

    :cond_b
    invoke-virtual {v11}, Lp1/q;->X()V

    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_c

    and-int/lit16 v3, v3, -0x1c01

    :cond_c
    move-object/from16 v16, v5

    :goto_8
    move-object v13, v6

    goto :goto_b

    :cond_d
    :goto_9
    if-eqz v4, :cond_e

    const-string v4, ""

    goto :goto_a

    :cond_e
    move-object v4, v5

    :goto_a
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_f

    invoke-static {v15, v11, v14}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v5

    and-int/lit16 v3, v3, -0x1c01

    move-object/from16 v16, v4

    move-object v13, v5

    goto :goto_b

    :cond_f
    move-object/from16 v16, v4

    goto :goto_8

    :goto_b
    invoke-virtual {v11}, Lp1/q;->r()V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_10

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lp1/c1;

    and-int/lit8 v6, v3, 0x70

    if-ne v6, v12, :cond_11

    move v7, v14

    goto :goto_c

    :cond_11
    move v7, v15

    :goto_c
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_12

    if-ne v8, v5, :cond_13

    :cond_12
    new-instance v8, Ld30/l;

    const/16 v7, 0x16

    invoke-direct {v8, v7, v2, v1}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Lc93/a;

    shr-int/lit8 v7, v3, 0x9

    const/16 v9, 0xe

    and-int/2addr v7, v9

    invoke-static {v13, v8, v11, v7}, Lgb1/q;->f(Lf0/r1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    move-object/from16 p3, v13

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_14

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_14
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_d
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v11, v14, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    :cond_15
    invoke-static {v12, v11, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v9, v5

    invoke-virtual {v1}, Lcy0/c$d;->b()Lep0/j;

    move-result-object v5

    sget v12, Lep0/j;->x:I

    shl-int/lit8 v12, v12, 0x3

    move-object/from16 v18, v9

    const/4 v9, 0x2

    move/from16 v19, v6

    const/4 v6, 0x0

    move-object/from16 v20, v11

    move-object v11, v4

    move-object v4, v7

    move-object/from16 v7, v20

    move-object/from16 v20, v8

    move v8, v12

    move-object/from16 v21, v18

    move/from16 v12, v19

    invoke-static/range {v4 .. v9}, Ldp0/f;->b(Landroidx/compose/ui/Modifier;Lep0/j;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object v6, v7

    move v9, v8

    invoke-static {v4}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x0

    invoke-static {v5, v7, v6, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move/from16 p2, v3

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_17

    invoke-virtual {v6, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_17
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v6, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_18

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    :cond_18
    invoke-static {v2, v6, v2, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcy0/c$d;->d()Lcy0/c$b;

    move-result-object v3

    invoke-static {v11}, Ley0/g;->o(Lp1/c1;)Z

    move-result v4

    shl-int/lit8 v2, p2, 0x6

    and-int/lit16 v7, v2, 0x1c00

    const/4 v8, 0x1

    const/4 v2, 0x0

    move-object/from16 v22, v5

    move-object/from16 v5, p1

    invoke-static/range {v2 .. v8}, Ley0/g;->z(Landroidx/compose/ui/Modifier;Lcy0/c$b;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v5

    const/4 v3, 0x2

    int-to-float v4, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v7, 0x0

    move-object/from16 v8, v20

    invoke-static {v8, v4, v7, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v23

    move/from16 p2, v4

    const-wide/high16 v3, 0x4004000000000000L    # 2.5

    double-to-float v3, v3

    mul-float v25, v3, v5

    const/16 v27, 0x0

    const/16 v28, 0xd

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v4, p3

    const/16 v5, 0xe

    invoke-static {v3, v4, v5}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Lcy0/c$d;->b()Lep0/j;

    move-result-object v5

    const/4 v7, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x6

    move-object v8, v6

    const/4 v6, 0x0

    move-object/from16 p3, v11

    move/from16 v11, p2

    move-object/from16 p2, p3

    move-object/from16 p3, v4

    move-object/from16 v29, v20

    move-object v4, v3

    move-object/from16 v3, v17

    invoke-static/range {v4 .. v10}, Ldp0/d;->a(Landroidx/compose/ui/Modifier;Lep0/j;FZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object v6, v8

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x30

    move-object/from16 v8, v22

    invoke-static {v8, v5, v6, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_1a

    invoke-virtual {v6, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1a
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v6, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_1b

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1c

    :cond_1b
    invoke-static {v7, v6, v7, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x69d07d1a

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lcy0/c$d;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcy0/c$a;

    const v4, 0x69d08457

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lcy0/c$a;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_23

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v5, 0x1

    if-ltz v5, :cond_22

    check-cast v7, Lm91/u;

    const/16 v9, 0x20

    if-ne v12, v9, :cond_1d

    const/4 v10, 0x1

    goto :goto_12

    :cond_1d
    const/4 v10, 0x0

    :goto_12
    invoke-virtual {v6, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_1e

    move-object/from16 v10, v21

    if-ne v13, v10, :cond_1f

    goto :goto_13

    :cond_1e
    move-object/from16 v10, v21

    :goto_13
    new-instance v13, Lep1/g;

    const/4 v14, 0x2

    invoke-direct {v13, v2, v7, v1, v14}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    invoke-static {v7, v13, v6, v14, v14}, Ley0/g;->u(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3}, Lcy0/c$a;->b()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v7

    if-ne v5, v7, :cond_21

    invoke-virtual {v3}, Lcy0/c$a;->c()Z

    move-result v5

    if-nez v5, :cond_20

    goto :goto_14

    :cond_20
    const v5, 0x319904cd

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    move-object/from16 v7, v29

    goto :goto_15

    :cond_21
    :goto_14
    const v5, 0x31978226

    move-object/from16 v7, v29

    invoke-static {v6, v5, v7, v11, v6}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    :goto_15
    move-object/from16 v29, v7

    move v5, v8

    move-object/from16 v21, v10

    goto :goto_11

    :cond_22
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_23
    move-object/from16 v10, v21

    move-object/from16 v7, v29

    const/16 v9, 0x20

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v3}, Lcy0/c$a;->a()Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;->getSpacing-D9Ej5fM()F

    move-result v3

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v6, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto/16 :goto_10

    :cond_24
    move-object/from16 v10, v21

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lcy0/c$d;->e()Z

    move-result v0

    if-eqz v0, :cond_27

    const v0, -0x2d7f7217

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-static/range {v16 .. v16}, Lfy0/b;->a(Ljava/lang/String;)Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v0

    if-nez v0, :cond_25

    const v0, -0x2d7e3bbb

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    move-object/from16 v0, p3

    move-object v8, v6

    goto :goto_16

    :cond_25
    const v3, -0x2d7e3bba

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_26

    new-instance v0, Ley0/f;

    move-object/from16 v11, p2

    invoke-direct {v0, v11}, Ley0/f;-><init>(Lp1/c1;)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v12, 0xc00

    const/16 v13, 0x76

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v0, p3

    invoke-static/range {v4 .. v13}, Lm12/d;->z(Ljava/lang/String;Lm12/e;ZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v11

    const/4 v14, 0x0

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    :goto_17
    const/4 v3, 0x1

    goto :goto_18

    :cond_27
    move-object/from16 v0, p3

    move-object v8, v6

    const v3, -0x2d7b5ac0

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    goto :goto_17

    :goto_18
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    move-object v4, v0

    move-object/from16 v3, v16

    goto :goto_19

    :cond_28
    move-object v8, v11

    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v5

    move-object v4, v6

    :goto_19
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_29

    new-instance v0, La81/f;

    const/16 v7, 0x16

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final o(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final p(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lcy0/c$d;)Ll83/a0;
    .locals 1

    new-instance v0, Lcy0/a$j;

    invoke-virtual {p1}, Lcy0/c$d;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcy0/a$j;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Lm91/u;Lcy0/c$d;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcy0/a$f;

    invoke-virtual {p2}, Lcy0/c$d;->c()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p3, p1, p2}, Lcy0/a$f;-><init>(Ljava/lang/Object;Lm91/u;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ley0/g;->p(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lcy0/c$d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lf0/r1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Ley0/g;->n(Lcy0/c$d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lf0/r1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final u(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v1, "item"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v1, -0x24c9788b

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_4
    :goto_3
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v4, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_9

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_6

    new-instance v2, Lev2/b;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lev2/b;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, v2

    goto :goto_5

    :cond_7
    move-object v3, p1

    :goto_5
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_8

    new-instance v2, Lev2/b;

    const/16 v5, 0x8

    invoke-direct {v2, v5}, Lev2/b;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v2

    move v5, v1

    move-object v1, v2

    new-instance v2, Leg2/a;

    const/16 v6, 0xb

    invoke-direct {v2, v6}, Leg2/a;-><init>(I)V

    and-int/lit8 v6, v5, 0xe

    sget v7, Lm91/p;->b:I

    shl-int/lit8 v7, v7, 0x3

    or-int/2addr v6, v7

    shl-int/lit8 v5, v5, 0x6

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v5, v6

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    goto :goto_6

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, La80/k;

    const/4 v5, 0x3

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, La80/k;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final v(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lm91/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lqu1/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lsu1/e;

    invoke-direct {v3}, Lsu1/e;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v2, Lkm2/g;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lkm2/d;

    invoke-direct {v3}, Lkm2/d;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Ld62/d;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ld62/a;

    invoke-direct {v1}, Ld62/a;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string p2, "state"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, 0x421f1605

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    instance-of p0, p0, Lc41/p2;

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz p0, :cond_0

    const/4 p0, 0x4

    int-to-float p0, p0

    const/16 p2, 0x8

    int-to-float p2, p2

    mul-float v2, p0, p2

    const/4 p0, 0x2

    int-to-float p0, p0

    mul-float v4, p0, p2

    const/4 v5, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method private static final y(Lm91/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ley0/g;->u(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Landroidx/compose/ui/Modifier;Lcy0/c$b;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcy0/c$b;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, 0x32efdb96

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move v7, v1

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v7, v7, 0x180

    :cond_5
    move/from16 v10, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v10, v5, 0x180

    if-nez v10, :cond_5

    move/from16 v10, p2

    invoke-virtual {v9, v10}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v7, v11

    :goto_4
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_9

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x800

    goto :goto_5

    :cond_8
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v7, v11

    :cond_9
    move v15, v7

    and-int/lit16 v7, v15, 0x493

    const/16 v11, 0x492

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v7, v11, :cond_a

    move v7, v13

    goto :goto_6

    :cond_a
    move v7, v12

    :goto_6
    and-int/lit8 v11, v15, 0x1

    invoke-virtual {v9, v11, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1a

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_b

    move-object v0, v7

    goto :goto_7

    :cond_b
    move-object v0, v6

    :goto_7
    if-eqz v8, :cond_c

    move v10, v12

    :cond_c
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v8, v1

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v8, v11

    int-to-float v1, v13

    mul-float/2addr v1, v11

    invoke-static {v6, v8, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-eqz v3, :cond_d

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v9, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v9, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    move-object/from16 p0, v0

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    invoke-static {v12, v9, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcy0/c$b;->b()Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    const/4 v5, 0x6

    invoke-static {v1, v9, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    invoke-virtual {v2}, Lcy0/c$b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v9, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move/from16 p2, v12

    sget-object v12, Lx81/d;->a:Lx81/d;

    move-object/from16 v20, v13

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->y()J

    move-result-wide v21

    move-object/from16 v23, v1

    const/4 v1, 0x7

    int-to-float v1, v1

    move/from16 v24, v1

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v1, v1, v24

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v19, v5

    sget-object v5, Lb2/e;->z:Lb2/m;

    move-object/from16 v24, v14

    sget-object v14, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v14, v1, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit16 v5, v15, 0x1c00

    move-object/from16 v25, v12

    const/16 v12, 0x800

    if-ne v5, v12, :cond_10

    const/16 v18, 0x1

    goto :goto_9

    :cond_10
    const/16 v18, 0x0

    :goto_9
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v26

    or-int v18, v18, v26

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    move/from16 v27, v15

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v18, :cond_12

    if-ne v12, v15, :cond_11

    goto :goto_a

    :cond_11
    move-object/from16 v18, v6

    goto :goto_b

    :cond_12
    :goto_a
    new-instance v12, Ley0/e;

    move-object/from16 v18, v6

    const/4 v6, 0x1

    invoke-direct {v12, v4, v2, v6}, Ley0/e;-><init>(Lkotlin/jvm/functions/Function1;Lcy0/c$b;I)V

    invoke-virtual {v9, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v12, Lc93/a;

    const/4 v6, 0x0

    move-object/from16 v28, v15

    const/4 v15, 0x3

    move-object/from16 v29, v7

    const/4 v7, 0x0

    invoke-static {v1, v7, v6, v12, v15}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v12, 0x0

    move v6, v13

    const/4 v13, 0x0

    move v2, v8

    move-object v8, v1

    move v1, v2

    move/from16 v15, p2

    move/from16 v36, v5

    move v2, v6

    move/from16 v32, v10

    move-object/from16 v34, v11

    move-object/from16 v33, v18

    move-object/from16 v7, v19

    move-object/from16 v35, v20

    move-object/from16 v6, v23

    move-object/from16 v4, v25

    move-object/from16 v5, v29

    const/16 v26, 0x800

    move-object v11, v9

    move-wide/from16 v9, v21

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    sget-object v6, Lb2/e;->E:Lb2/m;

    invoke-virtual {v14, v5, v6}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-static {v6, v1, v7, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcy0/c$b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v9, v15}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v4, v9, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->r()Lb91/a;

    move-result-object v1

    new-instance v2, Lw3/k;

    const/4 v4, 0x3

    invoke-direct {v2, v4}, Lw3/k;-><init>(I)V

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v30, v8, 0x12

    const v31, 0x2fdf8

    move-object/from16 v12, v28

    move-object/from16 v28, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    move-object/from16 v18, v16

    const-wide/16 v15, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v21, v19

    const-wide/16 v19, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move-object/from16 v37, v25

    const/16 v25, 0x0

    move/from16 v38, v27

    const/16 v27, 0x0

    move-object/from16 v39, v29

    const/16 v29, 0x0

    move-object/from16 v26, v1

    move/from16 p4, v4

    move-object/from16 v4, v18

    move-object/from16 v1, v39

    move-object/from16 v18, v2

    move-object/from16 v2, v37

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual/range {p1 .. p1}, Lcy0/c$b;->a()Lm91/u;

    move-result-object v6

    if-eqz v6, :cond_19

    const v6, -0x48daf830

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lb2/e;->F:Lb2/m;

    invoke-virtual {v4, v5, v6}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v5, v33

    const/4 v7, 0x0

    invoke-static {v5, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_13

    invoke-virtual {v9, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v9, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v34

    invoke-static {v9, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    :cond_14
    move-object/from16 v1, v35

    invoke-static {v6, v9, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v9, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcy0/c$b;->a()Lm91/u;

    move-result-object v6

    move/from16 v0, v36

    const/16 v12, 0x800

    if-ne v0, v12, :cond_16

    const/4 v12, 0x1

    :goto_d
    move-object/from16 v0, p1

    goto :goto_e

    :cond_16
    const/4 v12, 0x0

    goto :goto_d

    :goto_e
    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_18

    if-ne v3, v2, :cond_17

    goto :goto_f

    :cond_17
    move-object/from16 v2, p3

    goto :goto_10

    :cond_18
    :goto_f
    new-instance v3, Lcom/whoop/profile/view/edit/n;

    const/16 v1, 0x15

    move-object/from16 v2, p3

    invoke-direct {v3, v1, v2, v0}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v9

    move-object v9, v3

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    const/4 v1, 0x1

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    move/from16 v7, v32

    goto :goto_11

    :cond_19
    move-object/from16 v0, p1

    move-object/from16 v2, p3

    const/4 v1, 0x1

    const v3, -0x48d49da8

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    new-instance v3, Lb81/b;

    const/4 v5, 0x1

    move/from16 v7, v32

    invoke-direct {v3, v0, v7, v2, v5}, Lb81/b;-><init>(Ljava/lang/Object;ZLl83/e;I)V

    const v5, -0x4a1b4a5c

    invoke-static {v5, v9, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    shr-int/lit8 v3, v38, 0x3

    and-int/lit8 v3, v3, 0x70

    const/16 v5, 0x186

    or-int v10, v5, v3

    const/4 v11, 0x0

    move-object v6, v4

    invoke-static/range {v6 .. v11}, Lfy0/a;->b(Ll0/u;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x0

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move v3, v7

    goto :goto_12

    :cond_1a
    move-object v0, v2

    move-object v2, v4

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v6

    move v3, v10

    :goto_12
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v0, Law0/h;

    const/16 v7, 0x8

    move/from16 v5, p5

    move/from16 v6, p6

    move-object v4, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v7}, Law0/h;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZLl83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method
