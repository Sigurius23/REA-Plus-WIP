.class public abstract Lv31/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv31/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lv31/g;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "l",
        "(Landroidx/compose/ui/Modifier;Lv31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "totalCount",
        "filledCount",
        "i",
        "(IILandroidx/compose/runtime/Composer;I)V",
        "filledPercentage",
        "g",
        "(ILandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv31/f;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(IILl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lv31/f;->j(IILl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lv31/f;->h(IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv31/f;->n(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lv31/f;->k(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lv31/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lv31/f;->o(Landroidx/compose/ui/Modifier;Lv31/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(ILandroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v8, p1

    check-cast v8, Lp1/q;

    const p1, 0x37722dc2

    invoke-virtual {v8, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-nez p1, :cond_1

    invoke-virtual {v8, p0}, Lp1/q;->e(I)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v2, p1, 0x3

    const/4 v3, 0x1

    if-eq v2, v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v8, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    int-to-float v0, v3

    int-to-float v1, v1

    mul-float v7, v0, v1

    sget-object v0, Li2/t;->b:Li2/s;

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v1, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->i()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    invoke-virtual {v1, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->i()J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    filled-new-array {v5, v6}, [Li2/x;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v4, 0xe

    const/4 v5, 0x0

    invoke-static {v0, v3, v5, v5, v4}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v3

    invoke-virtual {v1, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X0()J

    move-result-wide v4

    shl-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0x70

    const v0, 0x1b0180

    or-int v9, p1, v0

    const/4 v10, 0x1

    const/4 v0, 0x0

    const/16 v2, 0x64

    const/4 v6, 0x0

    move v1, p0

    invoke-static/range {v0 .. v10}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_3
    move v1, p0

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance p1, Lbm2/h;

    const/4 v0, 0x5

    invoke-direct {p1, v1, p2, v0}, Lbm2/h;-><init>(III)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final h(IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lv31/f;->g(ILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(IILandroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x1552debf

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->e(I)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v4, p1}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    and-int/2addr p2, v2

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance p2, Lv31/e;

    invoke-direct {p2, p0, p1}, Lv31/e;-><init>(II)V

    const v1, 0x272cf7ab

    invoke-static {v1, v4, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0xc06

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lid2/q;

    const/4 v1, 0x5

    invoke-direct {v0, p0, p1, p3, v1}, Lid2/q;-><init>(IIII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final j(IILl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    const-string v0, "$this$BoxWithConstraints"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p4, v0

    :cond_1
    and-int/lit8 v0, p4, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v2, :cond_2

    move v0, v4

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    and-int/2addr p4, v4

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_9

    const/4 p4, 0x7

    if-gt p0, p4, :cond_3

    goto :goto_2

    :cond_3
    move p4, p0

    :goto_2
    int-to-float v0, v4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    add-int/lit8 v1, p4, -0x1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    check-cast p2, Landroidx/compose/foundation/layout/c;

    invoke-virtual {p2}, Landroidx/compose/foundation/layout/c;->d()F

    move-result p2

    sub-float/2addr p2, v1

    int-to-float p4, p4

    div-float/2addr p2, p4

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object p4

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x6

    invoke-static {p4, v5, p3, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object p4

    iget-wide v7, p3, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {p3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v9, p3, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {p3, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {p3, v8, p4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->f:La3/i;

    invoke-static {p3, p4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->j:La3/i;

    iget-boolean v7, p3, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v5, p3, v5, p4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object p4, La3/k;->d:La3/i;

    invoke-static {p3, p4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p4, 0x78e7920f

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    move p4, v3

    :goto_4
    if-ge p4, p0, :cond_8

    invoke-static {p2, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v1, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-ge p4, p1, :cond_7

    const v5, 0x8a746a3

    invoke-virtual {p3, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, p3, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->i()J

    move-result-wide v7

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const v5, 0x8a8ef12

    invoke-virtual {p3, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5, p3, v6, v3}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v7

    :goto_5
    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v7, v8, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, p3, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_4

    :cond_8
    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    invoke-virtual {p3, v4}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_6
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lv31/f;->i(IILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lv31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv31/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x5d748763

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v1

    goto :goto_0

    :cond_1
    move v6, v3

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v6, v11

    :goto_4
    and-int/lit16 v11, v6, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_8

    move v11, v14

    goto :goto_5

    :cond_8
    move v11, v13

    :goto_5
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_20

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v0, v11

    goto :goto_6

    :cond_9
    move-object v0, v5

    :goto_6
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_a

    new-instance v7, Lv01/k;

    const/4 v9, 0x3

    invoke-direct {v7, v9}, Lv01/k;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v7, v9

    :goto_7
    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v15, 0x3

    int-to-float v15, v15

    int-to-float v1, v1

    invoke-static {v12, v15, v1}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v2}, Lv31/g;->f()Lv31/h;

    move-result-object v16

    sget-object v17, Lv31/f$a;->a:[I

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    move-result v16

    aget v8, v17, v16

    move/from16 v16, v15

    const/4 v15, 0x6

    if-eq v8, v14, :cond_d

    if-ne v8, v3, :cond_c

    const v8, -0x2d8f8b8c

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    const v8, 0x26cb4ed8

    invoke-static {v8}, Li2/w0;->c(I)J

    move-result-wide v17

    :goto_8
    move-wide/from16 v14, v17

    goto :goto_9

    :cond_c
    const v0, -0x2d8f9eda

    invoke-static {v0, v10, v13}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_d
    const v8, -0x2d8f9396

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8, v10, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->r()J

    move-result-wide v17

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v12, v14, v15, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v12, v3

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v12, v14

    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v15, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v3, v10, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_e

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v10, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v31, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_b

    :cond_f
    move-object/from16 v31, v0

    :goto_b
    invoke-static {v3, v10, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v3, Lb2/e;->J:Lb2/l;

    sget-object v9, Ll0/m;->b:Ll0/e;

    move/from16 v32, v1

    const/16 v1, 0x36

    invoke-static {v9, v3, v10, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_11

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v10, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v2, v10, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v10, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v0, v3

    const-wide/16 v8, 0x0

    cmpl-double v0, v0, v8

    if-lez v0, :cond_14

    :goto_d
    move v0, v6

    goto :goto_e

    :cond_14
    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_d

    :goto_e
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v1, 0x1

    invoke-direct {v6, v3, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {p1 .. p1}, Lv31/g;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v4, v10, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v4, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->d1()J

    move-result-wide v12

    const/16 v29, 0x0

    const v30, 0x2fff8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object v15, v11

    const/4 v11, 0x0

    move/from16 v17, v8

    move-wide/from16 v41, v12

    move-object v13, v7

    move-wide/from16 v7, v41

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move-object/from16 v20, v15

    const-wide/16 v14, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    move/from16 v24, v19

    const-wide/16 v18, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v33, v22

    const/16 v22, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move-object/from16 v36, v26

    const/16 v26, 0x0

    move/from16 v37, v28

    const/16 v28, 0x0

    move-object/from16 v40, v5

    move/from16 v38, v35

    move-object/from16 v39, v36

    move/from16 v1, v37

    move-object v5, v2

    move-object/from16 v2, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p1 .. p1}, Lv31/g;->c()Lgz0/m0;

    move-result-object v5

    if-nez v5, :cond_15

    const v0, 0x45abfd63

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move/from16 v13, v38

    move-object/from16 v15, v39

    :goto_f
    const/4 v1, 0x1

    goto :goto_11

    :cond_15
    const v6, 0x45abfd64

    move/from16 v13, v38

    move-object/from16 v15, v39

    invoke-static {v10, v6, v1, v13, v15}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    mul-float v1, v32, v32

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    and-int/lit16 v0, v0, 0x380

    const/16 v1, 0x100

    if-ne v0, v1, :cond_16

    const/4 v0, 0x1

    goto :goto_10

    :cond_16
    move v0, v3

    :goto_10
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_17

    move-object/from16 v0, v40

    if-ne v1, v0, :cond_18

    :cond_17
    new-instance v1, Luf0/e;

    const/16 v0, 0xa

    invoke-direct {v1, v2, v0}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v20, v1

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v8, 0x6

    invoke-static {v0, v10, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v4, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v8

    sget v0, Lgy0/f;->K:I

    invoke-static {v0, v10, v3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_11
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lv31/g;->e()Lv31/a;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Lv31/a;->d()Lv31/b;

    move-result-object v0

    goto :goto_12

    :cond_19
    const/4 v0, 0x0

    :goto_12
    if-nez v0, :cond_1a

    const v0, 0x625ffa56

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v1, 0x1

    goto/16 :goto_18

    :cond_1a
    const v1, 0x625ffa57

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x1

    int-to-float v4, v1

    invoke-static {v4, v13, v15, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v4, Lv31/f$a;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    if-eq v0, v1, :cond_1d

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1c

    const v0, 0x1f713745

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lv31/g;->e()Lv31/a;

    move-result-object v0

    invoke-virtual {v0}, Lv31/a;->a()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_14

    :cond_1b
    const/4 v0, 0x0

    :goto_14
    const/16 v1, 0x64

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0, v10, v3}, Lv31/f;->g(ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_1c
    const v0, -0x2846d53d

    invoke-static {v0, v10, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1d
    const v0, 0x1f6ce571

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lv31/g;->e()Lv31/a;

    move-result-object v0

    invoke-virtual {v0}, Lv31/a;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v14

    goto :goto_15

    :cond_1e
    const/4 v14, 0x1

    :goto_15
    invoke-virtual/range {p1 .. p1}, Lv31/g;->e()Lv31/a;

    move-result-object v0

    invoke-virtual {v0}, Lv31/a;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_16

    :cond_1f
    move v13, v3

    :goto_16
    invoke-static {v14, v13, v10, v3}, Lv31/f;->i(IILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_18
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object v3, v2

    move-object/from16 v1, v31

    goto :goto_19

    :cond_20
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v9

    :goto_19
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_21

    new-instance v0, Lv31/d;

    const/4 v6, 0x0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lv31/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final m(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Lv31/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lv31/f;->l(Landroidx/compose/ui/Modifier;Lv31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
