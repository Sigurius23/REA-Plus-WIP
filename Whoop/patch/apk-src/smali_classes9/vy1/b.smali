.class public abstract Lvy1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a%\u0010\u0004\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a=\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\r\u001a\u00020\u00068\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onNavigate",
        "x",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lvy1/d;",
        "state",
        "Lvy1/c;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "o",
        "(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "viewState",
        "mfa_release"
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
.method private static final A(Luy1/e;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_0

    sget-object p1, Lvy1/c$b;->a:Lvy1/c$b;

    invoke-virtual {p0, p1}, Luy1/e;->l(Lvy1/c;)V

    :cond_0
    return-void
.end method

.method private static final B(Lp1/t2;)Lvy1/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lvy1/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvy1/d;

    return-object p0
.end method

.method private static final C(Luy1/e;Lvy1/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Luy1/e;->l(Lvy1/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;
    .locals 2

    invoke-static {p1}, Lvy1/b;->B(Lp1/t2;)Lvy1/d;

    move-result-object p1

    instance-of v0, p1, Lvy1/d$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lvy1/d$b;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lvy1/d$b;->h()Luy1/g;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lpy1/b;->d(Luy1/g;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lvy1/b;->x(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvy1/b;->v(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lvy1/b;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Luy1/e;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lvy1/b;->A(Luy1/e;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void
.end method

.method public static synthetic d(Luy1/e;Lvy1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvy1/b;->C(Luy1/e;Lvy1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc41/p2;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvy1/b;->s(Lc41/p2;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lvy1/b;->r(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lvy1/b;->w(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lvy1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvy1/b;->p(Lvy1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc93/a;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvy1/b;->u(Lc93/a;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvy1/b;->D(Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lvy1/d;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvy1/b;->t(Lvy1/d;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(ILkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3, p4}, Lvy1/b;->E(Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvy1/b;->y(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroidx/lifecycle/g0;Luy1/e;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvy1/b;->z(Landroidx/lifecycle/g0;Luy1/e;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 71
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvy1/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    const v0, 0x427ea0b4

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v6, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit16 v8, v0, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    if-eq v8, v12, :cond_8

    const/4 v8, 0x1

    goto :goto_6

    :cond_8
    move v8, v13

    :goto_6
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v6, v12, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_25

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_9

    new-instance v2, Lvs2/d;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Lvs2/d;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v2, v3

    :goto_7
    if-eqz v5, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_b

    new-instance v3, Lvw0/a;

    const/16 v5, 0x16

    invoke-direct {v3, v5}, Lvw0/a;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lc93/a;

    goto :goto_8

    :cond_c
    move-object v3, v7

    :goto_8
    instance-of v5, v1, Lvy1/d$a;

    if-eqz v5, :cond_d

    const v0, 0xdd274a8

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_26

    new-instance v0, Lvy1/a;

    const/4 v6, 0x1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lvy1/a;-><init>(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;III)V

    :goto_9
    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_d
    move-object v15, v1

    nop

    instance-of v1, v15, Lvy1/d$b;

    if-eqz v1, :cond_24

    const v1, 0xdd62894

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->M:Lb2/k;

    sget-object v8, Ll0/m;->e:Ll0/h;

    const/16 v9, 0x36

    invoke-static {v8, v7, v6, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v13, v6, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_e

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_a
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v6, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v6, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_f

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v20, v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_b

    :cond_f
    move-object/from16 v20, v2

    :goto_b
    invoke-static {v13, v6, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v6, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v5, 0x14

    int-to-float v5, v5

    move-object/from16 p2, v7

    const/4 v7, 0x0

    const/4 v1, 0x2

    invoke-static {v2, v5, v7, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const/4 v1, 0x6

    int-to-float v2, v1

    const/16 v26, 0x0

    const/16 v27, 0xd

    const/16 v23, 0x0

    const/16 v25, 0x0

    move/from16 v24, v2

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v22, v9

    sget-object v9, Lx81/d;->a:Lx81/d;

    move-object/from16 v29, v10

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v6, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ly81/i;->W0()J

    move-result-wide v25

    move-object/from16 v17, v4

    move/from16 v23, v5

    const/4 v5, 0x1

    int-to-float v4, v5

    move/from16 v27, v7

    const/16 v7, 0x186

    move-object/from16 v28, v8

    const/16 v8, 0x8

    move/from16 v30, v5

    const/4 v5, 0x0

    move-object/from16 v33, p2

    move-object v1, v2

    move-object/from16 v32, v3

    move-object/from16 p2, v11

    move-object/from16 v31, v20

    move/from16 v11, v23

    move-wide/from16 v2, v25

    move-object/from16 v34, v28

    move-object/from16 v20, v13

    move-object/from16 v13, v17

    move-object/from16 v17, v12

    move/from16 v12, v27

    invoke-static/range {v1 .. v8}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move/from16 v37, v4

    const/4 v1, 0x2

    invoke-static {v13, v11, v12, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v23

    const/16 v27, 0x0

    const/16 v28, 0xd

    move/from16 v25, v24

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v27, v25

    sget v3, Lpy1/d;->P:I

    invoke-static {v6, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v6, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v4

    invoke-virtual {v9, v6, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->M()Lb91/a;

    move-result-object v21

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v25, v7, 0x12

    const v26, 0x2fff8

    move/from16 v19, v1

    move-object v1, v3

    move-wide v3, v4

    move-object/from16 v23, v6

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move/from16 v24, v10

    move-object v12, v11

    const-wide/16 v10, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    move-object/from16 v38, v13

    const/4 v13, 0x0

    move-object/from16 v39, v14

    const-wide/16 v14, 0x0

    const/16 v40, 0x100

    const/16 v16, 0x0

    move-object/from16 v41, v17

    const/16 v17, 0x0

    const/16 v42, 0x0

    const/16 v18, 0x0

    move/from16 v43, v19

    const/16 v19, 0x0

    move-object/from16 v44, v20

    const/16 v20, 0x0

    move-object/from16 v45, v22

    const/16 v22, 0x0

    move/from16 v46, v24

    const/16 v24, 0x30

    move-object/from16 v48, p2

    move-object/from16 v51, v28

    move-object/from16 v47, v29

    move-object/from16 v49, v39

    move-object/from16 v53, v41

    move-object/from16 v50, v44

    move/from16 v52, v46

    move/from16 v28, v0

    move-object/from16 v0, v38

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v12, v3

    mul-float v13, v2, v12

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v14, v33

    move-object/from16 v2, v34

    const/16 v3, 0x36

    invoke-static {v2, v14, v6, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_11

    move-object/from16 v15, v45

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v5, v47

    goto :goto_d

    :cond_11
    move-object/from16 v15, v45

    invoke-virtual {v6}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v6, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v48

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_12

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    :cond_12
    move-object/from16 v4, v49

    goto :goto_f

    :cond_13
    move-object/from16 v4, v49

    :goto_e
    move-object/from16 v3, v50

    goto :goto_10

    :goto_f
    invoke-static {v3, v6, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v6, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v29, p0

    check-cast v29, Lvy1/d$b;

    invoke-virtual/range {v29 .. v29}, Lvy1/d$b;->c()Lc41/p2;

    move-result-object v1

    move-object/from16 v48, v2

    if-eqz v1, :cond_14

    const/4 v2, 0x1

    goto :goto_11

    :cond_14
    const/4 v2, 0x0

    :goto_11
    new-instance v7, Lno0/v;

    const/4 v8, 0x1

    invoke-direct {v7, v1, v8}, Lno0/v;-><init>(Lc41/p2;I)V

    const v1, -0x49ecc327

    invoke-static {v1, v6, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v9, 0x180006

    const/16 v10, 0x1e

    sget-object v1, Ll0/z;->a:Ll0/z;

    move-object/from16 v44, v3

    const/4 v3, 0x0

    move-object/from16 v49, v4

    const/4 v4, 0x0

    move-object/from16 v47, v5

    const/4 v5, 0x0

    move-object/from16 v23, v6

    const/4 v6, 0x0

    move/from16 v16, v12

    move/from16 v17, v13

    move-object/from16 p2, v14

    move-object/from16 v8, v23

    move-object/from16 v54, v44

    move-object/from16 v12, v47

    move-object/from16 v13, v48

    move-object/from16 v14, v49

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->g:Ll0/h;

    sget-object v3, Lb2/e;->K:Lb2/l;

    const/16 v4, 0x36

    invoke-static {v2, v3, v6, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_15

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_15
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v6, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_17

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    goto :goto_14

    :cond_16
    :goto_13
    move-object/from16 v4, v54

    goto :goto_15

    :cond_17
    :goto_14
    invoke-static {v4, v6, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_13

    :goto_15
    invoke-static {v6, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lpy1/d;->K:I

    invoke-static {v6, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v5, v51

    move/from16 v7, v52

    invoke-virtual {v5, v6, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v5, v6, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->L()Lb91/a;

    move-result-object v21

    const/16 v24, 0x0

    const v26, 0x2fffa

    move-object v10, v2

    const/4 v2, 0x0

    move-object/from16 v23, v6

    const-wide/16 v5, 0x0

    move/from16 v46, v7

    const/4 v7, 0x0

    move-object/from16 v44, v4

    move-wide/from16 v69, v8

    move-object v9, v3

    move-wide/from16 v3, v69

    const/4 v8, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 v19, v10

    move/from16 v35, v11

    const-wide/16 v10, 0x0

    move-object/from16 v47, v12

    const/4 v12, 0x0

    move-object/from16 v48, v13

    const/4 v13, 0x0

    move-object/from16 v49, v14

    move-object/from16 v45, v15

    const-wide/16 v14, 0x0

    move/from16 v20, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v30, v18

    const/16 v18, 0x0

    move-object/from16 v33, v19

    const/16 v19, 0x0

    move/from16 v34, v20

    const/16 v20, 0x0

    move/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v55, p2

    move-object/from16 v64, v30

    move-object/from16 v63, v33

    move/from16 v62, v38

    move-object/from16 v60, v44

    move-object/from16 v56, v45

    move/from16 v61, v46

    move-object/from16 v57, v47

    move-object/from16 v58, v48

    move-object/from16 v59, v49

    move-object/from16 v38, v0

    move-object/from16 v0, v51

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    move/from16 v13, v61

    invoke-virtual {v0, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->a()J

    move-result-wide v3

    new-instance v1, Lvl0/c;

    const/4 v2, 0x3

    move-object/from16 v14, p0

    move-object/from16 v15, v31

    move-object/from16 v5, v32

    invoke-direct {v1, v14, v5, v15, v2}, Lvl0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    const v2, -0x2032f3f4

    invoke-static {v2, v6, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/16 v11, 0x6000

    const/16 v12, 0xd

    const-wide/16 v1, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object/from16 v10, v23

    move-object/from16 v65, v32

    invoke-static/range {v1 .. v12}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v10

    const/4 v9, 0x1

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {v29 .. v29}, Lvy1/d$b;->b()Z

    move-result v1

    if-eqz v1, :cond_22

    const v1, 0x732bf52b

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    move-object/from16 v10, v38

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v0, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    const/4 v4, 0x3

    int-to-float v4, v4

    const/4 v5, 0x4

    int-to-float v5, v5

    invoke-static {v1, v4, v5, v2, v3}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v12, v62

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v2, v63

    move-object/from16 v3, v64

    const/16 v4, 0x36

    invoke-static {v2, v3, v6, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_18

    move-object/from16 v8, v56

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_16
    move-object/from16 v9, v57

    goto :goto_17

    :cond_18
    move-object/from16 v8, v56

    invoke-virtual {v6}, Lp1/q;->s0()V

    goto :goto_16

    :goto_17
    invoke-static {v6, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v58

    invoke-static {v6, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_19

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    :cond_19
    move-object/from16 v11, v59

    goto :goto_19

    :cond_1a
    move-object/from16 v11, v59

    :goto_18
    move-object/from16 v4, v60

    goto :goto_1a

    :goto_19
    invoke-static {v4, v6, v4, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_18

    :goto_1a
    invoke-static {v6, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v29 .. v29}, Lvy1/d$b;->g()I

    move-result v1

    const/4 v7, 0x6

    invoke-static {v1, v6, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    mul-float v5, v5, v27

    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    mul-float v21, v37, v34

    const/16 v22, 0x0

    const/16 v23, 0xb

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v0, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->b1()J

    move-result-wide v18

    move/from16 v36, v7

    const/16 v7, 0x1b0

    move-object/from16 v45, v8

    const/4 v8, 0x0

    move-object/from16 v33, v2

    const/4 v2, 0x0

    move-object v14, v4

    move/from16 v66, v5

    move-object/from16 v38, v10

    move/from16 v22, v12

    move-object/from16 v20, v15

    move-wide/from16 v4, v18

    move-object/from16 v15, v33

    move-object/from16 v10, v45

    move-object v12, v3

    move-object/from16 v3, v16

    invoke-static/range {v1 .. v8}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v2, v1

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_1b

    goto :goto_1b

    :cond_1b
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1b
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v2, v1, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v1, v55

    const/16 v4, 0x36

    invoke-static {v15, v1, v6, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_1c

    invoke-virtual {v6, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_1c
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v6, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_1d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    :cond_1d
    invoke-static {v3, v6, v3, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v6, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v29 .. v29}, Lvy1/d$b;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v6, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->L()Lb91/a;

    move-result-object v21

    invoke-virtual {v0, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v3

    const/16 v24, 0x0

    const v26, 0x2fffa

    const/4 v2, 0x0

    move/from16 v30, v5

    move-object/from16 v23, v6

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move/from16 v46, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v31, v20

    const/16 v20, 0x0

    move/from16 v62, v22

    const/16 v22, 0x0

    move/from16 v67, v46

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    invoke-virtual/range {v29 .. v29}, Lvy1/d$b;->e()Ljava/lang/String;

    move-result-object v1

    move/from16 v2, v67

    invoke-virtual {v0, v6, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->c()Lb91/a;

    move-result-object v21

    invoke-virtual {v0, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v3

    move/from16 v46, v2

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    move/from16 v68, v46

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    const/4 v9, 0x1

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {v29 .. v29}, Lvy1/d$b;->d()I

    move-result v1

    const/4 v7, 0x6

    invoke-static {v1, v6, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    move/from16 v2, v28

    and-int/lit16 v2, v2, 0x380

    const/16 v3, 0x100

    if-ne v2, v3, :cond_1f

    move v13, v9

    goto :goto_1d

    :cond_1f
    const/4 v13, 0x0

    :goto_1d
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v13, :cond_21

    move-object/from16 v3, v53

    if-ne v2, v3, :cond_20

    goto :goto_1e

    :cond_20
    move-object/from16 v10, v65

    goto :goto_1f

    :cond_21
    :goto_1e
    new-instance v2, Lry2/g;

    const/16 v3, 0x12

    move-object/from16 v10, v65

    invoke-direct {v2, v10, v3}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1f
    move-object/from16 v19, v2

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, v38

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v3, v66

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v13, v68

    invoke-virtual {v0, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v4

    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v8}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_22
    move-object/from16 v31, v15

    move-object/from16 v10, v65

    const/4 v1, 0x0

    const v2, 0x734f7921

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    :goto_20
    invoke-virtual/range {v29 .. v29}, Lvy1/d$b;->a()Z

    move-result v2

    if-nez v2, :cond_23

    const v2, 0x7350b228

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, v38

    move/from16 v17, v62

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {v29 .. v29}, Lvy1/d$b;->i()I

    move-result v3

    invoke-static {v6, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v4

    invoke-virtual {v0, v6, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v21

    const/16 v24, 0x30

    const v26, 0x2fff8

    move/from16 v42, v1

    move-object v1, v3

    move-wide v3, v4

    move-object/from16 v23, v6

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v30, v9

    const/4 v9, 0x0

    move-object/from16 v32, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move/from16 v0, v42

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_21
    const/4 v5, 0x1

    goto :goto_22

    :cond_23
    move/from16 v42, v1

    move-object/from16 v32, v10

    move/from16 v17, v62

    const v1, 0x73564140

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, v38

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v1, Lpy1/d;->O:I

    invoke-static {v6, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v3

    invoke-virtual {v0, v6, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v21

    const/16 v24, 0x30

    const v26, 0x2fff8

    move-object/from16 v23, v6

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move/from16 v0, v42

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_21

    :goto_22
    invoke-static {v6, v5, v5, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v2, v31

    move-object/from16 v3, v32

    goto :goto_23

    :cond_24
    move v0, v13

    const v1, -0x62a691e5

    invoke-static {v1, v6, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_25
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v7

    :goto_23
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_26

    new-instance v0, Lvy1/a;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lvy1/a;-><init>(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;III)V

    goto/16 :goto_9

    :cond_26
    return-void
.end method

.method private static final p(Lvy1/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lvy1/b;->o(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lc41/p2;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    sget p1, Lc41/p2;->v:I

    shl-int/lit8 v4, p1, 0x3

    const/4 v5, 0x5

    const/4 v0, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final t(Lvy1/d;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    and-int/lit8 v2, p4, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p4, 0x1

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    check-cast p0, Lvy1/d$b;

    invoke-virtual {p0}, Lvy1/d$b;->b()Z

    move-result v5

    invoke-virtual {p0}, Lvy1/d$b;->a()Z

    move-result v6

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p0, v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p0, :cond_1

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne v2, p0, :cond_2

    :cond_1
    new-instance v2, Lat2/l;

    const/4 p0, 0x6

    invoke-direct {v2, v0, v1, p0}, Lat2/l;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v11, v2

    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    const/16 v14, 0x39

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v14}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lc93/a;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    if-eqz p2, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lvy1/c$c;

    const/4 p2, 0x0

    invoke-direct {p0, p2}, Lvy1/c$c;-><init>(Z)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lvy1/b;->o(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, 0x336e0c04

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v6, v0, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v5, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v4

    goto :goto_0

    :cond_1
    move v7, v3

    :goto_0
    or-int/2addr v7, v0

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v0

    :goto_1
    and-int/lit8 v8, v7, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v8, v3, :cond_3

    move v3, v10

    goto :goto_2

    :cond_3
    move v3, v9

    :goto_2
    and-int/lit8 v8, v7, 0x1

    invoke-virtual {v5, v8, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_10

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_4

    new-instance v2, Lvs2/d;

    const/16 v6, 0x19

    invoke-direct {v2, v6}, Lvs2/d;-><init>(I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v8, v2

    goto :goto_3

    :cond_5
    move-object v8, v6

    :goto_3
    const v2, 0x59f3c69b

    invoke-virtual {v5, v2}, Lp1/q;->f0(I)V

    sget-object v2, Lpf3/a;->b:Lnf3/a;

    if-eqz v2, :cond_f

    iget-object v2, v2, Lnf3/a;->a:Lwf3/a;

    iget-object v11, v2, Lwf3/a;->d:Lxf3/c;

    const v2, 0x59f3c7cc

    const v6, -0x384098

    invoke-static {v5, v2, v5, v9, v6}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v2

    const/4 v12, 0x0

    invoke-virtual {v5, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    const/4 v13, 0x0

    invoke-virtual {v5, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v6, v14

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v6, :cond_6

    if-ne v14, v3, :cond_7

    :cond_6
    move-object/from16 v16, v13

    new-instance v13, Lvy1/b$a;

    invoke-direct {v13, v2}, Lvy1/b$a;-><init>(Ljf3/a;)V

    const-class v2, Luy1/e;

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static/range {v11 .. v16}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v14

    invoke-virtual {v5, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    check-cast v14, Landroidx/lifecycle/w1;

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    check-cast v14, Luy1/e;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Lp1/t1;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/g0;

    invoke-virtual {v5, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v6, v11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_8

    if-ne v11, v3, :cond_9

    :cond_8
    new-instance v11, Lum0/b;

    const/16 v6, 0x11

    invoke-direct {v11, v6, v2, v14}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v11, v5}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v14}, Luy1/e;->getViewState()Lec3/f2;

    move-result-object v2

    invoke-static {v2, v5, v9}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-static {v2}, Lvy1/b;->B(Lp1/t2;)Lvy1/d;

    move-result-object v6

    invoke-virtual {v5, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_a

    if-ne v12, v3, :cond_b

    :cond_a
    new-instance v12, Luo1/b;

    const/16 v11, 0xf

    invoke-direct {v12, v14, v11}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v12, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v7, v7, 0xe

    if-ne v7, v4, :cond_c

    move v9, v10

    :cond_c
    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_d

    if-ne v7, v3, :cond_e

    :cond_d
    new-instance v7, Lui0/q;

    const/16 v3, 0x13

    invoke-direct {v7, v3, v8, v2}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v4, v7

    check-cast v4, Lc93/a;

    move-object v2, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v12

    invoke-static/range {v2 .. v7}, Lvy1/b;->o(Lvy1/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    goto :goto_4

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_11

    new-instance v3, Lau1/k;

    const/4 v4, 0x6

    invoke-direct {v3, v0, v1, v4, v6}, Lau1/k;-><init>(IIILkotlin/jvm/functions/Function1;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final y(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Landroidx/lifecycle/g0;Luy1/e;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcu2/r;

    const/4 v0, 0x4

    invoke-direct {p2, p1, v0}, Lcu2/r;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance p1, Lvy1/b$b;

    invoke-direct {p1, p0, p2}, Lvy1/b$b;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/e0;)V

    return-object p1
.end method
