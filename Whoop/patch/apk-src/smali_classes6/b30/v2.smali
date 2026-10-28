.class public final Lb30/v2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lb30/v2;->w:I

    iput-object p1, p0, Lb30/v2;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/v2;->x:Z

    iput-object p3, p0, Lb30/v2;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lb30/v2;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lb30/v2;->y:Ljava/lang/Object;

    check-cast p1, Lu0/n1;

    iget-object p3, p1, Lu0/n1;->f:Lp1/k1;

    check-cast p2, Lp1/q;

    const v0, 0x3001dc2a

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ly3/m;->x:Ly3/m;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-virtual {p3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh0/d2;

    sget-object v4, Lh0/d2;->w:Lh0/d2;

    if-eq v1, v4, :cond_2

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v9, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v9, v2

    :goto_2
    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_3

    if-ne v1, v4, :cond_4

    :cond_3
    new-instance v1, Lrq0/x;

    const/16 v0, 0x17

    invoke-direct {v1, p1, v0}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, p2}, Ldt/b;->H(Lkotlin/jvm/functions/Function1;Lp1/q;)Lh0/x2;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_5

    if-ne v5, v4, :cond_6

    :cond_5
    new-instance v5, Lu0/m1;

    invoke-direct {v5, v0, p1}, Lu0/m1;-><init>(Lh0/x2;Lu0/n1;)V

    invoke-virtual {p2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v6, v5

    check-cast v6, Lu0/m1;

    invoke-virtual {p3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    check-cast v7, Lh0/d2;

    iget-boolean p3, p0, Lb30/v2;->x:Z

    if-eqz p3, :cond_8

    iget-object p1, p1, Lu0/n1;->b:Lp1/g1;

    invoke-virtual {p1}, Lp1/g1;->x()F

    move-result p1

    const/4 p3, 0x0

    cmpg-float p1, p1, p3

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    move v8, v2

    goto :goto_4

    :cond_8
    :goto_3
    move v8, v3

    :goto_4
    iget-object p1, p0, Lb30/v2;->z:Ljava/lang/Object;

    move-object v10, p1

    check-cast v10, Lj0/i;

    const/16 v11, 0x10

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/gestures/b;->b(Landroidx/compose/ui/Modifier;Lh0/x2;Lh0/d2;ZZLj0/i;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    return-object p1

    :pswitch_0
    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lb2/e;->E:Lb2/m;

    iget-object p3, p0, Lb30/v2;->y:Ljava/lang/Object;

    check-cast p3, Lp1/c1;

    invoke-interface {p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly3/f;

    iget p3, p3, Ly3/f;->w:F

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p3, v0}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    move-object v1, p2

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->h()J

    move-result-wide v0

    const v2, 0x3f666666    # 0.9f

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    sget-object v2, Li2/w0;->a:Li2/v0;

    invoke-static {p3, v0, v1, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    iget-object v0, p0, Lb30/v2;->z:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p1

    invoke-static {p2}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v1

    move-object v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {p2, p3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v5, v2, Lp1/q;->S:Z

    if-eqz v5, :cond_9

    invoke-virtual {v2, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_5
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p2, v4, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->f:La3/i;

    invoke-static {p2, p1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->j:La3/i;

    iget-boolean v3, v2, Lp1/q;->S:Z

    if-nez v3, :cond_a

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v1, v2, v1, p1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object p1, La3/k;->d:La3/i;

    invoke-static {p2, p1, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La30/k1;

    const/4 p3, 0x6

    iget-boolean v0, p0, Lb30/v2;->x:Z

    invoke-static {v0, p1, p2, p3}, Lds/p;->k(ZLa30/k1;Landroidx/compose/runtime/Composer;I)V

    const/4 p1, 0x1

    invoke-virtual {v2, p1}, Lp1/q;->q(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
