.class public abstract Ls90/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a/\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u000c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0012\u00a8\u0006\u0018\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ls90/h;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "q",
        "(Ls90/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ls90/b;",
        "o",
        "(Ls90/b;Landroidx/compose/runtime/Composer;I)V",
        "Ll0/s1;",
        "Ls90/c;",
        "onItemClicked",
        "w",
        "(Ll0/s1;Ls90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "K",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "H",
        "",
        "numberOfCodesShared",
        "",
        "wasShared",
        "activation_release"
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
.method private static final A(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ls90/g;->H(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Ls90/c;Lp1/c1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 8

    const-string v0, "$this$applyIf"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lj0/j;

    invoke-direct {v2}, Lj0/j;-><init>()V

    new-instance v6, Lre1/k;

    const/4 v0, 0x2

    invoke-direct {v6, p0, p1, p2, v0}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 v7, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p3

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;Ls90/c;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p2}, Ls90/g;->x(Lp1/c1;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p0, 0x1

    invoke-static {p2, p0}, Ls90/g;->y(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqx0/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lqx0/a;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string p2, "$this$composed"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, -0x1b41d17b

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p2, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->W0()J

    move-result-wide v0

    const/4 p2, 0x2

    int-to-float p2, p2

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {p0, p2, v2, v0, v1}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final F(Ll0/s1;Ls90/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ls90/g;->w(Ll0/s1;Ls90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic G(Lp1/a1;)I
    .locals 0

    invoke-static {p0}, Ls90/g;->r(Lp1/a1;)I

    move-result p0

    return p0
.end method

.method private static final H(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Ls32/d;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ls32/d;-><init>(I)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance v0, Ls32/d;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Ls32/d;-><init>(I)V

    invoke-static {p0, v0}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final I(Lk2/e;)Ll83/a0;
    .locals 15

    const-string v0, "$this$drawBehind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-wide v0, Li2/x;->f:J

    const v2, 0x3dcccccd    # 0.1f

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v6, Lk2/i;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    new-instance v11, Li2/k;

    new-instance v1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v11, v1}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v12, 0xe

    const/high16 v7, 0x40000000    # 2.0f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/4 v0, 0x3

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-interface {p0, v0}, Ly3/c;->q0(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v7, v0

    const/16 v0, 0x20

    shl-long v0, v1, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v2, v7

    or-long v10, v0, v2

    const/4 v13, 0x0

    const/16 v14, 0xe6

    move-object v12, v6

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v14}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    nop

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method private static final J(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3e99999a    # 0.3f

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->a(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lqx0/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lqx0/a;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final L(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string p2, "$this$composed"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, 0x2d67b13f

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p2, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->W0()J

    move-result-wide v0

    const/4 p2, 0x3

    int-to-float p2, p2

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {p0, p2, v2, v0, v1}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Ls90/g;->z(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls90/g;->t(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ls90/g;->I(Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ls90/g;->E(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Ls90/g;->D(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Ls90/g;->A(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;Ls90/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls90/g;->u(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;Ls90/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ls90/c;Lp1/c1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls90/g;->B(Lkotlin/jvm/functions/Function1;Ls90/c;Lp1/c1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ls90/g;->L(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ll0/s1;Ls90/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ls90/g;->F(Ll0/s1;Ls90/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ls90/g;->J(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ls90/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls90/g;->p(Ls90/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ls90/c;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ls90/g;->C(Lkotlin/jvm/functions/Function1;Ls90/c;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ls90/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ls90/g;->v(Ls90/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ls90/b;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x4e0999bd    # 5.771385E8f

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, v2, 0x3

    const/4 v8, 0x1

    if-eq v5, v4, :cond_2

    move v5, v8

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    and-int/2addr v2, v8

    invoke-virtual {v7, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->T()J

    move-result-wide v11

    const/4 v13, 0x3

    int-to-float v13, v13

    int-to-float v3, v3

    invoke-static {v2, v13, v3, v11, v12}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v4, v4

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v4, v11

    const-wide/high16 v12, 0x4004000000000000L    # 2.5

    double-to-float v12, v12

    mul-float/2addr v12, v11

    invoke-static {v2, v4, v4, v4, v12}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v11, v12, v7, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_3

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    :cond_4
    invoke-static {v12, v7, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v7, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ls90/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v7, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v9, v7, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v26, v6, 0x12

    const v27, 0x2fffa

    move v6, v3

    const/4 v3, 0x0

    move v9, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move v10, v8

    const/4 v8, 0x0

    move v14, v9

    const/4 v9, 0x0

    move v15, v10

    const/4 v10, 0x0

    move/from16 v16, v4

    move-object/from16 v17, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v28, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move-object/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move-object/from16 v0, v31

    move/from16 v1, v32

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const v2, -0x706c6864

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ls90/b;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v31

    :goto_4
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ls90/a;

    sget-object v2, Lb2/e;->K:Lb2/l;

    invoke-static/range {v29 .. v29}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v4, 0x36

    invoke-static {v3, v2, v7, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_6

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v3, v7, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x5

    int-to-float v2, v2

    mul-float v2, v2, v28

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v10}, Ls90/a;->a()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2, v7, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v7, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v5

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const-string v3, ""

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10}, Ls90/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v7, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v7, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v11, v7, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v4

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v26, v3, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const/4 v15, 0x1

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_4

    :cond_9
    const/4 v2, 0x0

    const/4 v15, 0x1

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, Los0/d;

    const/16 v2, 0x1b

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final p(Ls90/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ls90/g;->o(Ls90/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final q(Ls90/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls90/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0xbdc3bb4

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    const/16 v10, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v10

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v8, 0x12

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v6, v8, :cond_4

    move v6, v12

    goto :goto_3

    :cond_4
    move v6, v11

    :goto_3
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v7, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v6, v13, :cond_5

    invoke-static {v11, v7}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v6

    :cond_5
    move-object v14, v6

    check-cast v14, Lp1/a1;

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v10, :cond_6

    move v6, v12

    goto :goto_4

    :cond_6
    move v6, v11

    :goto_4
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_7

    if-ne v8, v13, :cond_8

    :cond_7
    new-instance v8, Ls90/e;

    const/4 v6, 0x0

    invoke-direct {v8, v1, v0, v14, v6}, Ls90/e;-><init>(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;I)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    invoke-static {v6, v8, v7}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    const/4 v6, 0x7

    int-to-float v6, v6

    const/16 v8, 0x8

    int-to-float v15, v8

    mul-float v18, v6, v15

    int-to-float v4, v4

    mul-float v17, v4, v15

    const/16 v20, 0x0

    const/16 v21, 0x8

    sget-object v16, Lb2/t;->w:Lb2/t;

    move/from16 v19, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v11, v7, v12}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v6

    const/16 v8, 0xe

    invoke-static {v4, v6, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v5, v5

    mul-float/2addr v5, v15

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x6

    invoke-static {v5, v6, v7, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

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

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v7, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v7, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    :cond_a
    invoke-static {v6, v7, v6, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v7, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ls90/h;->f()Lkd1/o;

    move-result-object v4

    move-object v6, v5

    invoke-virtual {v0}, Ls90/h;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object v11, v6

    invoke-virtual {v0}, Ls90/h;->h()Ljava/lang/String;

    move-result-object v6

    sget v21, Lkd1/o;->a:I

    sget v22, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v22, v22, 0x3

    or-int v21, v21, v22

    move-object/from16 v22, v9

    const/4 v9, 0x0

    move-object v2, v8

    move-object/from16 p2, v14

    move-object/from16 v1, v16

    move/from16 v8, v21

    const/4 v14, 0x6

    move/from16 v16, v15

    move-object v15, v11

    move-object/from16 v11, v22

    invoke-static/range {v4 .. v9}, Lk80/q;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v8, Lb2/e;->J:Lb2/l;

    invoke-static {v6, v8, v7, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    move/from16 v17, v14

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_c

    invoke-virtual {v7, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v7, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_d

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    invoke-static {v8, v7, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v7, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x48249c6a

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ls90/h;->j()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls90/c;

    const/16 v6, 0x20

    if-ne v3, v6, :cond_f

    const/4 v8, 0x1

    goto :goto_8

    :cond_f
    const/4 v8, 0x0

    :goto_8
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_11

    if-ne v9, v13, :cond_10

    goto :goto_9

    :cond_10
    move-object/from16 v10, p1

    move-object/from16 v11, p2

    goto :goto_a

    :cond_11
    :goto_9
    new-instance v9, Ls90/e;

    const/4 v8, 0x1

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    invoke-direct {v9, v10, v0, v11, v8}, Ls90/e;-><init>(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;I)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v12, Lkd1/o;->a:I

    or-int/2addr v12, v8

    or-int/2addr v12, v8

    or-int/2addr v8, v12

    shl-int/lit8 v8, v8, 0x3

    or-int v8, v17, v8

    sget-object v12, Ll0/t1;->a:Ll0/t1;

    invoke-static {v12, v5, v9, v7, v8}, Ls90/g;->w(Ll0/s1;Ls90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 p2, v11

    goto :goto_7

    :cond_12
    move-object/from16 v10, p1

    const/4 v5, 0x0

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Ls90/h;->e()Ls90/b;

    move-result-object v3

    invoke-static {v3, v7, v5}, Ls90/g;->o(Ls90/b;Landroidx/compose/runtime/Composer;I)V

    const/16 v3, 0xf

    int-to-float v3, v3

    mul-float v3, v3, v16

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    move-object v10, v1

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_14

    new-instance v2, Lq81/e;

    const/16 v3, 0x16

    move/from16 v4, p3

    invoke-direct {v2, v0, v10, v4, v3}, Lq81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final r(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final s(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ls90/g$a;

    invoke-direct {p3, p0, p1, p2}, Ls90/g$a;-><init>(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;)V

    return-object p3
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;Ls90/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll80/o$e;

    invoke-virtual {p3}, Ls90/c;->h()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ls90/h;->g()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p3, p1}, Ll80/o$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ls90/g;->r(Lp1/a1;)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p2, p0}, Ls90/g;->s(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Ls90/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ls90/g;->q(Ls90/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Ll0/s1;Ls90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 56
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/s1;",
            "Ls90/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x173af395

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, v4, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_6
    and-int/lit16 v5, v0, 0x93

    const/16 v8, 0x92

    const/4 v10, 0x1

    if-eq v5, v8, :cond_7

    move v5, v10

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v12, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v5, v8, :cond_8

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lp1/c1;

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-interface {v1, v11, v10, v13}, Ll0/s1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v2}, Ls90/c;->e()Z

    move-result v15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v8, :cond_9

    new-instance v6, Ls32/d;

    const/16 v7, 0xd

    invoke-direct {v6, v7}, Ls32/d;-><init>(I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v14, v15, v6}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v2}, Ls90/c;->e()Z

    move-result v7

    xor-int/2addr v7, v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v8, :cond_a

    new-instance v14, Ls32/d;

    const/16 v15, 0xe

    invoke-direct {v14, v15}, Ls32/d;-><init>(I)V

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7, v14}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v14, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v14

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v7, v14

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v15, v10

    mul-float/2addr v15, v14

    invoke-static {v15}, Ll0/m;->i(F)Ll0/k;

    move-result-object v15

    sget-object v9, Lb2/e;->N:Lb2/k;

    const/16 v10, 0x36

    invoke-static {v15, v9, v12, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move v15, v14

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-eqz v1, :cond_b

    invoke-virtual {v12, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v12, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v20, v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_7

    :cond_c
    move-object/from16 v20, v5

    :goto_7
    invoke-static {v13, v12, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ls90/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v12, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v13, Lx81/d;->a:Lx81/d;

    move/from16 v21, v6

    sget v6, Lx81/d;->b:I

    invoke-virtual {v13, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ly81/i;->c1()J

    move-result-wide v22

    invoke-virtual {v13, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Lb91/d;->j()Lb91/a;

    move-result-object v25

    sget v24, Lb91/a;->d:I

    shl-int/lit8 v29, v24, 0x12

    const v30, 0x2fffa

    move/from16 v24, v6

    const/4 v6, 0x0

    move-object/from16 v27, v9

    move-object/from16 v26, v10

    const-wide/16 v9, 0x0

    move-object/from16 v28, v11

    const/4 v11, 0x0

    move-object/from16 v31, v27

    move-object/from16 v27, v12

    const/4 v12, 0x0

    move-object/from16 v32, v13

    const/4 v13, 0x0

    move-object/from16 v34, v14

    move/from16 v33, v15

    const-wide/16 v14, 0x0

    const/16 v35, 0x100

    const/16 v16, 0x0

    const/16 v36, 0x0

    const/16 v17, 0x0

    const/high16 v37, 0x3f800000    # 1.0f

    const/16 v38, 0x1

    const-wide/16 v18, 0x0

    move-object/from16 v39, v20

    const/16 v20, 0x0

    move/from16 v40, v21

    const/16 v21, 0x0

    move-object/from16 v41, v8

    move-wide/from16 v54, v22

    move/from16 v23, v7

    move-wide/from16 v7, v54

    const/16 v22, 0x0

    move/from16 v42, v23

    const/16 v23, 0x0

    move/from16 v43, v24

    const/16 v24, 0x0

    move-object/from16 v44, v26

    const/16 v26, 0x0

    move-object/from16 v45, v28

    const/16 v28, 0x0

    move-object/from16 p3, v1

    move-object/from16 v46, v4

    move-object/from16 v48, v31

    move-object/from16 v51, v32

    move-object/from16 v49, v34

    move-object/from16 v4, v39

    move/from16 v50, v40

    move-object/from16 v53, v41

    move/from16 v47, v42

    move/from16 v52, v43

    move-object/from16 v1, v45

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v2}, Ls90/c;->f()Lkd1/o;

    move-result-object v5

    sget v9, Lkd1/o;->a:I

    const/4 v10, 0x3

    const/4 v7, 0x0

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    const/16 v6, 0xa

    int-to-float v6, v6

    mul-float v6, v6, v33

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v13, 0x1b0

    const/16 v14, 0x78

    const-string v6, ""

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v2}, Ls90/c;->e()Z

    move-result v5

    and-int/lit16 v6, v0, 0x380

    const/16 v7, 0x100

    if-ne v6, v7, :cond_e

    const/4 v9, 0x1

    goto :goto_8

    :cond_e
    const/4 v9, 0x0

    :goto_8
    and-int/lit8 v6, v0, 0x70

    const/16 v7, 0x20

    if-eq v6, v7, :cond_10

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_f

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_9

    :cond_f
    const/4 v0, 0x0

    goto :goto_a

    :cond_10
    :goto_9
    const/4 v0, 0x1

    :goto_a
    or-int/2addr v0, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_11

    move-object/from16 v0, v53

    if-ne v6, v0, :cond_12

    goto :goto_b

    :cond_11
    move-object/from16 v0, v53

    :goto_b
    new-instance v6, Ls90/f;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v2, v4, v7}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v5, v6}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4}, Ls90/g;->x(Lp1/c1;)Z

    move-result v6

    const/16 v18, 0x1

    xor-int/lit8 v6, v6, 0x1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_13

    new-instance v7, Ls32/d;

    const/16 v0, 0xf

    invoke-direct {v7, v0}, Ls32/d;-><init>(I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6, v7}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->w:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_14

    move-object/from16 v8, v44

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v8, p3

    goto :goto_d

    :cond_14
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v12, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v48

    invoke-static {v12, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    :cond_15
    move-object/from16 v5, v49

    goto :goto_f

    :cond_16
    :goto_e
    move-object/from16 v5, v46

    goto :goto_10

    :goto_f
    invoke-static {v6, v12, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v12, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v1, v5

    mul-float v1, v1, v33

    move/from16 v7, v47

    invoke-static {v0, v1, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v4}, Ls90/g;->x(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {v2}, Ls90/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_11
    move/from16 v1, v50

    goto :goto_12

    :cond_17
    invoke-virtual {v2}, Ls90/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_11

    :goto_12
    invoke-static {v0, v12, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4}, Ls90/g;->x(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_18

    const v0, 0x4205543a

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, v51

    move/from16 v1, v52

    invoke-virtual {v0, v12, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->j()J

    move-result-wide v7

    const/4 v4, 0x0

    :goto_13
    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_18
    move-object/from16 v0, v51

    move/from16 v1, v52

    const/4 v4, 0x0

    const v7, 0x42055991

    invoke-static {v12, v7, v0, v12, v1}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    goto :goto_13

    :goto_14
    invoke-virtual {v0, v12, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    new-instance v0, Lw3/k;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v30, 0x2fdf8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move/from16 v38, v18

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v17, v0

    move/from16 v0, v38

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_19
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_15
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v0, Ls01/e;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final x(Lp1/c1;)Z
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

.method private static final y(Lp1/c1;Z)V
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

.method private static final z(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ls90/g;->K(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
