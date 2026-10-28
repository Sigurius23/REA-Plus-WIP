.class public abstract Luz1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001aM\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d\u00b2\u0006\u000e\u0010\u001c\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "isTabRoot",
        "coachBarEnabled",
        "Ly3/f;",
        "E",
        "(ZZ)F",
        "Ltz1/b;",
        "data",
        "Lao2/b;",
        "cartIndicator",
        "isUpsellShop",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "p",
        "(Ltz1/b;Lao2/b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Ltz1/a;",
        "footer",
        "m",
        "(Ltz1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lm91/u;",
        "state",
        "precedesMenuItem",
        "D",
        "(Landroidx/compose/ui/Modifier;Lm91/u;Z)Landroidx/compose/ui/Modifier;",
        "isCountrySelectorOpen",
        "native-store_release"
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
.method private static final A(Ltz1/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Ll1/w3;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 3

    const-string v0, "event"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p5, Lr51/c;

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p5, Lr51/c;

    invoke-virtual {p5}, Lr51/c;->a()Lr51/g;

    move-result-object v0

    invoke-virtual {v0}, Lr51/g;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ltz1/b;->b()Lr51/f;

    move-result-object p0

    invoke-virtual {p0}, Lr51/f;->i()Lr51/g;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lr51/g;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v2

    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    new-instance p0, Ltz1/d$e;

    invoke-virtual {p5}, Lr51/c;->a()Lr51/g;

    move-result-object p5

    invoke-virtual {p5}, Lr51/g;->a()Ljava/lang/String;

    move-result-object p5

    invoke-direct {p0, p5}, Ltz1/d$e;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    new-instance p0, Luz1/h$c;

    invoke-direct {p0, p3, p4, v2}, Luz1/h$c;-><init>(Ll1/w3;Lp1/c1;Lq83/d;)V

    invoke-static {p2, v2, v2, p0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_2
    instance-of p0, p5, Lr51/b;

    if-eqz p0, :cond_3

    new-instance p0, Luz1/h$d;

    invoke-direct {p0, p3, p4, v2}, Luz1/h$d;-><init>(Ll1/w3;Lp1/c1;Lq83/d;)V

    invoke-static {p2, v2, v2, p0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_3
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Ltz1/b;Lao2/b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Luz1/h;->p(Ltz1/b;Lao2/b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic C(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Luz1/h;->r(Lp1/c1;Z)V

    return-void
.end method

.method public static final D(Landroidx/compose/ui/Modifier;Lm91/u;Z)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Luz1/u;

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    int-to-float p1, v3

    int-to-float p2, v2

    mul-float/2addr p1, p2

    invoke-static {p0, p1, v1, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p1, Luz1/o;

    if-eqz v0, :cond_1

    int-to-float p1, v3

    int-to-float p2, v2

    mul-float v4, p1, p2

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_1
    move-object v0, p0

    instance-of p0, p1, Ly71/o;

    if-eqz p0, :cond_2

    const/high16 p0, 0x40200000    # 2.5f

    int-to-float p1, v2

    mul-float/2addr p1, p0

    invoke-static {v0, p1, v1, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of p0, p1, Lp31/l;

    if-eqz p0, :cond_4

    int-to-float p0, v3

    int-to-float p1, v2

    mul-float/2addr p0, p1

    if-eqz p2, :cond_3

    const/4 p1, 0x0

    int-to-float p1, p1

    goto :goto_0

    :cond_3
    const/high16 p2, 0x3fc00000    # 1.5f

    mul-float/2addr p1, p2

    :goto_0
    invoke-static {v0, p0, p0, p0, p1}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v0
.end method

.method public static final E(ZZ)F
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :goto_0
    int-to-float p0, p0

    return p0

    :cond_0
    if-eqz p1, :cond_1

    const/16 p0, 0xa0

    goto :goto_0

    :cond_1
    invoke-static {}, Ldp0/d;->d()F

    move-result p0

    return p0
.end method

.method public static synthetic a(Ltz1/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Ll1/w3;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Luz1/h;->z(Ltz1/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Ll1/w3;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luz1/h;->x(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ltz1/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Ll1/w3;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Luz1/h;->A(Ltz1/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Ll1/w3;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Luz1/h;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ltz1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luz1/h;->v(Ltz1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Luz1/h;->u(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ltz1/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Luz1/h;->o(Ltz1/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lao2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luz1/h;->s(Lao2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lr51/f;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Luz1/h;->w(Lr51/f;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lny0/h;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Luz1/h;->n(Lny0/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ltz1/b;Lao2/b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Luz1/h;->B(Ltz1/b;Lao2/b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luz1/h;->y(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ltz1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltz1/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0x1b57dbd7

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    const/16 v11, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v11

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    move v12, v3

    and-int/lit8 v3, v12, 0x13

    const/16 v5, 0x12

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v3, v5, :cond_4

    move v3, v14

    goto :goto_3

    :cond_4
    move v3, v13

    :goto_3
    and-int/lit8 v5, v12, 0x1

    invoke-virtual {v7, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    const/high16 v15, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v4

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v6, v8

    const/4 v9, 0x0

    invoke-static {v5, v6, v9, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v4, v14

    mul-float v18, v4, v8

    const/16 v19, 0x0

    const/16 v21, 0x5

    const/16 v17, 0x0

    move/from16 v20, v6

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/high16 v6, 0x3fc00000    # 1.5f

    mul-float v20, v8, v6

    invoke-static/range {v20 .. v20}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    const/16 v8, 0x36

    invoke-static {v6, v5, v7, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v7, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-static {v6, v7, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v7, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ltz1/a;->b()Lsz0/c0;

    move-result-object v4

    if-nez v4, :cond_8

    const v4, 0x8dab886

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    move-object v14, v3

    move-object v8, v7

    goto :goto_5

    :cond_8
    const v5, 0x8dab887

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    const/16 v19, 0x0

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v5, Lsz0/c0;->k:I

    shl-int/lit8 v5, v5, 0x3

    or-int/lit8 v9, v5, 0x6

    const/16 v10, 0x1c

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object/from16 v14, v16

    invoke-static/range {v3 .. v10}, Lsz0/b0;->d(Landroidx/compose/ui/Modifier;Lsz0/c0;IIILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_5
    const v3, 0x4259bd50

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ltz1/a;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lny0/h;

    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v6, v12, 0x70

    if-ne v6, v11, :cond_9

    const/4 v6, 0x1

    goto :goto_7

    :cond_9
    move v6, v13

    :goto_7
    or-int/2addr v5, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_a

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_b

    :cond_a
    new-instance v6, La80/i;

    const/16 v5, 0xc

    invoke-direct {v6, v4, v1, v5}, La80/i;-><init>(Lny0/h;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lc93/a;

    sget v5, Lny0/h;->z:I

    shl-int/lit8 v5, v5, 0x3

    or-int/lit8 v5, v5, 0x6

    const/4 v9, 0x4

    move-object v7, v8

    move v8, v5

    const/4 v5, 0x0

    invoke-static/range {v3 .. v9}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v7

    goto :goto_6

    :cond_c
    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    const/4 v3, 0x1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    move-object v8, v7

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_e

    new-instance v4, Lso2/f;

    const/16 v5, 0x1c

    invoke-direct {v4, v0, v1, v2, v5}, Lso2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final n(Lny0/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    invoke-virtual {p0}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    sget-object v2, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Ltz1/d$f;

    invoke-virtual {p0}, Lny0/h;->f()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Ltz1/d$f;-><init>(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Ltz1/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Luz1/h;->m(Ltz1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final p(Ltz1/b;Lao2/b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltz1/b;",
            "Lao2/b;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move-object/from16 v2, p4

    move/from16 v10, p7

    const-string v0, "data"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartIndicator"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v3, 0x7989bd7e

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v10, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_1
    move v3, v10

    :goto_1
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, v10, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v3, v5

    :cond_6
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_8

    invoke-virtual {v0, v9}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x800

    goto :goto_5

    :cond_7
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v3, v5

    :cond_8
    and-int/lit16 v5, v10, 0x6000

    if-nez v5, :cond_a

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/16 v5, 0x4000

    goto :goto_6

    :cond_9
    const/16 v5, 0x2000

    :goto_6
    or-int/2addr v3, v5

    :cond_a
    and-int/lit8 v5, p8, 0x20

    const/high16 v12, 0x30000

    if-eqz v5, :cond_c

    or-int/2addr v3, v12

    :cond_b
    move-object/from16 v12, p5

    goto :goto_8

    :cond_c
    and-int/2addr v12, v10

    if-nez v12, :cond_b

    move-object/from16 v12, p5

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/high16 v13, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v13, 0x10000

    :goto_7
    or-int/2addr v3, v13

    :goto_8
    const v13, 0x12493

    and-int/2addr v13, v3

    const v14, 0x12492

    const/4 v15, 0x0

    if-eq v13, v14, :cond_e

    const/4 v13, 0x1

    goto :goto_9

    :cond_e
    move v13, v15

    :goto_9
    and-int/lit8 v14, v3, 0x1

    invoke-virtual {v0, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_29

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_f

    move-object v5, v13

    goto :goto_a

    :cond_f
    move-object v5, v12

    :goto_a
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v12, v14, :cond_10

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v12, Lp1/c1;

    const/4 v6, 0x6

    const/4 v11, 0x0

    invoke-static {v6, v11, v0, v4}, Ll1/n2;->g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v14, :cond_11

    invoke-static {v0}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v11

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v23, v11

    check-cast v23, Lbc3/c0;

    invoke-static {}, Lqf1/a;->c()Lp1/t1;

    move-result-object v11

    invoke-virtual {v0, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-static {v11}, Ldp0/d;->e(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z

    move-result v11

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v24, v5

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move/from16 v18, v11

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 v25, v6

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-eqz v6, :cond_12

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v0, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v22, v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    goto :goto_c

    :cond_13
    move-object/from16 v22, v12

    :goto_c
    invoke-static {v10, v0, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v0, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Lb2/e;->N:Lb2/k;

    sget-object v12, Ll0/m;->c:Ll0/g;

    move-object/from16 v26, v13

    const/16 v13, 0x30

    invoke-static {v12, v10, v0, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-eqz v1, :cond_15

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v0, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_16
    invoke-static {v12, v0, v12, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v0, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v9, :cond_18

    sget-object v1, Lgz0/m0;->SETTINGS:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    goto :goto_e

    :cond_18
    if-eqz p2, :cond_19

    sget-object v1, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    goto :goto_e

    :cond_19
    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1}, Lyb0/f;->a(Lx81/d;)I

    move-result v1

    :goto_e
    if-eqz v9, :cond_1a

    const v4, -0x3084da87

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    sget v4, Lmz1/b;->g:I

    const/4 v5, 0x0

    invoke-static {v4, v0, v5}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    :goto_f
    move-object/from16 v31, v4

    goto :goto_10

    :cond_1a
    const/4 v5, 0x0

    const v4, -0x308336b2

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    sget v4, Lvu1/h;->e:I

    invoke-static {v4, v0, v5}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual/range {p0 .. p0}, Ltz1/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, Ltz1/b;->e()Z

    move-result v4

    if-eqz v4, :cond_1b

    const v4, -0x307ebf92

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    new-instance v4, Lh02/g;

    const/4 v5, 0x1

    invoke-direct {v4, v7, v2, v5}, Lh02/g;-><init>(Lao2/b;Lkotlin/jvm/functions/Function1;I)V

    const v5, 0x4b6f36c5    # 1.5677125E7f

    invoke-static {v5, v0, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    move-object/from16 v37, v4

    goto :goto_11

    :cond_1b
    const/4 v5, 0x0

    const v4, -0x3078bcf4

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    const/16 v37, 0x0

    :goto_11
    new-instance v27, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v30

    const/16 v44, 0x7df2

    const/16 v45, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const-string v43, "Shop Home Screen Title"

    invoke-direct/range {v27 .. v45}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0xe000

    and-int/2addr v1, v3

    const/16 v4, 0x4000

    if-ne v1, v4, :cond_1c

    const/4 v6, 0x1

    goto :goto_12

    :cond_1c
    move v6, v5

    :goto_12
    and-int/lit16 v8, v3, 0x1c00

    const/16 v10, 0x800

    if-ne v8, v10, :cond_1d

    const/4 v8, 0x1

    goto :goto_13

    :cond_1d
    move v8, v5

    :goto_13
    or-int/2addr v6, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_1e

    if-ne v8, v14, :cond_1f

    :cond_1e
    new-instance v8, Lbv2/b;

    const/16 v6, 0xd

    invoke-direct {v8, v2, v9, v6}, Lbv2/b;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v8, Lc93/a;

    sget v6, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v10, 0x3

    shl-int/2addr v6, v10

    const/16 v19, 0x35

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v0

    move-object/from16 v46, v14

    move/from16 v0, v18

    move-object/from16 v5, v22

    move-object/from16 v4, v26

    move-object/from16 v12, v27

    move/from16 v18, v6

    move-object v14, v8

    const/4 v6, 0x0

    const/4 v8, 0x1

    invoke-static/range {v11 .. v19}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v17

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    float-to-double v14, v12

    const-wide/16 v16, 0x0

    cmpl-double v14, v14, v16

    if-lez v14, :cond_20

    move v15, v8

    goto :goto_14

    :cond_20
    const/4 v15, 0x0

    :goto_14
    if-nez v15, :cond_21

    const-string v14, "invalid weight; must be greater than zero"

    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_21
    invoke-static {v13, v8, v12}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Ltz1/b;->a()Ltz1/a;

    move-result-object v13

    const/4 v14, 0x0

    if-eqz v13, :cond_22

    invoke-static {v4, v14, v8, v6}, Lgb1/c;->m(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    goto :goto_15

    :cond_22
    invoke-static {v4, v14, v6, v10, v6}, Lgb1/c;->i(Landroidx/compose/ui/Modifier;FLc93/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    :goto_15
    invoke-interface {v12, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v6, 0x8

    int-to-float v6, v6

    const/high16 v10, 0x3fc00000    # 1.5f

    mul-float/2addr v10, v6

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/4 v12, 0x2

    int-to-float v12, v12

    mul-float/2addr v12, v6

    invoke-static {v9, v0}, Luz1/h;->E(ZZ)F

    move-result v0

    const/4 v6, 0x5

    invoke-static {v14, v12, v14, v0, v6}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v13

    move-object/from16 v0, p0

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    const/16 v12, 0x4000

    if-ne v1, v12, :cond_23

    move v15, v8

    goto :goto_16

    :cond_23
    const/4 v15, 0x0

    :goto_16
    or-int v1, v6, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_24

    move-object/from16 v1, v46

    if-ne v6, v1, :cond_25

    goto :goto_17

    :cond_24
    move-object/from16 v1, v46

    :goto_17
    new-instance v6, Ls90/f;

    const/16 v12, 0x13

    invoke-direct {v6, v0, v2, v5, v12}, Ls90/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object/from16 v19, v6

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/16 v21, 0x6000

    const/16 v22, 0x1ea

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v14, v10

    move-object/from16 v20, v11

    move-object v11, v4

    invoke-static/range {v11 .. v22}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v20

    invoke-virtual {v0}, Ltz1/b;->a()Ltz1/a;

    move-result-object v4

    if-nez v4, :cond_26

    const v3, -0x305914a3

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_26
    const/4 v10, 0x0

    const v6, -0x305914a2

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    shr-int/lit8 v3, v3, 0x9

    and-int/lit8 v3, v3, 0x70

    invoke-static {v4, v2, v11, v3}, Luz1/h;->m(Ltz1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    invoke-static {v5}, Luz1/h;->q(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_28

    invoke-virtual {v0}, Ltz1/b;->b()Lr51/f;

    move-result-object v3

    if-eqz v3, :cond_28

    const v3, -0x5d5b3d1a

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_27

    new-instance v3, Luz1/g;

    const/4 v1, 0x0

    invoke-direct {v3, v1, v5}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object/from16 v17, v3

    check-cast v17, Lc93/a;

    new-instance v0, La81/n;

    const/16 v6, 0xf

    move-object/from16 v1, p0

    move-object/from16 v3, v23

    move-object/from16 v28, v24

    move-object/from16 v4, v25

    invoke-direct/range {v0 .. v6}, La81/n;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x397fdfd7

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v23

    const/16 v26, 0x180

    const/16 v27, 0xebd

    move-object/from16 v24, v11

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v12, v25

    const/high16 v25, 0x6180000

    invoke-static/range {v11 .. v27}, Lv41/e;->g(Landroidx/compose/ui/Modifier;Ll1/w3;Lv41/g;Ly81/e;Lc93/a;Lc93/a;Lc93/a;Li2/a1;ZLny0/q;Li2/t;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_28
    move-object/from16 v28, v24

    const v0, -0x5d442ff6

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    :goto_19
    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    move-object/from16 v6, v28

    goto :goto_1a

    :cond_29
    move-object v11, v0

    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v6, v12

    :goto_1a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_2a

    new-instance v0, Lb01/n;

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v8, p8

    move-object v2, v7

    move v4, v9

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lb01/n;-><init>(Ltz1/b;Lao2/b;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method

.method private static final q(Lp1/c1;)Z
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

.method private static final r(Lp1/c1;Z)V
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

.method private static final s(Lao2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v6, p2

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lao2/b;->b()I

    move-result v1

    invoke-virtual {p0}, Lao2/b;->c()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_1

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p2, p0, :cond_2

    :cond_1
    new-instance p2, Lsg2/b;

    const/16 p0, 0x1c

    invoke-direct {p2, p1, p0}, Lsg2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget p0, Lcom/whoop/navigation/e;->d:I

    shl-int/lit8 v7, p0, 0x3

    const/16 v8, 0x18

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Luz1/a;->c(ILcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Luz1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltz1/d$d;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {v0, p1}, Ltz1/d$d;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Ltz1/d$l;->a:Ltz1/d$l;

    goto :goto_0

    :cond_0
    sget-object p1, Ltz1/d$b;->a:Ltz1/d$b;

    :goto_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Ltz1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 8

    const-string v0, "$this$LazyColumn"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ltz1/b;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltz1/e;

    invoke-virtual {v1}, Ltz1/e;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    new-instance v6, Luz1/h$e;

    invoke-direct {v6, v4}, Luz1/h$e;-><init>(Ljava/util/List;)V

    new-instance v7, Luz1/h$f;

    invoke-direct {v7, v4, v1, p1}, Luz1/h$f;-><init>(Ljava/util/List;Ltz1/e;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lx1/b;

    const v4, 0x799532c4

    invoke-direct {v1, v7, v3, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v3, p3

    check-cast v3, Ln0/f;

    invoke-virtual {v3, v5, v2, v6, v1}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ltz1/b;->b()Lr51/f;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance p1, Loq1/c;

    const/16 v0, 0x19

    invoke-direct {p1, v0, p0, p2}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p0, Lx1/b;

    const p2, -0x28a29259

    invoke-direct {p0, p1, v3, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p1, 0x3

    invoke-static {p3, v2, p0, p1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lr51/f;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string v0, "$this$item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p2, v0, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    and-int/2addr p4, v1

    move-object v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p2, p3, :cond_1

    new-instance p2, Lo0/i;

    const/16 p3, 0x1d

    invoke-direct {p2, p3, p1}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v3, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p2

    check-cast v1, Lc93/a;

    sget p1, Lr51/f;->h:I

    or-int/lit8 v4, p1, 0x30

    const/4 v5, 0x4

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Luz1/c;->b(Lr51/f;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Luz1/h;->r(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Luz1/h;->r(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Ltz1/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Ll1/w3;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 20

    const-string v0, "$this$BottomSheetM3"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p7, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p7, 0x1

    move-object/from16 v9, p6

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lb2/t;->w:Lb2/t;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Ltz1/b;->b()Lr51/f;

    move-result-object v10

    const/16 v18, 0x77

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v10 .. v19}, Lr51/f;->b(Lr51/f;Lny0/h;Lny0/h;Lr51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ILjava/lang/Object;)Lr51/f;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v9, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->P()Lb91/a;

    move-result-object v5

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    new-instance v6, Li2/x;

    invoke-direct {v6, v0, v1}, Li2/x;-><init>(J)V

    int-to-float v7, v2

    move-object/from16 v11, p0

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    move-object/from16 v12, p1

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    move-object/from16 v13, p2

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    move-object/from16 v14, p3

    invoke-virtual {v9, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v10, Lpp2/d;

    move-object/from16 v15, p4

    invoke-direct/range {v10 .. v15}, Lpp2/d;-><init>(Ltz1/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Ll1/w3;Lp1/c1;)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v10

    :cond_2
    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v0, Lr51/f;->h:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0x6006

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v1, v1, 0x6

    or-int v10, v0, v1

    const/4 v11, 0x0

    invoke-static/range {v3 .. v11}, Lr51/e;->i(Landroidx/compose/ui/Modifier;Lr51/f;Lb91/a;Li2/x;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
