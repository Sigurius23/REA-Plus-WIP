.class public final Lc0/o0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Ld0/z1;

.field public final synthetic x:Ld0/c0;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lkotlin/jvm/functions/Function3;


# direct methods
.method public constructor <init>(Ld0/z1;Ld0/c0;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    iput-object p1, p0, Lc0/o0;->w:Ld0/z1;

    iput-object p2, p0, Lc0/o0;->x:Ld0/c0;

    iput-object p3, p0, Lc0/o0;->y:Ljava/lang/Object;

    iput-object p4, p0, Lc0/o0;->z:Lkotlin/jvm/functions/Function3;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    and-int/lit8 v2, p2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/2addr p2, v4

    move-object v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, p2, v2}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_10

    new-instance p1, Lc0/f;

    iget-object p2, p0, Lc0/o0;->x:Ld0/c0;

    const/4 v2, 0x1

    invoke-direct {p1, p2, v2}, Lc0/f;-><init>(Ljava/lang/Object;I)V

    sget-object v9, Ld0/f;->i:Ld0/f2;

    iget-object v5, p0, Lc0/o0;->w:Ld0/z1;

    invoke-virtual {v5}, Ld0/z1;->g()Z

    move-result p2

    iget-object v2, v5, Ld0/z1;->a:Lal/a;

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_4

    const p2, 0x63564970

    invoke-virtual {v10, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez p2, :cond_1

    if-ne v6, v3, :cond_3

    :cond_1
    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    invoke-static {p2}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v7

    :try_start_0
    invoke-virtual {v2}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2, v7, v6}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v2

    :cond_3
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p2, v7, v6}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p1

    :cond_4
    const p2, 0x635a29cd

    invoke-virtual {v10, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v6

    :goto_2
    const p2, 0x522f0047

    invoke-virtual {v10, p2}, Lp1/q;->e0(I)V

    iget-object v2, p0, Lc0/o0;->y:Ljava/lang/Object;

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v6, :cond_5

    move v6, v8

    goto :goto_3

    :cond_5
    move v6, v7

    :goto_3
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_6

    if-ne v12, v3, :cond_7

    :cond_6
    new-instance v11, Lc0/n0;

    const/4 v12, 0x0

    invoke-direct {v11, v5, v12}, Lc0/n0;-><init>(Ld0/z1;I)V

    invoke-static {v11}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v12

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v12, Lp1/t2;

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, p2}, Lp1/q;->e0(I)V

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    move v7, v8

    :cond_8
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez p2, :cond_9

    if-ne v8, v3, :cond_a

    :cond_9
    new-instance p2, Lc0/n0;

    const/4 v8, 0x1

    invoke-direct {p2, v5, v8}, Lc0/n0;-><init>(Ld0/z1;I)V

    invoke-static {p2}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v8, Lp1/t2;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2, v10, v1}, Lc0/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Ld0/c0;

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object p1

    invoke-virtual {v10, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez p2, :cond_b

    if-ne v5, v3, :cond_c

    :cond_b
    new-instance v5, La3/m1;

    const/16 p2, 0xa

    invoke-direct {v5, p1, p2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v5}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Lb2/e;->w:Lb2/m;

    invoke-static {p2, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p2

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-eqz v6, :cond_d

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_4
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v10, v5, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v10, p2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v0, v10, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v10, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object p1, p0, Lc0/o0;->z:Lkotlin/jvm/functions/Function3;

    invoke-interface {p1, v2, v10, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_10
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
