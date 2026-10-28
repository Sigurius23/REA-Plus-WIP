.class public abstract Ldk2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "forceLandscapePresentation",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "content",
        "d",
        "(ZLc93/m;Landroidx/compose/runtime/Composer;I)V",
        "tilt-graph_release"
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
.method public static synthetic a(ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ldk2/b;->g(ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ldk2/b;->e(ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/res/Configuration;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldk2/b;->f(Landroid/content/res/Configuration;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(ZLc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x1b4d415

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    if-eq v2, v3, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    move v2, v4

    :goto_3
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    if-nez p0, :cond_5

    const v1, 0x6dcdef6f

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Ldk2/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Ldk2/a;-><init>(ZLc93/m;II)V

    :goto_4
    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_5
    const v0, 0x6dce8597

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/res/Configuration;

    invoke-virtual {p2, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_6

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_8

    :cond_6
    new-instance v4, Landroid/content/res/Configuration;

    invoke-direct {v4, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iget v2, v4, Landroid/content/res/Configuration;->orientation:I

    if-eq v2, v1, :cond_7

    iput v1, v4, Landroid/content/res/Configuration;->orientation:I

    iget v1, v4, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v2, v4, Landroid/content/res/Configuration;->screenHeightDp:I

    iput v2, v4, Landroid/content/res/Configuration;->screenWidthDp:I

    iput v1, v4, Landroid/content/res/Configuration;->screenHeightDp:I

    :cond_7
    invoke-virtual {p2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Landroid/content/res/Configuration;

    invoke-virtual {v0, v4}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v1, La0;

    const/16 v2, 0x17

    invoke-direct {v1, v2, v4, p1}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x344abf55    # -2.3757142E7f

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p2, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Ldk2/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Ldk2/a;-><init>(ZLc93/m;II)V

    goto :goto_4

    :cond_a
    return-void
.end method

.method private static final e(ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ldk2/b;->d(ZLc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroid/content/res/Configuration;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p3, v3

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_4

    sget-object p3, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    iget p0, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float p0, p0

    invoke-static {p0, p3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object p3, Lb2/e;->w:Lb2/m;

    invoke-static {p3, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p3

    iget-wide v0, p2, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {p2, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v5, p2, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {p2, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p2, v4, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->f:La3/i;

    invoke-static {p2, p3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->j:La3/i;

    iget-boolean v1, p2, Lp1/q;->S:Z

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v0, p2, v0, p3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p3, La3/k;->d:La3/i;

    invoke-static {p2, p3, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, p1, p2, v3}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ldk2/b;->d(ZLc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
