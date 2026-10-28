.class public abstract Lhy0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Li91/a;",
        "legendColor",
        "Ll83/a0;",
        "c",
        "(Li91/a;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(FFFLi91/h;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhy0/d;->d(FFFLi91/h;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li91/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lhy0/d;->e(Li91/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Li91/a;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const-string v0, "legendColor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const v0, 0x1ca57a5d

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v3, v1, :cond_2

    move v1, v5

    goto :goto_2

    :cond_2
    move v1, v4

    :goto_2
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p1, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    and-int/lit8 v0, v0, 0xe

    invoke-static {p0, p1, v0}, Li91/i;->a(Li91/a;Landroidx/compose/runtime/Composer;I)Li91/h;

    move-result-object v10

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v0

    int-to-float v1, v2

    mul-float v7, v0, v1

    int-to-float v0, v5

    mul-float v8, v0, v1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p1, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_4

    :cond_3
    new-instance v6, Lc31/a;

    const/4 v11, 0x3

    move v9, v7

    invoke-direct/range {v6 .. v11}, Lc31/a;-><init>(FFFLjava/lang/Object;I)V

    invoke-virtual {p1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v6

    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p1, v4}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lhy0/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lhy0/c;-><init>(Li91/a;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final d(FFFLi91/h;Lk2/e;)Ll83/a0;
    .locals 10

    const-string v0, "$this$drawBehind"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4, p0}, Ly3/c;->q0(F)F

    move-result p0

    invoke-interface {p4, p1}, Ly3/c;->q0(F)F

    move-result p1

    invoke-interface {p4, p2}, Ly3/c;->q0(F)F

    move-result p2

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    new-instance v0, Lh2/c;

    const/4 v2, 0x0

    add-float v3, p0, v2

    invoke-interface {p4}, Lk2/e;->d()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-direct {v0, v2, v2, v3, v4}, Lh2/c;-><init>(FFFF)V

    invoke-static {v1, v0}, Li2/s0;->a(Li2/s0;Lh2/c;)V

    add-float v0, p0, p2

    add-float/2addr v0, v2

    new-instance v3, Lh2/c;

    add-float v4, v0, p1

    invoke-interface {p4}, Lk2/e;->d()J

    move-result-wide v8

    and-long/2addr v8, v6

    long-to-int v5, v8

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-direct {v3, v0, v2, v4, v5}, Lh2/c;-><init>(FFFF)V

    invoke-static {v1, v3}, Li2/s0;->a(Li2/s0;Lh2/c;)V

    add-float/2addr p2, p1

    add-float/2addr v0, p2

    new-instance v3, Lh2/c;

    add-float/2addr p1, v0

    invoke-interface {p4}, Lk2/e;->d()J

    move-result-wide v4

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-direct {v3, v0, v2, p1, v4}, Lh2/c;-><init>(FFFF)V

    invoke-static {v1, v3}, Li2/s0;->a(Li2/s0;Lh2/c;)V

    add-float/2addr v0, p2

    new-instance p1, Lh2/c;

    add-float/2addr p0, v0

    invoke-interface {p4}, Lk2/e;->d()J

    move-result-wide v3

    and-long/2addr v3, v6

    long-to-int p2, v3

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-direct {p1, v0, v2, p0, p2}, Lh2/c;-><init>(FFFF)V

    invoke-static {v1, p1}, Li2/s0;->a(Li2/s0;Lh2/c;)V

    instance-of p0, p3, Li91/e;

    if-eqz p0, :cond_0

    check-cast p3, Li91/e;

    invoke-virtual {p3}, Li91/e;->a()Li2/t;

    move-result-object v2

    const/4 v4, 0x0

    const/16 v5, 0x3c

    const/4 v3, 0x0

    move-object v0, p4

    invoke-static/range {v0 .. v5}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    goto :goto_0

    :cond_0
    move-object v0, p4

    instance-of p0, p3, Li91/g;

    if-eqz p0, :cond_1

    check-cast p3, Li91/g;

    invoke-virtual {p3}, Li91/g;->a()J

    move-result-wide v2

    const/4 v5, 0x0

    const/16 v6, 0x3c

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final e(Li91/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lhy0/d;->c(Li91/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
