.class public abstract Lzc1/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(Lp1/c1;Lzz0/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/z;->d(Lp1/c1;Lzz0/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/z;->e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v3, p0

    check-cast v3, Lp1/q;

    const p0, -0x6e9b6b24

    invoke-virtual {v3, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x1

    if-eqz p1, :cond_0

    move v0, p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    sget-object v0, Lzz0/j;->a:Lzz0/j;

    invoke-virtual {v0}, Lzz0/j;->a()Lzz0/m;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Lp1/c1;

    int-to-float p0, p0

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr p0, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzz0/m;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_2

    new-instance v4, Lyb0/e;

    const/16 v1, 0x11

    invoke-direct {v4, v1, v0}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v0, Lzz0/m;->g:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0x186

    const/4 v5, 0x0

    move-object v1, v2

    move-object v2, v4

    move v4, v0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lzz0/g;->n(Landroidx/compose/ui/Modifier;Lzz0/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lzc1/j;

    const/16 v1, 0xc

    invoke-direct {v0, p1, v1}, Lzc1/j;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final d(Lp1/c1;Lzz0/l;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lzz0/l$b;

    if-eqz v0, :cond_0

    check-cast p1, Lzz0/l$b;

    invoke-virtual {p1}, Lzz0/l$b;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lzz0/l$a;

    if-eqz v0, :cond_1

    check-cast p1, Lzz0/l$a;

    invoke-virtual {p1}, Lzz0/l$a;->a()Ljava/lang/String;

    move-result-object p1

    :goto_0
    sget-object v0, Lzz0/j;->a:Lzz0/j;

    invoke-virtual {v0, p1}, Lzz0/j;->b(Ljava/lang/String;)Lzz0/m;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/z;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
