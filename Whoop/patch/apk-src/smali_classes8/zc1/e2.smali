.class public abstract Lzc1/e2;
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

    invoke-static {p0, p1, p2}, Lzc1/e2;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p0, Lp1/q;

    const v0, -0x67f55e6a

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, p0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->o()J

    move-result-wide v3

    sget-object v5, Li2/w0;->a:Li2/v0;

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v3, v4, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x2

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v2, p0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v4, p0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v7, p0, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p0, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p0, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p0, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, p0, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p0, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p0, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Exercise Tile - Edit"

    const/4 v3, 0x6

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Ll31/g;->u(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Exercise Tile - Drag"

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Ll31/g;->s(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Exercise Tile - In Progress"

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Ll31/g;->w(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Exercise Tile - Completed"

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Ll31/g;->m(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Exercise Tile - Summary"

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Ll31/g;->G(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Exercise Tile - Summary Details"

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Ll31/g;->A(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Exercise Tile - Summary Details Intensity"

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Ll31/g;->q(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Exercise Tile - Summary Details Intensity Omitted"

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Ll31/g;->o(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Exercise Tile - Selectable"

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Ll31/g;->y(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lzc1/w0;

    const/16 v1, 0x17

    invoke-direct {v0, p1, v1}, Lzc1/w0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/e2;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
