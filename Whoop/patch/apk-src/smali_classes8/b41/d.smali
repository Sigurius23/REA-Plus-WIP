.class public abstract Lb41/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0014\u001a\u000f\u0010\u0017\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0014\u001a\u000f\u0010\u0018\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0014\u001a\u000f\u0010\u0019\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u0014\u00a8\u0006\u001a\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lb41/f;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "l",
        "(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "itemsState",
        "Lb41/b;",
        "internalState",
        "",
        "I",
        "(Lb41/f;Lb41/b;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "Lqz0/c;",
        "J",
        "(Lb41/f;Lb41/b;Landroidx/compose/runtime/Composer;I)Lqz0/c;",
        "D",
        "(Landroidx/compose/runtime/Composer;I)V",
        "B",
        "z",
        "v",
        "x",
        "t",
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
.method private static final A(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lb41/d;->z(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final B(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x7275cddf

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

    new-instance v1, Lb41/d$l;

    invoke-direct {v1}, Lb41/d$l;-><init>()V

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

    const/16 v1, 0x16

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final C(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lb41/d;->B(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final D(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x2dac6583

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

    new-instance v1, Lb41/d$n;

    invoke-direct {v1}, Lb41/d$n;-><init>()V

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

    const/16 v1, 0x15

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final E(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lb41/d;->D(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic F(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lb41/d;->l(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic G(Lp1/c1;)Lb41/b;
    .locals 0

    invoke-static {p0}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H(Lp1/c1;Lb41/b;)V
    .locals 0

    invoke-static {p0, p1}, Lb41/d;->n(Lp1/c1;Lb41/b;)V

    return-void
.end method

.method private static final I(Lb41/f;Lb41/b;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lb41/b;->d()Ljava/lang/Boolean;

    move-result-object p1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    if-eqz p1, :cond_1

    check-cast p2, Lp1/q;

    const p0, -0x7be3b955

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    sget p0, Lgy0/f;->v2:I

    invoke-static {p0, p2, p3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_1
    invoke-virtual {p0}, Lb41/f;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move p1, p3

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x1

    :goto_2
    if-nez p1, :cond_4

    check-cast p2, Lp1/q;

    const p1, -0x7be17a04

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    invoke-virtual {p0}, Lb41/f;->b()Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_4
    check-cast p2, Lp1/q;

    const p1, 0x675bdc1e

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    invoke-virtual {p0}, Lb41/f;->a()Ljava/lang/String;

    move-result-object p0

    :goto_3
    return-object p0
.end method

.method private static final J(Lb41/f;Lb41/b;Landroidx/compose/runtime/Composer;I)Lqz0/c;
    .locals 9

    check-cast p2, Lp1/q;

    const p3, -0x6d0e4462

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lb41/f;->n()Z

    move-result p3

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-eqz p3, :cond_1

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object p0

    invoke-virtual {p1}, Lb41/b;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lgz0/k0;->a0()I

    move-result p0

    :goto_0
    move v3, p0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lgz0/k0;->f0()I

    move-result p0

    goto :goto_0

    :goto_1
    int-to-float p0, v0

    mul-float/2addr p0, p0

    new-instance v4, Ly3/f;

    invoke-direct {v4, p0}, Ly3/f;-><init>(F)V

    new-instance v2, Lqz0/c$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v2

    :cond_1
    invoke-virtual {p0}, Lb41/f;->b()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    if-nez p3, :cond_4

    :cond_2
    invoke-virtual {p1}, Lb41/b;->d()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_2

    :cond_3
    move p1, v1

    :goto_2
    if-eqz p1, :cond_6

    :cond_4
    const p0, 0x10bf6027

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    int-to-float p0, v0

    mul-float/2addr p0, p0

    new-instance v4, Ly3/f;

    invoke-direct {v4, p0}, Ly3/f;-><init>(F)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p0, p1, :cond_5

    sget-object p0, Lb41/d$p;->w:Lb41/d$p;

    invoke-virtual {p2, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p0, Lkotlin/jvm/functions/Function1;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    new-instance v2, Lqz0/c$a;

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    const p1, 0x10c2ba1a

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lb41/f;->j()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_7

    const p0, 0x10c2ba19

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    const/4 p0, 0x0

    move-object v2, p0

    goto :goto_3

    :cond_7
    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    new-instance p1, Lqz0/c$c;

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    sget-object p3, Lx81/d;->a:Lx81/d;

    const/4 v0, 0x6

    invoke-virtual {p3, p2, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object p3

    invoke-virtual {p3}, Lb91/d;->a()Lb91/a;

    move-result-object p3

    invoke-direct {p1, p0, p3}, Lqz0/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lb91/a;)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    move-object v2, p1

    :goto_3
    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v2
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb41/d;->A(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lb41/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb41/d;->p(Lb41/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lb41/d;->s(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb41/d;->w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lgz0/m0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb41/d;->o(Lgz0/m0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb41/d;->E(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb41/d;->y(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lb41/f;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb41/d;->q(Lb41/f;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lb41/f;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lb41/d;->r(Lb41/f;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb41/d;->C(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb41/d;->u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 54
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lb41/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, 0x4087ee1b

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v8, v4, 0x30

    const/16 v9, 0x20

    if-nez v8, :cond_4

    and-int/lit8 v8, v4, 0x40

    if-nez v8, :cond_2

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_3

    move v8, v9

    goto :goto_3

    :cond_3
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v5, v8

    :cond_4
    and-int/lit16 v8, v4, 0x180

    const/16 v10, 0x100

    if-nez v8, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v10

    goto :goto_4

    :cond_5
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    :cond_6
    and-int/lit16 v8, v5, 0x93

    const/16 v11, 0x92

    const/4 v13, 0x0

    if-eq v8, v11, :cond_7

    const/4 v8, 0x1

    goto :goto_5

    :cond_7
    move v8, v13

    :goto_5
    and-int/lit8 v11, v5, 0x1

    invoke-virtual {v0, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_2f

    and-int/lit8 v8, v5, 0x70

    if-eq v8, v9, :cond_9

    and-int/lit8 v11, v5, 0x40

    if-eqz v11, :cond_8

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    goto :goto_6

    :cond_8
    move v11, v13

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v11, 0x1

    :goto_7
    and-int/lit16 v14, v5, 0x380

    if-ne v14, v10, :cond_a

    const/4 v15, 0x1

    goto :goto_8

    :cond_a
    move v15, v13

    :goto_8
    or-int/2addr v11, v15

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    sget-object v7, Lp1/l;->a:Lp1/v0;

    const/4 v9, 0x0

    if-nez v11, :cond_b

    if-ne v15, v7, :cond_c

    :cond_b
    new-instance v15, Lb41/d$a;

    invoke-direct {v15, v2, v3, v9}, Lb41/d$a;-><init>(Lb41/f;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v0, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v15, Lc93/m;

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, v15, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    const-string v33, ""

    if-ne v15, v7, :cond_10

    invoke-virtual {v2}, Lb41/f;->k()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Lb41/f;->n()Z

    move-result v6

    invoke-virtual {v2}, Lb41/f;->g()Ljava/lang/Integer;

    move-result-object v18

    if-eqz v18, :cond_f

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-virtual {v2}, Lb41/f;->k()Ljava/lang/String;

    move-result-object v18

    if-nez v18, :cond_d

    move-object/from16 v18, v33

    :cond_d
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v12

    if-le v12, v10, :cond_e

    const/4 v10, 0x1

    goto :goto_9

    :cond_e
    move v10, v13

    :goto_9
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    goto :goto_a

    :cond_f
    move-object v10, v9

    :goto_a
    new-instance v12, Lb41/b;

    invoke-direct {v12, v15, v6, v10}, Lb41/b;-><init>(Ljava/lang/String;ZLjava/lang/Boolean;)V

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v15

    invoke-virtual {v0, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v6, v15

    check-cast v6, Lp1/c1;

    invoke-virtual {v2}, Lb41/f;->k()Ljava/lang/String;

    move-result-object v10

    const/16 v12, 0x20

    if-eq v8, v12, :cond_12

    and-int/lit8 v15, v5, 0x40

    if-eqz v15, :cond_11

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    goto :goto_b

    :cond_11
    move v15, v13

    goto :goto_c

    :cond_12
    :goto_b
    const/4 v15, 0x1

    :goto_c
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v15, :cond_13

    if-ne v12, v7, :cond_14

    :cond_13
    new-instance v12, Lb41/d$b;

    invoke-direct {v12, v2, v6, v9}, Lb41/d$b;-><init>(Lb41/f;Lp1/c1;Lq83/d;)V

    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v12, Lc93/m;

    invoke-static {v0, v12, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, Lg1/i8;->a:Lg1/i8;

    sget-object v10, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v10, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v21

    invoke-virtual {v10, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->r()J

    move-result-wide v23

    invoke-virtual {v10, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v25

    invoke-virtual {v10, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v27

    invoke-virtual {v10, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->b1()J

    move-result-wide v29

    invoke-virtual {v10, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->W0()J

    move-result-wide v31

    invoke-virtual {v10, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->b()J

    move-result-wide v34

    move-wide/from16 v15, v29

    const/16 v18, 0x20

    const-wide/16 v29, 0x0

    move/from16 v36, v18

    move-wide/from16 v17, v31

    const/16 v31, 0x2

    const v32, 0x1ffe82

    move-object/from16 v38, v7

    move/from16 v37, v8

    const-wide/16 v7, 0x0

    const/16 v39, 0x100

    const/16 v40, 0x1

    const-wide/16 v19, 0x0

    move-object/from16 v42, v9

    move-object/from16 v41, v10

    move-wide/from16 v9, v23

    const-wide/16 v23, 0x0

    move-object/from16 v44, v11

    move/from16 v43, v12

    move-wide/from16 v11, v25

    const-wide/16 v25, 0x0

    move/from16 v46, v13

    move/from16 v45, v14

    move-wide/from16 v13, v27

    const-wide/16 v27, 0x0

    move-object/from16 v31, v0

    move-object/from16 p3, v6

    move/from16 v47, v37

    move-object/from16 v50, v38

    move-object/from16 v49, v41

    move-object/from16 v51, v44

    move/from16 v48, v45

    move/from16 v0, v46

    move-wide/from16 v52, v34

    move/from16 v34, v5

    move-wide/from16 v5, v21

    move-wide/from16 v21, v52

    invoke-static/range {v5 .. v32}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v32

    move-object/from16 v5, v31

    sget-object v6, Lb2/e;->x:Lb2/m;

    invoke-static {v6, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_15

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_d
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v5, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-nez v8, :cond_16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    :cond_16
    invoke-static {v7, v5, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lb41/f;->g()Ljava/lang/Integer;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x3

    if-nez v6, :cond_18

    const v6, -0x3cc5f882

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object v1, v7

    move-object/from16 v0, v49

    const/4 v4, 0x6

    const/16 v42, 0x0

    goto/16 :goto_11

    :cond_18
    const v6, -0x3cc5f881

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-static/range {p3 .. p3}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object v6

    invoke-virtual {v6}, Lb41/b;->c()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_19

    goto :goto_e

    :cond_19
    move-object/from16 v33, v6

    :goto_e
    invoke-virtual/range {v33 .. v33}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v2}, Lb41/f;->g()Ljava/lang/Integer;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " / "

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lb41/f;->m()Z

    move-result v9

    if-eqz v9, :cond_1a

    const v9, -0xe63ce8b

    move-object/from16 v10, v49

    const/4 v11, 0x6

    invoke-static {v5, v9, v10, v5, v11}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v12

    :goto_f
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1a
    move-object/from16 v10, v49

    const/4 v11, 0x6

    const v9, -0xe63ca4e

    invoke-virtual {v5, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->W0()J

    move-result-wide v12

    goto :goto_f

    :goto_10
    invoke-virtual {v10, v5, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->d()Lb91/a;

    move-result-object v25

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v14, 0x0

    invoke-static {v9, v14, v8}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v15, 0x2

    int-to-float v15, v15

    const/4 v0, 0x4

    int-to-float v8, v0

    mul-float/2addr v15, v8

    const/4 v0, 0x1

    int-to-float v14, v0

    mul-float/2addr v14, v8

    new-instance v8, Ll0/l1;

    invoke-direct {v8, v14, v15, v14, v15}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v9, Lw3/k;

    invoke-direct {v9, v11}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdf8

    move-object/from16 v17, v9

    move-object/from16 v49, v10

    const-wide/16 v9, 0x0

    move/from16 v43, v11

    const/4 v11, 0x0

    move-object/from16 v27, v5

    move-object v5, v6

    move-object v6, v8

    move-wide/from16 v52, v12

    move-object v13, v7

    move-wide/from16 v7, v52

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const-wide/16 v14, 0x0

    const/16 v19, 0x3

    const/16 v16, 0x0

    move-object/from16 v20, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v31, v26

    const/16 v26, 0x0

    move-object/from16 v33, v28

    const/16 v28, 0x0

    move-object/from16 v1, v33

    move/from16 v4, v43

    move-object/from16 v0, v49

    const/16 v42, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    :goto_11
    invoke-static/range {p3 .. p3}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object v6

    invoke-virtual {v6}, Lb41/b;->c()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v7

    invoke-virtual {v2}, Lb41/f;->f()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->m()Lb91/a;

    move-result-object v9

    invoke-virtual {v2}, Lb41/f;->c()Lgz0/m0;

    move-result-object v0

    const/16 v4, 0xa

    if-nez v0, :cond_1b

    const v0, -0x3cb4abde

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    move-object/from16 v10, v42

    goto :goto_12

    :cond_1b
    const/4 v10, 0x0

    const v11, -0x3cb4abdd

    invoke-virtual {v5, v11}, Lp1/q;->e0(I)V

    new-instance v11, La80/c;

    invoke-direct {v11, v0, v4}, La80/c;-><init>(Ljava/lang/Object;I)V

    const v0, 0x26e11fb7

    invoke-static {v0, v5, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    move-object v10, v0

    :goto_12
    invoke-static/range {p3 .. p3}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object v0

    sget v11, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    shr-int/lit8 v12, v34, 0x3

    and-int/lit8 v12, v12, 0xe

    or-int/2addr v11, v12

    invoke-static {v2, v0, v5, v11}, Lb41/d;->J(Lb41/f;Lb41/b;Landroidx/compose/runtime/Composer;I)Lqz0/c;

    move-result-object v12

    invoke-static/range {p3 .. p3}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object v0

    invoke-static {v2, v0, v5, v11}, Lb41/d;->I(Lb41/f;Lb41/b;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static/range {p3 .. p3}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object v0

    invoke-virtual {v0}, Lb41/b;->e()Z

    move-result v0

    if-eqz v0, :cond_1c

    new-instance v0, Lq3/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_13
    move-object/from16 v24, v0

    goto :goto_14

    :cond_1c
    sget-object v0, Lq3/f0;->w:Lg40/h2;

    goto :goto_13

    :goto_14
    invoke-virtual {v2}, Lb41/f;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_15

    :cond_1d
    const/4 v0, 0x0

    goto :goto_16

    :cond_1e
    :goto_15
    const/4 v0, 0x1

    :goto_16
    if-eqz v0, :cond_21

    invoke-static/range {p3 .. p3}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object v0

    invoke-virtual {v0}, Lb41/b;->d()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_17

    :cond_1f
    const/4 v0, 0x0

    :goto_17
    if-eqz v0, :cond_20

    goto :goto_18

    :cond_20
    const/4 v14, 0x0

    goto :goto_19

    :cond_21
    :goto_18
    const/4 v14, 0x1

    :goto_19
    invoke-virtual {v2}, Lb41/f;->m()Z

    move-result v19

    invoke-virtual {v2}, Lb41/f;->e()I

    move-result v20

    const/4 v0, 0x3

    int-to-float v0, v0

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v0, v11

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v31

    new-instance v0, La80/c;

    const/16 v11, 0xb

    invoke-direct {v0, v2, v11}, La80/c;-><init>(Ljava/lang/Object;I)V

    const v11, 0x52010dfd

    invoke-static {v11, v5, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    move/from16 v0, v47

    const/16 v15, 0x20

    if-eq v0, v15, :cond_23

    and-int/lit8 v16, v34, 0x40

    if-eqz v16, :cond_22

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_22

    goto :goto_1a

    :cond_22
    const/16 v16, 0x0

    goto :goto_1b

    :cond_23
    :goto_1a
    const/16 v16, 0x1

    :goto_1b
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v15, v50

    if-nez v16, :cond_25

    if-ne v4, v15, :cond_24

    goto :goto_1c

    :cond_24
    move-object/from16 v18, v6

    move-object/from16 v6, p3

    goto :goto_1d

    :cond_25
    :goto_1c
    new-instance v4, Lb41/c;

    move-object/from16 v18, v6

    move-object/from16 v6, p3

    invoke-direct {v4, v2, v6}, Lb41/c;-><init>(Lb41/f;Lp1/c1;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1d
    move-object/from16 v36, v4

    check-cast v36, Lc93/a;

    const/16 v4, 0x20

    if-eq v0, v4, :cond_27

    and-int/lit8 v0, v34, 0x40

    if-eqz v0, :cond_26

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    goto :goto_1f

    :cond_26
    const/16 p3, 0x0

    :goto_1e
    move/from16 v4, v48

    const/16 v0, 0x100

    goto :goto_20

    :cond_27
    :goto_1f
    const/16 p3, 0x1

    goto :goto_1e

    :goto_20
    if-ne v4, v0, :cond_28

    const/16 v16, 0x1

    goto :goto_21

    :cond_28
    const/16 v16, 0x0

    :goto_21
    or-int v16, p3, v16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v16, :cond_2a

    if-ne v0, v15, :cond_29

    goto :goto_22

    :cond_29
    move-object/from16 p3, v7

    goto :goto_23

    :cond_2a
    :goto_22
    new-instance v0, Lq;

    move-object/from16 p3, v7

    const/16 v7, 0xa

    invoke-direct {v0, v2, v3, v6, v7}, Lq;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_23
    move-object/from16 v37, v0

    check-cast v37, Lkotlin/jvm/functions/Function1;

    const v43, 0x39fb9c01

    const/16 v44, 0x0

    move-object/from16 v27, v5

    const/4 v5, 0x0

    move-object/from16 v50, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v6, v18

    const-wide/16 v17, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v38, v27

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/high16 v39, 0x180000

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    move-object/from16 v7, p3

    move-object/from16 v0, v50

    invoke-static/range {v5 .. v44}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v5, v38

    invoke-virtual {v2}, Lb41/f;->h()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v6

    if-nez v6, :cond_2b

    const v0, -0x3c9a6fe3

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_24
    const/4 v0, 0x1

    goto :goto_26

    :cond_2b
    const v7, -0x3c9a6fe2

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v7, v1}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v7, 0x100

    if-ne v4, v7, :cond_2c

    const/4 v12, 0x1

    goto :goto_25

    :cond_2c
    const/4 v12, 0x0

    :goto_25
    invoke-virtual {v5, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_2d

    if-ne v7, v0, :cond_2e

    :cond_2d
    new-instance v7, Lb41/d$c;

    invoke-direct {v7, v3, v6}, Lb41/d$c;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    move-object/from16 v0, v51

    invoke-static {v1, v0, v7}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v0, v5, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    goto :goto_24

    :goto_26
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_27

    :cond_2f
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_27
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_30

    new-instance v0, Lj;

    const/16 v5, 0x8

    move-object/from16 v1, p0

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final m(Lp1/c1;)Lb41/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lb41/b;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb41/b;

    return-object p0
.end method

.method private static final n(Lp1/c1;Lb41/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lb41/b;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final o(Lgz0/m0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    move-object v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    invoke-static {p0, v8, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v3

    sget-object p0, Lx81/d;->a:Lx81/d;

    const/4 p1, 0x6

    invoke-virtual {p0, v8, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->b1()J

    move-result-wide v6

    int-to-float p0, p1

    const/4 p1, 0x4

    int-to-float p1, p1

    mul-float/2addr p0, p1

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v4, 0x0

    const/16 v9, 0x1b0

    invoke-static/range {v3 .. v9}, Ll1/r1;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lb41/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lb41/f;->i()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const v0, -0x17446f0d

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const v1, -0x17446f0c

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-static {v0, v2, v3}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v6

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    const/16 v28, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    move-object v0, v2

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q(Lb41/f;Lp1/c1;)Ll83/a0;
    .locals 6

    invoke-virtual {p0}, Lb41/f;->n()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object v0

    invoke-static {p1}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object p0

    invoke-virtual {p0}, Lb41/b;->e()Z

    move-result p0

    xor-int/lit8 v2, p0, 0x1

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lb41/b;->b(Lb41/b;Ljava/lang/String;ZLjava/lang/Boolean;ILjava/lang/Object;)Lb41/b;

    move-result-object p0

    invoke-static {p1, p0}, Lb41/d;->n(Lp1/c1;Lb41/b;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lb41/f;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 8

    const-string v0, "updatedValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object v1

    invoke-virtual {p0}, Lb41/f;->g()Ljava/lang/Integer;

    move-result-object v0

    const/4 v7, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Lb41/f;->g()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-gt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v7

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, p3

    :goto_1
    if-nez v0, :cond_2

    invoke-static {p2}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object v0

    invoke-virtual {v0}, Lb41/b;->c()Ljava/lang/String;

    move-result-object v0

    :cond_2
    move-object v2, v0

    invoke-virtual {p0}, Lb41/f;->g()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    if-le p3, v0, :cond_3

    const/4 p3, 0x1

    goto :goto_2

    :cond_3
    const/4 p3, 0x0

    :goto_2
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    move-object v4, p3

    goto :goto_3

    :cond_4
    move-object v4, v7

    :goto_3
    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lb41/b;->b(Lb41/b;Ljava/lang/String;ZLjava/lang/Boolean;ILjava/lang/Object;)Lb41/b;

    move-result-object p3

    invoke-static {p2, p3}, Lb41/d;->n(Lp1/c1;Lb41/b;)V

    new-instance p3, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p0}, Lb41/f;->l()Lb41/g;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lb41/g;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-static {p2}, Lb41/d;->m(Lp1/c1;)Lb41/b;

    move-result-object p2

    invoke-virtual {p2}, Lb41/b;->c()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_4

    :cond_5
    move-object p0, v7

    :goto_4
    invoke-direct {p3, p0, v7}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lb41/d;->l(Landroidx/compose/ui/Modifier;Lb41/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x245463e1

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

    new-instance v1, Lb41/d$d;

    invoke-direct {v1}, Lb41/d$d;-><init>()V

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

    const/16 v1, 0x19

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lb41/d;->t(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final v(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x4d8d3b1

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

    new-instance v1, Lb41/d$f;

    invoke-direct {v1}, Lb41/d$f;-><init>()V

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

    const/16 v1, 0x18

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lb41/d;->v(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x52d6400f

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

    new-instance v1, Lb41/d$h;

    invoke-direct {v1}, Lb41/d$h;-><init>()V

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

    const/16 v1, 0x17

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final y(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lb41/d;->x(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final z(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x2b2f7133

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

    new-instance v1, Lb41/d$j;

    invoke-direct {v1}, Lb41/d$j;-><init>()V

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

    const/16 v1, 0x14

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method
