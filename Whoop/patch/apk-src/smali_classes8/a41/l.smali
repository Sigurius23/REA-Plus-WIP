.class public abstract La41/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aA\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a/\u0010\u0012\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a%\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u000c2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0019H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u001f\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "La41/m;",
        "viewState",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "s",
        "(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "autoscroll",
        "",
        "pageCount",
        "Lq0/y;",
        "pagerState",
        "z",
        "(ZILq0/y;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;I)V",
        "La41/a;",
        "testimonial",
        "q",
        "(La41/a;Landroidx/compose/runtime/Composer;I)V",
        "isSelected",
        "Lkotlin/Function0;",
        "onClick",
        "n",
        "(ZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "C",
        "(Landroidx/compose/runtime/Composer;I)V",
        "E",
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
.method private static final A(ZILq0/y;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, La41/l;->z(ZILq0/y;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(ZILq0/y;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, La41/l;->z(ZILq0/y;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final C(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x666f2879

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, La41/l$d;

    invoke-direct {v1}, La41/l$d;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, La11/h;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final D(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La41/l;->C(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final E(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x3b3d3c9f

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, La41/l$f;

    invoke-direct {v1}, La41/l$f;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, La11/h;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final F(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La41/l;->E(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La41/l;->F(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZILq0/y;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, La41/l;->B(ZILq0/y;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZILq0/y;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, La41/l;->A(ZILq0/y;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;ZLandroidx/compose/runtime/Composer;II)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p3, p2, p4}, La41/l;->p(ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, La41/l;->t(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lbc3/c0;Lq0/b;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La41/l;->x(Lbc3/c0;Lq0/y;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, La41/l;->u(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La41/l;->D(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, La41/l;->y(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(La41/m;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, La41/l;->w(La41/m;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(La41/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, La41/l;->r(La41/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, La41/l;->o(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(La41/m;)I
    .locals 0

    invoke-static {p0}, La41/l;->v(La41/m;)I

    move-result p0

    return p0
.end method

.method private static final n(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x711f9ba4

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v7, v2, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v8

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit8 v7, v4, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v7, v9, :cond_4

    move v7, v10

    goto :goto_3

    :cond_4
    move v7, v11

    :goto_3
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v3, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_a

    int-to-float v5, v5

    int-to-float v6, v6

    mul-float/2addr v5, v6

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lt0/j;->a:Lt0/i;

    invoke-static {v5, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x6

    if-eqz v0, :cond_5

    const v7, 0x4d4481fa    # 2.0605328E8f

    invoke-virtual {v3, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7, v3, v6, v11}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v6

    goto :goto_4

    :cond_5
    const v7, 0x4d45a05d    # 2.0722632E8f

    invoke-virtual {v3, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7, v3, v6, v11}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v6

    :goto_4
    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v6, v7, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_6

    invoke-static {v3}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v5

    :cond_6
    move-object v13, v5

    check-cast v13, Lj0/i;

    and-int/lit8 v4, v4, 0x70

    if-ne v4, v8, :cond_7

    goto :goto_5

    :cond_7
    move v10, v11

    :goto_5
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v10, :cond_8

    if-ne v4, v6, :cond_9

    :cond_8
    new-instance v4, La41/f;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, La41/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v17, v4

    check-cast v17, Lc93/a;

    const/16 v18, 0x1c

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v3, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_a
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, La41/j;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v1, v2, v5}, La41/j;-><init>(ZLc93/a;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final o(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, La41/l;->n(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(La41/a;Landroidx/compose/runtime/Composer;I)V
    .locals 52

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, 0x7910ba09

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v6, v2, 0x3

    const/4 v7, 0x1

    if-eq v6, v4, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-int/2addr v2, v7

    invoke-virtual {v5, v2, v6}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {v0}, La41/a;->a()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_4

    invoke-virtual {v0}, La41/a;->e()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    invoke-virtual {v0}, La41/a;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    const/16 v28, 0x0

    goto :goto_4

    :cond_4
    :goto_3
    move/from16 v28, v7

    :goto_4
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v3

    invoke-static {v2, v3, v3}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v9, v5, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->a1()J

    move-result-wide v11

    sget-object v13, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v11, v12, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v4, v4

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v4, v11

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/16 v13, 0x36

    invoke-static {v4, v12, v5, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v14, v5, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_5

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v5, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-nez v13, :cond_6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v13, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    :cond_6
    invoke-static {v14, v5, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v5, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, La41/a;->c()Ljava/lang/String;

    move-result-object v29

    sget-object v2, Liz0/l;->a:Liz0/l;

    const/4 v13, 0x6

    invoke-static {v9, v5, v13}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v30

    const/16 v43, 0x0

    const v44, 0xff7fff

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x5

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    invoke-static/range {v30 .. v44}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v13

    const/4 v14, 0x6

    invoke-virtual {v9, v5, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->c1()J

    move-result-wide v18

    invoke-virtual {v9, v5, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->k0()J

    move-result-wide v20

    const/high16 v26, 0x30000

    const/16 v27, 0x7ff8

    move-object/from16 v23, v8

    move-object/from16 v22, v9

    const-wide/16 v8, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move/from16 v25, v11

    move-object/from16 v30, v12

    const-wide/16 v11, 0x0

    move/from16 v31, v3

    move-object v3, v13

    const/4 v13, 0x0

    move/from16 v33, v14

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const/16 v34, 0x1

    const/16 v16, 0x0

    move-object/from16 v35, v24

    const/16 v36, 0x36

    move-object/from16 v24, v5

    move-wide/from16 v50, v18

    move-object/from16 v19, v4

    move-wide/from16 v4, v50

    const-wide/16 v17, 0x0

    move-object/from16 v37, v19

    const/16 v19, 0x0

    move-object/from16 v38, v6

    move-wide/from16 v50, v20

    move-object/from16 v21, v7

    move-wide/from16 v6, v50

    const/16 v20, 0x0

    move-object/from16 v39, v21

    const/16 v21, 0x0

    move-object/from16 v40, v22

    const/16 v22, 0x0

    move-object/from16 v41, v23

    const/16 v23, 0x0

    move/from16 v42, v25

    const/16 v25, 0x0

    move-object/from16 v47, v32

    move/from16 v0, v34

    move-object/from16 v48, v35

    move-object/from16 v46, v37

    move-object/from16 v45, v39

    move/from16 v1, v42

    invoke-virtual/range {v2 .. v27}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v5

    const/16 v12, 0x180

    const/16 v13, 0x1f2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v11, v24

    move-object/from16 v2, v29

    invoke-static/range {v2 .. v13}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v5, v11

    if-eqz v28, :cond_13

    const v2, -0x6ad44a58

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    int-to-float v15, v0

    mul-float v11, v15, v1

    const/4 v13, 0x0

    const/16 v14, 0xd

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v9, v38

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v12, v9

    sget-object v3, Lb2/e;->K:Lb2/l;

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v6

    const/16 v6, 0x36

    invoke-static {v4, v1, v3, v5, v6}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    move-object/from16 v13, v41

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v14, v45

    goto :goto_7

    :cond_8
    move-object/from16 v13, v41

    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v5, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v46

    invoke-static {v5, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    move-object/from16 v9, v47

    goto :goto_9

    :cond_a
    move-object/from16 v9, v47

    :goto_8
    move-object/from16 v10, v48

    goto :goto_a

    :goto_9
    invoke-static {v4, v5, v4, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v5, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, La41/a;->a()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_b

    const v1, -0x417d6c5c

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move-object v1, v8

    move-object v0, v9

    move-object/from16 v24, v10

    move/from16 v16, v15

    move v15, v11

    goto :goto_b

    :cond_b
    const/4 v11, 0x0

    const v3, -0x417d6c5b

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object/from16 v24, v5

    mul-float v1, v1, v31

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lt0/j;->a:Lt0/i;

    invoke-static {v1, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, La41/a;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ProfileImage_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v48, v10

    const/16 v10, 0x6030

    move/from16 v49, v11

    const/16 v11, 0x68

    const/4 v3, 0x0

    const/4 v5, 0x0

    sget-object v6, Ly2/j;->a:Ly2/b1;

    const/4 v7, 0x0

    move-object/from16 v46, v8

    const/4 v8, 0x0

    move-object v0, v9

    move/from16 v16, v15

    move-object/from16 v9, v24

    move-object/from16 v1, v46

    move-object/from16 v24, v48

    move/from16 v15, v49

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    invoke-virtual {v5, v15}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual/range {p0 .. p0}, La41/a;->e()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_d

    invoke-virtual/range {p0 .. p0}, La41/a;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_c

    goto :goto_c

    :cond_c
    const v0, -0x4164727c

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v15}, Lp1/q;->q(Z)V

    move v0, v15

    const/4 v1, 0x1

    goto/16 :goto_14

    :cond_d
    :goto_c
    const v2, -0x4174322e

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    mul-float v2, v16, v31

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    move-object/from16 v3, v30

    const/4 v4, 0x6

    invoke-static {v2, v3, v5, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_e

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_e
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v5, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_f

    :cond_f
    :goto_e
    move-object/from16 v10, v24

    goto :goto_10

    :cond_10
    :goto_f
    invoke-static {v3, v5, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v5, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, La41/a;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x5

    if-nez v2, :cond_11

    const v1, -0x65275f9e

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v15}, Lp1/q;->q(Z)V

    move v0, v15

    move-object/from16 v1, v40

    goto :goto_11

    :cond_11
    const v1, -0x65275f9d

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    move-object/from16 v1, v40

    invoke-virtual {v1, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->d()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v6

    new-instance v14, Lw3/k;

    invoke-direct {v14, v0}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0x2fdfa

    const/4 v3, 0x0

    move/from16 v18, v4

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move/from16 v49, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move/from16 v33, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move/from16 v0, v49

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual/range {p0 .. p0}, La41/a;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_12

    const v1, -0x65209687

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_12
    const/4 v1, 0x1

    goto :goto_13

    :cond_12
    const v3, -0x65209686

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    const/4 v13, 0x6

    invoke-virtual {v1, v5, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->d()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v5, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v3

    new-instance v14, Lw3/k;

    const/4 v1, 0x5

    invoke-direct {v14, v1}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0x2fdfa

    move-object/from16 v24, v5

    move-wide v4, v3

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_13
    move v1, v0

    const/4 v0, 0x0

    const v2, -0x6ab796bd

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_14
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_16
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v1, La41/i;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final r(La41/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, La41/l;->q(La41/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "La41/m;",
            "Landroidx/lifecycle/g0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v0, -0x614d4dd5

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v7, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v1, v5, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v7

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v5

    :goto_1
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit16 v4, v5, 0x180

    if-nez v4, :cond_7

    and-int/lit8 v4, p6, 0x4

    if-nez v4, :cond_5

    move-object/from16 v4, p2

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    move-object/from16 v4, p2

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    goto :goto_4

    :cond_7
    move-object/from16 v4, p2

    :goto_4
    and-int/lit8 v6, p6, 0x8

    const/16 v9, 0x800

    if-eqz v6, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v14, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    move v11, v9

    goto :goto_5

    :cond_a
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v3, v11

    :goto_6
    and-int/lit16 v11, v3, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_b

    const/4 v11, 0x1

    goto :goto_7

    :cond_b
    move v11, v13

    :goto_7
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v14, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_2c

    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v11, v5, 0x1

    sget-object v12, Lb2/t;->w:Lb2/t;

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_e

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_d

    and-int/lit16 v3, v3, -0x381

    :cond_d
    move v0, v3

    move-object v3, v4

    :goto_8
    move-object v4, v10

    goto :goto_b

    :cond_e
    :goto_9
    if-eqz v0, :cond_f

    move-object v1, v12

    :cond_f
    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_10

    sget-object v0, Lj8/c;->a:Lp1/t1;

    invoke-virtual {v14, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/g0;

    and-int/lit16 v3, v3, -0x381

    goto :goto_a

    :cond_10
    move-object v0, v4

    :goto_a
    if-eqz v6, :cond_12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_11

    new-instance v4, Lp;

    const/4 v6, 0x6

    invoke-direct {v4, v6}, Lp;-><init>(I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move/from16 v37, v3

    move-object v3, v0

    move/from16 v0, v37

    goto :goto_b

    :cond_12
    move v4, v3

    move-object v3, v0

    move v0, v4

    goto :goto_8

    :goto_b
    invoke-virtual {v14}, Lp1/q;->r()V

    invoke-virtual {v2}, La41/m;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2d

    new-instance v0, La41/e;

    const/4 v7, 0x0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La41/e;-><init>(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;III)V

    :goto_c
    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_13
    move-object v11, v1

    move-object v10, v2

    invoke-virtual {v10}, La41/m;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-virtual {v10}, La41/m;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v13

    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, La41/a;

    invoke-virtual/range {v16 .. v16}, La41/a;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_e

    :cond_14
    add-int/lit8 v6, v6, 0x1

    goto :goto_d

    :cond_15
    const/4 v6, -0x1

    :goto_e
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-ltz v6, :cond_16

    goto :goto_f

    :cond_16
    const/4 v1, 0x0

    :goto_f
    if-eqz v1, :cond_17

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_10

    :cond_17
    move v1, v13

    :goto_10
    invoke-virtual {v14, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_18

    if-ne v5, v8, :cond_19

    :cond_18
    new-instance v5, La41/f;

    const/4 v2, 0x0

    invoke-direct {v5, v10, v2}, La41/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v5, Lc93/a;

    invoke-static {v5, v1, v13, v14, v7}, Lq0/c0;->b(Lc93/a;IILandroidx/compose/runtime/Composer;I)Lq0/b;

    move-result-object v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_1a

    invoke-static {v14}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v2, Lbc3/c0;

    move-object v5, v4

    move-object v4, v3

    move-object v3, v1

    invoke-virtual {v10}, La41/m;->a()Z

    move-result v1

    invoke-virtual {v10}, La41/m;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    shl-int/lit8 v13, v0, 0x3

    and-int/lit16 v13, v13, 0x1c00

    move-object v15, v14

    move-object v14, v2

    move v2, v6

    move v6, v13

    move-object v13, v5

    move-object v5, v15

    const/4 v15, 0x0

    invoke-static/range {v1 .. v6}, La41/l;->z(ZILq0/y;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v18, v4

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v9, :cond_1b

    const/4 v0, 0x1

    goto :goto_11

    :cond_1b
    const/4 v0, 0x0

    :goto_11
    or-int/2addr v0, v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1c

    if-ne v1, v8, :cond_1d

    :cond_1c
    new-instance v1, La41/l$a;

    invoke-direct {v1, v3, v10, v13, v15}, La41/l$a;-><init>(Lq0/y;La41/m;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v1, Lc93/m;

    invoke-static {v5, v1, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "Testimonials"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    int-to-float v4, v7

    const/16 v6, 0x8

    int-to-float v6, v6

    const/16 v7, 0x36

    invoke-static {v4, v6, v2, v5, v7}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_1e

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_12
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_1f

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 p3, v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_13

    :cond_1f
    move-object/from16 p3, v2

    :goto_13
    invoke-static {v6, v5, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10}, La41/m;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_21

    const v1, 0x30192412

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v6, La41/g;

    invoke-direct {v6, v10}, La41/g;-><init>(La41/m;)V

    const v2, -0x6101f1a7

    invoke-static {v2, v5, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v16, 0x6000

    const/16 v19, 0x1

    const/16 v17, 0x3ffc

    move-object/from16 v20, v13

    move-object v13, v2

    move-object v2, v1

    move-object v1, v3

    const/4 v3, 0x0

    move/from16 v21, v4

    const/4 v4, 0x0

    move-object/from16 v22, v14

    move-object v14, v5

    const/4 v5, 0x0

    move/from16 v23, v6

    const/4 v6, 0x0

    move-object/from16 v24, v7

    const/4 v7, 0x0

    move-object/from16 v25, v8

    const/4 v8, 0x0

    move-object/from16 v26, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    move-object/from16 v29, v15

    const/16 v15, 0x30

    move-object/from16 v33, p3

    move-object/from16 p2, v0

    move-object/from16 v30, v22

    move/from16 v0, v23

    move-object/from16 v34, v24

    move-object/from16 v36, v25

    move-object/from16 v31, v26

    move-object/from16 v35, v28

    move-object/from16 v32, v29

    const/16 v19, 0x0

    invoke-static/range {v1 .. v17}, Ldp/d;->d(Lq0/y;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;IFLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lf0/k;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    move-object v3, v1

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_21
    move-object/from16 v33, p3

    move-object/from16 p2, v0

    move/from16 v21, v4

    move-object/from16 v34, v7

    move-object/from16 v36, v8

    move-object/from16 v31, v9

    move-object/from16 v27, v11

    move-object/from16 v35, v12

    move-object/from16 v20, v13

    move-object/from16 v30, v14

    move-object/from16 v32, v15

    const/4 v0, 0x0

    const/16 v19, 0x0

    move-object v14, v5

    const v1, 0x301ff08d

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, La41/m;->c()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La41/a;

    if-nez v2, :cond_22

    const v1, 0x301ff08c

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_22
    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-static {v2, v14, v0}, La41/l;->q(La41/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual/range {p1 .. p1}, La41/m;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_2b

    const v1, 0x3022ebed

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    const-string v1, "PaginationDots"

    move-object/from16 v4, v35

    invoke-static {v4, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float v4, v4, v21

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x6

    invoke-static {v4, v5, v14, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_23

    move-object/from16 v7, v31

    invoke-virtual {v14, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_16
    move-object/from16 v7, v32

    goto :goto_17

    :cond_23
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_16

    :goto_17
    invoke-static {v14, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v33

    invoke-static {v14, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_24

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_25

    :cond_24
    move-object/from16 v4, v34

    goto :goto_19

    :cond_25
    :goto_18
    move-object/from16 v4, p2

    goto :goto_1a

    :goto_19
    invoke-static {v5, v14, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_18

    :goto_1a
    invoke-static {v14, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0xc3f09e2

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, La41/m;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v13, v0

    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v13, 0x1

    if-ltz v13, :cond_29

    check-cast v4, La41/a;

    invoke-virtual {v3}, Lq0/y;->k()I

    move-result v4

    if-ne v13, v4, :cond_26

    move v4, v2

    :goto_1c
    move-object/from16 v6, v30

    goto :goto_1d

    :cond_26
    move v4, v0

    goto :goto_1c

    :goto_1d
    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v14, v13}, Lp1/q;->e(I)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_27

    move-object/from16 v7, v36

    if-ne v8, v7, :cond_28

    goto :goto_1e

    :cond_27
    move-object/from16 v7, v36

    :goto_1e
    new-instance v8, La41/h;

    const/4 v9, 0x0

    invoke-direct {v8, v6, v3, v13, v9}, La41/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v8, Lc93/a;

    invoke-static {v4, v8, v14, v0}, La41/l;->n(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    move v13, v5

    move-object/from16 v30, v6

    move-object/from16 v36, v7

    goto :goto_1b

    :cond_29
    invoke-static {}, Lwb3/f;->d0()V

    throw v19

    :cond_2a
    invoke-static {v14, v0, v2, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_1f

    :cond_2b
    const v1, 0x302c4e6d

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    move-object/from16 v3, v18

    move-object/from16 v4, v20

    move-object/from16 v1, v27

    goto :goto_20

    :cond_2c
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v4

    move-object v4, v10

    :goto_20
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2d

    new-instance v0, La41/e;

    const/4 v7, 0x1

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La41/e;-><init>(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;III)V

    goto/16 :goto_c

    :cond_2d
    return-void
.end method

.method private static final t(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, La41/l;->s(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(La41/m;)I
    .locals 0

    invoke-virtual {p0}, La41/m;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method private static final w(La41/m;Lq0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p4, "$this$HorizontalPager"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, La41/m;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La41/a;

    const/4 p1, 0x0

    invoke-static {p0, p3, p1}, La41/l;->q(La41/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lbc3/c0;Lq0/y;I)Ll83/a0;
    .locals 2

    new-instance v0, La41/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, La41/l$b;-><init>(Lq0/y;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, La41/l;->s(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(ZILq0/y;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p4, Lp1/q;

    const v0, 0x15378e24

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p4, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v1, p5, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {p4, p1}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p5, 0x180

    const/16 v3, 0x100

    if-nez v1, :cond_5

    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, p5, 0xc00

    if-nez v1, :cond_7

    invoke-virtual {p4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    and-int/lit16 v1, v0, 0x493

    const/16 v4, 0x492

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v1, v4, :cond_8

    move v1, v6

    goto :goto_5

    :cond_8
    move v1, v5

    :goto_5
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {p4, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_f

    if-eqz p0, :cond_e

    if-gt p1, v6, :cond_9

    goto :goto_7

    :cond_9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit16 v7, v0, 0x380

    if-ne v7, v3, :cond_a

    move v3, v6

    goto :goto_6

    :cond_a
    move v3, v5

    :goto_6
    or-int/2addr v3, v4

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_b

    move v5, v6

    :cond_b
    or-int v0, v3, v5

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_c

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_d

    :cond_c
    new-instance v2, La41/l$c;

    const/4 v0, 0x0

    invoke-direct {v2, p3, p2, p1, v0}, La41/l$c;-><init>(Landroidx/lifecycle/g0;Lq0/y;ILq83/d;)V

    invoke-virtual {p4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v2, Lc93/m;

    invoke-static {v1, p3, v2, p4}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    goto :goto_8

    :cond_e
    :goto_7
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_10

    new-instance v0, La41/d;

    const/4 v6, 0x1

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, La41/d;-><init>(ZILq0/y;Landroidx/lifecycle/g0;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_f
    move v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_10

    move v6, v5

    move-object v5, v4

    move-object v4, v3

    move v3, v2

    move v2, v1

    new-instance v1, La41/d;

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, La41/d;-><init>(ZILq0/y;Landroidx/lifecycle/g0;II)V

    iput-object v1, p0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method
