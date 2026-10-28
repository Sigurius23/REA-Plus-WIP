.class public final Lc0/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lz1/p;

.field public final synthetic F:Lc93/n;

.field public final synthetic w:Ld0/z1;

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lc0/x;


# direct methods
.method public constructor <init>(Ld0/z1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lc0/x;Lz1/p;Lc93/n;)V
    .locals 0

    iput-object p1, p0, Lc0/j;->w:Ld0/z1;

    iput-object p2, p0, Lc0/j;->x:Ljava/lang/Object;

    iput-object p3, p0, Lc0/j;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lc0/j;->z:Lc0/x;

    iput-object p5, p0, Lc0/j;->E:Lz1/p;

    iput-object p6, p0, Lc0/j;->F:Lc93/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Lc0/j;->y:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lc0/j;->z:Lc0/x;

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p1, v1, :cond_1

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc0/l0;

    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Lc0/l0;

    iget-object v2, p0, Lc0/j;->w:Ld0/z1;

    invoke-virtual {v2}, Ld0/z1;->f()Ld0/t1;

    move-result-object v3

    iget-object v4, v2, Ld0/z1;->d:Lp1/k1;

    invoke-interface {v3}, Ld0/t1;->b()Ljava/lang/Object;

    move-result-object v3

    iget-object v5, p0, Lc0/j;->x:Ljava/lang/Object;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8, v3}, Lp1/q;->h(Z)Z

    move-result v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_2

    if-ne v6, v1, :cond_4

    :cond_2
    invoke-virtual {v2}, Ld0/z1;->f()Ld0/t1;

    move-result-object v2

    invoke-interface {v2}, Ld0/t1;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object p2, Lc0/e1;->a:Lc0/f1;

    :goto_1
    move-object v6, p2

    goto :goto_2

    :cond_3
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc0/l0;

    iget-object p2, p2, Lc0/l0;->b:Lc0/e1;

    goto :goto_1

    :goto_2
    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lc0/e1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    new-instance p2, Lc0/r;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {p2, v2}, Lc0/r;-><init>(Z)V

    invoke-virtual {v8, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p2, Lc0/r;

    move-object v2, v4

    iget-object v4, p1, Lc0/l0;->a:Lc0/c1;

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_6

    if-ne v7, v1, :cond_7

    :cond_6
    new-instance v7, Lc0/f;

    const/4 v3, 0x0

    invoke-direct {v7, p1, v3}, Lc0/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function3;

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v7}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p2, Lc0/r;->w:Lp1/k1;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v3, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_8

    if-ne p2, v1, :cond_9

    :cond_8
    new-instance p2, La3/m1;

    const/4 p1, 0x7

    invoke-direct {p2, v5, p1}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v2, p2

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_a

    if-ne p2, v1, :cond_b

    :cond_a
    new-instance p2, Lb2/r;

    const/4 p1, 0x3

    invoke-direct {p2, v6, p1}, Lb2/r;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast p2, Lc93/m;

    new-instance p1, Lc0/i;

    iget-object v1, p0, Lc0/j;->E:Lz1/p;

    iget-object v7, p0, Lc0/j;->F:Lc93/n;

    invoke-direct {p1, v1, v5, v0, v7}, Lc0/i;-><init>(Lz1/p;Ljava/lang/Object;Lc0/x;Lc93/n;)V

    const v0, -0x88b4ab7

    invoke-static {v0, v8, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/high16 v9, 0xc00000

    iget-object v1, p0, Lc0/j;->w:Ld0/z1;

    move-object v5, v6

    move-object v6, p2

    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/b;->a(Ld0/z1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Lc93/m;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_c
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
