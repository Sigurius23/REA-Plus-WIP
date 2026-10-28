.class public abstract Lzc1/v5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/v5;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v3, p0

    check-cast v3, Lp1/q;

    const p0, 0x92cb338

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

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    int-to-float v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v0, v1, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v0, v2, v3, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v3, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v3, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v2, v3, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lc81/a;->a:Lc81/a$a;

    invoke-virtual {v6}, Lc81/a$a;->c()Lc81/g;

    move-result-object v1

    sget v0, Lc81/g;->k:I

    shl-int/lit8 v4, v0, 0x3

    const/4 v5, 0x5

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lc81/d;->i(Landroidx/compose/ui/Modifier;Lc81/g;Lkd1/t;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6}, Lc81/a$a;->d()Lc81/g;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lc81/d;->i(Landroidx/compose/ui/Modifier;Lc81/g;Lkd1/t;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6}, Lc81/a$a;->e()Lc81/g;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lc81/d;->i(Landroidx/compose/ui/Modifier;Lc81/g;Lkd1/t;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6}, Lc81/a$a;->b()Lc81/g;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lc81/d;->i(Landroidx/compose/ui/Modifier;Lc81/g;Lkd1/t;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6}, Lc81/a$a;->a()Lc81/g;

    move-result-object v1

    invoke-static/range {v0 .. v5}, Lc81/d;->i(Landroidx/compose/ui/Modifier;Lc81/g;Lkd1/t;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, p0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lzc1/a5;

    const/16 v1, 0x16

    invoke-direct {v0, p1, v1}, Lzc1/a5;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/v5;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
