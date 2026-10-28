.class public final Landroidx/compose/foundation/lazy/layout/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lp0/l0;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lp0/c0;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public constructor <init>(Lp0/l0;Landroidx/compose/ui/Modifier;Lp0/c0;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/c;->w:Lp0/l0;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/c;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/c;->y:Lp0/c0;

    iput-object p4, p0, Landroidx/compose/foundation/lazy/layout/c;->z:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Ly1/c;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p3, v0, :cond_0

    new-instance p3, Lp0/a0;

    new-instance v1, Lo0/i;

    const/4 v2, 0x3

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/c;->z:Lp1/c1;

    invoke-direct {v1, v2, v3}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-direct {p3, p1, v1}, Lp0/a0;-><init>(Ly1/c;Lo0/i;)V

    invoke-virtual {p2, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v3, p3

    check-cast v3, Lp0/a0;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    new-instance p1, Ly2/u1;

    new-instance p3, Ld1/j;

    invoke-direct {p3, v3}, Ld1/j;-><init>(Lp0/a0;)V

    invoke-direct {p1, p3}, Ly2/u1;-><init>(Ly2/x1;)V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v4, p1

    check-cast v4, Ly2/u1;

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/c;->w:Lp0/l0;

    const/4 p1, 0x0

    if-eqz v2, :cond_9

    const p3, 0x67eb8deb

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    const p3, 0x34e696b7

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    sget-object p3, Lp0/c1;->a:Lp0/b1;

    if-eqz p3, :cond_2

    const v1, 0x5034f7f0

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    :goto_0
    move-object v5, p3

    goto :goto_2

    :cond_2
    const p3, 0x5035b7a1

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    sget-object p3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {p2, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    invoke-virtual {p2, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_3

    if-ne v5, v0, :cond_6

    :cond_3
    const v1, 0x7f0a032a

    invoke-virtual {p3, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lp0/a1;

    if-eqz v6, :cond_4

    check-cast v5, Lp0/a1;

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_5

    new-instance v5, Lp0/a;

    invoke-direct {v5, p3}, Lp0/a;-><init>(Landroid/view/View;)V

    invoke-virtual {p3, v1, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_5
    invoke-virtual {p2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object p3, v5

    check-cast p3, Lp0/a1;

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    goto :goto_0

    :goto_2
    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p2, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v1, v6

    invoke-virtual {p2, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v1, v6

    invoke-virtual {p2, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v1, v6

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_7

    if-ne v6, v0, :cond_8

    :cond_7
    new-instance v1, Ljp2/l;

    const/16 v6, 0x14

    invoke-direct/range {v1 .. v6}, Ljp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v1

    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {p3, v6, p2}, Lp1/x;->f([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_9
    const p3, 0x67f47fcd

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    :goto_3
    sget p1, Lp0/m0;->a:I

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/c;->x:Landroidx/compose/ui/Modifier;

    if-eqz v2, :cond_b

    new-instance p3, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;

    invoke-direct {p3, v2}, Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;-><init>(Lp0/l0;)V

    invoke-interface {p1, p3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    if-nez p3, :cond_a

    goto :goto_4

    :cond_a
    move-object p1, p3

    :cond_b
    :goto_4
    invoke-virtual {p2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/c;->y:Lp0/c0;

    invoke-virtual {p2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p3, v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_c

    if-ne v2, v0, :cond_d

    :cond_c
    new-instance v2, Lj21/d;

    const/16 p3, 0x1b

    invoke-direct {v2, p3, v3, v1}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v2, Lc93/m;

    const/16 p3, 0x8

    invoke-static {v4, p1, v2, p2, p3}, Ly2/q1;->c(Ly2/u1;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
